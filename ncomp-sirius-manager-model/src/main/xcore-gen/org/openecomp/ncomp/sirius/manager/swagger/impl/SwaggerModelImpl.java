
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
package org.openecomp.ncomp.sirius.manager.swagger.impl;

import org.openecomp.ncomp.sirius.manager.swagger.SwaggerExternalDocumentation;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerInfo;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerSecurityDefinition;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerModelImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwaggerModelImpl extends MinimalEObjectImpl.Container implements SwaggerModel {
	/**
	 * The default value of the '{@link #getSwagger() <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwagger()
	 * @generated
	 * @ordered
	 */
	protected static final String SWAGGER_EDEFAULT = "2.0";

	/**
	 * The cached value of the '{@link #getSwagger() <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwagger()
	 * @generated
	 * @ordered
	 */
	protected String swagger = SWAGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected SwaggerInfo info;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<SwaggerTag> tags;

	/**
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> schemes;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<SwaggerPath> paths;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<SwaggerNamedObjectType> definitions;

	/**
	 * The cached value of the '{@link #getExternalDocs() <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocs()
	 * @generated
	 * @ordered
	 */
	protected SwaggerExternalDocumentation externalDocs;

	/**
	 * The cached value of the '{@link #getSecurityDefinitions() <em>Security Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<SwaggerSecurityDefinition> securityDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwaggerModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwaggerPackage.Literals.SWAGGER_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwagger() {
		return swagger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwagger(String newSwagger) {
		String oldSwagger = swagger;
		swagger = newSwagger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_MODEL__SWAGGER, oldSwagger, swagger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerInfo getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(SwaggerInfo newInfo, NotificationChain msgs) {
		SwaggerInfo oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_MODEL__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(SwaggerInfo newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwaggerPackage.SWAGGER_MODEL__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwaggerPackage.SWAGGER_MODEL__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_MODEL__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_MODEL__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_MODEL__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwaggerTag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<SwaggerTag>(SwaggerTag.class, this, SwaggerPackage.SWAGGER_MODEL__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeEList<String>(String.class, this, SwaggerPackage.SWAGGER_MODEL__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwaggerPath> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<SwaggerPath>(SwaggerPath.class, this, SwaggerPackage.SWAGGER_MODEL__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwaggerNamedObjectType> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<SwaggerNamedObjectType>(SwaggerNamedObjectType.class, this, SwaggerPackage.SWAGGER_MODEL__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerExternalDocumentation getExternalDocs() {
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDocs(SwaggerExternalDocumentation newExternalDocs, NotificationChain msgs) {
		SwaggerExternalDocumentation oldExternalDocs = externalDocs;
		externalDocs = newExternalDocs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDocs(SwaggerExternalDocumentation newExternalDocs) {
		if (newExternalDocs != externalDocs) {
			NotificationChain msgs = null;
			if (externalDocs != null)
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwaggerSecurityDefinition> getSecurityDefinitions() {
		if (securityDefinitions == null) {
			securityDefinitions = new EObjectContainmentEList<SwaggerSecurityDefinition>(SwaggerSecurityDefinition.class, this, SwaggerPackage.SWAGGER_MODEL__SECURITY_DEFINITIONS);
		}
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwaggerPackage.SWAGGER_MODEL__INFO:
				return basicSetInfo(null, msgs);
			case SwaggerPackage.SWAGGER_MODEL__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case SwaggerPackage.SWAGGER_MODEL__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case SwaggerPackage.SWAGGER_MODEL__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case SwaggerPackage.SWAGGER_MODEL__SECURITY_DEFINITIONS:
				return ((InternalEList<?>)getSecurityDefinitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SwaggerPackage.SWAGGER_MODEL__SWAGGER:
				return getSwagger();
			case SwaggerPackage.SWAGGER_MODEL__INFO:
				return getInfo();
			case SwaggerPackage.SWAGGER_MODEL__HOST:
				return getHost();
			case SwaggerPackage.SWAGGER_MODEL__BASE_PATH:
				return getBasePath();
			case SwaggerPackage.SWAGGER_MODEL__TAGS:
				return getTags();
			case SwaggerPackage.SWAGGER_MODEL__SCHEMES:
				return getSchemes();
			case SwaggerPackage.SWAGGER_MODEL__PATHS:
				return getPaths();
			case SwaggerPackage.SWAGGER_MODEL__DEFINITIONS:
				return getDefinitions();
			case SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS:
				return getExternalDocs();
			case SwaggerPackage.SWAGGER_MODEL__SECURITY_DEFINITIONS:
				return getSecurityDefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SwaggerPackage.SWAGGER_MODEL__SWAGGER:
				setSwagger((String)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__INFO:
				setInfo((SwaggerInfo)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__HOST:
				setHost((String)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends SwaggerTag>)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends String>)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends SwaggerPath>)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends SwaggerNamedObjectType>)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS:
				setExternalDocs((SwaggerExternalDocumentation)newValue);
				return;
			case SwaggerPackage.SWAGGER_MODEL__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				getSecurityDefinitions().addAll((Collection<? extends SwaggerSecurityDefinition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SwaggerPackage.SWAGGER_MODEL__SWAGGER:
				setSwagger(SWAGGER_EDEFAULT);
				return;
			case SwaggerPackage.SWAGGER_MODEL__INFO:
				setInfo((SwaggerInfo)null);
				return;
			case SwaggerPackage.SWAGGER_MODEL__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case SwaggerPackage.SWAGGER_MODEL__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case SwaggerPackage.SWAGGER_MODEL__TAGS:
				getTags().clear();
				return;
			case SwaggerPackage.SWAGGER_MODEL__SCHEMES:
				getSchemes().clear();
				return;
			case SwaggerPackage.SWAGGER_MODEL__PATHS:
				getPaths().clear();
				return;
			case SwaggerPackage.SWAGGER_MODEL__DEFINITIONS:
				getDefinitions().clear();
				return;
			case SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS:
				setExternalDocs((SwaggerExternalDocumentation)null);
				return;
			case SwaggerPackage.SWAGGER_MODEL__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SwaggerPackage.SWAGGER_MODEL__SWAGGER:
				return SWAGGER_EDEFAULT == null ? swagger != null : !SWAGGER_EDEFAULT.equals(swagger);
			case SwaggerPackage.SWAGGER_MODEL__INFO:
				return info != null;
			case SwaggerPackage.SWAGGER_MODEL__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case SwaggerPackage.SWAGGER_MODEL__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case SwaggerPackage.SWAGGER_MODEL__TAGS:
				return tags != null && !tags.isEmpty();
			case SwaggerPackage.SWAGGER_MODEL__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case SwaggerPackage.SWAGGER_MODEL__PATHS:
				return paths != null && !paths.isEmpty();
			case SwaggerPackage.SWAGGER_MODEL__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case SwaggerPackage.SWAGGER_MODEL__EXTERNAL_DOCS:
				return externalDocs != null;
			case SwaggerPackage.SWAGGER_MODEL__SECURITY_DEFINITIONS:
				return securityDefinitions != null && !securityDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (swagger: ");
		result.append(swagger);
		result.append(", host: ");
		result.append(host);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(')');
		return result.toString();
	}

} //SwaggerModelImpl
