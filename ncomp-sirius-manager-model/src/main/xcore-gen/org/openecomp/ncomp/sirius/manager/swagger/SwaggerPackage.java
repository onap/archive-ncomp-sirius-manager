
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
package org.openecomp.ncomp.sirius.manager.swagger;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-sirius-manager-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.sirius.manager'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore swagger='http://openecomp.org/ncomp/swagger'"
 * @generated
 */
public interface SwaggerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "swagger";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.sirius.manager.swagger";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "swagger";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwaggerPackage eINSTANCE = org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerModel()
	 * @generated
	 */
	int SWAGGER_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Swagger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__SWAGGER = 0;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__INFO = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__HOST = 2;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__BASE_PATH = 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__TAGS = 4;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__SCHEMES = 5;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__PATHS = 6;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__DEFINITIONS = 7;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__EXTERNAL_DOCS = 8;

	/**
	 * The feature id for the '<em><b>Security Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL__SECURITY_DEFINITIONS = 9;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerInfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerInfoImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerInfo()
	 * @generated
	 */
	int SWAGGER_INFO = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_INFO__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_INFO__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_INFO__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Terms Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_INFO__TERMS_OF_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_INFO__CONTACT = 4;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_INFO__LICENSE = 5;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_INFO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerContactImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerContact()
	 * @generated
	 */
	int SWAGGER_CONTACT = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_CONTACT__EMAIL = 0;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_CONTACT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerLicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerLicenseImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerLicense()
	 * @generated
	 */
	int SWAGGER_LICENSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_LICENSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_LICENSE__URL = 1;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_LICENSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerTagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerTagImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerTag()
	 * @generated
	 */
	int SWAGGER_TAG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_TAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_TAG__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_TAG__EXTERNAL_DOCS = 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_TAG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerExternalDocumentationImpl <em>External Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerExternalDocumentationImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerExternalDocumentation()
	 * @generated
	 */
	int SWAGGER_EXTERNAL_DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_EXTERNAL_DOCUMENTATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_EXTERNAL_DOCUMENTATION__URL = 1;

	/**
	 * The number of structural features of the '<em>External Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_EXTERNAL_DOCUMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_EXTERNAL_DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPathImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerPath()
	 * @generated
	 */
	int SWAGGER_PATH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PATH__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PATH__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PATH__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PATH__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PATH__METHODS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PATH_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PATH_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerOperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerOperationImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerOperation()
	 * @generated
	 */
	int SWAGGER_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__TAGS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__SUMMARY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__OPERATION_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__CONSUMES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__PRODUCES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__PARAMETERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__RESPONSES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__SECURITY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION__DEPRECATED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OPERATION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerParameterImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerParameter()
	 * @generated
	 */
	int SWAGGER_PARAMETER = 8;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerResponseImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerResponse()
	 * @generated
	 */
	int SWAGGER_RESPONSE = 9;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSecurity()
	 * @generated
	 */
	int SWAGGER_SECURITY = 11;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectTypeImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerObjectType()
	 * @generated
	 */
	int SWAGGER_OBJECT_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerReferenceObjectTypeImpl <em>Reference Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerReferenceObjectTypeImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerReferenceObjectType()
	 * @generated
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl <em>Named Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerNamedObjectType()
	 * @generated
	 */
	int SWAGGER_NAMED_OBJECT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PARAMETER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PARAMETER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PARAMETER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PARAMETER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PARAMETER__IN = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PARAMETER__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PARAMETER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_PARAMETER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE__DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE__SCHEMA = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE__HEADERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_RESPONSE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityObjectImpl <em>Security Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityObjectImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSecurityObject()
	 * @generated
	 */
	int SWAGGER_SECURITY_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_OBJECT__LIST = 0;

	/**
	 * The number of structural features of the '<em>Security Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY__ROLES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityDefinitionImpl <em>Security Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityDefinitionImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSecurityDefinition()
	 * @generated
	 */
	int SWAGGER_SECURITY_DEFINITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION__AUTHORIZATION_URL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION__FLOW = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION__IN = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Security Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Security Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityDefinitionScopeImpl <em>Security Definition Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityDefinitionScopeImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSecurityDefinitionScope()
	 * @generated
	 */
	int SWAGGER_SECURITY_DEFINITION_SCOPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_SCOPE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_SCOPE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_SCOPE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_SCOPE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_SCOPE__DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Definition Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_SCOPE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Definition Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SECURITY_DEFINITION_SCOPE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_TYPE__MANY = 0;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__MANY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__DEFAULT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE__XML = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Named Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Named Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_NAMED_OBJECT_TYPE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__NAME = SWAGGER_NAMED_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__LAST_POLLED = SWAGGER_NAMED_OBJECT_TYPE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__LAST_CHANGED = SWAGGER_NAMED_OBJECT_TYPE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__CREATED = SWAGGER_NAMED_OBJECT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__MANY = SWAGGER_NAMED_OBJECT_TYPE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__TYPE = SWAGGER_NAMED_OBJECT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__DEFAULT = SWAGGER_NAMED_OBJECT_TYPE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__DESCRIPTION = SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__XML = SWAGGER_NAMED_OBJECT_TYPE__XML;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__REQUIRED = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE__REFERENCE = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE_FEATURE_COUNT = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_REFERENCE_OBJECT_TYPE_OPERATION_COUNT = SWAGGER_NAMED_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectClassDefinitionImpl <em>Object Class Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectClassDefinitionImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerObjectClassDefinition()
	 * @generated
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__NAME = SWAGGER_NAMED_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__LAST_POLLED = SWAGGER_NAMED_OBJECT_TYPE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__LAST_CHANGED = SWAGGER_NAMED_OBJECT_TYPE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__CREATED = SWAGGER_NAMED_OBJECT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__MANY = SWAGGER_NAMED_OBJECT_TYPE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__TYPE = SWAGGER_NAMED_OBJECT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__DEFAULT = SWAGGER_NAMED_OBJECT_TYPE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__DESCRIPTION = SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__XML = SWAGGER_NAMED_OBJECT_TYPE__XML;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__REQUIRED = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>All Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__ALL_OF = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION_FEATURE_COUNT = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Object Class Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_OBJECT_CLASS_DEFINITION_OPERATION_COUNT = SWAGGER_NAMED_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSimpleObjectTypeImpl <em>Simple Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSimpleObjectTypeImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSimpleObjectType()
	 * @generated
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__NAME = SWAGGER_NAMED_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__LAST_POLLED = SWAGGER_NAMED_OBJECT_TYPE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__LAST_CHANGED = SWAGGER_NAMED_OBJECT_TYPE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__CREATED = SWAGGER_NAMED_OBJECT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__MANY = SWAGGER_NAMED_OBJECT_TYPE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__TYPE = SWAGGER_NAMED_OBJECT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__DEFAULT = SWAGGER_NAMED_OBJECT_TYPE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__DESCRIPTION = SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__XML = SWAGGER_NAMED_OBJECT_TYPE__XML;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__REQUIRED = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__FORMAT = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__MINIMUM = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__MAXIMUM = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__PATTERN = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__EXAMPLE = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE__COLLECTION_FORMAT = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Simple Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE_FEATURE_COUNT = SWAGGER_NAMED_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Simple Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_SIMPLE_OBJECT_TYPE_OPERATION_COUNT = SWAGGER_NAMED_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerXmlImpl <em>Xml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerXmlImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerXml()
	 * @generated
	 */
	int SWAGGER_XML = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_XML__NAME = 0;

	/**
	 * The feature id for the '<em><b>Wrapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_XML__WRAPPED = 1;

	/**
	 * The number of structural features of the '<em>Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_XML_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_XML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerEnumObjectTypeImpl <em>Enum Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerEnumObjectTypeImpl
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerEnumObjectType()
	 * @generated
	 */
	int SWAGGER_ENUM_OBJECT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__NAME = SWAGGER_SIMPLE_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__LAST_POLLED = SWAGGER_SIMPLE_OBJECT_TYPE__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__LAST_CHANGED = SWAGGER_SIMPLE_OBJECT_TYPE__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__CREATED = SWAGGER_SIMPLE_OBJECT_TYPE__CREATED;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__MANY = SWAGGER_SIMPLE_OBJECT_TYPE__MANY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__TYPE = SWAGGER_SIMPLE_OBJECT_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__DEFAULT = SWAGGER_SIMPLE_OBJECT_TYPE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__DESCRIPTION = SWAGGER_SIMPLE_OBJECT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__XML = SWAGGER_SIMPLE_OBJECT_TYPE__XML;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__REQUIRED = SWAGGER_SIMPLE_OBJECT_TYPE__REQUIRED;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__FORMAT = SWAGGER_SIMPLE_OBJECT_TYPE__FORMAT;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__MINIMUM = SWAGGER_SIMPLE_OBJECT_TYPE__MINIMUM;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__MAXIMUM = SWAGGER_SIMPLE_OBJECT_TYPE__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__PATTERN = SWAGGER_SIMPLE_OBJECT_TYPE__PATTERN;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__EXAMPLE = SWAGGER_SIMPLE_OBJECT_TYPE__EXAMPLE;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__COLLECTION_FORMAT = SWAGGER_SIMPLE_OBJECT_TYPE__COLLECTION_FORMAT;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE__ENUM = SWAGGER_SIMPLE_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE_FEATURE_COUNT = SWAGGER_SIMPLE_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWAGGER_ENUM_OBJECT_TYPE_OPERATION_COUNT = SWAGGER_SIMPLE_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType <em>Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerParameterType()
	 * @generated
	 */
	int SWAGGER_PARAMETER_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerCollectionFormat <em>Collection Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerCollectionFormat
	 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerCollectionFormat()
	 * @generated
	 */
	int SWAGGER_COLLECTION_FORMAT = 22;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel
	 * @generated
	 */
	EClass getSwaggerModel();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSwagger <em>Swagger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swagger</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSwagger()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EAttribute getSwaggerModel_Swagger();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getInfo()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EReference getSwaggerModel_Info();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getHost()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EAttribute getSwaggerModel_Host();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getBasePath()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EAttribute getSwaggerModel_BasePath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getTags()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EReference getSwaggerModel_Tags();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSchemes()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EAttribute getSwaggerModel_Schemes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getPaths()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EReference getSwaggerModel_Paths();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getDefinitions()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EReference getSwaggerModel_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getExternalDocs()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EReference getSwaggerModel_ExternalDocs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Definitions</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSecurityDefinitions()
	 * @see #getSwaggerModel()
	 * @generated
	 */
	EReference getSwaggerModel_SecurityDefinitions();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo
	 * @generated
	 */
	EClass getSwaggerInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getDescription()
	 * @see #getSwaggerInfo()
	 * @generated
	 */
	EAttribute getSwaggerInfo_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getVersion()
	 * @see #getSwaggerInfo()
	 * @generated
	 */
	EAttribute getSwaggerInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getTitle()
	 * @see #getSwaggerInfo()
	 * @generated
	 */
	EAttribute getSwaggerInfo_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getTermsOfService <em>Terms Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terms Of Service</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getTermsOfService()
	 * @see #getSwaggerInfo()
	 * @generated
	 */
	EAttribute getSwaggerInfo_TermsOfService();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getContact()
	 * @see #getSwaggerInfo()
	 * @generated
	 */
	EReference getSwaggerInfo_Contact();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo#getLicense()
	 * @see #getSwaggerInfo()
	 * @generated
	 */
	EReference getSwaggerInfo_License();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerContact
	 * @generated
	 */
	EClass getSwaggerContact();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerContact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerContact#getEmail()
	 * @see #getSwaggerContact()
	 * @generated
	 */
	EAttribute getSwaggerContact_Email();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense
	 * @generated
	 */
	EClass getSwaggerLicense();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense#getName()
	 * @see #getSwaggerLicense()
	 * @generated
	 */
	EAttribute getSwaggerLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense#getUrl()
	 * @see #getSwaggerLicense()
	 * @generated
	 */
	EAttribute getSwaggerLicense_Url();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag
	 * @generated
	 */
	EClass getSwaggerTag();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag#getName()
	 * @see #getSwaggerTag()
	 * @generated
	 */
	EAttribute getSwaggerTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag#getDescription()
	 * @see #getSwaggerTag()
	 * @generated
	 */
	EAttribute getSwaggerTag_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag#getExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Docs</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag#getExternalDocs()
	 * @see #getSwaggerTag()
	 * @generated
	 */
	EReference getSwaggerTag_ExternalDocs();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation <em>External Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Documentation</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation
	 * @generated
	 */
	EClass getSwaggerExternalDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation#getDescription()
	 * @see #getSwaggerExternalDocumentation()
	 * @generated
	 */
	EAttribute getSwaggerExternalDocumentation_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation#getUrl()
	 * @see #getSwaggerExternalDocumentation()
	 * @generated
	 */
	EAttribute getSwaggerExternalDocumentation_Url();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath
	 * @generated
	 */
	EClass getSwaggerPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath#getMethods()
	 * @see #getSwaggerPath()
	 * @generated
	 */
	EReference getSwaggerPath_Methods();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation
	 * @generated
	 */
	EClass getSwaggerOperation();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getTags()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EAttribute getSwaggerOperation_Tags();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getSummary()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EAttribute getSwaggerOperation_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getDescription()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EAttribute getSwaggerOperation_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getOperationId <em>Operation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Id</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getOperationId()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EAttribute getSwaggerOperation_OperationId();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consumes</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getConsumes()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EAttribute getSwaggerOperation_Consumes();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produces</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getProduces()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EAttribute getSwaggerOperation_Produces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getParameters()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EReference getSwaggerOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responses</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getResponses()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EReference getSwaggerOperation_Responses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getSecurity()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EReference getSwaggerOperation_Security();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#isDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#isDeprecated()
	 * @see #getSwaggerOperation()
	 * @generated
	 */
	EAttribute getSwaggerOperation_Deprecated();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter
	 * @generated
	 */
	EClass getSwaggerParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter#getIn()
	 * @see #getSwaggerParameter()
	 * @generated
	 */
	EAttribute getSwaggerParameter_In();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter#getType()
	 * @see #getSwaggerParameter()
	 * @generated
	 */
	EReference getSwaggerParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse
	 * @generated
	 */
	EClass getSwaggerResponse();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse#getDescription()
	 * @see #getSwaggerResponse()
	 * @generated
	 */
	EAttribute getSwaggerResponse_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse#getSchema()
	 * @see #getSwaggerResponse()
	 * @generated
	 */
	EReference getSwaggerResponse_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse#getHeaders()
	 * @see #getSwaggerResponse()
	 * @generated
	 */
	EReference getSwaggerResponse_Headers();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityObject <em>Security Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Object</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityObject
	 * @generated
	 */
	EClass getSwaggerSecurityObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityObject#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityObject#getList()
	 * @see #getSwaggerSecurityObject()
	 * @generated
	 */
	EReference getSwaggerSecurityObject_List();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurity
	 * @generated
	 */
	EClass getSwaggerSecurity();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurity#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Roles</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurity#getRoles()
	 * @see #getSwaggerSecurity()
	 * @generated
	 */
	EAttribute getSwaggerSecurity_Roles();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition <em>Security Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Definition</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition
	 * @generated
	 */
	EClass getSwaggerSecurityDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getType()
	 * @see #getSwaggerSecurityDefinition()
	 * @generated
	 */
	EAttribute getSwaggerSecurityDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getAuthorizationUrl <em>Authorization Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization Url</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getAuthorizationUrl()
	 * @see #getSwaggerSecurityDefinition()
	 * @generated
	 */
	EAttribute getSwaggerSecurityDefinition_AuthorizationUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getFlow()
	 * @see #getSwaggerSecurityDefinition()
	 * @generated
	 */
	EAttribute getSwaggerSecurityDefinition_Flow();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getIn()
	 * @see #getSwaggerSecurityDefinition()
	 * @generated
	 */
	EAttribute getSwaggerSecurityDefinition_In();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinitionScope <em>Security Definition Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Definition Scope</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinitionScope
	 * @generated
	 */
	EClass getSwaggerSecurityDefinitionScope();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinitionScope#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinitionScope#getDescription()
	 * @see #getSwaggerSecurityDefinitionScope()
	 * @generated
	 */
	EAttribute getSwaggerSecurityDefinitionScope_Description();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType
	 * @generated
	 */
	EClass getSwaggerObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType#isMany()
	 * @see #getSwaggerObjectType()
	 * @generated
	 */
	EAttribute getSwaggerObjectType_Many();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType <em>Reference Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Object Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType
	 * @generated
	 */
	EClass getSwaggerReferenceObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType#isRequired()
	 * @see #getSwaggerReferenceObjectType()
	 * @generated
	 */
	EAttribute getSwaggerReferenceObjectType_Required();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType#getReference()
	 * @see #getSwaggerReferenceObjectType()
	 * @generated
	 */
	EReference getSwaggerReferenceObjectType_Reference();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType <em>Named Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Object Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType
	 * @generated
	 */
	EClass getSwaggerNamedObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType#getType()
	 * @see #getSwaggerNamedObjectType()
	 * @generated
	 */
	EAttribute getSwaggerNamedObjectType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType#getDefault()
	 * @see #getSwaggerNamedObjectType()
	 * @generated
	 */
	EAttribute getSwaggerNamedObjectType_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType#getDescription()
	 * @see #getSwaggerNamedObjectType()
	 * @generated
	 */
	EAttribute getSwaggerNamedObjectType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType#getXml()
	 * @see #getSwaggerNamedObjectType()
	 * @generated
	 */
	EReference getSwaggerNamedObjectType_Xml();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition <em>Object Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Class Definition</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition
	 * @generated
	 */
	EClass getSwaggerObjectClassDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Required</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getRequired()
	 * @see #getSwaggerObjectClassDefinition()
	 * @generated
	 */
	EAttribute getSwaggerObjectClassDefinition_Required();

	/**
	 * Returns the meta object for the reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getAllOf <em>All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Of</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getAllOf()
	 * @see #getSwaggerObjectClassDefinition()
	 * @generated
	 */
	EReference getSwaggerObjectClassDefinition_AllOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getProperties()
	 * @see #getSwaggerObjectClassDefinition()
	 * @generated
	 */
	EReference getSwaggerObjectClassDefinition_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getAdditionalProperties <em>Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Properties</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getAdditionalProperties()
	 * @see #getSwaggerObjectClassDefinition()
	 * @generated
	 */
	EReference getSwaggerObjectClassDefinition_AdditionalProperties();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType <em>Simple Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Object Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType
	 * @generated
	 */
	EClass getSwaggerSimpleObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#isRequired()
	 * @see #getSwaggerSimpleObjectType()
	 * @generated
	 */
	EAttribute getSwaggerSimpleObjectType_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getFormat()
	 * @see #getSwaggerSimpleObjectType()
	 * @generated
	 */
	EAttribute getSwaggerSimpleObjectType_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getMinimum()
	 * @see #getSwaggerSimpleObjectType()
	 * @generated
	 */
	EAttribute getSwaggerSimpleObjectType_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getMaximum()
	 * @see #getSwaggerSimpleObjectType()
	 * @generated
	 */
	EAttribute getSwaggerSimpleObjectType_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getPattern()
	 * @see #getSwaggerSimpleObjectType()
	 * @generated
	 */
	EAttribute getSwaggerSimpleObjectType_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getExample()
	 * @see #getSwaggerSimpleObjectType()
	 * @generated
	 */
	EAttribute getSwaggerSimpleObjectType_Example();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getCollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Format</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType#getCollectionFormat()
	 * @see #getSwaggerSimpleObjectType()
	 * @generated
	 */
	EAttribute getSwaggerSimpleObjectType_CollectionFormat();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml
	 * @generated
	 */
	EClass getSwaggerXml();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml#getName()
	 * @see #getSwaggerXml()
	 * @generated
	 */
	EAttribute getSwaggerXml_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml#isWrapped <em>Wrapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml#isWrapped()
	 * @see #getSwaggerXml()
	 * @generated
	 */
	EAttribute getSwaggerXml_Wrapped();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerEnumObjectType <em>Enum Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Object Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerEnumObjectType
	 * @generated
	 */
	EClass getSwaggerEnumObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerEnumObjectType#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerEnumObjectType#getEnum()
	 * @see #getSwaggerEnumObjectType()
	 * @generated
	 */
	EAttribute getSwaggerEnumObjectType_Enum();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Type</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType
	 * @generated
	 */
	EEnum getSwaggerParameterType();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerCollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Format</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerCollectionFormat
	 * @generated
	 */
	EEnum getSwaggerCollectionFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SwaggerFactory getSwaggerFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerModel()
		 * @generated
		 */
		EClass SWAGGER_MODEL = eINSTANCE.getSwaggerModel();

		/**
		 * The meta object literal for the '<em><b>Swagger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_MODEL__SWAGGER = eINSTANCE.getSwaggerModel_Swagger();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_MODEL__INFO = eINSTANCE.getSwaggerModel_Info();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_MODEL__HOST = eINSTANCE.getSwaggerModel_Host();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_MODEL__BASE_PATH = eINSTANCE.getSwaggerModel_BasePath();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_MODEL__TAGS = eINSTANCE.getSwaggerModel_Tags();

		/**
		 * The meta object literal for the '<em><b>Schemes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_MODEL__SCHEMES = eINSTANCE.getSwaggerModel_Schemes();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_MODEL__PATHS = eINSTANCE.getSwaggerModel_Paths();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_MODEL__DEFINITIONS = eINSTANCE.getSwaggerModel_Definitions();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_MODEL__EXTERNAL_DOCS = eINSTANCE.getSwaggerModel_ExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Security Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_MODEL__SECURITY_DEFINITIONS = eINSTANCE.getSwaggerModel_SecurityDefinitions();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerInfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerInfoImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerInfo()
		 * @generated
		 */
		EClass SWAGGER_INFO = eINSTANCE.getSwaggerInfo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_INFO__DESCRIPTION = eINSTANCE.getSwaggerInfo_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_INFO__VERSION = eINSTANCE.getSwaggerInfo_Version();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_INFO__TITLE = eINSTANCE.getSwaggerInfo_Title();

		/**
		 * The meta object literal for the '<em><b>Terms Of Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_INFO__TERMS_OF_SERVICE = eINSTANCE.getSwaggerInfo_TermsOfService();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_INFO__CONTACT = eINSTANCE.getSwaggerInfo_Contact();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_INFO__LICENSE = eINSTANCE.getSwaggerInfo_License();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerContactImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerContact()
		 * @generated
		 */
		EClass SWAGGER_CONTACT = eINSTANCE.getSwaggerContact();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_CONTACT__EMAIL = eINSTANCE.getSwaggerContact_Email();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerLicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerLicenseImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerLicense()
		 * @generated
		 */
		EClass SWAGGER_LICENSE = eINSTANCE.getSwaggerLicense();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_LICENSE__NAME = eINSTANCE.getSwaggerLicense_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_LICENSE__URL = eINSTANCE.getSwaggerLicense_Url();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerTagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerTagImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerTag()
		 * @generated
		 */
		EClass SWAGGER_TAG = eINSTANCE.getSwaggerTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_TAG__NAME = eINSTANCE.getSwaggerTag_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_TAG__DESCRIPTION = eINSTANCE.getSwaggerTag_Description();

		/**
		 * The meta object literal for the '<em><b>External Docs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_TAG__EXTERNAL_DOCS = eINSTANCE.getSwaggerTag_ExternalDocs();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerExternalDocumentationImpl <em>External Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerExternalDocumentationImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerExternalDocumentation()
		 * @generated
		 */
		EClass SWAGGER_EXTERNAL_DOCUMENTATION = eINSTANCE.getSwaggerExternalDocumentation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_EXTERNAL_DOCUMENTATION__DESCRIPTION = eINSTANCE.getSwaggerExternalDocumentation_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_EXTERNAL_DOCUMENTATION__URL = eINSTANCE.getSwaggerExternalDocumentation_Url();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPathImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerPath()
		 * @generated
		 */
		EClass SWAGGER_PATH = eINSTANCE.getSwaggerPath();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_PATH__METHODS = eINSTANCE.getSwaggerPath_Methods();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerOperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerOperationImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerOperation()
		 * @generated
		 */
		EClass SWAGGER_OPERATION = eINSTANCE.getSwaggerOperation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OPERATION__TAGS = eINSTANCE.getSwaggerOperation_Tags();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OPERATION__SUMMARY = eINSTANCE.getSwaggerOperation_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OPERATION__DESCRIPTION = eINSTANCE.getSwaggerOperation_Description();

		/**
		 * The meta object literal for the '<em><b>Operation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OPERATION__OPERATION_ID = eINSTANCE.getSwaggerOperation_OperationId();

		/**
		 * The meta object literal for the '<em><b>Consumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OPERATION__CONSUMES = eINSTANCE.getSwaggerOperation_Consumes();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OPERATION__PRODUCES = eINSTANCE.getSwaggerOperation_Produces();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_OPERATION__PARAMETERS = eINSTANCE.getSwaggerOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_OPERATION__RESPONSES = eINSTANCE.getSwaggerOperation_Responses();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_OPERATION__SECURITY = eINSTANCE.getSwaggerOperation_Security();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OPERATION__DEPRECATED = eINSTANCE.getSwaggerOperation_Deprecated();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerParameterImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerParameter()
		 * @generated
		 */
		EClass SWAGGER_PARAMETER = eINSTANCE.getSwaggerParameter();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_PARAMETER__IN = eINSTANCE.getSwaggerParameter_In();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_PARAMETER__TYPE = eINSTANCE.getSwaggerParameter_Type();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerResponseImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerResponse()
		 * @generated
		 */
		EClass SWAGGER_RESPONSE = eINSTANCE.getSwaggerResponse();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_RESPONSE__DESCRIPTION = eINSTANCE.getSwaggerResponse_Description();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_RESPONSE__SCHEMA = eINSTANCE.getSwaggerResponse_Schema();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_RESPONSE__HEADERS = eINSTANCE.getSwaggerResponse_Headers();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityObjectImpl <em>Security Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityObjectImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSecurityObject()
		 * @generated
		 */
		EClass SWAGGER_SECURITY_OBJECT = eINSTANCE.getSwaggerSecurityObject();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_SECURITY_OBJECT__LIST = eINSTANCE.getSwaggerSecurityObject_List();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSecurity()
		 * @generated
		 */
		EClass SWAGGER_SECURITY = eINSTANCE.getSwaggerSecurity();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SECURITY__ROLES = eINSTANCE.getSwaggerSecurity_Roles();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityDefinitionImpl <em>Security Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityDefinitionImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSecurityDefinition()
		 * @generated
		 */
		EClass SWAGGER_SECURITY_DEFINITION = eINSTANCE.getSwaggerSecurityDefinition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SECURITY_DEFINITION__TYPE = eINSTANCE.getSwaggerSecurityDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Authorization Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SECURITY_DEFINITION__AUTHORIZATION_URL = eINSTANCE.getSwaggerSecurityDefinition_AuthorizationUrl();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SECURITY_DEFINITION__FLOW = eINSTANCE.getSwaggerSecurityDefinition_Flow();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SECURITY_DEFINITION__IN = eINSTANCE.getSwaggerSecurityDefinition_In();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityDefinitionScopeImpl <em>Security Definition Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSecurityDefinitionScopeImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSecurityDefinitionScope()
		 * @generated
		 */
		EClass SWAGGER_SECURITY_DEFINITION_SCOPE = eINSTANCE.getSwaggerSecurityDefinitionScope();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SECURITY_DEFINITION_SCOPE__DESCRIPTION = eINSTANCE.getSwaggerSecurityDefinitionScope_Description();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectTypeImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerObjectType()
		 * @generated
		 */
		EClass SWAGGER_OBJECT_TYPE = eINSTANCE.getSwaggerObjectType();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OBJECT_TYPE__MANY = eINSTANCE.getSwaggerObjectType_Many();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerReferenceObjectTypeImpl <em>Reference Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerReferenceObjectTypeImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerReferenceObjectType()
		 * @generated
		 */
		EClass SWAGGER_REFERENCE_OBJECT_TYPE = eINSTANCE.getSwaggerReferenceObjectType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_REFERENCE_OBJECT_TYPE__REQUIRED = eINSTANCE.getSwaggerReferenceObjectType_Required();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_REFERENCE_OBJECT_TYPE__REFERENCE = eINSTANCE.getSwaggerReferenceObjectType_Reference();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl <em>Named Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerNamedObjectType()
		 * @generated
		 */
		EClass SWAGGER_NAMED_OBJECT_TYPE = eINSTANCE.getSwaggerNamedObjectType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_NAMED_OBJECT_TYPE__TYPE = eINSTANCE.getSwaggerNamedObjectType_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_NAMED_OBJECT_TYPE__DEFAULT = eINSTANCE.getSwaggerNamedObjectType_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION = eINSTANCE.getSwaggerNamedObjectType_Description();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_NAMED_OBJECT_TYPE__XML = eINSTANCE.getSwaggerNamedObjectType_Xml();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectClassDefinitionImpl <em>Object Class Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectClassDefinitionImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerObjectClassDefinition()
		 * @generated
		 */
		EClass SWAGGER_OBJECT_CLASS_DEFINITION = eINSTANCE.getSwaggerObjectClassDefinition();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_OBJECT_CLASS_DEFINITION__REQUIRED = eINSTANCE.getSwaggerObjectClassDefinition_Required();

		/**
		 * The meta object literal for the '<em><b>All Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_OBJECT_CLASS_DEFINITION__ALL_OF = eINSTANCE.getSwaggerObjectClassDefinition_AllOf();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES = eINSTANCE.getSwaggerObjectClassDefinition_Properties();

		/**
		 * The meta object literal for the '<em><b>Additional Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES = eINSTANCE.getSwaggerObjectClassDefinition_AdditionalProperties();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSimpleObjectTypeImpl <em>Simple Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerSimpleObjectTypeImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerSimpleObjectType()
		 * @generated
		 */
		EClass SWAGGER_SIMPLE_OBJECT_TYPE = eINSTANCE.getSwaggerSimpleObjectType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SIMPLE_OBJECT_TYPE__REQUIRED = eINSTANCE.getSwaggerSimpleObjectType_Required();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SIMPLE_OBJECT_TYPE__FORMAT = eINSTANCE.getSwaggerSimpleObjectType_Format();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SIMPLE_OBJECT_TYPE__MINIMUM = eINSTANCE.getSwaggerSimpleObjectType_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SIMPLE_OBJECT_TYPE__MAXIMUM = eINSTANCE.getSwaggerSimpleObjectType_Maximum();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SIMPLE_OBJECT_TYPE__PATTERN = eINSTANCE.getSwaggerSimpleObjectType_Pattern();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SIMPLE_OBJECT_TYPE__EXAMPLE = eINSTANCE.getSwaggerSimpleObjectType_Example();

		/**
		 * The meta object literal for the '<em><b>Collection Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_SIMPLE_OBJECT_TYPE__COLLECTION_FORMAT = eINSTANCE.getSwaggerSimpleObjectType_CollectionFormat();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerXmlImpl <em>Xml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerXmlImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerXml()
		 * @generated
		 */
		EClass SWAGGER_XML = eINSTANCE.getSwaggerXml();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_XML__NAME = eINSTANCE.getSwaggerXml_Name();

		/**
		 * The meta object literal for the '<em><b>Wrapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_XML__WRAPPED = eINSTANCE.getSwaggerXml_Wrapped();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerEnumObjectTypeImpl <em>Enum Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerEnumObjectTypeImpl
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerEnumObjectType()
		 * @generated
		 */
		EClass SWAGGER_ENUM_OBJECT_TYPE = eINSTANCE.getSwaggerEnumObjectType();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWAGGER_ENUM_OBJECT_TYPE__ENUM = eINSTANCE.getSwaggerEnumObjectType_Enum();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType <em>Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerParameterType()
		 * @generated
		 */
		EEnum SWAGGER_PARAMETER_TYPE = eINSTANCE.getSwaggerParameterType();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerCollectionFormat <em>Collection Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerCollectionFormat
		 * @see org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerPackageImpl#getSwaggerCollectionFormat()
		 * @generated
		 */
		EEnum SWAGGER_COLLECTION_FORMAT = eINSTANCE.getSwaggerCollectionFormat();

	}

} //SwaggerPackage
