
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

import org.openecomp.ncomp.core.alerts.AlertingTemplate;
import org.openecomp.ncomp.core.function.Function;
import org.openecomp.ncomp.core.logs.LogMessageRule;
import org.openecomp.ncomp.core.metrics.MetricValueOption;
import org.openecomp.ncomp.sirius.manager.properties.impl.ModuleContainerImpl;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.ncomp.sirius.manager.server.VersionConfiguration;
import org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate;
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
 * An implementation of the model object '<em><b>Abstract Management Server Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl#getMetricOptions <em>Metric Options</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl#getTableTemplates <em>Table Templates</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl#getAlertTemplates <em>Alert Templates</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.AbstractManagementServerConfigurationImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractManagementServerConfigurationImpl extends ModuleContainerImpl implements AbstractManagementServerConfiguration {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<LogMessageRule> rules;

	/**
	 * The cached value of the '{@link #getMetricOptions() <em>Metric Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MetricValueOption> metricOptions;

	/**
	 * The cached value of the '{@link #getTableTemplates() <em>Table Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractTableTemplate> tableTemplates;

	/**
	 * The cached value of the '{@link #getAlertTemplates() <em>Alert Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<AlertingTemplate> alertTemplates;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected VersionConfiguration version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractManagementServerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogMessageRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<LogMessageRule>(LogMessageRule.class, this, ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetricValueOption> getMetricOptions() {
		if (metricOptions == null) {
			metricOptions = new EObjectContainmentEList<MetricValueOption>(MetricValueOption.class, this, ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS);
		}
		return metricOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTableTemplate> getTableTemplates() {
		if (tableTemplates == null) {
			tableTemplates = new EObjectContainmentEList<AbstractTableTemplate>(AbstractTableTemplate.class, this, ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES);
		}
		return tableTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlertingTemplate> getAlertTemplates() {
		if (alertTemplates == null) {
			alertTemplates = new EObjectContainmentEList<AlertingTemplate>(AlertingTemplate.class, this, ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES);
		}
		return alertTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionConfiguration getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(VersionConfiguration newVersion, NotificationChain msgs) {
		VersionConfiguration oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(VersionConfiguration newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS:
				return ((InternalEList<?>)getMetricOptions()).basicRemove(otherEnd, msgs);
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES:
				return ((InternalEList<?>)getTableTemplates()).basicRemove(otherEnd, msgs);
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES:
				return ((InternalEList<?>)getAlertTemplates()).basicRemove(otherEnd, msgs);
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION:
				return basicSetVersion(null, msgs);
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
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES:
				return getRules();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS:
				return getMetricOptions();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES:
				return getTableTemplates();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES:
				return getAlertTemplates();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS:
				return getFunctions();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION:
				return getVersion();
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
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends LogMessageRule>)newValue);
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS:
				getMetricOptions().clear();
				getMetricOptions().addAll((Collection<? extends MetricValueOption>)newValue);
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES:
				getTableTemplates().clear();
				getTableTemplates().addAll((Collection<? extends AbstractTableTemplate>)newValue);
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES:
				getAlertTemplates().clear();
				getAlertTemplates().addAll((Collection<? extends AlertingTemplate>)newValue);
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION:
				setVersion((VersionConfiguration)newValue);
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
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES:
				getRules().clear();
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS:
				getMetricOptions().clear();
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES:
				getTableTemplates().clear();
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES:
				getAlertTemplates().clear();
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS:
				getFunctions().clear();
				return;
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION:
				setVersion((VersionConfiguration)null);
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
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES:
				return rules != null && !rules.isEmpty();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS:
				return metricOptions != null && !metricOptions.isEmpty();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES:
				return tableTemplates != null && !tableTemplates.isEmpty();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES:
				return alertTemplates != null && !alertTemplates.isEmpty();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case ServerPackage.ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__VERSION:
				return version != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractManagementServerConfigurationImpl
