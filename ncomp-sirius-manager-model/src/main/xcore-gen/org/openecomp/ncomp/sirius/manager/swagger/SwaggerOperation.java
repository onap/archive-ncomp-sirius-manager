
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getTags <em>Tags</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getProduces <em>Produces</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getResponses <em>Responses</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#isDeprecated <em>Deprecated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation()
 * @model
 * @generated
 */
public interface SwaggerOperation extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Tags()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Summary()
	 * @model unique="false"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_OperationId()
	 * @model unique="false"
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#getOperationId <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Id</em>' attribute.
	 * @see #getOperationId()
	 * @generated
	 */
	void setOperationId(String value);

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Consumes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getConsumes();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' attribute list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Produces()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwaggerParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerResponse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Responses()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwaggerResponse> getResponses();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Security()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwaggerSecurityObject> getSecurity();

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(boolean)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerOperation_Deprecated()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isDeprecated();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation#isDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #isDeprecated()
	 * @generated
	 */
	void setDeprecated(boolean value);

} // SwaggerOperation
