
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
	
package org.openecomp.ncomp.sirius.function;



import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.json.JSONObject;

import org.openecomp.ncomp.core.function.*;
import org.openecomp.ncomp.core.types.metrics.MetricAttribute;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.Subject;
import org.openecomp.ncomp.sirius.manager.metrics.MetricManager;
import org.openecomp.ncomp.webservice.utils.JsonUtils;

public class FunctionUtils {
	public static final Logger logger = Logger.getLogger(FunctionUtils.class);

	static public EList<ValuePair> evaluate(EObject o, String path, Function function) {
		return evaluate(o, path, function);
	}

	static public EList<ValuePair> evaluate(EObject o, String path, Function function, boolean debug) {
		EList<ValuePair> res = new BasicEList<ValuePair>();
		for (EObject o1 : ManagementServer.findAll(o, path)) {
			StringValuePair v = FunctionFactory.eINSTANCE.createStringValuePair();
			v.setPath(ManagementServer.object2ref(o1));
			v.setValue(evaluate(o1, function, debug));
			if (debug)
				System.err.println("match0 " + v.getPath() + " " + v.getValue());
			res.add(v);
		}
		return res;
	}

	static public void update(EObject o, String path, Function function) {
		update(o, path, function);
	}

	static public void update(EObject o, String path, Function function, boolean debug) {
		for (EObject o1 : ManagementServer.findAll(o, path)) {
			if (debug)
				System.err.println("update0 " + ManagementServer.object2ref(o1));
			update(o1, function, debug);
		}
	}

	public static void update(Object o, Function function, boolean debug) {
		if (function instanceof RuleUpdateFunction) {
			RuleUpdateFunction e1 = (RuleUpdateFunction) function;
			for (FunctionUpdateRule r : e1.getRules()) {
				if (match(o, r.getMatches(), debug)) {
					if (debug) {
						System.err.println("match7 " + o + " matched " + r.getMatches());
					}
					update(o, r.getUpdates(), debug);
					return;
				}
			}
			return;
		}
		throw new RuntimeException("Unsupported Function: " + function.getClass());
	}

	private static void update(Object o, EList<FunctionUpdate> updates, boolean debug) {
		for (FunctionUpdate u : updates) {
			if (u instanceof FunctionUpdateAttribute) {
				FunctionUpdateAttribute u1 = (FunctionUpdateAttribute) u;
				path2setValue(o, u1.getPath(), u1.getValue(), debug);
			}
		}

	}

	public static String evaluate(Object r, Function filter) {
		return evaluate(r, filter, false);
	}

	static public String evaluate(Object o, Function function, boolean debug) {
		if (function instanceof RuleFunction) {
			RuleFunction e1 = (RuleFunction) function;
			for (FunctionRule r : e1.getRules()) {
				if (match(o, r.getMatches(), debug))
					return value(r.getAction());
			}
			return null;
		}
		throw new RuntimeException("Unsupported Function: " + function.getClass());
	}

	private static boolean match(Object o, EList<FunctionMatch> l, boolean debug) {
		for (FunctionMatch m : l) {
			if (!match(o, m, debug))
				return false;
		}
		return true;
	}

