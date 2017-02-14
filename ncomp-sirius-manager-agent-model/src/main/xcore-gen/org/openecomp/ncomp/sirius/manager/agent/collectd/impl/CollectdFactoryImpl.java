
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

import org.openecomp.ncomp.sirius.manager.agent.collectd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectdFactoryImpl extends EFactoryImpl implements CollectdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollectdFactory init() {
		try {
			CollectdFactory theCollectdFactory = (CollectdFactory)EPackage.Registry.INSTANCE.getEFactory(CollectdPackage.eNS_URI);
			if (theCollectdFactory != null) {
				return theCollectdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollectdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CollectdPackage.COLLECTD_SERVER: return createCollectdServer();
			case CollectdPackage.COLLECTD_MEMORY: return createCollectdMemory();
			case CollectdPackage.COLLECTD_SWAP: return createCollectdSwap();
			case CollectdPackage.COLLECTD_PROCESSES: return createCollectdProcesses();
			case CollectdPackage.COLLECTD_VMEM: return createCollectdVmem();
			case CollectdPackage.COLLECTD_CPU: return createCollectdCpu();
			case CollectdPackage.COLLECTD_DISK: return createCollectdDisk();
			case CollectdPackage.COLLECTD_FILE_SYSTEM: return createCollectdFileSystem();
			case CollectdPackage.COLLECTD_INTERFACE: return createCollectdInterface();
			case CollectdPackage.COLLECTD_KVM_INSTANCE: return createCollectdKvmInstance();
			case CollectdPackage.COLLECTD_KVM_DISK: return createCollectdKvmDisk();
			case CollectdPackage.COLLECTD_KVM_INTERFACE: return createCollectdKvmInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdServer createCollectdServer() {
		CollectdServerImpl collectdServer = new CollectdServerImpl();
		return collectdServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdMemory createCollectdMemory() {
		CollectdMemoryImpl collectdMemory = new CollectdMemoryImpl();
		return collectdMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdSwap createCollectdSwap() {
		CollectdSwapImpl collectdSwap = new CollectdSwapImpl();
		return collectdSwap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdProcesses createCollectdProcesses() {
		CollectdProcessesImpl collectdProcesses = new CollectdProcessesImpl();
		return collectdProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdVmem createCollectdVmem() {
		CollectdVmemImpl collectdVmem = new CollectdVmemImpl();
		return collectdVmem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdCpu createCollectdCpu() {
		CollectdCpuImpl collectdCpu = new CollectdCpuImpl();
		return collectdCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdDisk createCollectdDisk() {
		CollectdDiskImpl collectdDisk = new CollectdDiskImpl();
		return collectdDisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdFileSystem createCollectdFileSystem() {
		CollectdFileSystemImpl collectdFileSystem = new CollectdFileSystemImpl();
		return collectdFileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdInterface createCollectdInterface() {
		CollectdInterfaceImpl collectdInterface = new CollectdInterfaceImpl();
		return collectdInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdKvmInstance createCollectdKvmInstance() {
		CollectdKvmInstanceImpl collectdKvmInstance = new CollectdKvmInstanceImpl();
		return collectdKvmInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdKvmDisk createCollectdKvmDisk() {
		CollectdKvmDiskImpl collectdKvmDisk = new CollectdKvmDiskImpl();
		return collectdKvmDisk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdKvmInterface createCollectdKvmInterface() {
		CollectdKvmInterfaceImpl collectdKvmInterface = new CollectdKvmInterfaceImpl();
		return collectdKvmInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdPackage getCollectdPackage() {
		return (CollectdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollectdPackage getPackage() {
		return CollectdPackage.eINSTANCE;
	}

} //CollectdFactoryImpl
