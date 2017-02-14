
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
package org.openecomp.ncomp.gwt.siriusportal.model;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Time Serie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getName <em>Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getXAxisLabel <em>XAxis Label</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getXAxisDateFormat <em>XAxis Date Format</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getYAxisLabel <em>YAxis Label</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getStart <em>Start</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getEnd <em>End</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#isIsRate <em>Is Rate</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie()
 * @model
 * @generated
 */
public interface GuiTimeSerie extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>XAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAxis Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Label</em>' attribute.
	 * @see #setXAxisLabel(String)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie_XAxisLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getXAxisLabel();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getXAxisLabel <em>XAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Label</em>' attribute.
	 * @see #getXAxisLabel()
	 * @generated
	 */
	void setXAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>XAxis Date Format</b></em>' attribute.
	 * The default value is <code>"MM-dd HH:mm"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAxis Date Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAxis Date Format</em>' attribute.
	 * @see #setXAxisDateFormat(String)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie_XAxisDateFormat()
	 * @model default="MM-dd HH:mm" unique="false"
	 * @generated
	 */
	String getXAxisDateFormat();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getXAxisDateFormat <em>XAxis Date Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAxis Date Format</em>' attribute.
	 * @see #getXAxisDateFormat()
	 * @generated
	 */
	void setXAxisDateFormat(String value);

	/**
	 * Returns the value of the '<em><b>YAxis Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAxis Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAxis Label</em>' attribute.
	 * @see #setYAxisLabel(String)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie_YAxisLabel()
	 * @model unique="false"
	 * @generated
	 */
	String getYAxisLabel();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getYAxisLabel <em>YAxis Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAxis Label</em>' attribute.
	 * @see #getYAxisLabel()
	 * @generated
	 */
	void setYAxisLabel(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie_Start()
	 * @model unique="false" dataType="org.openecomp.ncomp.gwt.siriusportal.model.Date"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie_End()
	 * @model unique="false" dataType="org.openecomp.ncomp.gwt.siriusportal.model.Date"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Is Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Rate</em>' attribute.
	 * @see #setIsRate(boolean)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie_IsRate()
	 * @model unique="false"
	 * @generated
	 */
	boolean isIsRate();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie#isIsRate <em>Is Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Rate</em>' attribute.
	 * @see #isIsRate()
	 * @generated
	 */
	void setIsRate(boolean value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerie_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuiTimeSerieData> getData();

} // GuiTimeSerie
