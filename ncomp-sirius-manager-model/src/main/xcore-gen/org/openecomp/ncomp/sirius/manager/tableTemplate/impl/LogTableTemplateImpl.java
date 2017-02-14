
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

import org.openecomp.ncomp.core.logs.LogLevel;
import org.openecomp.ncomp.core.logs.LogSeverity;

import org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Table Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl#getMinLevel <em>Min Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl#getMinSeverity <em>Min Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl#getPrefixResourcePath <em>Prefix Resource Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.impl.LogTableTemplateImpl#getAggregationDuration <em>Aggregation Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogTableTemplateImpl extends AbstractTableTemplateImpl implements LogTableTemplate {
	/**
	 * The default value of the '{@link #getMinLevel() <em>Min Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLevel()
	 * @generated
	 * @ordered
	 */
	protected static final LogLevel MIN_LEVEL_EDEFAULT = LogLevel.UNKNOWN;

	/**
	 * The cached value of the '{@link #getMinLevel() <em>Min Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLevel()
	 * @generated
	 * @ordered
	 */
	protected LogLevel minLevel = MIN_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSeverity() <em>Min Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final LogSeverity MIN_SEVERITY_EDEFAULT = LogSeverity.UNKNOWN;

	/**
	 * The cached value of the '{@link #getMinSeverity() <em>Min Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSeverity()
	 * @generated
	 * @ordered
	 */
	protected LogSeverity minSeverity = MIN_SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefixResourcePath() <em>Prefix Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixResourcePath()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_RESOURCE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixResourcePath() <em>Prefix Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixResourcePath()
	 * @generated
	 * @ordered
	 */
	protected String prefixResourcePath = PREFIX_RESOURCE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationDuration() <em>Aggregation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationDuration() <em>Aggregation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationDuration()
	 * @generated
	 * @ordered
	 */
	protected String aggregationDuration = AGGREGATION_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogTableTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TableTemplatePackage.Literals.LOG_TABLE_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogLevel getMinLevel() {
		return minLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLevel(LogLevel newMinLevel) {
		LogLevel oldMinLevel = minLevel;
		minLevel = newMinLevel == null ? MIN_LEVEL_EDEFAULT : newMinLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_LEVEL, oldMinLevel, minLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogSeverity getMinSeverity() {
		return minSeverity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinSeverity(LogSeverity newMinSeverity) {
		LogSeverity oldMinSeverity = minSeverity;
		minSeverity = newMinSeverity == null ? MIN_SEVERITY_EDEFAULT : newMinSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_SEVERITY, oldMinSeverity, minSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefixResourcePath() {
		return prefixResourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefixResourcePath(String newPrefixResourcePath) {
		String oldPrefixResourcePath = prefixResourcePath;
		prefixResourcePath = newPrefixResourcePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableTemplatePackage.LOG_TABLE_TEMPLATE__PREFIX_RESOURCE_PATH, oldPrefixResourcePath, prefixResourcePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableTemplatePackage.LOG_TABLE_TEMPLATE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregationDuration() {
		return aggregationDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationDuration(String newAggregationDuration) {
		String oldAggregationDuration = aggregationDuration;
		aggregationDuration = newAggregationDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TableTemplatePackage.LOG_TABLE_TEMPLATE__AGGREGATION_DURATION, oldAggregationDuration, aggregationDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_LEVEL:
				return getMinLevel();
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_SEVERITY:
				return getMinSeverity();
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__PREFIX_RESOURCE_PATH:
				return getPrefixResourcePath();
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__DURATION:
				return getDuration();
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__AGGREGATION_DURATION:
				return getAggregationDuration();
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
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_LEVEL:
				setMinLevel((LogLevel)newValue);
				return;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_SEVERITY:
				setMinSeverity((LogSeverity)newValue);
				return;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__PREFIX_RESOURCE_PATH:
				setPrefixResourcePath((String)newValue);
				return;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__DURATION:
				setDuration((String)newValue);
				return;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__AGGREGATION_DURATION:
				setAggregationDuration((String)newValue);
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
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_LEVEL:
				setMinLevel(MIN_LEVEL_EDEFAULT);
				return;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_SEVERITY:
				setMinSeverity(MIN_SEVERITY_EDEFAULT);
				return;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__PREFIX_RESOURCE_PATH:
				setPrefixResourcePath(PREFIX_RESOURCE_PATH_EDEFAULT);
				return;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__AGGREGATION_DURATION:
				setAggregationDuration(AGGREGATION_DURATION_EDEFAULT);
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
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_LEVEL:
				return minLevel != MIN_LEVEL_EDEFAULT;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__MIN_SEVERITY:
				return minSeverity != MIN_SEVERITY_EDEFAULT;
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__PREFIX_RESOURCE_PATH:
				return PREFIX_RESOURCE_PATH_EDEFAULT == null ? prefixResourcePath != null : !PREFIX_RESOURCE_PATH_EDEFAULT.equals(prefixResourcePath);
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case TableTemplatePackage.LOG_TABLE_TEMPLATE__AGGREGATION_DURATION:
				return AGGREGATION_DURATION_EDEFAULT == null ? aggregationDuration != null : !AGGREGATION_DURATION_EDEFAULT.equals(aggregationDuration);
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
		result.append(" (minLevel: ");
		result.append(minLevel);
		result.append(", minSeverity: ");
		result.append(minSeverity);
		result.append(", prefixResourcePath: ");
		result.append(prefixResourcePath);
		result.append(", duration: ");
		result.append(duration);
		result.append(", aggregationDuration: ");
		result.append(aggregationDuration);
		result.append(')');
		return result.toString();
	}

} //LogTableTemplateImpl
