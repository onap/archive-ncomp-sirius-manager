
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
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage
 * @generated
 */
public class TableTemplateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TableTemplatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplateSwitch() {
		if (modelPackage == null) {
			modelPackage = TableTemplatePackage.eINSTANCE;
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
			case TableTemplatePackage.ABSTRACT_TABLE_TEMPLATE: {
				AbstractTableTemplate abstractTableTemplate = (AbstractTableTemplate)theEObject;
				T result = caseAbstractTableTemplate(abstractTableTemplate);
				if (result == null) result = caseNamedEntity(abstractTableTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TableTemplatePackage.HAS_COLUMNS_TABLE_TEMPLATE: {
				HasColumnsTableTemplate hasColumnsTableTemplate = (HasColumnsTableTemplate)theEObject;
				T result = caseHasColumnsTableTemplate(hasColumnsTableTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TableTemplatePackage.LOG_TABLE_TEMPLATE: {
				LogTableTemplate logTableTemplate = (LogTableTemplate)theEObject;
				T result = caseLogTableTemplate(logTableTemplate);
				if (result == null) result = caseAbstractTableTemplate(logTableTemplate);
				if (result == null) result = caseNamedEntity(logTableTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TableTemplatePackage.TABLE_TEMPLATE: {
				TableTemplate tableTemplate = (TableTemplate)theEObject;
				T result = caseTableTemplate(tableTemplate);
				if (result == null) result = caseAbstractTableTemplate(tableTemplate);
				if (result == null) result = caseHasColumnsTableTemplate(tableTemplate);
				if (result == null) result = caseNamedEntity(tableTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TableTemplatePackage.ITERATOR_TABLE_TEMPLATE: {
				IteratorTableTemplate iteratorTableTemplate = (IteratorTableTemplate)theEObject;
				T result = caseIteratorTableTemplate(iteratorTableTemplate);
				if (result == null) result = caseAbstractTableTemplate(iteratorTableTemplate);
				if (result == null) result = caseHasColumnsTableTemplate(iteratorTableTemplate);
				if (result == null) result = caseNamedEntity(iteratorTableTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TableTemplatePackage.TIME_TABLE_TEMPLATE: {
				TimeTableTemplate timeTableTemplate = (TimeTableTemplate)theEObject;
				T result = caseTimeTableTemplate(timeTableTemplate);
				if (result == null) result = caseTableTemplate(timeTableTemplate);
				if (result == null) result = caseAbstractTableTemplate(timeTableTemplate);
				if (result == null) result = caseHasColumnsTableTemplate(timeTableTemplate);
				if (result == null) result = caseNamedEntity(timeTableTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TableTemplatePackage.TABLE_TEMPLATE_COLUMN: {
				TableTemplateColumn tableTemplateColumn = (TableTemplateColumn)theEObject;
				T result = caseTableTemplateColumn(tableTemplateColumn);
				if (result == null) result = caseNamedEntity(tableTemplateColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TableTemplatePackage.TABLE_TEMPLATE_ATTRIBUTE_COLUMN: {
				TableTemplateAttributeColumn tableTemplateAttributeColumn = (TableTemplateAttributeColumn)theEObject;
				T result = caseTableTemplateAttributeColumn(tableTemplateAttributeColumn);
				if (result == null) result = caseTableTemplateColumn(tableTemplateAttributeColumn);
				if (result == null) result = caseNamedEntity(tableTemplateAttributeColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TableTemplatePackage.TABLE_TEMPLATE_METRIC_COLUMN: {
				TableTemplateMetricColumn tableTemplateMetricColumn = (TableTemplateMetricColumn)theEObject;
				T result = caseTableTemplateMetricColumn(tableTemplateMetricColumn);
				if (result == null) result = caseTableTemplateColumn(tableTemplateMetricColumn);
				if (result == null) result = caseNamedEntity(tableTemplateMetricColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Table Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTableTemplate(AbstractTableTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Columns Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Columns Table Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasColumnsTableTemplate(HasColumnsTableTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Table Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogTableTemplate(LogTableTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableTemplate(TableTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator Table Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIteratorTableTemplate(IteratorTableTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Table Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Table Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTableTemplate(TimeTableTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableTemplateColumn(TableTemplateColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableTemplateAttributeColumn(TableTemplateAttributeColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableTemplateMetricColumn(TableTemplateMetricColumn object) {
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

} //TableTemplateSwitch
