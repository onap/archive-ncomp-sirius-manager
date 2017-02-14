
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Table Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getColName <em>Col Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getFormat <em>Format</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getWidth <em>Width</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getColumnType <em>Column Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTableColumn()
 * @model
 * @generated
 */
public interface GuiTableColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Col Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Name</em>' attribute.
	 * @see #setColName(String)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTableColumn_ColName()
	 * @model unique="false"
	 * @generated
	 */
	String getColName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getColName <em>Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Name</em>' attribute.
	 * @see #getColName()
	 * @generated
	 */
	void setColName(String value);

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tooltip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tooltip</em>' attribute.
	 * @see #setTooltip(String)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTableColumn_Tooltip()
	 * @model unique="false"
	 * @generated
	 */
	String getTooltip();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getTooltip <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' attribute.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTableColumn_Format()
	 * @model unique="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTableColumn_Width()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Hidden</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden</em>' attribute.
	 * @see #setHidden(boolean)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTableColumn_Hidden()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isHidden();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#isHidden <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden</em>' attribute.
	 * @see #isHidden()
	 * @generated
	 */
	void setHidden(boolean value);

	/**
	 * Returns the value of the '<em><b>Column Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Type</em>' attribute.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType
	 * @see #setColumnType(GuiTableColumnType)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTableColumn_ColumnType()
	 * @model unique="false"
	 * @generated
	 */
	GuiTableColumnType getColumnType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn#getColumnType <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Type</em>' attribute.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType
	 * @see #getColumnType()
	 * @generated
	 */
	void setColumnType(GuiTableColumnType value);

} // GuiTableColumn
