
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
	
package org.openecomp.ncomp.sirius.manager.agent.server.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelFactory;
import org.openecomp.ncomp.sirius.manager.generator.ControllerGenerator;
import org.openecomp.ncomp.gwt.siriusportal.model.*;
import org.openecomp.ncomp.sirius.manager.agent.monitoring.MonitoringFactory;


public class Generator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MonitoringFactory f = MonitoringFactory.eINSTANCE;
		EObject o = MonitoringFactory.eINSTANCE.createSiriusManagerAgentServer();
		EPackage p = o.eClass().getEPackage();
		String dir = p.getNsURI().replace(p.getNsPrefix(),"") + "servers." + p.getNsPrefix();
		dir= "src/main/sirius-gen/" + dir.replace('.', '/');
		ControllerModel m = ControllermodelFactory.eINSTANCE.createControllerModel();
		m.setTemplateDirectory("../../dcae-org.openecomp.ncomp.sirius.manager/ncomp-sirius-manager-generator/src/main/templates");
		m.setPrefix("Agent");
		m.setPluginName(p.getNsURI());
		m.setName("SiriusManagerAgentServer");
		m.setTitle("SiriusManagerAgentServer");
		ControllerGenerator g = new ControllerGenerator(o,m); 
		g.setEnableIRequestHandler(false);
		g.setEnableISiriusPlugin(true);
		EObject gui = ModelFactory.eINSTANCE.createGuiClientApi();
		g.addObject("gui",gui,m);
		EObject e = org.openecomp.ncomp.sirius.manager.server.ServerFactory.eINSTANCE.createSouthBoundApi();
		g.addObject("south",e,m);
		//g.addFactory("org.openecomp.ncomp.sirius.servers.openstack.OsOpenstackFactory");
		//g.enableDrools();
		g.generate(dir);
		g.generateScripts("src/main/server-gen/bin","sirius-manager-agent-server"); 
	}


}
