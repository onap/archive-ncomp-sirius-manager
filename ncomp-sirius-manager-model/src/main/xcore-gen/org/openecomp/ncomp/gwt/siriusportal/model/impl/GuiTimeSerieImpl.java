
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

import org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Time Serie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl#getXAxisDateFormat <em>XAxis Date Format</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl#isIsRate <em>Is Rate</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.impl.GuiTimeSerieImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuiTimeSerieImpl extends MinimalEObjectImpl.Container implements GuiTimeSerie {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXAxisLabel() <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String xAxisLabel = XAXIS_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getXAxisDateFormat() <em>XAxis Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisDateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String XAXIS_DATE_FORMAT_EDEFAULT = "MM-dd HH:mm";

	/**
	 * The cached value of the '{@link #getXAxisDateFormat() <em>XAxis Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisDateFormat()
	 * @generated
	 * @ordered
	 */
	protected String xAxisDateFormat = XAXIS_DATE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String YAXIS_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYAxisLabel() <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAxisLabel()
	 * @generated
	 * @ordered
	 */
	protected String yAxisLabel = YAXIS_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Date end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRate() <em>Is Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRate() <em>Is Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRate()
	 * @generated
	 * @ordered
	 */
	protected boolean isRate = IS_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<GuiTimeSerieData> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiTimeSerieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GUI_TIME_SERIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TIME_SERIE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXAxisLabel() {
		return xAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxisLabel(String newXAxisLabel) {
		String oldXAxisLabel = xAxisLabel;
		xAxisLabel = newXAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TIME_SERIE__XAXIS_LABEL, oldXAxisLabel, xAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXAxisDateFormat() {
		return xAxisDateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxisDateFormat(String newXAxisDateFormat) {
		String oldXAxisDateFormat = xAxisDateFormat;
		xAxisDateFormat = newXAxisDateFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TIME_SERIE__XAXIS_DATE_FORMAT, oldXAxisDateFormat, xAxisDateFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYAxisLabel() {
		return yAxisLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAxisLabel(String newYAxisLabel) {
		String oldYAxisLabel = yAxisLabel;
		yAxisLabel = newYAxisLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TIME_SERIE__YAXIS_LABEL, oldYAxisLabel, yAxisLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TIME_SERIE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		Date oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TIME_SERIE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRate() {
		return isRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRate(boolean newIsRate) {
		boolean oldIsRate = isRate;
		isRate = newIsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_TIME_SERIE__IS_RATE, oldIsRate, isRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuiTimeSerieData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<GuiTimeSerieData>(GuiTimeSerieData.class, this, ModelPackage.GUI_TIME_SERIE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GUI_TIME_SERIE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.GUI_TIME_SERIE__NAME:
				return getName();
			case ModelPackage.GUI_TIME_SERIE__XAXIS_LABEL:
				return getXAxisLabel();
			case ModelPackage.GUI_TIME_SERIE__XAXIS_DATE_FORMAT:
				return getXAxisDateFormat();
			case ModelPackage.GUI_TIME_SERIE__YAXIS_LABEL:
				return getYAxisLabel();
			case ModelPackage.GUI_TIME_SERIE__START:
				return getStart();
			case ModelPackage.GUI_TIME_SERIE__END:
				return getEnd();
			case ModelPackage.GUI_TIME_SERIE__IS_RATE:
				return isIsRate();
			case ModelPackage.GUI_TIME_SERIE__DATA:
				return getData();
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
			case ModelPackage.GUI_TIME_SERIE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.GUI_TIME_SERIE__XAXIS_LABEL:
				setXAxisLabel((String)newValue);
				return;
			case ModelPackage.GUI_TIME_SERIE__XAXIS_DATE_FORMAT:
				setXAxisDateFormat((String)newValue);
				return;
			case ModelPackage.GUI_TIME_SERIE__YAXIS_LABEL:
				setYAxisLabel((String)newValue);
				return;
			case ModelPackage.GUI_TIME_SERIE__START:
				setStart((Date)newValue);
				return;
			case ModelPackage.GUI_TIME_SERIE__END:
				setEnd((Date)newValue);
				return;
			case ModelPackage.GUI_TIME_SERIE__IS_RATE:
				setIsRate((Boolean)newValue);
				return;
			case ModelPackage.GUI_TIME_SERIE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends GuiTimeSerieData>)newValue);
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
			case ModelPackage.GUI_TIME_SERIE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.GUI_TIME_SERIE__XAXIS_LABEL:
				setXAxisLabel(XAXIS_LABEL_EDEFAULT);
				return;
			case ModelPackage.GUI_TIME_SERIE__XAXIS_DATE_FORMAT:
				setXAxisDateFormat(XAXIS_DATE_FORMAT_EDEFAULT);
				return;
			case ModelPackage.GUI_TIME_SERIE__YAXIS_LABEL:
				setYAxisLabel(YAXIS_LABEL_EDEFAULT);
				return;
			case ModelPackage.GUI_TIME_SERIE__START:
				setStart(START_EDEFAULT);
				return;
			case ModelPackage.GUI_TIME_SERIE__END:
				setEnd(END_EDEFAULT);
				return;
			case ModelPackage.GUI_TIME_SERIE__IS_RATE:
				setIsRate(IS_RATE_EDEFAULT);
				return;
			case ModelPackage.GUI_TIME_SERIE__DATA:
				getData().clear();
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
			case ModelPackage.GUI_TIME_SERIE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.GUI_TIME_SERIE__XAXIS_LABEL:
				return XAXIS_LABEL_EDEFAULT == null ? xAxisLabel != null : !XAXIS_LABEL_EDEFAULT.equals(xAxisLabel);
			case ModelPackage.GUI_TIME_SERIE__XAXIS_DATE_FORMAT:
				return XAXIS_DATE_FORMAT_EDEFAULT == null ? xAxisDateFormat != null : !XAXIS_DATE_FORMAT_EDEFAULT.equals(xAxisDateFormat);
			case ModelPackage.GUI_TIME_SERIE__YAXIS_LABEL:
				return YAXIS_LABEL_EDEFAULT == null ? yAxisLabel != null : !YAXIS_LABEL_EDEFAULT.equals(yAxisLabel);
			case ModelPackage.GUI_TIME_SERIE__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case ModelPackage.GUI_TIME_SERIE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case ModelPackage.GUI_TIME_SERIE__IS_RATE:
				return isRate != IS_RATE_EDEFAULT;
			case ModelPackage.GUI_TIME_SERIE__DATA:
				return data != null && !data.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", xAxisLabel: ");
		result.append(xAxisLabel);
		result.append(", xAxisDateFormat: ");
		result.append(xAxisDateFormat);
		result.append(", yAxisLabel: ");
		result.append(yAxisLabel);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", isRate: ");
		result.append(isRate);
		result.append(')');
		return result.toString();
	}

} //GuiTimeSerieImpl
