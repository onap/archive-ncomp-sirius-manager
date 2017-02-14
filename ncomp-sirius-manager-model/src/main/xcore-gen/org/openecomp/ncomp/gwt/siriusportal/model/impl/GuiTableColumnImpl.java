
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
package org.openecomp.ncomp.gwt.siriusportal.model.impl;

import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Table Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl#getColName <em>Col Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl#getTooltip <em>Tooltip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableColumnImpl#getColumnType <em>Column Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiTableColumnImpl extends MinimalEObjectImpl.Container implements GuiTableColumn {
	/**
	 * The default value of the '{@link #getColName() <em>Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColName()
	 * @generated
	 * @ordered
	 */
	protected static final String COL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColName() <em>Col Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColName()
	 * @generated
	 * @ordered
	 */
	protected String colName = COL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOLTIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTooltip() <em>Tooltip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooltip()
	 * @generated
	 * @ordered
	 */
	protected String tooltip = TOOLTIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnType() <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @generated
	 * @ordered
	 */
	protected static final GuiTableColumnType COLUMN_TYPE_EDEFAULT = GuiTableColumnType.STRING;

	/**
	 * The cached value of the '{@link #getColumnType() <em>Column Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnType()
	 * @generated
	 * @ordered
	 */
	protected GuiTableColumnType columnType = COLUMN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiTableColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GUI_TABLE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColName() {
		return colName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColName(String newColName) {
		String oldColName = colName;
		colName = newColName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TABLE_COLUMN__COL_NAME, oldColName, colName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTooltip() {
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooltip(String newTooltip) {
		String oldTooltip = tooltip;
		tooltip = newTooltip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TABLE_COLUMN__TOOLTIP, oldTooltip, tooltip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TABLE_COLUMN__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TABLE_COLUMN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TABLE_COLUMN__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableColumnType getColumnType() {
		return columnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnType(GuiTableColumnType newColumnType) {
		GuiTableColumnType oldColumnType = columnType;
		columnType = newColumnType == null ? COLUMN_TYPE_EDEFAULT : newColumnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TABLE_COLUMN__COLUMN_TYPE, oldColumnType, columnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.GUI_TABLE_COLUMN__COL_NAME:
				return getColName();
			case ModelPackage.GUI_TABLE_COLUMN__TOOLTIP:
				return getTooltip();
			case ModelPackage.GUI_TABLE_COLUMN__FORMAT:
				return getFormat();
			case ModelPackage.GUI_TABLE_COLUMN__WIDTH:
				return getWidth();
			case ModelPackage.GUI_TABLE_COLUMN__HIDDEN:
				return isHidden();
			case ModelPackage.GUI_TABLE_COLUMN__COLUMN_TYPE:
				return getColumnType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.GUI_TABLE_COLUMN__COL_NAME:
				setColName((String)newValue);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__TOOLTIP:
				setTooltip((String)newValue);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__FORMAT:
				setFormat((String)newValue);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__COLUMN_TYPE:
				setColumnType((GuiTableColumnType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.GUI_TABLE_COLUMN__COL_NAME:
				setColName(COL_NAME_EDEFAULT);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__TOOLTIP:
				setTooltip(TOOLTIP_EDEFAULT);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case ModelPackage.GUI_TABLE_COLUMN__COLUMN_TYPE:
				setColumnType(COLUMN_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.GUI_TABLE_COLUMN__COL_NAME:
				return COL_NAME_EDEFAULT == null ? colName != null : !COL_NAME_EDEFAULT.equals(colName);
			case ModelPackage.GUI_TABLE_COLUMN__TOOLTIP:
				return TOOLTIP_EDEFAULT == null ? tooltip != null : !TOOLTIP_EDEFAULT.equals(tooltip);
			case ModelPackage.GUI_TABLE_COLUMN__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case ModelPackage.GUI_TABLE_COLUMN__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ModelPackage.GUI_TABLE_COLUMN__HIDDEN:
				return hidden != HIDDEN_EDEFAULT;
			case ModelPackage.GUI_TABLE_COLUMN__COLUMN_TYPE:
				return columnType != COLUMN_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (colName: ");
		result.append(colName);
		result.append(", tooltip: ");
		result.append(tooltip);
		result.append(", format: ");
		result.append(format);
		result.append(", width: ");
		result.append(width);
		result.append(", hidden: ");
		result.append(hidden);
		result.append(", columnType: ");
		result.append(columnType);
		result.append(')');
		return result.toString();
	}

} //GuiTableColumnImpl
