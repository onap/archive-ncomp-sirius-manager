
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

import org.openecomp.ncomp.sirius.manager.swagger.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwaggerFactoryImpl extends EFactoryImpl implements SwaggerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SwaggerFactory init() {
		try {
			SwaggerFactory theSwaggerFactory = (SwaggerFactory)EPackage.Registry.INSTANCE.getEFactory(SwaggerPackage.eNS_URI);
			if (theSwaggerFactory != null) {
				return theSwaggerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SwaggerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SwaggerPackage.SWAGGER_MODEL: return createSwaggerModel();
			case SwaggerPackage.SWAGGER_INFO: return createSwaggerInfo();
			case SwaggerPackage.SWAGGER_CONTACT: return createSwaggerContact();
			case SwaggerPackage.SWAGGER_LICENSE: return createSwaggerLicense();
			case SwaggerPackage.SWAGGER_TAG: return createSwaggerTag();
			case SwaggerPackage.SWAGGER_EXTERNAL_DOCUMENTATION: return createSwaggerExternalDocumentation();
			case SwaggerPackage.SWAGGER_PATH: return createSwaggerPath();
			case SwaggerPackage.SWAGGER_OPERATION: return createSwaggerOperation();
			case SwaggerPackage.SWAGGER_PARAMETER: return createSwaggerParameter();
			case SwaggerPackage.SWAGGER_RESPONSE: return createSwaggerResponse();
			case SwaggerPackage.SWAGGER_SECURITY_OBJECT: return createSwaggerSecurityObject();
			case SwaggerPackage.SWAGGER_SECURITY: return createSwaggerSecurity();
			case SwaggerPackage.SWAGGER_SECURITY_DEFINITION: return createSwaggerSecurityDefinition();
			case SwaggerPackage.SWAGGER_SECURITY_DEFINITION_SCOPE: return createSwaggerSecurityDefinitionScope();
			case SwaggerPackage.SWAGGER_OBJECT_TYPE: return createSwaggerObjectType();
			case SwaggerPackage.SWAGGER_REFERENCE_OBJECT_TYPE: return createSwaggerReferenceObjectType();
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE: return createSwaggerNamedObjectType();
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION: return createSwaggerObjectClassDefinition();
			case SwaggerPackage.SWAGGER_SIMPLE_OBJECT_TYPE: return createSwaggerSimpleObjectType();
			case SwaggerPackage.SWAGGER_XML: return createSwaggerXml();
			case SwaggerPackage.SWAGGER_ENUM_OBJECT_TYPE: return createSwaggerEnumObjectType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SwaggerPackage.SWAGGER_PARAMETER_TYPE:
				return createSwaggerParameterTypeFromString(eDataType, initialValue);
			case SwaggerPackage.SWAGGER_COLLECTION_FORMAT:
				return createSwaggerCollectionFormatFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SwaggerPackage.SWAGGER_PARAMETER_TYPE:
				return convertSwaggerParameterTypeToString(eDataType, instanceValue);
			case SwaggerPackage.SWAGGER_COLLECTION_FORMAT:
				return convertSwaggerCollectionFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerModel createSwaggerModel() {
		SwaggerModelImpl swaggerModel = new SwaggerModelImpl();
		return swaggerModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerInfo createSwaggerInfo() {
		SwaggerInfoImpl swaggerInfo = new SwaggerInfoImpl();
		return swaggerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerContact createSwaggerContact() {
		SwaggerContactImpl swaggerContact = new SwaggerContactImpl();
		return swaggerContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerLicense createSwaggerLicense() {
		SwaggerLicenseImpl swaggerLicense = new SwaggerLicenseImpl();
		return swaggerLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerTag createSwaggerTag() {
		SwaggerTagImpl swaggerTag = new SwaggerTagImpl();
		return swaggerTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerExternalDocumentation createSwaggerExternalDocumentation() {
		SwaggerExternalDocumentationImpl swaggerExternalDocumentation = new SwaggerExternalDocumentationImpl();
		return swaggerExternalDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerPath createSwaggerPath() {
		SwaggerPathImpl swaggerPath = new SwaggerPathImpl();
		return swaggerPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerOperation createSwaggerOperation() {
		SwaggerOperationImpl swaggerOperation = new SwaggerOperationImpl();
		return swaggerOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerParameter createSwaggerParameter() {
		SwaggerParameterImpl swaggerParameter = new SwaggerParameterImpl();
		return swaggerParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerResponse createSwaggerResponse() {
		SwaggerResponseImpl swaggerResponse = new SwaggerResponseImpl();
		return swaggerResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerSecurityObject createSwaggerSecurityObject() {
		SwaggerSecurityObjectImpl swaggerSecurityObject = new SwaggerSecurityObjectImpl();
		return swaggerSecurityObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerSecurity createSwaggerSecurity() {
		SwaggerSecurityImpl swaggerSecurity = new SwaggerSecurityImpl();
		return swaggerSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerSecurityDefinition createSwaggerSecurityDefinition() {
		SwaggerSecurityDefinitionImpl swaggerSecurityDefinition = new SwaggerSecurityDefinitionImpl();
		return swaggerSecurityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerSecurityDefinitionScope createSwaggerSecurityDefinitionScope() {
		SwaggerSecurityDefinitionScopeImpl swaggerSecurityDefinitionScope = new SwaggerSecurityDefinitionScopeImpl();
		return swaggerSecurityDefinitionScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerObjectType createSwaggerObjectType() {
		SwaggerObjectTypeImpl swaggerObjectType = new SwaggerObjectTypeImpl();
		return swaggerObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerReferenceObjectType createSwaggerReferenceObjectType() {
		SwaggerReferenceObjectTypeImpl swaggerReferenceObjectType = new SwaggerReferenceObjectTypeImpl();
		return swaggerReferenceObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerNamedObjectType createSwaggerNamedObjectType() {
		SwaggerNamedObjectTypeImpl swaggerNamedObjectType = new SwaggerNamedObjectTypeImpl();
		return swaggerNamedObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerObjectClassDefinition createSwaggerObjectClassDefinition() {
		SwaggerObjectClassDefinitionImpl swaggerObjectClassDefinition = new SwaggerObjectClassDefinitionImpl();
		return swaggerObjectClassDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerSimpleObjectType createSwaggerSimpleObjectType() {
		SwaggerSimpleObjectTypeImpl swaggerSimpleObjectType = new SwaggerSimpleObjectTypeImpl();
		return swaggerSimpleObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerXml createSwaggerXml() {
		SwaggerXmlImpl swaggerXml = new SwaggerXmlImpl();
		return swaggerXml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerEnumObjectType createSwaggerEnumObjectType() {
		SwaggerEnumObjectTypeImpl swaggerEnumObjectType = new SwaggerEnumObjectTypeImpl();
		return swaggerEnumObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerParameterType createSwaggerParameterTypeFromString(EDataType eDataType, String initialValue) {
		SwaggerParameterType result = SwaggerParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwaggerParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerCollectionFormat createSwaggerCollectionFormatFromString(EDataType eDataType, String initialValue) {
		SwaggerCollectionFormat result = SwaggerCollectionFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSwaggerCollectionFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerPackage getSwaggerPackage() {
		return (SwaggerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SwaggerPackage getPackage() {
		return SwaggerPackage.eINSTANCE;
	}

} //SwaggerFactoryImpl
