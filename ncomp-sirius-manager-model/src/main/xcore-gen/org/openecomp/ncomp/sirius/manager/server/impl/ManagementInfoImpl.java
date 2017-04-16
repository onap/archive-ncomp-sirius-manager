
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
package org.openecomp.ncomp.sirius.manager.server.impl;

import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.metrics.Metric;
import org.openecomp.ncomp.sirius.manager.properties.AbstractProperty;
import org.openecomp.ncomp.sirius.manager.server.ManagementInfo;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import java.util.Collection;
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
 * An implementation of the model object '<em><b>Management Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.ManagementInfoImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.ManagementInfoImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.ManagementInfoImpl#getLogs <em>Logs</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.ManagementInfoImpl#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManagementInfoImpl extends MinimalEObjectImpl.Container implements ManagementInfo {
	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metrics;

	/**
	 * The cached value of the '{@link #getLogs() <em>Logs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogMessage> logs;

	/**
	 * The cached value of the '{@link #getProps() <em>Props</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProps()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractProperty> props;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagementInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.MANAGEMENT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.MANAGEMENT_INFO__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getMetrics() {
		if (metrics == null) {
			metrics = new EObjectContainmentEList<Metric>(Metric.class, this, ServerPackage.MANAGEMENT_INFO__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogMessage> getLogs() {
		if (logs == null) {
			logs = new EObjectContainmentEList<LogMessage>(LogMessage.class, this, ServerPackage.MANAGEMENT_INFO__LOGS);
		}
		return logs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractProperty> getProps() {
		if (props == null) {
			props = new EObjectContainmentEList<AbstractProperty>(AbstractProperty.class, this, ServerPackage.MANAGEMENT_INFO__PROPS);
		}
		return props;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServerPackage.MANAGEMENT_INFO__METRICS:
				return ((InternalEList<?>)getMetrics()).basicRemove(otherEnd, msgs);
			case ServerPackage.MANAGEMENT_INFO__LOGS:
				return ((InternalEList<?>)getLogs()).basicRemove(otherEnd, msgs);
			case ServerPackage.MANAGEMENT_INFO__PROPS:
				return ((InternalEList<?>)getProps()).basicRemove(otherEnd, msgs);
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
			case ServerPackage.MANAGEMENT_INFO__IP:
				return getIp();
			case ServerPackage.MANAGEMENT_INFO__METRICS:
				return getMetrics();
			case ServerPackage.MANAGEMENT_INFO__LOGS:
				return getLogs();
			case ServerPackage.MANAGEMENT_INFO__PROPS:
				return getProps();
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
			case ServerPackage.MANAGEMENT_INFO__IP:
				setIp((String)newValue);
				return;
			case ServerPackage.MANAGEMENT_INFO__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends Metric>)newValue);
				return;
			case ServerPackage.MANAGEMENT_INFO__LOGS:
				getLogs().clear();
				getLogs().addAll((Collection<? extends LogMessage>)newValue);
				return;
			case ServerPackage.MANAGEMENT_INFO__PROPS:
				getProps().clear();
				getProps().addAll((Collection<? extends AbstractProperty>)newValue);
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
			case ServerPackage.MANAGEMENT_INFO__IP:
				setIp(IP_EDEFAULT);
				return;
			case ServerPackage.MANAGEMENT_INFO__METRICS:
				getMetrics().clear();
				return;
			case ServerPackage.MANAGEMENT_INFO__LOGS:
				getLogs().clear();
				return;
			case ServerPackage.MANAGEMENT_INFO__PROPS:
				getProps().clear();
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
			case ServerPackage.MANAGEMENT_INFO__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case ServerPackage.MANAGEMENT_INFO__METRICS:
				return metrics != null && !metrics.isEmpty();
			case ServerPackage.MANAGEMENT_INFO__LOGS:
				return logs != null && !logs.isEmpty();
			case ServerPackage.MANAGEMENT_INFO__PROPS:
				return props != null && !props.isEmpty();
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
		result.append(" (ip: ");
		result.append(ip);
		result.append(')');
		return result.toString();
	}

} //ManagementInfoImpl
