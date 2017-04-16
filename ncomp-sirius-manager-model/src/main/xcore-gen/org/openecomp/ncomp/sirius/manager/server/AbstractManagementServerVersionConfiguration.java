/**
 */
package org.openecomp.ncomp.sirius.manager.server;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Management Server Version Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerVersionConfiguration#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerVersionConfiguration#getTranslationHandler <em>Translation Handler</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerVersionConfiguration()
 * @model
 * @generated
 */
public interface AbstractManagementServerVersionConfiguration extends EObject {
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
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerVersionConfiguration_Version()
	 * @model unique="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerVersionConfiguration#getVersion <em>Version</em>}' attribute.
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
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAbstractManagementServerVersionConfiguration_TranslationHandler()
	 * @model unique="false"
	 * @generated
	 */
	String getTranslationHandler();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.AbstractManagementServerVersionConfiguration#getTranslationHandler <em>Translation Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Handler</em>' attribute.
	 * @see #getTranslationHandler()
	 * @generated
	 */
	void setTranslationHandler(String value);

} // AbstractManagementServerVersionConfiguration
