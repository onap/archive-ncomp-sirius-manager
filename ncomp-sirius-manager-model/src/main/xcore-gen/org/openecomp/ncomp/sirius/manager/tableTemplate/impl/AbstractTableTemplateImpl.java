
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

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Table Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.AbstractTableTemplateImpl#getTreePath <em>Tree Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.AbstractTableTemplateImpl#getTablePath <em>Table Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTableTemplateImpl extends NamedEntityImpl implements AbstractTableTemplate {
	/**
	 * The default value of the '{@link #getTreePath() <em>Tree Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreePath()
	 * @generated
	 * @ordered
	 */
	protected static final String TREE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreePath() <em>Tree Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreePath()
	 * @generated
	 * @ordered
	 */
	protected String treePath = TREE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTablePath() <em>Table Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablePath()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTablePath() <em>Table Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablePath()
	 * @generated
	 * @ordered
	 */
	protected String tablePath = TABLE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTableTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableTemplatePackage.Literals.ABSTRACT_TABLE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTreePath() {
		return treePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreePath(String newTreePath) {
		String oldTreePath = treePath;
		treePath = newTreePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TREE_PATH, oldTreePath, treePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTablePath() {
		return tablePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablePath(String newTablePath) {
		String oldTablePath = tablePath;
		tablePath = newTablePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TABLE_PATH, oldTablePath, tablePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TREE_PATH:
				return getTreePath();
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TABLE_PATH:
				return getTablePath();
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
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TREE_PATH:
				setTreePath((String)newValue);
				return;
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TABLE_PATH:
				setTablePath((String)newValue);
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
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TREE_PATH:
				setTreePath(TREE_PATH_EDEFAULT);
				return;
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TABLE_PATH:
				setTablePath(TABLE_PATH_EDEFAULT);
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
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TREE_PATH:
				return TREE_PATH_EDEFAULT == null ? treePath != null : !TREE_PATH_EDEFAULT.equals(treePath);
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE__TABLE_PATH:
				return TABLE_PATH_EDEFAULT == null ? tablePath != null : !TABLE_PATH_EDEFAULT.equals(tablePath);
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
		result.append(" (treePath: ");
		result.append(treePath);
		result.append(", tablePath: ");
		result.append(tablePath);
		result.append(')');
		return result.toString();
	}

} //AbstractTableTemplateImpl
