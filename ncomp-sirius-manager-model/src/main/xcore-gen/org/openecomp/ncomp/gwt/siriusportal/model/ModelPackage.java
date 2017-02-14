
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
package org.openecomp.ncomp.gwt.siriusportal.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-sirius-manager-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.gwt.siriusportal'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.gwt.siriusportal.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiClientApiImpl <em>Gui Client Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiClientApiImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiClientApi()
	 * @generated
	 */
	int GUI_CLIENT_API = 0;

	/**
	 * The number of structural features of the '<em>Gui Client Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CLIENT_API_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Tree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CLIENT_API___GET_TREE = 0;

	/**
	 * The operation id for the '<em>Get Object</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CLIENT_API___GET_OBJECT__STRING = 1;

	/**
	 * The operation id for the '<em>Get Time Serie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CLIENT_API___GET_TIME_SERIE__STRING_STRING_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CLIENT_API___GET_TABLE__STRING_STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Get Html</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CLIENT_API___GET_HTML__STRING_STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CLIENT_API___GET_GRAPH__STRING_STRING_STRING = 5;

	/**
	 * The number of operations of the '<em>Gui Client Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_CLIENT_API_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTreeImpl <em>Gui Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTreeImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTree()
	 * @generated
	 */
	int GUI_TREE = 1;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE__SECTIONS = 0;

	/**
	 * The number of structural features of the '<em>Gui Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gui Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTreeNodeImpl <em>Gui Tree Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTreeNodeImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTreeNode()
	 * @generated
	 */
	int GUI_TREE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_NODE__NODE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_NODE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_NODE__TOOLTIP = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_NODE__ICON = 3;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_NODE__VIEW = 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_NODE__CHILDREN = 5;

	/**
	 * The number of structural features of the '<em>Gui Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_NODE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Gui Tree Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TREE_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectImpl <em>Gui Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObject()
	 * @generated
	 */
	int GUI_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Gui Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gui Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiNamedObjectImpl <em>Gui Named Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiNamedObjectImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiNamedObject()
	 * @generated
	 */
	int GUI_NAMED_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_NAMED_OBJECT__VALUES = GUI_OBJECT__VALUES;

	/**
	 * The feature id for the '<em><b>Object Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_NAMED_OBJECT__OBJECT_NAME = GUI_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Named Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_NAMED_OBJECT_FEATURE_COUNT = GUI_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Named Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_NAMED_OBJECT_OPERATION_COUNT = GUI_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueImpl <em>Gui Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValue()
	 * @generated
	 */
	int GUI_OBJECT_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE__VALUE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE__TOOLTIP = 1;

	/**
	 * The number of structural features of the '<em>Gui Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gui Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueIntegerImpl <em>Gui Object Value Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueIntegerImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueInteger()
	 * @generated
	 */
	int GUI_OBJECT_VALUE_INTEGER = 6;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_INTEGER__VALUE_NAME = GUI_OBJECT_VALUE__VALUE_NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_INTEGER__TOOLTIP = GUI_OBJECT_VALUE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>I</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_INTEGER__I = GUI_OBJECT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Object Value Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_INTEGER_FEATURE_COUNT = GUI_OBJECT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Object Value Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_INTEGER_OPERATION_COUNT = GUI_OBJECT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueStringImpl <em>Gui Object Value String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueStringImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueString()
	 * @generated
	 */
	int GUI_OBJECT_VALUE_STRING = 7;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_STRING__VALUE_NAME = GUI_OBJECT_VALUE__VALUE_NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_STRING__TOOLTIP = GUI_OBJECT_VALUE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_STRING__V = GUI_OBJECT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Object Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_STRING_FEATURE_COUNT = GUI_OBJECT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Object Value String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_STRING_OPERATION_COUNT = GUI_OBJECT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueReferenceImpl <em>Gui Object Value Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueReferenceImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueReference()
	 * @generated
	 */
	int GUI_OBJECT_VALUE_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_REFERENCE__VALUE_NAME = GUI_OBJECT_VALUE_STRING__VALUE_NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_REFERENCE__TOOLTIP = GUI_OBJECT_VALUE_STRING__TOOLTIP;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_REFERENCE__V = GUI_OBJECT_VALUE_STRING__V;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_REFERENCE__PATH = GUI_OBJECT_VALUE_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Object Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_REFERENCE_FEATURE_COUNT = GUI_OBJECT_VALUE_STRING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Object Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_REFERENCE_OPERATION_COUNT = GUI_OBJECT_VALUE_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueTimeSeriesImpl <em>Gui Object Value Time Series</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueTimeSeriesImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueTimeSeries()
	 * @generated
	 */
	int GUI_OBJECT_VALUE_TIME_SERIES = 9;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_TIME_SERIES__VALUE_NAME = GUI_OBJECT_VALUE_STRING__VALUE_NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_TIME_SERIES__TOOLTIP = GUI_OBJECT_VALUE_STRING__TOOLTIP;

	/**
	 * The feature id for the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_TIME_SERIES__V = GUI_OBJECT_VALUE_STRING__V;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_TIME_SERIES__PATH = GUI_OBJECT_VALUE_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Object Value Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_TIME_SERIES_FEATURE_COUNT = GUI_OBJECT_VALUE_STRING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Object Value Time Series</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_TIME_SERIES_OPERATION_COUNT = GUI_OBJECT_VALUE_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueObjectImpl <em>Gui Object Value Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueObjectImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueObject()
	 * @generated
	 */
	int GUI_OBJECT_VALUE_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_OBJECT__VALUE_NAME = GUI_OBJECT_VALUE__VALUE_NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_OBJECT__TOOLTIP = GUI_OBJECT_VALUE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_OBJECT__V = GUI_OBJECT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Object Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_OBJECT_FEATURE_COUNT = GUI_OBJECT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Object Value Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_VALUE_OBJECT_OPERATION_COUNT = GUI_OBJECT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectUnNamedListImpl <em>Gui Object Un Named List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectUnNamedListImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectUnNamedList()
	 * @generated
	 */
	int GUI_OBJECT_UN_NAMED_LIST = 11;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_UN_NAMED_LIST__VALUE_NAME = GUI_OBJECT_VALUE__VALUE_NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_UN_NAMED_LIST__TOOLTIP = GUI_OBJECT_VALUE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_UN_NAMED_LIST__OBJECTS = GUI_OBJECT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Object Un Named List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_UN_NAMED_LIST_FEATURE_COUNT = GUI_OBJECT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Object Un Named List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_UN_NAMED_LIST_OPERATION_COUNT = GUI_OBJECT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectNamedListImpl <em>Gui Object Named List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectNamedListImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectNamedList()
	 * @generated
	 */
	int GUI_OBJECT_NAMED_LIST = 12;

	/**
	 * The feature id for the '<em><b>Value Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_NAMED_LIST__VALUE_NAME = GUI_OBJECT_VALUE__VALUE_NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_NAMED_LIST__TOOLTIP = GUI_OBJECT_VALUE__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_NAMED_LIST__OBJECTS = GUI_OBJECT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Object Named List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_NAMED_LIST_FEATURE_COUNT = GUI_OBJECT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Object Named List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_OBJECT_NAMED_LIST_OPERATION_COUNT = GUI_OBJECT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl <em>Gui Time Serie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTimeSerie()
	 * @generated
	 */
	int GUI_TIME_SERIE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE__NAME = 0;

	/**
	 * The feature id for the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE__XAXIS_LABEL = 1;

	/**
	 * The feature id for the '<em><b>XAxis Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE__XAXIS_DATE_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE__YAXIS_LABEL = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE__START = 4;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE__END = 5;

	/**
	 * The feature id for the '<em><b>Is Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE__IS_RATE = 6;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE__DATA = 7;

	/**
	 * The number of structural features of the '<em>Gui Time Serie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Gui Time Serie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieDataImpl <em>Gui Time Serie Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieDataImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTimeSerieData()
	 * @generated
	 */
	int GUI_TIME_SERIE_DATA = 14;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_DATA__TIME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_DATA__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_DATA__MAX = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_DATA__MIN = 3;

	/**
	 * The feature id for the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_DATA__NUM = 4;

	/**
	 * The number of structural features of the '<em>Gui Time Serie Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Gui Time Serie Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TIME_SERIE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableImpl <em>Gui Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTable()
	 * @generated
	 */
	int GUI_TABLE = 15;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE__ROWS = 1;

	/**
	 * The number of structural features of the '<em>Gui Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gui Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl <em>Gui Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableColumn()
	 * @generated
	 */
	int GUI_TABLE_COLUMN = 16;

	/**
	 * The feature id for the '<em><b>Col Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_COLUMN__COL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_COLUMN__TOOLTIP = 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_COLUMN__FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_COLUMN__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_COLUMN__HIDDEN = 4;

	/**
	 * The feature id for the '<em><b>Column Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_COLUMN__COLUMN_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Gui Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_COLUMN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Gui Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableRowImpl <em>Gui Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableRowImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableRow()
	 * @generated
	 */
	int GUI_TABLE_ROW = 17;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_ROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Gui Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gui Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellImpl <em>Gui Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCell()
	 * @generated
	 */
	int GUI_TABLE_CELL = 18;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL__TOOLTIP = 0;

	/**
	 * The number of structural features of the '<em>Gui Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gui Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellStringImpl <em>Gui Table Cell String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellStringImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellString()
	 * @generated
	 */
	int GUI_TABLE_CELL_STRING = 19;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_STRING__TOOLTIP = GUI_TABLE_CELL__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_STRING__VALUE = GUI_TABLE_CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Table Cell String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_STRING_FEATURE_COUNT = GUI_TABLE_CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Table Cell String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_STRING_OPERATION_COUNT = GUI_TABLE_CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDoubleImpl <em>Gui Table Cell Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDoubleImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellDouble()
	 * @generated
	 */
	int GUI_TABLE_CELL_DOUBLE = 20;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DOUBLE__TOOLTIP = GUI_TABLE_CELL__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DOUBLE__VALUE = GUI_TABLE_CELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timeseries Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DOUBLE__TIMESERIES_PATH = GUI_TABLE_CELL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gui Table Cell Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DOUBLE_FEATURE_COUNT = GUI_TABLE_CELL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gui Table Cell Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DOUBLE_OPERATION_COUNT = GUI_TABLE_CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDateImpl <em>Gui Table Cell Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDateImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellDate()
	 * @generated
	 */
	int GUI_TABLE_CELL_DATE = 21;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DATE__TOOLTIP = GUI_TABLE_CELL__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DATE__VALUE = GUI_TABLE_CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Table Cell Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DATE_FEATURE_COUNT = GUI_TABLE_CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Table Cell Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_DATE_OPERATION_COUNT = GUI_TABLE_CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellReferencesImpl <em>Gui Table Cell References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellReferencesImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellReferences()
	 * @generated
	 */
	int GUI_TABLE_CELL_REFERENCES = 22;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_REFERENCES__TOOLTIP = GUI_TABLE_CELL__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_REFERENCES__REFS = GUI_TABLE_CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gui Table Cell References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_REFERENCES_FEATURE_COUNT = GUI_TABLE_CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gui Table Cell References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_REFERENCES_OPERATION_COUNT = GUI_TABLE_CELL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellReferenceImpl <em>Gui Table Cell Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellReferenceImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellReference()
	 * @generated
	 */
	int GUI_TABLE_CELL_REFERENCE = 23;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_REFERENCE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_REFERENCE__PATH = 1;

	/**
	 * The number of structural features of the '<em>Gui Table Cell Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gui Table Cell Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_TABLE_CELL_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramImpl <em>Gui Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiDiagram()
	 * @generated
	 */
	int GUI_DIAGRAM = 24;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Gui Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gui Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramItemImpl <em>Gui Diagram Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramItemImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiDiagramItem()
	 * @generated
	 */
	int GUI_DIAGRAM_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_ITEM__TOOLTIP = 0;

	/**
	 * The number of structural features of the '<em>Gui Diagram Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gui Diagram Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramRectangleImpl <em>Gui Diagram Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramRectangleImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiDiagramRectangle()
	 * @generated
	 */
	int GUI_DIAGRAM_RECTANGLE = 26;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_RECTANGLE__TOOLTIP = GUI_DIAGRAM_ITEM__TOOLTIP;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_RECTANGLE__X = GUI_DIAGRAM_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_RECTANGLE__Y = GUI_DIAGRAM_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_RECTANGLE__H = GUI_DIAGRAM_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_RECTANGLE__W = GUI_DIAGRAM_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gui Diagram Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_RECTANGLE_FEATURE_COUNT = GUI_DIAGRAM_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Gui Diagram Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_DIAGRAM_RECTANGLE_OPERATION_COUNT = GUI_DIAGRAM_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiHtmlImpl <em>Gui Html</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiHtmlImpl
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiHtml()
	 * @generated
	 */
	int GUI_HTML = 27;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_HTML__HTML = 0;

	/**
	 * The number of structural features of the '<em>Gui Html</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_HTML_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gui Html</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_HTML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiView <em>Gui View</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiView
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiView()
	 * @generated
	 */
	int GUI_VIEW = 28;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType <em>Gui Table Column Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableColumnType()
	 * @generated
	 */
	int GUI_TABLE_COLUMN_TYPE = 29;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 30;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi <em>Gui Client Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Client Api</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi
	 * @generated
	 */
	EClass getGuiClientApi();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getTree() <em>Get Tree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tree</em>' operation.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getTree()
	 * @generated
	 */
	EOperation getGuiClientApi__GetTree();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getObject(java.lang.String) <em>Get Object</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Object</em>' operation.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getObject(java.lang.String)
	 * @generated
	 */
	EOperation getGuiClientApi__GetObject__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getTimeSerie(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Get Time Serie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Serie</em>' operation.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getTimeSerie(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGuiClientApi__GetTimeSerie__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getTable(java.lang.String, java.lang.String, java.lang.String) <em>Get Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Table</em>' operation.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getTable(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGuiClientApi__GetTable__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getHtml(java.lang.String, java.lang.String, java.lang.String) <em>Get Html</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Html</em>' operation.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getHtml(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGuiClientApi__GetHtml__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getGraph(java.lang.String, java.lang.String, java.lang.String) <em>Get Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph</em>' operation.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi#getGraph(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGuiClientApi__GetGraph__String_String_String();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTree <em>Gui Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Tree</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTree
	 * @generated
	 */
	EClass getGuiTree();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTree#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTree#getSections()
	 * @see #getGuiTree()
	 * @generated
	 */
	EReference getGuiTree_Sections();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode <em>Gui Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Tree Node</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode
	 * @generated
	 */
	EClass getGuiTreeNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getNodeName <em>Node Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Name</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getNodeName()
	 * @see #getGuiTreeNode()
	 * @generated
	 */
	EAttribute getGuiTreeNode_NodeName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getTitle()
	 * @see #getGuiTreeNode()
	 * @generated
	 */
	EAttribute getGuiTreeNode_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getTooltip()
	 * @see #getGuiTreeNode()
	 * @generated
	 */
	EAttribute getGuiTreeNode_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getIcon()
	 * @see #getGuiTreeNode()
	 * @generated
	 */
	EAttribute getGuiTreeNode_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getView()
	 * @see #getGuiTreeNode()
	 * @generated
	 */
	EAttribute getGuiTreeNode_View();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode#getChildren()
	 * @see #getGuiTreeNode()
	 * @generated
	 */
	EReference getGuiTreeNode_Children();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObject <em>Gui Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObject
	 * @generated
	 */
	EClass getGuiObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObject#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObject#getValues()
	 * @see #getGuiObject()
	 * @generated
	 */
	EReference getGuiObject_Values();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiNamedObject <em>Gui Named Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Named Object</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiNamedObject
	 * @generated
	 */
	EClass getGuiNamedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiNamedObject#getObjectName <em>Object Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Name</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiNamedObject#getObjectName()
	 * @see #getGuiNamedObject()
	 * @generated
	 */
	EAttribute getGuiNamedObject_ObjectName();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue <em>Gui Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object Value</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue
	 * @generated
	 */
	EClass getGuiObjectValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue#getValueName <em>Value Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Name</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue#getValueName()
	 * @see #getGuiObjectValue()
	 * @generated
	 */
	EAttribute getGuiObjectValue_ValueName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue#getTooltip()
	 * @see #getGuiObjectValue()
	 * @generated
	 */
	EAttribute getGuiObjectValue_Tooltip();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueInteger <em>Gui Object Value Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object Value Integer</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueInteger
	 * @generated
	 */
	EClass getGuiObjectValueInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueInteger#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueInteger#getI()
	 * @see #getGuiObjectValueInteger()
	 * @generated
	 */
	EAttribute getGuiObjectValueInteger_I();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueString <em>Gui Object Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object Value String</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueString
	 * @generated
	 */
	EClass getGuiObjectValueString();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueString#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>V</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueString#getV()
	 * @see #getGuiObjectValueString()
	 * @generated
	 */
	EAttribute getGuiObjectValueString_V();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueReference <em>Gui Object Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object Value Reference</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueReference
	 * @generated
	 */
	EClass getGuiObjectValueReference();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueReference#getPath()
	 * @see #getGuiObjectValueReference()
	 * @generated
	 */
	EAttribute getGuiObjectValueReference_Path();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueTimeSeries <em>Gui Object Value Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object Value Time Series</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueTimeSeries
	 * @generated
	 */
	EClass getGuiObjectValueTimeSeries();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueTimeSeries#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueTimeSeries#getPath()
	 * @see #getGuiObjectValueTimeSeries()
	 * @generated
	 */
	EAttribute getGuiObjectValueTimeSeries_Path();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueObject <em>Gui Object Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object Value Object</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueObject
	 * @generated
	 */
	EClass getGuiObjectValueObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueObject#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>V</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueObject#getV()
	 * @see #getGuiObjectValueObject()
	 * @generated
	 */
	EReference getGuiObjectValueObject_V();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectUnNamedList <em>Gui Object Un Named List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object Un Named List</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectUnNamedList
	 * @generated
	 */
	EClass getGuiObjectUnNamedList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectUnNamedList#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectUnNamedList#getObjects()
	 * @see #getGuiObjectUnNamedList()
	 * @generated
	 */
	EReference getGuiObjectUnNamedList_Objects();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectNamedList <em>Gui Object Named List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Object Named List</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectNamedList
	 * @generated
	 */
	EClass getGuiObjectNamedList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectNamedList#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectNamedList#getObjects()
	 * @see #getGuiObjectNamedList()
	 * @generated
	 */
	EReference getGuiObjectNamedList_Objects();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie <em>Gui Time Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Time Serie</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie
	 * @generated
	 */
	EClass getGuiTimeSerie();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getName()
	 * @see #getGuiTimeSerie()
	 * @generated
	 */
	EAttribute getGuiTimeSerie_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getXAxisLabel <em>XAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Label</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getXAxisLabel()
	 * @see #getGuiTimeSerie()
	 * @generated
	 */
	EAttribute getGuiTimeSerie_XAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getXAxisDateFormat <em>XAxis Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAxis Date Format</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getXAxisDateFormat()
	 * @see #getGuiTimeSerie()
	 * @generated
	 */
	EAttribute getGuiTimeSerie_XAxisDateFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getYAxisLabel <em>YAxis Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAxis Label</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getYAxisLabel()
	 * @see #getGuiTimeSerie()
	 * @generated
	 */
	EAttribute getGuiTimeSerie_YAxisLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getStart()
	 * @see #getGuiTimeSerie()
	 * @generated
	 */
	EAttribute getGuiTimeSerie_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getEnd()
	 * @see #getGuiTimeSerie()
	 * @generated
	 */
	EAttribute getGuiTimeSerie_End();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#isIsRate <em>Is Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Rate</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#isIsRate()
	 * @see #getGuiTimeSerie()
	 * @generated
	 */
	EAttribute getGuiTimeSerie_IsRate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getData()
	 * @see #getGuiTimeSerie()
	 * @generated
	 */
	EReference getGuiTimeSerie_Data();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData <em>Gui Time Serie Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Time Serie Data</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData
	 * @generated
	 */
	EClass getGuiTimeSerieData();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getTime()
	 * @see #getGuiTimeSerieData()
	 * @generated
	 */
	EAttribute getGuiTimeSerieData_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getValue()
	 * @see #getGuiTimeSerieData()
	 * @generated
	 */
	EAttribute getGuiTimeSerieData_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getMax()
	 * @see #getGuiTimeSerieData()
	 * @generated
	 */
	EAttribute getGuiTimeSerieData_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getMin()
	 * @see #getGuiTimeSerieData()
	 * @generated
	 */
	EAttribute getGuiTimeSerieData_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getNum()
	 * @see #getGuiTimeSerieData()
	 * @generated
	 */
	EAttribute getGuiTimeSerieData_Num();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTable <em>Gui Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTable
	 * @generated
	 */
	EClass getGuiTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTable#getColumns()
	 * @see #getGuiTable()
	 * @generated
	 */
	EReference getGuiTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTable#getRows()
	 * @see #getGuiTable()
	 * @generated
	 */
	EReference getGuiTable_Rows();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn <em>Gui Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table Column</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn
	 * @generated
	 */
	EClass getGuiTableColumn();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getColName <em>Col Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Name</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getColName()
	 * @see #getGuiTableColumn()
	 * @generated
	 */
	EAttribute getGuiTableColumn_ColName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getTooltip()
	 * @see #getGuiTableColumn()
	 * @generated
	 */
	EAttribute getGuiTableColumn_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getFormat()
	 * @see #getGuiTableColumn()
	 * @generated
	 */
	EAttribute getGuiTableColumn_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getWidth()
	 * @see #getGuiTableColumn()
	 * @generated
	 */
	EAttribute getGuiTableColumn_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#isHidden()
	 * @see #getGuiTableColumn()
	 * @generated
	 */
	EAttribute getGuiTableColumn_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Type</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getColumnType()
	 * @see #getGuiTableColumn()
	 * @generated
	 */
	EAttribute getGuiTableColumn_ColumnType();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableRow <em>Gui Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table Row</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableRow
	 * @generated
	 */
	EClass getGuiTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableRow#getCells()
	 * @see #getGuiTableRow()
	 * @generated
	 */
	EReference getGuiTableRow_Cells();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCell <em>Gui Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table Cell</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCell
	 * @generated
	 */
	EClass getGuiTableCell();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCell#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCell#getTooltip()
	 * @see #getGuiTableCell()
	 * @generated
	 */
	EAttribute getGuiTableCell_Tooltip();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellString <em>Gui Table Cell String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table Cell String</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellString
	 * @generated
	 */
	EClass getGuiTableCellString();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellString#getValue()
	 * @see #getGuiTableCellString()
	 * @generated
	 */
	EAttribute getGuiTableCellString_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble <em>Gui Table Cell Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table Cell Double</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble
	 * @generated
	 */
	EClass getGuiTableCellDouble();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble#getValue()
	 * @see #getGuiTableCellDouble()
	 * @generated
	 */
	EAttribute getGuiTableCellDouble_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble#getTimeseriesPath <em>Timeseries Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeseries Path</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble#getTimeseriesPath()
	 * @see #getGuiTableCellDouble()
	 * @generated
	 */
	EAttribute getGuiTableCellDouble_TimeseriesPath();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDate <em>Gui Table Cell Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table Cell Date</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDate
	 * @generated
	 */
	EClass getGuiTableCellDate();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDate#getValue()
	 * @see #getGuiTableCellDate()
	 * @generated
	 */
	EAttribute getGuiTableCellDate_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReferences <em>Gui Table Cell References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table Cell References</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReferences
	 * @generated
	 */
	EClass getGuiTableCellReferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReferences#getRefs <em>Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refs</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReferences#getRefs()
	 * @see #getGuiTableCellReferences()
	 * @generated
	 */
	EReference getGuiTableCellReferences_Refs();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference <em>Gui Table Cell Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Table Cell Reference</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference
	 * @generated
	 */
	EClass getGuiTableCellReference();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference#getLabel()
	 * @see #getGuiTableCellReference()
	 * @generated
	 */
	EAttribute getGuiTableCellReference_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference#getPath()
	 * @see #getGuiTableCellReference()
	 * @generated
	 */
	EAttribute getGuiTableCellReference_Path();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagram <em>Gui Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Diagram</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagram
	 * @generated
	 */
	EClass getGuiDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagram#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagram#getItems()
	 * @see #getGuiDiagram()
	 * @generated
	 */
	EReference getGuiDiagram_Items();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramItem <em>Gui Diagram Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Diagram Item</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramItem
	 * @generated
	 */
	EClass getGuiDiagramItem();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramItem#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramItem#getTooltip()
	 * @see #getGuiDiagramItem()
	 * @generated
	 */
	EAttribute getGuiDiagramItem_Tooltip();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle <em>Gui Diagram Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Diagram Rectangle</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle
	 * @generated
	 */
	EClass getGuiDiagramRectangle();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle#getX()
	 * @see #getGuiDiagramRectangle()
	 * @generated
	 */
	EAttribute getGuiDiagramRectangle_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle#getY()
	 * @see #getGuiDiagramRectangle()
	 * @generated
	 */
	EAttribute getGuiDiagramRectangle_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle#getH()
	 * @see #getGuiDiagramRectangle()
	 * @generated
	 */
	EAttribute getGuiDiagramRectangle_H();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle#getW()
	 * @see #getGuiDiagramRectangle()
	 * @generated
	 */
	EAttribute getGuiDiagramRectangle_W();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml <em>Gui Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Html</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml
	 * @generated
	 */
	EClass getGuiHtml();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml#getHtml()
	 * @see #getGuiHtml()
	 * @generated
	 */
	EAttribute getGuiHtml_Html();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiView <em>Gui View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gui View</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiView
	 * @generated
	 */
	EEnum getGuiView();

	/**
	 * Returns the meta object for enum '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType <em>Gui Table Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gui Table Column Type</em>'.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType
	 * @generated
	 */
	EEnum getGuiTableColumnType();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiClientApiImpl <em>Gui Client Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiClientApiImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiClientApi()
		 * @generated
		 */
		EClass GUI_CLIENT_API = eINSTANCE.getGuiClientApi();

		/**
		 * The meta object literal for the '<em><b>Get Tree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CLIENT_API___GET_TREE = eINSTANCE.getGuiClientApi__GetTree();

		/**
		 * The meta object literal for the '<em><b>Get Object</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CLIENT_API___GET_OBJECT__STRING = eINSTANCE.getGuiClientApi__GetObject__String();

		/**
		 * The meta object literal for the '<em><b>Get Time Serie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CLIENT_API___GET_TIME_SERIE__STRING_STRING_STRING_STRING = eINSTANCE.getGuiClientApi__GetTimeSerie__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CLIENT_API___GET_TABLE__STRING_STRING_STRING = eINSTANCE.getGuiClientApi__GetTable__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Html</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CLIENT_API___GET_HTML__STRING_STRING_STRING = eINSTANCE.getGuiClientApi__GetHtml__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUI_CLIENT_API___GET_GRAPH__STRING_STRING_STRING = eINSTANCE.getGuiClientApi__GetGraph__String_String_String();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTreeImpl <em>Gui Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTreeImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTree()
		 * @generated
		 */
		EClass GUI_TREE = eINSTANCE.getGuiTree();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TREE__SECTIONS = eINSTANCE.getGuiTree_Sections();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTreeNodeImpl <em>Gui Tree Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTreeNodeImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTreeNode()
		 * @generated
		 */
		EClass GUI_TREE_NODE = eINSTANCE.getGuiTreeNode();

		/**
		 * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TREE_NODE__NODE_NAME = eINSTANCE.getGuiTreeNode_NodeName();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TREE_NODE__TITLE = eINSTANCE.getGuiTreeNode_Title();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TREE_NODE__TOOLTIP = eINSTANCE.getGuiTreeNode_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TREE_NODE__ICON = eINSTANCE.getGuiTreeNode_Icon();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TREE_NODE__VIEW = eINSTANCE.getGuiTreeNode_View();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TREE_NODE__CHILDREN = eINSTANCE.getGuiTreeNode_Children();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectImpl <em>Gui Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObject()
		 * @generated
		 */
		EClass GUI_OBJECT = eINSTANCE.getGuiObject();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_OBJECT__VALUES = eINSTANCE.getGuiObject_Values();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiNamedObjectImpl <em>Gui Named Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiNamedObjectImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiNamedObject()
		 * @generated
		 */
		EClass GUI_NAMED_OBJECT = eINSTANCE.getGuiNamedObject();

		/**
		 * The meta object literal for the '<em><b>Object Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_NAMED_OBJECT__OBJECT_NAME = eINSTANCE.getGuiNamedObject_ObjectName();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueImpl <em>Gui Object Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValue()
		 * @generated
		 */
		EClass GUI_OBJECT_VALUE = eINSTANCE.getGuiObjectValue();

		/**
		 * The meta object literal for the '<em><b>Value Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_OBJECT_VALUE__VALUE_NAME = eINSTANCE.getGuiObjectValue_ValueName();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_OBJECT_VALUE__TOOLTIP = eINSTANCE.getGuiObjectValue_Tooltip();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueIntegerImpl <em>Gui Object Value Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueIntegerImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueInteger()
		 * @generated
		 */
		EClass GUI_OBJECT_VALUE_INTEGER = eINSTANCE.getGuiObjectValueInteger();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_OBJECT_VALUE_INTEGER__I = eINSTANCE.getGuiObjectValueInteger_I();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueStringImpl <em>Gui Object Value String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueStringImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueString()
		 * @generated
		 */
		EClass GUI_OBJECT_VALUE_STRING = eINSTANCE.getGuiObjectValueString();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_OBJECT_VALUE_STRING__V = eINSTANCE.getGuiObjectValueString_V();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueReferenceImpl <em>Gui Object Value Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueReferenceImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueReference()
		 * @generated
		 */
		EClass GUI_OBJECT_VALUE_REFERENCE = eINSTANCE.getGuiObjectValueReference();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_OBJECT_VALUE_REFERENCE__PATH = eINSTANCE.getGuiObjectValueReference_Path();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueTimeSeriesImpl <em>Gui Object Value Time Series</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueTimeSeriesImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueTimeSeries()
		 * @generated
		 */
		EClass GUI_OBJECT_VALUE_TIME_SERIES = eINSTANCE.getGuiObjectValueTimeSeries();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_OBJECT_VALUE_TIME_SERIES__PATH = eINSTANCE.getGuiObjectValueTimeSeries_Path();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueObjectImpl <em>Gui Object Value Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectValueObjectImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectValueObject()
		 * @generated
		 */
		EClass GUI_OBJECT_VALUE_OBJECT = eINSTANCE.getGuiObjectValueObject();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_OBJECT_VALUE_OBJECT__V = eINSTANCE.getGuiObjectValueObject_V();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectUnNamedListImpl <em>Gui Object Un Named List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectUnNamedListImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectUnNamedList()
		 * @generated
		 */
		EClass GUI_OBJECT_UN_NAMED_LIST = eINSTANCE.getGuiObjectUnNamedList();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_OBJECT_UN_NAMED_LIST__OBJECTS = eINSTANCE.getGuiObjectUnNamedList_Objects();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectNamedListImpl <em>Gui Object Named List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiObjectNamedListImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiObjectNamedList()
		 * @generated
		 */
		EClass GUI_OBJECT_NAMED_LIST = eINSTANCE.getGuiObjectNamedList();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_OBJECT_NAMED_LIST__OBJECTS = eINSTANCE.getGuiObjectNamedList_Objects();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl <em>Gui Time Serie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTimeSerie()
		 * @generated
		 */
		EClass GUI_TIME_SERIE = eINSTANCE.getGuiTimeSerie();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE__NAME = eINSTANCE.getGuiTimeSerie_Name();

		/**
		 * The meta object literal for the '<em><b>XAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE__XAXIS_LABEL = eINSTANCE.getGuiTimeSerie_XAxisLabel();

		/**
		 * The meta object literal for the '<em><b>XAxis Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE__XAXIS_DATE_FORMAT = eINSTANCE.getGuiTimeSerie_XAxisDateFormat();

		/**
		 * The meta object literal for the '<em><b>YAxis Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE__YAXIS_LABEL = eINSTANCE.getGuiTimeSerie_YAxisLabel();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE__START = eINSTANCE.getGuiTimeSerie_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE__END = eINSTANCE.getGuiTimeSerie_End();

		/**
		 * The meta object literal for the '<em><b>Is Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE__IS_RATE = eINSTANCE.getGuiTimeSerie_IsRate();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TIME_SERIE__DATA = eINSTANCE.getGuiTimeSerie_Data();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieDataImpl <em>Gui Time Serie Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieDataImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTimeSerieData()
		 * @generated
		 */
		EClass GUI_TIME_SERIE_DATA = eINSTANCE.getGuiTimeSerieData();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE_DATA__TIME = eINSTANCE.getGuiTimeSerieData_Time();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE_DATA__VALUE = eINSTANCE.getGuiTimeSerieData_Value();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE_DATA__MAX = eINSTANCE.getGuiTimeSerieData_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE_DATA__MIN = eINSTANCE.getGuiTimeSerieData_Min();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TIME_SERIE_DATA__NUM = eINSTANCE.getGuiTimeSerieData_Num();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableImpl <em>Gui Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTable()
		 * @generated
		 */
		EClass GUI_TABLE = eINSTANCE.getGuiTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TABLE__COLUMNS = eINSTANCE.getGuiTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TABLE__ROWS = eINSTANCE.getGuiTable_Rows();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl <em>Gui Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableColumn()
		 * @generated
		 */
		EClass GUI_TABLE_COLUMN = eINSTANCE.getGuiTableColumn();

		/**
		 * The meta object literal for the '<em><b>Col Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_COLUMN__COL_NAME = eINSTANCE.getGuiTableColumn_ColName();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_COLUMN__TOOLTIP = eINSTANCE.getGuiTableColumn_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_COLUMN__FORMAT = eINSTANCE.getGuiTableColumn_Format();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_COLUMN__WIDTH = eINSTANCE.getGuiTableColumn_Width();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_COLUMN__HIDDEN = eINSTANCE.getGuiTableColumn_Hidden();

		/**
		 * The meta object literal for the '<em><b>Column Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_COLUMN__COLUMN_TYPE = eINSTANCE.getGuiTableColumn_ColumnType();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableRowImpl <em>Gui Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableRowImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableRow()
		 * @generated
		 */
		EClass GUI_TABLE_ROW = eINSTANCE.getGuiTableRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TABLE_ROW__CELLS = eINSTANCE.getGuiTableRow_Cells();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellImpl <em>Gui Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCell()
		 * @generated
		 */
		EClass GUI_TABLE_CELL = eINSTANCE.getGuiTableCell();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_CELL__TOOLTIP = eINSTANCE.getGuiTableCell_Tooltip();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellStringImpl <em>Gui Table Cell String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellStringImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellString()
		 * @generated
		 */
		EClass GUI_TABLE_CELL_STRING = eINSTANCE.getGuiTableCellString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_CELL_STRING__VALUE = eINSTANCE.getGuiTableCellString_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDoubleImpl <em>Gui Table Cell Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDoubleImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellDouble()
		 * @generated
		 */
		EClass GUI_TABLE_CELL_DOUBLE = eINSTANCE.getGuiTableCellDouble();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_CELL_DOUBLE__VALUE = eINSTANCE.getGuiTableCellDouble_Value();

		/**
		 * The meta object literal for the '<em><b>Timeseries Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_CELL_DOUBLE__TIMESERIES_PATH = eINSTANCE.getGuiTableCellDouble_TimeseriesPath();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDateImpl <em>Gui Table Cell Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDateImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellDate()
		 * @generated
		 */
		EClass GUI_TABLE_CELL_DATE = eINSTANCE.getGuiTableCellDate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_CELL_DATE__VALUE = eINSTANCE.getGuiTableCellDate_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellReferencesImpl <em>Gui Table Cell References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellReferencesImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellReferences()
		 * @generated
		 */
		EClass GUI_TABLE_CELL_REFERENCES = eINSTANCE.getGuiTableCellReferences();

		/**
		 * The meta object literal for the '<em><b>Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_TABLE_CELL_REFERENCES__REFS = eINSTANCE.getGuiTableCellReferences_Refs();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellReferenceImpl <em>Gui Table Cell Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellReferenceImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableCellReference()
		 * @generated
		 */
		EClass GUI_TABLE_CELL_REFERENCE = eINSTANCE.getGuiTableCellReference();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_CELL_REFERENCE__LABEL = eINSTANCE.getGuiTableCellReference_Label();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_TABLE_CELL_REFERENCE__PATH = eINSTANCE.getGuiTableCellReference_Path();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramImpl <em>Gui Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiDiagram()
		 * @generated
		 */
		EClass GUI_DIAGRAM = eINSTANCE.getGuiDiagram();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_DIAGRAM__ITEMS = eINSTANCE.getGuiDiagram_Items();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramItemImpl <em>Gui Diagram Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramItemImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiDiagramItem()
		 * @generated
		 */
		EClass GUI_DIAGRAM_ITEM = eINSTANCE.getGuiDiagramItem();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_DIAGRAM_ITEM__TOOLTIP = eINSTANCE.getGuiDiagramItem_Tooltip();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramRectangleImpl <em>Gui Diagram Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiDiagramRectangleImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiDiagramRectangle()
		 * @generated
		 */
		EClass GUI_DIAGRAM_RECTANGLE = eINSTANCE.getGuiDiagramRectangle();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_DIAGRAM_RECTANGLE__X = eINSTANCE.getGuiDiagramRectangle_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_DIAGRAM_RECTANGLE__Y = eINSTANCE.getGuiDiagramRectangle_Y();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_DIAGRAM_RECTANGLE__H = eINSTANCE.getGuiDiagramRectangle_H();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_DIAGRAM_RECTANGLE__W = eINSTANCE.getGuiDiagramRectangle_W();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiHtmlImpl <em>Gui Html</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiHtmlImpl
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiHtml()
		 * @generated
		 */
		EClass GUI_HTML = eINSTANCE.getGuiHtml();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_HTML__HTML = eINSTANCE.getGuiHtml_Html();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiView <em>Gui View</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiView
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiView()
		 * @generated
		 */
		EEnum GUI_VIEW = eINSTANCE.getGuiView();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType <em>Gui Table Column Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getGuiTableColumnType()
		 * @generated
		 */
		EEnum GUI_TABLE_COLUMN_TYPE = eINSTANCE.getGuiTableColumnType();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //ModelPackage
