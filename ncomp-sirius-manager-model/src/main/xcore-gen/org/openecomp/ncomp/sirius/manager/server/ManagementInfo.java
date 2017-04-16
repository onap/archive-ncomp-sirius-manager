
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getIp <em>Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getLogs <em>Logs</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getManagementInfo()
 * @model
 * @generated
 */
public interface ManagementInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getManagementInfo_Ip()
	 * @model unique="false"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.metrics.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getManagementInfo_Metrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.logs.LogMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getManagementInfo_Logs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogMessage> getLogs();

	/**
	 * Returns the value of the '<em><b>Props</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.properties.AbstractProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Props</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Props</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getManagementInfo_Props()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractProperty> getProps();

} // ManagementInfo
