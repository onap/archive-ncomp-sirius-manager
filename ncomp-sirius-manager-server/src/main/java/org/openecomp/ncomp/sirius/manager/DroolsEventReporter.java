
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

import org.openecomp.ncomp.component.DroolsObjectChange;
import org.openecomp.ncomp.sirius.manager.drools.DroolsEventListener;

public class DroolsEventReporter implements DroolsEventListener {
	private final ManagementServer server;
	private final String name;
	
	public DroolsEventReporter (ManagementServer server, String name) {
		this.server = server;
		this.name = name;
	}

	@Override
	public void recordPolicyFire(String ruleName) {
		server.recordPolicyFire(name, ruleName);
	}

	@Override
	public void recordPolicyObjectInserted(Object o) {
		server.recordPolicyObjectChange(name, o, DroolsObjectChange.INSERTED);
	}

	@Override
	public void recordPolicyObjectDeleted(Object o) {
		server.recordPolicyObjectChange(name, o, DroolsObjectChange.DELETED);
	}

	@Override
	public void recordPolicyObjectUpdated(Object o) {
		server.recordPolicyObjectChange(name, o, DroolsObjectChange.UPDATED);
	}

}
