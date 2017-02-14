
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
package org.openecomp.ncomp.sirius.manager.tableTemplate.impl;

import org.openecomp.ncomp.sirius.manager.tableTemplate.*;

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
public class TableTemplateFactoryImpl extends EFactoryImpl implements TableTemplateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TableTemplateFactory init() {
		try {
			TableTemplateFactory theTableTemplateFactory = (TableTemplateFactory)EPackage.Registry.INSTANCE.getEFactory(TableTemplatePackage.eNS_URI);
			if (theTableTemplateFactory != null) {
				return theTableTemplateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TableTemplateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplateFactoryImpl() {
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
			case TableTemplatePackage.LOG_TABLE_TEMPLATE: return createLogTableTemplate();
			case TableTemplatePackage.TABLE_TEMPLATE: return createTableTemplate();
			case TableTemplatePackage.ITERATOR_TABLE_TEMPLATE: return createIteratorTableTemplate();
			case TableTemplatePackage.TIME_TABLE_TEMPLATE: return createTimeTableTemplate();
			case TableTemplatePackage.TABLE_TEMPLATE_ATTRIBUTE_COLUMN: return createTableTemplateAttributeColumn();
			case TableTemplatePackage.TABLE_TEMPLATE_METRIC_COLUMN: return createTableTemplateMetricColumn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogTableTemplate createLogTableTemplate() {
		LogTableTemplateImpl logTableTemplate = new LogTableTemplateImpl();
		return logTableTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplate createTableTemplate() {
		TableTemplateImpl tableTemplate = new TableTemplateImpl();
		return tableTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorTableTemplate createIteratorTableTemplate() {
		IteratorTableTemplateImpl iteratorTableTemplate = new IteratorTableTemplateImpl();
		return iteratorTableTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTableTemplate createTimeTableTemplate() {
		TimeTableTemplateImpl timeTableTemplate = new TimeTableTemplateImpl();
		return timeTableTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplateAttributeColumn createTableTemplateAttributeColumn() {
		TableTemplateAttributeColumnImpl tableTemplateAttributeColumn = new TableTemplateAttributeColumnImpl();
		return tableTemplateAttributeColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplateMetricColumn createTableTemplateMetricColumn() {
		TableTemplateMetricColumnImpl tableTemplateMetricColumn = new TableTemplateMetricColumnImpl();
		return tableTemplateMetricColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplatePackage getTableTemplatePackage() {
		return (TableTemplatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TableTemplatePackage getPackage() {
		return TableTemplatePackage.eINSTANCE;
	}

} //TableTemplateFactoryImpl
