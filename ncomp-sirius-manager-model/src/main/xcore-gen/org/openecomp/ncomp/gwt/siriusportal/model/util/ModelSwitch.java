
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
package org.openecomp.ncomp.gwt.siriusportal.model.util;

import org.openecomp.ncomp.gwt.siriusportal.model.*;

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
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case ModelPackage.GUI_CLIENT_API: {
				GuiClientApi guiClientApi = (GuiClientApi)theEObject;
				T result = caseGuiClientApi(guiClientApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TREE: {
				GuiTree guiTree = (GuiTree)theEObject;
				T result = caseGuiTree(guiTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TREE_NODE: {
				GuiTreeNode guiTreeNode = (GuiTreeNode)theEObject;
				T result = caseGuiTreeNode(guiTreeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT: {
				GuiObject guiObject = (GuiObject)theEObject;
				T result = caseGuiObject(guiObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_NAMED_OBJECT: {
				GuiNamedObject guiNamedObject = (GuiNamedObject)theEObject;
				T result = caseGuiNamedObject(guiNamedObject);
				if (result == null) result = caseGuiObject(guiNamedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT_VALUE: {
				GuiObjectValue guiObjectValue = (GuiObjectValue)theEObject;
				T result = caseGuiObjectValue(guiObjectValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT_VALUE_INTEGER: {
				GuiObjectValueInteger guiObjectValueInteger = (GuiObjectValueInteger)theEObject;
				T result = caseGuiObjectValueInteger(guiObjectValueInteger);
				if (result == null) result = caseGuiObjectValue(guiObjectValueInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT_VALUE_STRING: {
				GuiObjectValueString guiObjectValueString = (GuiObjectValueString)theEObject;
				T result = caseGuiObjectValueString(guiObjectValueString);
				if (result == null) result = caseGuiObjectValue(guiObjectValueString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT_VALUE_REFERENCE: {
				GuiObjectValueReference guiObjectValueReference = (GuiObjectValueReference)theEObject;
				T result = caseGuiObjectValueReference(guiObjectValueReference);
				if (result == null) result = caseGuiObjectValueString(guiObjectValueReference);
				if (result == null) result = caseGuiObjectValue(guiObjectValueReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT_VALUE_TIME_SERIES: {
				GuiObjectValueTimeSeries guiObjectValueTimeSeries = (GuiObjectValueTimeSeries)theEObject;
				T result = caseGuiObjectValueTimeSeries(guiObjectValueTimeSeries);
				if (result == null) result = caseGuiObjectValueString(guiObjectValueTimeSeries);
				if (result == null) result = caseGuiObjectValue(guiObjectValueTimeSeries);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT_VALUE_OBJECT: {
				GuiObjectValueObject guiObjectValueObject = (GuiObjectValueObject)theEObject;
				T result = caseGuiObjectValueObject(guiObjectValueObject);
				if (result == null) result = caseGuiObjectValue(guiObjectValueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT_UN_NAMED_LIST: {
				GuiObjectUnNamedList guiObjectUnNamedList = (GuiObjectUnNamedList)theEObject;
				T result = caseGuiObjectUnNamedList(guiObjectUnNamedList);
				if (result == null) result = caseGuiObjectValue(guiObjectUnNamedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_OBJECT_NAMED_LIST: {
				GuiObjectNamedList guiObjectNamedList = (GuiObjectNamedList)theEObject;
				T result = caseGuiObjectNamedList(guiObjectNamedList);
				if (result == null) result = caseGuiObjectValue(guiObjectNamedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TIME_SERIE: {
				GuiTimeSerie guiTimeSerie = (GuiTimeSerie)theEObject;
				T result = caseGuiTimeSerie(guiTimeSerie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TIME_SERIE_DATA: {
				GuiTimeSerieData guiTimeSerieData = (GuiTimeSerieData)theEObject;
				T result = caseGuiTimeSerieData(guiTimeSerieData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE: {
				GuiTable guiTable = (GuiTable)theEObject;
				T result = caseGuiTable(guiTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE_COLUMN: {
				GuiTableColumn guiTableColumn = (GuiTableColumn)theEObject;
				T result = caseGuiTableColumn(guiTableColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE_ROW: {
				GuiTableRow guiTableRow = (GuiTableRow)theEObject;
				T result = caseGuiTableRow(guiTableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE_CELL: {
				GuiTableCell guiTableCell = (GuiTableCell)theEObject;
				T result = caseGuiTableCell(guiTableCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE_CELL_STRING: {
				GuiTableCellString guiTableCellString = (GuiTableCellString)theEObject;
				T result = caseGuiTableCellString(guiTableCellString);
				if (result == null) result = caseGuiTableCell(guiTableCellString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE_CELL_DOUBLE: {
				GuiTableCellDouble guiTableCellDouble = (GuiTableCellDouble)theEObject;
				T result = caseGuiTableCellDouble(guiTableCellDouble);
				if (result == null) result = caseGuiTableCell(guiTableCellDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE_CELL_DATE: {
				GuiTableCellDate guiTableCellDate = (GuiTableCellDate)theEObject;
				T result = caseGuiTableCellDate(guiTableCellDate);
				if (result == null) result = caseGuiTableCell(guiTableCellDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE_CELL_REFERENCES: {
				GuiTableCellReferences guiTableCellReferences = (GuiTableCellReferences)theEObject;
				T result = caseGuiTableCellReferences(guiTableCellReferences);
				if (result == null) result = caseGuiTableCell(guiTableCellReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_TABLE_CELL_REFERENCE: {
				GuiTableCellReference guiTableCellReference = (GuiTableCellReference)theEObject;
				T result = caseGuiTableCellReference(guiTableCellReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_DIAGRAM: {
				GuiDiagram guiDiagram = (GuiDiagram)theEObject;
				T result = caseGuiDiagram(guiDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_DIAGRAM_ITEM: {
				GuiDiagramItem guiDiagramItem = (GuiDiagramItem)theEObject;
				T result = caseGuiDiagramItem(guiDiagramItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_DIAGRAM_RECTANGLE: {
				GuiDiagramRectangle guiDiagramRectangle = (GuiDiagramRectangle)theEObject;
				T result = caseGuiDiagramRectangle(guiDiagramRectangle);
				if (result == null) result = caseGuiDiagramItem(guiDiagramRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_HTML: {
				GuiHtml guiHtml = (GuiHtml)theEObject;
				T result = caseGuiHtml(guiHtml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Client Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Client Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiClientApi(GuiClientApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTree(GuiTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Tree Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTreeNode(GuiTreeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObject(GuiObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Named Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Named Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiNamedObject(GuiNamedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObjectValue(GuiObjectValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object Value Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object Value Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObjectValueInteger(GuiObjectValueInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object Value String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object Value String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObjectValueString(GuiObjectValueString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object Value Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObjectValueReference(GuiObjectValueReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object Value Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object Value Time Series</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObjectValueTimeSeries(GuiObjectValueTimeSeries object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object Value Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObjectValueObject(GuiObjectValueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object Un Named List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object Un Named List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObjectUnNamedList(GuiObjectUnNamedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Object Named List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Object Named List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiObjectNamedList(GuiObjectNamedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Time Serie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Time Serie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTimeSerie(GuiTimeSerie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Time Serie Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Time Serie Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTimeSerieData(GuiTimeSerieData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTable(GuiTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTableColumn(GuiTableColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTableRow(GuiTableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTableCell(GuiTableCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table Cell String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table Cell String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTableCellString(GuiTableCellString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table Cell Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table Cell Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTableCellDouble(GuiTableCellDouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table Cell Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table Cell Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTableCellDate(GuiTableCellDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table Cell References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table Cell References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTableCellReferences(GuiTableCellReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Table Cell Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Table Cell Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiTableCellReference(GuiTableCellReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiDiagram(GuiDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Diagram Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Diagram Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiDiagramItem(GuiDiagramItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Diagram Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Diagram Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiDiagramRectangle(GuiDiagramRectangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Html</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Html</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiHtml(GuiHtml object) {
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

} //ModelSwitch
