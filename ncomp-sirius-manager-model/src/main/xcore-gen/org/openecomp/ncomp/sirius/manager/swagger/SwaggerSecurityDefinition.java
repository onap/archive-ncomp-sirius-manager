
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

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerSecurityDefinition()
 * @model
 * @generated
 */
public interface SwaggerSecurityDefinition extends NamedEntity {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerSecurityDefinition_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Url</em>' attribute.
	 * @see #setAuthorizationUrl(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerSecurityDefinition_AuthorizationUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getAuthorizationUrl <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' attribute.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(String value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see #setFlow(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerSecurityDefinition_Flow()
	 * @model unique="false"
	 * @generated
	 */
	String getFlow();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType
	 * @see #setIn(SwaggerParameterType)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerSecurityDefinition_In()
	 * @model unique="false"
	 * @generated
	 */
	SwaggerParameterType getIn();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType
	 * @see #getIn()
	 * @generated
	 */
	void setIn(SwaggerParameterType value);
} // SwaggerSecurityDefinition
