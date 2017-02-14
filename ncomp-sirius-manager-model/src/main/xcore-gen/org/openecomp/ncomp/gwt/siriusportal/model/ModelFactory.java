
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = org.openecomp.ncomp.gwt.siriusportal.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gui Client Api</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Client Api</em>'.
	 * @generated
	 */
	GuiClientApi createGuiClientApi();

	/**
	 * Returns a new object of class '<em>Gui Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Tree</em>'.
	 * @generated
	 */
	GuiTree createGuiTree();

	/**
	 * Returns a new object of class '<em>Gui Tree Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Tree Node</em>'.
	 * @generated
	 */
	GuiTreeNode createGuiTreeNode();

	/**
	 * Returns a new object of class '<em>Gui Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Object</em>'.
	 * @generated
	 */
	GuiObject createGuiObject();

	/**
	 * Returns a new object of class '<em>Gui Named Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Named Object</em>'.
	 * @generated
	 */
	GuiNamedObject createGuiNamedObject();

	/**
	 * Returns a new object of class '<em>Gui Object Value Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Object Value Integer</em>'.
	 * @generated
	 */
	GuiObjectValueInteger createGuiObjectValueInteger();

	/**
	 * Returns a new object of class '<em>Gui Object Value String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Object Value String</em>'.
	 * @generated
	 */
	GuiObjectValueString createGuiObjectValueString();

	/**
	 * Returns a new object of class '<em>Gui Object Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Object Value Reference</em>'.
	 * @generated
	 */
	GuiObjectValueReference createGuiObjectValueReference();

	/**
	 * Returns a new object of class '<em>Gui Object Value Time Series</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Object Value Time Series</em>'.
	 * @generated
	 */
	GuiObjectValueTimeSeries createGuiObjectValueTimeSeries();

	/**
	 * Returns a new object of class '<em>Gui Object Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Object Value Object</em>'.
	 * @generated
	 */
	GuiObjectValueObject createGuiObjectValueObject();

	/**
	 * Returns a new object of class '<em>Gui Object Un Named List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Object Un Named List</em>'.
	 * @generated
	 */
	GuiObjectUnNamedList createGuiObjectUnNamedList();

	/**
	 * Returns a new object of class '<em>Gui Object Named List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Object Named List</em>'.
	 * @generated
	 */
	GuiObjectNamedList createGuiObjectNamedList();

	/**
	 * Returns a new object of class '<em>Gui Time Serie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Time Serie</em>'.
	 * @generated
	 */
	GuiTimeSerie createGuiTimeSerie();

	/**
	 * Returns a new object of class '<em>Gui Time Serie Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Time Serie Data</em>'.
	 * @generated
	 */
	GuiTimeSerieData createGuiTimeSerieData();

	/**
	 * Returns a new object of class '<em>Gui Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Table</em>'.
	 * @generated
	 */
	GuiTable createGuiTable();

	/**
	 * Returns a new object of class '<em>Gui Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Table Column</em>'.
	 * @generated
	 */
	GuiTableColumn createGuiTableColumn();

	/**
	 * Returns a new object of class '<em>Gui Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Table Row</em>'.
	 * @generated
	 */
	GuiTableRow createGuiTableRow();

	/**
	 * Returns a new object of class '<em>Gui Table Cell String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Table Cell String</em>'.
	 * @generated
	 */
	GuiTableCellString createGuiTableCellString();

	/**
	 * Returns a new object of class '<em>Gui Table Cell Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Table Cell Double</em>'.
	 * @generated
	 */
	GuiTableCellDouble createGuiTableCellDouble();

	/**
	 * Returns a new object of class '<em>Gui Table Cell Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Table Cell Date</em>'.
	 * @generated
	 */
	GuiTableCellDate createGuiTableCellDate();

	/**
	 * Returns a new object of class '<em>Gui Table Cell References</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Table Cell References</em>'.
	 * @generated
	 */
	GuiTableCellReferences createGuiTableCellReferences();

	/**
	 * Returns a new object of class '<em>Gui Table Cell Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Table Cell Reference</em>'.
	 * @generated
	 */
	GuiTableCellReference createGuiTableCellReference();

	/**
	 * Returns a new object of class '<em>Gui Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Diagram</em>'.
	 * @generated
	 */
	GuiDiagram createGuiDiagram();

	/**
	 * Returns a new object of class '<em>Gui Diagram Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Diagram Item</em>'.
	 * @generated
	 */
	GuiDiagramItem createGuiDiagramItem();

	/**
	 * Returns a new object of class '<em>Gui Diagram Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Diagram Rectangle</em>'.
	 * @generated
	 */
	GuiDiagramRectangle createGuiDiagramRectangle();

	/**
	 * Returns a new object of class '<em>Gui Html</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Html</em>'.
	 * @generated
	 */
	GuiHtml createGuiHtml();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
