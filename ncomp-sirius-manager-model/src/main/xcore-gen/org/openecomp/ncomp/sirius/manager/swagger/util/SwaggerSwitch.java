
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
package org.openecomp.ncomp.sirius.manager.swagger.util;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.sirius.manager.swagger.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage
 * @generated
 */
public class SwaggerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SwaggerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerSwitch() {
		if (modelPackage == null) {
			modelPackage = SwaggerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SwaggerPackage.SWAGGER_MODEL: {
				SwaggerModel swaggerModel = (SwaggerModel)theEObject;
				T result = caseSwaggerModel(swaggerModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_INFO: {
				SwaggerInfo swaggerInfo = (SwaggerInfo)theEObject;
				T result = caseSwaggerInfo(swaggerInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_CONTACT: {
				SwaggerContact swaggerContact = (SwaggerContact)theEObject;
				T result = caseSwaggerContact(swaggerContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_LICENSE: {
				SwaggerLicense swaggerLicense = (SwaggerLicense)theEObject;
				T result = caseSwaggerLicense(swaggerLicense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_TAG: {
				SwaggerTag swaggerTag = (SwaggerTag)theEObject;
				T result = caseSwaggerTag(swaggerTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_EXTERNAL_DOCUMENTATION: {
				SwaggerExternalDocumentation swaggerExternalDocumentation = (SwaggerExternalDocumentation)theEObject;
				T result = caseSwaggerExternalDocumentation(swaggerExternalDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_PATH: {
				SwaggerPath swaggerPath = (SwaggerPath)theEObject;
				T result = caseSwaggerPath(swaggerPath);
				if (result == null) result = caseNamedEntity(swaggerPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_OPERATION: {
				SwaggerOperation swaggerOperation = (SwaggerOperation)theEObject;
				T result = caseSwaggerOperation(swaggerOperation);
				if (result == null) result = caseNamedEntity(swaggerOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_PARAMETER: {
				SwaggerParameter swaggerParameter = (SwaggerParameter)theEObject;
				T result = caseSwaggerParameter(swaggerParameter);
				if (result == null) result = caseNamedEntity(swaggerParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_RESPONSE: {
				SwaggerResponse swaggerResponse = (SwaggerResponse)theEObject;
				T result = caseSwaggerResponse(swaggerResponse);
				if (result == null) result = caseNamedEntity(swaggerResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_SECURITY_OBJECT: {
				SwaggerSecurityObject swaggerSecurityObject = (SwaggerSecurityObject)theEObject;
				T result = caseSwaggerSecurityObject(swaggerSecurityObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_SECURITY: {
				SwaggerSecurity swaggerSecurity = (SwaggerSecurity)theEObject;
				T result = caseSwaggerSecurity(swaggerSecurity);
				if (result == null) result = caseNamedEntity(swaggerSecurity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_SECURITY_DEFINITION: {
				SwaggerSecurityDefinition swaggerSecurityDefinition = (SwaggerSecurityDefinition)theEObject;
				T result = caseSwaggerSecurityDefinition(swaggerSecurityDefinition);
				if (result == null) result = caseNamedEntity(swaggerSecurityDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_SECURITY_DEFINITION_SCOPE: {
				SwaggerSecurityDefinitionScope swaggerSecurityDefinitionScope = (SwaggerSecurityDefinitionScope)theEObject;
				T result = caseSwaggerSecurityDefinitionScope(swaggerSecurityDefinitionScope);
				if (result == null) result = caseNamedEntity(swaggerSecurityDefinitionScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_OBJECT_TYPE: {
				SwaggerObjectType swaggerObjectType = (SwaggerObjectType)theEObject;
				T result = caseSwaggerObjectType(swaggerObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_REFERENCE_OBJECT_TYPE: {
				SwaggerReferenceObjectType swaggerReferenceObjectType = (SwaggerReferenceObjectType)theEObject;
				T result = caseSwaggerReferenceObjectType(swaggerReferenceObjectType);
				if (result == null) result = caseSwaggerNamedObjectType(swaggerReferenceObjectType);
				if (result == null) result = caseNamedEntity(swaggerReferenceObjectType);
				if (result == null) result = caseSwaggerObjectType(swaggerReferenceObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE: {
				SwaggerNamedObjectType swaggerNamedObjectType = (SwaggerNamedObjectType)theEObject;
				T result = caseSwaggerNamedObjectType(swaggerNamedObjectType);
				if (result == null) result = caseNamedEntity(swaggerNamedObjectType);
				if (result == null) result = caseSwaggerObjectType(swaggerNamedObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION: {
				SwaggerObjectClassDefinition swaggerObjectClassDefinition = (SwaggerObjectClassDefinition)theEObject;
				T result = caseSwaggerObjectClassDefinition(swaggerObjectClassDefinition);
				if (result == null) result = caseSwaggerNamedObjectType(swaggerObjectClassDefinition);
				if (result == null) result = caseNamedEntity(swaggerObjectClassDefinition);
				if (result == null) result = caseSwaggerObjectType(swaggerObjectClassDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_SIMPLE_OBJECT_TYPE: {
				SwaggerSimpleObjectType swaggerSimpleObjectType = (SwaggerSimpleObjectType)theEObject;
				T result = caseSwaggerSimpleObjectType(swaggerSimpleObjectType);
				if (result == null) result = caseSwaggerNamedObjectType(swaggerSimpleObjectType);
				if (result == null) result = caseNamedEntity(swaggerSimpleObjectType);
				if (result == null) result = caseSwaggerObjectType(swaggerSimpleObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_XML: {
				SwaggerXml swaggerXml = (SwaggerXml)theEObject;
				T result = caseSwaggerXml(swaggerXml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SwaggerPackage.SWAGGER_ENUM_OBJECT_TYPE: {
				SwaggerEnumObjectType swaggerEnumObjectType = (SwaggerEnumObjectType)theEObject;
				T result = caseSwaggerEnumObjectType(swaggerEnumObjectType);
				if (result == null) result = caseSwaggerSimpleObjectType(swaggerEnumObjectType);
				if (result == null) result = caseSwaggerNamedObjectType(swaggerEnumObjectType);
				if (result == null) result = caseNamedEntity(swaggerEnumObjectType);
				if (result == null) result = caseSwaggerObjectType(swaggerEnumObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerModel(SwaggerModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerInfo(SwaggerInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerContact(SwaggerContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerLicense(SwaggerLicense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerTag(SwaggerTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerExternalDocumentation(SwaggerExternalDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerPath(SwaggerPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerOperation(SwaggerOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerParameter(SwaggerParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerResponse(SwaggerResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerSecurityObject(SwaggerSecurityObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerSecurity(SwaggerSecurity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerSecurityDefinition(SwaggerSecurityDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Definition Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Definition Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerSecurityDefinitionScope(SwaggerSecurityDefinitionScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerObjectType(SwaggerObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerReferenceObjectType(SwaggerReferenceObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerNamedObjectType(SwaggerNamedObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Class Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Class Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerObjectClassDefinition(SwaggerObjectClassDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerSimpleObjectType(SwaggerSimpleObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerXml(SwaggerXml object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwaggerEnumObjectType(SwaggerEnumObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SwaggerSwitch
