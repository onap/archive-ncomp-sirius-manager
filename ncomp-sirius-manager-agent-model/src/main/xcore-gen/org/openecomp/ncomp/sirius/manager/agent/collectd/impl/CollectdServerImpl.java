
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
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem;

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
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getAlerts <em>Alerts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getAlertingTemplate <em>Alerting Template</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getLoad_shortterm <em>Load shortterm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getLoad_midterm <em>Load midterm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getLoad_longterm <em>Load longterm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getEntropy <em>Entropy</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getContextswitches <em>Contextswitches</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getCpus <em>Cpus</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getSwap <em>Swap</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getVmem <em>Vmem</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getFilesystems <em>Filesystems</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getDisks <em>Disks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectdServerImpl extends NamedEntityImpl implements CollectdServer {
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
	 * The default value of the '{@link #getLoad_shortterm() <em>Load shortterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_shortterm()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute LOAD_SHORTTERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoad_shortterm() <em>Load shortterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_shortterm()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute load_shortterm = LOAD_SHORTTERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoad_midterm() <em>Load midterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_midterm()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute LOAD_MIDTERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoad_midterm() <em>Load midterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_midterm()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute load_midterm = LOAD_MIDTERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoad_longterm() <em>Load longterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_longterm()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute LOAD_LONGTERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoad_longterm() <em>Load longterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoad_longterm()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute load_longterm = LOAD_LONGTERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntropy() <em>Entropy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntropy()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute ENTROPY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntropy() <em>Entropy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntropy()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute entropy = ENTROPY_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextswitches() <em>Contextswitches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextswitches()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute CONTEXTSWITCHES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextswitches() <em>Contextswitches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextswitches()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute contextswitches = CONTEXTSWITCHES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCpus() <em>Cpus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpus()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectdCpu> cpus;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected CollectdMemory memory;

	/**
	 * The cached value of the '{@link #getSwap() <em>Swap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap()
	 * @generated
	 * @ordered
	 */
	protected CollectdSwap swap;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected CollectdProcesses processes;

	/**
	 * The cached value of the '{@link #getVmem() <em>Vmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmem()
	 * @generated
	 * @ordered
	 */
	protected CollectdVmem vmem;

	/**
	 * The cached value of the '{@link #getFilesystems() <em>Filesystems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesystems()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectdFileSystem> filesystems;

	/**
	 * The cached value of the '{@link #getDisks() <em>Disks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisks()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectdDisk> disks;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectdInterface> interfaces;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectdKvmInstance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, CollectdPackage.COLLECTD_SERVER__ALERTS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectdPackage.COLLECTD_SERVER__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__ALERTING_TEMPLATE, oldAlertingTemplate, alertingTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getLoad_shortterm() {
		return load_shortterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad_shortterm(DoubleMetricAttribute newLoad_shortterm) {
		DoubleMetricAttribute oldLoad_shortterm = load_shortterm;
		load_shortterm = newLoad_shortterm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__LOAD_SHORTTERM, oldLoad_shortterm, load_shortterm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getLoad_midterm() {
		return load_midterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad_midterm(DoubleMetricAttribute newLoad_midterm) {
		DoubleMetricAttribute oldLoad_midterm = load_midterm;
		load_midterm = newLoad_midterm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__LOAD_MIDTERM, oldLoad_midterm, load_midterm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getLoad_longterm() {
		return load_longterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoad_longterm(DoubleMetricAttribute newLoad_longterm) {
		DoubleMetricAttribute oldLoad_longterm = load_longterm;
		load_longterm = newLoad_longterm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__LOAD_LONGTERM, oldLoad_longterm, load_longterm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getEntropy() {
		return entropy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntropy(DoubleMetricAttribute newEntropy) {
		DoubleMetricAttribute oldEntropy = entropy;
		entropy = newEntropy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__ENTROPY, oldEntropy, entropy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getContextswitches() {
		return contextswitches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextswitches(IncreasingULongMetricAttribute newContextswitches) {
		IncreasingULongMetricAttribute oldContextswitches = contextswitches;
		contextswitches = newContextswitches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__CONTEXTSWITCHES, oldContextswitches, contextswitches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectdCpu> getCpus() {
		if (cpus == null) {
			cpus = new EObjectContainmentEList<CollectdCpu>(CollectdCpu.class, this, CollectdPackage.COLLECTD_SERVER__CPUS);
		}
		return cpus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdMemory getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemory(CollectdMemory newMemory, NotificationChain msgs) {
		CollectdMemory oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__MEMORY, oldMemory, newMemory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(CollectdMemory newMemory) {
		if (newMemory != memory) {
			NotificationChain msgs = null;
			if (memory != null)
				msgs = ((InternalEObject)memory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectdPackage.COLLECTD_SERVER__MEMORY, null, msgs);
			if (newMemory != null)
				msgs = ((InternalEObject)newMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectdPackage.COLLECTD_SERVER__MEMORY, null, msgs);
			msgs = basicSetMemory(newMemory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__MEMORY, newMemory, newMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdSwap getSwap() {
		return swap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwap(CollectdSwap newSwap, NotificationChain msgs) {
		CollectdSwap oldSwap = swap;
		swap = newSwap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__SWAP, oldSwap, newSwap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwap(CollectdSwap newSwap) {
		if (newSwap != swap) {
			NotificationChain msgs = null;
			if (swap != null)
				msgs = ((InternalEObject)swap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectdPackage.COLLECTD_SERVER__SWAP, null, msgs);
			if (newSwap != null)
				msgs = ((InternalEObject)newSwap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectdPackage.COLLECTD_SERVER__SWAP, null, msgs);
			msgs = basicSetSwap(newSwap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__SWAP, newSwap, newSwap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdProcesses getProcesses() {
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcesses(CollectdProcesses newProcesses, NotificationChain msgs) {
		CollectdProcesses oldProcesses = processes;
		processes = newProcesses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__PROCESSES, oldProcesses, newProcesses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcesses(CollectdProcesses newProcesses) {
		if (newProcesses != processes) {
			NotificationChain msgs = null;
			if (processes != null)
				msgs = ((InternalEObject)processes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectdPackage.COLLECTD_SERVER__PROCESSES, null, msgs);
			if (newProcesses != null)
				msgs = ((InternalEObject)newProcesses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectdPackage.COLLECTD_SERVER__PROCESSES, null, msgs);
			msgs = basicSetProcesses(newProcesses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__PROCESSES, newProcesses, newProcesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdVmem getVmem() {
		return vmem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVmem(CollectdVmem newVmem, NotificationChain msgs) {
		CollectdVmem oldVmem = vmem;
		vmem = newVmem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__VMEM, oldVmem, newVmem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmem(CollectdVmem newVmem) {
		if (newVmem != vmem) {
			NotificationChain msgs = null;
			if (vmem != null)
				msgs = ((InternalEObject)vmem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectdPackage.COLLECTD_SERVER__VMEM, null, msgs);
			if (newVmem != null)
				msgs = ((InternalEObject)newVmem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectdPackage.COLLECTD_SERVER__VMEM, null, msgs);
			msgs = basicSetVmem(newVmem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_SERVER__VMEM, newVmem, newVmem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectdFileSystem> getFilesystems() {
		if (filesystems == null) {
			filesystems = new EObjectContainmentEList<CollectdFileSystem>(CollectdFileSystem.class, this, CollectdPackage.COLLECTD_SERVER__FILESYSTEMS);
		}
		return filesystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectdDisk> getDisks() {
		if (disks == null) {
			disks = new EObjectContainmentEList<CollectdDisk>(CollectdDisk.class, this, CollectdPackage.COLLECTD_SERVER__DISKS);
		}
		return disks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectdInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<CollectdInterface>(CollectdInterface.class, this, CollectdPackage.COLLECTD_SERVER__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectdKvmInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<CollectdKvmInstance>(CollectdKvmInstance.class, this, CollectdPackage.COLLECTD_SERVER__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_SERVER__ALERTS:
				return ((InternalEList<?>)getAlerts()).basicRemove(otherEnd, msgs);
			case CollectdPackage.COLLECTD_SERVER__CPUS:
				return ((InternalEList<?>)getCpus()).basicRemove(otherEnd, msgs);
			case CollectdPackage.COLLECTD_SERVER__MEMORY:
				return basicSetMemory(null, msgs);
			case CollectdPackage.COLLECTD_SERVER__SWAP:
				return basicSetSwap(null, msgs);
			case CollectdPackage.COLLECTD_SERVER__PROCESSES:
				return basicSetProcesses(null, msgs);
			case CollectdPackage.COLLECTD_SERVER__VMEM:
				return basicSetVmem(null, msgs);
			case CollectdPackage.COLLECTD_SERVER__FILESYSTEMS:
				return ((InternalEList<?>)getFilesystems()).basicRemove(otherEnd, msgs);
			case CollectdPackage.COLLECTD_SERVER__DISKS:
				return ((InternalEList<?>)getDisks()).basicRemove(otherEnd, msgs);
			case CollectdPackage.COLLECTD_SERVER__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case CollectdPackage.COLLECTD_SERVER__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case CollectdPackage.COLLECTD_SERVER__ALERTS:
				return getAlerts();
			case CollectdPackage.COLLECTD_SERVER__ALERTING_TEMPLATE:
				if (resolve) return getAlertingTemplate();
				return basicGetAlertingTemplate();
			case CollectdPackage.COLLECTD_SERVER__LOAD_SHORTTERM:
				return getLoad_shortterm();
			case CollectdPackage.COLLECTD_SERVER__LOAD_MIDTERM:
				return getLoad_midterm();
			case CollectdPackage.COLLECTD_SERVER__LOAD_LONGTERM:
				return getLoad_longterm();
			case CollectdPackage.COLLECTD_SERVER__ENTROPY:
				return getEntropy();
			case CollectdPackage.COLLECTD_SERVER__CONTEXTSWITCHES:
				return getContextswitches();
			case CollectdPackage.COLLECTD_SERVER__CPUS:
				return getCpus();
			case CollectdPackage.COLLECTD_SERVER__MEMORY:
				return getMemory();
			case CollectdPackage.COLLECTD_SERVER__SWAP:
				return getSwap();
			case CollectdPackage.COLLECTD_SERVER__PROCESSES:
				return getProcesses();
			case CollectdPackage.COLLECTD_SERVER__VMEM:
				return getVmem();
			case CollectdPackage.COLLECTD_SERVER__FILESYSTEMS:
				return getFilesystems();
			case CollectdPackage.COLLECTD_SERVER__DISKS:
				return getDisks();
			case CollectdPackage.COLLECTD_SERVER__INTERFACES:
				return getInterfaces();
			case CollectdPackage.COLLECTD_SERVER__INSTANCES:
				return getInstances();
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
			case CollectdPackage.COLLECTD_SERVER__ALERTS:
				getAlerts().clear();
				getAlerts().addAll((Collection<? extends Alert>)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__LOAD_SHORTTERM:
				setLoad_shortterm((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__LOAD_MIDTERM:
				setLoad_midterm((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__LOAD_LONGTERM:
				setLoad_longterm((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__ENTROPY:
				setEntropy((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__CONTEXTSWITCHES:
				setContextswitches((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__CPUS:
				getCpus().clear();
				getCpus().addAll((Collection<? extends CollectdCpu>)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__MEMORY:
				setMemory((CollectdMemory)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__SWAP:
				setSwap((CollectdSwap)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__PROCESSES:
				setProcesses((CollectdProcesses)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__VMEM:
				setVmem((CollectdVmem)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__FILESYSTEMS:
				getFilesystems().clear();
				getFilesystems().addAll((Collection<? extends CollectdFileSystem>)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__DISKS:
				getDisks().clear();
				getDisks().addAll((Collection<? extends CollectdDisk>)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends CollectdInterface>)newValue);
				return;
			case CollectdPackage.COLLECTD_SERVER__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends CollectdKvmInstance>)newValue);
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
			case CollectdPackage.COLLECTD_SERVER__ALERTS:
				getAlerts().clear();
				return;
			case CollectdPackage.COLLECTD_SERVER__ALERTING_TEMPLATE:
				setAlertingTemplate((AlertingTemplate)null);
				return;
			case CollectdPackage.COLLECTD_SERVER__LOAD_SHORTTERM:
				setLoad_shortterm(LOAD_SHORTTERM_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_SERVER__LOAD_MIDTERM:
				setLoad_midterm(LOAD_MIDTERM_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_SERVER__LOAD_LONGTERM:
				setLoad_longterm(LOAD_LONGTERM_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_SERVER__ENTROPY:
				setEntropy(ENTROPY_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_SERVER__CONTEXTSWITCHES:
				setContextswitches(CONTEXTSWITCHES_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_SERVER__CPUS:
				getCpus().clear();
				return;
			case CollectdPackage.COLLECTD_SERVER__MEMORY:
				setMemory((CollectdMemory)null);
				return;
			case CollectdPackage.COLLECTD_SERVER__SWAP:
				setSwap((CollectdSwap)null);
				return;
			case CollectdPackage.COLLECTD_SERVER__PROCESSES:
				setProcesses((CollectdProcesses)null);
				return;
			case CollectdPackage.COLLECTD_SERVER__VMEM:
				setVmem((CollectdVmem)null);
				return;
			case CollectdPackage.COLLECTD_SERVER__FILESYSTEMS:
				getFilesystems().clear();
				return;
			case CollectdPackage.COLLECTD_SERVER__DISKS:
				getDisks().clear();
				return;
			case CollectdPackage.COLLECTD_SERVER__INTERFACES:
				getInterfaces().clear();
				return;
			case CollectdPackage.COLLECTD_SERVER__INSTANCES:
				getInstances().clear();
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
			case CollectdPackage.COLLECTD_SERVER__ALERTS:
				return alerts != null && !alerts.isEmpty();
			case CollectdPackage.COLLECTD_SERVER__ALERTING_TEMPLATE:
				return alertingTemplate != null;
			case CollectdPackage.COLLECTD_SERVER__LOAD_SHORTTERM:
				return LOAD_SHORTTERM_EDEFAULT == null ? load_shortterm != null : !LOAD_SHORTTERM_EDEFAULT.equals(load_shortterm);
			case CollectdPackage.COLLECTD_SERVER__LOAD_MIDTERM:
				return LOAD_MIDTERM_EDEFAULT == null ? load_midterm != null : !LOAD_MIDTERM_EDEFAULT.equals(load_midterm);
			case CollectdPackage.COLLECTD_SERVER__LOAD_LONGTERM:
				return LOAD_LONGTERM_EDEFAULT == null ? load_longterm != null : !LOAD_LONGTERM_EDEFAULT.equals(load_longterm);
			case CollectdPackage.COLLECTD_SERVER__ENTROPY:
				return ENTROPY_EDEFAULT == null ? entropy != null : !ENTROPY_EDEFAULT.equals(entropy);
			case CollectdPackage.COLLECTD_SERVER__CONTEXTSWITCHES:
				return CONTEXTSWITCHES_EDEFAULT == null ? contextswitches != null : !CONTEXTSWITCHES_EDEFAULT.equals(contextswitches);
			case CollectdPackage.COLLECTD_SERVER__CPUS:
				return cpus != null && !cpus.isEmpty();
			case CollectdPackage.COLLECTD_SERVER__MEMORY:
				return memory != null;
			case CollectdPackage.COLLECTD_SERVER__SWAP:
				return swap != null;
			case CollectdPackage.COLLECTD_SERVER__PROCESSES:
				return processes != null;
			case CollectdPackage.COLLECTD_SERVER__VMEM:
				return vmem != null;
			case CollectdPackage.COLLECTD_SERVER__FILESYSTEMS:
				return filesystems != null && !filesystems.isEmpty();
			case CollectdPackage.COLLECTD_SERVER__DISKS:
				return disks != null && !disks.isEmpty();
			case CollectdPackage.COLLECTD_SERVER__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case CollectdPackage.COLLECTD_SERVER__INSTANCES:
				return instances != null && !instances.isEmpty();
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
				case CollectdPackage.COLLECTD_SERVER__ALERTS: return AlertsPackage.ALERT_CONTAINER__ALERTS;
				case CollectdPackage.COLLECTD_SERVER__ALERTING_TEMPLATE: return AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE;
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
				case AlertsPackage.ALERT_CONTAINER__ALERTS: return CollectdPackage.COLLECTD_SERVER__ALERTS;
				case AlertsPackage.ALERT_CONTAINER__ALERTING_TEMPLATE: return CollectdPackage.COLLECTD_SERVER__ALERTING_TEMPLATE;
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
		result.append(" (load_shortterm: ");
		result.append(load_shortterm);
		result.append(", load_midterm: ");
		result.append(load_midterm);
		result.append(", load_longterm: ");
		result.append(load_longterm);
		result.append(", entropy: ");
		result.append(entropy);
		result.append(", contextswitches: ");
		result.append(contextswitches);
		result.append(')');
		return result.toString();
	}

} //CollectdServerImpl
