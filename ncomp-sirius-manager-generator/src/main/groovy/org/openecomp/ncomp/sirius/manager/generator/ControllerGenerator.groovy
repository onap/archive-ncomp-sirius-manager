
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.ncomp.sirius.manager.generator


import org.openecomp.ncomp.sirius.manager.console.Utils;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel

import groovy.text.SimpleTemplateEngine

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage;
import org.json.JSONObject;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;


class ControllerGenerator {
	EObject o
	EObject providerObject
	String providerPackage
	String providerPrefix
	ControllerModel m
	EPackage p
	String subName
	String clientName
	String prefix
	String type = "R"
	String version = null
	ControllerGenerator root;
	boolean enableDrools = false;
	boolean enableIRequestHandler = true;
	boolean enableISwaggerHandler = false;
	boolean enableISiriusPlugin = true;
	public ControllerGenerator(EObject o, ControllerModel m) {
		this.o = o
		this.m = m
		root = this
	}
	public String packageName() {
		if (this != root && clientName == null) {
			return root.packageName() + (root.o.eClass().EPackage != o.eClass().EPackage? "." + subName : "")
		}
		EPackage p = o.eClass().getEPackage()
		return p.nsURI.replaceAll('.'+p.nsPrefix+'$',"") + ".servers.${p.nsPrefix}"
	}
	public String factoryName() {
		EPackage p = o.eClass().getEPackage()
		return "${p.nsPrefix.capitalize()}Factory"
	}
	public String packageName2() {
		EPackage p = o.eClass().getEPackage()
		return "${p.nsPrefix.capitalize()}Package"
	}
	public def operations() {
		def l = []
		l += o.eClass().getEOperations();
		o.eClass().getEAllSuperTypes().each { EClass c ->
			l += c.getEOperations()
		}
		return l
	}
	public def operationsProvider() {
		def l = []
		l += o.eClass().getEOperations();
		o.eClass().getEAllSuperTypes().each { EClass c ->
			if (providerObject != null && (
				providerObject.eClass().getEAllSuperTypes().contains(c)
				|| c == providerObject.eClass())) return
			l += c.getEOperations()
		}
		return l
	}
	public void generateAnt(String fname, boolean xtext, boolean tar) {
		def xml = new XmlSlurper().parseText(new File(".classpath").text)
		SimpleTemplateEngine engine = new SimpleTemplateEngine()
		def env = [g:this,m:m,sourceDirectories:[],projects:[],xtext:xtext,tar:tar]
		xml.classpathentry.each { e -> 
			switch (e.@kind) {
			case "src":
				def path = e.@path.toString()
				if (path.startsWith("/")) {
					println "path=$path"
					switch (path) {
						case "/org.openecomp.ncomp.webservice": env.projects += "org.openecomp.ncomp.utils.jar"; break
						default: env.projects += path.replace("/","") + ".jar"
					}
				}
				else {
					env.sourceDirectories += path
				}
				break
//			<classpathentry kind="lib" path="/sirius-store/artifacts/org.openecomp.ncomp.gwt.api.jar"/>
			case "lib": 
				def path = e.@path.toString()
				switch (path) {
				case ~/\/sirius-store.*/: 
					def a = path.split("/")
					def jar = a[3]
					println "jar=$jar"
					env.projects += a[3]
				}
			}
		}
		println "Creating $fname"
		def x = engine.createTemplate(new File("$m.templateDirectory/ant_xml").text).make(env)
		File f = new File(fname)
		f.delete()
		f.parentFile.mkdirs()
		f << x
	}
	public void generateScripts(String dir,String n) {
		SimpleTemplateEngine engine = new SimpleTemplateEngine()
		EPackage p = o.eClass().getEPackage()
		def env = [g:this,m:m, n:n, nsPrefix: p.getNsPrefix()]
		env.sClass = "${root.m.prefix}${root.o.eClass().name}Server"
		env.sPackage = root.packageName()
		String fname = "$dir/${n}-controller"
		println "Creating $fname"
		println "Using $m.templateDirectory/controller"
		def x = engine.createTemplate(new File("$m.templateDirectory/controller").text).make(env)
		File f = new File(fname)
		f.delete()
		f.parentFile.mkdirs()
		f << x
	}
	public void generate(String dir) {
		if (enableDrools && ! enableISiriusPlugin) {
			System.err.println "Drools requires ISiriusPlugin, thus enabling ISiriusPlugin"
			enableISiriusPlugin = true
		}
		SimpleTemplateEngine engine = new SimpleTemplateEngine()
		
		File dir1 = new File(dir)
		if (root == this && dir1.exists()) dir1.deleteDir()
		dir1.mkdir()
		
		EPackage p = o.eClass().getEPackage()
		
		["Server":[:],"Client":[:],"Console":[:],"Controller":[:],"Factory":[:],"Provider":[:]].each {n, c ->
		  if (root != this) {
			  switch (n) {
			  case "Server": return
			  case "Factory": if (type == "A" || type == "C" || type == "P") return;
			  case "Client": case "Console": if (type == "P") return;
			  }
		  }
		  def env = [
			g:			  this,
			o:            o,
			p:            p,
			prefix:       m.prefix,
			name :        o.eClass().getName(),
			nsPrefix :    p.getNsPrefix(),
			nsURI :       p.getNsURI(),
			packageName : packageName(),
			cName :       "${m.prefix}${o.eClass().name}$n",
			fName :       factoryName(),
			path :        root == this ? "resources" : subName,
			version:      version ? "\"$version\"" : "null"
		  ]
		  switch (n) {
			case "Provider": env.cName = "${m.prefix}${o.eClass().name}ProviderTemplate"; break
			case "Controller": env.cName = "${m.prefix}${o.eClass().name}"; break
			case "Factory": env.cName = "${m.prefix}${env.fName}"; break
		  }
		  env.sClass = "${root.m.prefix}${root.o.eClass().name}Server"
		  env.sPackage = root == this ? "" : root.packageName()
		  def fname = "$dir/${env.cName}.java"
		  println "Creating $fname"
		  println "Using $m.templateDirectory/${n}.java"
		  def x = engine.createTemplate(new File("$m.templateDirectory/${n}.java").text).make(env)
		  def f = new File(fname)
		  f.parentFile.mkdirs()
		  f << x
		  switch (n) {
			  case "Provider": 
			  def fname2 = "${dir.replace('src/main/sirius-gen','src/main/java')}/${env.cName}.java".replace("ProviderTemplate", "Provider")
			  def f2 = new File(fname2)
			  if (!f2.exists()) {
				  println "Creating $fname2"
				  f2.parentFile.mkdirs()
				  f2 << x.toString().replace("${o.eClass().name}ProviderTemplate", "${o.eClass().name}Provider")
			  }
			  break
		  }
		  //		  println "x=$x"
		}
		generateYaml(dir)
		subApis.each { ControllerGenerator g ->
			g.generate(dir + (g.o.eClass().EPackage != o.eClass().EPackage ? "/$g.subName" : ""))
		}
	}
	def generateYaml(dir) {
		def y = [operations:[:], messages:[dummy:[:]]]
		EClass c = o.eClass()
		c.getEAllOperations().each { EOperation op -> 
			y.operations["$c.name@$op.name"] = [:]
			y.messages["REQUEST-FAILED-$op.name"] = [
				errorCode: "4001W",
				messageFormat: "{0}",
				description: "Operation Failed with Exception"
			]
		}
		c.getEAllOperations().each { EOperation op -> 
			y.messages["REMOTE-CALL-FAILED-$op.name"] = [
				errorCode: "4001W",
				messageFormat: "{0}",
				description: "Remote Operation Failed with Exception"
			]
		}
		DumperOptions options = new DumperOptions();
		options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
		Yaml yaml = new Yaml(options);
		JSONObject j = Utils.object2json(y)
		File f = new File("src/main/sirius-gen/${c.name}.yaml")
		if (f.exists()) f.delete()
		f << yaml.dump(yaml.load(j.toString()))
	}
	def subApis = [] 
	public void addObject(String subpackage, EObject o, ControllerModel m, boolean enableIRequestHandler = false, boolean enableISiriusPlugin = false) {
		def g = new ControllerGenerator(o,m)
		g.root = this
		g.subName = subpackage
		g.type = "O"
		g.enableIRequestHandler = enableIRequestHandler
		g.enableISiriusPlugin = enableISiriusPlugin
		g.version = version
		subApis += g
	}
	public void addApi(String name, EObject o, ControllerModel m, boolean enableIRequestHandler = false, boolean enableISiriusPlugin = false) {
		def g = new ControllerGenerator(o,m)
		g.root = this
		g.subName = name
		g.type = "A"
		g.enableIRequestHandler = enableIRequestHandler
		g.enableISiriusPlugin = enableISiriusPlugin
		g.version = version
		subApis += g
	}
	public void addProvider(String name, EObject o, ControllerModel m) {
		def g = new ControllerGenerator(o,m)
		g.root = this
		g.subName = name
		g.type = "P"
		g.enableIRequestHandler = false
		g.enableISiriusPlugin = false
		g.version = version
		subApis += g
	}
	def subClients = []
	public void addClient(String name, EObject o, ControllerModel m, boolean enableIRequestHandler = false, boolean enableISiriusPlugin = false) {
		def g = new ControllerGenerator(o,m)
		g.root = this
		g.clientName = name
		g.type = "C"
		g.enableIRequestHandler = enableIRequestHandler
		g.enableISiriusPlugin = enableISiriusPlugin
		g.version = version
		subClients += g
	}
	List<String> aliases = new ArrayList<String>();
	public void addAlias(String alias) {
		aliases.add(alias);
	}
	List<String> factories = new ArrayList<String>();
	def useNew = [:]
	public void addFactory(String factory, boolean useNew = true) {
		factories.add(factory);
		this.useNew[factory] = useNew
	}
	public void enableDrools() {
		enableDrools = true;
	}
	public void addFactory(EFactory f) {
		def p = f.ePackage
		String f1 = "${p.nsURI}.${p.name.capitalize()}Factory"
		addFactory(f1,false)
	}
	public void setProvider(EObject o2, String prefix) {
		providerObject = o2
		EPackage p = o2.eClass().getEPackage()
		providerPackage =  p.nsURI.replaceAll('.'+p.nsPrefix+'$',"") + ".servers.${p.nsPrefix}"
		providerPrefix = prefix
	}
}
