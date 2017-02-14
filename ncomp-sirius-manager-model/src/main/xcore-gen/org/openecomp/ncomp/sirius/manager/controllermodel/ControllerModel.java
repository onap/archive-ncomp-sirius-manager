
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
package org.openecomp.ncomp.sirius.manager.controllermodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getTemplateDirectory <em>Template Directory</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getTitle <em>Title</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelPackage#getControllerModel()
 * @model
 * @generated
 */
public interface ControllerModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Directory</em>' attribute.
	 * @see #setTemplateDirectory(String)
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelPackage#getControllerModel_TemplateDirectory()
	 * @model unique="false"
	 * @generated
	 */
	String getTemplateDirectory();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getTemplateDirectory <em>Template Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Directory</em>' attribute.
	 * @see #getTemplateDirectory()
	 * @generated
	 */
	void setTemplateDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Name</em>' attribute.
	 * @see #setPluginName(String)
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelPackage#getControllerModel_PluginName()
	 * @model unique="false"
	 * @generated
	 */
	String getPluginName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getPluginName <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Name</em>' attribute.
	 * @see #getPluginName()
	 * @generated
	 */
	void setPluginName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelPackage#getControllerModel_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelPackage#getControllerModel_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelPackage#getControllerModel_Prefix()
	 * @model unique="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // ControllerModel
