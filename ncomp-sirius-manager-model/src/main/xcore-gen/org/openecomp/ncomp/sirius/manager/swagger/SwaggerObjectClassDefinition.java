
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Class Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getRequired <em>Required</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getAllOf <em>All Of</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerObjectClassDefinition()
 * @model
 * @generated
 */
public interface SwaggerObjectClassDefinition extends SwaggerNamedObjectType {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerObjectClassDefinition_Required()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRequired();

	/**
	 * Returns the value of the '<em><b>All Of</b></em>' reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Of</em>' reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerObjectClassDefinition_AllOf()
	 * @model
	 * @generated
	 */
	EList<SwaggerObjectType> getAllOf();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerObjectClassDefinition_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwaggerNamedObjectType> getProperties();

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' containment reference.
	 * @see #setAdditionalProperties(SwaggerObjectType)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerObjectClassDefinition_AdditionalProperties()
	 * @model containment="true"
	 * @generated
	 */
	SwaggerObjectType getAdditionalProperties();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition#getAdditionalProperties <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' containment reference.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(SwaggerObjectType value);

} // SwaggerObjectClassDefinition
