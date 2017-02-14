
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
package org.openecomp.ncomp.sirius.manager.tableTemplate;

import org.openecomp.ncomp.core.function.Iterator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Table Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate#getIterator <em>Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getIteratorTableTemplate()
 * @model
 * @generated
 */
public interface IteratorTableTemplate extends AbstractTableTemplate, HasColumnsTableTemplate {
	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference.
	 * @see #setIterator(Iterator)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getIteratorTableTemplate_Iterator()
	 * @model containment="true"
	 * @generated
	 */
	Iterator getIterator();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate#getIterator <em>Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterator</em>' containment reference.
	 * @see #getIterator()
	 * @generated
	 */
	void setIterator(Iterator value);

} // IteratorTableTemplate
