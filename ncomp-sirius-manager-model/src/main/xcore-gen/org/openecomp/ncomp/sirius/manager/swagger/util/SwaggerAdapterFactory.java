
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage
 * @generated
 */
public class SwaggerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SwaggerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SwaggerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwaggerSwitch<Adapter> modelSwitch =
		new SwaggerSwitch<Adapter>() {
			@Override
			public Adapter caseSwaggerModel(SwaggerModel object) {
				return createSwaggerModelAdapter();
			}
			@Override
			public Adapter caseSwaggerInfo(SwaggerInfo object) {
				return createSwaggerInfoAdapter();
			}
			@Override
			public Adapter caseSwaggerContact(SwaggerContact object) {
				return createSwaggerContactAdapter();
			}
			@Override
			public Adapter caseSwaggerLicense(SwaggerLicense object) {
				return createSwaggerLicenseAdapter();
			}
			@Override
			public Adapter caseSwaggerTag(SwaggerTag object) {
				return createSwaggerTagAdapter();
			}
			@Override
			public Adapter caseSwaggerExternalDocumentation(SwaggerExternalDocumentation object) {
				return createSwaggerExternalDocumentationAdapter();
			}
			@Override
			public Adapter caseSwaggerPath(SwaggerPath object) {
				return createSwaggerPathAdapter();
			}
			@Override
			public Adapter caseSwaggerOperation(SwaggerOperation object) {
				return createSwaggerOperationAdapter();
			}
			@Override
			public Adapter caseSwaggerParameter(SwaggerParameter object) {
				return createSwaggerParameterAdapter();
			}
			@Override
			public Adapter caseSwaggerResponse(SwaggerResponse object) {
				return createSwaggerResponseAdapter();
			}
			@Override
			public Adapter caseSwaggerSecurityObject(SwaggerSecurityObject object) {
				return createSwaggerSecurityObjectAdapter();
			}
			@Override
			public Adapter caseSwaggerSecurity(SwaggerSecurity object) {
				return createSwaggerSecurityAdapter();
			}
			@Override
			public Adapter caseSwaggerSecurityDefinition(SwaggerSecurityDefinition object) {
				return createSwaggerSecurityDefinitionAdapter();
			}
			@Override
			public Adapter caseSwaggerSecurityDefinitionScope(SwaggerSecurityDefinitionScope object) {
				return createSwaggerSecurityDefinitionScopeAdapter();
			}
			@Override
			public Adapter caseSwaggerObjectType(SwaggerObjectType object) {
				return createSwaggerObjectTypeAdapter();
			}
			@Override
			public Adapter caseSwaggerReferenceObjectType(SwaggerReferenceObjectType object) {
				return createSwaggerReferenceObjectTypeAdapter();
			}
			@Override
			public Adapter caseSwaggerNamedObjectType(SwaggerNamedObjectType object) {
				return createSwaggerNamedObjectTypeAdapter();
			}
			@Override
			public Adapter caseSwaggerObjectClassDefinition(SwaggerObjectClassDefinition object) {
				return createSwaggerObjectClassDefinitionAdapter();
			}
			@Override
			public Adapter caseSwaggerSimpleObjectType(SwaggerSimpleObjectType object) {
				return createSwaggerSimpleObjectTypeAdapter();
			}
			@Override
			public Adapter caseSwaggerXml(SwaggerXml object) {
				return createSwaggerXmlAdapter();
			}
			@Override
			public Adapter caseSwaggerEnumObjectType(SwaggerEnumObjectType object) {
				return createSwaggerEnumObjectTypeAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel
	 * @generated
	 */
	public Adapter createSwaggerModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo
	 * @generated
	 */
	public Adapter createSwaggerInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerContact
	 * @generated
	 */
	public Adapter createSwaggerContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerLicense
	 * @generated
	 */
	public Adapter createSwaggerLicenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag
	 * @generated
	 */
	public Adapter createSwaggerTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation <em>External Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation
	 * @generated
	 */
	public Adapter createSwaggerExternalDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath
	 * @generated
	 */
	public Adapter createSwaggerPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation
	 * @generated
	 */
	public Adapter createSwaggerOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter
	 * @generated
	 */
	public Adapter createSwaggerParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse
	 * @generated
	 */
	public Adapter createSwaggerResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityObject <em>Security Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityObject
	 * @generated
	 */
	public Adapter createSwaggerSecurityObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurity
	 * @generated
	 */
	public Adapter createSwaggerSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition <em>Security Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition
	 * @generated
	 */
	public Adapter createSwaggerSecurityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinitionScope <em>Security Definition Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinitionScope
	 * @generated
	 */
	public Adapter createSwaggerSecurityDefinitionScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType
	 * @generated
	 */
	public Adapter createSwaggerObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType <em>Reference Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType
	 * @generated
	 */
	public Adapter createSwaggerReferenceObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType <em>Named Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType
	 * @generated
	 */
	public Adapter createSwaggerNamedObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition <em>Object Class Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition
	 * @generated
	 */
	public Adapter createSwaggerObjectClassDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType <em>Simple Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType
	 * @generated
	 */
	public Adapter createSwaggerSimpleObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml
	 * @generated
	 */
	public Adapter createSwaggerXmlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerEnumObjectType <em>Enum Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerEnumObjectType
	 * @generated
	 */
	public Adapter createSwaggerEnumObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SwaggerAdapterFactory
