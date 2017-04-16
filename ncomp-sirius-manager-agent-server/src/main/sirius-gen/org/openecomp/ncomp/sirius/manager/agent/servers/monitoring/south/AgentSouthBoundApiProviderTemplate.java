
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
	

package org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.south;





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;



import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;


import org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiImpl;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApi;


public class AgentSouthBoundApiProviderTemplate extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(AgentSouthBoundApiProviderTemplate.class);
	SouthBoundApi o;

	public AgentSouthBoundApiProviderTemplate(ISiriusServer controller, SouthBoundApi o) {
		super(controller, o);
		this.o = o;
	}

	public void logs(org.json.JSONObject cx, EList<org.openecomp.ncomp.core.logs.LogMessage> logs) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void metrics(org.json.JSONObject cx, EList<org.openecomp.ncomp.core.metrics.Metric> metrics) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void properties(org.json.JSONObject cx, EList<org.openecomp.ncomp.sirius.manager.properties.AbstractProperty> l) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}





	
}
