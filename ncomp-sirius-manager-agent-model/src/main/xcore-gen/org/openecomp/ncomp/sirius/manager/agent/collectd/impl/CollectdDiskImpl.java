
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
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk;
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
 * An implementation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getAlertingTemplate <em>Alerting Template</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getDisk_merged_read <em>Disk merged read</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getDisk_merged_write <em>Disk merged write</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getDisk_octets_read <em>Disk octets read</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getDisk_octets_write <em>Disk octets write</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getDisk_ops_read <em>Disk ops read</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getDisk_ops_write <em>Disk ops write</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getDisk_time_read <em>Disk time read</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl#getDisk_time_write <em>Disk time write</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectdDiskImpl extends NamedEntityImpl implements CollectdDisk {
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
	 * The default value of the '{@link #getDisk_merged_read() <em>Disk merged read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_merged_read()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute DISK_MERGED_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_merged_read() <em>Disk merged read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_merged_read()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute disk_merged_read = DISK_MERGED_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_merged_write() <em>Disk merged write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_merged_write()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute DISK_MERGED_WRITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_merged_write() <em>Disk merged write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_merged_write()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute disk_merged_write = DISK_MERGED_WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_octets_read() <em>Disk octets read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_octets_read()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute DISK_OCTETS_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_octets_read() <em>Disk octets read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_octets_read()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute disk_octets_read = DISK_OCTETS_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_octets_write() <em>Disk octets write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_octets_write()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute DISK_OCTETS_WRITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_octets_write() <em>Disk octets write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_octets_write()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute disk_octets_write = DISK_OCTETS_WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_ops_read() <em>Disk ops read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_ops_read()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute DISK_OPS_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_ops_read() <em>Disk ops read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_ops_read()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute disk_ops_read = DISK_OPS_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_ops_write() <em>Disk ops write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_ops_write()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute DISK_OPS_WRITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_ops_write() <em>Disk ops write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_ops_write()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute disk_ops_write = DISK_OPS_WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_time_read() <em>Disk time read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_time_read()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute DISK_TIME_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_time_read() <em>Disk time read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_time_read()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute disk_time_read = DISK_TIME_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisk_time_write() <em>Disk time write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_time_write()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute DISK_TIME_WRITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisk_time_write() <em>Disk time write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisk_time_write()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute disk_time_write = DISK_TIME_WRITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdDiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_DISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, CollectdPackage.COLLECTD_DISK__ALERTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectdPackage.COLLECTD_DISK__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getDisk_merged_read() {
		return disk_merged_read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_merged_read(IncreasingULongMetricAttribute newDisk_merged_read) {
		IncreasingULongMetricAttribute oldDisk_merged_read = disk_merged_read;
		disk_merged_read = newDisk_merged_read;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__DISK_MERGED_READ, oldDisk_merged_read, disk_merged_read));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getDisk_merged_write() {
		return disk_merged_write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_merged_write(IncreasingULongMetricAttribute newDisk_merged_write) {
		IncreasingULongMetricAttribute oldDisk_merged_write = disk_merged_write;
		disk_merged_write = newDisk_merged_write;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__DISK_MERGED_WRITE, oldDisk_merged_write, disk_merged_write));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getDisk_octets_read() {
		return disk_octets_read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_octets_read(IncreasingULongMetricAttribute newDisk_octets_read) {
		IncreasingULongMetricAttribute oldDisk_octets_read = disk_octets_read;
		disk_octets_read = newDisk_octets_read;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__DISK_OCTETS_READ, oldDisk_octets_read, disk_octets_read));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getDisk_octets_write() {
		return disk_octets_write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_octets_write(IncreasingULongMetricAttribute newDisk_octets_write) {
		IncreasingULongMetricAttribute oldDisk_octets_write = disk_octets_write;
		disk_octets_write = newDisk_octets_write;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__DISK_OCTETS_WRITE, oldDisk_octets_write, disk_octets_write));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getDisk_ops_read() {
		return disk_ops_read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_ops_read(IncreasingULongMetricAttribute newDisk_ops_read) {
		IncreasingULongMetricAttribute oldDisk_ops_read = disk_ops_read;
		disk_ops_read = newDisk_ops_read;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__DISK_OPS_READ, oldDisk_ops_read, disk_ops_read));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getDisk_ops_write() {
		return disk_ops_write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_ops_write(IncreasingULongMetricAttribute newDisk_ops_write) {
		IncreasingULongMetricAttribute oldDisk_ops_write = disk_ops_write;
		disk_ops_write = newDisk_ops_write;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__DISK_OPS_WRITE, oldDisk_ops_write, disk_ops_write));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getDisk_time_read() {
		return disk_time_read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_time_read(IncreasingULongMetricAttribute newDisk_time_read) {
		IncreasingULongMetricAttribute oldDisk_time_read = disk_time_read;
		disk_time_read = newDisk_time_read;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__DISK_TIME_READ, oldDisk_time_read, disk_time_read));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getDisk_time_write() {
		return disk_time_write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisk_time_write(IncreasingULongMetricAttribute newDisk_time_write) {
		IncreasingULongMetricAttribute oldDisk_time_write = disk_time_write;
		disk_time_write = newDisk_time_write;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_DISK__DISK_TIME_WRITE, oldDisk_time_write, disk_time_write));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_DISK__ALERTS:
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
			case CollectdPackage.COLLECTD_DISK__ALERTS:
				return getAlerts();
			case CollectdPackage.COLLECTD_DISK__ALERTING_TEMPLATE:
				if (resolve) return getAlertingTemplate();
				return basicGetAlertingTemplate();
			case CollectdPackage.COLLECTD_DISK__DISK_MERGED_READ:
				return getDisk_merged_read();
			case CollectdPackage.COLLECTD_DISK__DISK_MERGED_WRITE:
				return getDisk_merged_write();
			case CollectdPackage.COLLECTD_DISK__DISK_OCTETS_READ:
				return getDisk_octets_read();
			case CollectdPackage.COLLECTD_DISK__DISK_OCTETS_WRITE:
				return getDisk_octets_write();
			case CollectdPackage.COLLECTD_DISK__DISK_OPS_READ:
				return getDisk_ops_read();
			case CollectdPackage.COLLECTD_DISK__DISK_OPS_WRITE:
				return getDisk_ops_write();
			case CollectdPackage.COLLECTD_DISK__DISK_TIME_READ:
				return getDisk_time_read();
			case CollectdPackage.COLLECTD_DISK__DISK_TIME_WRITE:
				return getDisk_time_write();
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
			case CollectdPackage.COLLECTD_DISK__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends Alert>)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_MERGED_READ:
				setDisk_merged_read((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_MERGED_WRITE:
				setDisk_merged_write((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_OCTETS_READ:
				setDisk_octets_read((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_OCTETS_WRITE:
				setDisk_octets_write((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_OPS_READ:
				setDisk_ops_read((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_OPS_WRITE:
				setDisk_ops_write((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_TIME_READ:
				setDisk_time_read((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_TIME_WRITE:
				setDisk_time_write((IncreasingULongMetricAttribute)newValue);
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
			case CollectdPackage.COLLECTD_DISK__ALERTS:
				getAlerts().clear();
				return;
			case CollectdPackage.COLLECTD_DISK__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)null);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_MERGED_READ:
				setDisk_merged_read(DISK_MERGED_READ_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_MERGED_WRITE:
				setDisk_merged_write(DISK_MERGED_WRITE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_OCTETS_READ:
				setDisk_octets_read(DISK_OCTETS_READ_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_OCTETS_WRITE:
				setDisk_octets_write(DISK_OCTETS_WRITE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_OPS_READ:
				setDisk_ops_read(DISK_OPS_READ_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_OPS_WRITE:
				setDisk_ops_write(DISK_OPS_WRITE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_TIME_READ:
				setDisk_time_read(DISK_TIME_READ_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_DISK__DISK_TIME_WRITE:
				setDisk_time_write(DISK_TIME_WRITE_EDEFAULT);
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
			case CollectdPackage.COLLECTD_DISK__ALERTS:
				return alerts != null && !alerts.isEmpty();
			case CollectdPackage.COLLECTD_DISK__ALERTING_TEMPLATE:
				return alertingTemplate != null;
			case CollectdPackage.COLLECTD_DISK__DISK_MERGED_READ:
				return DISK_MERGED_READ_EDEFAULT == null ? disk_merged_read != null : !DISK_MERGED_READ_EDEFAULT.equals(disk_merged_read);
			case CollectdPackage.COLLECTD_DISK__DISK_MERGED_WRITE:
				return DISK_MERGED_WRITE_EDEFAULT == null ? disk_merged_write != null : !DISK_MERGED_WRITE_EDEFAULT.equals(disk_merged_write);
			case CollectdPackage.COLLECTD_DISK__DISK_OCTETS_READ:
				return DISK_OCTETS_READ_EDEFAULT == null ? disk_octets_read != null : !DISK_OCTETS_READ_EDEFAULT.equals(disk_octets_read);
			case CollectdPackage.COLLECTD_DISK__DISK_OCTETS_WRITE:
				return DISK_OCTETS_WRITE_EDEFAULT == null ? disk_octets_write != null : !DISK_OCTETS_WRITE_EDEFAULT.equals(disk_octets_write);
			case CollectdPackage.COLLECTD_DISK__DISK_OPS_READ:
				return DISK_OPS_READ_EDEFAULT == null ? disk_ops_read != null : !DISK_OPS_READ_EDEFAULT.equals(disk_ops_read);
			case CollectdPackage.COLLECTD_DISK__DISK_OPS_WRITE:
				return DISK_OPS_WRITE_EDEFAULT == null ? disk_ops_write != null : !DISK_OPS_WRITE_EDEFAULT.equals(disk_ops_write);
			case CollectdPackage.COLLECTD_DISK__DISK_TIME_READ:
				return DISK_TIME_READ_EDEFAULT == null ? disk_time_read != null : !DISK_TIME_READ_EDEFAULT.equals(disk_time_read);
			case CollectdPackage.COLLECTD_DISK__DISK_TIME_WRITE:
				return DISK_TIME_WRITE_EDEFAULT == null ? disk_time_write != null : !DISK_TIME_WRITE_EDEFAULT.equals(disk_time_write);
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
				case CollectdPackage.COLLECTD_DISK__ALERTS: return AlertsPackage.ALERT_CONTAINER__ALERTS;
				case CollectdPackage.COLLECTD_DISK__ALERTING_TEMPLATE: return AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE;
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
				case AlertsPackage.ALERT_CONTAINER__ALERTS: return CollectdPackage.COLLECTD_DISK__ALERTS;
				case AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE: return CollectdPackage.COLLECTD_DISK__ALERTING_TEMPLATE;
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
		result.append(" (disk_merged_read: ");
		result.append(disk_merged_read);
		result.append(", disk_merged_write: ");
		result.append(disk_merged_write);
		result.append(", disk_octets_read: ");
		result.append(disk_octets_read);
		result.append(", disk_octets_write: ");
		result.append(disk_octets_write);
		result.append(", disk_ops_read: ");
		result.append(disk_ops_read);
		result.append(", disk_ops_write: ");
		result.append(disk_ops_write);
		result.append(", disk_time_read: ");
		result.append(disk_time_read);
		result.append(", disk_time_write: ");
		result.append(disk_time_write);
		result.append(')');
		return result.toString();
	}

} //CollectdDiskImpl
