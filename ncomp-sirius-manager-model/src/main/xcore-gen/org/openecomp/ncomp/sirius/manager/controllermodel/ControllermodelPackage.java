
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-sirius-manager-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.sirius.manager'"
 * @generated
 */
public interface ControllermodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controllermodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.sirius.manager.controllermodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controllermodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControllermodelPackage eINSTANCE = org.openecomp.ncomp.sirius.manager.controllermodel.impl.ControllermodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.controllermodel.impl.ControllerModelImpl <em>Controller Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.impl.ControllerModelImpl
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.impl.ControllermodelPackageImpl#getControllerModel()
	 * @generated
	 */
	int CONTROLLER_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Template Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MODEL__TEMPLATE_DIRECTORY = 0;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MODEL__PLUGIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MODEL__NAME = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MODEL__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MODEL__PREFIX = 4;

	/**
	 * The number of structural features of the '<em>Controller Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Controller Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel <em>Controller Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Model</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel
	 * @generated
	 */
	EClass getControllerModel();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getTemplateDirectory <em>Template Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Directory</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getTemplateDirectory()
	 * @see #getControllerModel()
	 * @generated
	 */
	EAttribute getControllerModel_TemplateDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getPluginName <em>Plugin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Name</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getPluginName()
	 * @see #getControllerModel()
	 * @generated
	 */
	EAttribute getControllerModel_PluginName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getName()
	 * @see #getControllerModel()
	 * @generated
	 */
	EAttribute getControllerModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getTitle()
	 * @see #getControllerModel()
	 * @generated
	 */
	EAttribute getControllerModel_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel#getPrefix()
	 * @see #getControllerModel()
	 * @generated
	 */
	EAttribute getControllerModel_Prefix();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControllermodelFactory getControllermodelFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.controllermodel.impl.ControllerModelImpl <em>Controller Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.controllermodel.impl.ControllerModelImpl
		 * @see org.openecomp.ncomp.sirius.manager.controllermodel.impl.ControllermodelPackageImpl#getControllerModel()
		 * @generated
		 */
		EClass CONTROLLER_MODEL = eINSTANCE.getControllerModel();

		/**
		 * The meta object literal for the '<em><b>Template Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_MODEL__TEMPLATE_DIRECTORY = eINSTANCE.getControllerModel_TemplateDirectory();

		/**
		 * The meta object literal for the '<em><b>Plugin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_MODEL__PLUGIN_NAME = eINSTANCE.getControllerModel_PluginName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_MODEL__NAME = eINSTANCE.getControllerModel_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_MODEL__TITLE = eINSTANCE.getControllerModel_Title();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_MODEL__PREFIX = eINSTANCE.getControllerModel_Prefix();

	}

} //ControllermodelPackage
