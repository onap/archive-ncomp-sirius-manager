/**
 */
package org.openecomp.ncomp.sirius.manager.server;

import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.VersionTranslation#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getVersionTranslation()
 * @model
 * @generated
 */
public interface VersionTranslation extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.sirius.manager.server.VersionTranslationStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getVersionTranslation_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<VersionTranslationStep> getSteps();

} // VersionTranslation
