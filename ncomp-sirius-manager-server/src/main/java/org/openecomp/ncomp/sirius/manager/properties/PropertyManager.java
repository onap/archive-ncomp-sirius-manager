
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
	
package org.openecomp.ncomp.sirius.manager.properties;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;
import org.openecomp.ncomp.webservice.utils.FileUtils;

public class PropertyManager {
	public static final Logger logger = Logger.getLogger(PropertyManager.class);

	private Object propDir;
	private ManagementServer server;
	private HashMap<String, String> checksums = new HashMap<String, String>();

	public PropertyManager(ManagementServer managementServer) {
		server = managementServer;
		propDir = server.getProps().getProperty("properties.dir", "data/properties");
	}

	public void updatePropertries(EObject o, EList<AbstractProperty> props) {
		for (AbstractProperty ap : props) {
			if (ap instanceof ModuleProperty) {
				ModuleProperty mp = (ModuleProperty) ap;
				updateModules(o, mp);
				continue;
			}
			if (ap instanceof Property) {
				Property p = (Property) ap;
				Date now = new Date();
				if (!p.getName().startsWith("/"))
					p.setName("/" + p.getName());
				String file = propDir + ManagementServer.object2ref(o) + p.getName();
				if (!checksums.containsKey(file)) {
					checksums.put(file, MD5Checksum.createFileChecksum(file));
				}
				String checksum = MD5Checksum.createChecksum(p.getValue());
				if (checksum.equals(checksums.get(file)))
					continue;
				String file1 = file + "." + now.getTime();
				writeFile(file1, p.getValue());
				File f1 = writeFile(file1 + ".1", p.getValue());
				File f2 = new File(file);
				f1.renameTo(f2);
				logger.info("Wrote " + file);
			}
		}
	}

	private File writeFile(String file1, String value) {
		File f = new File(file1);
		f.getParentFile().mkdirs();
		OutputStreamWriter w = FileUtils.filename2writer(file1);
		try {
			w.append(value);
			w.close();
		} catch (IOException e) {
			logger.warn("Unable tor write file: " + file1 + " " + e);
			ManagementServerUtils.printStackTrace(e);
		}
		return f;
	}

	private void updateModules(EObject o, ModuleProperty mp) {
		if (o instanceof ModuleContainer) {
			ModuleContainer c = (ModuleContainer) o;
			EList<Module> l = new BasicEList<Module>();
			boolean found = false;
			for (Module m : c.getModules()) {
				if (m.getName().equals(mp.getName())) {
					found = true;
					l.add(EcoreUtil.copy(mp));
				}
				else
					l.add(EcoreUtil.copy(m));
			}
			if (!found) l.add(EcoreUtil.copy(mp));
			c.getModules().clear();
			c.getModules().addAll(l);
		}
	}

}
