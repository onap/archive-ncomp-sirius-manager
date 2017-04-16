/**
 */
package org.openecomp.ncomp.sirius.manager.server;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getTranslationHandler <em>Translation Handler</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getSupportedVersions <em>Supported Versions</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getVersionConfiguration()
 * @model
 * @generated
 */
public interface VersionConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getVersionConfiguration_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Translation Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Handler</em>' attribute.
	 * @see #setTranslationHandler(String)
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getVersionConfiguration_TranslationHandler()
	 * @model unique="false"
	 * @generated
	 */
	String getTranslationHandler();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.VersionConfiguration#getTranslationHandler <em>Translation Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Handler</em>' attribute.
	 * @see #getTranslationHandler()
	 * @generated
	 */
	void setTranslationHandler(String value);

	/**
	 * Returns the value of the '<em><b>Supported Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.server.VersionTranslation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Versions</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getVersionConfiguration_SupportedVersions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VersionTranslation> getSupportedVersions();

} // VersionConfiguration
