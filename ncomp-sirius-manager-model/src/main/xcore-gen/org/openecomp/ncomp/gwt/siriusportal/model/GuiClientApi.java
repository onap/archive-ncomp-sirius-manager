
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

import org.openecomp.ncomp.sirius.manager.graph.GuiGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gui Client Api</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage#getGuiClientApi()
 * @model
 * @generated
 */
public interface GuiClientApi extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	GuiTree getTree();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pathUnique="false"
	 * @generated
	 */
	GuiObject getObject(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pathUnique="false" startUnique="false" endUnique="false" durationUnique="false"
	 * @generated
	 */
	GuiTimeSerie getTimeSerie(String path, String start, String end, String duration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pathUnique="false" startUnique="false" endUnique="false"
	 * @generated
	 */
	GuiTable getTable(String path, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pathUnique="false" startUnique="false" endUnique="false"
	 * @generated
	 */
	GuiHtml getHtml(String path, String start, String end);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pathUnique="false" startUnique="false" endUnique="false"
	 * @generated
	 */
	GuiGraph getGraph(String path, String start, String end);

} // GuiClientApi
