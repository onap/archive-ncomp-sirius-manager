
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
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kvm Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_octets_read <em>Disk octets read</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_octets_write <em>Disk octets write</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_ops_read <em>Disk ops read</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_ops_write <em>Disk ops write</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdKvmDisk()
 * @model
 * @generated
 */
public interface CollectdKvmDisk extends NamedEntity, AlertContainer {
	/**
	 * Returns the value of the '<em><b>Disk octets read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk octets read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk octets read</em>' attribute.
	 * @see #setDisk_octets_read(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdKvmDisk_Disk_octets_read()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getDisk_octets_read();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_octets_read <em>Disk octets read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk octets read</em>' attribute.
	 * @see #getDisk_octets_read()
	 * @generated
	 */
	void setDisk_octets_read(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Disk octets write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk octets write</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk octets write</em>' attribute.
	 * @see #setDisk_octets_write(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdKvmDisk_Disk_octets_write()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getDisk_octets_write();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_octets_write <em>Disk octets write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk octets write</em>' attribute.
	 * @see #getDisk_octets_write()
	 * @generated
	 */
	void setDisk_octets_write(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Disk ops read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk ops read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk ops read</em>' attribute.
	 * @see #setDisk_ops_read(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdKvmDisk_Disk_ops_read()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getDisk_ops_read();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_ops_read <em>Disk ops read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk ops read</em>' attribute.
	 * @see #getDisk_ops_read()
	 * @generated
	 */
	void setDisk_ops_read(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Disk ops write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disk ops write</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disk ops write</em>' attribute.
	 * @see #setDisk_ops_write(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdKvmDisk_Disk_ops_write()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getDisk_ops_write();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdKvmDisk#getDisk_ops_write <em>Disk ops write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk ops write</em>' attribute.
	 * @see #getDisk_ops_write()
	 * @generated
	 */
	void setDisk_ops_write(IncreasingULongMetricAttribute value);

} // CollectdKvmDisk
