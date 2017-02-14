
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
package org.openecomp.ncomp.gwt.siriusportal.model.impl;

import org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiHtml;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiObject;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTable;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTimeSerie;
import org.openecomp.ncomp.gwt.siriusportal.model.GuiTree;
import org.openecomp.ncomp.gwt.siriusportal.model.ModelPackage;

import org.openecomp.ncomp.sirius.manager.graph.GuiGraph;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Client Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class GuiClientApiImpl extends MinimalEObjectImpl.Container implements GuiClientApi {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiClientApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GUI_CLIENT_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTree getTree() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiObject getObject(String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTimeSerie getTimeSerie(String path, String start, String end, String duration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiTable getTable(String path, String start, String end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiHtml getHtml(String path, String start, String end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiGraph getGraph(String path, String start, String end) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.GUI_CLIENT_API___GET_TREE:
				return getTree();
			case ModelPackage.GUI_CLIENT_API___GET_OBJECT__STRING:
				return getObject((String)arguments.get(0));
			case ModelPackage.GUI_CLIENT_API___GET_TIME_SERIE__STRING_STRING_STRING_STRING:
				return getTimeSerie((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case ModelPackage.GUI_CLIENT_API___GET_TABLE__STRING_STRING_STRING:
				return getTable((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ModelPackage.GUI_CLIENT_API___GET_HTML__STRING_STRING_STRING:
				return getHtml((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case ModelPackage.GUI_CLIENT_API___GET_GRAPH__STRING_STRING_STRING:
				return getGraph((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GuiClientApiImpl
