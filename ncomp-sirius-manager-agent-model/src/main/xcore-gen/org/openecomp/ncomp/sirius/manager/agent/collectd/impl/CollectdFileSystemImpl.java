
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
package org.openecomp.ncomp.sirius.manager.agent.collectd.impl;

import org.openecomp.ncomp.core.alerts.Alert;
import org.openecomp.ncomp.core.alerts.AlertContainer;
import org.openecomp.ncomp.core.alerts.AlertingTemplate;
import org.openecomp.ncomp.core.alerts.AlertsPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage;

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
 * An implementation of the model object '<em><b>File System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFileSystemImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFileSystemImpl#getAlertingTemplate <em>Alerting Template</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFileSystemImpl#getUsed <em>Used</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFileSystemImpl#getFree <em>Free</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectdFileSystemImpl extends NamedEntityImpl implements CollectdFileSystem {
	/**
	 * The cached value of the '{@link #getAlerts() <em>Alerts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlerts()
	 * @generated
	 * @ordered
	 */
	protected EList<Alert> alerts;

	/**
	 * The cached value of the '{@link #getAlertingTemplate() <em>Alerting Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertingTemplate()
	 * @generated
	 * @ordered
	 */
	protected AlertingTemplate alertingTemplate;

	/**
	 * The default value of the '{@link #getUsed() <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute USED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsed() <em>Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsed()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute used = USED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute FREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute free = FREE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdFileSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_FILE_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTS);
		}
		return alerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertingTemplate getAlertingTemplate() {
		if (alertingTemplate != null && alertingTemplate.eIsProxy()) {
			InternalEObject oldAlertingTemplate = (InternalEObject)alertingTemplate;
			alertingTemplate = (AlertingTemplate)eResolveProxy(oldAlertingTemplate);
			if (alertingTemplate != oldAlertingTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
			}
		}
		return alertingTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertingTemplate basicGetAlertingTemplate() {
		return alertingTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlertingTemplate(AlertingTemplate newAlertingTemplate) {
		AlertingTemplate oldAlertingTemplate = alertingTemplate;
		alertingTemplate = newAlertingTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getUsed() {
		return used;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsed(DoubleMetricAttribute newUsed) {
		DoubleMetricAttribute oldUsed = used;
		used = newUsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_FILE_SYSTEM__USED, oldUsed, used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getFree() {
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree(DoubleMetricAttribute newFree) {
		DoubleMetricAttribute oldFree = free;
		free = newFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_FILE_SYSTEM__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTS:
				return ((InternalEList<?>)getAlerts()).basicRemove(otherEnd, msgs);
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
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTS:
				return getAlerts();
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE:
				if (resolve) return getAlertingTemplate();
				return basicGetAlertingTemplate();
			case CollectdPackage.COLLECTD_FILE_SYSTEM__USED:
				return getUsed();
			case CollectdPackage.COLLECTD_FILE_SYSTEM__FREE:
				return getFree();
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
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends Alert>)newValue);
				return;
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)newValue);
				return;
			case CollectdPackage.COLLECTD_FILE_SYSTEM__USED:
				setUsed((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_FILE_SYSTEM__FREE:
				setFree((DoubleMetricAttribute)newValue);
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
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTS:
				getAlerts().clear();
				return;
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)null);
				return;
			case CollectdPackage.COLLECTD_FILE_SYSTEM__USED:
				setUsed(USED_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_FILE_SYSTEM__FREE:
				setFree(FREE_EDEFAULT);
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
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTS:
				return alerts != null && !alerts.isEmpty();
			case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE:
				return alertingTemplate != null;
			case CollectdPackage.COLLECTD_FILE_SYSTEM__USED:
				return USED_EDEFAULT == null ? used != null : !USED_EDEFAULT.equals(used);
			case CollectdPackage.COLLECTD_FILE_SYSTEM__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
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
		if (baseClass == AlertContainer.class) {
			switch (derivedFeatureID) {
				case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTS: return AlertsPackage.ALERT_CONTAINER__ALERTS;
				case CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE: return AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE;
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
		if (baseClass == AlertContainer.class) {
			switch (baseFeatureID) {
				case AlertsPackage.ALERT_CONTAINER__ALERTS: return CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTS;
				case AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE: return CollectdPackage.COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE;
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
		result.append(" (used: ");
		result.append(used);
		result.append(", free: ");
		result.append(free);
		result.append(')');
		return result.toString();
	}

} //CollectdFileSystemImpl
