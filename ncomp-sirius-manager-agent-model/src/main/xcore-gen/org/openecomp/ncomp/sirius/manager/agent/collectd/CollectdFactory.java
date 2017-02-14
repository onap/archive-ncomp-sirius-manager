
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage
 * @generated
 */
public interface CollectdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectdFactory eINSTANCE = org.openecomp.ncomp.sirius.manager.agent.collectd.impl.CollectdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	CollectdServer createCollectdServer();

	/**
	 * Returns a new object of class '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory</em>'.
	 * @generated
	 */
	CollectdMemory createCollectdMemory();

	/**
	 * Returns a new object of class '<em>Swap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swap</em>'.
	 * @generated
	 */
	CollectdSwap createCollectdSwap();

	/**
	 * Returns a new object of class '<em>Processes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processes</em>'.
	 * @generated
	 */
	CollectdProcesses createCollectdProcesses();

	/**
	 * Returns a new object of class '<em>Vmem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vmem</em>'.
	 * @generated
	 */
	CollectdVmem createCollectdVmem();

	/**
	 * Returns a new object of class '<em>Cpu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpu</em>'.
	 * @generated
	 */
	CollectdCpu createCollectdCpu();

	/**
	 * Returns a new object of class '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disk</em>'.
	 * @generated
	 */
	CollectdDisk createCollectdDisk();

	/**
	 * Returns a new object of class '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File System</em>'.
	 * @generated
	 */
	CollectdFileSystem createCollectdFileSystem();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	CollectdInterface createCollectdInterface();

	/**
	 * Returns a new object of class '<em>Kvm Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kvm Instance</em>'.
	 * @generated
	 */
	CollectdKvmInstance createCollectdKvmInstance();

	/**
	 * Returns a new object of class '<em>Kvm Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kvm Disk</em>'.
	 * @generated
	 */
	CollectdKvmDisk createCollectdKvmDisk();

	/**
	 * Returns a new object of class '<em>Kvm Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kvm Interface</em>'.
	 * @generated
	 */
	CollectdKvmInterface createCollectdKvmInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CollectdPackage getCollectdPackage();

} //CollectdFactory
