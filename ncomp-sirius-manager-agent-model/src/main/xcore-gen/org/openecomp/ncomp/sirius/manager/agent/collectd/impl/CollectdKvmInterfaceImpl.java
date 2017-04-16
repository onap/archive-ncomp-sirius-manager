
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
 * An implementation of the model object '<em><b>Kvm Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getAlertingTemplate <em>Alerting Template</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getIf_errors_rx <em>If errors rx</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getIf_errors_tx <em>If errors tx</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getIf_dropped_rx <em>If dropped rx</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getIf_dropped_tx <em>If dropped tx</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getIf_octets_rx <em>If octets rx</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getIf_octets_tx <em>If octets tx</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getIf_packets_rx <em>If packets rx</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl#getIf_packets_tx <em>If packets tx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectdKvmInterfaceImpl extends NamedEntityImpl implements CollectdKvmInterface {
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
	 * The default value of the '{@link #getIf_errors_rx() <em>If errors rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_errors_rx()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IF_ERRORS_RX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_errors_rx() <em>If errors rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_errors_rx()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute if_errors_rx = IF_ERRORS_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_errors_tx() <em>If errors tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_errors_tx()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IF_ERRORS_TX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_errors_tx() <em>If errors tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_errors_tx()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute if_errors_tx = IF_ERRORS_TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_dropped_rx() <em>If dropped rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_dropped_rx()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IF_DROPPED_RX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_dropped_rx() <em>If dropped rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_dropped_rx()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute if_dropped_rx = IF_DROPPED_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_dropped_tx() <em>If dropped tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_dropped_tx()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IF_DROPPED_TX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_dropped_tx() <em>If dropped tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_dropped_tx()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute if_dropped_tx = IF_DROPPED_TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_octets_rx() <em>If octets rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_octets_rx()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IF_OCTETS_RX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_octets_rx() <em>If octets rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_octets_rx()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute if_octets_rx = IF_OCTETS_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_octets_tx() <em>If octets tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_octets_tx()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IF_OCTETS_TX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_octets_tx() <em>If octets tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_octets_tx()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute if_octets_tx = IF_OCTETS_TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_packets_rx() <em>If packets rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_packets_rx()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IF_PACKETS_RX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_packets_rx() <em>If packets rx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_packets_rx()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute if_packets_rx = IF_PACKETS_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf_packets_tx() <em>If packets tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_packets_tx()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute IF_PACKETS_TX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf_packets_tx() <em>If packets tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_packets_tx()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute if_packets_tx = IF_PACKETS_TX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdKvmInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_KVM_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIf_errors_rx() {
		return if_errors_rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_errors_rx(IncreasingULongMetricAttribute newIf_errors_rx) {
		IncreasingULongMetricAttribute oldIf_errors_rx = if_errors_rx;
		if_errors_rx = newIf_errors_rx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_RX, oldIf_errors_rx, if_errors_rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIf_errors_tx() {
		return if_errors_tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_errors_tx(IncreasingULongMetricAttribute newIf_errors_tx) {
		IncreasingULongMetricAttribute oldIf_errors_tx = if_errors_tx;
		if_errors_tx = newIf_errors_tx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_TX, oldIf_errors_tx, if_errors_tx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIf_dropped_rx() {
		return if_dropped_rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_dropped_rx(IncreasingULongMetricAttribute newIf_dropped_rx) {
		IncreasingULongMetricAttribute oldIf_dropped_rx = if_dropped_rx;
		if_dropped_rx = newIf_dropped_rx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_RX, oldIf_dropped_rx, if_dropped_rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIf_dropped_tx() {
		return if_dropped_tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_dropped_tx(IncreasingULongMetricAttribute newIf_dropped_tx) {
		IncreasingULongMetricAttribute oldIf_dropped_tx = if_dropped_tx;
		if_dropped_tx = newIf_dropped_tx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_TX, oldIf_dropped_tx, if_dropped_tx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIf_octets_rx() {
		return if_octets_rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_octets_rx(IncreasingULongMetricAttribute newIf_octets_rx) {
		IncreasingULongMetricAttribute oldIf_octets_rx = if_octets_rx;
		if_octets_rx = newIf_octets_rx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_RX, oldIf_octets_rx, if_octets_rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIf_octets_tx() {
		return if_octets_tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_octets_tx(IncreasingULongMetricAttribute newIf_octets_tx) {
		IncreasingULongMetricAttribute oldIf_octets_tx = if_octets_tx;
		if_octets_tx = newIf_octets_tx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_TX, oldIf_octets_tx, if_octets_tx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIf_packets_rx() {
		return if_packets_rx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_packets_rx(IncreasingULongMetricAttribute newIf_packets_rx) {
		IncreasingULongMetricAttribute oldIf_packets_rx = if_packets_rx;
		if_packets_rx = newIf_packets_rx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_RX, oldIf_packets_rx, if_packets_rx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getIf_packets_tx() {
		return if_packets_tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf_packets_tx(IncreasingULongMetricAttribute newIf_packets_tx) {
		IncreasingULongMetricAttribute oldIf_packets_tx = if_packets_tx;
		if_packets_tx = newIf_packets_tx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_TX, oldIf_packets_tx, if_packets_tx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTS:
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
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTS:
				return getAlerts();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE:
				if (resolve) return getAlertingTemplate();
				return basicGetAlertingTemplate();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_RX:
				return getIf_errors_rx();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_TX:
				return getIf_errors_tx();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_RX:
				return getIf_dropped_rx();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_TX:
				return getIf_dropped_tx();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_RX:
				return getIf_octets_rx();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_TX:
				return getIf_octets_tx();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_RX:
				return getIf_packets_rx();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_TX:
				return getIf_packets_tx();
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
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends Alert>)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_RX:
				setIf_errors_rx((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_TX:
				setIf_errors_tx((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_RX:
				setIf_dropped_rx((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_TX:
				setIf_dropped_tx((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_RX:
				setIf_octets_rx((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_TX:
				setIf_octets_tx((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_RX:
				setIf_packets_rx((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_TX:
				setIf_packets_tx((IncreasingULongMetricAttribute)newValue);
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
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTS:
				getAlerts().clear();
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)null);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_RX:
				setIf_errors_rx(IF_ERRORS_RX_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_TX:
				setIf_errors_tx(IF_ERRORS_TX_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_RX:
				setIf_dropped_rx(IF_DROPPED_RX_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_TX:
				setIf_dropped_tx(IF_DROPPED_TX_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_RX:
				setIf_octets_rx(IF_OCTETS_RX_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_TX:
				setIf_octets_tx(IF_OCTETS_TX_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_RX:
				setIf_packets_rx(IF_PACKETS_RX_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_TX:
				setIf_packets_tx(IF_PACKETS_TX_EDEFAULT);
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
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTS:
				return alerts != null && !alerts.isEmpty();
			case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE:
				return alertingTemplate != null;
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_RX:
				return IF_ERRORS_RX_EDEFAULT == null ? if_errors_rx != null : !IF_ERRORS_RX_EDEFAULT.equals(if_errors_rx);
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_ERRORS_TX:
				return IF_ERRORS_TX_EDEFAULT == null ? if_errors_tx != null : !IF_ERRORS_TX_EDEFAULT.equals(if_errors_tx);
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_RX:
				return IF_DROPPED_RX_EDEFAULT == null ? if_dropped_rx != null : !IF_DROPPED_RX_EDEFAULT.equals(if_dropped_rx);
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_DROPPED_TX:
				return IF_DROPPED_TX_EDEFAULT == null ? if_dropped_tx != null : !IF_DROPPED_TX_EDEFAULT.equals(if_dropped_tx);
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_RX:
				return IF_OCTETS_RX_EDEFAULT == null ? if_octets_rx != null : !IF_OCTETS_RX_EDEFAULT.equals(if_octets_rx);
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_OCTETS_TX:
				return IF_OCTETS_TX_EDEFAULT == null ? if_octets_tx != null : !IF_OCTETS_TX_EDEFAULT.equals(if_octets_tx);
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_RX:
				return IF_PACKETS_RX_EDEFAULT == null ? if_packets_rx != null : !IF_PACKETS_RX_EDEFAULT.equals(if_packets_rx);
			case CollectdPackage.COLLECTD_KVM_INTERFACE__IF_PACKETS_TX:
				return IF_PACKETS_TX_EDEFAULT == null ? if_packets_tx != null : !IF_PACKETS_TX_EDEFAULT.equals(if_packets_tx);
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
				case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTS: return AlertsPackage.ALERT_CONTAINER__ALERTS;
				case CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE: return AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE;
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
				case AlertsPackage.ALERT_CONTAINER__ALERTS: return CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTS;
				case AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE: return CollectdPackage.COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE;
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
		result.append(" (if_errors_rx: ");
		result.append(if_errors_rx);
		result.append(", if_errors_tx: ");
		result.append(if_errors_tx);
		result.append(", if_dropped_rx: ");
		result.append(if_dropped_rx);
		result.append(", if_dropped_tx: ");
		result.append(if_dropped_tx);
		result.append(", if_octets_rx: ");
		result.append(if_octets_rx);
		result.append(", if_octets_tx: ");
		result.append(if_octets_tx);
		result.append(", if_packets_rx: ");
		result.append(if_packets_rx);
		result.append(", if_packets_tx: ");
		result.append(if_packets_tx);
		result.append(')');
		return result.toString();
	}

} //CollectdKvmInterfaceImpl
