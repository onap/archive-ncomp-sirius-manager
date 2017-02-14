
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
	
/**
 */
package org.openecomp.ncomp.sirius.manager.server;

import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.metrics.Metric;
import org.openecomp.ncomp.sirius.manager.properties.AbstractProperty;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>South Bound Api</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getSouthBoundApi()
 * @model
 * @generated
 */
public interface SouthBoundApi extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cxDataType="org.openecomp.ncomp.core.RemoteContext" cxUnique="false"
	 *        cxAnnotation="http://openecomp.org/sirius/doc description='This parameter is for internal use and is ignored if set by client.'" logsUnique="false" logsMany="true"
	 *        logsAnnotation="http://openecomp.org/sirius/doc description='List of log message to inform the management system about.'"
	 *        annotation="http://openecomp.org/sirius/doc description='This operation allows the clients to report log messages \r\n\tand overall state of the client'"
	 * @generated
	 */
	void logs(JSONObject cx, EList<LogMessage> logs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cxDataType="org.openecomp.ncomp.core.RemoteContext" cxUnique="false"
	 *        cxAnnotation="http://openecomp.org/sirius/doc description='This parameter is for internal use and is ignored if set by client.'" metricsUnique="false" metricsMany="true"
	 *        annotation="http://openecomp.org/sirius/doc description='This operation allows the client VMs to report metrics \r\n\t\tand overall state of the VM'"
	 * @generated
	 */
	void metrics(JSONObject cx, EList<Metric> metrics);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cxDataType="org.openecomp.ncomp.core.RemoteContext" cxUnique="false"
	 *        cxAnnotation="http://openecomp.org/sirius/doc description='This parameter is for internal use and is ignored if set by client.'" lUnique="false" lMany="true"
	 *        annotation="http://openecomp.org/sirius/doc description='Used by the BSA Management Agent to report \r\n\tproperty key value pairs to the BSA Controller.'"
	 * @generated
	 */
	void properties(JSONObject cx, EList<AbstractProperty> l);

} // SouthBoundApi
