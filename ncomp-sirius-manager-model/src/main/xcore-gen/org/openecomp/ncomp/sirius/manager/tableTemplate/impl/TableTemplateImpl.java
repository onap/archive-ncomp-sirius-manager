
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
package org.openecomp.ncomp.sirius.manager.tableTemplate.impl;

import org.openecomp.ncomp.sirius.manager.tableTemplate.HasColumnsTableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateColumn;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateImpl#getRowPath <em>Row Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableTemplateImpl extends AbstractTableTemplateImpl implements TableTemplate {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<TableTemplateColumn> columns;

	/**
	 * The default value of the '{@link #getRowPath() <em>Row Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowPath() <em>Row Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowPath()
	 * @generated
	 * @ordered
	 */
	protected String rowPath = ROW_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableTemplatePackage.Literals.TABLE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableTemplateColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<TableTemplateColumn>(TableTemplateColumn.class, this, TableTemplatePackage.TABLE_TEMPLATE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRowPath() {
		return rowPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowPath(String newRowPath) {
		String oldRowPath = rowPath;
		rowPath = newRowPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableTemplatePackage.TABLE_TEMPLATE__ROW_PATH, oldRowPath, rowPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TableTemplatePackage.TABLE_TEMPLATE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TableTemplatePackage.TABLE_TEMPLATE__COLUMNS:
				return getColumns();
			case TableTemplatePackage.TABLE_TEMPLATE__ROW_PATH:
				return getRowPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TableTemplatePackage.TABLE_TEMPLATE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends TableTemplateColumn>)newValue);
				return;
			case TableTemplatePackage.TABLE_TEMPLATE__ROW_PATH:
				setRowPath((String)newValue);
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
			case TableTemplatePackage.TABLE_TEMPLATE__COLUMNS:
				getColumns().clear();
				return;
			case TableTemplatePackage.TABLE_TEMPLATE__ROW_PATH:
				setRowPath(ROW_PATH_EDEFAULT);
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
			case TableTemplatePackage.TABLE_TEMPLATE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case TableTemplatePackage.TABLE_TEMPLATE__ROW_PATH:
				return ROW_PATH_EDEFAULT == null ? rowPath != null : !ROW_PATH_EDEFAULT.equals(rowPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == HasColumnsTableTemplate.class) {
			switch (derivedFeatureID) {
				case TableTemplatePackage.TABLE_TEMPLATE__COLUMNS: return TableTemplatePackage.HAS_COLUMNS_TABLE_TEMPLATE__COLUMNS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == HasColumnsTableTemplate.class) {
			switch (baseFeatureID) {
				case TableTemplatePackage.HAS_COLUMNS_TABLE_TEMPLATE__COLUMNS: return TableTemplatePackage.TABLE_TEMPLATE__COLUMNS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (rowPath: ");
		result.append(rowPath);
		result.append(')');
		return result.toString();
	}

} //TableTemplateImpl
