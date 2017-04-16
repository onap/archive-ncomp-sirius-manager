
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
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface;
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
 * An implementation of the model object '<em><b>Kvm Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl#getAlertingTemplate <em>Alerting Template</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl#getVirt_cpu_total <em>Virt cpu total</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl#getDisks <em>Disks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectdKvmInstanceImpl extends NamedEntityImpl implements CollectdKvmInstance {
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
	 * The default value of the '{@link #getVirt_cpu_total() <em>Virt cpu total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirt_cpu_total()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute VIRT_CPU_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirt_cpu_total() <em>Virt cpu total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirt_cpu_total()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute virt_cpu_total = VIRT_CPU_TOTAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDisks() <em>Disks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisks()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectdKvmDisk> disks;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectdKvmInterface> interfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdKvmInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_KVM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getVirt_cpu_total() {
		return virt_cpu_total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirt_cpu_total(IncreasingULongMetricAttribute newVirt_cpu_total) {
		IncreasingULongMetricAttribute oldVirt_cpu_total = virt_cpu_total;
		virt_cpu_total = newVirt_cpu_total;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INSTANCE__VIRT_CPU_TOTAL, oldVirt_cpu_total, virt_cpu_total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectdKvmDisk> getDisks() {
		if (disks == null) {
			disks = new EObjectContainmentEList<CollectdKvmDisk>(CollectdKvmDisk.class, this, CollectdPackage.COLLECTD_KVM_INSTANCE__DISKS);
		}
		return disks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectdKvmInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<CollectdKvmInterface>(CollectdKvmInterface.class, this, CollectdPackage.COLLECTD_KVM_INSTANCE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTS:
				return ((InternalEList<?>)getAlerts()).basicRemove(otherEnd, msgs);
			case CollectdPackage.COLLECTD_KVM_INSTANCE__DISKS:
				return ((InternalEList<?>)getDisks()).basicRemove(otherEnd, msgs);
			case CollectdPackage.COLLECTD_KVM_INSTANCE__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
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
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTS:
				return getAlerts();
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE:
				if (resolve) return getAlertingTemplate();
				return basicGetAlertingTemplate();
			case CollectdPackage.COLLECTD_KVM_INSTANCE__VIRT_CPU_TOTAL:
				return getVirt_cpu_total();
			case CollectdPackage.COLLECTD_KVM_INSTANCE__DISKS:
				return getDisks();
			case CollectdPackage.COLLECTD_KVM_INSTANCE__INTERFACES:
				return getInterfaces();
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
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends Alert>)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__VIRT_CPU_TOTAL:
				setVirt_cpu_total((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__DISKS:
				getDisks().clear();
				getDisks().addAll((Collection<? extends CollectdKvmDisk>)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends CollectdKvmInterface>)newValue);
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
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTS:
				getAlerts().clear();
				return;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)null);
				return;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__VIRT_CPU_TOTAL:
				setVirt_cpu_total(VIRT_CPU_TOTAL_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__DISKS:
				getDisks().clear();
				return;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__INTERFACES:
				getInterfaces().clear();
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
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTS:
				return alerts != null && !alerts.isEmpty();
			case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE:
				return alertingTemplate != null;
			case CollectdPackage.COLLECTD_KVM_INSTANCE__VIRT_CPU_TOTAL:
				return VIRT_CPU_TOTAL_EDEFAULT == null ? virt_cpu_total != null : !VIRT_CPU_TOTAL_EDEFAULT.equals(virt_cpu_total);
			case CollectdPackage.COLLECTD_KVM_INSTANCE__DISKS:
				return disks != null && !disks.isEmpty();
			case CollectdPackage.COLLECTD_KVM_INSTANCE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
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
				case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTS: return AlertsPackage.ALERT_CONTAINER__ALERTS;
				case CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE: return AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE;
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
				case AlertsPackage.ALERT_CONTAINER__ALERTS: return CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTS;
				case AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE: return CollectdPackage.COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE;
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
		result.append(" (virt_cpu_total: ");
		result.append(virt_cpu_total);
		result.append(')');
		return result.toString();
	}

} //CollectdKvmInstanceImpl
