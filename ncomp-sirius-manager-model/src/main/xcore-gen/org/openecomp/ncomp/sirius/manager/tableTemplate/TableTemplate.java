
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate#getRowPath <em>Row Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getTableTemplate()
 * @model
 * @generated
 */
public interface TableTemplate extends AbstractTableTemplate, HasColumnsTableTemplate {
	/**
	 * Returns the value of the '<em><b>Row Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Path</em>' attribute.
	 * @see #setRowPath(String)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getTableTemplate_RowPath()
	 * @model unique="false"
	 * @generated
	 */
	String getRowPath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate#getRowPath <em>Row Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Path</em>' attribute.
	 * @see #getRowPath()
	 * @generated
	 */
	void setRowPath(String value);

} // TableTemplate
