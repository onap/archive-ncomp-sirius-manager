
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
package org.openecomp.ncomp.sirius.manager.properties.impl;

import org.openecomp.ncomp.core.CorePackage;
import org.openecomp.ncomp.core.NamedEntity;

import org.openecomp.ncomp.sirius.manager.properties.Module;
import org.openecomp.ncomp.sirius.manager.properties.ModuleProperty;
import org.openecomp.ncomp.sirius.manager.properties.PropertiesPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.properties.impl.ModulePropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.properties.impl.ModulePropertyImpl#getLastPolled <em>Last Polled</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.properties.impl.ModulePropertyImpl#getLastChanged <em>Last Changed</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.properties.impl.ModulePropertyImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.properties.impl.ModulePropertyImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.properties.impl.ModulePropertyImpl#getSubModules <em>Sub Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModulePropertyImpl extends AbstractPropertyImpl implements ModuleProperty {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastPolled() <em>Last Polled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPolled()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_POLLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastPolled() <em>Last Polled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPolled()
	 * @generated
	 * @ordered
	 */
	protected Date lastPolled = LAST_POLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastChanged() <em>Last Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChanged()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_CHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastChanged() <em>Last Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChanged()
	 * @generated
	 * @ordered
	 */
	protected Date lastChanged = LAST_CHANGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubModules() <em>Sub Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> subModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModulePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.MODULE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.MODULE_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastPolled() {
		return lastPolled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastPolled(Date newLastPolled) {
		Date oldLastPolled = lastPolled;
		lastPolled = newLastPolled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.MODULE_PROPERTY__LAST_POLLED, oldLastPolled, lastPolled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastChanged() {
		return lastChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastChanged(Date newLastChanged) {
		Date oldLastChanged = lastChanged;
		lastChanged = newLastChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.MODULE_PROPERTY__LAST_CHANGED, oldLastChanged, lastChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.MODULE_PROPERTY__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.MODULE_PROPERTY__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getSubModules() {
		if (subModules == null) {
			subModules = new EObjectContainmentEList<Module>(Module.class, this, PropertiesPackage.MODULE_PROPERTY__SUB_MODULES);
		}
		return subModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.MODULE_PROPERTY__SUB_MODULES:
				return ((InternalEList<?>)getSubModules()).basicRemove(otherEnd, msgs);
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
			case PropertiesPackage.MODULE_PROPERTY__NAME:
				return getName();
			case PropertiesPackage.MODULE_PROPERTY__LAST_POLLED:
				return getLastPolled();
			case PropertiesPackage.MODULE_PROPERTY__LAST_CHANGED:
				return getLastChanged();
			case PropertiesPackage.MODULE_PROPERTY__CREATED:
				return getCreated();
			case PropertiesPackage.MODULE_PROPERTY__VERSION:
				return getVersion();
			case PropertiesPackage.MODULE_PROPERTY__SUB_MODULES:
				return getSubModules();
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
			case PropertiesPackage.MODULE_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case PropertiesPackage.MODULE_PROPERTY__LAST_POLLED:
				setLastPolled((Date)newValue);
				return;
			case PropertiesPackage.MODULE_PROPERTY__LAST_CHANGED:
				setLastChanged((Date)newValue);
				return;
			case PropertiesPackage.MODULE_PROPERTY__CREATED:
				setCreated((Date)newValue);
				return;
			case PropertiesPackage.MODULE_PROPERTY__VERSION:
				setVersion((String)newValue);
				return;
			case PropertiesPackage.MODULE_PROPERTY__SUB_MODULES:
				getSubModules().clear();
				getSubModules().addAll((Collection<? extends Module>)newValue);
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
			case PropertiesPackage.MODULE_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PropertiesPackage.MODULE_PROPERTY__LAST_POLLED:
				setLastPolled(LAST_POLLED_EDEFAULT);
				return;
			case PropertiesPackage.MODULE_PROPERTY__LAST_CHANGED:
				setLastChanged(LAST_CHANGED_EDEFAULT);
				return;
			case PropertiesPackage.MODULE_PROPERTY__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case PropertiesPackage.MODULE_PROPERTY__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case PropertiesPackage.MODULE_PROPERTY__SUB_MODULES:
				getSubModules().clear();
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
			case PropertiesPackage.MODULE_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PropertiesPackage.MODULE_PROPERTY__LAST_POLLED:
				return LAST_POLLED_EDEFAULT == null ? lastPolled != null : !LAST_POLLED_EDEFAULT.equals(lastPolled);
			case PropertiesPackage.MODULE_PROPERTY__LAST_CHANGED:
				return LAST_CHANGED_EDEFAULT == null ? lastChanged != null : !LAST_CHANGED_EDEFAULT.equals(lastChanged);
			case PropertiesPackage.MODULE_PROPERTY__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case PropertiesPackage.MODULE_PROPERTY__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case PropertiesPackage.MODULE_PROPERTY__SUB_MODULES:
				return subModules != null && !subModules.isEmpty();
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
		if (baseClass == NamedEntity.class) {
			switch (derivedFeatureID) {
				case PropertiesPackage.MODULE_PROPERTY__NAME: return CorePackage.NAMED_ENTITY__NAME;
				case PropertiesPackage.MODULE_PROPERTY__LAST_POLLED: return CorePackage.NAMED_ENTITY__LAST_POLLED;
				case PropertiesPackage.MODULE_PROPERTY__LAST_CHANGED: return CorePackage.NAMED_ENTITY__LAST_CHANGED;
				case PropertiesPackage.MODULE_PROPERTY__CREATED: return CorePackage.NAMED_ENTITY__CREATED;
				default: return -1;
			}
		}
		if (baseClass == Module.class) {
			switch (derivedFeatureID) {
				case PropertiesPackage.MODULE_PROPERTY__VERSION: return PropertiesPackage.MODULE__VERSION;
				case PropertiesPackage.MODULE_PROPERTY__SUB_MODULES: return PropertiesPackage.MODULE__SUB_MODULES;
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
		if (baseClass == NamedEntity.class) {
			switch (baseFeatureID) {
				case CorePackage.NAMED_ENTITY__NAME: return PropertiesPackage.MODULE_PROPERTY__NAME;
				case CorePackage.NAMED_ENTITY__LAST_POLLED: return PropertiesPackage.MODULE_PROPERTY__LAST_POLLED;
				case CorePackage.NAMED_ENTITY__LAST_CHANGED: return PropertiesPackage.MODULE_PROPERTY__LAST_CHANGED;
				case CorePackage.NAMED_ENTITY__CREATED: return PropertiesPackage.MODULE_PROPERTY__CREATED;
				default: return -1;
			}
		}
		if (baseClass == Module.class) {
			switch (baseFeatureID) {
				case PropertiesPackage.MODULE__VERSION: return PropertiesPackage.MODULE_PROPERTY__VERSION;
				case PropertiesPackage.MODULE__SUB_MODULES: return PropertiesPackage.MODULE_PROPERTY__SUB_MODULES;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", lastPolled: ");
		result.append(lastPolled);
		result.append(", lastChanged: ");
		result.append(lastChanged);
		result.append(", created: ");
		result.append(created);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ModulePropertyImpl