	private static boolean match(Object o, FunctionMatch m, boolean debug) {
		if (debug)
			System.err.println("match2 " + o + " " + m);
		if (m instanceof FunctionMatchAttribute) {
			FunctionMatchAttribute m1 = (FunctionMatchAttribute) m;
			Object o1 = path2value(o, m1.getPath(), debug);
			if (debug)
				System.err.println("match4 " + m1 + " " + o1 + " " + (o1 != null ? o1.getClass() : "NULL"));
			if (o1 instanceof String) {
				String v = (String) o1;
				if (debug)
					System.err.println("match5 " + v.matches(m1.getMatch()));
				return m1.isNegation() ^ v.matches(m1.getMatch());
			}
			if (o1 instanceof Enumerator || o1 instanceof Integer || o1 instanceof Long || o1 instanceof Boolean) {
				if (debug)
					System.err.println("match6 " + o1.toString().matches(m1.getMatch()));
				return m1.isNegation() ^ o1.toString().matches(m1.getMatch());
			}
			// TODO need to report error but only one for each find.
			return false;
		}
		if (m instanceof FunctionMatchMetric && o instanceof EObject) {
			FunctionMatchMetric m1 = (FunctionMatchMetric) m;
			Object o1 = path2value(o, m1.getPath(), debug);
			if (debug)
				System.err.println("match4m " + m1 + " " + o1 + " " + (o1 != null ? o1.getClass() : "NULL"));
			if (o1 instanceof MetricAttribute) {
				double v = MetricManager.getValue((EObject) o, m1.getPath(), m1.getOption());
				if (debug)
					System.err.println("match4mm " + m1 + " " + v);
				if (m1.getLowerBound() != null && m1.getLowerBound() > v)
					return m1.isNegation() ^ false;
				if (m1.getUpperBound() != null && m1.getUpperBound() < v)
					return m1.isNegation() ^ false;
				return m1.isNegation() ^ true;
			}
			return false;
		}
		if (m instanceof FunctionMatchInstanceOf) {
			FunctionMatchInstanceOf m1 = (FunctionMatchInstanceOf) m;
			try {
				Class<?> cls = Class.forName(m1.getEPackage());
				EPackage ePackage = (EPackage) cls.getDeclaredField("eINSTANCE").get(null);
				EClass eClass = (EClass) ePackage.getEClassifier(m1.getEName());
				EObject o1 = (EObject) o;
				// if (o1.eClass().getName().contains("Location")) {
				// System.err.println("YYYY: " + o1.eClass() + " " + eClass +
				// " " + o1.eClass().isInstance(eClass)+ " " +
				// eClass.isInstance(o1.eClass())
				// + " " + o1.eClass().getESuperTypes().contains(eClass));
				// System.err.println("YYYY: " + eClass.getESuperTypes());
				// System.err.println("YYYY: " + o1.eClass().getESuperTypes());
				// }
				// NOTE o1.eClass().isInstance(eClass); does not seem to work.
				return o1.eClass().getEAllSuperTypes().contains(eClass);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("bad class name: " + m1.getEPackage() + "@" + m1.getEName());
			}
		}
		throw new RuntimeException("Unsupported FunctionMatch: " + m.getClass());
	}

	private static Object path2value(Object o, String path, boolean debug) {
		if (o instanceof EObject) {
			EObject o1 = (EObject) o;
			Subject s1 = ManagementServer.find(o1, path);
			if (debug)
				System.err.println("match1 " + path + " " + s1);
//			if (path.contains("/category")) {
//				if (o1 instanceof LogMessageState) {
//					LogMessageState o2 = (LogMessageState) o1;
//					if (debug)
//						System.err.println("match1 " + ManagementServer.ecore2json(o2.getCategory(), 5, null, true).toString(2));
//				}
//				if (debug)
//					System.err.println("match1 " + o1 + " " + ManagementServer.ecore2json(o1, 5, null, true));
//			}
			if (s1 == null || s1.o == null || s1.attr == null) {
				// TODO need to report error but only one for each find.
				return false;
			}
			return s1.o.eGet(s1.attr);
		}
		if (o instanceof JSONObject) {
			return JsonUtils.getValue((JSONObject) o, path.substring(1).replace("/", "."));
		}
		throw new RuntimeException("Unsupported class: " + o.getClass());
	}

	private static void path2setValue(Object o, String path, String value, boolean debug) {
		if (o instanceof EObject) {
			EObject o1 = (EObject) o;
			Subject s1 = ManagementServer.find(o1, path);
			if (debug)
				System.err.println("match1 " + path + " " + s1);
			if (s1 == null || s1.o == null || s1.attr == null) {
				// TODO need to report error but only one for each find.
				return;
			}
			s1.o.eSet(s1.attr, ManagementServer.jsonValue2attrValue(s1.attr.getEAttributeType(), value));
			return;
		}
		if (o instanceof JSONObject) {
			throw new RuntimeException("JSON object not supported object type");
			// return JsonUtils.getValue((JSONObject) o,
			// path.substring(1).replace("/", "."));
		}
		throw new RuntimeException("Unsupported class: " + o.getClass());
	}

	private static String value(FunctionAction action) {
		if (action == null)
			throw new RuntimeException("null action");
		return action.getValue();
	}
}

