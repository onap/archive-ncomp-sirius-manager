
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

import org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObject;
import org.openecomp.ncomp.sirius.gui.tools.GuiModelUtils;
import org.openecomp.ncomp.sirius.gui.tools.GuiTreeUtil;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;

public class BasicGuiClientApiProvider extends BasicAdaptorProvider {

	@SuppressWarnings("unused")
	private GuiClientApi o;

	public BasicGuiClientApiProvider(ISiriusServer controller, GuiClientApi o) {
		super(controller, o);
		this.o = o;
	}
	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTree getTree() {
		
		GuiTreeUtil tree = new GuiTreeUtil(controller.getServer(), 100, null);
		AbstractManagementServer c = (AbstractManagementServer) controller.getServer().getObject();
		if (c.getConfiguration() != null)
			tree.addTables(c.getConfiguration().getTableTemplates());
		return tree.getTree(); 
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiObject getObject(java.lang.String path) {
		
		Subject subject = ManagementServer.find(controller.getServer().getObject(), path);
		if (subject.o == null) {
			throw new RuntimeException("unable to find: " + path);
		}
		GuiObject o = GuiModelUtils.ecore2GuiObject(subject.o, 2, null);
		// oPrint(o);
		return o; 
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie getTimeSerie(java.lang.String path, java.lang.String start, java.lang.String end, java.lang.String duration) {
		return GuiModelUtils.getTimeSerie(controller.getServer(), path, start, end, duration);
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiTable getTable(java.lang.String path, java.lang.String start, java.lang.String end) {
		return GuiModelUtils.getTable(controller.getServer(), path, start, end);
	}

	public org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml getHtml(java.lang.String path, java.lang.String start, java.lang.String end) {
     throw new UnsupportedOperationException();
	}

	public org.openecomp.ncomp.sirius.manager.graph.GuiGraph getGraph(java.lang.String path, java.lang.String start, java.lang.String end) {
     throw new UnsupportedOperationException();
	}


}
