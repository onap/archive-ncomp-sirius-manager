
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
	
package org.openecomp.ncomp.sirius.gui.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.gwt.siriusportal.model.*;
import org.openecomp.ncomp.sirius.manager.tableTemplate.AbstractTableTemplate;

public class GuiTreeUtil {
	public static final Logger logger = Logger.getLogger(GuiTreeUtil.class);
	static ModelFactory f = ModelFactory.eINSTANCE;
	GuiTree tree;
	HashMap<EObject, GuiTreeNode> ecore2node = new HashMap<EObject, GuiTreeNode>();
	private ManagementServer server;

	@SuppressWarnings("rawtypes")
	public GuiTreeUtil (ManagementServer server, int levels, Map options) {
		this.server = server;
		tree = f.createGuiTree();
		tree.getSections().addAll(ecore2node(server.getObject(),levels,options).getChildren());
	}
	@SuppressWarnings("rawtypes")
	public GuiTreeUtil (ManagementServer server, EObject o, int levels, Map options) {
		this.server = server;
		tree = f.createGuiTree();
		tree.getSections().addAll(ecore2node(o,levels,options).getChildren());
	}

	@SuppressWarnings("rawtypes")
	void addEcore(String path, EObject ecore, int levels, Map options) {
		EObject s = find(tree, path,false);
		if (s == null) {
			logger.warn("Unable to find " + path + " " + tree);
			return;
		}
		GuiTreeNode n = (GuiTreeNode) s;
		addEcore(n,ecore,levels,options);
	}
	@SuppressWarnings("rawtypes")
	void addEcore(GuiTreeNode n, EObject ecore, int levels, Map options) {
		n.getChildren().addAll(ecore2node(ecore,levels,options).getChildren());
	}
	@SuppressWarnings("rawtypes")
	void addEList(GuiTreeNode n, EList<EObject> l, int levels, Map options) {
		for (EObject ecore: l) {
			n.getChildren().add(ecore2node(ecore,levels,options));
		}
	}
	public GuiTreeNode addSection(String name, GuiView view) {
		GuiTreeNode n1 = f.createGuiTreeNode();
		tree.getSections().add(n1);
		n1.setNodeName(name);
		n1.setView(view); 
		return n1; 
	}
	public GuiTreeNode addNode(String path, String name, GuiView view) {
		EObject s = find(tree, path,false);
		if (s == null) {
			logger.warn("Unable to find " + path + " " + tree); 
			return null;
		}
		GuiTreeNode n = (GuiTreeNode) s;
		GuiTreeNode n1 = f.createGuiTreeNode();
		n.getChildren().add(n1);
		n1.setNodeName(name);
		n1.setView(view);
		return n1;
	}
	private EObject find(EObject o, String path, boolean create) {
		return find(o,path.split("/"),1,create);
	}

	private EObject find(EObject o, String[] path, int i, boolean create) {
		EList<GuiTreeNode> l = null;
		if (i == path.length) return o;
		String name = path[i];
		if (o instanceof GuiTree) {
			GuiTree t = (GuiTree) o;
			l = t.getSections();
		}
		if (o instanceof GuiTreeNode) {
			GuiTreeNode n = (GuiTreeNode) o;
			l = n.getChildren();
		}
		if ( l != null) {
			for (GuiTreeNode n : l) {
				if (name.equals(n.getNodeName())) 
					return find(n,path,i+1,create);
			}
		}
		if (create) {
			GuiTreeNode n1 = f.createGuiTreeNode();
			if (o instanceof GuiTree) {
				GuiTree n = (GuiTree) o;
				n.getSections().add(n1);
				n1.setNodeName(name);
				n1.setView(GuiView.NONE);
			}
			if (o instanceof GuiTreeNode) {
				GuiTreeNode n = (GuiTreeNode) o;
				n.getChildren().add(n1);
				n1.setNodeName(name);
				n1.setView(GuiView.NONE);
			}
			return find(n1,path,i+1,create);
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	private GuiTreeNode ecore2node(EObject ecore, int levels, Map options) {
		if (options == null) options = new HashMap();
		GuiTreeNode n = f.createGuiTreeNode();
		if (ecore2node.get(ecore) == null) {
			ecore2node.put(ecore, n);
		}
		EAttribute attr = (EAttribute) ecore.eClass().getEStructuralFeature("name");
		if (attr != null) {
			n.setNodeName((String) ecore.eGet(attr));
		}
		if (n.getNodeName() == null) {
			n.setNodeName("NONAME");
		}
		n.setView(GuiView.OBJECT);
		for (EReference ref : ecore.eClass().getEAllContainments()) {
			Map options1 = newOptions(options,ref.getName());
			int levels1 = newLevels(options1,levels);
			if (levels1 == 0) continue;
			if (ref.isMany() && ! ManagementServer.refIsNamed(ref)) {
				// require NamedEntity
				
			}
			GuiTreeNode n1 = f.createGuiTreeNode();
			n1.setNodeName(ref.getName());
			n.getChildren().add(n1);
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) ecore.eGet(ref);
				// Try 3 times to get list.
				boolean done = false;
				for (int i = 0; i < 3 ; i ++) {
					try {
						List<GuiTreeNode> l2 = new ArrayList<GuiTreeNode>();
						for (EObject o : l) {
							l2.add(ecore2node(o,levels1,options1));
						}
						n1.getChildren().addAll(l2);
						break;
					} catch (ConcurrentModificationException e) {
						continue;
					}
				}
				if (! done ) {
					logger.error("unable to add list: " + ManagementServer.object2ref(ecore) + "@" + ref.getName());
				}
			} else {
				EObject o = (EObject) ecore.eGet(ref);
				if (o != null) {
					GuiTreeNode nn = ecore2node(o,levels1,options1);
					n1.setView(GuiView.OBJECT);
					n1.getChildren().addAll(nn.getChildren());
				}
			}
		}
		return n;
	}

	@SuppressWarnings("rawtypes")
	private static int newLevels(Map options1, int levels) {
		return options1.containsKey("LEVELS") ? (Integer) options1.get("LEVELS") : levels - 1;
	}

	@SuppressWarnings("rawtypes")
	private static Map newOptions(Map options, String name) {
		Object o = options.get(name);
		if (! (o instanceof Map)) return new HashMap();
		return (Map) o;
	}
	
	public void addTables(EList<AbstractTableTemplate> templates) {
		for (AbstractTableTemplate t: templates) {
			for (EObject o : server.findAll(t.getTreePath())) {
				String treePath = ManagementServer.expandPath(o,t.getTablePath(),"$");
				int i = treePath.lastIndexOf("/");
				String prefix = treePath.substring(0,i);
				String name = treePath.substring(i+1);
				System.err.println("Adding table: " + prefix + " " + name);
				if (prefix.equals("/")) {
					logger.error("cannot have table as a section");
					continue;
				}
				else {
					find(tree,prefix,true);
					addNode(prefix, name, GuiView.TABLE);
				}
			}
		}
	}


	public  void printTree() {
		for (GuiTreeNode n : tree.getSections()) {
			printTreeNode(n, "");
		}
	}

	private void printTreeNode(GuiTreeNode t, String indent) {
		System.out.println(indent + t.getNodeName() + ":" + t.getView());
		for (GuiTreeNode n : t.getChildren()) {
			printTreeNode(n, "  " + indent);
		}
	}
	public GuiTree getTree() {
		return tree;
	}
}
