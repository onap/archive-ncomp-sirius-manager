
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

import org.openecomp.ncomp.core.CorePackage;

import org.openecomp.ncomp.core.alerts.AlertsPackage;

import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdDisk;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFactory;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFileSystem;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdInterface;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInstance;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmInterface;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdMemory;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdServer;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdSwap;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdVmem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectdPackageImpl extends EPackageImpl implements CollectdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdMemoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdSwapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdProcessesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdVmemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdCpuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdDiskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdFileSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdKvmInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdKvmDiskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectdKvmInterfaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollectdPackageImpl() {
		super(eNS_URI, CollectdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CollectdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollectdPackage init() {
		if (isInited) return (CollectdPackage)EPackage.Registry.INSTANCE.getEPackage(CollectdPackage.eNS_URI);

		// Obtain or create and register package
		CollectdPackageImpl theCollectdPackage = (CollectdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollectdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollectdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AlertsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCollectdPackage.createPackageContents();

		// Initialize created meta-data
		theCollectdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollectdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollectdPackage.eNS_URI, theCollectdPackage);
		return theCollectdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdServer() {
		return collectdServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdServer_Load_shortterm() {
		return (EAttribute)collectdServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdServer_Load_midterm() {
		return (EAttribute)collectdServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdServer_Load_longterm() {
		return (EAttribute)collectdServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdServer_Entropy() {
		return (EAttribute)collectdServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdServer_Contextswitches() {
		return (EAttribute)collectdServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Cpus() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Memory() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Swap() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Processes() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Vmem() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Filesystems() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Disks() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Interfaces() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdServer_Instances() {
		return (EReference)collectdServerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdMemory() {
		return collectdMemoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdMemory_Buffered() {
		return (EAttribute)collectdMemoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdMemory_Cached() {
		return (EAttribute)collectdMemoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdMemory_Free() {
		return (EAttribute)collectdMemoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdMemory_Used() {
		return (EAttribute)collectdMemoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdSwap() {
		return collectdSwapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdSwap_Cached() {
		return (EAttribute)collectdSwapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdSwap_Free() {
		return (EAttribute)collectdSwapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdSwap_Used() {
		return (EAttribute)collectdSwapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdProcesses() {
		return collectdProcessesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdProcesses_Fork_rate() {
		return (EAttribute)collectdProcessesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdProcesses_Blocked() {
		return (EAttribute)collectdProcessesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdProcesses_Paging() {
		return (EAttribute)collectdProcessesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdProcesses_Running() {
		return (EAttribute)collectdProcessesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdProcesses_Sleeping() {
		return (EAttribute)collectdProcessesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdProcesses_Stopped() {
		return (EAttribute)collectdProcessesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdProcesses_Zombies() {
		return (EAttribute)collectdProcessesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdVmem() {
		return collectdVmemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Active_anon() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Active_file() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Anon_pages() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Anon_transparent_hugepages() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Bounce() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Dirtied() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Dirty() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Dirty_background_threshold() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Dirty_threshold() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_File_pages() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Free_pages() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Inactive_anon() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Inactive_file() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Isolated_anon() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Isolated_file() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Kernel_stack() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Mapped() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Mlock() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Page_table_pages() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Shmem() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Slab_reclaimable() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Slab_unreclaimable() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Unevictable() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Unstable() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Vmscan_immediate_reclaim() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Vmscan_write() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Writeback() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Writeback_temp() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Written() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Memory_in() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Memory_out() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Swap_in() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Swap_out() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Faults_minor() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdVmem_Faults_major() {
		return (EAttribute)collectdVmemEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdCpu() {
		return collectdCpuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdCpu_Idle() {
		return (EAttribute)collectdCpuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdCpu_Wait() {
		return (EAttribute)collectdCpuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdCpu_User() {
		return (EAttribute)collectdCpuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdCpu_System() {
		return (EAttribute)collectdCpuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdDisk() {
		return collectdDiskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdDisk_Disk_merged_read() {
		return (EAttribute)collectdDiskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdDisk_Disk_merged_write() {
		return (EAttribute)collectdDiskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdDisk_Disk_octets_read() {
		return (EAttribute)collectdDiskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdDisk_Disk_octets_write() {
		return (EAttribute)collectdDiskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdDisk_Disk_ops_read() {
		return (EAttribute)collectdDiskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdDisk_Disk_ops_write() {
		return (EAttribute)collectdDiskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdDisk_Disk_time_read() {
		return (EAttribute)collectdDiskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdDisk_Disk_time_write() {
		return (EAttribute)collectdDiskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdFileSystem() {
		return collectdFileSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdFileSystem_Used() {
		return (EAttribute)collectdFileSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdFileSystem_Free() {
		return (EAttribute)collectdFileSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdInterface() {
		return collectdInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdInterface_If_errors_rx() {
		return (EAttribute)collectdInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdInterface_If_errors_tx() {
		return (EAttribute)collectdInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdInterface_If_octets_rx() {
		return (EAttribute)collectdInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdInterface_If_octets_tx() {
		return (EAttribute)collectdInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdInterface_If_packets_rx() {
		return (EAttribute)collectdInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdInterface_If_packets_tx() {
		return (EAttribute)collectdInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdKvmInstance() {
		return collectdKvmInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInstance_Virt_cpu_total() {
		return (EAttribute)collectdKvmInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdKvmInstance_Disks() {
		return (EReference)collectdKvmInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectdKvmInstance_Interfaces() {
		return (EReference)collectdKvmInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdKvmDisk() {
		return collectdKvmDiskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmDisk_Disk_octets_read() {
		return (EAttribute)collectdKvmDiskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmDisk_Disk_octets_write() {
		return (EAttribute)collectdKvmDiskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmDisk_Disk_ops_read() {
		return (EAttribute)collectdKvmDiskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmDisk_Disk_ops_write() {
		return (EAttribute)collectdKvmDiskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectdKvmInterface() {
		return collectdKvmInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInterface_If_errors_rx() {
		return (EAttribute)collectdKvmInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInterface_If_errors_tx() {
		return (EAttribute)collectdKvmInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInterface_If_dropped_rx() {
		return (EAttribute)collectdKvmInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInterface_If_dropped_tx() {
		return (EAttribute)collectdKvmInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInterface_If_octets_rx() {
		return (EAttribute)collectdKvmInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInterface_If_octets_tx() {
		return (EAttribute)collectdKvmInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInterface_If_packets_rx() {
		return (EAttribute)collectdKvmInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectdKvmInterface_If_packets_tx() {
		return (EAttribute)collectdKvmInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdFactory getCollectdFactory() {
		return (CollectdFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		collectdServerEClass = createEClass(COLLECTD_SERVER);
		createEAttribute(collectdServerEClass, COLLECTD_SERVER__LOAD_SHORTTERM);
		createEAttribute(collectdServerEClass, COLLECTD_SERVER__LOAD_MIDTERM);
		createEAttribute(collectdServerEClass, COLLECTD_SERVER__LOAD_LONGTERM);
		createEAttribute(collectdServerEClass, COLLECTD_SERVER__ENTROPY);
		createEAttribute(collectdServerEClass, COLLECTD_SERVER__CONTEXTSWITCHES);
		createEReference(collectdServerEClass, COLLECTD_SERVER__CPUS);
		createEReference(collectdServerEClass, COLLECTD_SERVER__MEMORY);
		createEReference(collectdServerEClass, COLLECTD_SERVER__SWAP);
		createEReference(collectdServerEClass, COLLECTD_SERVER__PROCESSES);
		createEReference(collectdServerEClass, COLLECTD_SERVER__VMEM);
		createEReference(collectdServerEClass, COLLECTD_SERVER__FILESYSTEMS);
		createEReference(collectdServerEClass, COLLECTD_SERVER__DISKS);
		createEReference(collectdServerEClass, COLLECTD_SERVER__INTERFACES);
		createEReference(collectdServerEClass, COLLECTD_SERVER__INSTANCES);

		collectdMemoryEClass = createEClass(COLLECTD_MEMORY);
		createEAttribute(collectdMemoryEClass, COLLECTD_MEMORY__BUFFERED);
		createEAttribute(collectdMemoryEClass, COLLECTD_MEMORY__CACHED);
		createEAttribute(collectdMemoryEClass, COLLECTD_MEMORY__FREE);
		createEAttribute(collectdMemoryEClass, COLLECTD_MEMORY__USED);

		collectdSwapEClass = createEClass(COLLECTD_SWAP);
		createEAttribute(collectdSwapEClass, COLLECTD_SWAP__CACHED);
		createEAttribute(collectdSwapEClass, COLLECTD_SWAP__FREE);
		createEAttribute(collectdSwapEClass, COLLECTD_SWAP__USED);

		collectdProcessesEClass = createEClass(COLLECTD_PROCESSES);
		createEAttribute(collectdProcessesEClass, COLLECTD_PROCESSES__FORK_RATE);
		createEAttribute(collectdProcessesEClass, COLLECTD_PROCESSES__BLOCKED);
		createEAttribute(collectdProcessesEClass, COLLECTD_PROCESSES__PAGING);
		createEAttribute(collectdProcessesEClass, COLLECTD_PROCESSES__RUNNING);
		createEAttribute(collectdProcessesEClass, COLLECTD_PROCESSES__SLEEPING);
		createEAttribute(collectdProcessesEClass, COLLECTD_PROCESSES__STOPPED);
		createEAttribute(collectdProcessesEClass, COLLECTD_PROCESSES__ZOMBIES);

		collectdVmemEClass = createEClass(COLLECTD_VMEM);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__ACTIVE_ANON);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__ACTIVE_FILE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__ANON_PAGES);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__ANON_TRANSPARENT_HUGEPAGES);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__BOUNCE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__DIRTIED);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__DIRTY);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__DIRTY_BACKGROUND_THRESHOLD);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__DIRTY_THRESHOLD);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__FILE_PAGES);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__FREE_PAGES);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__INACTIVE_ANON);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__INACTIVE_FILE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__ISOLATED_ANON);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__ISOLATED_FILE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__KERNEL_STACK);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__MAPPED);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__MLOCK);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__PAGE_TABLE_PAGES);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__SHMEM);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__SLAB_RECLAIMABLE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__SLAB_UNRECLAIMABLE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__UNEVICTABLE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__UNSTABLE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__VMSCAN_IMMEDIATE_RECLAIM);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__VMSCAN_WRITE);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__WRITEBACK);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__WRITEBACK_TEMP);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__WRITTEN);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__MEMORY_IN);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__MEMORY_OUT);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__SWAP_IN);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__SWAP_OUT);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__FAULTS_MINOR);
		createEAttribute(collectdVmemEClass, COLLECTD_VMEM__FAULTS_MAJOR);

		collectdCpuEClass = createEClass(COLLECTD_CPU);
		createEAttribute(collectdCpuEClass, COLLECTD_CPU__IDLE);
		createEAttribute(collectdCpuEClass, COLLECTD_CPU__WAIT);
		createEAttribute(collectdCpuEClass, COLLECTD_CPU__USER);
		createEAttribute(collectdCpuEClass, COLLECTD_CPU__SYSTEM);

		collectdDiskEClass = createEClass(COLLECTD_DISK);
		createEAttribute(collectdDiskEClass, COLLECTD_DISK__DISK_MERGED_READ);
		createEAttribute(collectdDiskEClass, COLLECTD_DISK__DISK_MERGED_WRITE);
		createEAttribute(collectdDiskEClass, COLLECTD_DISK__DISK_OCTETS_READ);
		createEAttribute(collectdDiskEClass, COLLECTD_DISK__DISK_OCTETS_WRITE);
		createEAttribute(collectdDiskEClass, COLLECTD_DISK__DISK_OPS_READ);
		createEAttribute(collectdDiskEClass, COLLECTD_DISK__DISK_OPS_WRITE);
		createEAttribute(collectdDiskEClass, COLLECTD_DISK__DISK_TIME_READ);
		createEAttribute(collectdDiskEClass, COLLECTD_DISK__DISK_TIME_WRITE);

		collectdFileSystemEClass = createEClass(COLLECTD_FILE_SYSTEM);
		createEAttribute(collectdFileSystemEClass, COLLECTD_FILE_SYSTEM__USED);
		createEAttribute(collectdFileSystemEClass, COLLECTD_FILE_SYSTEM__FREE);

		collectdInterfaceEClass = createEClass(COLLECTD_INTERFACE);
		createEAttribute(collectdInterfaceEClass, COLLECTD_INTERFACE__IF_ERRORS_RX);
		createEAttribute(collectdInterfaceEClass, COLLECTD_INTERFACE__IF_ERRORS_TX);
		createEAttribute(collectdInterfaceEClass, COLLECTD_INTERFACE__IF_OCTETS_RX);
		createEAttribute(collectdInterfaceEClass, COLLECTD_INTERFACE__IF_OCTETS_TX);
		createEAttribute(collectdInterfaceEClass, COLLECTD_INTERFACE__IF_PACKETS_RX);
		createEAttribute(collectdInterfaceEClass, COLLECTD_INTERFACE__IF_PACKETS_TX);

		collectdKvmInstanceEClass = createEClass(COLLECTD_KVM_INSTANCE);
		createEAttribute(collectdKvmInstanceEClass, COLLECTD_KVM_INSTANCE__VIRT_CPU_TOTAL);
		createEReference(collectdKvmInstanceEClass, COLLECTD_KVM_INSTANCE__DISKS);
		createEReference(collectdKvmInstanceEClass, COLLECTD_KVM_INSTANCE__INTERFACES);

		collectdKvmDiskEClass = createEClass(COLLECTD_KVM_DISK);
		createEAttribute(collectdKvmDiskEClass, COLLECTD_KVM_DISK__DISK_OCTETS_READ);
		createEAttribute(collectdKvmDiskEClass, COLLECTD_KVM_DISK__DISK_OCTETS_WRITE);
		createEAttribute(collectdKvmDiskEClass, COLLECTD_KVM_DISK__DISK_OPS_READ);
		createEAttribute(collectdKvmDiskEClass, COLLECTD_KVM_DISK__DISK_OPS_WRITE);

		collectdKvmInterfaceEClass = createEClass(COLLECTD_KVM_INTERFACE);
		createEAttribute(collectdKvmInterfaceEClass, COLLECTD_KVM_INTERFACE__IF_ERRORS_RX);
		createEAttribute(collectdKvmInterfaceEClass, COLLECTD_KVM_INTERFACE__IF_ERRORS_TX);
		createEAttribute(collectdKvmInterfaceEClass, COLLECTD_KVM_INTERFACE__IF_DROPPED_RX);
		createEAttribute(collectdKvmInterfaceEClass, COLLECTD_KVM_INTERFACE__IF_DROPPED_TX);
		createEAttribute(collectdKvmInterfaceEClass, COLLECTD_KVM_INTERFACE__IF_OCTETS_RX);
		createEAttribute(collectdKvmInterfaceEClass, COLLECTD_KVM_INTERFACE__IF_OCTETS_TX);
		createEAttribute(collectdKvmInterfaceEClass, COLLECTD_KVM_INTERFACE__IF_PACKETS_RX);
		createEAttribute(collectdKvmInterfaceEClass, COLLECTD_KVM_INTERFACE__IF_PACKETS_TX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		AlertsPackage theAlertsPackage = (AlertsPackage)EPackage.Registry.INSTANCE.getEPackage(AlertsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		collectdServerEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		collectdServerEClass.getESuperTypes().add(theAlertsPackage.getAlertContainer());
		collectdCpuEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		collectdCpuEClass.getESuperTypes().add(theAlertsPackage.getAlertContainer());
		collectdDiskEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		collectdDiskEClass.getESuperTypes().add(theAlertsPackage.getAlertContainer());
		collectdFileSystemEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		collectdFileSystemEClass.getESuperTypes().add(theAlertsPackage.getAlertContainer());
		collectdInterfaceEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		collectdInterfaceEClass.getESuperTypes().add(theAlertsPackage.getAlertContainer());
		collectdKvmInstanceEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		collectdKvmInstanceEClass.getESuperTypes().add(theAlertsPackage.getAlertContainer());
		collectdKvmDiskEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		collectdKvmDiskEClass.getESuperTypes().add(theAlertsPackage.getAlertContainer());
		collectdKvmInterfaceEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		collectdKvmInterfaceEClass.getESuperTypes().add(theAlertsPackage.getAlertContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(collectdServerEClass, CollectdServer.class, "CollectdServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdServer_Load_shortterm(), theCorePackage.getDoubleMetricAttribute(), "load_shortterm", null, 0, 1, CollectdServer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdServer_Load_midterm(), theCorePackage.getDoubleMetricAttribute(), "load_midterm", null, 0, 1, CollectdServer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdServer_Load_longterm(), theCorePackage.getDoubleMetricAttribute(), "load_longterm", null, 0, 1, CollectdServer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdServer_Entropy(), theCorePackage.getDoubleMetricAttribute(), "entropy", null, 0, 1, CollectdServer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdServer_Contextswitches(), theCorePackage.getIncreasingULongMetricAttribute(), "contextswitches", null, 0, 1, CollectdServer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Cpus(), this.getCollectdCpu(), null, "cpus", null, 0, -1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Memory(), this.getCollectdMemory(), null, "memory", null, 0, 1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Swap(), this.getCollectdSwap(), null, "swap", null, 0, 1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Processes(), this.getCollectdProcesses(), null, "processes", null, 0, 1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Vmem(), this.getCollectdVmem(), null, "vmem", null, 0, 1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Filesystems(), this.getCollectdFileSystem(), null, "filesystems", null, 0, -1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Disks(), this.getCollectdDisk(), null, "disks", null, 0, -1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Interfaces(), this.getCollectdInterface(), null, "interfaces", null, 0, -1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdServer_Instances(), this.getCollectdKvmInstance(), null, "instances", null, 0, -1, CollectdServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdMemoryEClass, CollectdMemory.class, "CollectdMemory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdMemory_Buffered(), theCorePackage.getDoubleMetricAttribute(), "buffered", null, 0, 1, CollectdMemory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdMemory_Cached(), theCorePackage.getDoubleMetricAttribute(), "cached", null, 0, 1, CollectdMemory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdMemory_Free(), theCorePackage.getDoubleMetricAttribute(), "free", null, 0, 1, CollectdMemory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdMemory_Used(), theCorePackage.getDoubleMetricAttribute(), "used", null, 0, 1, CollectdMemory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdSwapEClass, CollectdSwap.class, "CollectdSwap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdSwap_Cached(), theCorePackage.getDoubleMetricAttribute(), "cached", null, 0, 1, CollectdSwap.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdSwap_Free(), theCorePackage.getDoubleMetricAttribute(), "free", null, 0, 1, CollectdSwap.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdSwap_Used(), theCorePackage.getDoubleMetricAttribute(), "used", null, 0, 1, CollectdSwap.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdProcessesEClass, CollectdProcesses.class, "CollectdProcesses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdProcesses_Fork_rate(), theCorePackage.getIncreasingULongMetricAttribute(), "fork_rate", null, 0, 1, CollectdProcesses.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdProcesses_Blocked(), theCorePackage.getDoubleMetricAttribute(), "blocked", null, 0, 1, CollectdProcesses.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdProcesses_Paging(), theCorePackage.getDoubleMetricAttribute(), "paging", null, 0, 1, CollectdProcesses.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdProcesses_Running(), theCorePackage.getDoubleMetricAttribute(), "running", null, 0, 1, CollectdProcesses.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdProcesses_Sleeping(), theCorePackage.getDoubleMetricAttribute(), "sleeping", null, 0, 1, CollectdProcesses.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdProcesses_Stopped(), theCorePackage.getDoubleMetricAttribute(), "stopped", null, 0, 1, CollectdProcesses.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdProcesses_Zombies(), theCorePackage.getDoubleMetricAttribute(), "zombies", null, 0, 1, CollectdProcesses.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdVmemEClass, CollectdVmem.class, "CollectdVmem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdVmem_Active_anon(), theCorePackage.getDoubleMetricAttribute(), "active_anon", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Active_file(), theCorePackage.getDoubleMetricAttribute(), "active_file", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Anon_pages(), theCorePackage.getDoubleMetricAttribute(), "anon_pages", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Anon_transparent_hugepages(), theCorePackage.getDoubleMetricAttribute(), "anon_transparent_hugepages", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Bounce(), theCorePackage.getDoubleMetricAttribute(), "bounce", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Dirtied(), theCorePackage.getDoubleMetricAttribute(), "dirtied", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Dirty(), theCorePackage.getDoubleMetricAttribute(), "dirty", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Dirty_background_threshold(), theCorePackage.getDoubleMetricAttribute(), "dirty_background_threshold", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Dirty_threshold(), theCorePackage.getDoubleMetricAttribute(), "dirty_threshold", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_File_pages(), theCorePackage.getDoubleMetricAttribute(), "file_pages", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Free_pages(), theCorePackage.getDoubleMetricAttribute(), "free_pages", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Inactive_anon(), theCorePackage.getDoubleMetricAttribute(), "inactive_anon", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Inactive_file(), theCorePackage.getDoubleMetricAttribute(), "inactive_file", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Isolated_anon(), theCorePackage.getDoubleMetricAttribute(), "isolated_anon", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Isolated_file(), theCorePackage.getDoubleMetricAttribute(), "isolated_file", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Kernel_stack(), theCorePackage.getDoubleMetricAttribute(), "kernel_stack", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Mapped(), theCorePackage.getDoubleMetricAttribute(), "mapped", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Mlock(), theCorePackage.getDoubleMetricAttribute(), "mlock", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Page_table_pages(), theCorePackage.getDoubleMetricAttribute(), "page_table_pages", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Shmem(), theCorePackage.getDoubleMetricAttribute(), "shmem", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Slab_reclaimable(), theCorePackage.getDoubleMetricAttribute(), "slab_reclaimable", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Slab_unreclaimable(), theCorePackage.getDoubleMetricAttribute(), "slab_unreclaimable", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Unevictable(), theCorePackage.getDoubleMetricAttribute(), "unevictable", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Unstable(), theCorePackage.getDoubleMetricAttribute(), "unstable", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Vmscan_immediate_reclaim(), theCorePackage.getDoubleMetricAttribute(), "vmscan_immediate_reclaim", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Vmscan_write(), theCorePackage.getDoubleMetricAttribute(), "vmscan_write", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Writeback(), theCorePackage.getDoubleMetricAttribute(), "writeback", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Writeback_temp(), theCorePackage.getDoubleMetricAttribute(), "writeback_temp", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Written(), theCorePackage.getDoubleMetricAttribute(), "written", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Memory_in(), theCorePackage.getIncreasingULongMetricAttribute(), "memory_in", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Memory_out(), theCorePackage.getIncreasingULongMetricAttribute(), "memory_out", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Swap_in(), theCorePackage.getIncreasingULongMetricAttribute(), "swap_in", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Swap_out(), theCorePackage.getIncreasingULongMetricAttribute(), "swap_out", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Faults_minor(), theCorePackage.getIncreasingULongMetricAttribute(), "faults_minor", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdVmem_Faults_major(), theCorePackage.getIncreasingULongMetricAttribute(), "faults_major", null, 0, 1, CollectdVmem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdCpuEClass, CollectdCpu.class, "CollectdCpu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdCpu_Idle(), theCorePackage.getIncreasingULongMetricAttribute(), "idle", null, 0, 1, CollectdCpu.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdCpu_Wait(), theCorePackage.getIncreasingULongMetricAttribute(), "wait", null, 0, 1, CollectdCpu.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdCpu_User(), theCorePackage.getIncreasingULongMetricAttribute(), "user", null, 0, 1, CollectdCpu.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdCpu_System(), theCorePackage.getIncreasingULongMetricAttribute(), "system", null, 0, 1, CollectdCpu.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdDiskEClass, CollectdDisk.class, "CollectdDisk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdDisk_Disk_merged_read(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_merged_read", null, 0, 1, CollectdDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdDisk_Disk_merged_write(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_merged_write", null, 0, 1, CollectdDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdDisk_Disk_octets_read(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_octets_read", null, 0, 1, CollectdDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdDisk_Disk_octets_write(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_octets_write", null, 0, 1, CollectdDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdDisk_Disk_ops_read(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_ops_read", null, 0, 1, CollectdDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdDisk_Disk_ops_write(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_ops_write", null, 0, 1, CollectdDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdDisk_Disk_time_read(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_time_read", null, 0, 1, CollectdDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdDisk_Disk_time_write(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_time_write", null, 0, 1, CollectdDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdFileSystemEClass, CollectdFileSystem.class, "CollectdFileSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdFileSystem_Used(), theCorePackage.getDoubleMetricAttribute(), "used", null, 0, 1, CollectdFileSystem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdFileSystem_Free(), theCorePackage.getDoubleMetricAttribute(), "free", null, 0, 1, CollectdFileSystem.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdInterfaceEClass, CollectdInterface.class, "CollectdInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdInterface_If_errors_rx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_errors_rx", null, 0, 1, CollectdInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdInterface_If_errors_tx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_errors_tx", null, 0, 1, CollectdInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdInterface_If_octets_rx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_octets_rx", null, 0, 1, CollectdInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdInterface_If_octets_tx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_octets_tx", null, 0, 1, CollectdInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdInterface_If_packets_rx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_packets_rx", null, 0, 1, CollectdInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdInterface_If_packets_tx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_packets_tx", null, 0, 1, CollectdInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdKvmInstanceEClass, CollectdKvmInstance.class, "CollectdKvmInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdKvmInstance_Virt_cpu_total(), theCorePackage.getIncreasingULongMetricAttribute(), "virt_cpu_total", null, 0, 1, CollectdKvmInstance.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdKvmInstance_Disks(), this.getCollectdKvmDisk(), null, "disks", null, 0, -1, CollectdKvmInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectdKvmInstance_Interfaces(), this.getCollectdKvmInterface(), null, "interfaces", null, 0, -1, CollectdKvmInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdKvmDiskEClass, CollectdKvmDisk.class, "CollectdKvmDisk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdKvmDisk_Disk_octets_read(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_octets_read", null, 0, 1, CollectdKvmDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmDisk_Disk_octets_write(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_octets_write", null, 0, 1, CollectdKvmDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmDisk_Disk_ops_read(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_ops_read", null, 0, 1, CollectdKvmDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmDisk_Disk_ops_write(), theCorePackage.getIncreasingULongMetricAttribute(), "disk_ops_write", null, 0, 1, CollectdKvmDisk.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectdKvmInterfaceEClass, CollectdKvmInterface.class, "CollectdKvmInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollectdKvmInterface_If_errors_rx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_errors_rx", null, 0, 1, CollectdKvmInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmInterface_If_errors_tx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_errors_tx", null, 0, 1, CollectdKvmInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmInterface_If_dropped_rx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_dropped_rx", null, 0, 1, CollectdKvmInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmInterface_If_dropped_tx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_dropped_tx", null, 0, 1, CollectdKvmInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmInterface_If_octets_rx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_octets_rx", null, 0, 1, CollectdKvmInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmInterface_If_octets_tx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_octets_tx", null, 0, 1, CollectdKvmInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmInterface_If_packets_rx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_packets_rx", null, 0, 1, CollectdKvmInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollectdKvmInterface_If_packets_tx(), theCorePackage.getIncreasingULongMetricAttribute(), "if_packets_tx", null, 0, 1, CollectdKvmInterface.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org/sirius/doc
		createDocAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "doc", "http://openecomp.org/sirius/doc"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org/sirius/doc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocAnnotations() {
		String source = "http://openecomp.org/sirius/doc";	
		addAnnotation
		  (getCollectdDisk_Disk_octets_read(), 
		   source, 
		   new String[] {
			 "unit", "byte"
		   });
	}

} //CollectdPackageImpl
