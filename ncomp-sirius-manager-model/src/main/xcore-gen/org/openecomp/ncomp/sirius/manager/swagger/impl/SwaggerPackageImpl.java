
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
package org.openecomp.ncomp.sirius.manager.swagger.impl;

import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerCollectionFormat;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerContact;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerEnumObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerFactory;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurity;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinitionScope;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityObject;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwaggerPackageImpl extends EPackageImpl implements SwaggerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerLicenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerExternalDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerSecurityObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerSecurityDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerSecurityDefinitionScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerReferenceObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerNamedObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerObjectClassDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerSimpleObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerXmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swaggerEnumObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum swaggerParameterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum swaggerCollectionFormatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SwaggerPackageImpl() {
		super(eNS_URI, SwaggerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SwaggerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SwaggerPackage init() {
		if (isInited) return (SwaggerPackage)EPackage.Registry.INSTANCE.getEPackage(SwaggerPackage.eNS_URI);

		// Obtain or create and register package
		SwaggerPackageImpl theSwaggerPackage = (SwaggerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SwaggerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SwaggerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSwaggerPackage.createPackageContents();

		// Initialize created meta-data
		theSwaggerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSwaggerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SwaggerPackage.eNS_URI, theSwaggerPackage);
		return theSwaggerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerModel() {
		return swaggerModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerModel_Swagger() {
		return (EAttribute)swaggerModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerModel_Info() {
		return (EReference)swaggerModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerModel_Host() {
		return (EAttribute)swaggerModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerModel_BasePath() {
		return (EAttribute)swaggerModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerModel_Tags() {
		return (EReference)swaggerModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerModel_Schemes() {
		return (EAttribute)swaggerModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerModel_Paths() {
		return (EReference)swaggerModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerModel_Definitions() {
		return (EReference)swaggerModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerModel_ExternalDocs() {
		return (EReference)swaggerModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerModel_SecurityDefinitions() {
		return (EReference)swaggerModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerInfo() {
		return swaggerInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerInfo_Description() {
		return (EAttribute)swaggerInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerInfo_Version() {
		return (EAttribute)swaggerInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerInfo_Title() {
		return (EAttribute)swaggerInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerInfo_TermsOfService() {
		return (EAttribute)swaggerInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerInfo_Contact() {
		return (EReference)swaggerInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerInfo_License() {
		return (EReference)swaggerInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerContact() {
		return swaggerContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerContact_Email() {
		return (EAttribute)swaggerContactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerLicense() {
		return swaggerLicenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerLicense_Name() {
		return (EAttribute)swaggerLicenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerLicense_Url() {
		return (EAttribute)swaggerLicenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerTag() {
		return swaggerTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerTag_Name() {
		return (EAttribute)swaggerTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerTag_Description() {
		return (EAttribute)swaggerTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerTag_ExternalDocs() {
		return (EReference)swaggerTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerExternalDocumentation() {
		return swaggerExternalDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerExternalDocumentation_Description() {
		return (EAttribute)swaggerExternalDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerExternalDocumentation_Url() {
		return (EAttribute)swaggerExternalDocumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerPath() {
		return swaggerPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerPath_Methods() {
		return (EReference)swaggerPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerOperation() {
		return swaggerOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerOperation_Tags() {
		return (EAttribute)swaggerOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerOperation_Summary() {
		return (EAttribute)swaggerOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerOperation_Description() {
		return (EAttribute)swaggerOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerOperation_OperationId() {
		return (EAttribute)swaggerOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerOperation_Consumes() {
		return (EAttribute)swaggerOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerOperation_Produces() {
		return (EAttribute)swaggerOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerOperation_Parameters() {
		return (EReference)swaggerOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerOperation_Responses() {
		return (EReference)swaggerOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerOperation_Security() {
		return (EReference)swaggerOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerOperation_Deprecated() {
		return (EAttribute)swaggerOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerParameter() {
		return swaggerParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerParameter_In() {
		return (EAttribute)swaggerParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerParameter_Type() {
		return (EReference)swaggerParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerResponse() {
		return swaggerResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerResponse_Description() {
		return (EAttribute)swaggerResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerResponse_Schema() {
		return (EReference)swaggerResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerResponse_Headers() {
		return (EReference)swaggerResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerSecurityObject() {
		return swaggerSecurityObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerSecurityObject_List() {
		return (EReference)swaggerSecurityObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerSecurity() {
		return swaggerSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSecurity_Roles() {
		return (EAttribute)swaggerSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerSecurityDefinition() {
		return swaggerSecurityDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSecurityDefinition_Type() {
		return (EAttribute)swaggerSecurityDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSecurityDefinition_AuthorizationUrl() {
		return (EAttribute)swaggerSecurityDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSecurityDefinition_Flow() {
		return (EAttribute)swaggerSecurityDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSecurityDefinition_In() {
		return (EAttribute)swaggerSecurityDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerSecurityDefinitionScope() {
		return swaggerSecurityDefinitionScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSecurityDefinitionScope_Description() {
		return (EAttribute)swaggerSecurityDefinitionScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerObjectType() {
		return swaggerObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerObjectType_Many() {
		return (EAttribute)swaggerObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerReferenceObjectType() {
		return swaggerReferenceObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerReferenceObjectType_Required() {
		return (EAttribute)swaggerReferenceObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerReferenceObjectType_Reference() {
		return (EReference)swaggerReferenceObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerNamedObjectType() {
		return swaggerNamedObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerNamedObjectType_Type() {
		return (EAttribute)swaggerNamedObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerNamedObjectType_Default() {
		return (EAttribute)swaggerNamedObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerNamedObjectType_Description() {
		return (EAttribute)swaggerNamedObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerNamedObjectType_Xml() {
		return (EReference)swaggerNamedObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerObjectClassDefinition() {
		return swaggerObjectClassDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerObjectClassDefinition_Required() {
		return (EAttribute)swaggerObjectClassDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerObjectClassDefinition_AllOf() {
		return (EReference)swaggerObjectClassDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerObjectClassDefinition_Properties() {
		return (EReference)swaggerObjectClassDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwaggerObjectClassDefinition_AdditionalProperties() {
		return (EReference)swaggerObjectClassDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerSimpleObjectType() {
		return swaggerSimpleObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSimpleObjectType_Required() {
		return (EAttribute)swaggerSimpleObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSimpleObjectType_Format() {
		return (EAttribute)swaggerSimpleObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSimpleObjectType_Minimum() {
		return (EAttribute)swaggerSimpleObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSimpleObjectType_Maximum() {
		return (EAttribute)swaggerSimpleObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSimpleObjectType_Pattern() {
		return (EAttribute)swaggerSimpleObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSimpleObjectType_Example() {
		return (EAttribute)swaggerSimpleObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerSimpleObjectType_CollectionFormat() {
		return (EAttribute)swaggerSimpleObjectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerXml() {
		return swaggerXmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerXml_Name() {
		return (EAttribute)swaggerXmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerXml_Wrapped() {
		return (EAttribute)swaggerXmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwaggerEnumObjectType() {
		return swaggerEnumObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwaggerEnumObjectType_Enum() {
		return (EAttribute)swaggerEnumObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSwaggerParameterType() {
		return swaggerParameterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSwaggerCollectionFormat() {
		return swaggerCollectionFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerFactory getSwaggerFactory() {
		return (SwaggerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		swaggerModelEClass = createEClass(SWAGGER_MODEL);
		createEAttribute(swaggerModelEClass, SWAGGER_MODEL__SWAGGER);
		createEReference(swaggerModelEClass, SWAGGER_MODEL__INFO);
		createEAttribute(swaggerModelEClass, SWAGGER_MODEL__HOST);
		createEAttribute(swaggerModelEClass, SWAGGER_MODEL__BASE_PATH);
		createEReference(swaggerModelEClass, SWAGGER_MODEL__TAGS);
		createEAttribute(swaggerModelEClass, SWAGGER_MODEL__SCHEMES);
		createEReference(swaggerModelEClass, SWAGGER_MODEL__PATHS);
		createEReference(swaggerModelEClass, SWAGGER_MODEL__DEFINITIONS);
		createEReference(swaggerModelEClass, SWAGGER_MODEL__EXTERNAL_DOCS);
		createEReference(swaggerModelEClass, SWAGGER_MODEL__SECURITY_DEFINITIONS);

		swaggerInfoEClass = createEClass(SWAGGER_INFO);
		createEAttribute(swaggerInfoEClass, SWAGGER_INFO__DESCRIPTION);
		createEAttribute(swaggerInfoEClass, SWAGGER_INFO__VERSION);
		createEAttribute(swaggerInfoEClass, SWAGGER_INFO__TITLE);
		createEAttribute(swaggerInfoEClass, SWAGGER_INFO__TERMS_OF_SERVICE);
		createEReference(swaggerInfoEClass, SWAGGER_INFO__CONTACT);
		createEReference(swaggerInfoEClass, SWAGGER_INFO__LICENSE);

		swaggerContactEClass = createEClass(SWAGGER_CONTACT);
		createEAttribute(swaggerContactEClass, SWAGGER_CONTACT__EMAIL);

		swaggerLicenseEClass = createEClass(SWAGGER_LICENSE);
		createEAttribute(swaggerLicenseEClass, SWAGGER_LICENSE__NAME);
		createEAttribute(swaggerLicenseEClass, SWAGGER_LICENSE__URL);

		swaggerTagEClass = createEClass(SWAGGER_TAG);
		createEAttribute(swaggerTagEClass, SWAGGER_TAG__NAME);
		createEAttribute(swaggerTagEClass, SWAGGER_TAG__DESCRIPTION);
		createEReference(swaggerTagEClass, SWAGGER_TAG__EXTERNAL_DOCS);

		swaggerExternalDocumentationEClass = createEClass(SWAGGER_EXTERNAL_DOCUMENTATION);
		createEAttribute(swaggerExternalDocumentationEClass, SWAGGER_EXTERNAL_DOCUMENTATION__DESCRIPTION);
		createEAttribute(swaggerExternalDocumentationEClass, SWAGGER_EXTERNAL_DOCUMENTATION__URL);

		swaggerPathEClass = createEClass(SWAGGER_PATH);
		createEReference(swaggerPathEClass, SWAGGER_PATH__METHODS);

		swaggerOperationEClass = createEClass(SWAGGER_OPERATION);
		createEAttribute(swaggerOperationEClass, SWAGGER_OPERATION__TAGS);
		createEAttribute(swaggerOperationEClass, SWAGGER_OPERATION__SUMMARY);
		createEAttribute(swaggerOperationEClass, SWAGGER_OPERATION__DESCRIPTION);
		createEAttribute(swaggerOperationEClass, SWAGGER_OPERATION__OPERATION_ID);
		createEAttribute(swaggerOperationEClass, SWAGGER_OPERATION__CONSUMES);
		createEAttribute(swaggerOperationEClass, SWAGGER_OPERATION__PRODUCES);
		createEReference(swaggerOperationEClass, SWAGGER_OPERATION__PARAMETERS);
		createEReference(swaggerOperationEClass, SWAGGER_OPERATION__RESPONSES);
		createEReference(swaggerOperationEClass, SWAGGER_OPERATION__SECURITY);
		createEAttribute(swaggerOperationEClass, SWAGGER_OPERATION__DEPRECATED);

		swaggerParameterEClass = createEClass(SWAGGER_PARAMETER);
		createEAttribute(swaggerParameterEClass, SWAGGER_PARAMETER__IN);
		createEReference(swaggerParameterEClass, SWAGGER_PARAMETER__TYPE);

		swaggerResponseEClass = createEClass(SWAGGER_RESPONSE);
		createEAttribute(swaggerResponseEClass, SWAGGER_RESPONSE__DESCRIPTION);
		createEReference(swaggerResponseEClass, SWAGGER_RESPONSE__SCHEMA);
		createEReference(swaggerResponseEClass, SWAGGER_RESPONSE__HEADERS);

		swaggerSecurityObjectEClass = createEClass(SWAGGER_SECURITY_OBJECT);
		createEReference(swaggerSecurityObjectEClass, SWAGGER_SECURITY_OBJECT__LIST);

		swaggerSecurityEClass = createEClass(SWAGGER_SECURITY);
		createEAttribute(swaggerSecurityEClass, SWAGGER_SECURITY__ROLES);

		swaggerSecurityDefinitionEClass = createEClass(SWAGGER_SECURITY_DEFINITION);
		createEAttribute(swaggerSecurityDefinitionEClass, SWAGGER_SECURITY_DEFINITION__TYPE);
		createEAttribute(swaggerSecurityDefinitionEClass, SWAGGER_SECURITY_DEFINITION__AUTHORIZATION_URL);
		createEAttribute(swaggerSecurityDefinitionEClass, SWAGGER_SECURITY_DEFINITION__FLOW);
		createEAttribute(swaggerSecurityDefinitionEClass, SWAGGER_SECURITY_DEFINITION__IN);

		swaggerSecurityDefinitionScopeEClass = createEClass(SWAGGER_SECURITY_DEFINITION_SCOPE);
		createEAttribute(swaggerSecurityDefinitionScopeEClass, SWAGGER_SECURITY_DEFINITION_SCOPE__DESCRIPTION);

		swaggerObjectTypeEClass = createEClass(SWAGGER_OBJECT_TYPE);
		createEAttribute(swaggerObjectTypeEClass, SWAGGER_OBJECT_TYPE__MANY);

		swaggerReferenceObjectTypeEClass = createEClass(SWAGGER_REFERENCE_OBJECT_TYPE);
		createEAttribute(swaggerReferenceObjectTypeEClass, SWAGGER_REFERENCE_OBJECT_TYPE__REQUIRED);
		createEReference(swaggerReferenceObjectTypeEClass, SWAGGER_REFERENCE_OBJECT_TYPE__REFERENCE);

		swaggerNamedObjectTypeEClass = createEClass(SWAGGER_NAMED_OBJECT_TYPE);
		createEAttribute(swaggerNamedObjectTypeEClass, SWAGGER_NAMED_OBJECT_TYPE__TYPE);
		createEAttribute(swaggerNamedObjectTypeEClass, SWAGGER_NAMED_OBJECT_TYPE__DEFAULT);
		createEAttribute(swaggerNamedObjectTypeEClass, SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION);
		createEReference(swaggerNamedObjectTypeEClass, SWAGGER_NAMED_OBJECT_TYPE__XML);

		swaggerObjectClassDefinitionEClass = createEClass(SWAGGER_OBJECT_CLASS_DEFINITION);
		createEAttribute(swaggerObjectClassDefinitionEClass, SWAGGER_OBJECT_CLASS_DEFINITION__REQUIRED);
		createEReference(swaggerObjectClassDefinitionEClass, SWAGGER_OBJECT_CLASS_DEFINITION__ALL_OF);
		createEReference(swaggerObjectClassDefinitionEClass, SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES);
		createEReference(swaggerObjectClassDefinitionEClass, SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES);

		swaggerSimpleObjectTypeEClass = createEClass(SWAGGER_SIMPLE_OBJECT_TYPE);
		createEAttribute(swaggerSimpleObjectTypeEClass, SWAGGER_SIMPLE_OBJECT_TYPE__REQUIRED);
		createEAttribute(swaggerSimpleObjectTypeEClass, SWAGGER_SIMPLE_OBJECT_TYPE__FORMAT);
		createEAttribute(swaggerSimpleObjectTypeEClass, SWAGGER_SIMPLE_OBJECT_TYPE__MINIMUM);
		createEAttribute(swaggerSimpleObjectTypeEClass, SWAGGER_SIMPLE_OBJECT_TYPE__MAXIMUM);
		createEAttribute(swaggerSimpleObjectTypeEClass, SWAGGER_SIMPLE_OBJECT_TYPE__PATTERN);
		createEAttribute(swaggerSimpleObjectTypeEClass, SWAGGER_SIMPLE_OBJECT_TYPE__EXAMPLE);
		createEAttribute(swaggerSimpleObjectTypeEClass, SWAGGER_SIMPLE_OBJECT_TYPE__COLLECTION_FORMAT);

		swaggerXmlEClass = createEClass(SWAGGER_XML);
		createEAttribute(swaggerXmlEClass, SWAGGER_XML__NAME);
		createEAttribute(swaggerXmlEClass, SWAGGER_XML__WRAPPED);

		swaggerEnumObjectTypeEClass = createEClass(SWAGGER_ENUM_OBJECT_TYPE);
		createEAttribute(swaggerEnumObjectTypeEClass, SWAGGER_ENUM_OBJECT_TYPE__ENUM);

		// Create enums
		swaggerParameterTypeEEnum = createEEnum(SWAGGER_PARAMETER_TYPE);
		swaggerCollectionFormatEEnum = createEEnum(SWAGGER_COLLECTION_FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		swaggerPathEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		swaggerOperationEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		swaggerParameterEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		swaggerResponseEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		swaggerSecurityEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		swaggerSecurityDefinitionEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		swaggerSecurityDefinitionScopeEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		swaggerReferenceObjectTypeEClass.getESuperTypes().add(this.getSwaggerNamedObjectType());
		swaggerNamedObjectTypeEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		swaggerNamedObjectTypeEClass.getESuperTypes().add(this.getSwaggerObjectType());
		swaggerObjectClassDefinitionEClass.getESuperTypes().add(this.getSwaggerNamedObjectType());
		swaggerSimpleObjectTypeEClass.getESuperTypes().add(this.getSwaggerNamedObjectType());
		swaggerEnumObjectTypeEClass.getESuperTypes().add(this.getSwaggerSimpleObjectType());

		// Initialize classes, features, and operations; add parameters
		initEClass(swaggerModelEClass, SwaggerModel.class, "SwaggerModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerModel_Swagger(), theEcorePackage.getEString(), "swagger", "2.0", 0, 1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerModel_Info(), this.getSwaggerInfo(), null, "info", null, 0, 1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerModel_Host(), theEcorePackage.getEString(), "host", null, 0, 1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerModel_BasePath(), theEcorePackage.getEString(), "basePath", null, 0, 1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerModel_Tags(), this.getSwaggerTag(), null, "tags", null, 0, -1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerModel_Schemes(), theEcorePackage.getEString(), "schemes", null, 0, -1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerModel_Paths(), this.getSwaggerPath(), null, "paths", null, 0, -1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerModel_Definitions(), this.getSwaggerNamedObjectType(), null, "definitions", null, 0, -1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerModel_ExternalDocs(), this.getSwaggerExternalDocumentation(), null, "externalDocs", null, 0, 1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerModel_SecurityDefinitions(), this.getSwaggerSecurityDefinition(), null, "securityDefinitions", null, 0, -1, SwaggerModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerInfoEClass, SwaggerInfo.class, "SwaggerInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerInfo_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SwaggerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerInfo_Version(), theEcorePackage.getEString(), "version", null, 0, 1, SwaggerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerInfo_Title(), theEcorePackage.getEString(), "title", null, 0, 1, SwaggerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerInfo_TermsOfService(), theEcorePackage.getEString(), "termsOfService", null, 0, 1, SwaggerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerInfo_Contact(), this.getSwaggerContact(), null, "contact", null, 0, 1, SwaggerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerInfo_License(), this.getSwaggerLicense(), null, "license", null, 0, 1, SwaggerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerContactEClass, SwaggerContact.class, "SwaggerContact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerContact_Email(), theEcorePackage.getEString(), "email", null, 0, 1, SwaggerContact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerLicenseEClass, SwaggerLicense.class, "SwaggerLicense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerLicense_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SwaggerLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerLicense_Url(), theEcorePackage.getEString(), "url", null, 0, 1, SwaggerLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerTagEClass, SwaggerTag.class, "SwaggerTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerTag_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SwaggerTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerTag_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SwaggerTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerTag_ExternalDocs(), this.getSwaggerExternalDocumentation(), null, "externalDocs", null, 0, 1, SwaggerTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerExternalDocumentationEClass, SwaggerExternalDocumentation.class, "SwaggerExternalDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerExternalDocumentation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SwaggerExternalDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerExternalDocumentation_Url(), theEcorePackage.getEString(), "url", null, 0, 1, SwaggerExternalDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerPathEClass, SwaggerPath.class, "SwaggerPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwaggerPath_Methods(), this.getSwaggerOperation(), null, "methods", null, 0, -1, SwaggerPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerOperationEClass, SwaggerOperation.class, "SwaggerOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerOperation_Tags(), theEcorePackage.getEString(), "tags", null, 0, -1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerOperation_Summary(), theEcorePackage.getEString(), "summary", null, 0, 1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerOperation_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerOperation_OperationId(), theEcorePackage.getEString(), "operationId", null, 0, 1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerOperation_Consumes(), theEcorePackage.getEString(), "consumes", null, 0, -1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerOperation_Produces(), theEcorePackage.getEString(), "produces", null, 0, -1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerOperation_Parameters(), this.getSwaggerParameter(), null, "parameters", null, 0, -1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerOperation_Responses(), this.getSwaggerResponse(), null, "responses", null, 0, -1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerOperation_Security(), this.getSwaggerSecurityObject(), null, "security", null, 0, -1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerOperation_Deprecated(), theEcorePackage.getEBoolean(), "deprecated", "false", 0, 1, SwaggerOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerParameterEClass, SwaggerParameter.class, "SwaggerParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerParameter_In(), this.getSwaggerParameterType(), "in", null, 0, 1, SwaggerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerParameter_Type(), this.getSwaggerObjectType(), null, "type", null, 0, 1, SwaggerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerResponseEClass, SwaggerResponse.class, "SwaggerResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerResponse_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SwaggerResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerResponse_Schema(), this.getSwaggerObjectType(), null, "schema", null, 0, 1, SwaggerResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerResponse_Headers(), this.getSwaggerSimpleObjectType(), null, "headers", null, 0, -1, SwaggerResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerSecurityObjectEClass, SwaggerSecurityObject.class, "SwaggerSecurityObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwaggerSecurityObject_List(), this.getSwaggerSecurity(), null, "list", null, 0, -1, SwaggerSecurityObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerSecurityEClass, SwaggerSecurity.class, "SwaggerSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerSecurity_Roles(), theEcorePackage.getEString(), "roles", null, 0, -1, SwaggerSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerSecurityDefinitionEClass, SwaggerSecurityDefinition.class, "SwaggerSecurityDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerSecurityDefinition_Type(), theEcorePackage.getEString(), "type", null, 0, 1, SwaggerSecurityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSecurityDefinition_AuthorizationUrl(), theEcorePackage.getEString(), "authorizationUrl", null, 0, 1, SwaggerSecurityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSecurityDefinition_Flow(), theEcorePackage.getEString(), "flow", null, 0, 1, SwaggerSecurityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSecurityDefinition_In(), this.getSwaggerParameterType(), "in", null, 0, 1, SwaggerSecurityDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerSecurityDefinitionScopeEClass, SwaggerSecurityDefinitionScope.class, "SwaggerSecurityDefinitionScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerSecurityDefinitionScope_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SwaggerSecurityDefinitionScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerObjectTypeEClass, SwaggerObjectType.class, "SwaggerObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerObjectType_Many(), theEcorePackage.getEBoolean(), "many", "false", 0, 1, SwaggerObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerReferenceObjectTypeEClass, SwaggerReferenceObjectType.class, "SwaggerReferenceObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerReferenceObjectType_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, SwaggerReferenceObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerReferenceObjectType_Reference(), this.getSwaggerObjectType(), null, "reference", null, 0, 1, SwaggerReferenceObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerNamedObjectTypeEClass, SwaggerNamedObjectType.class, "SwaggerNamedObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerNamedObjectType_Type(), theEcorePackage.getEString(), "type", null, 0, 1, SwaggerNamedObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerNamedObjectType_Default(), theEcorePackage.getEString(), "default", null, 0, 1, SwaggerNamedObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerNamedObjectType_Description(), theEcorePackage.getEString(), "description", null, 0, 1, SwaggerNamedObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerNamedObjectType_Xml(), this.getSwaggerXml(), null, "xml", null, 0, 1, SwaggerNamedObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerObjectClassDefinitionEClass, SwaggerObjectClassDefinition.class, "SwaggerObjectClassDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerObjectClassDefinition_Required(), theEcorePackage.getEString(), "required", null, 0, -1, SwaggerObjectClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerObjectClassDefinition_AllOf(), this.getSwaggerObjectType(), null, "allOf", null, 0, -1, SwaggerObjectClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerObjectClassDefinition_Properties(), this.getSwaggerNamedObjectType(), null, "properties", null, 0, -1, SwaggerObjectClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwaggerObjectClassDefinition_AdditionalProperties(), this.getSwaggerObjectType(), null, "additionalProperties", null, 0, 1, SwaggerObjectClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerSimpleObjectTypeEClass, SwaggerSimpleObjectType.class, "SwaggerSimpleObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerSimpleObjectType_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, SwaggerSimpleObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSimpleObjectType_Format(), theEcorePackage.getEString(), "format", null, 0, 1, SwaggerSimpleObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSimpleObjectType_Minimum(), theEcorePackage.getEString(), "minimum", null, 0, 1, SwaggerSimpleObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSimpleObjectType_Maximum(), theEcorePackage.getEString(), "maximum", null, 0, 1, SwaggerSimpleObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSimpleObjectType_Pattern(), theEcorePackage.getEString(), "pattern", null, 0, 1, SwaggerSimpleObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSimpleObjectType_Example(), theEcorePackage.getEString(), "example", null, 0, 1, SwaggerSimpleObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerSimpleObjectType_CollectionFormat(), this.getSwaggerCollectionFormat(), "collectionFormat", null, 0, 1, SwaggerSimpleObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerXmlEClass, SwaggerXml.class, "SwaggerXml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerXml_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SwaggerXml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwaggerXml_Wrapped(), theEcorePackage.getEBoolean(), "wrapped", "false", 0, 1, SwaggerXml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(swaggerEnumObjectTypeEClass, SwaggerEnumObjectType.class, "SwaggerEnumObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwaggerEnumObjectType_Enum(), theEcorePackage.getEString(), "enum", null, 0, -1, SwaggerEnumObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(swaggerParameterTypeEEnum, SwaggerParameterType.class, "SwaggerParameterType");
		addEEnumLiteral(swaggerParameterTypeEEnum, SwaggerParameterType.PATH);
		addEEnumLiteral(swaggerParameterTypeEEnum, SwaggerParameterType.QUERY);
		addEEnumLiteral(swaggerParameterTypeEEnum, SwaggerParameterType.HEADER);
		addEEnumLiteral(swaggerParameterTypeEEnum, SwaggerParameterType.BODY);
		addEEnumLiteral(swaggerParameterTypeEEnum, SwaggerParameterType.FORM);
		addEEnumLiteral(swaggerParameterTypeEEnum, SwaggerParameterType.FORM_DATA);

		initEEnum(swaggerCollectionFormatEEnum, SwaggerCollectionFormat.class, "SwaggerCollectionFormat");
		addEEnumLiteral(swaggerCollectionFormatEEnum, SwaggerCollectionFormat.CSV);
		addEEnumLiteral(swaggerCollectionFormatEEnum, SwaggerCollectionFormat.SSV);
		addEEnumLiteral(swaggerCollectionFormatEEnum, SwaggerCollectionFormat.TSV);
		addEEnumLiteral(swaggerCollectionFormatEEnum, SwaggerCollectionFormat.PIPES);
		addEEnumLiteral(swaggerCollectionFormatEEnum, SwaggerCollectionFormat.MULTI);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org/ncomp/swagger
		createSwaggerAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "swagger", "http://openecomp.org/ncomp/swagger"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org/ncomp/swagger</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSwaggerAnnotations() {
		String source = "http://openecomp.org/ncomp/swagger";	
		addAnnotation
		  (getSwaggerReferenceObjectType_Required(), 
		   source, 
		   new String[] {
			 "name", "$ref"
		   });
	}

} //SwaggerPackageImpl
