
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

import org.openecomp.ncomp.core.logs.LogLevel;
import org.openecomp.ncomp.core.logs.LogSeverity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Table Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getMinLevel <em>Min Level</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getMinSeverity <em>Min Severity</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getPrefixResourcePath <em>Prefix Resource Path</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getAggregationDuration <em>Aggregation Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getLogTableTemplate()
 * @model
 * @generated
 */
public interface LogTableTemplate extends AbstractTableTemplate {
	/**
	 * Returns the value of the '<em><b>Min Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.logs.LogLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Level</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @see #setMinLevel(LogLevel)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getLogTableTemplate_MinLevel()
	 * @model unique="false"
	 * @generated
	 */
	LogLevel getMinLevel();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getMinLevel <em>Min Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Level</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogLevel
	 * @see #getMinLevel()
	 * @generated
	 */
	void setMinLevel(LogLevel value);

	/**
	 * Returns the value of the '<em><b>Min Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openecomp.ncomp.core.logs.LogSeverity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #setMinSeverity(LogSeverity)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getLogTableTemplate_MinSeverity()
	 * @model unique="false"
	 * @generated
	 */
	LogSeverity getMinSeverity();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getMinSeverity <em>Min Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Severity</em>' attribute.
	 * @see org.openecomp.ncomp.core.logs.LogSeverity
	 * @see #getMinSeverity()
	 * @generated
	 */
	void setMinSeverity(LogSeverity value);

	/**
	 * Returns the value of the '<em><b>Prefix Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Resource Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Resource Path</em>' attribute.
	 * @see #setPrefixResourcePath(String)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getLogTableTemplate_PrefixResourcePath()
	 * @model unique="false"
	 * @generated
	 */
	String getPrefixResourcePath();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getPrefixResourcePath <em>Prefix Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Resource Path</em>' attribute.
	 * @see #getPrefixResourcePath()
	 * @generated
	 */
	void setPrefixResourcePath(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getLogTableTemplate_Duration()
	 * @model unique="false"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Duration</em>' attribute.
	 * @see #setAggregationDuration(String)
	 * @see org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplatePackage#getLogTableTemplate_AggregationDuration()
	 * @model unique="false"
	 * @generated
	 */
	String getAggregationDuration();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate#getAggregationDuration <em>Aggregation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Duration</em>' attribute.
	 * @see #getAggregationDuration()
	 * @generated
	 */
	void setAggregationDuration(String value);

} // LogTableTemplate
