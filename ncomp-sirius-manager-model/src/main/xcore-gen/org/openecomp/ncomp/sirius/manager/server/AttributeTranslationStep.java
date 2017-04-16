/**
 */
package org.openecomp.ncomp.sirius.manager.server;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Translation Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getOldValue <em>Old Value</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAttributeTranslationStep()
 * @model
 * @generated
 */
public interface AttributeTranslationStep extends VersionTranslationStep {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(String)
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAttributeTranslationStep_Attribute()
	 * @model unique="false"
	 * @generated
	 */
	String getAttribute();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(String)
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAttributeTranslationStep_CurrentValue()
	 * @model unique="false"
	 * @generated
	 */
	String getCurrentValue();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(String value);

	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(String)
	 * @see org.openecomp.ncomp.sirius.manager.server.ServerPackage#getAttributeTranslationStep_OldValue()
	 * @model unique="false"
	 * @generated
	 */
	String getOldValue();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(String value);

} // AttributeTranslationStep
