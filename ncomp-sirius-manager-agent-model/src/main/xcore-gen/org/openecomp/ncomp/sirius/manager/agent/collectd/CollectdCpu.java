
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
 * A representation of the model object '<em><b>Cpu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getIdle <em>Idle</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getWait <em>Wait</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getUser <em>User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdCpu()
 * @model
 * @generated
 */
public interface CollectdCpu extends NamedEntity, AlertContainer {
	/**
	 * Returns the value of the '<em><b>Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idle</em>' attribute.
	 * @see #setIdle(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdCpu_Idle()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getIdle();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getIdle <em>Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idle</em>' attribute.
	 * @see #getIdle()
	 * @generated
	 */
	void setIdle(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Wait</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wait</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait</em>' attribute.
	 * @see #setWait(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdCpu_Wait()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getWait();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getWait <em>Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait</em>' attribute.
	 * @see #getWait()
	 * @generated
	 */
	void setWait(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdCpu_User()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getUser();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdCpu_System()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getSystem();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdCpu#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(IncreasingULongMetricAttribute value);

} // CollectdCpu
