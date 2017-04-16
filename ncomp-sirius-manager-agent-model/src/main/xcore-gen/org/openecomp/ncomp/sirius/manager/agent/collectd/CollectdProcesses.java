
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

import org.eclipse.emf.ecore.EObject;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getFork_rate <em>Fork rate</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getBlocked <em>Blocked</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getPaging <em>Paging</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getRunning <em>Running</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getSleeping <em>Sleeping</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getStopped <em>Stopped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getZombies <em>Zombies</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdProcesses()
 * @model
 * @generated
 */
public interface CollectdProcesses extends EObject {
	/**
	 * Returns the value of the '<em><b>Fork rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork rate</em>' attribute.
	 * @see #setFork_rate(IncreasingULongMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdProcesses_Fork_rate()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.IncreasingULongMetricAttribute" transient="true"
	 * @generated
	 */
	IncreasingULongMetricAttribute getFork_rate();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getFork_rate <em>Fork rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork rate</em>' attribute.
	 * @see #getFork_rate()
	 * @generated
	 */
	void setFork_rate(IncreasingULongMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked</em>' attribute.
	 * @see #setBlocked(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdProcesses_Blocked()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getBlocked();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked</em>' attribute.
	 * @see #getBlocked()
	 * @generated
	 */
	void setBlocked(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Paging</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paging</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paging</em>' attribute.
	 * @see #setPaging(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdProcesses_Paging()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getPaging();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getPaging <em>Paging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paging</em>' attribute.
	 * @see #getPaging()
	 * @generated
	 */
	void setPaging(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running</em>' attribute.
	 * @see #setRunning(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdProcesses_Running()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getRunning();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #getRunning()
	 * @generated
	 */
	void setRunning(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Sleeping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sleeping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sleeping</em>' attribute.
	 * @see #setSleeping(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdProcesses_Sleeping()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getSleeping();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getSleeping <em>Sleeping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sleeping</em>' attribute.
	 * @see #getSleeping()
	 * @generated
	 */
	void setSleeping(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Stopped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stopped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopped</em>' attribute.
	 * @see #setStopped(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdProcesses_Stopped()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getStopped();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getStopped <em>Stopped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stopped</em>' attribute.
	 * @see #getStopped()
	 * @generated
	 */
	void setStopped(DoubleMetricAttribute value);

	/**
	 * Returns the value of the '<em><b>Zombies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zombies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zombies</em>' attribute.
	 * @see #setZombies(DoubleMetricAttribute)
	 * @see org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage#getCollectdProcesses_Zombies()
	 * @model unique="false" dataType="org.openecomp.ncomp.core.DoubleMetricAttribute" transient="true"
	 * @generated
	 */
	DoubleMetricAttribute getZombies();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdProcesses#getZombies <em>Zombies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zombies</em>' attribute.
	 * @see #getZombies()
	 * @generated
	 */
	void setZombies(DoubleMetricAttribute value);

} // CollectdProcesses
