
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
 * A representation of the model object '<em><b>Gui Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge#getX <em>X</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.graph.GraphPackage#getGuiGraphEdge()
 * @model
 * @generated
 */
public interface GuiGraphEdge extends GuiGraphItem {
	/**
	 * Returns the value of the '<em><b>X</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' reference.
	 * @see #setX(GuiGraphNode)
	 * @see org.openecomp.ncomp.sirius.manager.graph.GraphPackage#getGuiGraphEdge_X()
	 * @model
	 * @generated
	 */
	GuiGraphNode getX();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge#getX <em>X</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(GuiGraphNode value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' reference.
	 * @see #setY(GuiGraphNode)
	 * @see org.openecomp.ncomp.sirius.manager.graph.GraphPackage#getGuiGraphEdge_Y()
	 * @model
	 * @generated
	 */
	GuiGraphNode getY();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.graph.GuiGraphEdge#getY <em>Y</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' reference.
	 * @see #getY()
	 * @generated
	 */
	void setY(GuiGraphNode value);

} // GuiGraphEdge
