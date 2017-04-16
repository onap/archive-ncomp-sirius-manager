
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Graph Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getX <em>X</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getY <em>Y</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getH <em>H</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getW <em>W</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.graph.GraphPackage#getGuiGraphNode()
 * @model
 * @generated
 */
public interface GuiGraphNode extends GuiGraphItem {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Integer)
	 * @see org.openecomp.ncomp.sirius.manager.graph.GraphPackage#getGuiGraphNode_X()
	 * @model unique="false"
	 * @generated
	 */
	Integer getX();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Integer value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Integer)
	 * @see org.openecomp.ncomp.sirius.manager.graph.GraphPackage#getGuiGraphNode_Y()
	 * @model unique="false"
	 * @generated
	 */
	Integer getY();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Integer value);

	/**
	 * Returns the value of the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' attribute.
	 * @see #setH(Integer)
	 * @see org.openecomp.ncomp.sirius.manager.graph.GraphPackage#getGuiGraphNode_H()
	 * @model unique="false"
	 * @generated
	 */
	Integer getH();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getH <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H</em>' attribute.
	 * @see #getH()
	 * @generated
	 */
	void setH(Integer value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' attribute.
	 * @see #setW(Integer)
	 * @see org.openecomp.ncomp.sirius.manager.graph.GraphPackage#getGuiGraphNode_W()
	 * @model unique="false"
	 * @generated
	 */
	Integer getW();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphNode#getW <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' attribute.
	 * @see #getW()
	 * @generated
	 */
	void setW(Integer value);

} // GuiGraphNode
