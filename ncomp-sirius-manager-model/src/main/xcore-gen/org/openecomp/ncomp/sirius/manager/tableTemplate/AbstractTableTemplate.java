
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

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Table Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate#getTreePath <em>Tree Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate#getTablePath <em>Table Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getAbstractTableTemplate()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTableTemplate extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Tree Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Path</em>' attribute.
	 * @see #setTreePath(String)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getAbstractTableTemplate_TreePath()
	 * @model unique="false"
	 * @generated
	 */
	String getTreePath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate#getTreePath <em>Tree Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Path</em>' attribute.
	 * @see #getTreePath()
	 * @generated
	 */
	void setTreePath(String value);

	/**
	 * Returns the value of the '<em><b>Table Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Path</em>' attribute.
	 * @see #setTablePath(String)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getAbstractTableTemplate_TablePath()
	 * @model unique="false"
	 * @generated
	 */
	String getTablePath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate#getTablePath <em>Table Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Path</em>' attribute.
	 * @see #getTablePath()
	 * @generated
	 */
	void setTablePath(String value);

} // AbstractTableTemplate
