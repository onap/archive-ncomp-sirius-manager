
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
package org.openecomp.ncomp.gwt.siriusportal.model.util;

import org.openecomp.ncomp.gwt.siriusportal.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseGuiClientApi(GuiClientApi object) {
				return createGuiClientApiAdapter();
			}
			@Override
			public Adapter caseGuiTree(GuiTree object) {
				return createGuiTreeAdapter();
			}
			@Override
			public Adapter caseGuiTreeNode(GuiTreeNode object) {
				return createGuiTreeNodeAdapter();
			}
			@Override
			public Adapter caseGuiObject(GuiObject object) {
				return createGuiObjectAdapter();
			}
			@Override
			public Adapter caseGuiNamedObject(GuiNamedObject object) {
				return createGuiNamedObjectAdapter();
			}
			@Override
			public Adapter caseGuiObjectValue(GuiObjectValue object) {
				return createGuiObjectValueAdapter();
			}
			@Override
			public Adapter caseGuiObjectValueInteger(GuiObjectValueInteger object) {
				return createGuiObjectValueIntegerAdapter();
			}
			@Override
			public Adapter caseGuiObjectValueString(GuiObjectValueString object) {
				return createGuiObjectValueStringAdapter();
			}
			@Override
			public Adapter caseGuiObjectValueReference(GuiObjectValueReference object) {
				return createGuiObjectValueReferenceAdapter();
			}
			@Override
			public Adapter caseGuiObjectValueTimeSeries(GuiObjectValueTimeSeries object) {
				return createGuiObjectValueTimeSeriesAdapter();
			}
			@Override
			public Adapter caseGuiObjectValueObject(GuiObjectValueObject object) {
				return createGuiObjectValueObjectAdapter();
			}
			@Override
			public Adapter caseGuiObjectUnNamedList(GuiObjectUnNamedList object) {
				return createGuiObjectUnNamedListAdapter();
			}
			@Override
			public Adapter caseGuiObjectNamedList(GuiObjectNamedList object) {
				return createGuiObjectNamedListAdapter();
			}
			@Override
			public Adapter caseGuiTimeSerie(GuiTimeSerie object) {
				return createGuiTimeSerieAdapter();
			}
			@Override
			public Adapter caseGuiTimeSerieData(GuiTimeSerieData object) {
				return createGuiTimeSerieDataAdapter();
			}
			@Override
			public Adapter caseGuiTable(GuiTable object) {
				return createGuiTableAdapter();
			}
			@Override
			public Adapter caseGuiTableColumn(GuiTableColumn object) {
				return createGuiTableColumnAdapter();
			}
			@Override
			public Adapter caseGuiTableRow(GuiTableRow object) {
				return createGuiTableRowAdapter();
			}
			@Override
			public Adapter caseGuiTableCell(GuiTableCell object) {
				return createGuiTableCellAdapter();
			}
			@Override
			public Adapter caseGuiTableCellString(GuiTableCellString object) {
				return createGuiTableCellStringAdapter();
			}
			@Override
			public Adapter caseGuiTableCellDouble(GuiTableCellDouble object) {
				return createGuiTableCellDoubleAdapter();
			}
			@Override
			public Adapter caseGuiTableCellDate(GuiTableCellDate object) {
				return createGuiTableCellDateAdapter();
			}
			@Override
			public Adapter caseGuiTableCellReferences(GuiTableCellReferences object) {
				return createGuiTableCellReferencesAdapter();
			}
			@Override
			public Adapter caseGuiTableCellReference(GuiTableCellReference object) {
				return createGuiTableCellReferenceAdapter();
			}
			@Override
			public Adapter caseGuiDiagram(GuiDiagram object) {
				return createGuiDiagramAdapter();
			}
			@Override
			public Adapter caseGuiDiagramItem(GuiDiagramItem object) {
				return createGuiDiagramItemAdapter();
			}
			@Override
			public Adapter caseGuiDiagramRectangle(GuiDiagramRectangle object) {
				return createGuiDiagramRectangleAdapter();
			}
			@Override
			public Adapter caseGuiHtml(GuiHtml object) {
				return createGuiHtmlAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi <em>Gui Client Api</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi
	 * @generated
	 */
	public Adapter createGuiClientApiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTree <em>Gui Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTree
	 * @generated
	 */
	public Adapter createGuiTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode <em>Gui Tree Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTreeNode
	 * @generated
	 */
	public Adapter createGuiTreeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObject <em>Gui Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObject
	 * @generated
	 */
	public Adapter createGuiObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiNamedObject <em>Gui Named Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiNamedObject
	 * @generated
	 */
	public Adapter createGuiNamedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue <em>Gui Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValue
	 * @generated
	 */
	public Adapter createGuiObjectValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueInteger <em>Gui Object Value Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueInteger
	 * @generated
	 */
	public Adapter createGuiObjectValueIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueString <em>Gui Object Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueString
	 * @generated
	 */
	public Adapter createGuiObjectValueStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueReference <em>Gui Object Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueReference
	 * @generated
	 */
	public Adapter createGuiObjectValueReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueTimeSeries <em>Gui Object Value Time Series</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueTimeSeries
	 * @generated
	 */
	public Adapter createGuiObjectValueTimeSeriesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueObject <em>Gui Object Value Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectValueObject
	 * @generated
	 */
	public Adapter createGuiObjectValueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectUnNamedList <em>Gui Object Un Named List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectUnNamedList
	 * @generated
	 */
	public Adapter createGuiObjectUnNamedListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectNamedList <em>Gui Object Named List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiObjectNamedList
	 * @generated
	 */
	public Adapter createGuiObjectNamedListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie <em>Gui Time Serie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie
	 * @generated
	 */
	public Adapter createGuiTimeSerieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData <em>Gui Time Serie Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerieData
	 * @generated
	 */
	public Adapter createGuiTimeSerieDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTable <em>Gui Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTable
	 * @generated
	 */
	public Adapter createGuiTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn <em>Gui Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableColumn
	 * @generated
	 */
	public Adapter createGuiTableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableRow <em>Gui Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableRow
	 * @generated
	 */
	public Adapter createGuiTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCell <em>Gui Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCell
	 * @generated
	 */
	public Adapter createGuiTableCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellString <em>Gui Table Cell String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellString
	 * @generated
	 */
	public Adapter createGuiTableCellStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble <em>Gui Table Cell Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDouble
	 * @generated
	 */
	public Adapter createGuiTableCellDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDate <em>Gui Table Cell Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellDate
	 * @generated
	 */
	public Adapter createGuiTableCellDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReferences <em>Gui Table Cell References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReferences
	 * @generated
	 */
	public Adapter createGuiTableCellReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference <em>Gui Table Cell Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiTableCellReference
	 * @generated
	 */
	public Adapter createGuiTableCellReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagram <em>Gui Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagram
	 * @generated
	 */
	public Adapter createGuiDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramItem <em>Gui Diagram Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramItem
	 * @generated
	 */
	public Adapter createGuiDiagramItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle <em>Gui Diagram Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiDiagramRectangle
	 * @generated
	 */
	public Adapter createGuiDiagramRectangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml <em>Gui Html</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml
	 * @generated
	 */
	public Adapter createGuiHtmlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
