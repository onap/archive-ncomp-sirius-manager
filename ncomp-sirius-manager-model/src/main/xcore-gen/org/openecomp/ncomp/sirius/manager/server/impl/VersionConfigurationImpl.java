/**
 */
package org.openecomp.ncomp.sirius.manager.server.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.ncomp.sirius.manager.server.VersionConfiguration;
import org.openecomp.ncomp.sirius.manager.server.VersionTranslation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionConfigurationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionConfigurationImpl#getTranslationHandler <em>Translation Handler</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.impl.VersionConfigurationImpl#getSupportedVersions <em>Supported Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionConfigurationImpl extends MinimalEObjectImpl.Container implements VersionConfiguration {
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
	 * The default value of the '{@link #getTranslationHandler() <em>Translation Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSLATION_HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTranslationHandler() <em>Translation Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslationHandler()
	 * @generated
	 * @ordered
	 */
	protected String translationHandler = TRANSLATION_HANDLER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedVersions() <em>Supported Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionTranslation> supportedVersions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.VERSION_CONFIGURATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.VERSION_CONFIGURATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTranslationHandler() {
		return translationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslationHandler(String newTranslationHandler) {
		String oldTranslationHandler = translationHandler;
		translationHandler = newTranslationHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.VERSION_CONFIGURATION__TRANSLATION_HANDLER, oldTranslationHandler, translationHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionTranslation> getSupportedVersions() {
		if (supportedVersions == null) {
			supportedVersions = new EObjectContainmentEList<VersionTranslation>(VersionTranslation.class, this, ServerPackage.VERSION_CONFIGURATION__SUPPORTED_VERSIONS);
		}
		return supportedVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServerPackage.VERSION_CONFIGURATION__SUPPORTED_VERSIONS:
				return ((InternalEList<?>)getSupportedVersions()).basicRemove(otherEnd, msgs);
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
			case ServerPackage.VERSION_CONFIGURATION__VERSION:
				return getVersion();
			case ServerPackage.VERSION_CONFIGURATION__TRANSLATION_HANDLER:
				return getTranslationHandler();
			case ServerPackage.VERSION_CONFIGURATION__SUPPORTED_VERSIONS:
				return getSupportedVersions();
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
			case ServerPackage.VERSION_CONFIGURATION__VERSION:
				setVersion((String)newValue);
				return;
			case ServerPackage.VERSION_CONFIGURATION__TRANSLATION_HANDLER:
				setTranslationHandler((String)newValue);
				return;
			case ServerPackage.VERSION_CONFIGURATION__SUPPORTED_VERSIONS:
				getSupportedVersions().clear();
				getSupportedVersions().addAll((Collection<? extends VersionTranslation>)newValue);
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
			case ServerPackage.VERSION_CONFIGURATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ServerPackage.VERSION_CONFIGURATION__TRANSLATION_HANDLER:
				setTranslationHandler(TRANSLATION_HANDLER_EDEFAULT);
				return;
			case ServerPackage.VERSION_CONFIGURATION__SUPPORTED_VERSIONS:
				getSupportedVersions().clear();
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
			case ServerPackage.VERSION_CONFIGURATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ServerPackage.VERSION_CONFIGURATION__TRANSLATION_HANDLER:
				return TRANSLATION_HANDLER_EDEFAULT == null ? translationHandler != null : !TRANSLATION_HANDLER_EDEFAULT.equals(translationHandler);
			case ServerPackage.VERSION_CONFIGURATION__SUPPORTED_VERSIONS:
				return supportedVersions != null && !supportedVersions.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(", translationHandler: ");
		result.append(translationHandler);
		result.append(')');
		return result.toString();
	}

} //VersionConfigurationImpl
