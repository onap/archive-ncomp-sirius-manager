
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
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu;
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
 * An implementation of the model object '<em><b>Cpu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl#getAlertingTemplate <em>Alerting Template</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl#getIdle <em>Idle</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectdCpuImpl extends NamedEntityImpl implements CollectdCpu {
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
	 * The default value of the '{@link #getIdle() <em>Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdle()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdle() <em>Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdle()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute idle = IDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWait() <em>Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute WAIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute wait = WAIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute system = SYSTEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdCpuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_CPU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, CollectdPackage.COLLECTD_CPU__ALERTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectdPackage.COLLECTD_CPU__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_CPU__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIdle() {
		return idle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdle(IncreasingULongMetricAttribute newIdle) {
		IncreasingULongMetricAttribute oldIdle = idle;
		idle = newIdle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_CPU__IDLE, oldIdle, idle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getWait() {
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(IncreasingULongMetricAttribute newWait) {
		IncreasingULongMetricAttribute oldWait = wait;
		wait = newWait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_CPU__WAIT, oldWait, wait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(IncreasingULongMetricAttribute newUser) {
		IncreasingULongMetricAttribute oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_CPU__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(IncreasingULongMetricAttribute newSystem) {
		IncreasingULongMetricAttribute oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_CPU__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_CPU__ALERTS:
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
			case CollectdPackage.COLLECTD_CPU__ALERTS:
				return getAlerts();
			case CollectdPackage.COLLECTD_CPU__ALERTING_TEMPLATE:
				if (resolve) return getAlertingTemplate();
				return basicGetAlertingTemplate();
			case CollectdPackage.COLLECTD_CPU__IDLE:
				return getIdle();
			case CollectdPackage.COLLECTD_CPU__WAIT:
				return getWait();
			case CollectdPackage.COLLECTD_CPU__USER:
				return getUser();
			case CollectdPackage.COLLECTD_CPU__SYSTEM:
				return getSystem();
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
			case CollectdPackage.COLLECTD_CPU__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends Alert>)newValue);
				return;
			case CollectdPackage.COLLECTD_CPU__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)newValue);
				return;
			case CollectdPackage.COLLECTD_CPU__IDLE:
				setIdle((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_CPU__WAIT:
				setWait((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_CPU__USER:
				setUser((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_CPU__SYSTEM:
				setSystem((IncreasingULongMetricAttribute)newValue);
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
			case CollectdPackage.COLLECTD_CPU__ALERTS:
				getAlerts().clear();
				return;
			case CollectdPackage.COLLECTD_CPU__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)null);
				return;
			case CollectdPackage.COLLECTD_CPU__IDLE:
				setIdle(IDLE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_CPU__WAIT:
				setWait(WAIT_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_CPU__USER:
				setUser(USER_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_CPU__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
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
			case CollectdPackage.COLLECTD_CPU__ALERTS:
				return alerts != null && !alerts.isEmpty();
			case CollectdPackage.COLLECTD_CPU__ALERTING_TEMPLATE:
				return alertingTemplate != null;
			case CollectdPackage.COLLECTD_CPU__IDLE:
				return IDLE_EDEFAULT == null ? idle != null : !IDLE_EDEFAULT.equals(idle);
			case CollectdPackage.COLLECTD_CPU__WAIT:
				return WAIT_EDEFAULT == null ? wait != null : !WAIT_EDEFAULT.equals(wait);
			case CollectdPackage.COLLECTD_CPU__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case CollectdPackage.COLLECTD_CPU__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
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
				case CollectdPackage.COLLECTD_CPU__ALERTS: return AlertsPackage.ALERT_CONTAINER__ALERTS;
				case CollectdPackage.COLLECTD_CPU__ALERTING_TEMPLATE: return AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE;
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
				case AlertsPackage.ALERT_CONTAINER__ALERTS: return CollectdPackage.COLLECTD_CPU__ALERTS;
				case AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE: return CollectdPackage.COLLECTD_CPU__ALERTING_TEMPLATE;
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
		result.append(" (idle: ");
		result.append(idle);
		result.append(", wait: ");
		result.append(wait);
		result.append(", user: ");
		result.append(user);
		result.append(", system: ");
		result.append(system);
		result.append(')');
		return result.toString();
	}

} //CollectdCpuImpl
