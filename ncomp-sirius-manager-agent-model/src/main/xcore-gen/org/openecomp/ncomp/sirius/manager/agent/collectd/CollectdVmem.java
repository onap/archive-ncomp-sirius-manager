
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

import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vmem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getActive_anon <em>Active anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getActive_file <em>Active file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getAnon_pages <em>Anon pages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getAnon_transparent_hugepages <em>Anon transparent hugepages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getBounce <em>Bounce</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirtied <em>Dirtied</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty <em>Dirty</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty_background_threshold <em>Dirty background threshold</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty_threshold <em>Dirty threshold</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFile_pages <em>File pages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFree_pages <em>Free pages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getInactive_anon <em>Inactive anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getInactive_file <em>Inactive file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getIsolated_anon <em>Isolated anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getIsolated_file <em>Isolated file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getKernel_stack <em>Kernel stack</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMapped <em>Mapped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMlock <em>Mlock</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getPage_table_pages <em>Page table pages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getShmem <em>Shmem</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSlab_reclaimable <em>Slab reclaimable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSlab_unreclaimable <em>Slab unreclaimable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getUnevictable <em>Unevictable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getUnstable <em>Unstable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getVmscan_immediate_reclaim <em>Vmscan immediate reclaim</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getVmscan_write <em>Vmscan write</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWriteback <em>Writeback</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWriteback_temp <em>Writeback temp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWritten <em>Written</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMemory_in <em>Memory in</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMemory_out <em>Memory out</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSwap_in <em>Swap in</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSwap_out <em>Swap out</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFaults_minor <em>Faults minor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFaults_major <em>Faults major</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem()
 * @model
 * @generated
 */
