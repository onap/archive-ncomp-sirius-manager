
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTable#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTable#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTable()
 * @model
 * @generated
 */
public interface GuiTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuiTableColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuiTableRow> getRows();

} // GuiTable
