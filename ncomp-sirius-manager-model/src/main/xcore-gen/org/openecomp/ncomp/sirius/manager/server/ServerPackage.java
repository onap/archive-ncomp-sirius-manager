
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

import org.openecomp.ncomp.sirius.manager.properties.PropertiesPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openecomp.ncomp.core.CorePackage;

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
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.ncomp.sirius.manager.server.ServerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-sirius-manager-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.sirius.manager'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel' doc='http://openecomp.org/sirius/doc'"
 * @generated
 */
public interface ServerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "server";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.sirius.manager.server";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "server";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServerPackage eINSTANCE = org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiImpl <em>South Bound Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getSouthBoundApi()
	 * @generated
	 */
	int SOUTH_BOUND_API = 1;

	/**
	 * The number of structural features of the '<em>South Bound Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API___LOGS__JSONOBJECT_ELIST = 0;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API___METRICS__JSONOBJECT_ELIST = 1;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API___PROPERTIES__JSONOBJECT_ELIST = 2;

	/**
	 * The number of operations of the '<em>South Bound Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiWithProxyImpl <em>South Bound Api With Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiWithProxyImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getSouthBoundApiWithProxy()
	 * @generated
	 */
	int SOUTH_BOUND_API_WITH_PROXY = 0;

	/**
	 * The number of structural features of the '<em>South Bound Api With Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT = SOUTH_BOUND_API_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API_WITH_PROXY___LOGS__JSONOBJECT_ELIST = SOUTH_BOUND_API___LOGS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API_WITH_PROXY___METRICS__JSONOBJECT_ELIST = SOUTH_BOUND_API___METRICS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API_WITH_PROXY___PROPERTIES__JSONOBJECT_ELIST = SOUTH_BOUND_API___PROPERTIES__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Upload Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API_WITH_PROXY___UPLOAD_INFO__JSONOBJECT_ELIST = SOUTH_BOUND_API_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>South Bound Api With Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT = SOUTH_BOUND_API_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.ManagementInfoImpl <em>Management Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ManagementInfoImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getManagementInfo()
	 * @generated
	 */
	int MANAGEMENT_INFO = 2;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_INFO__IP = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_INFO__METRICS = 1;

	/**
	 * The feature id for the '<em><b>Logs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_INFO__LOGS = 2;

	/**
	 * The feature id for the '<em><b>Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_INFO__PROPS = 3;

	/**
	 * The number of structural features of the '<em>Management Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Management Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ResponseImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.LoggerInfoImpl <em>Logger Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.LoggerInfoImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getLoggerInfo()
	 * @generated
	 */
	int LOGGER_INFO = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_INFO__NAME = 0;

	/**
	 * The number of structural features of the '<em>Logger Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_INFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logger Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerImpl <em>Abstract Management Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getAbstractManagementServer()
	 * @generated
	 */
	int ABSTRACT_MANAGEMENT_SERVER = 5;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER__CONFIGURATION = SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER__COMPONENT = SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Management Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_FEATURE_COUNT = SOUTH_BOUND_API_WITH_PROXY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Logs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___LOGS__JSONOBJECT_ELIST = SOUTH_BOUND_API_WITH_PROXY___LOGS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Metrics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___METRICS__JSONOBJECT_ELIST = SOUTH_BOUND_API_WITH_PROXY___METRICS__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___PROPERTIES__JSONOBJECT_ELIST = SOUTH_BOUND_API_WITH_PROXY___PROPERTIES__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Upload Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___UPLOAD_INFO__JSONOBJECT_ELIST = SOUTH_BOUND_API_WITH_PROXY___UPLOAD_INFO__JSONOBJECT_ELIST;

	/**
	 * The operation id for the '<em>Get Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN = SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Values All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN = SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Messages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG = SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Request Logger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT = SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Evaluate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___EVALUATE__STRING_FUNCTION = SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER___UPDATE__STRING_FUNCTION = SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Abstract Management Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_OPERATION_COUNT = SOUTH_BOUND_API_WITH_PROXY_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl <em>Abstract Management Server Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getAbstractManagementServerConfiguration()
	 * @generated
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__MODULES = PropertiesPackage.MODULE_CONTAINER__MODULES;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES = PropertiesPackage.MODULE_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS = PropertiesPackage.MODULE_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES = PropertiesPackage.MODULE_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alert Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES = PropertiesPackage.MODULE_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS = PropertiesPackage.MODULE_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION = PropertiesPackage.MODULE_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Management Server Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION_FEATURE_COUNT = PropertiesPackage.MODULE_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Abstract Management Server Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION_OPERATION_COUNT = PropertiesPackage.MODULE_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionConfigurationImpl <em>Version Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.VersionConfigurationImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getVersionConfiguration()
	 * @generated
	 */
	int VERSION_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONFIGURATION__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Translation Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONFIGURATION__TRANSLATION_HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Supported Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONFIGURATION__SUPPORTED_VERSIONS = 2;

	/**
	 * The number of structural features of the '<em>Version Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Version Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionTranslationImpl <em>Version Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.VersionTranslationImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getVersionTranslation()
	 * @generated
	 */
	int VERSION_TRANSLATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION__STEPS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Version Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Version Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionTranslationStepImpl <em>Version Translation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.VersionTranslationStepImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getVersionTranslationStep()
	 * @generated
	 */
	int VERSION_TRANSLATION_STEP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION_STEP__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION_STEP__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION_STEP__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION_STEP__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The number of structural features of the '<em>Version Translation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION_STEP_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Version Translation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TRANSLATION_STEP_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.AttributeTranslationStepImpl <em>Attribute Translation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.AttributeTranslationStepImpl
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getAttributeTranslationStep()
	 * @generated
	 */
	int ATTRIBUTE_TRANSLATION_STEP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP__NAME = VERSION_TRANSLATION_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP__LAST_POLLED = VERSION_TRANSLATION_STEP__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP__LAST_CHANGED = VERSION_TRANSLATION_STEP__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP__CREATED = VERSION_TRANSLATION_STEP__CREATED;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP__ATTRIBUTE = VERSION_TRANSLATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP__CURRENT_VALUE = VERSION_TRANSLATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP__OLD_VALUE = VERSION_TRANSLATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Translation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP_FEATURE_COUNT = VERSION_TRANSLATION_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute Translation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TRANSLATION_STEP_OPERATION_COUNT = VERSION_TRANSLATION_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.server.ResponseStatus <em>Response Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.server.ResponseStatus
	 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getResponseStatus()
	 * @generated
	 */
	int RESPONSE_STATUS = 11;

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy <em>South Bound Api With Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>South Bound Api With Proxy</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy
	 * @generated
	 */
	EClass getSouthBoundApiWithProxy();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy#uploadInfo(org.json.JSONObject, org.eclipse.emf.common.util.EList) <em>Upload Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Upload Info</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy#uploadInfo(org.json.JSONObject, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSouthBoundApiWithProxy__UploadInfo__JSONObject_EList();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.SouthBoundApi <em>South Bound Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>South Bound Api</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.SouthBoundApi
	 * @generated
	 */
	EClass getSouthBoundApi();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.SouthBoundApi#logs(org.json.JSONObject, org.eclipse.emf.common.util.EList) <em>Logs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Logs</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.SouthBoundApi#logs(org.json.JSONObject, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSouthBoundApi__Logs__JSONObject_EList();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.SouthBoundApi#metrics(org.json.JSONObject, org.eclipse.emf.common.util.EList) <em>Metrics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Metrics</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.SouthBoundApi#metrics(org.json.JSONObject, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSouthBoundApi__Metrics__JSONObject_EList();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.SouthBoundApi#properties(org.json.JSONObject, org.eclipse.emf.common.util.EList) <em>Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Properties</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.SouthBoundApi#properties(org.json.JSONObject, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getSouthBoundApi__Properties__JSONObject_EList();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo <em>Management Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management Info</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.ManagementInfo
	 * @generated
	 */
	EClass getManagementInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getIp()
	 * @see #getManagementInfo()
	 * @generated
	 */
	EAttribute getManagementInfo_Ip();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getMetrics()
	 * @see #getManagementInfo()
	 * @generated
	 */
	EReference getManagementInfo_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getLogs <em>Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logs</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getLogs()
	 * @see #getManagementInfo()
	 * @generated
	 */
	EReference getManagementInfo_Logs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getProps <em>Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Props</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.ManagementInfo#getProps()
	 * @see #getManagementInfo()
	 * @generated
	 */
	EReference getManagementInfo_Props();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.Response#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.Response#getStatus()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.Response#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.Response#getMessage()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Message();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.LoggerInfo <em>Logger Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logger Info</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.LoggerInfo
	 * @generated
	 */
	EClass getLoggerInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.LoggerInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.LoggerInfo#getName()
	 * @see #getLoggerInfo()
	 * @generated
	 */
	EAttribute getLoggerInfo_Name();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer <em>Abstract Management Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Management Server</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer
	 * @generated
	 */
	EClass getAbstractManagementServer();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getConfiguration()
	 * @see #getAbstractManagementServer()
	 * @generated
	 */
	EReference getAbstractManagementServer_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getComponent()
	 * @see #getAbstractManagementServer()
	 * @generated
	 */
	EReference getAbstractManagementServer_Component();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getValues(org.json.JSONObject, java.lang.String, java.lang.Long, java.lang.Long, org.openecomp.ncomp.core.metrics.MetricValueOption, boolean) <em>Get Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Values</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getValues(org.json.JSONObject, java.lang.String, java.lang.Long, java.lang.Long, org.openecomp.ncomp.core.metrics.MetricValueOption, boolean)
	 * @generated
	 */
	EOperation getAbstractManagementServer__GetValues__JSONObject_String_Long_Long_MetricValueOption_boolean();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getValuesAll(org.json.JSONObject, java.lang.String, org.eclipse.emf.common.util.EList, java.lang.Long, java.lang.Long, org.openecomp.ncomp.core.metrics.MetricValueOption, boolean) <em>Get Values All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Values All</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getValuesAll(org.json.JSONObject, java.lang.String, org.eclipse.emf.common.util.EList, java.lang.Long, java.lang.Long, org.openecomp.ncomp.core.metrics.MetricValueOption, boolean)
	 * @generated
	 */
	EOperation getAbstractManagementServer__GetValuesAll__JSONObject_String_EList_Long_Long_MetricValueOption_boolean();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getMessages(org.json.JSONObject, java.lang.String, java.lang.Long, java.lang.Long) <em>Get Messages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Messages</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getMessages(org.json.JSONObject, java.lang.String, java.lang.Long, java.lang.Long)
	 * @generated
	 */
	EOperation getAbstractManagementServer__GetMessages__JSONObject_String_Long_Long();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getRequestLogger(java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject) <em>Get Request Logger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Request Logger</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#getRequestLogger(java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject)
	 * @generated
	 */
	EOperation getAbstractManagementServer__GetRequestLogger__String_String_String_JSONObject();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#evaluate(java.lang.String, org.openecomp.ncomp.core.function.Function) <em>Evaluate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#evaluate(java.lang.String, org.openecomp.ncomp.core.function.Function)
	 * @generated
	 */
	EOperation getAbstractManagementServer__Evaluate__String_Function();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#update(java.lang.String, org.openecomp.ncomp.core.function.Function) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer#update(java.lang.String, org.openecomp.ncomp.core.function.Function)
	 * @generated
	 */
	EOperation getAbstractManagementServer__Update__String_Function();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration <em>Abstract Management Server Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Management Server Configuration</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration
	 * @generated
	 */
	EClass getAbstractManagementServerConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getRules()
	 * @see #getAbstractManagementServerConfiguration()
	 * @generated
	 */
	EReference getAbstractManagementServerConfiguration_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getMetricOptions <em>Metric Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Options</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getMetricOptions()
	 * @see #getAbstractManagementServerConfiguration()
	 * @generated
	 */
	EReference getAbstractManagementServerConfiguration_MetricOptions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getTableTemplates <em>Table Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Templates</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getTableTemplates()
	 * @see #getAbstractManagementServerConfiguration()
	 * @generated
	 */
	EReference getAbstractManagementServerConfiguration_TableTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getAlertTemplates <em>Alert Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alert Templates</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getAlertTemplates()
	 * @see #getAbstractManagementServerConfiguration()
	 * @generated
	 */
	EReference getAbstractManagementServerConfiguration_AlertTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getFunctions()
	 * @see #getAbstractManagementServerConfiguration()
	 * @generated
	 */
	EReference getAbstractManagementServerConfiguration_Functions();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration#getVersion()
	 * @see #getAbstractManagementServerConfiguration()
	 * @generated
	 */
	EReference getAbstractManagementServerConfiguration_Version();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration <em>Version Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Configuration</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.VersionConfiguration
	 * @generated
	 */
	EClass getVersionConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getVersion()
	 * @see #getVersionConfiguration()
	 * @generated
	 */
	EAttribute getVersionConfiguration_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getTranslationHandler <em>Translation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation Handler</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getTranslationHandler()
	 * @see #getVersionConfiguration()
	 * @generated
	 */
	EAttribute getVersionConfiguration_TranslationHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getSupportedVersions <em>Supported Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Versions</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getSupportedVersions()
	 * @see #getVersionConfiguration()
	 * @generated
	 */
	EReference getVersionConfiguration_SupportedVersions();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.VersionTranslation <em>Version Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Translation</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.VersionTranslation
	 * @generated
	 */
	EClass getVersionTranslation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.server.VersionTranslation#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.VersionTranslation#getSteps()
	 * @see #getVersionTranslation()
	 * @generated
	 */
	EReference getVersionTranslation_Steps();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.VersionTranslationStep <em>Version Translation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Translation Step</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.VersionTranslationStep
	 * @generated
	 */
	EClass getVersionTranslationStep();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep <em>Attribute Translation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Translation Step</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep
	 * @generated
	 */
	EClass getAttributeTranslationStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getAttribute()
	 * @see #getAttributeTranslationStep()
	 * @generated
	 */
	EAttribute getAttributeTranslationStep_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Value</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getCurrentValue()
	 * @see #getAttributeTranslationStep()
	 * @generated
	 */
	EAttribute getAttributeTranslationStep_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getOldValue()
	 * @see #getAttributeTranslationStep()
	 * @generated
	 */
	EAttribute getAttributeTranslationStep_OldValue();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.sirius.manager.server.ResponseStatus <em>Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Response Status</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.server.ResponseStatus
	 * @generated
	 */
	EEnum getResponseStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServerFactory getServerFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiWithProxyImpl <em>South Bound Api With Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiWithProxyImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getSouthBoundApiWithProxy()
		 * @generated
		 */
		EClass SOUTH_BOUND_API_WITH_PROXY = eINSTANCE.getSouthBoundApiWithProxy();

		/**
		 * The meta object literal for the '<em><b>Upload Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUTH_BOUND_API_WITH_PROXY___UPLOAD_INFO__JSONOBJECT_ELIST = eINSTANCE.getSouthBoundApiWithProxy__UploadInfo__JSONObject_EList();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiImpl <em>South Bound Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.SouthBoundApiImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getSouthBoundApi()
		 * @generated
		 */
		EClass SOUTH_BOUND_API = eINSTANCE.getSouthBoundApi();

		/**
		 * The meta object literal for the '<em><b>Logs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUTH_BOUND_API___LOGS__JSONOBJECT_ELIST = eINSTANCE.getSouthBoundApi__Logs__JSONObject_EList();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUTH_BOUND_API___METRICS__JSONOBJECT_ELIST = eINSTANCE.getSouthBoundApi__Metrics__JSONObject_EList();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOUTH_BOUND_API___PROPERTIES__JSONOBJECT_ELIST = eINSTANCE.getSouthBoundApi__Properties__JSONObject_EList();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.ManagementInfoImpl <em>Management Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ManagementInfoImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getManagementInfo()
		 * @generated
		 */
		EClass MANAGEMENT_INFO = eINSTANCE.getManagementInfo();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGEMENT_INFO__IP = eINSTANCE.getManagementInfo_Ip();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_INFO__METRICS = eINSTANCE.getManagementInfo_Metrics();

		/**
		 * The meta object literal for the '<em><b>Logs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_INFO__LOGS = eINSTANCE.getManagementInfo_Logs();

		/**
		 * The meta object literal for the '<em><b>Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_INFO__PROPS = eINSTANCE.getManagementInfo_Props();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ResponseImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__STATUS = eINSTANCE.getResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__MESSAGE = eINSTANCE.getResponse_Message();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.LoggerInfoImpl <em>Logger Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.LoggerInfoImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getLoggerInfo()
		 * @generated
		 */
		EClass LOGGER_INFO = eINSTANCE.getLoggerInfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGGER_INFO__NAME = eINSTANCE.getLoggerInfo_Name();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerImpl <em>Abstract Management Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getAbstractManagementServer()
		 * @generated
		 */
		EClass ABSTRACT_MANAGEMENT_SERVER = eINSTANCE.getAbstractManagementServer();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MANAGEMENT_SERVER__CONFIGURATION = eINSTANCE.getAbstractManagementServer_Configuration();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MANAGEMENT_SERVER__COMPONENT = eINSTANCE.getAbstractManagementServer_Component();

		/**
		 * The meta object literal for the '<em><b>Get Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MANAGEMENT_SERVER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN = eINSTANCE.getAbstractManagementServer__GetValues__JSONObject_String_Long_Long_MetricValueOption_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Values All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MANAGEMENT_SERVER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN = eINSTANCE.getAbstractManagementServer__GetValuesAll__JSONObject_String_EList_Long_Long_MetricValueOption_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Messages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MANAGEMENT_SERVER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG = eINSTANCE.getAbstractManagementServer__GetMessages__JSONObject_String_Long_Long();

		/**
		 * The meta object literal for the '<em><b>Get Request Logger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MANAGEMENT_SERVER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT = eINSTANCE.getAbstractManagementServer__GetRequestLogger__String_String_String_JSONObject();

		/**
		 * The meta object literal for the '<em><b>Evaluate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MANAGEMENT_SERVER___EVALUATE__STRING_FUNCTION = eINSTANCE.getAbstractManagementServer__Evaluate__String_Function();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MANAGEMENT_SERVER___UPDATE__STRING_FUNCTION = eINSTANCE.getAbstractManagementServer__Update__String_Function();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl <em>Abstract Management Server Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getAbstractManagementServerConfiguration()
		 * @generated
		 */
		EClass ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION = eINSTANCE.getAbstractManagementServerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES = eINSTANCE.getAbstractManagementServerConfiguration_Rules();

		/**
		 * The meta object literal for the '<em><b>Metric Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS = eINSTANCE.getAbstractManagementServerConfiguration_MetricOptions();

		/**
		 * The meta object literal for the '<em><b>Table Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES = eINSTANCE.getAbstractManagementServerConfiguration_TableTemplates();

		/**
		 * The meta object literal for the '<em><b>Alert Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES = eINSTANCE.getAbstractManagementServerConfiguration_AlertTemplates();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS = eINSTANCE.getAbstractManagementServerConfiguration_Functions();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION = eINSTANCE.getAbstractManagementServerConfiguration_Version();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionConfigurationImpl <em>Version Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.VersionConfigurationImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getVersionConfiguration()
		 * @generated
		 */
		EClass VERSION_CONFIGURATION = eINSTANCE.getVersionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_CONFIGURATION__VERSION = eINSTANCE.getVersionConfiguration_Version();

		/**
		 * The meta object literal for the '<em><b>Translation Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_CONFIGURATION__TRANSLATION_HANDLER = eINSTANCE.getVersionConfiguration_TranslationHandler();

		/**
		 * The meta object literal for the '<em><b>Supported Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_CONFIGURATION__SUPPORTED_VERSIONS = eINSTANCE.getVersionConfiguration_SupportedVersions();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionTranslationImpl <em>Version Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.VersionTranslationImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getVersionTranslation()
		 * @generated
		 */
		EClass VERSION_TRANSLATION = eINSTANCE.getVersionTranslation();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_TRANSLATION__STEPS = eINSTANCE.getVersionTranslation_Steps();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionTranslationStepImpl <em>Version Translation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.VersionTranslationStepImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getVersionTranslationStep()
		 * @generated
		 */
		EClass VERSION_TRANSLATION_STEP = eINSTANCE.getVersionTranslationStep();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.impl.AttributeTranslationStepImpl <em>Attribute Translation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.AttributeTranslationStepImpl
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getAttributeTranslationStep()
		 * @generated
		 */
		EClass ATTRIBUTE_TRANSLATION_STEP = eINSTANCE.getAttributeTranslationStep();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TRANSLATION_STEP__ATTRIBUTE = eINSTANCE.getAttributeTranslationStep_Attribute();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TRANSLATION_STEP__CURRENT_VALUE = eINSTANCE.getAttributeTranslationStep_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TRANSLATION_STEP__OLD_VALUE = eINSTANCE.getAttributeTranslationStep_OldValue();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.server.ResponseStatus <em>Response Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.server.ResponseStatus
		 * @see org.openecomp.ncomp.sirius.manager.server.impl.ServerPackageImpl#getResponseStatus()
		 * @generated
		 */
		EEnum RESPONSE_STATUS = eINSTANCE.getResponseStatus();

	}

} //ServerPackage
