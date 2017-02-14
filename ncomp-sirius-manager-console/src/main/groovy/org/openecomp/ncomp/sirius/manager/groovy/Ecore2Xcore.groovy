
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
	
package org.openecomp.ncomp.sirius.manager.groovy

import groovy.text.SimpleTemplateEngine

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

class Ecore2Xcore {
	EPackage p
	String subName
	def env 
	public Ecore2Xcore(EPackage p) {
		this.p = p
	  env = [
		p: p,
	  ]
	}
	public add(k,v) {
		env[k] = v
	}
	public void generate(String file, String templateDirectory) {
	  SimpleTemplateEngine engine = new SimpleTemplateEngine()
	  println "Creating $file"
	  println env
	  println "$env.pName"
	  def x = engine.createTemplate(new File("$templateDirectory/xcore").text).make(env)
	  def f = new File(file)
	  f.delete()
	  f.parentFile.mkdirs()
	  f << x
//		  println "x=$x"
	}
	def void test() {
		EClass c
		c.getEReferences().each { EReference ref ->
			ref.isContainment() ? "contains" : "refers"
			ref.eType.name
		}
		c.getEAttributes().each { EAttribute attr ->
			attr.eType.name
		}
	}
}
