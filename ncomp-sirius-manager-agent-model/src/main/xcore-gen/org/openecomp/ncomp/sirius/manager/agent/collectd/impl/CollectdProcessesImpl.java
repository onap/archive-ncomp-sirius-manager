
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

import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl#getFork_rate <em>Fork rate</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl#getPaging <em>Paging</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl#getRunning <em>Running</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl#getSleeping <em>Sleeping</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl#getStopped <em>Stopped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl#getZombies <em>Zombies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollectdProcessesImpl extends MinimalEObjectImpl.Container implements CollectdProcesses {
	/**
	 * The default value of the '{@link #getFork_rate() <em>Fork rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFork_rate()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute FORK_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFork_rate() <em>Fork rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFork_rate()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute fork_rate = FORK_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute BLOCKED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocked()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute blocked = BLOCKED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaging() <em>Paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaging()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute PAGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaging() <em>Paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaging()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute paging = PAGING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunning()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute RUNNING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunning()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute running = RUNNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSleeping() <em>Sleeping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleeping()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute SLEEPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSleeping() <em>Sleeping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleeping()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute sleeping = SLEEPING_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopped() <em>Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopped()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute STOPPED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopped() <em>Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopped()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute stopped = STOPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getZombies() <em>Zombies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZombies()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute ZOMBIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZombies() <em>Zombies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZombies()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute zombies = ZOMBIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdProcessesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_PROCESSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getFork_rate() {
		return fork_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFork_rate(IncreasingULongMetricAttribute newFork_rate) {
		IncreasingULongMetricAttribute oldFork_rate = fork_rate;
		fork_rate = newFork_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_PROCESSES__FORK_RATE, oldFork_rate, fork_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getBlocked() {
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocked(DoubleMetricAttribute newBlocked) {
		DoubleMetricAttribute oldBlocked = blocked;
		blocked = newBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_PROCESSES__BLOCKED, oldBlocked, blocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getPaging() {
		return paging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaging(DoubleMetricAttribute newPaging) {
		DoubleMetricAttribute oldPaging = paging;
		paging = newPaging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_PROCESSES__PAGING, oldPaging, paging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(DoubleMetricAttribute newRunning) {
		DoubleMetricAttribute oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_PROCESSES__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getSleeping() {
		return sleeping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSleeping(DoubleMetricAttribute newSleeping) {
		DoubleMetricAttribute oldSleeping = sleeping;
		sleeping = newSleeping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_PROCESSES__SLEEPING, oldSleeping, sleeping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getStopped() {
		return stopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopped(DoubleMetricAttribute newStopped) {
		DoubleMetricAttribute oldStopped = stopped;
		stopped = newStopped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_PROCESSES__STOPPED, oldStopped, stopped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getZombies() {
		return zombies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZombies(DoubleMetricAttribute newZombies) {
		DoubleMetricAttribute oldZombies = zombies;
		zombies = newZombies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_PROCESSES__ZOMBIES, oldZombies, zombies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_PROCESSES__FORK_RATE:
				return getFork_rate();
			case CollectdPackage.COLLECTD_PROCESSES__BLOCKED:
				return getBlocked();
			case CollectdPackage.COLLECTD_PROCESSES__PAGING:
				return getPaging();
			case CollectdPackage.COLLECTD_PROCESSES__RUNNING:
				return getRunning();
			case CollectdPackage.COLLECTD_PROCESSES__SLEEPING:
				return getSleeping();
			case CollectdPackage.COLLECTD_PROCESSES__STOPPED:
				return getStopped();
			case CollectdPackage.COLLECTD_PROCESSES__ZOMBIES:
				return getZombies();
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
			case CollectdPackage.COLLECTD_PROCESSES__FORK_RATE:
				setFork_rate((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__BLOCKED:
				setBlocked((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__PAGING:
				setPaging((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__RUNNING:
				setRunning((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__SLEEPING:
				setSleeping((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__STOPPED:
				setStopped((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__ZOMBIES:
				setZombies((DoubleMetricAttribute)newValue);
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
			case CollectdPackage.COLLECTD_PROCESSES__FORK_RATE:
				setFork_rate(FORK_RATE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__BLOCKED:
				setBlocked(BLOCKED_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__PAGING:
				setPaging(PAGING_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__RUNNING:
				setRunning(RUNNING_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__SLEEPING:
				setSleeping(SLEEPING_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__STOPPED:
				setStopped(STOPPED_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_PROCESSES__ZOMBIES:
				setZombies(ZOMBIES_EDEFAULT);
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
			case CollectdPackage.COLLECTD_PROCESSES__FORK_RATE:
				return FORK_RATE_EDEFAULT == null ? fork_rate != null : !FORK_RATE_EDEFAULT.equals(fork_rate);
			case CollectdPackage.COLLECTD_PROCESSES__BLOCKED:
				return BLOCKED_EDEFAULT == null ? blocked != null : !BLOCKED_EDEFAULT.equals(blocked);
			case CollectdPackage.COLLECTD_PROCESSES__PAGING:
				return PAGING_EDEFAULT == null ? paging != null : !PAGING_EDEFAULT.equals(paging);
			case CollectdPackage.COLLECTD_PROCESSES__RUNNING:
				return RUNNING_EDEFAULT == null ? running != null : !RUNNING_EDEFAULT.equals(running);
			case CollectdPackage.COLLECTD_PROCESSES__SLEEPING:
				return SLEEPING_EDEFAULT == null ? sleeping != null : !SLEEPING_EDEFAULT.equals(sleeping);
			case CollectdPackage.COLLECTD_PROCESSES__STOPPED:
				return STOPPED_EDEFAULT == null ? stopped != null : !STOPPED_EDEFAULT.equals(stopped);
			case CollectdPackage.COLLECTD_PROCESSES__ZOMBIES:
				return ZOMBIES_EDEFAULT == null ? zombies != null : !ZOMBIES_EDEFAULT.equals(zombies);
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
		result.append(" (fork_rate: ");
		result.append(fork_rate);
		result.append(", blocked: ");
		result.append(blocked);
		result.append(", paging: ");
		result.append(paging);
		result.append(", running: ");
		result.append(running);
		result.append(", sleeping: ");
		result.append(sleeping);
		result.append(", stopped: ");
		result.append(stopped);
		result.append(", zombies: ");
		result.append(zombies);
		result.append(')');
		return result.toString();
	}

} //CollectdProcessesImpl
