
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

import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vmem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getActive_anon <em>Active anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getActive_file <em>Active file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getAnon_pages <em>Anon pages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getAnon_transparent_hugepages <em>Anon transparent hugepages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getBounce <em>Bounce</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getDirtied <em>Dirtied</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getDirty <em>Dirty</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getDirty_background_threshold <em>Dirty background threshold</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getDirty_threshold <em>Dirty threshold</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getFile_pages <em>File pages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getFree_pages <em>Free pages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getInactive_anon <em>Inactive anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getInactive_file <em>Inactive file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getIsolated_anon <em>Isolated anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getIsolated_file <em>Isolated file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getKernel_stack <em>Kernel stack</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getMapped <em>Mapped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getMlock <em>Mlock</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getPage_table_pages <em>Page table pages</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getShmem <em>Shmem</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getSlab_reclaimable <em>Slab reclaimable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getSlab_unreclaimable <em>Slab unreclaimable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getUnevictable <em>Unevictable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getUnstable <em>Unstable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getVmscan_immediate_reclaim <em>Vmscan immediate reclaim</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getVmscan_write <em>Vmscan write</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getWriteback <em>Writeback</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getWriteback_temp <em>Writeback temp</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getWritten <em>Written</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getMemory_in <em>Memory in</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getMemory_out <em>Memory out</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getSwap_in <em>Swap in</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getSwap_out <em>Swap out</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getFaults_minor <em>Faults minor</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl#getFaults_major <em>Faults major</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectdVmemImpl extends MinimalEObjectImpl.Container implements CollectdVmem {
	/**
	 * The default value of the '{@link #getActive_anon() <em>Active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_anon()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute ACTIVE_ANON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActive_anon() <em>Active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_anon()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute active_anon = ACTIVE_ANON_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_file() <em>Active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_file()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute ACTIVE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActive_file() <em>Active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_file()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute active_file = ACTIVE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnon_pages() <em>Anon pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnon_pages()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute ANON_PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnon_pages() <em>Anon pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnon_pages()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute anon_pages = ANON_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnon_transparent_hugepages() <em>Anon transparent hugepages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnon_transparent_hugepages()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute ANON_TRANSPARENT_HUGEPAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnon_transparent_hugepages() <em>Anon transparent hugepages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnon_transparent_hugepages()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute anon_transparent_hugepages = ANON_TRANSPARENT_HUGEPAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBounce() <em>Bounce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounce()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute BOUNCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBounce() <em>Bounce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBounce()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute bounce = BOUNCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirtied() <em>Dirtied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirtied()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute DIRTIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirtied() <em>Dirtied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirtied()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute dirtied = DIRTIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirty() <em>Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirty()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute DIRTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirty() <em>Dirty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirty()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute dirty = DIRTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirty_background_threshold() <em>Dirty background threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirty_background_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute DIRTY_BACKGROUND_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirty_background_threshold() <em>Dirty background threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirty_background_threshold()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute dirty_background_threshold = DIRTY_BACKGROUND_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirty_threshold() <em>Dirty threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirty_threshold()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute DIRTY_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirty_threshold() <em>Dirty threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirty_threshold()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute dirty_threshold = DIRTY_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile_pages() <em>File pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_pages()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute FILE_PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_pages() <em>File pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_pages()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute file_pages = FILE_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFree_pages() <em>Free pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree_pages()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute FREE_PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFree_pages() <em>Free pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree_pages()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute free_pages = FREE_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getInactive_anon() <em>Inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive_anon()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute INACTIVE_ANON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInactive_anon() <em>Inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive_anon()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute inactive_anon = INACTIVE_ANON_EDEFAULT;

	/**
	 * The default value of the '{@link #getInactive_file() <em>Inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive_file()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute INACTIVE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInactive_file() <em>Inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive_file()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute inactive_file = INACTIVE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolated_anon() <em>Isolated anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated_anon()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute ISOLATED_ANON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsolated_anon() <em>Isolated anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated_anon()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute isolated_anon = ISOLATED_ANON_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsolated_file() <em>Isolated file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated_file()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute ISOLATED_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsolated_file() <em>Isolated file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolated_file()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute isolated_file = ISOLATED_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKernel_stack() <em>Kernel stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_stack()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute KERNEL_STACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKernel_stack() <em>Kernel stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_stack()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute kernel_stack = KERNEL_STACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapped() <em>Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapped()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute MAPPED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMapped() <em>Mapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapped()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute mapped = MAPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMlock() <em>Mlock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlock()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute MLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMlock() <em>Mlock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMlock()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute mlock = MLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPage_table_pages() <em>Page table pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage_table_pages()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute PAGE_TABLE_PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPage_table_pages() <em>Page table pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage_table_pages()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute page_table_pages = PAGE_TABLE_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getShmem() <em>Shmem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShmem()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute SHMEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShmem() <em>Shmem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShmem()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute shmem = SHMEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlab_reclaimable() <em>Slab reclaimable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlab_reclaimable()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute SLAB_RECLAIMABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlab_reclaimable() <em>Slab reclaimable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlab_reclaimable()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute slab_reclaimable = SLAB_RECLAIMABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlab_unreclaimable() <em>Slab unreclaimable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlab_unreclaimable()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute SLAB_UNRECLAIMABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlab_unreclaimable() <em>Slab unreclaimable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlab_unreclaimable()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute slab_unreclaimable = SLAB_UNRECLAIMABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnevictable() <em>Unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnevictable()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute UNEVICTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnevictable() <em>Unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnevictable()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute unevictable = UNEVICTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnstable() <em>Unstable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnstable()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute UNSTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnstable() <em>Unstable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnstable()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute unstable = UNSTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmscan_immediate_reclaim() <em>Vmscan immediate reclaim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmscan_immediate_reclaim()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute VMSCAN_IMMEDIATE_RECLAIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmscan_immediate_reclaim() <em>Vmscan immediate reclaim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmscan_immediate_reclaim()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute vmscan_immediate_reclaim = VMSCAN_IMMEDIATE_RECLAIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmscan_write() <em>Vmscan write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmscan_write()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute VMSCAN_WRITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmscan_write() <em>Vmscan write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmscan_write()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute vmscan_write = VMSCAN_WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteback() <em>Writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteback()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute WRITEBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteback() <em>Writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteback()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute writeback = WRITEBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteback_temp() <em>Writeback temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteback_temp()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute WRITEBACK_TEMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteback_temp() <em>Writeback temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteback_temp()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute writeback_temp = WRITEBACK_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWritten() <em>Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritten()
	 * @generated
	 * @ordered
	 */
	protected static final DoubleMetricAttribute WRITTEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWritten() <em>Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritten()
	 * @generated
	 * @ordered
	 */
	protected DoubleMetricAttribute written = WRITTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_in() <em>Memory in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_in()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute MEMORY_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemory_in() <em>Memory in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_in()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute memory_in = MEMORY_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory_out() <em>Memory out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_out()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute MEMORY_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemory_out() <em>Memory out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory_out()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute memory_out = MEMORY_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwap_in() <em>Swap in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap_in()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute SWAP_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwap_in() <em>Swap in</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap_in()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute swap_in = SWAP_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwap_out() <em>Swap out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap_out()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute SWAP_OUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwap_out() <em>Swap out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwap_out()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute swap_out = SWAP_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaults_minor() <em>Faults minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaults_minor()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute FAULTS_MINOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaults_minor() <em>Faults minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaults_minor()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute faults_minor = FAULTS_MINOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaults_major() <em>Faults major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaults_major()
	 * @generated
	 * @ordered
	 */
	protected static final IncreasingULongMetricAttribute FAULTS_MAJOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaults_major() <em>Faults major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaults_major()
	 * @generated
	 * @ordered
	 */
	protected IncreasingULongMetricAttribute faults_major = FAULTS_MAJOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectdVmemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectdPackage.Literals.COLLECTD_VMEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getActive_anon() {
		return active_anon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_anon(DoubleMetricAttribute newActive_anon) {
		DoubleMetricAttribute oldActive_anon = active_anon;
		active_anon = newActive_anon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__ACTIVE_ANON, oldActive_anon, active_anon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getActive_file() {
		return active_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_file(DoubleMetricAttribute newActive_file) {
		DoubleMetricAttribute oldActive_file = active_file;
		active_file = newActive_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__ACTIVE_FILE, oldActive_file, active_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getAnon_pages() {
		return anon_pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnon_pages(DoubleMetricAttribute newAnon_pages) {
		DoubleMetricAttribute oldAnon_pages = anon_pages;
		anon_pages = newAnon_pages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__ANON_PAGES, oldAnon_pages, anon_pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getAnon_transparent_hugepages() {
		return anon_transparent_hugepages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnon_transparent_hugepages(DoubleMetricAttribute newAnon_transparent_hugepages) {
		DoubleMetricAttribute oldAnon_transparent_hugepages = anon_transparent_hugepages;
		anon_transparent_hugepages = newAnon_transparent_hugepages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__ANON_TRANSPARENT_HUGEPAGES, oldAnon_transparent_hugepages, anon_transparent_hugepages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getBounce() {
		return bounce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounce(DoubleMetricAttribute newBounce) {
		DoubleMetricAttribute oldBounce = bounce;
		bounce = newBounce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__BOUNCE, oldBounce, bounce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getDirtied() {
		return dirtied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirtied(DoubleMetricAttribute newDirtied) {
		DoubleMetricAttribute oldDirtied = dirtied;
		dirtied = newDirtied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__DIRTIED, oldDirtied, dirtied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getDirty() {
		return dirty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirty(DoubleMetricAttribute newDirty) {
		DoubleMetricAttribute oldDirty = dirty;
		dirty = newDirty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__DIRTY, oldDirty, dirty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getDirty_background_threshold() {
		return dirty_background_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirty_background_threshold(DoubleMetricAttribute newDirty_background_threshold) {
		DoubleMetricAttribute oldDirty_background_threshold = dirty_background_threshold;
		dirty_background_threshold = newDirty_background_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__DIRTY_BACKGROUND_THRESHOLD, oldDirty_background_threshold, dirty_background_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getDirty_threshold() {
		return dirty_threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirty_threshold(DoubleMetricAttribute newDirty_threshold) {
		DoubleMetricAttribute oldDirty_threshold = dirty_threshold;
		dirty_threshold = newDirty_threshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__DIRTY_THRESHOLD, oldDirty_threshold, dirty_threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getFile_pages() {
		return file_pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile_pages(DoubleMetricAttribute newFile_pages) {
		DoubleMetricAttribute oldFile_pages = file_pages;
		file_pages = newFile_pages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__FILE_PAGES, oldFile_pages, file_pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getFree_pages() {
		return free_pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree_pages(DoubleMetricAttribute newFree_pages) {
		DoubleMetricAttribute oldFree_pages = free_pages;
		free_pages = newFree_pages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__FREE_PAGES, oldFree_pages, free_pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getInactive_anon() {
		return inactive_anon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive_anon(DoubleMetricAttribute newInactive_anon) {
		DoubleMetricAttribute oldInactive_anon = inactive_anon;
		inactive_anon = newInactive_anon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__INACTIVE_ANON, oldInactive_anon, inactive_anon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getInactive_file() {
		return inactive_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive_file(DoubleMetricAttribute newInactive_file) {
		DoubleMetricAttribute oldInactive_file = inactive_file;
		inactive_file = newInactive_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__INACTIVE_FILE, oldInactive_file, inactive_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getIsolated_anon() {
		return isolated_anon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolated_anon(DoubleMetricAttribute newIsolated_anon) {
		DoubleMetricAttribute oldIsolated_anon = isolated_anon;
		isolated_anon = newIsolated_anon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__ISOLATED_ANON, oldIsolated_anon, isolated_anon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getIsolated_file() {
		return isolated_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolated_file(DoubleMetricAttribute newIsolated_file) {
		DoubleMetricAttribute oldIsolated_file = isolated_file;
		isolated_file = newIsolated_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__ISOLATED_FILE, oldIsolated_file, isolated_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getKernel_stack() {
		return kernel_stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKernel_stack(DoubleMetricAttribute newKernel_stack) {
		DoubleMetricAttribute oldKernel_stack = kernel_stack;
		kernel_stack = newKernel_stack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__KERNEL_STACK, oldKernel_stack, kernel_stack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getMapped() {
		return mapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapped(DoubleMetricAttribute newMapped) {
		DoubleMetricAttribute oldMapped = mapped;
		mapped = newMapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__MAPPED, oldMapped, mapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getMlock() {
		return mlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMlock(DoubleMetricAttribute newMlock) {
		DoubleMetricAttribute oldMlock = mlock;
		mlock = newMlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__MLOCK, oldMlock, mlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getPage_table_pages() {
		return page_table_pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPage_table_pages(DoubleMetricAttribute newPage_table_pages) {
		DoubleMetricAttribute oldPage_table_pages = page_table_pages;
		page_table_pages = newPage_table_pages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__PAGE_TABLE_PAGES, oldPage_table_pages, page_table_pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getShmem() {
		return shmem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShmem(DoubleMetricAttribute newShmem) {
		DoubleMetricAttribute oldShmem = shmem;
		shmem = newShmem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__SHMEM, oldShmem, shmem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getSlab_reclaimable() {
		return slab_reclaimable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlab_reclaimable(DoubleMetricAttribute newSlab_reclaimable) {
		DoubleMetricAttribute oldSlab_reclaimable = slab_reclaimable;
		slab_reclaimable = newSlab_reclaimable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__SLAB_RECLAIMABLE, oldSlab_reclaimable, slab_reclaimable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getSlab_unreclaimable() {
		return slab_unreclaimable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlab_unreclaimable(DoubleMetricAttribute newSlab_unreclaimable) {
		DoubleMetricAttribute oldSlab_unreclaimable = slab_unreclaimable;
		slab_unreclaimable = newSlab_unreclaimable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__SLAB_UNRECLAIMABLE, oldSlab_unreclaimable, slab_unreclaimable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getUnevictable() {
		return unevictable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnevictable(DoubleMetricAttribute newUnevictable) {
		DoubleMetricAttribute oldUnevictable = unevictable;
		unevictable = newUnevictable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__UNEVICTABLE, oldUnevictable, unevictable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getUnstable() {
		return unstable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnstable(DoubleMetricAttribute newUnstable) {
		DoubleMetricAttribute oldUnstable = unstable;
		unstable = newUnstable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__UNSTABLE, oldUnstable, unstable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getVmscan_immediate_reclaim() {
		return vmscan_immediate_reclaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmscan_immediate_reclaim(DoubleMetricAttribute newVmscan_immediate_reclaim) {
		DoubleMetricAttribute oldVmscan_immediate_reclaim = vmscan_immediate_reclaim;
		vmscan_immediate_reclaim = newVmscan_immediate_reclaim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__VMSCAN_IMMEDIATE_RECLAIM, oldVmscan_immediate_reclaim, vmscan_immediate_reclaim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getVmscan_write() {
		return vmscan_write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmscan_write(DoubleMetricAttribute newVmscan_write) {
		DoubleMetricAttribute oldVmscan_write = vmscan_write;
		vmscan_write = newVmscan_write;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__VMSCAN_WRITE, oldVmscan_write, vmscan_write));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getWriteback() {
		return writeback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteback(DoubleMetricAttribute newWriteback) {
		DoubleMetricAttribute oldWriteback = writeback;
		writeback = newWriteback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__WRITEBACK, oldWriteback, writeback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getWriteback_temp() {
		return writeback_temp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteback_temp(DoubleMetricAttribute newWriteback_temp) {
		DoubleMetricAttribute oldWriteback_temp = writeback_temp;
		writeback_temp = newWriteback_temp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__WRITEBACK_TEMP, oldWriteback_temp, writeback_temp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleMetricAttribute getWritten() {
		return written;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWritten(DoubleMetricAttribute newWritten) {
		DoubleMetricAttribute oldWritten = written;
		written = newWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__WRITTEN, oldWritten, written));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getMemory_in() {
		return memory_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_in(IncreasingULongMetricAttribute newMemory_in) {
		IncreasingULongMetricAttribute oldMemory_in = memory_in;
		memory_in = newMemory_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__MEMORY_IN, oldMemory_in, memory_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getMemory_out() {
		return memory_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory_out(IncreasingULongMetricAttribute newMemory_out) {
		IncreasingULongMetricAttribute oldMemory_out = memory_out;
		memory_out = newMemory_out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__MEMORY_OUT, oldMemory_out, memory_out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getSwap_in() {
		return swap_in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwap_in(IncreasingULongMetricAttribute newSwap_in) {
		IncreasingULongMetricAttribute oldSwap_in = swap_in;
		swap_in = newSwap_in;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__SWAP_IN, oldSwap_in, swap_in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getSwap_out() {
		return swap_out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwap_out(IncreasingULongMetricAttribute newSwap_out) {
		IncreasingULongMetricAttribute oldSwap_out = swap_out;
		swap_out = newSwap_out;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__SWAP_OUT, oldSwap_out, swap_out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getFaults_minor() {
		return faults_minor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaults_minor(IncreasingULongMetricAttribute newFaults_minor) {
		IncreasingULongMetricAttribute oldFaults_minor = faults_minor;
		faults_minor = newFaults_minor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__FAULTS_MINOR, oldFaults_minor, faults_minor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreasingULongMetricAttribute getFaults_major() {
		return faults_major;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaults_major(IncreasingULongMetricAttribute newFaults_major) {
		IncreasingULongMetricAttribute oldFaults_major = faults_major;
		faults_major = newFaults_major;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectdPackage.COLLECTD_VMEM__FAULTS_MAJOR, oldFaults_major, faults_major));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectdPackage.COLLECTD_VMEM__ACTIVE_ANON:
				return getActive_anon();
			case CollectdPackage.COLLECTD_VMEM__ACTIVE_FILE:
				return getActive_file();
			case CollectdPackage.COLLECTD_VMEM__ANON_PAGES:
				return getAnon_pages();
			case CollectdPackage.COLLECTD_VMEM__ANON_TRANSPARENT_HUGEPAGES:
				return getAnon_transparent_hugepages();
			case CollectdPackage.COLLECTD_VMEM__BOUNCE:
				return getBounce();
			case CollectdPackage.COLLECTD_VMEM__DIRTIED:
				return getDirtied();
			case CollectdPackage.COLLECTD_VMEM__DIRTY:
				return getDirty();
			case CollectdPackage.COLLECTD_VMEM__DIRTY_BACKGROUND_THRESHOLD:
				return getDirty_background_threshold();
			case CollectdPackage.COLLECTD_VMEM__DIRTY_THRESHOLD:
				return getDirty_threshold();
			case CollectdPackage.COLLECTD_VMEM__FILE_PAGES:
				return getFile_pages();
			case CollectdPackage.COLLECTD_VMEM__FREE_PAGES:
				return getFree_pages();
			case CollectdPackage.COLLECTD_VMEM__INACTIVE_ANON:
				return getInactive_anon();
			case CollectdPackage.COLLECTD_VMEM__INACTIVE_FILE:
				return getInactive_file();
			case CollectdPackage.COLLECTD_VMEM__ISOLATED_ANON:
				return getIsolated_anon();
			case CollectdPackage.COLLECTD_VMEM__ISOLATED_FILE:
				return getIsolated_file();
			case CollectdPackage.COLLECTD_VMEM__KERNEL_STACK:
				return getKernel_stack();
			case CollectdPackage.COLLECTD_VMEM__MAPPED:
				return getMapped();
			case CollectdPackage.COLLECTD_VMEM__MLOCK:
				return getMlock();
			case CollectdPackage.COLLECTD_VMEM__PAGE_TABLE_PAGES:
				return getPage_table_pages();
			case CollectdPackage.COLLECTD_VMEM__SHMEM:
				return getShmem();
			case CollectdPackage.COLLECTD_VMEM__SLAB_RECLAIMABLE:
				return getSlab_reclaimable();
			case CollectdPackage.COLLECTD_VMEM__SLAB_UNRECLAIMABLE:
				return getSlab_unreclaimable();
			case CollectdPackage.COLLECTD_VMEM__UNEVICTABLE:
				return getUnevictable();
			case CollectdPackage.COLLECTD_VMEM__UNSTABLE:
				return getUnstable();
			case CollectdPackage.COLLECTD_VMEM__VMSCAN_IMMEDIATE_RECLAIM:
				return getVmscan_immediate_reclaim();
			case CollectdPackage.COLLECTD_VMEM__VMSCAN_WRITE:
				return getVmscan_write();
			case CollectdPackage.COLLECTD_VMEM__WRITEBACK:
				return getWriteback();
			case CollectdPackage.COLLECTD_VMEM__WRITEBACK_TEMP:
				return getWriteback_temp();
			case CollectdPackage.COLLECTD_VMEM__WRITTEN:
				return getWritten();
			case CollectdPackage.COLLECTD_VMEM__MEMORY_IN:
				return getMemory_in();
			case CollectdPackage.COLLECTD_VMEM__MEMORY_OUT:
				return getMemory_out();
			case CollectdPackage.COLLECTD_VMEM__SWAP_IN:
				return getSwap_in();
			case CollectdPackage.COLLECTD_VMEM__SWAP_OUT:
				return getSwap_out();
			case CollectdPackage.COLLECTD_VMEM__FAULTS_MINOR:
				return getFaults_minor();
			case CollectdPackage.COLLECTD_VMEM__FAULTS_MAJOR:
				return getFaults_major();
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
			case CollectdPackage.COLLECTD_VMEM__ACTIVE_ANON:
				setActive_anon((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__ACTIVE_FILE:
				setActive_file((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__ANON_PAGES:
				setAnon_pages((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__ANON_TRANSPARENT_HUGEPAGES:
				setAnon_transparent_hugepages((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__BOUNCE:
				setBounce((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__DIRTIED:
				setDirtied((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__DIRTY:
				setDirty((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__DIRTY_BACKGROUND_THRESHOLD:
				setDirty_background_threshold((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__DIRTY_THRESHOLD:
				setDirty_threshold((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__FILE_PAGES:
				setFile_pages((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__FREE_PAGES:
				setFree_pages((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__INACTIVE_ANON:
				setInactive_anon((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__INACTIVE_FILE:
				setInactive_file((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__ISOLATED_ANON:
				setIsolated_anon((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__ISOLATED_FILE:
				setIsolated_file((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__KERNEL_STACK:
				setKernel_stack((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__MAPPED:
				setMapped((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__MLOCK:
				setMlock((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__PAGE_TABLE_PAGES:
				setPage_table_pages((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__SHMEM:
				setShmem((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__SLAB_RECLAIMABLE:
				setSlab_reclaimable((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__SLAB_UNRECLAIMABLE:
				setSlab_unreclaimable((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__UNEVICTABLE:
				setUnevictable((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__UNSTABLE:
				setUnstable((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__VMSCAN_IMMEDIATE_RECLAIM:
				setVmscan_immediate_reclaim((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__VMSCAN_WRITE:
				setVmscan_write((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__WRITEBACK:
				setWriteback((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__WRITEBACK_TEMP:
				setWriteback_temp((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__WRITTEN:
				setWritten((DoubleMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__MEMORY_IN:
				setMemory_in((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__MEMORY_OUT:
				setMemory_out((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__SWAP_IN:
				setSwap_in((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__SWAP_OUT:
				setSwap_out((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__FAULTS_MINOR:
				setFaults_minor((IncreasingULongMetricAttribute)newValue);
				return;
			case CollectdPackage.COLLECTD_VMEM__FAULTS_MAJOR:
				setFaults_major((IncreasingULongMetricAttribute)newValue);
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
			case CollectdPackage.COLLECTD_VMEM__ACTIVE_ANON:
				setActive_anon(ACTIVE_ANON_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__ACTIVE_FILE:
				setActive_file(ACTIVE_FILE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__ANON_PAGES:
				setAnon_pages(ANON_PAGES_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__ANON_TRANSPARENT_HUGEPAGES:
				setAnon_transparent_hugepages(ANON_TRANSPARENT_HUGEPAGES_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__BOUNCE:
				setBounce(BOUNCE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__DIRTIED:
				setDirtied(DIRTIED_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__DIRTY:
				setDirty(DIRTY_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__DIRTY_BACKGROUND_THRESHOLD:
				setDirty_background_threshold(DIRTY_BACKGROUND_THRESHOLD_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__DIRTY_THRESHOLD:
				setDirty_threshold(DIRTY_THRESHOLD_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__FILE_PAGES:
				setFile_pages(FILE_PAGES_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__FREE_PAGES:
				setFree_pages(FREE_PAGES_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__INACTIVE_ANON:
				setInactive_anon(INACTIVE_ANON_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__INACTIVE_FILE:
				setInactive_file(INACTIVE_FILE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__ISOLATED_ANON:
				setIsolated_anon(ISOLATED_ANON_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__ISOLATED_FILE:
				setIsolated_file(ISOLATED_FILE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__KERNEL_STACK:
				setKernel_stack(KERNEL_STACK_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__MAPPED:
				setMapped(MAPPED_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__MLOCK:
				setMlock(MLOCK_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__PAGE_TABLE_PAGES:
				setPage_table_pages(PAGE_TABLE_PAGES_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__SHMEM:
				setShmem(SHMEM_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__SLAB_RECLAIMABLE:
				setSlab_reclaimable(SLAB_RECLAIMABLE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__SLAB_UNRECLAIMABLE:
				setSlab_unreclaimable(SLAB_UNRECLAIMABLE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__UNEVICTABLE:
				setUnevictable(UNEVICTABLE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__UNSTABLE:
				setUnstable(UNSTABLE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__VMSCAN_IMMEDIATE_RECLAIM:
				setVmscan_immediate_reclaim(VMSCAN_IMMEDIATE_RECLAIM_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__VMSCAN_WRITE:
				setVmscan_write(VMSCAN_WRITE_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__WRITEBACK:
				setWriteback(WRITEBACK_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__WRITEBACK_TEMP:
				setWriteback_temp(WRITEBACK_TEMP_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__WRITTEN:
				setWritten(WRITTEN_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__MEMORY_IN:
				setMemory_in(MEMORY_IN_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__MEMORY_OUT:
				setMemory_out(MEMORY_OUT_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__SWAP_IN:
				setSwap_in(SWAP_IN_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__SWAP_OUT:
				setSwap_out(SWAP_OUT_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__FAULTS_MINOR:
				setFaults_minor(FAULTS_MINOR_EDEFAULT);
				return;
			case CollectdPackage.COLLECTD_VMEM__FAULTS_MAJOR:
				setFaults_major(FAULTS_MAJOR_EDEFAULT);
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
			case CollectdPackage.COLLECTD_VMEM__ACTIVE_ANON:
				return ACTIVE_ANON_EDEFAULT == null ? active_anon != null : !ACTIVE_ANON_EDEFAULT.equals(active_anon);
			case CollectdPackage.COLLECTD_VMEM__ACTIVE_FILE:
				return ACTIVE_FILE_EDEFAULT == null ? active_file != null : !ACTIVE_FILE_EDEFAULT.equals(active_file);
			case CollectdPackage.COLLECTD_VMEM__ANON_PAGES:
				return ANON_PAGES_EDEFAULT == null ? anon_pages != null : !ANON_PAGES_EDEFAULT.equals(anon_pages);
			case CollectdPackage.COLLECTD_VMEM__ANON_TRANSPARENT_HUGEPAGES:
				return ANON_TRANSPARENT_HUGEPAGES_EDEFAULT == null ? anon_transparent_hugepages != null : !ANON_TRANSPARENT_HUGEPAGES_EDEFAULT.equals(anon_transparent_hugepages);
			case CollectdPackage.COLLECTD_VMEM__BOUNCE:
				return BOUNCE_EDEFAULT == null ? bounce != null : !BOUNCE_EDEFAULT.equals(bounce);
			case CollectdPackage.COLLECTD_VMEM__DIRTIED:
				return DIRTIED_EDEFAULT == null ? dirtied != null : !DIRTIED_EDEFAULT.equals(dirtied);
			case CollectdPackage.COLLECTD_VMEM__DIRTY:
				return DIRTY_EDEFAULT == null ? dirty != null : !DIRTY_EDEFAULT.equals(dirty);
			case CollectdPackage.COLLECTD_VMEM__DIRTY_BACKGROUND_THRESHOLD:
				return DIRTY_BACKGROUND_THRESHOLD_EDEFAULT == null ? dirty_background_threshold != null : !DIRTY_BACKGROUND_THRESHOLD_EDEFAULT.equals(dirty_background_threshold);
			case CollectdPackage.COLLECTD_VMEM__DIRTY_THRESHOLD:
				return DIRTY_THRESHOLD_EDEFAULT == null ? dirty_threshold != null : !DIRTY_THRESHOLD_EDEFAULT.equals(dirty_threshold);
			case CollectdPackage.COLLECTD_VMEM__FILE_PAGES:
				return FILE_PAGES_EDEFAULT == null ? file_pages != null : !FILE_PAGES_EDEFAULT.equals(file_pages);
			case CollectdPackage.COLLECTD_VMEM__FREE_PAGES:
				return FREE_PAGES_EDEFAULT == null ? free_pages != null : !FREE_PAGES_EDEFAULT.equals(free_pages);
			case CollectdPackage.COLLECTD_VMEM__INACTIVE_ANON:
				return INACTIVE_ANON_EDEFAULT == null ? inactive_anon != null : !INACTIVE_ANON_EDEFAULT.equals(inactive_anon);
			case CollectdPackage.COLLECTD_VMEM__INACTIVE_FILE:
				return INACTIVE_FILE_EDEFAULT == null ? inactive_file != null : !INACTIVE_FILE_EDEFAULT.equals(inactive_file);
			case CollectdPackage.COLLECTD_VMEM__ISOLATED_ANON:
				return ISOLATED_ANON_EDEFAULT == null ? isolated_anon != null : !ISOLATED_ANON_EDEFAULT.equals(isolated_anon);
			case CollectdPackage.COLLECTD_VMEM__ISOLATED_FILE:
				return ISOLATED_FILE_EDEFAULT == null ? isolated_file != null : !ISOLATED_FILE_EDEFAULT.equals(isolated_file);
			case CollectdPackage.COLLECTD_VMEM__KERNEL_STACK:
				return KERNEL_STACK_EDEFAULT == null ? kernel_stack != null : !KERNEL_STACK_EDEFAULT.equals(kernel_stack);
			case CollectdPackage.COLLECTD_VMEM__MAPPED:
				return MAPPED_EDEFAULT == null ? mapped != null : !MAPPED_EDEFAULT.equals(mapped);
			case CollectdPackage.COLLECTD_VMEM__MLOCK:
				return MLOCK_EDEFAULT == null ? mlock != null : !MLOCK_EDEFAULT.equals(mlock);
			case CollectdPackage.COLLECTD_VMEM__PAGE_TABLE_PAGES:
				return PAGE_TABLE_PAGES_EDEFAULT == null ? page_table_pages != null : !PAGE_TABLE_PAGES_EDEFAULT.equals(page_table_pages);
			case CollectdPackage.COLLECTD_VMEM__SHMEM:
				return SHMEM_EDEFAULT == null ? shmem != null : !SHMEM_EDEFAULT.equals(shmem);
			case CollectdPackage.COLLECTD_VMEM__SLAB_RECLAIMABLE:
				return SLAB_RECLAIMABLE_EDEFAULT == null ? slab_reclaimable != null : !SLAB_RECLAIMABLE_EDEFAULT.equals(slab_reclaimable);
			case CollectdPackage.COLLECTD_VMEM__SLAB_UNRECLAIMABLE:
				return SLAB_UNRECLAIMABLE_EDEFAULT == null ? slab_unreclaimable != null : !SLAB_UNRECLAIMABLE_EDEFAULT.equals(slab_unreclaimable);
			case CollectdPackage.COLLECTD_VMEM__UNEVICTABLE:
				return UNEVICTABLE_EDEFAULT == null ? unevictable != null : !UNEVICTABLE_EDEFAULT.equals(unevictable);
			case CollectdPackage.COLLECTD_VMEM__UNSTABLE:
				return UNSTABLE_EDEFAULT == null ? unstable != null : !UNSTABLE_EDEFAULT.equals(unstable);
			case CollectdPackage.COLLECTD_VMEM__VMSCAN_IMMEDIATE_RECLAIM:
				return VMSCAN_IMMEDIATE_RECLAIM_EDEFAULT == null ? vmscan_immediate_reclaim != null : !VMSCAN_IMMEDIATE_RECLAIM_EDEFAULT.equals(vmscan_immediate_reclaim);
			case CollectdPackage.COLLECTD_VMEM__VMSCAN_WRITE:
				return VMSCAN_WRITE_EDEFAULT == null ? vmscan_write != null : !VMSCAN_WRITE_EDEFAULT.equals(vmscan_write);
			case CollectdPackage.COLLECTD_VMEM__WRITEBACK:
				return WRITEBACK_EDEFAULT == null ? writeback != null : !WRITEBACK_EDEFAULT.equals(writeback);
			case CollectdPackage.COLLECTD_VMEM__WRITEBACK_TEMP:
				return WRITEBACK_TEMP_EDEFAULT == null ? writeback_temp != null : !WRITEBACK_TEMP_EDEFAULT.equals(writeback_temp);
			case CollectdPackage.COLLECTD_VMEM__WRITTEN:
				return WRITTEN_EDEFAULT == null ? written != null : !WRITTEN_EDEFAULT.equals(written);
			case CollectdPackage.COLLECTD_VMEM__MEMORY_IN:
				return MEMORY_IN_EDEFAULT == null ? memory_in != null : !MEMORY_IN_EDEFAULT.equals(memory_in);
			case CollectdPackage.COLLECTD_VMEM__MEMORY_OUT:
				return MEMORY_OUT_EDEFAULT == null ? memory_out != null : !MEMORY_OUT_EDEFAULT.equals(memory_out);
			case CollectdPackage.COLLECTD_VMEM__SWAP_IN:
				return SWAP_IN_EDEFAULT == null ? swap_in != null : !SWAP_IN_EDEFAULT.equals(swap_in);
			case CollectdPackage.COLLECTD_VMEM__SWAP_OUT:
				return SWAP_OUT_EDEFAULT == null ? swap_out != null : !SWAP_OUT_EDEFAULT.equals(swap_out);
			case CollectdPackage.COLLECTD_VMEM__FAULTS_MINOR:
				return FAULTS_MINOR_EDEFAULT == null ? faults_minor != null : !FAULTS_MINOR_EDEFAULT.equals(faults_minor);
			case CollectdPackage.COLLECTD_VMEM__FAULTS_MAJOR:
				return FAULTS_MAJOR_EDEFAULT == null ? faults_major != null : !FAULTS_MAJOR_EDEFAULT.equals(faults_major);
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
		result.append(" (active_anon: ");
		result.append(active_anon);
		result.append(", active_file: ");
		result.append(active_file);
		result.append(", anon_pages: ");
		result.append(anon_pages);
		result.append(", anon_transparent_hugepages: ");
		result.append(anon_transparent_hugepages);
		result.append(", bounce: ");
		result.append(bounce);
		result.append(", dirtied: ");
		result.append(dirtied);
		result.append(", dirty: ");
		result.append(dirty);
		result.append(", dirty_background_threshold: ");
		result.append(dirty_background_threshold);
		result.append(", dirty_threshold: ");
		result.append(dirty_threshold);
		result.append(", file_pages: ");
		result.append(file_pages);
		result.append(", free_pages: ");
		result.append(free_pages);
		result.append(", inactive_anon: ");
		result.append(inactive_anon);
		result.append(", inactive_file: ");
		result.append(inactive_file);
		result.append(", isolated_anon: ");
		result.append(isolated_anon);
		result.append(", isolated_file: ");
		result.append(isolated_file);
		result.append(", kernel_stack: ");
		result.append(kernel_stack);
		result.append(", mapped: ");
		result.append(mapped);
		result.append(", mlock: ");
		result.append(mlock);
		result.append(", page_table_pages: ");
		result.append(page_table_pages);
		result.append(", shmem: ");
		result.append(shmem);
		result.append(", slab_reclaimable: ");
		result.append(slab_reclaimable);
		result.append(", slab_unreclaimable: ");
		result.append(slab_unreclaimable);
		result.append(", unevictable: ");
		result.append(unevictable);
		result.append(", unstable: ");
		result.append(unstable);
		result.append(", vmscan_immediate_reclaim: ");
		result.append(vmscan_immediate_reclaim);
		result.append(", vmscan_write: ");
		result.append(vmscan_write);
		result.append(", writeback: ");
		result.append(writeback);
		result.append(", writeback_temp: ");
		result.append(writeback_temp);
		result.append(", written: ");
		result.append(written);
		result.append(", memory_in: ");
		result.append(memory_in);
		result.append(", memory_out: ");
		result.append(memory_out);
		result.append(", swap_in: ");
		result.append(swap_in);
		result.append(", swap_out: ");
		result.append(swap_out);
		result.append(", faults_minor: ");
		result.append(faults_minor);
		result.append(", faults_major: ");
		result.append(faults_major);
		result.append(')');
		return result.toString();
	}

} //CollectdVmemImpl
