
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
	
package org.openecomp.ncomp.sirius.manager;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.sirius.manager.properties.AbstractProperty;
import org.openecomp.ncomp.sirius.manager.properties.Module;
import org.openecomp.ncomp.sirius.manager.properties.ModuleProperty;
import org.openecomp.ncomp.sirius.manager.properties.PropertiesFactory;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApi;
import org.openecomp.ncomp.utils.StringUtil;
import org.openecomp.ncomp.webservice.utils.FileUtils;

public class ModuleReporter implements Runnable {
	public static final Logger logger = Logger.getLogger(ModuleReporter.class);
	private SouthBoundApi api;
	private List<ModuleReporter> submodules = new ArrayList<ModuleReporter>();
	private ModuleReporter parent;
	private String jarName;
	private String name;
	private String version;
	private String file;
	private String command;
	private Properties props;
	

	public ModuleReporter(SouthBoundApi api, String name, String jarName) {
		super();
		this.api = api;
		this.name = name;
		this.jarName = jarName;
	}
	public ModuleReporter(SouthBoundApi api, String name, String jarName, String file, String command, String version) {
		super();
		this.api = api;
		this.name = name;
		this.jarName = jarName;
		this.file = file;
		this.command = command;
		this.version = version;
	}
	public void addSubmodule(String jarName) {
		addSubmodule(jarName,jarName,null,null,"${version}");
	}
	public void addSubmodule(String name, String jarName, String file, String command, String version) {
		ModuleReporter m=new ModuleReporter(null, name, jarName, file, command, version);
		submodules.add(m);
		m.parent = this;
	}
	
	public void start() {
		Thread t = new Thread(this,"module reporter: " + name);
		t.start();
	}

	@Override
	public void run() {
		boolean first = true;
		while (true) {
			try { 
//				System.err.println("HERE: ");
				if (!first) Thread.sleep(300000); // sleep 5 minutes.
				else first = false;
				EList<AbstractProperty> l = new BasicEList<AbstractProperty>();
				ModuleProperty m = PropertiesFactory.eINSTANCE.createModuleProperty();
				m.setName(name);
				m.setVersion(version());
				for (ModuleReporter s : submodules) {
					Module m1 = PropertiesFactory.eINSTANCE.createModule();
					m1.setName(s.name);
					m1.setVersion(s.version());
					m.getSubModules().add(m1);
				}
//				System.err.println("HERE: " + ManagementServer.ecore2json(m, 100, null, true).toString(2));
				l.add(m);
				api.properties(null, l);
			}
			catch (Exception e) {
				ManagementServerUtils.printStackTrace(e);
			}
		}
	}
	private String version() {
		InputStream inputStream;
		if (jarName == null && file == null && command == null) {
			if (parent == null || parent.props == null)
				return "unable to determine version for " + name + " no parent information";
			return StringUtil.expandUsingProperties(version, parent.props, "$");
		}
		if (jarName != null )
			inputStream = ModuleReporter.class.getClassLoader().getResourceAsStream(jarName + ".buildinfo");
		else { 
			if (file != null) {
				inputStream = FileUtils.filename2stream(file, null);
				if (inputStream == null) logger.warn("unable to find file " + file);
			}
			else {
				inputStream = FileUtils.cmd2stream(command);
				if (inputStream == null) logger.warn("unable to run command " + command);
			}
		}
		if (inputStream == null) {
			return "unable to determine version for " + name;
		}
		props = new Properties();
		try {
			props.load(inputStream);
			inputStream.close();
		} catch (Exception e) {
			logger.warn("No build info for module: " + name);
			ManagementServerUtils.printStackTrace(e);
			return "unable to determine version for " + name;
		}
		return StringUtil.expandUsingProperties(version, props, "$");
	}

}
