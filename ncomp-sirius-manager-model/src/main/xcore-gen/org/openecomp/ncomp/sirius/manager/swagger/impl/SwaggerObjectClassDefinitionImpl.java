
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

import org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Class Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectClassDefinitionImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectClassDefinitionImpl#getAllOf <em>All Of</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectClassDefinitionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.swagger.impl.SwaggerObjectClassDefinitionImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwaggerObjectClassDefinitionImpl extends SwaggerNamedObjectTypeImpl implements SwaggerObjectClassDefinition {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<String> required;

	/**
	 * The cached value of the '{@link #getAllOf() <em>All Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOf()
	 * @generated
	 * @ordered
	 */
	protected EList<SwaggerObjectType> allOf;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<SwaggerNamedObjectType> properties;

	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected SwaggerObjectType additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwaggerObjectClassDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SwaggerPackage.Literals.SWAGGER_OBJECT_CLASS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequired() {
		if (required == null) {
			required = new EDataTypeEList<String>(String.class, this, SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwaggerObjectType> getAllOf() {
		if (allOf == null) {
			allOf = new EObjectResolvingEList<SwaggerObjectType>(SwaggerObjectType.class, this, SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ALL_OF);
		}
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwaggerNamedObjectType> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<SwaggerNamedObjectType>(SwaggerNamedObjectType.class, this, SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwaggerObjectType getAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalProperties(SwaggerObjectType newAdditionalProperties, NotificationChain msgs) {
		SwaggerObjectType oldAdditionalProperties = additionalProperties;
		additionalProperties = newAdditionalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES, oldAdditionalProperties, newAdditionalProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalProperties(SwaggerObjectType newAdditionalProperties) {
		if (newAdditionalProperties != additionalProperties) {
			NotificationChain msgs = null;
			if (additionalProperties != null)
				msgs = ((InternalEObject)additionalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES, null, msgs);
			if (newAdditionalProperties != null)
				msgs = ((InternalEObject)newAdditionalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES, null, msgs);
			msgs = basicSetAdditionalProperties(newAdditionalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES, newAdditionalProperties, newAdditionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES:
				return basicSetAdditionalProperties(null, msgs);
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
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__REQUIRED:
				return getRequired();
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ALL_OF:
				return getAllOf();
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES:
				return getProperties();
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties();
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
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends String>)newValue);
				return;
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ALL_OF:
				getAllOf().clear();
				getAllOf().addAll((Collection<? extends SwaggerObjectType>)newValue);
				return;
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends SwaggerNamedObjectType>)newValue);
				return;
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((SwaggerObjectType)newValue);
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
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__REQUIRED:
				getRequired().clear();
				return;
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ALL_OF:
				getAllOf().clear();
				return;
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES:
				getProperties().clear();
				return;
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((SwaggerObjectType)null);
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
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__REQUIRED:
				return required != null && !required.isEmpty();
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ALL_OF:
				return allOf != null && !allOf.isEmpty();
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case SwaggerPackage.SWAGGER_OBJECT_CLASS_DEFINITION__ADDITIONAL_PROPERTIES:
				return additionalProperties != null;
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
		result.append(" (required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //SwaggerObjectClassDefinitionImpl
