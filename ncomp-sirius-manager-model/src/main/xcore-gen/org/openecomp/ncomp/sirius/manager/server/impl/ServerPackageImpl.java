
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
package org.openecomp.ncomp.sirius.manager.server.impl;

import org.openecomp.ncomp.component.ComponentPackage;
import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.core.alerts.AlertsPackage;
import org.openecomp.ncomp.core.function.FunctionPackage;
import org.openecomp.ncomp.core.logs.LogsPackage;
import org.openecomp.ncomp.core.metrics.MetricsPackage;
import org.openecomp.ncomp.sirius.manager.properties.PropertiesPackage;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerConfiguration;
import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;
import org.openecomp.ncomp.sirius.manager.server.ManagementInfo;
import org.openecomp.ncomp.sirius.manager.server.Response;
import org.openecomp.ncomp.sirius.manager.server.ResponseStatus;
import org.openecomp.ncomp.sirius.manager.server.ServerFactory;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApi;
import org.openecomp.ncomp.sirius.manager.server.SouthBoundApiWithProxy;
import org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ServerPackageImpl extends EPackageImpl implements ServerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass southBoundApiWithProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass southBoundApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managementInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractManagementServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractManagementServerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseStatusEEnum = null;

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
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServerPackageImpl() {
		super(eNS_URI, ServerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServerPackage init() {
		if (isInited) return (ServerPackage)EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI);

		// Obtain or create and register package
		ServerPackageImpl theServerPackage = (ServerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AlertsPackage.eINSTANCE.eClass();
		PropertiesPackage.eINSTANCE.eClass();
		TableTemplatePackage.eINSTANCE.eClass();
		ComponentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServerPackage.createPackageContents();

		// Initialize created meta-data
		theServerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServerPackage.eNS_URI, theServerPackage);
		return theServerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSouthBoundApiWithProxy() {
		return southBoundApiWithProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSouthBoundApiWithProxy__UploadInfo__JSONObject_EList() {
		return southBoundApiWithProxyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSouthBoundApi() {
		return southBoundApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSouthBoundApi__Logs__JSONObject_EList() {
		return southBoundApiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSouthBoundApi__Metrics__JSONObject_EList() {
		return southBoundApiEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSouthBoundApi__Properties__JSONObject_EList() {
		return southBoundApiEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementInfo() {
		return managementInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementInfo_Ip() {
		return (EAttribute)managementInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementInfo_Metrics() {
		return (EReference)managementInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementInfo_Logs() {
		return (EReference)managementInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementInfo_Props() {
		return (EReference)managementInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_Status() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponse_Message() {
		return (EAttribute)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoggerInfo() {
		return loggerInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoggerInfo_Name() {
		return (EAttribute)loggerInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractManagementServer() {
		return abstractManagementServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractManagementServer_Configuration() {
		return (EReference)abstractManagementServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractManagementServer_Component() {
		return (EReference)abstractManagementServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractManagementServer__GetValues__JSONObject_String_Long_Long_MetricValueOption_boolean() {
		return abstractManagementServerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractManagementServer__GetValuesAll__JSONObject_String_EList_Long_Long_MetricValueOption_boolean() {
		return abstractManagementServerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractManagementServer__GetMessages__JSONObject_String_Long_Long() {
		return abstractManagementServerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractManagementServer__GetRequestLogger__String_String_String_JSONObject() {
		return abstractManagementServerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractManagementServer__Evaluate__String_Function() {
		return abstractManagementServerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractManagementServer__Update__String_Function() {
		return abstractManagementServerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractManagementServerConfiguration() {
		return abstractManagementServerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractManagementServerConfiguration_Rules() {
		return (EReference)abstractManagementServerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractManagementServerConfiguration_MetricOptions() {
		return (EReference)abstractManagementServerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractManagementServerConfiguration_TableTemplates() {
		return (EReference)abstractManagementServerConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractManagementServerConfiguration_AlertTemplates() {
		return (EReference)abstractManagementServerConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractManagementServerConfiguration_Functions() {
		return (EReference)abstractManagementServerConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResponseStatus() {
		return responseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerFactory getServerFactory() {
		return (ServerFactory)getEFactoryInstance();
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
		southBoundApiWithProxyEClass = createEClass(SOUTH_BOUND_API_WITH_PROXY);
		createEOperation(southBoundApiWithProxyEClass, SOUTH_BOUND_API_WITH_PROXY___UPLOAD_INFO__JSONOBJECT_ELIST);

		southBoundApiEClass = createEClass(SOUTH_BOUND_API);
		createEOperation(southBoundApiEClass, SOUTH_BOUND_API___LOGS__JSONOBJECT_ELIST);
		createEOperation(southBoundApiEClass, SOUTH_BOUND_API___METRICS__JSONOBJECT_ELIST);
		createEOperation(southBoundApiEClass, SOUTH_BOUND_API___PROPERTIES__JSONOBJECT_ELIST);

		managementInfoEClass = createEClass(MANAGEMENT_INFO);
		createEAttribute(managementInfoEClass, MANAGEMENT_INFO__IP);
		createEReference(managementInfoEClass, MANAGEMENT_INFO__METRICS);
		createEReference(managementInfoEClass, MANAGEMENT_INFO__LOGS);
		createEReference(managementInfoEClass, MANAGEMENT_INFO__PROPS);

		responseEClass = createEClass(RESPONSE);
		createEAttribute(responseEClass, RESPONSE__STATUS);
		createEAttribute(responseEClass, RESPONSE__MESSAGE);

		loggerInfoEClass = createEClass(LOGGER_INFO);
		createEAttribute(loggerInfoEClass, LOGGER_INFO__NAME);

		abstractManagementServerEClass = createEClass(ABSTRACT_MANAGEMENT_SERVER);
		createEReference(abstractManagementServerEClass, ABSTRACT_MANAGEMENT_SERVER__CONFIGURATION);
		createEReference(abstractManagementServerEClass, ABSTRACT_MANAGEMENT_SERVER__COMPONENT);
		createEOperation(abstractManagementServerEClass, ABSTRACT_MANAGEMENT_SERVER___GET_VALUES__JSONOBJECT_STRING_LONG_LONG_METRICVALUEOPTION_BOOLEAN);
		createEOperation(abstractManagementServerEClass, ABSTRACT_MANAGEMENT_SERVER___GET_VALUES_ALL__JSONOBJECT_STRING_ELIST_LONG_LONG_METRICVALUEOPTION_BOOLEAN);
		createEOperation(abstractManagementServerEClass, ABSTRACT_MANAGEMENT_SERVER___GET_MESSAGES__JSONOBJECT_STRING_LONG_LONG);
		createEOperation(abstractManagementServerEClass, ABSTRACT_MANAGEMENT_SERVER___GET_REQUEST_LOGGER__STRING_STRING_STRING_JSONOBJECT);
		createEOperation(abstractManagementServerEClass, ABSTRACT_MANAGEMENT_SERVER___EVALUATE__STRING_FUNCTION);
		createEOperation(abstractManagementServerEClass, ABSTRACT_MANAGEMENT_SERVER___UPDATE__STRING_FUNCTION);

		abstractManagementServerConfigurationEClass = createEClass(ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION);
		createEReference(abstractManagementServerConfigurationEClass, ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__RULES);
		createEReference(abstractManagementServerConfigurationEClass, ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__METRIC_OPTIONS);
		createEReference(abstractManagementServerConfigurationEClass, ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__TABLE_TEMPLATES);
		createEReference(abstractManagementServerConfigurationEClass, ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__ALERT_TEMPLATES);
		createEReference(abstractManagementServerConfigurationEClass, ABSTRACT_MANAGEMENT_SERVER_CONFIGURATION__FUNCTIONS);

		// Create enums
		responseStatusEEnum = createEEnum(RESPONSE_STATUS);
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
		LogsPackage theLogsPackage = (LogsPackage)EPackage.Registry.INSTANCE.getEPackage(LogsPackage.eNS_URI);
		MetricsPackage theMetricsPackage = (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ComponentPackage theComponentPackage = (ComponentPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentPackage.eNS_URI);
		FunctionPackage theFunctionPackage = (FunctionPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI);
		TableTemplatePackage theTableTemplatePackage = (TableTemplatePackage)EPackage.Registry.INSTANCE.getEPackage(TableTemplatePackage.eNS_URI);
		AlertsPackage theAlertsPackage = (AlertsPackage)EPackage.Registry.INSTANCE.getEPackage(AlertsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		southBoundApiWithProxyEClass.getESuperTypes().add(this.getSouthBoundApi());
		abstractManagementServerEClass.getESuperTypes().add(this.getSouthBoundApiWithProxy());
		abstractManagementServerConfigurationEClass.getESuperTypes().add(thePropertiesPackage.getModuleContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(southBoundApiWithProxyEClass, SouthBoundApiWithProxy.class, "SouthBoundApiWithProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSouthBoundApiWithProxy__UploadInfo__JSONObject_EList(), null, "uploadInfo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getRemoteContext(), "cx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getManagementInfo(), "info", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(southBoundApiEClass, SouthBoundApi.class, "SouthBoundApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSouthBoundApi__Logs__JSONObject_EList(), null, "logs", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getRemoteContext(), "cx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theLogsPackage.getLogMessage(), "logs", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSouthBoundApi__Metrics__JSONObject_EList(), null, "metrics", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getRemoteContext(), "cx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage.getMetric(), "metrics", 0, -1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSouthBoundApi__Properties__JSONObject_EList(), null, "properties", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getRemoteContext(), "cx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePropertiesPackage.getAbstractProperty(), "l", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEClass(managementInfoEClass, ManagementInfo.class, "ManagementInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManagementInfo_Ip(), theEcorePackage.getEString(), "ip", null, 0, 1, ManagementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagementInfo_Metrics(), theMetricsPackage.getMetric(), null, "metrics", null, 0, -1, ManagementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagementInfo_Logs(), theLogsPackage.getLogMessage(), null, "logs", null, 0, -1, ManagementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManagementInfo_Props(), thePropertiesPackage.getAbstractProperty(), null, "props", null, 0, -1, ManagementInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponse_Status(), this.getResponseStatus(), "status", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResponse_Message(), theEcorePackage.getEString(), "message", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loggerInfoEClass, LoggerInfo.class, "LoggerInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoggerInfo_Name(), theEcorePackage.getEString(), "name", null, 0, 1, LoggerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractManagementServerEClass, AbstractManagementServer.class, "AbstractManagementServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractManagementServer_Configuration(), this.getAbstractManagementServerConfiguration(), null, "configuration", null, 0, 1, AbstractManagementServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractManagementServer_Component(), theComponentPackage.getComponent(), null, "component", null, 0, 1, AbstractManagementServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractManagementServer__GetValues__JSONObject_String_Long_Long_MetricValueOption_boolean(), theMetricsPackage.getDoubleMetric(), "getValues", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getRemoteContext(), "cx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELongObject(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELongObject(), "end", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage.getMetricValueOption(), "option", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "relativeInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractManagementServer__GetValuesAll__JSONObject_String_EList_Long_Long_MetricValueOption_boolean(), theMetricsPackage.getDoubleMetric(), "getValuesAll", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getRemoteContext(), "cx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "metrics", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELongObject(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELongObject(), "end", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMetricsPackage.getMetricValueOption(), "option", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "relativeInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractManagementServer__GetMessages__JSONObject_String_Long_Long(), theLogsPackage.getLogMessage(), "getMessages", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getRemoteContext(), "cx", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELongObject(), "start", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getELongObject(), "end", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractManagementServer__GetRequestLogger__String_String_String_JSONObject(), this.getLoggerInfo(), "getRequestLogger", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "userName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "action", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "resourcePath", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCorePackage.getJsonObject(), "context", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractManagementServer__Evaluate__String_Function(), theFunctionPackage.getValuePair(), "evaluate", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFunctionPackage.getFunction(), "function", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractManagementServer__Update__String_Function(), null, "update", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "path", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFunctionPackage.getFunction(), "function", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractManagementServerConfigurationEClass, AbstractManagementServerConfiguration.class, "AbstractManagementServerConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractManagementServerConfiguration_Rules(), theLogsPackage.getLogMessageRule(), null, "rules", null, 0, -1, AbstractManagementServerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractManagementServerConfiguration_MetricOptions(), theMetricsPackage.getMetricValueOption(), null, "metricOptions", null, 0, -1, AbstractManagementServerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractManagementServerConfiguration_TableTemplates(), theTableTemplatePackage.getAbstractTableTemplate(), null, "tableTemplates", null, 0, -1, AbstractManagementServerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractManagementServerConfiguration_AlertTemplates(), theAlertsPackage.getAlertingTemplate(), null, "alertTemplates", null, 0, -1, AbstractManagementServerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAbstractManagementServerConfiguration_Functions(), theFunctionPackage.getFunction(), null, "functions", null, 0, -1, AbstractManagementServerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(responseStatusEEnum, ResponseStatus.class, "ResponseStatus");
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.OK);
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.WARN);
		addEEnumLiteral(responseStatusEEnum, ResponseStatus.ERROR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org/sirius/doc
		createDocAnnotations();
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

	/**
	 * Initializes the annotations for <b>http://openecomp.org/sirius/doc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocAnnotations() {
		String source = "http://openecomp.org/sirius/doc";	
		addAnnotation
		  (getSouthBoundApi__Logs__JSONObject_EList(), 
		   source, 
		   new String[] {
			 "description", "This operation allows the clients to report log messages \r\n\tand overall state of the client"
		   });	
		addAnnotation
		  ((getSouthBoundApi__Logs__JSONObject_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "description", "This parameter is for internal use and is ignored if set by client."
		   });	
		addAnnotation
		  ((getSouthBoundApi__Logs__JSONObject_EList()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "description", "List of log message to inform the management system about."
		   });	
		addAnnotation
		  (getSouthBoundApi__Metrics__JSONObject_EList(), 
		   source, 
		   new String[] {
			 "description", "This operation allows the client VMs to report metrics \r\n\t\tand overall state of the VM"
		   });	
		addAnnotation
		  ((getSouthBoundApi__Metrics__JSONObject_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "description", "This parameter is for internal use and is ignored if set by client."
		   });	
		addAnnotation
		  (getSouthBoundApi__Properties__JSONObject_EList(), 
		   source, 
		   new String[] {
			 "description", "Used by the BSA Management Agent to report \r\n\tproperty key value pairs to the BSA Controller."
		   });	
		addAnnotation
		  ((getSouthBoundApi__Properties__JSONObject_EList()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "description", "This parameter is for internal use and is ignored if set by client."
		   });
	}

} //ServerPackageImpl
