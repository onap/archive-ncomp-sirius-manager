
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Time Serie Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getTime <em>Time</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getValue <em>Value</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getMax <em>Max</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getMin <em>Min</em>}</li>
 *   <li>{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getNum <em>Num</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerieData()
 * @model
 * @generated
 */
public interface GuiTimeSerieData extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerieData_Time()
	 * @model unique="false" dataType="org.openecomp.ncomp.gwt.siriusportal.model.Date"
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerieData_Value()
	 * @model unique="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Double)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerieData_Max()
	 * @model unique="false"
	 * @generated
	 */
	Double getMax();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Double value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Double)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerieData_Min()
	 * @model unique="false"
	 * @generated
	 */
	Double getMin();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Double value);

	/**
	 * Returns the value of the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num</em>' attribute.
	 * @see #setNum(int)
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiTimeSerieData_Num()
	 * @model unique="false"
	 * @generated
	 */
	int getNum();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData#getNum <em>Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num</em>' attribute.
	 * @see #getNum()
	 * @generated
	 */
	void setNum(int value);

} // GuiTimeSerieData
