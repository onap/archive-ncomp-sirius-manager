
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

import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Table Cell Double</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDoubleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTableCellDoubleImpl#getTimeseriesPath <em>Timeseries Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiTableCellDoubleImpl extends GuiTableCellImpl implements GuiTableCellDouble {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeseriesPath() <em>Timeseries Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeseriesPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESERIES_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeseriesPath() <em>Timeseries Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeseriesPath()
	 * @generated
	 * @ordered
	 */
	protected String timeseriesPath = TIMESERIES_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiTableCellDoubleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GUI_TABLE_CELL_DOUBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TABLE_CELL_DOUBLE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeseriesPath() {
		return timeseriesPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeseriesPath(String newTimeseriesPath) {
		String oldTimeseriesPath = timeseriesPath;
		timeseriesPath = newTimeseriesPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TABLE_CELL_DOUBLE__TIMESERIES_PATH, oldTimeseriesPath, timeseriesPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.GUI_TABLE_CELL_DOUBLE__VALUE:
				return getValue();
			case ModelPackage.GUI_TABLE_CELL_DOUBLE__TIMESERIES_PATH:
				return getTimeseriesPath();
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
			case ModelPackage.GUI_TABLE_CELL_DOUBLE__VALUE:
				setValue((Double)newValue);
				return;
			case ModelPackage.GUI_TABLE_CELL_DOUBLE__TIMESERIES_PATH:
				setTimeseriesPath((String)newValue);
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
			case ModelPackage.GUI_TABLE_CELL_DOUBLE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ModelPackage.GUI_TABLE_CELL_DOUBLE__TIMESERIES_PATH:
				setTimeseriesPath(TIMESERIES_PATH_EDEFAULT);
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
			case ModelPackage.GUI_TABLE_CELL_DOUBLE__VALUE:
				return value != VALUE_EDEFAULT;
			case ModelPackage.GUI_TABLE_CELL_DOUBLE__TIMESERIES_PATH:
				return TIMESERIES_PATH_EDEFAULT == null ? timeseriesPath != null : !TIMESERIES_PATH_EDEFAULT.equals(timeseriesPath);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", timeseriesPath: ");
		result.append(timeseriesPath);
		result.append(')');
		return result.toString();
	}

} //GuiTableCellDoubleImpl
