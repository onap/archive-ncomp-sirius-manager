
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

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-sirius-manager-agent-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp.sirius.manager.agent'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore doc='http://openecomp.org/sirius/doc'"
 * @generated
 */
public interface CollectdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collectd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.sirius.manager.agent.collectd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collectd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectdPackage eINSTANCE = org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdServer()
	 * @generated
	 */
	int COLLECTD_SERVER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__ALERTING_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Load shortterm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__LOAD_SHORTTERM = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Load midterm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__LOAD_MIDTERM = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Load longterm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__LOAD_LONGTERM = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entropy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__ENTROPY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contextswitches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__CONTEXTSWITCHES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cpus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__CPUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__MEMORY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Swap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__SWAP = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__PROCESSES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Vmem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__VMEM = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Filesystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__FILESYSTEMS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Disks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__DISKS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__INTERFACES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER__INSTANCES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SERVER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdMemoryImpl <em>Memory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdMemoryImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdMemory()
	 * @generated
	 */
	int COLLECTD_MEMORY = 1;

	/**
	 * The feature id for the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_MEMORY__BUFFERED = 0;

	/**
	 * The feature id for the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_MEMORY__CACHED = 1;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_MEMORY__FREE = 2;

	/**
	 * The feature id for the '<em><b>Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_MEMORY__USED = 3;

	/**
	 * The number of structural features of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_MEMORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Memory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_MEMORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdSwapImpl <em>Swap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdSwapImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdSwap()
	 * @generated
	 */
	int COLLECTD_SWAP = 2;

	/**
	 * The feature id for the '<em><b>Cached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SWAP__CACHED = 0;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SWAP__FREE = 1;

	/**
	 * The feature id for the '<em><b>Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SWAP__USED = 2;

	/**
	 * The number of structural features of the '<em>Swap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SWAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Swap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_SWAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl <em>Processes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdProcesses()
	 * @generated
	 */
	int COLLECTD_PROCESSES = 3;

	/**
	 * The feature id for the '<em><b>Fork rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES__FORK_RATE = 0;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES__BLOCKED = 1;

	/**
	 * The feature id for the '<em><b>Paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES__PAGING = 2;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES__RUNNING = 3;

	/**
	 * The feature id for the '<em><b>Sleeping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES__SLEEPING = 4;

	/**
	 * The feature id for the '<em><b>Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES__STOPPED = 5;

	/**
	 * The feature id for the '<em><b>Zombies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES__ZOMBIES = 6;

	/**
	 * The number of structural features of the '<em>Processes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Processes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_PROCESSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl <em>Vmem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdVmem()
	 * @generated
	 */
	int COLLECTD_VMEM = 4;

	/**
	 * The feature id for the '<em><b>Active anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__ACTIVE_ANON = 0;

	/**
	 * The feature id for the '<em><b>Active file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__ACTIVE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Anon pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__ANON_PAGES = 2;

	/**
	 * The feature id for the '<em><b>Anon transparent hugepages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__ANON_TRANSPARENT_HUGEPAGES = 3;

	/**
	 * The feature id for the '<em><b>Bounce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__BOUNCE = 4;

	/**
	 * The feature id for the '<em><b>Dirtied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__DIRTIED = 5;

	/**
	 * The feature id for the '<em><b>Dirty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__DIRTY = 6;

	/**
	 * The feature id for the '<em><b>Dirty background threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__DIRTY_BACKGROUND_THRESHOLD = 7;

	/**
	 * The feature id for the '<em><b>Dirty threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__DIRTY_THRESHOLD = 8;

	/**
	 * The feature id for the '<em><b>File pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__FILE_PAGES = 9;

	/**
	 * The feature id for the '<em><b>Free pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__FREE_PAGES = 10;

	/**
	 * The feature id for the '<em><b>Inactive anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__INACTIVE_ANON = 11;

	/**
	 * The feature id for the '<em><b>Inactive file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__INACTIVE_FILE = 12;

	/**
	 * The feature id for the '<em><b>Isolated anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__ISOLATED_ANON = 13;

	/**
	 * The feature id for the '<em><b>Isolated file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__ISOLATED_FILE = 14;

	/**
	 * The feature id for the '<em><b>Kernel stack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__KERNEL_STACK = 15;

	/**
	 * The feature id for the '<em><b>Mapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__MAPPED = 16;

	/**
	 * The feature id for the '<em><b>Mlock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__MLOCK = 17;

	/**
	 * The feature id for the '<em><b>Page table pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__PAGE_TABLE_PAGES = 18;

	/**
	 * The feature id for the '<em><b>Shmem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__SHMEM = 19;

	/**
	 * The feature id for the '<em><b>Slab reclaimable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__SLAB_RECLAIMABLE = 20;

	/**
	 * The feature id for the '<em><b>Slab unreclaimable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__SLAB_UNRECLAIMABLE = 21;

	/**
	 * The feature id for the '<em><b>Unevictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__UNEVICTABLE = 22;

	/**
	 * The feature id for the '<em><b>Unstable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__UNSTABLE = 23;

	/**
	 * The feature id for the '<em><b>Vmscan immediate reclaim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__VMSCAN_IMMEDIATE_RECLAIM = 24;

	/**
	 * The feature id for the '<em><b>Vmscan write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__VMSCAN_WRITE = 25;

	/**
	 * The feature id for the '<em><b>Writeback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__WRITEBACK = 26;

	/**
	 * The feature id for the '<em><b>Writeback temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__WRITEBACK_TEMP = 27;

	/**
	 * The feature id for the '<em><b>Written</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__WRITTEN = 28;

	/**
	 * The feature id for the '<em><b>Memory in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__MEMORY_IN = 29;

	/**
	 * The feature id for the '<em><b>Memory out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__MEMORY_OUT = 30;

	/**
	 * The feature id for the '<em><b>Swap in</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__SWAP_IN = 31;

	/**
	 * The feature id for the '<em><b>Swap out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__SWAP_OUT = 32;

	/**
	 * The feature id for the '<em><b>Faults minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__FAULTS_MINOR = 33;

	/**
	 * The feature id for the '<em><b>Faults major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM__FAULTS_MAJOR = 34;

	/**
	 * The number of structural features of the '<em>Vmem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM_FEATURE_COUNT = 35;

	/**
	 * The number of operations of the '<em>Vmem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_VMEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl <em>Cpu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdCpu()
	 * @generated
	 */
	int COLLECTD_CPU = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__ALERTING_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__IDLE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__WAIT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__USER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU__SYSTEM = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cpu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Cpu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_CPU_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl <em>Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdDisk()
	 * @generated
	 */
	int COLLECTD_DISK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__ALERTING_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disk merged read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__DISK_MERGED_READ = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disk merged write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__DISK_MERGED_WRITE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disk octets read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__DISK_OCTETS_READ = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disk octets write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__DISK_OCTETS_WRITE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Disk ops read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__DISK_OPS_READ = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Disk ops write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__DISK_OPS_WRITE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Disk time read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__DISK_TIME_READ = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Disk time write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK__DISK_TIME_WRITE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_DISK_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFileSystemImpl <em>File System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFileSystemImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdFileSystem()
	 * @generated
	 */
	int COLLECTD_FILE_SYSTEM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM__ALERTING_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM__USED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM__FREE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>File System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_FILE_SYSTEM_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdInterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdInterfaceImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdInterface()
	 * @generated
	 */
	int COLLECTD_INTERFACE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__ALERTING_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If errors rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__IF_ERRORS_RX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>If errors tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__IF_ERRORS_TX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>If octets rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__IF_OCTETS_RX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>If octets tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__IF_OCTETS_TX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>If packets rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__IF_PACKETS_RX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>If packets tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE__IF_PACKETS_TX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_INTERFACE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl <em>Kvm Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdKvmInstance()
	 * @generated
	 */
	int COLLECTD_KVM_INSTANCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__ALERTING_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Virt cpu total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__VIRT_CPU_TOTAL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__DISKS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE__INTERFACES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Kvm Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Kvm Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INSTANCE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmDiskImpl <em>Kvm Disk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmDiskImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdKvmDisk()
	 * @generated
	 */
	int COLLECTD_KVM_DISK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__ALERTING_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disk octets read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__DISK_OCTETS_READ = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Disk octets write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__DISK_OCTETS_WRITE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Disk ops read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__DISK_OPS_READ = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disk ops write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK__DISK_OPS_WRITE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Kvm Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Kvm Disk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_DISK_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl <em>Kvm Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdKvmInterface()
	 * @generated
	 */
	int COLLECTD_KVM_INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Alerts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__ALERTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alerting Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__ALERTING_TEMPLATE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If errors rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__IF_ERRORS_RX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>If errors tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__IF_ERRORS_TX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>If dropped rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__IF_DROPPED_RX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>If dropped tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__IF_DROPPED_TX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>If octets rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__IF_OCTETS_RX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>If octets tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__IF_OCTETS_TX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>If packets rx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__IF_PACKETS_RX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>If packets tx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE__IF_PACKETS_TX = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Kvm Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Kvm Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTD_KVM_INTERFACE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer
	 * @generated
	 */
	EClass getCollectdServer();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_shortterm <em>Load shortterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load shortterm</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_shortterm()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EAttribute getCollectdServer_Load_shortterm();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_midterm <em>Load midterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load midterm</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_midterm()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EAttribute getCollectdServer_Load_midterm();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_longterm <em>Load longterm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load longterm</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getLoad_longterm()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EAttribute getCollectdServer_Load_longterm();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getEntropy <em>Entropy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entropy</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getEntropy()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EAttribute getCollectdServer_Entropy();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getContextswitches <em>Contextswitches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextswitches</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getContextswitches()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EAttribute getCollectdServer_Contextswitches();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getCpus <em>Cpus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cpus</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getCpus()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Cpus();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getMemory()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Memory();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getSwap <em>Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Swap</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getSwap()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Swap();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processes</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getProcesses()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Processes();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getVmem <em>Vmem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vmem</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getVmem()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Vmem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getFilesystems <em>Filesystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filesystems</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getFilesystems()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Filesystems();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getDisks <em>Disks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disks</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getDisks()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Disks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getInterfaces()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer#getInstances()
	 * @see #getCollectdServer()
	 * @generated
	 */
	EReference getCollectdServer_Instances();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory
	 * @generated
	 */
	EClass getCollectdMemory();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory#getBuffered <em>Buffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffered</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory#getBuffered()
	 * @see #getCollectdMemory()
	 * @generated
	 */
	EAttribute getCollectdMemory_Buffered();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory#getCached <em>Cached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory#getCached()
	 * @see #getCollectdMemory()
	 * @generated
	 */
	EAttribute getCollectdMemory_Cached();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory#getFree()
	 * @see #getCollectdMemory()
	 * @generated
	 */
	EAttribute getCollectdMemory_Free();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory#getUsed()
	 * @see #getCollectdMemory()
	 * @generated
	 */
	EAttribute getCollectdMemory_Used();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap <em>Swap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swap</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap
	 * @generated
	 */
	EClass getCollectdSwap();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getCached <em>Cached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getCached()
	 * @see #getCollectdSwap()
	 * @generated
	 */
	EAttribute getCollectdSwap_Cached();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getFree()
	 * @see #getCollectdSwap()
	 * @generated
	 */
	EAttribute getCollectdSwap_Free();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap#getUsed()
	 * @see #getCollectdSwap()
	 * @generated
	 */
	EAttribute getCollectdSwap_Used();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processes</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses
	 * @generated
	 */
	EClass getCollectdProcesses();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getFork_rate <em>Fork rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fork rate</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getFork_rate()
	 * @see #getCollectdProcesses()
	 * @generated
	 */
	EAttribute getCollectdProcesses_Fork_rate();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getBlocked()
	 * @see #getCollectdProcesses()
	 * @generated
	 */
	EAttribute getCollectdProcesses_Blocked();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getPaging <em>Paging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paging</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getPaging()
	 * @see #getCollectdProcesses()
	 * @generated
	 */
	EAttribute getCollectdProcesses_Paging();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getRunning()
	 * @see #getCollectdProcesses()
	 * @generated
	 */
	EAttribute getCollectdProcesses_Running();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getSleeping <em>Sleeping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sleeping</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getSleeping()
	 * @see #getCollectdProcesses()
	 * @generated
	 */
	EAttribute getCollectdProcesses_Sleeping();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getStopped <em>Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stopped</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getStopped()
	 * @see #getCollectdProcesses()
	 * @generated
	 */
	EAttribute getCollectdProcesses_Stopped();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getZombies <em>Zombies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zombies</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getZombies()
	 * @see #getCollectdProcesses()
	 * @generated
	 */
	EAttribute getCollectdProcesses_Zombies();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem <em>Vmem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vmem</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem
	 * @generated
	 */
	EClass getCollectdVmem();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getActive_anon <em>Active anon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active anon</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getActive_anon()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Active_anon();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getActive_file <em>Active file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active file</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getActive_file()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Active_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getAnon_pages <em>Anon pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anon pages</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getAnon_pages()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Anon_pages();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getAnon_transparent_hugepages <em>Anon transparent hugepages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anon transparent hugepages</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getAnon_transparent_hugepages()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Anon_transparent_hugepages();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getBounce <em>Bounce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounce</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getBounce()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Bounce();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirtied <em>Dirtied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirtied</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirtied()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Dirtied();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty <em>Dirty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirty</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Dirty();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty_background_threshold <em>Dirty background threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirty background threshold</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty_background_threshold()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Dirty_background_threshold();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty_threshold <em>Dirty threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dirty threshold</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getDirty_threshold()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Dirty_threshold();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFile_pages <em>File pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File pages</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFile_pages()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_File_pages();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFree_pages <em>Free pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free pages</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFree_pages()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Free_pages();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getInactive_anon <em>Inactive anon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inactive anon</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getInactive_anon()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Inactive_anon();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getInactive_file <em>Inactive file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inactive file</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getInactive_file()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Inactive_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getIsolated_anon <em>Isolated anon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated anon</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getIsolated_anon()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Isolated_anon();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getIsolated_file <em>Isolated file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated file</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getIsolated_file()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Isolated_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getKernel_stack <em>Kernel stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel stack</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getKernel_stack()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Kernel_stack();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMapped <em>Mapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMapped()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Mapped();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMlock <em>Mlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mlock</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMlock()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Mlock();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getPage_table_pages <em>Page table pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page table pages</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getPage_table_pages()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Page_table_pages();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getShmem <em>Shmem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shmem</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getShmem()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Shmem();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSlab_reclaimable <em>Slab reclaimable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slab reclaimable</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSlab_reclaimable()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Slab_reclaimable();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSlab_unreclaimable <em>Slab unreclaimable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slab unreclaimable</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSlab_unreclaimable()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Slab_unreclaimable();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getUnevictable <em>Unevictable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unevictable</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getUnevictable()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Unevictable();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getUnstable <em>Unstable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unstable</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getUnstable()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Unstable();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getVmscan_immediate_reclaim <em>Vmscan immediate reclaim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmscan immediate reclaim</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getVmscan_immediate_reclaim()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Vmscan_immediate_reclaim();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getVmscan_write <em>Vmscan write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmscan write</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getVmscan_write()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Vmscan_write();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWriteback <em>Writeback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writeback</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWriteback()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Writeback();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWriteback_temp <em>Writeback temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writeback temp</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWriteback_temp()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Writeback_temp();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWritten <em>Written</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Written</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getWritten()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Written();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMemory_in <em>Memory in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory in</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMemory_in()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Memory_in();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMemory_out <em>Memory out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory out</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getMemory_out()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Memory_out();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSwap_in <em>Swap in</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swap in</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSwap_in()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Swap_in();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSwap_out <em>Swap out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swap out</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getSwap_out()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Swap_out();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFaults_minor <em>Faults minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faults minor</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFaults_minor()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Faults_minor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFaults_major <em>Faults major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faults major</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem#getFaults_major()
	 * @see #getCollectdVmem()
	 * @generated
	 */
	EAttribute getCollectdVmem_Faults_major();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu
	 * @generated
	 */
	EClass getCollectdCpu();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getIdle <em>Idle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idle</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getIdle()
	 * @see #getCollectdCpu()
	 * @generated
	 */
	EAttribute getCollectdCpu_Idle();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getWait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getWait()
	 * @see #getCollectdCpu()
	 * @generated
	 */
	EAttribute getCollectdCpu_Wait();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getUser()
	 * @see #getCollectdCpu()
	 * @generated
	 */
	EAttribute getCollectdCpu_User();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getSystem()
	 * @see #getCollectdCpu()
	 * @generated
	 */
	EAttribute getCollectdCpu_System();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disk</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk
	 * @generated
	 */
	EClass getCollectdDisk();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_merged_read <em>Disk merged read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk merged read</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_merged_read()
	 * @see #getCollectdDisk()
	 * @generated
	 */
	EAttribute getCollectdDisk_Disk_merged_read();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_merged_write <em>Disk merged write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk merged write</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_merged_write()
	 * @see #getCollectdDisk()
	 * @generated
	 */
	EAttribute getCollectdDisk_Disk_merged_write();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_octets_read <em>Disk octets read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk octets read</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_octets_read()
	 * @see #getCollectdDisk()
	 * @generated
	 */
	EAttribute getCollectdDisk_Disk_octets_read();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_octets_write <em>Disk octets write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk octets write</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_octets_write()
	 * @see #getCollectdDisk()
	 * @generated
	 */
	EAttribute getCollectdDisk_Disk_octets_write();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_ops_read <em>Disk ops read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk ops read</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_ops_read()
	 * @see #getCollectdDisk()
	 * @generated
	 */
	EAttribute getCollectdDisk_Disk_ops_read();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_ops_write <em>Disk ops write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk ops write</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_ops_write()
	 * @see #getCollectdDisk()
	 * @generated
	 */
	EAttribute getCollectdDisk_Disk_ops_write();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_time_read <em>Disk time read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk time read</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_time_read()
	 * @see #getCollectdDisk()
	 * @generated
	 */
	EAttribute getCollectdDisk_Disk_time_read();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_time_write <em>Disk time write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk time write</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk#getDisk_time_write()
	 * @see #getCollectdDisk()
	 * @generated
	 */
	EAttribute getCollectdDisk_Disk_time_write();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem
	 * @generated
	 */
	EClass getCollectdFileSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem#getUsed <em>Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Used</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem#getUsed()
	 * @see #getCollectdFileSystem()
	 * @generated
	 */
	EAttribute getCollectdFileSystem_Used();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem#getFree()
	 * @see #getCollectdFileSystem()
	 * @generated
	 */
	EAttribute getCollectdFileSystem_Free();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface
	 * @generated
	 */
	EClass getCollectdInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_errors_rx <em>If errors rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If errors rx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_errors_rx()
	 * @see #getCollectdInterface()
	 * @generated
	 */
	EAttribute getCollectdInterface_If_errors_rx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_errors_tx <em>If errors tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If errors tx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_errors_tx()
	 * @see #getCollectdInterface()
	 * @generated
	 */
	EAttribute getCollectdInterface_If_errors_tx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_octets_rx <em>If octets rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If octets rx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_octets_rx()
	 * @see #getCollectdInterface()
	 * @generated
	 */
	EAttribute getCollectdInterface_If_octets_rx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_octets_tx <em>If octets tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If octets tx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_octets_tx()
	 * @see #getCollectdInterface()
	 * @generated
	 */
	EAttribute getCollectdInterface_If_octets_tx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_packets_rx <em>If packets rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If packets rx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_packets_rx()
	 * @see #getCollectdInterface()
	 * @generated
	 */
	EAttribute getCollectdInterface_If_packets_rx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_packets_tx <em>If packets tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If packets tx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface#getIf_packets_tx()
	 * @see #getCollectdInterface()
	 * @generated
	 */
	EAttribute getCollectdInterface_If_packets_tx();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance <em>Kvm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kvm Instance</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance
	 * @generated
	 */
	EClass getCollectdKvmInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance#getVirt_cpu_total <em>Virt cpu total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virt cpu total</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance#getVirt_cpu_total()
	 * @see #getCollectdKvmInstance()
	 * @generated
	 */
	EAttribute getCollectdKvmInstance_Virt_cpu_total();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance#getDisks <em>Disks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disks</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance#getDisks()
	 * @see #getCollectdKvmInstance()
	 * @generated
	 */
	EReference getCollectdKvmInstance_Disks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance#getInterfaces()
	 * @see #getCollectdKvmInstance()
	 * @generated
	 */
	EReference getCollectdKvmInstance_Interfaces();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk <em>Kvm Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kvm Disk</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk
	 * @generated
	 */
	EClass getCollectdKvmDisk();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_octets_read <em>Disk octets read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk octets read</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_octets_read()
	 * @see #getCollectdKvmDisk()
	 * @generated
	 */
	EAttribute getCollectdKvmDisk_Disk_octets_read();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_octets_write <em>Disk octets write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk octets write</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_octets_write()
	 * @see #getCollectdKvmDisk()
	 * @generated
	 */
	EAttribute getCollectdKvmDisk_Disk_octets_write();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_ops_read <em>Disk ops read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk ops read</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_ops_read()
	 * @see #getCollectdKvmDisk()
	 * @generated
	 */
	EAttribute getCollectdKvmDisk_Disk_ops_read();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_ops_write <em>Disk ops write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disk ops write</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_ops_write()
	 * @see #getCollectdKvmDisk()
	 * @generated
	 */
	EAttribute getCollectdKvmDisk_Disk_ops_write();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface <em>Kvm Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kvm Interface</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface
	 * @generated
	 */
	EClass getCollectdKvmInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_errors_rx <em>If errors rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If errors rx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_errors_rx()
	 * @see #getCollectdKvmInterface()
	 * @generated
	 */
	EAttribute getCollectdKvmInterface_If_errors_rx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_errors_tx <em>If errors tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If errors tx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_errors_tx()
	 * @see #getCollectdKvmInterface()
	 * @generated
	 */
	EAttribute getCollectdKvmInterface_If_errors_tx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_dropped_rx <em>If dropped rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If dropped rx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_dropped_rx()
	 * @see #getCollectdKvmInterface()
	 * @generated
	 */
	EAttribute getCollectdKvmInterface_If_dropped_rx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_dropped_tx <em>If dropped tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If dropped tx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_dropped_tx()
	 * @see #getCollectdKvmInterface()
	 * @generated
	 */
	EAttribute getCollectdKvmInterface_If_dropped_tx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_octets_rx <em>If octets rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If octets rx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_octets_rx()
	 * @see #getCollectdKvmInterface()
	 * @generated
	 */
	EAttribute getCollectdKvmInterface_If_octets_rx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_octets_tx <em>If octets tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If octets tx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_octets_tx()
	 * @see #getCollectdKvmInterface()
	 * @generated
	 */
	EAttribute getCollectdKvmInterface_If_octets_tx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_packets_rx <em>If packets rx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If packets rx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_packets_rx()
	 * @see #getCollectdKvmInterface()
	 * @generated
	 */
	EAttribute getCollectdKvmInterface_If_packets_rx();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_packets_tx <em>If packets tx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If packets tx</em>'.
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface#getIf_packets_tx()
	 * @see #getCollectdKvmInterface()
	 * @generated
	 */
	EAttribute getCollectdKvmInterface_If_packets_tx();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollectdFactory getCollectdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdServerImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdServer()
		 * @generated
		 */
		EClass COLLECTD_SERVER = eINSTANCE.getCollectdServer();

		/**
		 * The meta object literal for the '<em><b>Load shortterm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_SERVER__LOAD_SHORTTERM = eINSTANCE.getCollectdServer_Load_shortterm();

		/**
		 * The meta object literal for the '<em><b>Load midterm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_SERVER__LOAD_MIDTERM = eINSTANCE.getCollectdServer_Load_midterm();

		/**
		 * The meta object literal for the '<em><b>Load longterm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_SERVER__LOAD_LONGTERM = eINSTANCE.getCollectdServer_Load_longterm();

		/**
		 * The meta object literal for the '<em><b>Entropy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_SERVER__ENTROPY = eINSTANCE.getCollectdServer_Entropy();

		/**
		 * The meta object literal for the '<em><b>Contextswitches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_SERVER__CONTEXTSWITCHES = eINSTANCE.getCollectdServer_Contextswitches();

		/**
		 * The meta object literal for the '<em><b>Cpus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__CPUS = eINSTANCE.getCollectdServer_Cpus();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__MEMORY = eINSTANCE.getCollectdServer_Memory();

		/**
		 * The meta object literal for the '<em><b>Swap</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__SWAP = eINSTANCE.getCollectdServer_Swap();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__PROCESSES = eINSTANCE.getCollectdServer_Processes();

		/**
		 * The meta object literal for the '<em><b>Vmem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__VMEM = eINSTANCE.getCollectdServer_Vmem();

		/**
		 * The meta object literal for the '<em><b>Filesystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__FILESYSTEMS = eINSTANCE.getCollectdServer_Filesystems();

		/**
		 * The meta object literal for the '<em><b>Disks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__DISKS = eINSTANCE.getCollectdServer_Disks();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__INTERFACES = eINSTANCE.getCollectdServer_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_SERVER__INSTANCES = eINSTANCE.getCollectdServer_Instances();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdMemoryImpl <em>Memory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdMemoryImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdMemory()
		 * @generated
		 */
		EClass COLLECTD_MEMORY = eINSTANCE.getCollectdMemory();

		/**
		 * The meta object literal for the '<em><b>Buffered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_MEMORY__BUFFERED = eINSTANCE.getCollectdMemory_Buffered();

		/**
		 * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_MEMORY__CACHED = eINSTANCE.getCollectdMemory_Cached();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_MEMORY__FREE = eINSTANCE.getCollectdMemory_Free();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_MEMORY__USED = eINSTANCE.getCollectdMemory_Used();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdSwapImpl <em>Swap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdSwapImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdSwap()
		 * @generated
		 */
		EClass COLLECTD_SWAP = eINSTANCE.getCollectdSwap();

		/**
		 * The meta object literal for the '<em><b>Cached</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_SWAP__CACHED = eINSTANCE.getCollectdSwap_Cached();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_SWAP__FREE = eINSTANCE.getCollectdSwap_Free();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_SWAP__USED = eINSTANCE.getCollectdSwap_Used();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl <em>Processes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdProcessesImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdProcesses()
		 * @generated
		 */
		EClass COLLECTD_PROCESSES = eINSTANCE.getCollectdProcesses();

		/**
		 * The meta object literal for the '<em><b>Fork rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_PROCESSES__FORK_RATE = eINSTANCE.getCollectdProcesses_Fork_rate();

		/**
		 * The meta object literal for the '<em><b>Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_PROCESSES__BLOCKED = eINSTANCE.getCollectdProcesses_Blocked();

		/**
		 * The meta object literal for the '<em><b>Paging</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_PROCESSES__PAGING = eINSTANCE.getCollectdProcesses_Paging();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_PROCESSES__RUNNING = eINSTANCE.getCollectdProcesses_Running();

		/**
		 * The meta object literal for the '<em><b>Sleeping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_PROCESSES__SLEEPING = eINSTANCE.getCollectdProcesses_Sleeping();

		/**
		 * The meta object literal for the '<em><b>Stopped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_PROCESSES__STOPPED = eINSTANCE.getCollectdProcesses_Stopped();

		/**
		 * The meta object literal for the '<em><b>Zombies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_PROCESSES__ZOMBIES = eINSTANCE.getCollectdProcesses_Zombies();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl <em>Vmem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdVmemImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdVmem()
		 * @generated
		 */
		EClass COLLECTD_VMEM = eINSTANCE.getCollectdVmem();

		/**
		 * The meta object literal for the '<em><b>Active anon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__ACTIVE_ANON = eINSTANCE.getCollectdVmem_Active_anon();

		/**
		 * The meta object literal for the '<em><b>Active file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__ACTIVE_FILE = eINSTANCE.getCollectdVmem_Active_file();

		/**
		 * The meta object literal for the '<em><b>Anon pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__ANON_PAGES = eINSTANCE.getCollectdVmem_Anon_pages();

		/**
		 * The meta object literal for the '<em><b>Anon transparent hugepages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__ANON_TRANSPARENT_HUGEPAGES = eINSTANCE.getCollectdVmem_Anon_transparent_hugepages();

		/**
		 * The meta object literal for the '<em><b>Bounce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__BOUNCE = eINSTANCE.getCollectdVmem_Bounce();

		/**
		 * The meta object literal for the '<em><b>Dirtied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__DIRTIED = eINSTANCE.getCollectdVmem_Dirtied();

		/**
		 * The meta object literal for the '<em><b>Dirty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__DIRTY = eINSTANCE.getCollectdVmem_Dirty();

		/**
		 * The meta object literal for the '<em><b>Dirty background threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__DIRTY_BACKGROUND_THRESHOLD = eINSTANCE.getCollectdVmem_Dirty_background_threshold();

		/**
		 * The meta object literal for the '<em><b>Dirty threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__DIRTY_THRESHOLD = eINSTANCE.getCollectdVmem_Dirty_threshold();

		/**
		 * The meta object literal for the '<em><b>File pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__FILE_PAGES = eINSTANCE.getCollectdVmem_File_pages();

		/**
		 * The meta object literal for the '<em><b>Free pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__FREE_PAGES = eINSTANCE.getCollectdVmem_Free_pages();

		/**
		 * The meta object literal for the '<em><b>Inactive anon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__INACTIVE_ANON = eINSTANCE.getCollectdVmem_Inactive_anon();

		/**
		 * The meta object literal for the '<em><b>Inactive file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__INACTIVE_FILE = eINSTANCE.getCollectdVmem_Inactive_file();

		/**
		 * The meta object literal for the '<em><b>Isolated anon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__ISOLATED_ANON = eINSTANCE.getCollectdVmem_Isolated_anon();

		/**
		 * The meta object literal for the '<em><b>Isolated file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__ISOLATED_FILE = eINSTANCE.getCollectdVmem_Isolated_file();

		/**
		 * The meta object literal for the '<em><b>Kernel stack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__KERNEL_STACK = eINSTANCE.getCollectdVmem_Kernel_stack();

		/**
		 * The meta object literal for the '<em><b>Mapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__MAPPED = eINSTANCE.getCollectdVmem_Mapped();

		/**
		 * The meta object literal for the '<em><b>Mlock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__MLOCK = eINSTANCE.getCollectdVmem_Mlock();

		/**
		 * The meta object literal for the '<em><b>Page table pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__PAGE_TABLE_PAGES = eINSTANCE.getCollectdVmem_Page_table_pages();

		/**
		 * The meta object literal for the '<em><b>Shmem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__SHMEM = eINSTANCE.getCollectdVmem_Shmem();

		/**
		 * The meta object literal for the '<em><b>Slab reclaimable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__SLAB_RECLAIMABLE = eINSTANCE.getCollectdVmem_Slab_reclaimable();

		/**
		 * The meta object literal for the '<em><b>Slab unreclaimable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__SLAB_UNRECLAIMABLE = eINSTANCE.getCollectdVmem_Slab_unreclaimable();

		/**
		 * The meta object literal for the '<em><b>Unevictable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__UNEVICTABLE = eINSTANCE.getCollectdVmem_Unevictable();

		/**
		 * The meta object literal for the '<em><b>Unstable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__UNSTABLE = eINSTANCE.getCollectdVmem_Unstable();

		/**
		 * The meta object literal for the '<em><b>Vmscan immediate reclaim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__VMSCAN_IMMEDIATE_RECLAIM = eINSTANCE.getCollectdVmem_Vmscan_immediate_reclaim();

		/**
		 * The meta object literal for the '<em><b>Vmscan write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__VMSCAN_WRITE = eINSTANCE.getCollectdVmem_Vmscan_write();

		/**
		 * The meta object literal for the '<em><b>Writeback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__WRITEBACK = eINSTANCE.getCollectdVmem_Writeback();

		/**
		 * The meta object literal for the '<em><b>Writeback temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__WRITEBACK_TEMP = eINSTANCE.getCollectdVmem_Writeback_temp();

		/**
		 * The meta object literal for the '<em><b>Written</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__WRITTEN = eINSTANCE.getCollectdVmem_Written();

		/**
		 * The meta object literal for the '<em><b>Memory in</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__MEMORY_IN = eINSTANCE.getCollectdVmem_Memory_in();

		/**
		 * The meta object literal for the '<em><b>Memory out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__MEMORY_OUT = eINSTANCE.getCollectdVmem_Memory_out();

		/**
		 * The meta object literal for the '<em><b>Swap in</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__SWAP_IN = eINSTANCE.getCollectdVmem_Swap_in();

		/**
		 * The meta object literal for the '<em><b>Swap out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__SWAP_OUT = eINSTANCE.getCollectdVmem_Swap_out();

		/**
		 * The meta object literal for the '<em><b>Faults minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__FAULTS_MINOR = eINSTANCE.getCollectdVmem_Faults_minor();

		/**
		 * The meta object literal for the '<em><b>Faults major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_VMEM__FAULTS_MAJOR = eINSTANCE.getCollectdVmem_Faults_major();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl <em>Cpu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdCpuImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdCpu()
		 * @generated
		 */
		EClass COLLECTD_CPU = eINSTANCE.getCollectdCpu();

		/**
		 * The meta object literal for the '<em><b>Idle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_CPU__IDLE = eINSTANCE.getCollectdCpu_Idle();

		/**
		 * The meta object literal for the '<em><b>Wait</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_CPU__WAIT = eINSTANCE.getCollectdCpu_Wait();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_CPU__USER = eINSTANCE.getCollectdCpu_User();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_CPU__SYSTEM = eINSTANCE.getCollectdCpu_System();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl <em>Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdDiskImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdDisk()
		 * @generated
		 */
		EClass COLLECTD_DISK = eINSTANCE.getCollectdDisk();

		/**
		 * The meta object literal for the '<em><b>Disk merged read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_DISK__DISK_MERGED_READ = eINSTANCE.getCollectdDisk_Disk_merged_read();

		/**
		 * The meta object literal for the '<em><b>Disk merged write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_DISK__DISK_MERGED_WRITE = eINSTANCE.getCollectdDisk_Disk_merged_write();

		/**
		 * The meta object literal for the '<em><b>Disk octets read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_DISK__DISK_OCTETS_READ = eINSTANCE.getCollectdDisk_Disk_octets_read();

		/**
		 * The meta object literal for the '<em><b>Disk octets write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_DISK__DISK_OCTETS_WRITE = eINSTANCE.getCollectdDisk_Disk_octets_write();

		/**
		 * The meta object literal for the '<em><b>Disk ops read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_DISK__DISK_OPS_READ = eINSTANCE.getCollectdDisk_Disk_ops_read();

		/**
		 * The meta object literal for the '<em><b>Disk ops write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_DISK__DISK_OPS_WRITE = eINSTANCE.getCollectdDisk_Disk_ops_write();

		/**
		 * The meta object literal for the '<em><b>Disk time read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_DISK__DISK_TIME_READ = eINSTANCE.getCollectdDisk_Disk_time_read();

		/**
		 * The meta object literal for the '<em><b>Disk time write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_DISK__DISK_TIME_WRITE = eINSTANCE.getCollectdDisk_Disk_time_write();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFileSystemImpl <em>File System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFileSystemImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdFileSystem()
		 * @generated
		 */
		EClass COLLECTD_FILE_SYSTEM = eINSTANCE.getCollectdFileSystem();

		/**
		 * The meta object literal for the '<em><b>Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_FILE_SYSTEM__USED = eINSTANCE.getCollectdFileSystem_Used();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_FILE_SYSTEM__FREE = eINSTANCE.getCollectdFileSystem_Free();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdInterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdInterfaceImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdInterface()
		 * @generated
		 */
		EClass COLLECTD_INTERFACE = eINSTANCE.getCollectdInterface();

		/**
		 * The meta object literal for the '<em><b>If errors rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_INTERFACE__IF_ERRORS_RX = eINSTANCE.getCollectdInterface_If_errors_rx();

		/**
		 * The meta object literal for the '<em><b>If errors tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_INTERFACE__IF_ERRORS_TX = eINSTANCE.getCollectdInterface_If_errors_tx();

		/**
		 * The meta object literal for the '<em><b>If octets rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_INTERFACE__IF_OCTETS_RX = eINSTANCE.getCollectdInterface_If_octets_rx();

		/**
		 * The meta object literal for the '<em><b>If octets tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_INTERFACE__IF_OCTETS_TX = eINSTANCE.getCollectdInterface_If_octets_tx();

		/**
		 * The meta object literal for the '<em><b>If packets rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_INTERFACE__IF_PACKETS_RX = eINSTANCE.getCollectdInterface_If_packets_rx();

		/**
		 * The meta object literal for the '<em><b>If packets tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_INTERFACE__IF_PACKETS_TX = eINSTANCE.getCollectdInterface_If_packets_tx();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl <em>Kvm Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInstanceImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdKvmInstance()
		 * @generated
		 */
		EClass COLLECTD_KVM_INSTANCE = eINSTANCE.getCollectdKvmInstance();

		/**
		 * The meta object literal for the '<em><b>Virt cpu total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INSTANCE__VIRT_CPU_TOTAL = eINSTANCE.getCollectdKvmInstance_Virt_cpu_total();

		/**
		 * The meta object literal for the '<em><b>Disks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_KVM_INSTANCE__DISKS = eINSTANCE.getCollectdKvmInstance_Disks();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTD_KVM_INSTANCE__INTERFACES = eINSTANCE.getCollectdKvmInstance_Interfaces();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmDiskImpl <em>Kvm Disk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmDiskImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdKvmDisk()
		 * @generated
		 */
		EClass COLLECTD_KVM_DISK = eINSTANCE.getCollectdKvmDisk();

		/**
		 * The meta object literal for the '<em><b>Disk octets read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_DISK__DISK_OCTETS_READ = eINSTANCE.getCollectdKvmDisk_Disk_octets_read();

		/**
		 * The meta object literal for the '<em><b>Disk octets write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_DISK__DISK_OCTETS_WRITE = eINSTANCE.getCollectdKvmDisk_Disk_octets_write();

		/**
		 * The meta object literal for the '<em><b>Disk ops read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_DISK__DISK_OPS_READ = eINSTANCE.getCollectdKvmDisk_Disk_ops_read();

		/**
		 * The meta object literal for the '<em><b>Disk ops write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_DISK__DISK_OPS_WRITE = eINSTANCE.getCollectdKvmDisk_Disk_ops_write();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl <em>Kvm Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdKvmInterfaceImpl
		 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdPackageImpl#getCollectdKvmInterface()
		 * @generated
		 */
		EClass COLLECTD_KVM_INTERFACE = eINSTANCE.getCollectdKvmInterface();

		/**
		 * The meta object literal for the '<em><b>If errors rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INTERFACE__IF_ERRORS_RX = eINSTANCE.getCollectdKvmInterface_If_errors_rx();

		/**
		 * The meta object literal for the '<em><b>If errors tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INTERFACE__IF_ERRORS_TX = eINSTANCE.getCollectdKvmInterface_If_errors_tx();

		/**
		 * The meta object literal for the '<em><b>If dropped rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INTERFACE__IF_DROPPED_RX = eINSTANCE.getCollectdKvmInterface_If_dropped_rx();

		/**
		 * The meta object literal for the '<em><b>If dropped tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INTERFACE__IF_DROPPED_TX = eINSTANCE.getCollectdKvmInterface_If_dropped_tx();

		/**
		 * The meta object literal for the '<em><b>If octets rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INTERFACE__IF_OCTETS_RX = eINSTANCE.getCollectdKvmInterface_If_octets_rx();

		/**
		 * The meta object literal for the '<em><b>If octets tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INTERFACE__IF_OCTETS_TX = eINSTANCE.getCollectdKvmInterface_If_octets_tx();

		/**
		 * The meta object literal for the '<em><b>If packets rx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INTERFACE__IF_PACKETS_RX = eINSTANCE.getCollectdKvmInterface_If_packets_rx();

		/**
		 * The meta object literal for the '<em><b>If packets tx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTD_KVM_INTERFACE__IF_PACKETS_TX = eINSTANCE.getCollectdKvmInterface_If_packets_tx();

	}

} //CollectdPackage
