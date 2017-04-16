
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
package org.openecomp.ncomp.sirius.manager.agent.collectd.util;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.core.alerts.AlertContainer;

import org.openecomp.ncomp.sirius.manager.agent.collectd.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage
 * @generated
 */
public class CollectdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollectdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectdSwitch() {
		if (modelPackage == null) {
			modelPackage = CollectdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CollectdPackage.COLLECTD_SERVER: {
				CollectdServer collectdServer = (CollectdServer)theEObject;
				T result = caseCollectdServer(collectdServer);
				if (result == null) result = caseNamedEntity(collectdServer);
				if (result == null) result = caseAlertContainer(collectdServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_MEMORY: {
				CollectdMemory collectdMemory = (CollectdMemory)theEObject;
				T result = caseCollectdMemory(collectdMemory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_SWAP: {
				CollectdSwap collectdSwap = (CollectdSwap)theEObject;
				T result = caseCollectdSwap(collectdSwap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_PROCESSES: {
				CollectdProcesses collectdProcesses = (CollectdProcesses)theEObject;
				T result = caseCollectdProcesses(collectdProcesses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_VMEM: {
				CollectdVmem collectdVmem = (CollectdVmem)theEObject;
				T result = caseCollectdVmem(collectdVmem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_CPU: {
				CollectdCpu collectdCpu = (CollectdCpu)theEObject;
				T result = caseCollectdCpu(collectdCpu);
				if (result == null) result = caseNamedEntity(collectdCpu);
				if (result == null) result = caseAlertContainer(collectdCpu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_DISK: {
				CollectdDisk collectdDisk = (CollectdDisk)theEObject;
				T result = caseCollectdDisk(collectdDisk);
				if (result == null) result = caseNamedEntity(collectdDisk);
				if (result == null) result = caseAlertContainer(collectdDisk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_FILE_SYSTEM: {
				CollectdFileSystem collectdFileSystem = (CollectdFileSystem)theEObject;
				T result = caseCollectdFileSystem(collectdFileSystem);
				if (result == null) result = caseNamedEntity(collectdFileSystem);
				if (result == null) result = caseAlertContainer(collectdFileSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_INTERFACE: {
				CollectdInterface collectdInterface = (CollectdInterface)theEObject;
				T result = caseCollectdInterface(collectdInterface);
				if (result == null) result = caseNamedEntity(collectdInterface);
				if (result == null) result = caseAlertContainer(collectdInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_KVM_INSTANCE: {
				CollectdKvmInstance collectdKvmInstance = (CollectdKvmInstance)theEObject;
				T result = caseCollectdKvmInstance(collectdKvmInstance);
				if (result == null) result = caseNamedEntity(collectdKvmInstance);
				if (result == null) result = caseAlertContainer(collectdKvmInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_KVM_DISK: {
				CollectdKvmDisk collectdKvmDisk = (CollectdKvmDisk)theEObject;
				T result = caseCollectdKvmDisk(collectdKvmDisk);
				if (result == null) result = caseNamedEntity(collectdKvmDisk);
				if (result == null) result = caseAlertContainer(collectdKvmDisk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectdPackage.COLLECTD_KVM_INTERFACE: {
				CollectdKvmInterface collectdKvmInterface = (CollectdKvmInterface)theEObject;
				T result = caseCollectdKvmInterface(collectdKvmInterface);
				if (result == null) result = caseNamedEntity(collectdKvmInterface);
				if (result == null) result = caseAlertContainer(collectdKvmInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdServer(CollectdServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdMemory(CollectdMemory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdSwap(CollectdSwap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdProcesses(CollectdProcesses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vmem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vmem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdVmem(CollectdVmem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdCpu(CollectdCpu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdDisk(CollectdDisk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdFileSystem(CollectdFileSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdInterface(CollectdInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kvm Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kvm Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdKvmInstance(CollectdKvmInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kvm Disk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kvm Disk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdKvmDisk(CollectdKvmDisk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kvm Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kvm Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectdKvmInterface(CollectdKvmInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlertContainer(AlertContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CollectdSwitch
