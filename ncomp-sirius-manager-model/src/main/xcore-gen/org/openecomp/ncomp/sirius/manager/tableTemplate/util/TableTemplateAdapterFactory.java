
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
package org.openecomp.ncomp.sirius.manager.tableTemplate.util;

import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.sirius.manager.tableTemplate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage
 * @generated
 */
public class TableTemplateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TableTemplatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TableTemplatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTemplateSwitch<Adapter> modelSwitch =
		new TableTemplateSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractTableTemplate(AbstractTableTemplate object) {
				return createAbstractTableTemplateAdapter();
			}
			@Override
			public Adapter caseHasColumnsTableTemplate(HasColumnsTableTemplate object) {
				return createHasColumnsTableTemplateAdapter();
			}
			@Override
			public Adapter caseLogTableTemplate(LogTableTemplate object) {
				return createLogTableTemplateAdapter();
			}
			@Override
			public Adapter caseTableTemplate(TableTemplate object) {
				return createTableTemplateAdapter();
			}
			@Override
			public Adapter caseIteratorTableTemplate(IteratorTableTemplate object) {
				return createIteratorTableTemplateAdapter();
			}
			@Override
			public Adapter caseTimeTableTemplate(TimeTableTemplate object) {
				return createTimeTableTemplateAdapter();
			}
			@Override
			public Adapter caseTableTemplateColumn(TableTemplateColumn object) {
				return createTableTemplateColumnAdapter();
			}
			@Override
			public Adapter caseTableTemplateAttributeColumn(TableTemplateAttributeColumn object) {
				return createTableTemplateAttributeColumnAdapter();
			}
			@Override
			public Adapter caseTableTemplateMetricColumn(TableTemplateMetricColumn object) {
				return createTableTemplateMetricColumnAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate <em>Abstract Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate
	 * @generated
	 */
	public Adapter createAbstractTableTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.HasColumnsTableTemplate <em>Has Columns Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.HasColumnsTableTemplate
	 * @generated
	 */
	public Adapter createHasColumnsTableTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate <em>Log Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate
	 * @generated
	 */
	public Adapter createLogTableTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate <em>Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate
	 * @generated
	 */
	public Adapter createTableTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate <em>Iterator Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate
	 * @generated
	 */
	public Adapter createIteratorTableTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TimeTableTemplate <em>Time Table Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TimeTableTemplate
	 * @generated
	 */
	public Adapter createTimeTableTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateColumn
	 * @generated
	 */
	public Adapter createTableTemplateColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateAttributeColumn <em>Attribute Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateAttributeColumn
	 * @generated
	 */
	public Adapter createTableTemplateAttributeColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn <em>Metric Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn
	 * @generated
	 */
	public Adapter createTableTemplateMetricColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TableTemplateAdapterFactory
