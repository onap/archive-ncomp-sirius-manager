
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

import org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagram;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramItem;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiNamedObject;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObject;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectNamedList;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectUnNamedList;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueInteger;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueObject;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueReference;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueString;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueTimeSeries;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTable;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCell;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDate;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReferences;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellString;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumnType;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTableRow;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTree;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiView;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelFactory;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage;

import org.openecomp.ncomp.sirius.manager.graph.GraphPackage;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiClientApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTreeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiNamedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectValueIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectValueStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectValueReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectValueTimeSeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectValueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectUnNamedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiObjectNamedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTimeSerieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTimeSerieDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableCellStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableCellDoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableCellDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableCellReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiTableCellReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiDiagramItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiDiagramRectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiHtmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guiViewEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guiTableColumnTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GraphPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiClientApi() {
		return guiClientApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuiClientApi__GetTree() {
		return guiClientApiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuiClientApi__GetObject__String() {
		return guiClientApiEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuiClientApi__GetTimeSerie__String_String_String_String() {
		return guiClientApiEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuiClientApi__GetTable__String_String_String() {
		return guiClientApiEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuiClientApi__GetHtml__String_String_String() {
		return guiClientApiEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuiClientApi__GetGraph__String_String_String() {
		return guiClientApiEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTree() {
		return guiTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiTree_Sections() {
		return (EReference)guiTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTreeNode() {
		return guiTreeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTreeNode_NodeName() {
		return (EAttribute)guiTreeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTreeNode_Title() {
		return (EAttribute)guiTreeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTreeNode_Tooltip() {
		return (EAttribute)guiTreeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTreeNode_Icon() {
		return (EAttribute)guiTreeNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTreeNode_View() {
		return (EAttribute)guiTreeNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiTreeNode_Children() {
		return (EReference)guiTreeNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObject() {
		return guiObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiObject_Values() {
		return (EReference)guiObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiNamedObject() {
		return guiNamedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiNamedObject_ObjectName() {
		return (EAttribute)guiNamedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObjectValue() {
		return guiObjectValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiObjectValue_ValueName() {
		return (EAttribute)guiObjectValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiObjectValue_Tooltip() {
		return (EAttribute)guiObjectValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObjectValueInteger() {
		return guiObjectValueIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiObjectValueInteger_I() {
		return (EAttribute)guiObjectValueIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObjectValueString() {
		return guiObjectValueStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiObjectValueString_V() {
		return (EAttribute)guiObjectValueStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObjectValueReference() {
		return guiObjectValueReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiObjectValueReference_Path() {
		return (EAttribute)guiObjectValueReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObjectValueTimeSeries() {
		return guiObjectValueTimeSeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiObjectValueTimeSeries_Path() {
		return (EAttribute)guiObjectValueTimeSeriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObjectValueObject() {
		return guiObjectValueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiObjectValueObject_V() {
		return (EReference)guiObjectValueObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObjectUnNamedList() {
		return guiObjectUnNamedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiObjectUnNamedList_Objects() {
		return (EReference)guiObjectUnNamedListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiObjectNamedList() {
		return guiObjectNamedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiObjectNamedList_Objects() {
		return (EReference)guiObjectNamedListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTimeSerie() {
		return guiTimeSerieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerie_Name() {
		return (EAttribute)guiTimeSerieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerie_XAxisLabel() {
		return (EAttribute)guiTimeSerieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerie_XAxisDateFormat() {
		return (EAttribute)guiTimeSerieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerie_YAxisLabel() {
		return (EAttribute)guiTimeSerieEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerie_Start() {
		return (EAttribute)guiTimeSerieEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerie_End() {
		return (EAttribute)guiTimeSerieEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerie_IsRate() {
		return (EAttribute)guiTimeSerieEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiTimeSerie_Data() {
		return (EReference)guiTimeSerieEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTimeSerieData() {
		return guiTimeSerieDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerieData_Time() {
		return (EAttribute)guiTimeSerieDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerieData_Value() {
		return (EAttribute)guiTimeSerieDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerieData_Max() {
		return (EAttribute)guiTimeSerieDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerieData_Min() {
		return (EAttribute)guiTimeSerieDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTimeSerieData_Num() {
		return (EAttribute)guiTimeSerieDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTable() {
		return guiTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiTable_Columns() {
		return (EReference)guiTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiTable_Rows() {
		return (EReference)guiTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTableColumn() {
		return guiTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableColumn_ColName() {
		return (EAttribute)guiTableColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableColumn_Tooltip() {
		return (EAttribute)guiTableColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableColumn_Format() {
		return (EAttribute)guiTableColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableColumn_Width() {
		return (EAttribute)guiTableColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableColumn_Hidden() {
		return (EAttribute)guiTableColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableColumn_ColumnType() {
		return (EAttribute)guiTableColumnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTableRow() {
		return guiTableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiTableRow_Cells() {
		return (EReference)guiTableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTableCell() {
		return guiTableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableCell_Tooltip() {
		return (EAttribute)guiTableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTableCellString() {
		return guiTableCellStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableCellString_Value() {
		return (EAttribute)guiTableCellStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTableCellDouble() {
		return guiTableCellDoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableCellDouble_Value() {
		return (EAttribute)guiTableCellDoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableCellDouble_TimeseriesPath() {
		return (EAttribute)guiTableCellDoubleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTableCellDate() {
		return guiTableCellDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableCellDate_Value() {
		return (EAttribute)guiTableCellDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTableCellReferences() {
		return guiTableCellReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiTableCellReferences_Refs() {
		return (EReference)guiTableCellReferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiTableCellReference() {
		return guiTableCellReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableCellReference_Label() {
		return (EAttribute)guiTableCellReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiTableCellReference_Path() {
		return (EAttribute)guiTableCellReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiDiagram() {
		return guiDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuiDiagram_Items() {
		return (EReference)guiDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiDiagramItem() {
		return guiDiagramItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiDiagramItem_Tooltip() {
		return (EAttribute)guiDiagramItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiDiagramRectangle() {
		return guiDiagramRectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiDiagramRectangle_X() {
		return (EAttribute)guiDiagramRectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiDiagramRectangle_Y() {
		return (EAttribute)guiDiagramRectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiDiagramRectangle_H() {
		return (EAttribute)guiDiagramRectangleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiDiagramRectangle_W() {
		return (EAttribute)guiDiagramRectangleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiHtml() {
		return guiHtmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiHtml_Html() {
		return (EAttribute)guiHtmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuiView() {
		return guiViewEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuiTableColumnType() {
		return guiTableColumnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		guiClientApiEClass = createEClass(GUI_CLIENT_API);
		createEOperation(guiClientApiEClass, GUI_CLIENT_API___GET_TREE);
		createEOperation(guiClientApiEClass, GUI_CLIENT_API___GET_OBJECT__STRING);
		createEOperation(guiClientApiEClass, GUI_CLIENT_API___GET_TIME_SERIE__STRING_STRING_STRING_STRING);
		createEOperation(guiClientApiEClass, GUI_CLIENT_API___GET_TABLE__STRING_STRING_STRING);
		createEOperation(guiClientApiEClass, GUI_CLIENT_API___GET_HTML__STRING_STRING_STRING);
		createEOperation(guiClientApiEClass, GUI_CLIENT_API___GET_GRAPH__STRING_STRING_STRING);

		guiTreeEClass = createEClass(GUI_TREE);
		createEReference(guiTreeEClass, GUI_TREE__SECTIONS);

		guiTreeNodeEClass = createEClass(GUI_TREE_NODE);
		createEAttribute(guiTreeNodeEClass, GUI_TREE_NODE__NODE_NAME);
		createEAttribute(guiTreeNodeEClass, GUI_TREE_NODE__TITLE);
		createEAttribute(guiTreeNodeEClass, GUI_TREE_NODE__TOOLTIP);
		createEAttribute(guiTreeNodeEClass, GUI_TREE_NODE__ICON);
		createEAttribute(guiTreeNodeEClass, GUI_TREE_NODE__VIEW);
		createEReference(guiTreeNodeEClass, GUI_TREE_NODE__CHILDREN);

		guiObjectEClass = createEClass(GUI_OBJECT);
		createEReference(guiObjectEClass, GUI_OBJECT__VALUES);

		guiNamedObjectEClass = createEClass(GUI_NAMED_OBJECT);
		createEAttribute(guiNamedObjectEClass, GUI_NAMED_OBJECT__OBJECT_NAME);

		guiObjectValueEClass = createEClass(GUI_OBJECT_VALUE);
		createEAttribute(guiObjectValueEClass, GUI_OBJECT_VALUE__VALUE_NAME);
		createEAttribute(guiObjectValueEClass, GUI_OBJECT_VALUE__TOOLTIP);

		guiObjectValueIntegerEClass = createEClass(GUI_OBJECT_VALUE_INTEGER);
		createEAttribute(guiObjectValueIntegerEClass, GUI_OBJECT_VALUE_INTEGER__I);

		guiObjectValueStringEClass = createEClass(GUI_OBJECT_VALUE_STRING);
		createEAttribute(guiObjectValueStringEClass, GUI_OBJECT_VALUE_STRING__V);

		guiObjectValueReferenceEClass = createEClass(GUI_OBJECT_VALUE_REFERENCE);
		createEAttribute(guiObjectValueReferenceEClass, GUI_OBJECT_VALUE_REFERENCE__PATH);

		guiObjectValueTimeSeriesEClass = createEClass(GUI_OBJECT_VALUE_TIME_SERIES);
		createEAttribute(guiObjectValueTimeSeriesEClass, GUI_OBJECT_VALUE_TIME_SERIES__PATH);

		guiObjectValueObjectEClass = createEClass(GUI_OBJECT_VALUE_OBJECT);
		createEReference(guiObjectValueObjectEClass, GUI_OBJECT_VALUE_OBJECT__V);

		guiObjectUnNamedListEClass = createEClass(GUI_OBJECT_UN_NAMED_LIST);
		createEReference(guiObjectUnNamedListEClass, GUI_OBJECT_UN_NAMED_LIST__OBJECTS);

		guiObjectNamedListEClass = createEClass(GUI_OBJECT_NAMED_LIST);
		createEReference(guiObjectNamedListEClass, GUI_OBJECT_NAMED_LIST__OBJECTS);

		guiTimeSerieEClass = createEClass(GUI_TIME_SERIE);
		createEAttribute(guiTimeSerieEClass, GUI_TIME_SERIE__NAME);
		createEAttribute(guiTimeSerieEClass, GUI_TIME_SERIE__XAXIS_LABEL);
		createEAttribute(guiTimeSerieEClass, GUI_TIME_SERIE__XAXIS_DATE_FORMAT);
		createEAttribute(guiTimeSerieEClass, GUI_TIME_SERIE__YAXIS_LABEL);
		createEAttribute(guiTimeSerieEClass, GUI_TIME_SERIE__START);
		createEAttribute(guiTimeSerieEClass, GUI_TIME_SERIE__END);
		createEAttribute(guiTimeSerieEClass, GUI_TIME_SERIE__IS_RATE);
		createEReference(guiTimeSerieEClass, GUI_TIME_SERIE__DATA);

		guiTimeSerieDataEClass = createEClass(GUI_TIME_SERIE_DATA);
		createEAttribute(guiTimeSerieDataEClass, GUI_TIME_SERIE_DATA__TIME);
		createEAttribute(guiTimeSerieDataEClass, GUI_TIME_SERIE_DATA__VALUE);
		createEAttribute(guiTimeSerieDataEClass, GUI_TIME_SERIE_DATA__MAX);
		createEAttribute(guiTimeSerieDataEClass, GUI_TIME_SERIE_DATA__MIN);
		createEAttribute(guiTimeSerieDataEClass, GUI_TIME_SERIE_DATA__NUM);

		guiTableEClass = createEClass(GUI_TABLE);
		createEReference(guiTableEClass, GUI_TABLE__COLUMNS);
		createEReference(guiTableEClass, GUI_TABLE__ROWS);

		guiTableColumnEClass = createEClass(GUI_TABLE_COLUMN);
		createEAttribute(guiTableColumnEClass, GUI_TABLE_COLUMN__COL_NAME);
		createEAttribute(guiTableColumnEClass, GUI_TABLE_COLUMN__TOOLTIP);
		createEAttribute(guiTableColumnEClass, GUI_TABLE_COLUMN__FORMAT);
		createEAttribute(guiTableColumnEClass, GUI_TABLE_COLUMN__WIDTH);
		createEAttribute(guiTableColumnEClass, GUI_TABLE_COLUMN__HIDDEN);
		createEAttribute(guiTableColumnEClass, GUI_TABLE_COLUMN__COLUMN_TYPE);

		guiTableRowEClass = createEClass(GUI_TABLE_ROW);
		createEReference(guiTableRowEClass, GUI_TABLE_ROW__CELLS);

		guiTableCellEClass = createEClass(GUI_TABLE_CELL);
		createEAttribute(guiTableCellEClass, GUI_TABLE_CELL__TOOLTIP);

		guiTableCellStringEClass = createEClass(GUI_TABLE_CELL_STRING);
		createEAttribute(guiTableCellStringEClass, GUI_TABLE_CELL_STRING__VALUE);

		guiTableCellDoubleEClass = createEClass(GUI_TABLE_CELL_DOUBLE);
		createEAttribute(guiTableCellDoubleEClass, GUI_TABLE_CELL_DOUBLE__VALUE);
		createEAttribute(guiTableCellDoubleEClass, GUI_TABLE_CELL_DOUBLE__TIMESERIES_PATH);

		guiTableCellDateEClass = createEClass(GUI_TABLE_CELL_DATE);
		createEAttribute(guiTableCellDateEClass, GUI_TABLE_CELL_DATE__VALUE);

		guiTableCellReferencesEClass = createEClass(GUI_TABLE_CELL_REFERENCES);
		createEReference(guiTableCellReferencesEClass, GUI_TABLE_CELL_REFERENCES__REFS);

		guiTableCellReferenceEClass = createEClass(GUI_TABLE_CELL_REFERENCE);
		createEAttribute(guiTableCellReferenceEClass, GUI_TABLE_CELL_REFERENCE__LABEL);
		createEAttribute(guiTableCellReferenceEClass, GUI_TABLE_CELL_REFERENCE__PATH);

		guiDiagramEClass = createEClass(GUI_DIAGRAM);
		createEReference(guiDiagramEClass, GUI_DIAGRAM__ITEMS);

		guiDiagramItemEClass = createEClass(GUI_DIAGRAM_ITEM);
		createEAttribute(guiDiagramItemEClass, GUI_DIAGRAM_ITEM__TOOLTIP);

		guiDiagramRectangleEClass = createEClass(GUI_DIAGRAM_RECTANGLE);
		createEAttribute(guiDiagramRectangleEClass, GUI_DIAGRAM_RECTANGLE__X);
		createEAttribute(guiDiagramRectangleEClass, GUI_DIAGRAM_RECTANGLE__Y);
		createEAttribute(guiDiagramRectangleEClass, GUI_DIAGRAM_RECTANGLE__H);
		createEAttribute(guiDiagramRectangleEClass, GUI_DIAGRAM_RECTANGLE__W);

		guiHtmlEClass = createEClass(GUI_HTML);
		createEAttribute(guiHtmlEClass, GUI_HTML__HTML);

		// Create enums
		guiViewEEnum = createEEnum(GUI_VIEW);
		guiTableColumnTypeEEnum = createEEnum(GUI_TABLE_COLUMN_TYPE);

		// Create data types
		dateEDataType = createEDataType(DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guiNamedObjectEClass.getESuperTypes().add(this.getGuiObject());
		guiObjectValueIntegerEClass.getESuperTypes().add(this.getGuiObjectValue());
		guiObjectValueStringEClass.getESuperTypes().add(this.getGuiObjectValue());
		guiObjectValueReferenceEClass.getESuperTypes().add(this.getGuiObjectValueString());
		guiObjectValueTimeSeriesEClass.getESuperTypes().add(this.getGuiObjectValueString());
		guiObjectValueObjectEClass.getESuperTypes().add(this.getGuiObjectValue());
		guiObjectUnNamedListEClass.getESuperTypes().add(this.getGuiObjectValue());
		guiObjectNamedListEClass.getESuperTypes().add(this.getGuiObjectValue());
		guiTableCellStringEClass.getESuperTypes().add(this.getGuiTableCell());
		guiTableCellDoubleEClass.getESuperTypes().add(this.getGuiTableCell());
		guiTableCellDateEClass.getESuperTypes().add(this.getGuiTableCell());
		guiTableCellReferencesEClass.getESuperTypes().add(this.getGuiTableCell());
		guiDiagramRectangleEClass.getESuperTypes().add(this.getGuiDiagramItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(guiClientApiEClass, GuiClientApi.class, "GuiClientApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGuiClientApi__GetTree(), this.getGuiTree(), "getTree", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGuiClientApi__GetObject__String(), this.getGuiObject(), "getObject", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGuiClientApi__GetTimeSerie__String_String_String_String(), this.getGuiTimeSerie(), "getTimeSerie", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "end", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "duration", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGuiClientApi__GetTable__String_String_String(), this.getGuiTable(), "getTable", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "end", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGuiClientApi__GetHtml__String_String_String(), this.getGuiHtml(), "getHtml", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "end", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGuiClientApi__GetGraph__String_String_String(), theGraphPackage.getGuiGraph(), "getGraph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "end", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(guiTreeEClass, GuiTree.class, "GuiTree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiTree_Sections(), this.getGuiTreeNode(), null, "sections", null, 0, -1, GuiTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTreeNodeEClass, GuiTreeNode.class, "GuiTreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTreeNode_NodeName(), theEcorePackage.getEString(), "nodeName", null, 0, 1, GuiTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTreeNode_Title(), theEcorePackage.getEString(), "title", null, 0, 1, GuiTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTreeNode_Tooltip(), theEcorePackage.getEString(), "tooltip", null, 0, 1, GuiTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTreeNode_Icon(), theEcorePackage.getEString(), "icon", null, 0, 1, GuiTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTreeNode_View(), this.getGuiView(), "view", null, 0, 1, GuiTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiTreeNode_Children(), this.getGuiTreeNode(), null, "children", null, 0, -1, GuiTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectEClass, GuiObject.class, "GuiObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiObject_Values(), this.getGuiObjectValue(), null, "values", null, 0, -1, GuiObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiNamedObjectEClass, GuiNamedObject.class, "GuiNamedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiNamedObject_ObjectName(), theEcorePackage.getEString(), "objectName", null, 0, 1, GuiNamedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectValueEClass, GuiObjectValue.class, "GuiObjectValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiObjectValue_ValueName(), theEcorePackage.getEString(), "valueName", null, 0, 1, GuiObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiObjectValue_Tooltip(), theEcorePackage.getEString(), "tooltip", null, 0, 1, GuiObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectValueIntegerEClass, GuiObjectValueInteger.class, "GuiObjectValueInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiObjectValueInteger_I(), theEcorePackage.getEInt(), "i", null, 0, 1, GuiObjectValueInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectValueStringEClass, GuiObjectValueString.class, "GuiObjectValueString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiObjectValueString_V(), theEcorePackage.getEString(), "v", null, 0, 1, GuiObjectValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectValueReferenceEClass, GuiObjectValueReference.class, "GuiObjectValueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiObjectValueReference_Path(), theEcorePackage.getEString(), "path", null, 0, 1, GuiObjectValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectValueTimeSeriesEClass, GuiObjectValueTimeSeries.class, "GuiObjectValueTimeSeries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiObjectValueTimeSeries_Path(), theEcorePackage.getEString(), "path", null, 0, 1, GuiObjectValueTimeSeries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectValueObjectEClass, GuiObjectValueObject.class, "GuiObjectValueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiObjectValueObject_V(), this.getGuiObject(), null, "v", null, 0, 1, GuiObjectValueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectUnNamedListEClass, GuiObjectUnNamedList.class, "GuiObjectUnNamedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiObjectUnNamedList_Objects(), this.getGuiObject(), null, "objects", null, 0, -1, GuiObjectUnNamedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiObjectNamedListEClass, GuiObjectNamedList.class, "GuiObjectNamedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiObjectNamedList_Objects(), this.getGuiNamedObject(), null, "objects", null, 0, -1, GuiObjectNamedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTimeSerieEClass, GuiTimeSerie.class, "GuiTimeSerie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTimeSerie_Name(), theEcorePackage.getEString(), "name", null, 0, 1, GuiTimeSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerie_XAxisLabel(), theEcorePackage.getEString(), "xAxisLabel", null, 0, 1, GuiTimeSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerie_XAxisDateFormat(), theEcorePackage.getEString(), "xAxisDateFormat", "MM-dd HH:mm", 0, 1, GuiTimeSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerie_YAxisLabel(), theEcorePackage.getEString(), "yAxisLabel", null, 0, 1, GuiTimeSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerie_Start(), this.getDate(), "start", null, 0, 1, GuiTimeSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerie_End(), this.getDate(), "end", null, 0, 1, GuiTimeSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerie_IsRate(), theEcorePackage.getEBoolean(), "isRate", null, 0, 1, GuiTimeSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiTimeSerie_Data(), this.getGuiTimeSerieData(), null, "data", null, 0, -1, GuiTimeSerie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTimeSerieDataEClass, GuiTimeSerieData.class, "GuiTimeSerieData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTimeSerieData_Time(), this.getDate(), "time", null, 0, 1, GuiTimeSerieData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerieData_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1, GuiTimeSerieData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerieData_Max(), theEcorePackage.getEDoubleObject(), "max", null, 0, 1, GuiTimeSerieData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerieData_Min(), theEcorePackage.getEDoubleObject(), "min", null, 0, 1, GuiTimeSerieData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTimeSerieData_Num(), theEcorePackage.getEInt(), "num", null, 0, 1, GuiTimeSerieData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableEClass, GuiTable.class, "GuiTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiTable_Columns(), this.getGuiTableColumn(), null, "columns", null, 0, -1, GuiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGuiTable_Rows(), this.getGuiTableRow(), null, "rows", null, 0, -1, GuiTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableColumnEClass, GuiTableColumn.class, "GuiTableColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTableColumn_ColName(), theEcorePackage.getEString(), "colName", null, 0, 1, GuiTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTableColumn_Tooltip(), theEcorePackage.getEString(), "tooltip", null, 0, 1, GuiTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTableColumn_Format(), theEcorePackage.getEString(), "format", null, 0, 1, GuiTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTableColumn_Width(), theEcorePackage.getEInt(), "width", "0", 0, 1, GuiTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTableColumn_Hidden(), theEcorePackage.getEBoolean(), "hidden", "false", 0, 1, GuiTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTableColumn_ColumnType(), this.getGuiTableColumnType(), "columnType", null, 0, 1, GuiTableColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableRowEClass, GuiTableRow.class, "GuiTableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiTableRow_Cells(), this.getGuiTableCell(), null, "cells", null, 0, -1, GuiTableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableCellEClass, GuiTableCell.class, "GuiTableCell", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTableCell_Tooltip(), theEcorePackage.getEString(), "tooltip", null, 0, 1, GuiTableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableCellStringEClass, GuiTableCellString.class, "GuiTableCellString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTableCellString_Value(), theEcorePackage.getEString(), "value", null, 0, 1, GuiTableCellString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableCellDoubleEClass, GuiTableCellDouble.class, "GuiTableCellDouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTableCellDouble_Value(), theEcorePackage.getEDouble(), "value", null, 0, 1, GuiTableCellDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTableCellDouble_TimeseriesPath(), theEcorePackage.getEString(), "timeseriesPath", null, 0, 1, GuiTableCellDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableCellDateEClass, GuiTableCellDate.class, "GuiTableCellDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTableCellDate_Value(), this.getDate(), "value", null, 0, 1, GuiTableCellDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableCellReferencesEClass, GuiTableCellReferences.class, "GuiTableCellReferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiTableCellReferences_Refs(), this.getGuiTableCellReference(), null, "refs", null, 0, -1, GuiTableCellReferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiTableCellReferenceEClass, GuiTableCellReference.class, "GuiTableCellReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiTableCellReference_Label(), theEcorePackage.getEString(), "label", null, 0, 1, GuiTableCellReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiTableCellReference_Path(), theEcorePackage.getEString(), "path", null, 0, 1, GuiTableCellReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiDiagramEClass, GuiDiagram.class, "GuiDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuiDiagram_Items(), this.getGuiDiagramItem(), null, "items", null, 0, -1, GuiDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiDiagramItemEClass, GuiDiagramItem.class, "GuiDiagramItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiDiagramItem_Tooltip(), theEcorePackage.getEString(), "tooltip", null, 0, 1, GuiDiagramItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiDiagramRectangleEClass, GuiDiagramRectangle.class, "GuiDiagramRectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiDiagramRectangle_X(), theEcorePackage.getEInt(), "x", null, 0, 1, GuiDiagramRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiDiagramRectangle_Y(), theEcorePackage.getEInt(), "y", null, 0, 1, GuiDiagramRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiDiagramRectangle_H(), theEcorePackage.getEInt(), "h", null, 0, 1, GuiDiagramRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiDiagramRectangle_W(), theEcorePackage.getEInt(), "w", null, 0, 1, GuiDiagramRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guiHtmlEClass, GuiHtml.class, "GuiHtml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiHtml_Html(), theEcorePackage.getEString(), "html", null, 0, 1, GuiHtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(guiViewEEnum, GuiView.class, "GuiView");
		addEEnumLiteral(guiViewEEnum, GuiView.NONE);
		addEEnumLiteral(guiViewEEnum, GuiView.OBJECT);
		addEEnumLiteral(guiViewEEnum, GuiView.TIMESERIES);
		addEEnumLiteral(guiViewEEnum, GuiView.BIRTREPORT);
		addEEnumLiteral(guiViewEEnum, GuiView.HTML);
		addEEnumLiteral(guiViewEEnum, GuiView.TABLE);

		initEEnum(guiTableColumnTypeEEnum, GuiTableColumnType.class, "GuiTableColumnType");
		addEEnumLiteral(guiTableColumnTypeEEnum, GuiTableColumnType.STRING);
		addEEnumLiteral(guiTableColumnTypeEEnum, GuiTableColumnType.DOUBLE);
		addEEnumLiteral(guiTableColumnTypeEEnum, GuiTableColumnType.DATE);
		addEEnumLiteral(guiTableColumnTypeEEnum, GuiTableColumnType.REF_LIST);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "GenModel", "http://www.eclipse.org/emf/2002/GenModel"
		   });
	}

} //ModelPackageImpl
