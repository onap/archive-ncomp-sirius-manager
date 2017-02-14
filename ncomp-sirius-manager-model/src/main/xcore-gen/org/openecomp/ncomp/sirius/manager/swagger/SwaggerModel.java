
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getInfo <em>Info</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getHost <em>Host</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getTags <em>Tags</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSecurityDefinitions <em>Security Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel()
 * @model
 * @generated
 */
public interface SwaggerModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Swagger</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swagger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swagger</em>' attribute.
	 * @see #setSwagger(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_Swagger()
	 * @model default="2.0" unique="false"
	 * @generated
	 */
	String getSwagger();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getSwagger <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swagger</em>' attribute.
	 * @see #getSwagger()
	 * @generated
	 */
	void setSwagger(String value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(SwaggerInfo)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_Info()
	 * @model containment="true"
	 * @generated
	 */
	SwaggerInfo getInfo();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(SwaggerInfo value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_Host()
	 * @model unique="false"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_BasePath()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwaggerTag> getTags();

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_Schemes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSchemes();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwaggerPath> getPaths();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwaggerNamedObjectType> getDefinitions();

	/**
	 * Returns the value of the '<em><b>External Docs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Docs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Docs</em>' containment reference.
	 * @see #setExternalDocs(SwaggerExternalDocumentation)
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_ExternalDocs()
	 * @model containment="true"
	 * @generated
	 */
	SwaggerExternalDocumentation getExternalDocs();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel#getExternalDocs <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Docs</em>' containment reference.
	 * @see #getExternalDocs()
	 * @generated
	 */
	void setExternalDocs(SwaggerExternalDocumentation value);

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Definitions</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage#getSwaggerModel_SecurityDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwaggerSecurityDefinition> getSecurityDefinitions();

} // SwaggerModel