public interface CollectdVmem extends EObject {
	/**
	 * Returns the value of the '<em><b>Active anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active anon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active anon</em>' attribute.
	 * @see #setActive_anon(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Active_anon()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getActive_anon();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getActive_anon <em>Active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active anon</em>' attribute.
	 * @see #getActive_anon()
	 * @generated
	 */
	void setActive_anon(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Active file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active file</em>' attribute.
	 * @see #setActive_file(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Active_file()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getActive_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getActive_file <em>Active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active file</em>' attribute.
	 * @see #getActive_file()
	 * @generated
	 */
	void setActive_file(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Anon pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anon pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anon pages</em>' attribute.
	 * @see #setAnon_pages(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Anon_pages()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getAnon_pages();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getAnon_pages <em>Anon pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anon pages</em>' attribute.
	 * @see #getAnon_pages()
	 * @generated
	 */
	void setAnon_pages(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Anon transparent hugepages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anon transparent hugepages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anon transparent hugepages</em>' attribute.
	 * @see #setAnon_transparent_hugepages(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Anon_transparent_hugepages()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getAnon_transparent_hugepages();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getAnon_transparent_hugepages <em>Anon transparent hugepages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anon transparent hugepages</em>' attribute.
	 * @see #getAnon_transparent_hugepages()
	 * @generated
	 */
	void setAnon_transparent_hugepages(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Bounce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounce</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounce</em>' attribute.
	 * @see #setBounce(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Bounce()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getBounce();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getBounce <em>Bounce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounce</em>' attribute.
	 * @see #getBounce()
	 * @generated
	 */
	void setBounce(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Dirtied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirtied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirtied</em>' attribute.
	 * @see #setDirtied(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Dirtied()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getDirtied();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirtied <em>Dirtied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirtied</em>' attribute.
	 * @see #getDirtied()
	 * @generated
	 */
	void setDirtied(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirty</em>' attribute.
	 * @see #setDirty(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Dirty()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getDirty();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty <em>Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirty</em>' attribute.
	 * @see #getDirty()
	 * @generated
	 */
	void setDirty(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Dirty background threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirty background threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirty background threshold</em>' attribute.
	 * @see #setDirty_background_threshold(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Dirty_background_threshold()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getDirty_background_threshold();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty_background_threshold <em>Dirty background threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirty background threshold</em>' attribute.
	 * @see #getDirty_background_threshold()
	 * @generated
	 */
	void setDirty_background_threshold(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Dirty threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dirty threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dirty threshold</em>' attribute.
	 * @see #setDirty_threshold(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Dirty_threshold()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getDirty_threshold();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty_threshold <em>Dirty threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dirty threshold</em>' attribute.
	 * @see #getDirty_threshold()
	 * @generated
	 */
	void setDirty_threshold(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>File pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File pages</em>' attribute.
	 * @see #setFile_pages(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_File_pages()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getFile_pages();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFile_pages <em>File pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File pages</em>' attribute.
	 * @see #getFile_pages()
	 * @generated
	 */
	void setFile_pages(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Free pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free pages</em>' attribute.
	 * @see #setFree_pages(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Free_pages()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getFree_pages();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFree_pages <em>Free pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free pages</em>' attribute.
	 * @see #getFree_pages()
	 * @generated
	 */
	void setFree_pages(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Inactive anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive anon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive anon</em>' attribute.
	 * @see #setInactive_anon(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Inactive_anon()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getInactive_anon();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getInactive_anon <em>Inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive anon</em>' attribute.
	 * @see #getInactive_anon()
	 * @generated
	 */
	void setInactive_anon(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Inactive file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive file</em>' attribute.
	 * @see #setInactive_file(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Inactive_file()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getInactive_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getInactive_file <em>Inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive file</em>' attribute.
	 * @see #getInactive_file()
	 * @generated
	 */
	void setInactive_file(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Isolated anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolated anon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolated anon</em>' attribute.
	 * @see #setIsolated_anon(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Isolated_anon()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getIsolated_anon();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getIsolated_anon <em>Isolated anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolated anon</em>' attribute.
	 * @see #getIsolated_anon()
	 * @generated
	 */
	void setIsolated_anon(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Isolated file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isolated file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isolated file</em>' attribute.
	 * @see #setIsolated_file(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Isolated_file()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getIsolated_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getIsolated_file <em>Isolated file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isolated file</em>' attribute.
	 * @see #getIsolated_file()
	 * @generated
	 */
	void setIsolated_file(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Kernel stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel stack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel stack</em>' attribute.
	 * @see #setKernel_stack(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Kernel_stack()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getKernel_stack();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getKernel_stack <em>Kernel stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel stack</em>' attribute.
	 * @see #getKernel_stack()
	 * @generated
	 */
	void setKernel_stack(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped</em>' attribute.
	 * @see #setMapped(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Mapped()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getMapped();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMapped <em>Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped</em>' attribute.
	 * @see #getMapped()
	 * @generated
	 */
	void setMapped(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Mlock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mlock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mlock</em>' attribute.
	 * @see #setMlock(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Mlock()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getMlock();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMlock <em>Mlock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mlock</em>' attribute.
	 * @see #getMlock()
	 * @generated
	 */
	void setMlock(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Page table pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page table pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page table pages</em>' attribute.
	 * @see #setPage_table_pages(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Page_table_pages()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getPage_table_pages();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getPage_table_pages <em>Page table pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page table pages</em>' attribute.
	 * @see #getPage_table_pages()
	 * @generated
	 */
	void setPage_table_pages(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Shmem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shmem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shmem</em>' attribute.
	 * @see #setShmem(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Shmem()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getShmem();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getShmem <em>Shmem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shmem</em>' attribute.
	 * @see #getShmem()
	 * @generated
	 */
	void setShmem(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Slab reclaimable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slab reclaimable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slab reclaimable</em>' attribute.
	 * @see #setSlab_reclaimable(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Slab_reclaimable()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getSlab_reclaimable();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSlab_reclaimable <em>Slab reclaimable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slab reclaimable</em>' attribute.
	 * @see #getSlab_reclaimable()
	 * @generated
	 */
	void setSlab_reclaimable(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Slab unreclaimable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slab unreclaimable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slab unreclaimable</em>' attribute.
	 * @see #setSlab_unreclaimable(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Slab_unreclaimable()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getSlab_unreclaimable();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSlab_unreclaimable <em>Slab unreclaimable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slab unreclaimable</em>' attribute.
	 * @see #getSlab_unreclaimable()
	 * @generated
	 */
	void setSlab_unreclaimable(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Unevictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unevictable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unevictable</em>' attribute.
	 * @see #setUnevictable(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Unevictable()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getUnevictable();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getUnevictable <em>Unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unevictable</em>' attribute.
	 * @see #getUnevictable()
	 * @generated
	 */
	void setUnevictable(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Unstable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unstable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unstable</em>' attribute.
	 * @see #setUnstable(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Unstable()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getUnstable();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getUnstable <em>Unstable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unstable</em>' attribute.
	 * @see #getUnstable()
	 * @generated
	 */
	void setUnstable(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Vmscan immediate reclaim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmscan immediate reclaim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmscan immediate reclaim</em>' attribute.
	 * @see #setVmscan_immediate_reclaim(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Vmscan_immediate_reclaim()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getVmscan_immediate_reclaim();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getVmscan_immediate_reclaim <em>Vmscan immediate reclaim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmscan immediate reclaim</em>' attribute.
	 * @see #getVmscan_immediate_reclaim()
	 * @generated
	 */
	void setVmscan_immediate_reclaim(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Vmscan write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vmscan write</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vmscan write</em>' attribute.
	 * @see #setVmscan_write(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Vmscan_write()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getVmscan_write();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getVmscan_write <em>Vmscan write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmscan write</em>' attribute.
	 * @see #getVmscan_write()
	 * @generated
	 */
	void setVmscan_write(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Writeback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writeback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writeback</em>' attribute.
	 * @see #setWriteback(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Writeback()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getWriteback();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWriteback <em>Writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writeback</em>' attribute.
	 * @see #getWriteback()
	 * @generated
	 */
	void setWriteback(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Writeback temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writeback temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writeback temp</em>' attribute.
	 * @see #setWriteback_temp(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Writeback_temp()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getWriteback_temp();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWriteback_temp <em>Writeback temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writeback temp</em>' attribute.
	 * @see #getWriteback_temp()
	 * @generated
	 */
	void setWriteback_temp(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Written</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Written</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Written</em>' attribute.
	 * @see #setWritten(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Written()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getWritten();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWritten <em>Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Written</em>' attribute.
	 * @see #getWritten()
	 * @generated
	 */
	void setWritten(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Memory in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory in</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory in</em>' attribute.
	 * @see #setMemory_in(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Memory_in()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getMemory_in();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMemory_in <em>Memory in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory in</em>' attribute.
	 * @see #getMemory_in()
	 * @generated
	 */
	void setMemory_in(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Memory out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory out</em>' attribute.
	 * @see #setMemory_out(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Memory_out()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getMemory_out();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMemory_out <em>Memory out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory out</em>' attribute.
	 * @see #getMemory_out()
	 * @generated
	 */
	void setMemory_out(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Swap in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swap in</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swap in</em>' attribute.
	 * @see #setSwap_in(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Swap_in()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getSwap_in();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSwap_in <em>Swap in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap in</em>' attribute.
	 * @see #getSwap_in()
	 * @generated
	 */
	void setSwap_in(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Swap out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swap out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swap out</em>' attribute.
	 * @see #setSwap_out(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Swap_out()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getSwap_out();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSwap_out <em>Swap out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap out</em>' attribute.
	 * @see #getSwap_out()
	 * @generated
	 */
	void setSwap_out(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Faults minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faults minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faults minor</em>' attribute.
	 * @see #setFaults_minor(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Faults_minor()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getFaults_minor();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFaults_minor <em>Faults minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faults minor</em>' attribute.
	 * @see #getFaults_minor()
	 * @generated
	 */
	void setFaults_minor(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Faults major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faults major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faults major</em>' attribute.
	 * @see #setFaults_major(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdVmem_Faults_major()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getFaults_major();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFaults_major <em>Faults major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faults major</em>' attribute.
	 * @see #getFaults_major()
	 * @generated
	 */
	void setFaults_major(IncreasingULongMetricAttribute value);

} // CollectdVmem
