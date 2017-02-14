
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

import org.openecomp.ncomp.component.Component;
import org.openecomp.ncomp.core.function.Function;
import org.openecomp.ncomp.core.function.ValuePair;
import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.metrics.DoubleMetric;
import org.openecomp.ncomp.core.metrics.MetricValueOption;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Management Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServer()
 * @model
 * @generated
 */
public interface AbstractManagementServer extends SouthBoundApiWithProxy {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(AbstractManagementServerConfiguration)
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServer_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	AbstractManagementServerConfiguration getConfiguration();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(AbstractManagementServerConfiguration value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(Component)
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServer_Component()
	 * @model containment="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cxDataType="org.openecomp.ncomp.core.RemoteContext" cxUnique="false" pathUnique="false" startUnique="false" endUnique="false" optionUnique="false" relativeIntervalUnique="false"
	 * @generated
	 */
	EList<DoubleMetric> getValues(JSONObject cx, String path, Long start, Long end, MetricValueOption option, boolean relativeInterval);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cxDataType="org.openecomp.ncomp.core.RemoteContext" cxUnique="false" pathUnique="false" metricsUnique="false" metricsMany="true" startUnique="false" endUnique="false" optionUnique="false" relativeIntervalUnique="false"
	 * @generated
	 */
	EList<DoubleMetric> getValuesAll(JSONObject cx, String path, EList<String> metrics, Long start, Long end, MetricValueOption option, boolean relativeInterval);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cxDataType="org.openecomp.ncomp.core.RemoteContext" cxUnique="false" pathUnique="false" startUnique="false" endUnique="false"
	 * @generated
	 */
	EList<LogMessage> getMessages(JSONObject cx, String path, Long start, Long end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" userNameUnique="false" actionUnique="false" resourcePathUnique="false" contextDataType="org.openecomp.ncomp.core.JsonObject" contextUnique="false"
	 * @generated
	 */
	LoggerInfo getRequestLogger(String userName, String action, String resourcePath, JSONObject context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pathUnique="false" functionUnique="false"
	 * @generated
	 */
	EList<ValuePair> evaluate(String path, Function function);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pathUnique="false" functionUnique="false"
	 * @generated
	 */
	void update(String path, Function function);

} // AbstractManagementServer
