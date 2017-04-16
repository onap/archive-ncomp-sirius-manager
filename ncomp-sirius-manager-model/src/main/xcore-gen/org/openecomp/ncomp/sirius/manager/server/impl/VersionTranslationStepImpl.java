/**
 */
package org.openecomp.ncomp.sirius.manager.server.impl;

import org.eclipse.emf.ecore.EClass;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.ncomp.sirius.manager.server.VersionTranslationStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Translation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class VersionTranslationStepImpl extends NamedEntityImpl implements VersionTranslationStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionTranslationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.VERSION_TRANSLATION_STEP;
	}

} //VersionTranslationStepImpl
