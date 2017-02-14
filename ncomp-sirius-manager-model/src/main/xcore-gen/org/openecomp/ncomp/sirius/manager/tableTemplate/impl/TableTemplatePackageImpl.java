
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

import org.openecomp.ncomp.core.CorePackage;

import org.openecomp.ncomp.core.function.FunctionPackage;

import org.openecomp.ncomp.core.logs.LogsPackage;

import org.openecomp.ncomp.core.metrics.MetricsPackage;

import org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.HasColumnsTableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateAttributeColumn;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateColumn;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateFactory;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TimeTableTemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class TableTemplatePackageImpl extends EPackageImpl implements TableTemplatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTableTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasColumnsTableTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logTableTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorTableTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTableTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTemplateColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTemplateAttributeColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTemplateMetricColumnEClass = null;

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
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TableTemplatePackageImpl() {
		super(eNS_URI, TableTemplateFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TableTemplatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TableTemplatePackage init() {
		if (isInited) return (TableTemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TableTemplatePackage.eNS_URI);

		// Obtain or create and register package
		TableTemplatePackageImpl theTableTemplatePackage = (TableTemplatePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TableTemplatePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TableTemplatePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LogsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTableTemplatePackage.createPackageContents();

		// Initialize created meta-data
		theTableTemplatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTableTemplatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TableTemplatePackage.eNS_URI, theTableTemplatePackage);
		return theTableTemplatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTableTemplate() {
		return abstractTableTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTableTemplate_TreePath() {
		return (EAttribute)abstractTableTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTableTemplate_TablePath() {
		return (EAttribute)abstractTableTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasColumnsTableTemplate() {
		return hasColumnsTableTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHasColumnsTableTemplate_Columns() {
		return (EReference)hasColumnsTableTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogTableTemplate() {
		return logTableTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogTableTemplate_MinLevel() {
		return (EAttribute)logTableTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogTableTemplate_MinSeverity() {
		return (EAttribute)logTableTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogTableTemplate_PrefixResourcePath() {
		return (EAttribute)logTableTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogTableTemplate_Duration() {
		return (EAttribute)logTableTemplateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogTableTemplate_AggregationDuration() {
		return (EAttribute)logTableTemplateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableTemplate() {
		return tableTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableTemplate_RowPath() {
		return (EAttribute)tableTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIteratorTableTemplate() {
		return iteratorTableTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIteratorTableTemplate_Iterator() {
		return (EReference)iteratorTableTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTableTemplate() {
		return timeTableTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTableTemplate_Duration() {
		return (EAttribute)timeTableTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableTemplateColumn() {
		return tableTemplateColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableTemplateAttributeColumn() {
		return tableTemplateAttributeColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableTemplateAttributeColumn_Path() {
		return (EAttribute)tableTemplateAttributeColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableTemplateMetricColumn() {
		return tableTemplateMetricColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableTemplateMetricColumn_Path() {
		return (EAttribute)tableTemplateMetricColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableTemplateMetricColumn_Option() {
		return (EReference)tableTemplateMetricColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableTemplateFactory getTableTemplateFactory() {
		return (TableTemplateFactory)getEFactoryInstance();
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
		abstractTableTemplateEClass = createEClass(ABSTRACT_TABLE_TEMPLATE);
		createEAttribute(abstractTableTemplateEClass, ABSTRACT_TABLE_TEMPLATE__TREE_PATH);
		createEAttribute(abstractTableTemplateEClass, ABSTRACT_TABLE_TEMPLATE__TABLE_PATH);

		hasColumnsTableTemplateEClass = createEClass(HAS_COLUMNS_TABLE_TEMPLATE);
		createEReference(hasColumnsTableTemplateEClass, HAS_COLUMNS_TABLE_TEMPLATE__COLUMNS);

		logTableTemplateEClass = createEClass(LOG_TABLE_TEMPLATE);
		createEAttribute(logTableTemplateEClass, LOG_TABLE_TEMPLATE__MIN_LEVEL);
		createEAttribute(logTableTemplateEClass, LOG_TABLE_TEMPLATE__MIN_SEVERITY);
		createEAttribute(logTableTemplateEClass, LOG_TABLE_TEMPLATE__PREFIX_RESOURCE_PATH);
		createEAttribute(logTableTemplateEClass, LOG_TABLE_TEMPLATE__DURATION);
		createEAttribute(logTableTemplateEClass, LOG_TABLE_TEMPLATE__AGGREGATION_DURATION);

		tableTemplateEClass = createEClass(TABLE_TEMPLATE);
		createEAttribute(tableTemplateEClass, TABLE_TEMPLATE__ROW_PATH);

		iteratorTableTemplateEClass = createEClass(ITERATOR_TABLE_TEMPLATE);
		createEReference(iteratorTableTemplateEClass, ITERATOR_TABLE_TEMPLATE__ITERATOR);

		timeTableTemplateEClass = createEClass(TIME_TABLE_TEMPLATE);
		createEAttribute(timeTableTemplateEClass, TIME_TABLE_TEMPLATE__DURATION);

		tableTemplateColumnEClass = createEClass(TABLE_TEMPLATE_COLUMN);

		tableTemplateAttributeColumnEClass = createEClass(TABLE_TEMPLATE_ATTRIBUTE_COLUMN);
		createEAttribute(tableTemplateAttributeColumnEClass, TABLE_TEMPLATE_ATTRIBUTE_COLUMN__PATH);

		tableTemplateMetricColumnEClass = createEClass(TABLE_TEMPLATE_METRIC_COLUMN);
		createEAttribute(tableTemplateMetricColumnEClass, TABLE_TEMPLATE_METRIC_COLUMN__PATH);
		createEReference(tableTemplateMetricColumnEClass, TABLE_TEMPLATE_METRIC_COLUMN__OPTION);
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
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		LogsPackage theLogsPackage = (LogsPackage)EPackage.Registry.INSTANCE.getEPackage(LogsPackage.eNS_URI);
		FunctionPackage theFunctionPackage = (FunctionPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractTableTemplateEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		logTableTemplateEClass.getESuperTypes().add(this.getAbstractTableTemplate());
		tableTemplateEClass.getESuperTypes().add(this.getAbstractTableTemplate());
		tableTemplateEClass.getESuperTypes().add(this.getHasColumnsTableTemplate());
		iteratorTableTemplateEClass.getESuperTypes().add(this.getAbstractTableTemplate());
		iteratorTableTemplateEClass.getESuperTypes().add(this.getHasColumnsTableTemplate());
		timeTableTemplateEClass.getESuperTypes().add(this.getTableTemplate());
		tableTemplateColumnEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		tableTemplateAttributeColumnEClass.getESuperTypes().add(this.getTableTemplateColumn());
		tableTemplateMetricColumnEClass.getESuperTypes().add(this.getTableTemplateColumn());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractTableTemplateEClass, AbstractTableTemplate.class, "AbstractTableTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractTableTemplate_TreePath(), theEcorePackage.getEString(), "treePath", null, 0, 1, AbstractTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractTableTemplate_TablePath(), theEcorePackage.getEString(), "tablePath", null, 0, 1, AbstractTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hasColumnsTableTemplateEClass, HasColumnsTableTemplate.class, "HasColumnsTableTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHasColumnsTableTemplate_Columns(), this.getTableTemplateColumn(), null, "columns", null, 0, -1, HasColumnsTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logTableTemplateEClass, LogTableTemplate.class, "LogTableTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogTableTemplate_MinLevel(), theLogsPackage.getLogLevel(), "minLevel", null, 0, 1, LogTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogTableTemplate_MinSeverity(), theLogsPackage.getLogSeverity(), "minSeverity", null, 0, 1, LogTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogTableTemplate_PrefixResourcePath(), theEcorePackage.getEString(), "prefixResourcePath", null, 0, 1, LogTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogTableTemplate_Duration(), theEcorePackage.getEString(), "duration", null, 0, 1, LogTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogTableTemplate_AggregationDuration(), theEcorePackage.getEString(), "aggregationDuration", null, 0, 1, LogTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTemplateEClass, TableTemplate.class, "TableTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableTemplate_RowPath(), theEcorePackage.getEString(), "rowPath", null, 0, 1, TableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iteratorTableTemplateEClass, IteratorTableTemplate.class, "IteratorTableTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIteratorTableTemplate_Iterator(), theFunctionPackage.getIterator(), null, "iterator", null, 0, 1, IteratorTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTableTemplateEClass, TimeTableTemplate.class, "TimeTableTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeTableTemplate_Duration(), theEcorePackage.getEString(), "duration", null, 0, 1, TimeTableTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTemplateColumnEClass, TableTemplateColumn.class, "TableTemplateColumn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableTemplateAttributeColumnEClass, TableTemplateAttributeColumn.class, "TableTemplateAttributeColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableTemplateAttributeColumn_Path(), theEcorePackage.getEString(), "path", null, 0, 1, TableTemplateAttributeColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTemplateMetricColumnEClass, TableTemplateMetricColumn.class, "TableTemplateMetricColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableTemplateMetricColumn_Path(), theEcorePackage.getEString(), "path", null, 0, 1, TableTemplateMetricColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableTemplateMetricColumn_Option(), theMetricsPackage.getMetricValueOption(), null, "option", null, 0, 1, TableTemplateMetricColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			 "doc", "http://openecomp.org/sirius/doc"
		   });
	}

} //TableTemplatePackageImpl
