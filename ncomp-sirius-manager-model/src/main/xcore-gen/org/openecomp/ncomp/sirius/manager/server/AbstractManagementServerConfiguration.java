
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

import org.openecomp.ncomp.core.alerts.AlertingTemplate;
import org.openecomp.ncomp.core.function.Function;
import org.openecomp.ncomp.core.logs.LogMessageRule;
import org.openecomp.ncomp.core.metrics.MetricValueOption;
import org.openecomp.ncomp.sirius.manager.properties.ModuleContainer;
import org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Management Server Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getMetricOptions <em>Metric Options</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getTableTemplates <em>Table Templates</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getAlertTemplates <em>Alert Templates</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerConfiguration()
 * @model
 * @generated
 */
public interface AbstractManagementServerConfiguration extends ModuleContainer {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.logs.LogMessageRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerConfiguration_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogMessageRule> getRules();

	/**
	 * Returns the value of the '<em><b>Metric Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.metrics.MetricValueOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Options</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerConfiguration_MetricOptions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MetricValueOption> getMetricOptions();

	/**
	 * Returns the value of the '<em><b>Table Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Templates</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerConfiguration_TableTemplates()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractTableTemplate> getTableTemplates();

	/**
	 * Returns the value of the '<em><b>Alert Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.alerts.AlertingTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alert Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alert Templates</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerConfiguration_AlertTemplates()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AlertingTemplate> getAlertTemplates();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.core.function.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerConfiguration_Functions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Function> getFunctions();

} // AbstractManagementServerConfiguration
