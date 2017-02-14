
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
package org.openecomp.ncomp.sirius.manager.agent.monitoring;

import org.openecomp.ncomp.sirius.manager.server.ServerPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.agent.monitoring.MonitoringFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-sirius-manager-agent-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.sirius.manager.agent'"
 * @generated
 */
public interface MonitoringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "monitoring";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.sirius.manager.agent.monitoring";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "monitoring";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonitoringPackage eINSTANCE = org.openecomp.ncomp.sirius.manager.agent.monitoring.impl.MonitoringPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.monitoring.impl.SiriusManagerAgentServerImpl <em>Sirius Manager Agent Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.monitoring.impl.SiriusManagerAgentServerImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.monitoring.impl.MonitoringPackageImpl#getSiriusManagerAgentServer()
	 * @generated
	 */
	int SIRIUS_MANAGER_AGENT_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER__CONFIGURATION = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER__COMPONENT = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sirius Manager Agent Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER_FEATURE_COUNT = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___LOGS__JSONOBJECT_ELIST = ServerPackage.SOUTH_BOUND_API_WITH_PROXY___LOGS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___METRICS__JSONOBJECT_ELIST = ServerPackage.SOUTH_BOUND_API_WITH_PROXY___METRICS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___PROPERTIES__JSONOBJECT_ELIST = ServerPackage.SOUTH_BOUND_API_WITH_PROXY___PROPERTIES__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Upload Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___UPLOAD_INFO__JSONOBJECT_ELIST = ServerPackage.SOUTH_BOUND_API_WITH_PROXY___UPLOAD_INFO__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Get Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Values All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Request Logger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___EVALUATE__STRING_FUNCTION = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER___UPDATE__STRING_FUNCTION = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sirius Manager Agent Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_MANAGER_AGENT_SERVER_OPERATION_COUNT = ServerPackage.SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.monitoring.SiriusManagerAgentServer <em>Sirius Manager Agent Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Manager Agent Server</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.monitoring.SiriusManagerAgentServer
	 * @generated
	 */
	EClass getSiriusManagerAgentServer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MonitoringFactory getMonitoringFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.monitoring.impl.SiriusManagerAgentServerImpl <em>Sirius Manager Agent Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.monitoring.impl.SiriusManagerAgentServerImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.monitoring.impl.MonitoringPackageImpl#getSiriusManagerAgentServer()
		 * @generated
		 */
		EClass SIRIUS_MANAGER_AGENT_SERVER = eINSTANCE.getSiriusManagerAgentServer();

	}

} //MonitoringPackage
