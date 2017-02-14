
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
package org.openecomp.ncomp.gwt.siriusportal.model.impl;

import org.openecomp.ncomp.gwt.siriusportal.model.*;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
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
			case ModelPackage.GUI_CLIENT_API: return createGuiClientApi();
			case ModelPackage.GUI_TREE: return createGuiTree();
			case ModelPackage.GUI_TREE_NODE: return createGuiTreeNode();
			case ModelPackage.GUI_OBJECT: return createGuiObject();
			case ModelPackage.GUI_NAMED_OBJECT: return createGuiNamedObject();
			case ModelPackage.GUI_OBJECT_VALUE_INTEGER: return createGuiObjectValueInteger();
			case ModelPackage.GUI_OBJECT_VALUE_STRING: return createGuiObjectValueString();
			case ModelPackage.GUI_OBJECT_VALUE_REFERENCE: return createGuiObjectValueReference();
			case ModelPackage.GUI_OBJECT_VALUE_TIME_SERIES: return createGuiObjectValueTimeSeries();
			case ModelPackage.GUI_OBJECT_VALUE_OBJECT: return createGuiObjectValueObject();
			case ModelPackage.GUI_OBJECT_UN_NAMED_LIST: return createGuiObjectUnNamedList();
			case ModelPackage.GUI_OBJECT_NAMED_LIST: return createGuiObjectNamedList();
			case ModelPackage.GUI_TIME_SERIE: return createGuiTimeSerie();
			case ModelPackage.GUI_TIME_SERIE_DATA: return createGuiTimeSerieData();
			case ModelPackage.GUI_TABLE: return createGuiTable();
			case ModelPackage.GUI_TABLE_COLUMN: return createGuiTableColumn();
			case ModelPackage.GUI_TABLE_ROW: return createGuiTableRow();
			case ModelPackage.GUI_TABLE_CELL_STRING: return createGuiTableCellString();
			case ModelPackage.GUI_TABLE_CELL_DOUBLE: return createGuiTableCellDouble();
			case ModelPackage.GUI_TABLE_CELL_DATE: return createGuiTableCellDate();
			case ModelPackage.GUI_TABLE_CELL_REFERENCES: return createGuiTableCellReferences();
			case ModelPackage.GUI_TABLE_CELL_REFERENCE: return createGuiTableCellReference();
			case ModelPackage.GUI_DIAGRAM: return createGuiDiagram();
			case ModelPackage.GUI_DIAGRAM_ITEM: return createGuiDiagramItem();
			case ModelPackage.GUI_DIAGRAM_RECTANGLE: return createGuiDiagramRectangle();
			case ModelPackage.GUI_HTML: return createGuiHtml();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.GUI_VIEW:
				return createGuiViewFromString(eDataType, initialValue);
			case ModelPackage.GUI_TABLE_COLUMN_TYPE:
				return createGuiTableColumnTypeFromString(eDataType, initialValue);
			case ModelPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.GUI_VIEW:
				return convertGuiViewToString(eDataType, instanceValue);
			case ModelPackage.GUI_TABLE_COLUMN_TYPE:
				return convertGuiTableColumnTypeToString(eDataType, instanceValue);
			case ModelPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiClientApi createGuiClientApi() {
		GuiClientApiImpl guiClientApi = new GuiClientApiImpl();
		return guiClientApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTree createGuiTree() {
		GuiTreeImpl guiTree = new GuiTreeImpl();
		return guiTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTreeNode createGuiTreeNode() {
		GuiTreeNodeImpl guiTreeNode = new GuiTreeNodeImpl();
		return guiTreeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObject createGuiObject() {
		GuiObjectImpl guiObject = new GuiObjectImpl();
		return guiObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiNamedObject createGuiNamedObject() {
		GuiNamedObjectImpl guiNamedObject = new GuiNamedObjectImpl();
		return guiNamedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObjectValueInteger createGuiObjectValueInteger() {
		GuiObjectValueIntegerImpl guiObjectValueInteger = new GuiObjectValueIntegerImpl();
		return guiObjectValueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObjectValueString createGuiObjectValueString() {
		GuiObjectValueStringImpl guiObjectValueString = new GuiObjectValueStringImpl();
		return guiObjectValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObjectValueReference createGuiObjectValueReference() {
		GuiObjectValueReferenceImpl guiObjectValueReference = new GuiObjectValueReferenceImpl();
		return guiObjectValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObjectValueTimeSeries createGuiObjectValueTimeSeries() {
		GuiObjectValueTimeSeriesImpl guiObjectValueTimeSeries = new GuiObjectValueTimeSeriesImpl();
		return guiObjectValueTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObjectValueObject createGuiObjectValueObject() {
		GuiObjectValueObjectImpl guiObjectValueObject = new GuiObjectValueObjectImpl();
		return guiObjectValueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObjectUnNamedList createGuiObjectUnNamedList() {
		GuiObjectUnNamedListImpl guiObjectUnNamedList = new GuiObjectUnNamedListImpl();
		return guiObjectUnNamedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObjectNamedList createGuiObjectNamedList() {
		GuiObjectNamedListImpl guiObjectNamedList = new GuiObjectNamedListImpl();
		return guiObjectNamedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTimeSerie createGuiTimeSerie() {
		GuiTimeSerieImpl guiTimeSerie = new GuiTimeSerieImpl();
		return guiTimeSerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTimeSerieData createGuiTimeSerieData() {
		GuiTimeSerieDataImpl guiTimeSerieData = new GuiTimeSerieDataImpl();
		return guiTimeSerieData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTable createGuiTable() {
		GuiTableImpl guiTable = new GuiTableImpl();
		return guiTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableColumn createGuiTableColumn() {
		GuiTableColumnImpl guiTableColumn = new GuiTableColumnImpl();
		return guiTableColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableRow createGuiTableRow() {
		GuiTableRowImpl guiTableRow = new GuiTableRowImpl();
		return guiTableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableCellString createGuiTableCellString() {
		GuiTableCellStringImpl guiTableCellString = new GuiTableCellStringImpl();
		return guiTableCellString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableCellDouble createGuiTableCellDouble() {
		GuiTableCellDoubleImpl guiTableCellDouble = new GuiTableCellDoubleImpl();
		return guiTableCellDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableCellDate createGuiTableCellDate() {
		GuiTableCellDateImpl guiTableCellDate = new GuiTableCellDateImpl();
		return guiTableCellDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableCellReferences createGuiTableCellReferences() {
		GuiTableCellReferencesImpl guiTableCellReferences = new GuiTableCellReferencesImpl();
		return guiTableCellReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableCellReference createGuiTableCellReference() {
		GuiTableCellReferenceImpl guiTableCellReference = new GuiTableCellReferenceImpl();
		return guiTableCellReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiDiagram createGuiDiagram() {
		GuiDiagramImpl guiDiagram = new GuiDiagramImpl();
		return guiDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiDiagramItem createGuiDiagramItem() {
		GuiDiagramItemImpl guiDiagramItem = new GuiDiagramItemImpl();
		return guiDiagramItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiDiagramRectangle createGuiDiagramRectangle() {
		GuiDiagramRectangleImpl guiDiagramRectangle = new GuiDiagramRectangleImpl();
		return guiDiagramRectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiHtml createGuiHtml() {
		GuiHtmlImpl guiHtml = new GuiHtmlImpl();
		return guiHtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiView createGuiViewFromString(EDataType eDataType, String initialValue) {
		GuiView result = GuiView.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuiViewToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTableColumnType createGuiTableColumnTypeFromString(EDataType eDataType, String initialValue) {
		GuiTableColumnType result = GuiTableColumnType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuiTableColumnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
