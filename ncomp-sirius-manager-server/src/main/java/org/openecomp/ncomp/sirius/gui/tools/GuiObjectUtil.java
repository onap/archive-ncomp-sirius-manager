
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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.openecomp.ncomp.core.types.metrics.*;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.Subject;
import org.openecomp.ncomp.gwt.siriusportal.model.*;
import org.openecomp.ncomp.webservice.utils.DateUtils;

public class GuiObjectUtil {
	public static final Logger logger = Logger.getLogger(GuiObjectUtil.class);
	static ModelFactory f = ModelFactory.eINSTANCE;

	static GuiTree ecore2GuiTree(EObject ecore, int levels, @SuppressWarnings("rawtypes") Map options) {
		GuiTree tree = f.createGuiTree();
		tree.getSections().addAll(ecore2node(ecore,levels,options).getChildren());
		return tree;
	}

	@SuppressWarnings("rawtypes")
	static void addEcore2GuiTree(GuiTree t, String path, EObject ecore, int levels, Map options) {
		Subject s = ManagementServer.find(t, path);
		if (s == null || s.o == null) {
			logger.warn("Unable to find " + path + " " + t);
			return;
		}
		GuiTreeNode n = (GuiTreeNode) s.o;
		addEcore2GuiTree(n,ecore,levels,options);
	}
	@SuppressWarnings("rawtypes")
	static void addEcore2GuiTree(GuiTreeNode n, EObject ecore, int levels, Map options) {
		n.getChildren().addAll(ecore2node(ecore,levels,options).getChildren());
	}
	@SuppressWarnings("rawtypes")
	static void addEList2GuiTree(GuiTreeNode n, EList<EObject> l, int levels, Map options) {
		for (EObject ecore: l) {
			n.getChildren().add(ecore2node(ecore,levels,options));
		}
	}
	static GuiTreeNode addNode2GuiTree(GuiTree t, String path, String name) {
		Subject s = ManagementServer.find(t, path);
		if (s == null || s.o == null) {
			logger.warn("Unable to find " + path + " " + t); 
			return null;
		}
		GuiTreeNode n = (GuiTreeNode) s.o;
		GuiTreeNode n1 = f.createGuiTreeNode();
		n.getChildren().add(n1);
		n1.setNodeName(name);
		return n1;
	}
	@SuppressWarnings("rawtypes")
	private static GuiTreeNode ecore2node(EObject ecore, int levels, Map options) {
		if (options == null) options = new HashMap();
		GuiTreeNode n = f.createGuiTreeNode();
		EAttribute attr = (EAttribute) ecore.eClass().getEStructuralFeature("name");
		if (attr != null) {
			n.setNodeName((String) ecore.eGet(attr));
		}
		if (n.getNodeName() == null) {
			n.setNodeName("NONAME");
		}
		for (EReference ref : ecore.eClass().getEAllContainments()) {
			Map options1 = newOptions(options,ref.getName());
			int levels1 = newLevels(options1,levels);
			if (levels1 == 0) continue;
			GuiTreeNode n1 = f.createGuiTreeNode();
			n1.setNodeName(ref.getName());
			n.getChildren().add(n1);
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) ecore.eGet(ref);
				for (EObject o : l)
					n1.getChildren().add(ecore2node(o,levels1,options1));
			} else {
				EObject o = (EObject) ecore.eGet(ref);
				if (o != null) {
					GuiTreeNode nn = ecore2node(o,levels1,options1);
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

	@SuppressWarnings("rawtypes")
	public static GuiObject ecore2GuiObject(EObject ecore, int levels, Map options) {
		GuiObject n = f.createGuiObject();
		add2GuiObject(n, ecore, levels, options);
		return n;

	}
	
	public static GuiObject addNode2GuiObject(GuiObject o, String name) {
		GuiObject n = f.createGuiObject();
		GuiObjectValueObject v = f.createGuiObjectValueObject();
		v.setV(n);
		v.setValueName(name);
		o.getValues().add(v);
		return n;
	}
	@SuppressWarnings("rawtypes")
	public static void add2GuiObject(GuiObject n, EObject ecore, int levels, Map options) {
		if (levels == 0) return;
		if (options == null) options = new HashMap();
		for (EAttribute attr : ecore.eClass().getEAllAttributes()) {
			Object o = ecore.eGet(attr);
			if (o instanceof IncreasingULongMetricAttribute) { 
				IncreasingULongMetricAttribute m = (IncreasingULongMetricAttribute) o;
				addTimeSeries(n,ecore,attr,Double.toString(m == null ? -999999.9 : m.getValue())); 
				continue;
			}
			if (o instanceof LongMetricAttribute) {
				LongMetricAttribute m = (LongMetricAttribute) o;
				addTimeSeries(n,ecore,attr,Long.toString(m.getValue()));
				continue;
			}
			if (o instanceof DoubleMetricAttribute) {
				DoubleMetricAttribute m = (DoubleMetricAttribute) o;
				addTimeSeries(n,ecore,attr,Double.toString(m.getValue()));
				continue;
			}
			if (o instanceof DateMetricAttribute) {
				DateMetricAttribute m = (DateMetricAttribute) o;
				long t = m.getValue();
				Date d = new Date(t);
				Date now = new Date();
				DateUtils.delay2String(now.getTime()-t);
				addTimeSeries(n,ecore,attr,d.toString() + " " + DateUtils.delay2String(now.getTime()-t));
				continue;
			}
			addString(n,attr.getName(),o == null ? "" : ecore.eGet(attr).toString());
		}
		for (EReference ref : ecore.eClass().getEAllReferences()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) ecore.eGet(ref);
				if (l.size() == 0) {
					addString(n,ref.getName(),"Empty");
					continue;
				}
				if (! ref.isContainment()) {
					Map options1 = (Map) options.get(ref.getName());
					for (EObject o : l) {
						int j = 0;
						if (options1 == null) {
							addString(n,ref.getName() + " #" + j, "Reference " + o.eClass().getName() + ":" + ManagementServer.object2ref(o));
							continue;
						}
//						TODO
//						int levels1 =options1.containsKey("LEVELS") ? (Integer) options1.get("LEVELS") : levels -1;
//						add2GuiObject(n1, o, levels1,options1);
					}
					continue;
				}
				GuiObjectNamedList n1 = f.createGuiObjectNamedList();
				n1.setValueName(ref.getName());
				n.getValues().add(n1);
				for (EObject o : l) {
					GuiNamedObject n2 = f.createGuiNamedObject();
					EAttribute attr = (EAttribute) o.eClass().getEStructuralFeature("name");
					if (attr == null) {
						logger.warn("Class without name: " + o.eClass().getName());
						continue;
					}
					n2.setObjectName((String) o.eGet(attr));
					add2GuiObject(n2, o, levels-1,(Map) options.get(ref.getName()));
					n1.getObjects().add(n2 );
				}
			}
			else {
				EObject o = (EObject) ecore.eGet(ref);
				if (o == null) {
					addString(n,ref.getName(),"Null");
					continue;
				}
				if (! ref.isContainment()) {
					Map options1 = (Map) options.get(ref.getName());
					if (options1 == null) {
						addString(n,ref.getName(),"Reference " + o.eClass().getName() + ":" + ManagementServer.object2ref(o));
						continue;
					}
					int levels1 = options1.containsKey("LEVELS") ? (Integer) options1.get("LEVELS") : levels -1;
					if (options1.containsKey("NAME")) {
						// Add another level
						GuiObjectValueObject n1 = f.createGuiObjectValueObject();
						n.getValues().add(n1 );
						n1.setValueName((String) options1.get("NAME"));
						n1.setV(f.createGuiObject());
						add2GuiObject(n1.getV(), o, levels1,options1);
						continue;
					}
					add2GuiObject(n, o, levels1,options1);
					continue;
				}
				GuiObjectValueObject n1 = f.createGuiObjectValueObject();
				n.getValues().add(n1 );
				n1.setValueName(ref.getName());
				n1.setV(f.createGuiObject());
				add2GuiObject(n1.getV(), o, levels-1,(Map) options.get(ref.getName()));
			}   
		}
	}	
	
	private static void addTimeSeries(GuiObject n, EObject ecore, EAttribute attr, String v) {
		GuiObjectValueTimeSeries t = f.createGuiObjectValueTimeSeries();
		t.setValueName(attr.getName());
		t.setPath(ManagementServer.object2ref(ecore) + "/" + attr.getName());
		t.setV(v);
		n.getValues().add(t);
	}

	private static void addString(GuiObject n, String name, String v) {
		GuiObjectValueString n1 = f.createGuiObjectValueString();
		n1.setV(v);
		n1.setValueName(name);
		n.getValues().add(n1);
	}

	public static void printTree(GuiTree t) {
		for (GuiTreeNode n : t.getSections()) {
			printTreeNode(n, "");
		}
	}

	private static void printTreeNode(GuiTreeNode t, String indent) {
		System.out.println(indent + t.getNodeName());
		for (GuiTreeNode n : t.getChildren()) {
			printTreeNode(n, "  " + indent);
		}
	}
}
