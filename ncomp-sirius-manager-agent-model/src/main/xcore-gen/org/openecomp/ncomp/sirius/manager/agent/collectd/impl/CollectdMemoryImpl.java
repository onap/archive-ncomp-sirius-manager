
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

import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdMemoryImpl#getBuffered <em>Buffered</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdMemoryImpl#getCached <em>Cached</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdMemoryImpl#getFree <em>Free</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdMemoryImpl#getUsed <em>Used</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectdMemoryImpl extends MinimalEObjectImpl.Container implements CollectdMemory {
	/**
	 * The default value of the '{@link #getBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffered()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute BUFFERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffered()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute buffered = BUFFERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCached() <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCached()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute CACHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCached() <em>Cached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCached()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute cached = CACHED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_MEMORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getBuffered() {
		return buffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffered(DoubleMetricAttribute newBuffered) {
		DoubleMetricAttribute oldBuffered = buffered;
		buffered = newBuffered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_MEMORY__BUFFERED, oldBuffered, buffered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getCached() {
		return cached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCached(DoubleMetricAttribute newCached) {
		DoubleMetricAttribute oldCached = cached;
		cached = newCached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_MEMORY__CACHED, oldCached, cached));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_MEMORY__FREE, oldFree, free));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_MEMORY__USED, oldUsed, used));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_MEMORY__BUFFERED:
				return getBuffered();
			case CollectdPackage.COLLECTD_MEMORY__CACHED:
				return getCached();
			case CollectdPackage.COLLECTD_MEMORY__FREE:
				return getFree();
			case CollectdPackage.COLLECTD_MEMORY__USED:
				return getUsed();
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
			case CollectdPackage.COLLECTD_MEMORY__BUFFERED:
				setBuffered((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_MEMORY__CACHED:
				setCached((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_MEMORY__FREE:
				setFree((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_MEMORY__USED:
				setUsed((DoubleMetricAttribute)newValue);
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
			case CollectdPackage.COLLECTD_MEMORY__BUFFERED:
				setBuffered(BUFFERED_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_MEMORY__CACHED:
				setCached(CACHED_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_MEMORY__FREE:
				setFree(FREE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_MEMORY__USED:
				setUsed(USED_EDEFAULT);
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
			case CollectdPackage.COLLECTD_MEMORY__BUFFERED:
				return BUFFERED_EDEFAULT == null ? buffered != null : !BUFFERED_EDEFAULT.equals(buffered);
			case CollectdPackage.COLLECTD_MEMORY__CACHED:
				return CACHED_EDEFAULT == null ? cached != null : !CACHED_EDEFAULT.equals(cached);
			case CollectdPackage.COLLECTD_MEMORY__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
			case CollectdPackage.COLLECTD_MEMORY__USED:
				return USED_EDEFAULT == null ? used != null : !USED_EDEFAULT.equals(used);
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
		result.append(" (buffered: ");
		result.append(buffered);
		result.append(", cached: ");
		result.append(cached);
		result.append(", free: ");
		result.append(free);
		result.append(", used: ");
		result.append(used);
		result.append(')');
		return result.toString();
	}

} //CollectdMemoryImpl
