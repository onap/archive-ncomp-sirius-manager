
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

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage;

import org.openecomp.ncomp.sirius.manager.swagger.SwaggerXml;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerNamedObjectTypeImpl#getXml <em>Xml</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwaggerNamedObjectTypeImpl extends NamedEntityImpl implements SwaggerNamedObjectType {
	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected boolean many = MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected SwaggerXml xml;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwaggerNamedObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwaggerPackage.Literals.SWAGGER_NAMED_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMany() {
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMany(boolean newMany) {
		boolean oldMany = many;
		many = newMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__MANY, oldMany, many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerXml getXml() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXml(SwaggerXml newXml, NotificationChain msgs) {
		SwaggerXml oldXml = xml;
		xml = newXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML, oldXml, newXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml(SwaggerXml newXml) {
		if (newXml != xml) {
			NotificationChain msgs = null;
			if (xml != null)
				msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML, null, msgs);
			if (newXml != null)
				msgs = ((InternalEObject)newXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML, null, msgs);
			msgs = basicSetXml(newXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML, newXml, newXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML:
				return basicSetXml(null, msgs);
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
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__MANY:
				return isMany();
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__TYPE:
				return getType();
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DEFAULT:
				return getDefault();
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION:
				return getDescription();
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML:
				return getXml();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__MANY:
				setMany((Boolean)newValue);
				return;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__TYPE:
				setType((String)newValue);
				return;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DEFAULT:
				setDefault((String)newValue);
				return;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML:
				setXml((SwaggerXml)newValue);
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
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__MANY:
				setMany(MANY_EDEFAULT);
				return;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML:
				setXml((SwaggerXml)null);
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
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__MANY:
				return many != MANY_EDEFAULT;
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__XML:
				return xml != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SwaggerObjectType.class) {
			switch (derivedFeatureID) {
				case SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__MANY: return SwaggerPackage.SWAGGER_OBJECT_TYPE__MANY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SwaggerObjectType.class) {
			switch (baseFeatureID) {
				case SwaggerPackage.SWAGGER_OBJECT_TYPE__MANY: return SwaggerPackage.SWAGGER_NAMED_OBJECT_TYPE__MANY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (many: ");
		result.append(many);
		result.append(", type: ");
		result.append(type);
		result.append(", default: ");
		result.append(default_);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SwaggerNamedObjectTypeImpl
