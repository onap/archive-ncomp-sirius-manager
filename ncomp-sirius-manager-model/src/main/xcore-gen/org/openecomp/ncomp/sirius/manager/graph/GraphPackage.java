
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
package org.openecomp.ncomp.sirius.manager.graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.ncomp.sirius.manager.graph.GraphFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-sirius-manager-model/src/main/xcore-gen' updateClasspath='false' basePackage='org.openecomp.ncomp.sirius.manager'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore GenModel='http://www.eclipse.org/emf/2002/GenModel'"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.sirius.manager.graph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphImpl <em>Gui Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphImpl
	 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl#getGuiGraph()
	 * @generated
	 */
	int GUI_GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__NODES = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH__EDGES = 1;

	/**
	 * The number of structural features of the '<em>Gui Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gui Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphItemImpl <em>Gui Graph Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphItemImpl
	 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl#getGuiGraphItem()
	 * @generated
	 */
	int GUI_GRAPH_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_ITEM__TOOLTIP = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_ITEM__URL = 2;

	/**
	 * The number of structural features of the '<em>Gui Graph Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gui Graph Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphNodeImpl <em>Gui Graph Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphNodeImpl
	 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl#getGuiGraphNode()
	 * @generated
	 */
	int GUI_GRAPH_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__NAME = GUI_GRAPH_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__TOOLTIP = GUI_GRAPH_ITEM__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__URL = GUI_GRAPH_ITEM__URL;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__X = GUI_GRAPH_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__Y = GUI_GRAPH_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__H = GUI_GRAPH_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE__W = GUI_GRAPH_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gui Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE_FEATURE_COUNT = GUI_GRAPH_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Gui Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_NODE_OPERATION_COUNT = GUI_GRAPH_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphEdgeImpl <em>Gui Graph Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphEdgeImpl
	 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl#getGuiGraphEdge()
	 * @generated
	 */
	int GUI_GRAPH_EDGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_EDGE__NAME = GUI_GRAPH_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_EDGE__TOOLTIP = GUI_GRAPH_ITEM__TOOLTIP;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_EDGE__URL = GUI_GRAPH_ITEM__URL;

	/**
	 * The feature id for the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_EDGE__X = GUI_GRAPH_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_EDGE__Y = GUI_GRAPH_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gui Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_EDGE_FEATURE_COUNT = GUI_GRAPH_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gui Graph Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_GRAPH_EDGE_OPERATION_COUNT = GUI_GRAPH_ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraph <em>Gui Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Graph</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraph
	 * @generated
	 */
	EClass getGuiGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraph#getNodes()
	 * @see #getGuiGraph()
	 * @generated
	 */
	EReference getGuiGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraph#getEdges()
	 * @see #getGuiGraph()
	 * @generated
	 */
	EReference getGuiGraph_Edges();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphItem <em>Gui Graph Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Graph Item</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphItem
	 * @generated
	 */
	EClass getGuiGraphItem();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphItem#getName()
	 * @see #getGuiGraphItem()
	 * @generated
	 */
	EAttribute getGuiGraphItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphItem#getTooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tooltip</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphItem#getTooltip()
	 * @see #getGuiGraphItem()
	 * @generated
	 */
	EAttribute getGuiGraphItem_Tooltip();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphItem#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphItem#getUrl()
	 * @see #getGuiGraphItem()
	 * @generated
	 */
	EAttribute getGuiGraphItem_Url();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode <em>Gui Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Graph Node</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode
	 * @generated
	 */
	EClass getGuiGraphNode();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getX()
	 * @see #getGuiGraphNode()
	 * @generated
	 */
	EAttribute getGuiGraphNode_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getY()
	 * @see #getGuiGraphNode()
	 * @generated
	 */
	EAttribute getGuiGraphNode_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getH()
	 * @see #getGuiGraphNode()
	 * @generated
	 */
	EAttribute getGuiGraphNode_H();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getW()
	 * @see #getGuiGraphNode()
	 * @generated
	 */
	EAttribute getGuiGraphNode_W();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge <em>Gui Graph Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Graph Edge</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge
	 * @generated
	 */
	EClass getGuiGraphEdge();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>X</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge#getX()
	 * @see #getGuiGraphEdge()
	 * @generated
	 */
	EReference getGuiGraphEdge_X();

	/**
	 * Returns the meta object for the reference '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Y</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge#getY()
	 * @see #getGuiGraphEdge()
	 * @generated
	 */
	EReference getGuiGraphEdge_Y();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

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
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphImpl <em>Gui Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphImpl
		 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl#getGuiGraph()
		 * @generated
		 */
		EClass GUI_GRAPH = eINSTANCE.getGuiGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_GRAPH__NODES = eINSTANCE.getGuiGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_GRAPH__EDGES = eINSTANCE.getGuiGraph_Edges();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphItemImpl <em>Gui Graph Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphItemImpl
		 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl#getGuiGraphItem()
		 * @generated
		 */
		EClass GUI_GRAPH_ITEM = eINSTANCE.getGuiGraphItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_GRAPH_ITEM__NAME = eINSTANCE.getGuiGraphItem_Name();

		/**
		 * The meta object literal for the '<em><b>Tooltip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_GRAPH_ITEM__TOOLTIP = eINSTANCE.getGuiGraphItem_Tooltip();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_GRAPH_ITEM__URL = eINSTANCE.getGuiGraphItem_Url();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphNodeImpl <em>Gui Graph Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphNodeImpl
		 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl#getGuiGraphNode()
		 * @generated
		 */
		EClass GUI_GRAPH_NODE = eINSTANCE.getGuiGraphNode();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_GRAPH_NODE__X = eINSTANCE.getGuiGraphNode_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_GRAPH_NODE__Y = eINSTANCE.getGuiGraphNode_Y();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_GRAPH_NODE__H = eINSTANCE.getGuiGraphNode_H();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_GRAPH_NODE__W = eINSTANCE.getGuiGraphNode_W();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphEdgeImpl <em>Gui Graph Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GuiGraphEdgeImpl
		 * @see org.openecomp.ncomp.sirius.manager.graph.impl.GraphPackageImpl#getGuiGraphEdge()
		 * @generated
		 */
		EClass GUI_GRAPH_EDGE = eINSTANCE.getGuiGraphEdge();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_GRAPH_EDGE__X = eINSTANCE.getGuiGraphEdge_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUI_GRAPH_EDGE__Y = eINSTANCE.getGuiGraphEdge_Y();

	}

} //GraphPackage
