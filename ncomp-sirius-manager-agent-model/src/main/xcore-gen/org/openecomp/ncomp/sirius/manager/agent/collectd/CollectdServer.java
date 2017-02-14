
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
package org.openecomp.ncomp.sirius.manager.agent.collectd;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.alerts.AlertContainer;

import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_shortterm <em>Load shortterm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_midterm <em>Load midterm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_longterm <em>Load longterm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getEntropy <em>Entropy</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getContextswitches <em>Contextswitches</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getCpus <em>Cpus</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getSwap <em>Swap</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getVmem <em>Vmem</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getFilesystems <em>Filesystems</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getDisks <em>Disks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer()
 * @model
 * @generated
 */
public interface CollectdServer extends NamedEntity, AlertContainer {
	/**
	 * Returns the value of the '<em><b>Load shortterm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load shortterm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load shortterm</em>' attribute.
	 * @see #setLoad_shortterm(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Load_shortterm()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getLoad_shortterm();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_shortterm <em>Load shortterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load shortterm</em>' attribute.
	 * @see #getLoad_shortterm()
	 * @generated
	 */
	void setLoad_shortterm(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Load midterm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load midterm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load midterm</em>' attribute.
	 * @see #setLoad_midterm(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Load_midterm()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getLoad_midterm();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_midterm <em>Load midterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load midterm</em>' attribute.
	 * @see #getLoad_midterm()
	 * @generated
	 */
	void setLoad_midterm(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Load longterm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load longterm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load longterm</em>' attribute.
	 * @see #setLoad_longterm(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Load_longterm()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getLoad_longterm();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_longterm <em>Load longterm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load longterm</em>' attribute.
	 * @see #getLoad_longterm()
	 * @generated
	 */
	void setLoad_longterm(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Entropy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entropy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entropy</em>' attribute.
	 * @see #setEntropy(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Entropy()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getEntropy();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getEntropy <em>Entropy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entropy</em>' attribute.
	 * @see #getEntropy()
	 * @generated
	 */
	void setEntropy(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Contextswitches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextswitches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextswitches</em>' attribute.
	 * @see #setContextswitches(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Contextswitches()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getContextswitches();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getContextswitches <em>Contextswitches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextswitches</em>' attribute.
	 * @see #getContextswitches()
	 * @generated
	 */
	void setContextswitches(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Cpus</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpus</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Cpus()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectdCpu> getCpus();

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference.
	 * @see #setMemory(CollectdMemory)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Memory()
	 * @model containment="true"
	 * @generated
	 */
	CollectdMemory getMemory();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getMemory <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' containment reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(CollectdMemory value);

	/**
	 * Returns the value of the '<em><b>Swap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swap</em>' containment reference.
	 * @see #setSwap(CollectdSwap)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Swap()
	 * @model containment="true"
	 * @generated
	 */
	CollectdSwap getSwap();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getSwap <em>Swap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap</em>' containment reference.
	 * @see #getSwap()
	 * @generated
	 */
	void setSwap(CollectdSwap value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference.
	 * @see #setProcesses(CollectdProcesses)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Processes()
	 * @model containment="true"
	 * @generated
	 */
	CollectdProcesses getProcesses();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getProcesses <em>Processes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processes</em>' containment reference.
	 * @see #getProcesses()
	 * @generated
	 */
	void setProcesses(CollectdProcesses value);

	/**
	 * Returns the value of the '<em><b>Vmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmem</em>' containment reference.
	 * @see #setVmem(CollectdVmem)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Vmem()
	 * @model containment="true"
	 * @generated
	 */
	CollectdVmem getVmem();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getVmem <em>Vmem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmem</em>' containment reference.
	 * @see #getVmem()
	 * @generated
	 */
	void setVmem(CollectdVmem value);

	/**
	 * Returns the value of the '<em><b>Filesystems</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filesystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filesystems</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Filesystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectdFileSystem> getFilesystems();

	/**
	 * Returns the value of the '<em><b>Disks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disks</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Disks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectdDisk> getDisks();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectdInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdServer_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectdKvmInstance> getInstances();

} // CollectdServer
