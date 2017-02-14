
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
package org.openecomp.ncomp.sirius.manager.tableTemplate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage
 * @generated
 */
public interface TableTemplateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableTemplateFactory eINSTANCE = org.openecomp.ncomp.sirius.manager.tableTemplate.impl.TableTemplateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Log Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Table Template</em>'.
	 * @generated
	 */
	LogTableTemplate createLogTableTemplate();

	/**
	 * Returns a new object of class '<em>Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Template</em>'.
	 * @generated
	 */
	TableTemplate createTableTemplate();

	/**
	 * Returns a new object of class '<em>Iterator Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iterator Table Template</em>'.
	 * @generated
	 */
	IteratorTableTemplate createIteratorTableTemplate();

	/**
	 * Returns a new object of class '<em>Time Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Table Template</em>'.
	 * @generated
	 */
	TimeTableTemplate createTimeTableTemplate();

	/**
	 * Returns a new object of class '<em>Attribute Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Column</em>'.
	 * @generated
	 */
	TableTemplateAttributeColumn createTableTemplateAttributeColumn();

	/**
	 * Returns a new object of class '<em>Metric Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Column</em>'.
	 * @generated
	 */
	TableTemplateMetricColumn createTableTemplateMetricColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TableTemplatePackage getTableTemplatePackage();

} //TableTemplateFactory
