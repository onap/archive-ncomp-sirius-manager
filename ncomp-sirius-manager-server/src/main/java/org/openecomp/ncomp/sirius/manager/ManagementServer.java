
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
	
package org.openecomp.ncomp.sirius.manager;

import static org.openecomp.ncomp.sirius.manager.ManagementServerUtils.printStackTrace;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openecomp.entity.EcompComponent;
import org.openecomp.entity.EcompSubComponent;
import org.openecomp.logger.EcompException;
import org.openecomp.logger.GenericMessagesMessageEnum;
import org.openecomp.ncomp.component.Api;
import org.openecomp.ncomp.component.ApiRequestStatus;
import org.openecomp.ncomp.component.ComponentClass;
import org.openecomp.ncomp.component.ComponentFactory;
import org.openecomp.ncomp.component.DroolsObjectChange;
import org.openecomp.ncomp.core.HasOperationalState;
import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.core.OperationalState;
import org.openecomp.ncomp.sirius.manager.drools.DroolsRuntime;
import org.openecomp.ncomp.sirius.manager.logging.ManagementServerMessageEnum;
import org.openecomp.ncomp.sirius.manager.logging.ManagementServerOperationEnum;
import org.openecomp.ncomp.sirius.manager.logging.NcompLogger;
import org.openecomp.ncomp.sirius.manager.logs.LogMessageManager;
import org.openecomp.ncomp.sirius.manager.metrics.MetricManager;
import org.openecomp.ncomp.sirius.manager.properties.PropertyManager;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;
import org.openecomp.ncomp.sirius.manager.server.ServerFactory;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.ncomp.sirius.manager.server.VersionConfiguration;
import org.openecomp.ncomp.utils.PropertyUtil;
import org.openecomp.ncomp.utils.SortUtil;
import org.openecomp.ncomp.webservice.utils.FileUtils;
import org.openecomp.ncomp.webservice.utils.JsonUtils;

public class ManagementServer implements IRequestHandler, ISiriusServer, ISwaggerHandler  {
	public static final Logger logger = Logger.getLogger(ManagementServer.class);
	static final NcompLogger ecomplogger = NcompLogger.getNcompLogger();
	private static final String PERSIST = "http://openecomp.org/sirius/persistence";
	private Jetty8Client jettyClient;
	private Properties props;
	private String directory;
	private EObject root;
	private IPolicyEngine pe = new SimplePolicyEngine();
	private DroolsRuntime droolsRuntime;

	private EFactory eFactory;
	private String eClassName;
	private String propertyFileName;
	public LogMessageManager logs;
	public MetricManager metrics;
	public PropertyManager properties;
	public boolean isSlave = false;
	private static String version;
	private static String buildVersion;
	private static IVersionConverterHandler versionHandler;

	public ManagementServer(EFactory eFactory, String eClassName, String directory, String propertyFileName) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		this.eFactory = eFactory;
		this.eClassName = eClassName;
		this.directory = directory;
		this.propertyFileName = propertyFileName;
		try {
			props = PropertyUtil.getPropertiesFromClasspath(this.propertyFileName);
			EcompComponent.initialize(props.getProperty("ecomp.component", "UNKNOWN_COMPONENT"));
			EcompSubComponent.initialize(props.getProperty("ecomp.subcomponent", "UNKNOWN_SUBCOMPONENT"));
			logs = new LogMessageManager(this);
			metrics = new MetricManager(this);
			properties = new PropertyManager(this);
		} catch (Exception e) {
			printStackTrace(e);
			System.exit(1);
		}
		// logger.info("Starting Management Server");
		// jettyClient = new Jetty8Client();
	}

	private void setupVersionHandler(String directory) {
		VersionConfiguration v;
		if (version != null) return;
		System.err.println("VVVVVV setupVersionHandler: " + directory);
		try {
			ServerPackage.eINSTANCE.toString();
			v = (VersionConfiguration) loadObjectFromDirectory(ServerFactory.eINSTANCE, "VersionConfiguration", directory, false, null);
		} catch (IOException e1) {
			e1.printStackTrace();
			return;
		}
		version = v.getVersion();
		if (version == null) version = buildVersion;
		if (v.getTranslationHandler() == null) {
			versionHandler = new SimpleVersionHandler();
			versionHandler.setconfiguration(v);
			System.err.println("VVVVVV setupVersionHandler 1");
			return;
		}
		try {
			Class<?> c = Class.forName(v.getTranslationHandler());
			Constructor<?> constructor = c.getConstructor();
			versionHandler = (IVersionConverterHandler) constructor.newInstance();
			versionHandler.setconfiguration(v);
			System.err.println("VVVVVV setupVersionHandler 2: " + v.getTranslationHandler());
		} catch (Throwable e) {
			e.printStackTrace();
			System.err.println("Unable to create instance of class: " + v.getTranslationHandler());
			System.exit(3);
		}
	}

	public ManagementServer() {
		// TODO Auto-generated constructor stub
	}

	static AtomicLong requestId = new AtomicLong();

	@Override
	public Object handleJson(String userName, String action, String resourcePath, JSONObject json, JSONObject context, String clientVersion) {
		logger.debug("handleJson: " + userName + " " + action + " " + resourcePath + " " + context.get("remoteIp"));
		long start = new Date().getTime();
		String reqId = Long.toString(start) + ":" + requestId.incrementAndGet();
		context.put("requestId", reqId);
		Logger logger2 = findRequestLogger(userName, action, resourcePath, context);
		if (logger2.isInfoEnabled()) {
			JSONObject r = new JSONObject();
			r.put("id", reqId);
			r.put("start", start);
			r.put("user", userName);
			r.put("action", action);
			r.put("path", resourcePath);
			r.put("req", json);
			r.put("context", context);
			logger2.info(r.toString());
		}
		if (!pe.permit(userName, action, resourcePath)) { 
			handleJsonReportResult(reqId, start, null, "NOT_PERMITTED", logger2, clientVersion);
			throw EcompException.create(ManagementServerMessageEnum.MANAGEMENT_SERVER_ACTION_FORBIDDEN, userName, action, resourcePath);
		}
		Subject subject = find(resourcePath);
		if (action.equals("UPDATE")) {
			ecomplogger.recordAuditEventStartIfNeeded(ManagementServerOperationEnum.MANAGEMENT_SERVER_UPDATE_RESOURCE,this,root);
			if (subject == null || subject.o == null) {
				throw EcompException.create(ManagementServerMessageEnum.MANAGEMENT_SERVER_RESOURCE_DOES_NOT_EXIST,resourcePath);
			}
			boolean useNulls = false;
			if (context != null && context.has("parameters")) {
				JSONObject m = (JSONObject) context.get("parameters");
				useNulls = m.has("useNulls");
			}
			try {
				json = translateJsonObject(json, clientVersion, version);
				Object res = update(userName, subject, json, useNulls);
				handleJsonReportResult(reqId, start, res, "OK", logger2, clientVersion);
				return res;
			} catch (RuntimeException e) {
				handleJsonReportResult(reqId, start, null, "ERROR", logger2, clientVersion);
				printStackTrace(e);
				throw e;
			}
		}
		if (action.equals("CREATE")) {
			ecomplogger.recordAuditEventStartIfNeeded(ManagementServerOperationEnum.MANAGEMENT_SERVER_CREATE_RESOURCE, this, root);
			String id = null;
			if (subject != null) {
				if (subject.ref == null || subject.ref.isMany()) {
					handleJsonReportResult(reqId, start, null, "CREATE_ON_EXISTING_RESOURCE", logger2, clientVersion);
					throw EcompException.create(ManagementServerMessageEnum.MANAGEMENT_SERVER_RESOURCE_EXIST,resourcePath);
				}
			} else {
				int index = resourcePath.lastIndexOf("/");
				id = resourcePath.substring(index + 1, resourcePath.length());
				subject = find(resourcePath.substring(0, index));
				if (subject == null || subject.o == null) {
					throw new RuntimeException("unable to find resource");
				}
				if (subject.ref == null)
					subject.ref = findRefByName(subject.o, id);
				else
					json.put("name", id);
			}
			json = translateJsonObject(json, clientVersion, version);
			Object res = create(subject, json, !json.has("$nosave"));
			handleJsonReportResult(reqId, start, res, "OK", logger2, clientVersion);
			return res;
		}
		if (action.equals("DELETE")) {
			ecomplogger.recordAuditEventStartIfNeeded(ManagementServerOperationEnum.MANAGEMENT_SERVER_DELETE_RESOURCE,this,root);
			if (subject == null || subject.o == null) {
				throw EcompException.create(ManagementServerMessageEnum.MANAGEMENT_SERVER_RESOURCE_DOES_NOT_EXIST,resourcePath);
			}
			Object res = delete(subject);
			handleJsonReportResult(reqId, start, res, "OK", logger2, clientVersion);
			return res;
		}
		if (action.equals("LIST")) {
			ecomplogger.recordAuditEventStartIfNeeded(ManagementServerOperationEnum.MANAGEMENT_SERVER_LIST_RESOURCE,this,root);
			int levels = 1;
			if (context != null && context.has("parameters")) {
				JSONObject m = (JSONObject) context.get("parameters");
				if (m.has("levels"))
					levels = Integer.parseInt((String) m.get("levels"));
				if (m.has("match")) {
					JSONObject res = new JSONObject();
					res.put("list", list2jsonArray(findAll(resourcePath)));
					handleJsonReportResult(reqId, start, res, "OK", logger2, clientVersion);
					return res;
				}
				if (m.has("references")) {
					boolean b = m.getBoolean("references");
					JSONObject res = new JSONObject();
					if (subject == null || subject.o == null) {
						throw EcompException.create(ManagementServerMessageEnum.MANAGEMENT_SERVER_RESOURCE_DOES_NOT_EXIST,resourcePath);
					}
					res.put("list", subjectList2jsonArray(findReferences(root, subject.o, b)));
					handleJsonReportResult(reqId, start, res, "OK", logger2, clientVersion);
					return res;
				}
			}
			if (subject == null || subject.o == null) {
				throw EcompException.create(ManagementServerMessageEnum.MANAGEMENT_SERVER_RESOURCE_DOES_NOT_EXIST,resourcePath);
			}
			Object res = list(subject, levels);
			handleJsonReportResult(reqId, start, res, "OK", logger2, clientVersion);
			return res;
		}
		if (subject == null || subject.o == null) {
			throw EcompException.create(ManagementServerMessageEnum.MANAGEMENT_SERVER_RESOURCE_DOES_NOT_EXIST,resourcePath);
		}
		Object res = operation(subject, action, json, context);
		transformResult(subject,action,res);
		handleJsonReportResult(reqId, start, res, "OK", logger2, clientVersion);
		return res;
	}

	private void transformResult(Subject subject, String action, Object res) {
		String a = (subject != null && subject.o != null) ? ( subject.o.eClass().getInstanceClassName() + "@" + action ) : action;
//		System.out.println("KKKKKKK:" + subject + " " + action + " " + a);
//		System.out.println("KKKKKKK:" + res + " " + props.getProperty(a));
		if ((res instanceof JSONObject) && props.getProperty(a + ".replace") != null) {
			JSONObject json = (JSONObject) res;
			String[] aa = props.getProperty(a + ".replace").split(",");
			transformJsonValues(json,aa[0],aa[1]);
		}
	}

	private void transformJsonValues(JSONObject json, String string1, String string2) {
		for (Iterator<String> i = json.keys(); i.hasNext();) {
			String key = (String) i.next();
			Object o = json.get(key);
			if (o instanceof String) {
				json.put(key, ((String) o).replace(string1,string2));
//				System.out.println("KKKKKKK:" + o + " " + json.get(key));
			}
			if (o instanceof JSONObject) {
				transformJsonValues((JSONObject) o,string1,string2);
			}
			if (o instanceof JSONArray) {
				transformJsonValues((JSONArray) o,string1,string2);
			}
		}
	}

	private void transformJsonValues(JSONArray a, String string1, String string2) {
		for (int i = 0; i < a.length(); i++) {
			Object o = a.get(i);
			if (o instanceof JSONObject) {
				transformJsonValues((JSONObject) o,string1,string2);
			}
			if (o instanceof JSONArray) {
				transformJsonValues((JSONArray) o,string1,string2);
			}
		}
	}

	private Logger findRequestLogger(String userName, String action, String resourcePath, JSONObject context) {
		String logdir = getProps().getProperty("requestlog.dir", "logs");
		if (root instanceof AbstractManagementServer) {
			AbstractManagementServer a = (AbstractManagementServer) root;
			LoggerInfo i = a.getRequestLogger(userName, action, resourcePath, context);
			return ManagementServerUtils.createLogger("requests-" + i.getName(), "INFO", "%d %5p %m%n", logdir);
		}
		return ManagementServerUtils.createLogger("requests-" + action, "INFO", "%d %5p %m%n", logdir);
	}

	private void handleJsonReportResult(String reqId, long start, Object res, String status, Logger logger2, String clientVersion) {
		if (logger2.isInfoEnabled()) {
			JSONObject r = new JSONObject();
			long duration = new Date().getTime() - start;
			r.put("id", reqId);
			r.put("duration", duration);
			r.put("status", status);
			if (res instanceof JSONObject) {
				JSONObject j = (JSONObject) res;
				r.put("res", translateJsonObject(j,version,clientVersion));
			}
			logger2.info(r.toString());
		}
	}

	private JSONObject translateJsonObject(JSONObject json, String version1, String version2) {
		// TODO Auto-generated method stub
		if (json.has("$version")) {
			String jsonVersion = json.getString("$version");
			if (version1 == null) 
				version1 = jsonVersion;
			if (version1 != null && ! version1.equals(jsonVersion)) {
				ecomplogger.warn(ManagementServerMessageEnum.MANAGEMENT_SERVER_JSON_VERSION_MISMATCH, jsonVersion, version1);
				version1 = jsonVersion;
			}
		}
		if (version1 == null) 
			version1 = "UNKNOWN";
		if (versionHandler != null) {
			return versionHandler.translateJsonObject(json,version1,version2);
		}
		return json;
	}

	public void start() throws IOException {
		String versionDirection = directory == null ? null : directory + "/configuration/version";
		if (versionDirection != null) {
			// need to setup version handler before main load
			setupVersionHandler(versionDirection);
		}
		if (directory != null)
			root = load(directory);
		if (root instanceof IPolicyEngine) {
			pe = (IPolicyEngine) root;
		}
		startRecursively(root);
	}

	public static void startRecursively(EObject o) {
		for (EReference ref : o.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o.eGet(ref);
				for (EObject o1 : l) {
					startRecursively(o1);
				}
			} else {
				EObject o1 = (EObject) o.eGet(ref);
				if (o1 != null)
					startRecursively(o1);
			}
		}
		if (o instanceof ISiriusPlugin) {
			ISiriusPlugin p = (ISiriusPlugin) o;
			p.start();
		}
	}

	public EFactory addFactory(EFactory f) {
		if (f.getEPackage() == null) {
			throw new RuntimeException("Null Package: " + f);
		}
		String s = f.getEPackage().getNsURI();
		if (!string2factory.containsKey(s)) {
			string2factory.put(f.getEPackage().getNsURI(), f);
			logger.info("added factory: " + s);
		}
		return string2factory.get(s);
	}

	public void addRuntimeFactories(ISiriusServer server) {
		addRuntimeFactories(server, "runtime.properties");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addRuntimeFactories(ISiriusServer server, String runtimepropertyfile) {
		String v = null;
		try {
			Properties p = PropertyUtil.getPropertiesFromClasspath(runtimepropertyfile);
			for (Object k : p.keySet()) {
				String kk = (String) k;
				v = p.getProperty(kk).trim();
				if (kk.startsWith("factory.")) {
					try {
						System.err.println("Loading runtime factory: " + v);

						Class c = Class.forName(v);
						if (v.endsWith("PackageImpl")) {
							Method m = c.getMethod("init");
							EPackage p1 = (EPackage) m.invoke(null);
							addFactory(p1.getEFactoryInstance());
						} else {
							Constructor constructor = c.getConstructor(new Class[] { ISiriusServer.class });
							addFactory((EFactory) constructor.newInstance(server));
						}
						logger.info("added runtime factory: " + v);
					} catch (Throwable e) {
						System.err.println("Unable to load runtime factory: " + v + " " + e);
						e.printStackTrace();
					}					
				}
			}
		} catch (IOException e) {
			logger.info("No runtime propertyFile " + runtimepropertyfile);
		}
	}

	private EObject load(String directory) throws IOException {
		return loadObjectFromDirectory(eFactory, eClassName, directory, true);
	}

	private EObject loadObjectFromDirectory(EFactory eFactory, String eClassName, String directory, boolean b)
			throws IOException {
		List<Ref> refs = new ArrayList<ManagementServer.Ref>();
		EObject res = loadObjectFromDirectory(eFactory, eClassName, directory, true, refs);
		updateRefs(res, refs);
		return res;
	}

	private EObject loadObjectFromDirectory(EFactory f, String cName, String directory, boolean isRoot, List<Ref> refs)
			throws IOException {
		String jsonFile = directory + (isRoot ? "/ROOT.json" : ".json");
		String yamlFile = directory + (isRoot ? "/ROOT.yaml" : ".yaml");
		JSONObject json;
		try {
			File file = new File(jsonFile);
			if (file.exists())
				json = JsonUtils.file2json(jsonFile);
			else {
				file = new File(yamlFile);
				if (file.exists()) {
					json = JsonUtils.yaml2json(file);
					System.err.println("yaml2json: " + json.toString(2));
				} 
				else
					json = new JSONObject();
			}
		} catch (JSONException e) {
			// printStackTrace(e,);
			throw new RuntimeException("Invalid JSON: " + jsonFile + " " + e);
		}
		json = translateJsonObject(json, null, version);
		EObject res;
		try {
			res = loadObjectFromJson(f, cName, directory, json, refs);
			handleReference(res, json, refs);
			handleTransientAttributes(res, "server");
		} catch (Exception e) {
			printStackTrace(e);
			throw new RuntimeException("Serialization issue: " + jsonFile, e);
		}
		return res;
	}

	private HashMap<String, EFactory> string2factory = new HashMap<String, EFactory>();

	private EObject loadObjectFromJson(EFactory f, String cName, String directory, JSONObject json, List<Ref> refs)
			throws IOException {
		f = addFactory(f);
		HashSet<String> used = new HashSet<String>();
		if (json.has("$ecore")) {
			used.add("$ecore");
			String pp = json.getJSONObject("$ecore").getString("ePackage");
			if (pp == null)
				throw new RuntimeException("Package not found: " + json.toString(2));
			f = string2factory.get(pp);
			cName = json.getJSONObject("$ecore").getString("eClass");
			if (f == null)
				throw new RuntimeException("Factory not found: " + pp);
		}
		if (json.has("$class")) {
			used.add("$class");
			String v = SomfVersionUpgrade(json.getString("$class"));
			int i = v.lastIndexOf(".");
			String pp = v.substring(0, i);
			f = string2factory.get(pp);
			cName = v.substring(i + 1);
			if (f == null) {
				throw new RuntimeException("Factory not found: " + pp);
			}
		}
		if (f == null) {
			throw new RuntimeException("Null Factory: " + json.toString(2));
		}
		if (f.getEPackage() == null) {
			throw new RuntimeException("Null Package: " + f + " " + json.toString(2));
		}
		EClass c = (EClass) f.getEPackage().getEClassifier(cName);
		if (c == null) {
			logger.error("unable to create class: " + cName + " using factory " + f.getEPackage().getName() + " "
					+ json.toString(2));
			throw new RuntimeException("Unable to create class " + cName + " using factory "
					+ f.getEPackage().getName());
		}
		EObject o = f.create(c);
		// if (json.has("$class")) {
		// System.err.println("creating object: " + directory + " " + f + " " +
		// c);
		// System.err.println(cName + " " + json);
		// }
		for (EAttribute attr : o.eClass().getEAllAttributes()) {
			if (!json.has(attr.getName()))
				continue;
			if (o instanceof NamedEntity && attr.getName().equals("lastChanged") || o instanceof NamedEntity
					&& attr.getName().equals("created")) {
				used.add(attr.getName());
				continue;
			}
			used.add(attr.getName());
			Object oJson = json.get(attr.getName());
			if (attr.isMany()) {
				if (!(oJson instanceof JSONArray)) {
					throw new RuntimeException("expect array of value: " + attr.getName());
				}
				JSONArray aJson = (JSONArray) oJson;
				@SuppressWarnings("unchecked")
				EList<Object> l = (EList<Object>) o.eGet(attr);
				for (int i = 0; i < aJson.length(); i++) {
					l.add(jsonValue2attrValue(attr.getEAttributeType(), aJson.get(i)));
				}
			} else {
				Object oo = null;
				try {
					if (attr.getEType().getName().endsWith("MetricAttribute")) {
						// metric: use the metric APIs and need to be done after
						// object is in the main tree.
					} else {
						oo = jsonValue2attrValue(attr.getEAttributeType(), oJson);
						o.eSet(attr, oo);
					}
				} catch (Exception e) {
					logger.error("Unable to set attr: eClass " + o.eClass().getName() + "@" + attr.getName() + " " + e);
					System.err.println("Unable to set attr: eClass " + o.eClass().getName() + "@" + attr.getName()
							+ " " + attr.getEType().getName() + " " + e + " value=" + oJson + " class="
							+ oJson.getClass() + " oo=" + oo + " class=" + (oo != null ? oo.getClass() : ""));
					printStackTrace(e);
				}
			}
		}
		for (EReference ref : o.eClass().getEAllContainments()) {
			if (json.has(ref.getName()) && !jsonHasVersion(json.get(ref.getName()))) {
				// use JSON
				used.add(ref.getName());
				Object oJson = json.get(ref.getName());
				if (ref.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> l = (EList<EObject>) o.eGet(ref);
					EAttribute namingAttr = namingAttribute(ref);
					if (oJson instanceof JSONObject) {
						if (namingAttr != null) {
							JSONObject ooJson = (JSONObject) oJson;
							for (Iterator<String> i = ooJson.keys(); i.hasNext();) {
								String k = i.next();
								if (k.startsWith("$")) continue;
								if (ooJson.get(k) instanceof JSONArray) {
									JSONArray a = (JSONArray) ooJson.get(k);
								}
								if (! (ooJson.get(k) instanceof JSONObject)) {
									throw new RuntimeException("expect json of value: " + o.eClass().getName() + "@"
										+ ref.getName() + "." + k + " " + ooJson.get(k));
								}
								JSONObject json2 = (JSONObject) ooJson.get(k);
								json2.put(namingAttr.getName(), k);
								String dir = directory + "/" + ref.getName();
								l.add(loadObjectFromJson(ref2factory(ref), ref.getEReferenceType().getName(), dir,
										json2, refs));
							}
							continue;
						}

					}
					if (!(oJson instanceof JSONArray)) {
						throw new RuntimeException("expect object or array of value: " + ref.getName());
					}
					JSONArray aJson = (JSONArray) oJson;
					for (int i = 0; i < aJson.length(); i++) {
						if (aJson.get(i) instanceof JSONObject) {
							JSONObject json2 = (JSONObject) aJson.get(i);
							if (namingAttr != null && ! json2.has(namingAttr.getName())) {
								json2.put(namingAttr.getName(),Integer.toString(i));
							}
							String dir = directory + "/" + ref.getName();
							l.add(loadObjectFromJson(ref2factory(ref), ref.getEReferenceType().getName(), dir, json2,
									refs));
						} else
							throw new RuntimeException("expect json of value: " + o.eClass().getName() + "@"
									+ ref.getName());
					}
				} else {
					if (oJson instanceof JSONObject) {
						JSONObject json2 = (JSONObject) oJson;
						String dir = directory + "/" + ref.getName();
						EObject o2 = loadObjectFromJson(ref2factory(ref), ref.getEReferenceType().getName(), dir,
								json2, refs);
						o.eSet(ref, o2);
					} else if (oJson == null || oJson.getClass().getCanonicalName().equals("org.json.JSONObject.Null")) {
						// null
					} else
						throw new RuntimeException("expect json of value: " + f.getEPackage().getName() + "." + cName
								+ " " + ref.getName() + " " + oJson.getClass().getCanonicalName());
				}
			} else if (directory != null) {
				// Look in Directory
				if (ref.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> l = (EList<EObject>) o.eGet(ref);
					File file = new File(directory + "/" + ref.getName());
					if (file.isDirectory()) {
						EAttribute f1 = namingAttribute(ref);
						File[] files = file.listFiles();
						if (files == null) {
							logger.error("directory listing failed IO error??: " + file);
							continue;
						}
						for (File file1 : sortFiles(directory, ref, files, json, used)) {
							if (file1.getName().endsWith(".json")) {
								String name = file1.getName().replace(".json", "");
								String dir2 = directory + "/" + ref.getName() + "/" + name;
								EObject oo = loadObjectFromDirectory(ref2factory(ref), ref.getEType().getName(), dir2,
										false, refs);
								if (f1 != null)
									oo.eSet(f1, name);
								l.add(oo);
							}
						}
					}
				} else {
					File file = new File(directory + "/" + ref.getName() + ".json");
					if (file.exists()) {
						EObject oo = loadObjectFromDirectory(ref2factory(ref), ref.getEType().getName(), directory
								+ "/" + ref.getName(), false, refs);
						o.eSet(ref, oo);
					}
				}
			}
		}
		for (Iterator<String> i = json.keys(); i.hasNext();) {
			String k = i.next();
			if (used.contains(k))
				continue;
			Object o1 = json.get(k);
			if (o1 instanceof JSONObject) {
				JSONObject json1 = (JSONObject) o1;
				if (json1.has("$ref"))
					continue;
			}
			if (o1 instanceof JSONArray) {
				JSONArray a1 = (JSONArray) o1;
				if (a1.length() == 0)
					continue;
				Object o2 = a1.get(0);
				if (o2 instanceof JSONObject) {
					JSONObject json2 = (JSONObject) o2;
					if (json2.has("$ref"))
						continue;
				}
			}
			if (k.equals("$nosave"))
				continue;
			logger.warn("JSON value not used: " + k + " " + f.getEPackage().getName() + "." + cName + " " + json.get(k));
		}
		return o;
	}

	private String SomfVersionUpgrade(String className) {
		if (className.equals("org.openecomp.ncomp.sirius.manager.model.StringMetric"))
			return "org.openecomp.ncomp.core.metrics.StringMetric";
		if (className.equals("org.openecomp.ncomp.sirius.manager.model.DoubleMetric"))
			return "org.openecomp.ncomp.core.metrics.DoubleMetric";
		if (className.equals("org.openecomp.ncomp.sirius.manager.model.LongMetric"))
			return "org.openecomp.ncomp.core.metrics.LongMetric";
		if (className.equals("org.openecomp.ncomp.sirius.manager.model.ModuleProperty"))
			return "org.openecomp.ncomp.sirius.manager.properties.ModuleProperty";
		return className;
	}

	private List<File> sortFiles(String dir, EReference ref, File[] files, JSONObject json, HashSet<String> used) {
		// boolean debug = dir.contains("metricOptions");
		List<File> res = new ArrayList<File>();
		Arrays.sort(files);
		for (File f : files) {
			if (f.getName().endsWith(".json"))
				res.add(f);
		}
		// if (debug) System.err.println("HERE: " + json.toString(2));
		if (ref.isOrdered() && json.has("$order:" + ref.getName())) {
			used.add("$order:" + ref.getName());
			try {
				JSONArray a = json.getJSONArray("$order:" + ref.getName());
				List<File> files1 = new ArrayList<File>();
				HashMap<String, File> m = new HashMap<String, File>();
				for (File f : res) {
					m.put(f.getName(), f);
				}
				for (int i = 0; i < a.length(); i++) {
					String n = a.getString(i) + ".json";
					if (m.containsKey(n)) {
						files1.add(m.remove(n));
						// if (debug) System.err.println("HERE: added1 " +
						// files1.get(files1.size()-1));
					} else {
						logger.warn("files does not contain key:" + n + " in " + dir);
					}
				}
				for (String n : SortUtil.sort(m.keySet())) {
					files1.add(m.get(n));
					// if (debug) System.err.println("HERE: added2 " +
					// files1.get(files1.size()-1));
					logger.warn("order does not contain key:" + n + " in " + dir);
				}
				return files1;
			} catch (Exception e) {
				ManagementServerUtils.printStackTrace(e);
				return res;
			}
		} else {
			return res;
		}
	}

	private HashMap<String, Properties> name2properties = new HashMap<String, Properties>();

	private void handleTransientAttributes(EObject o, String path) {
		for (EAttribute attr : o.eClass().getEAllAttributes()) {
			if (!attr.isTransient())
				continue;
			EAnnotation anno = attr.getEAnnotation(PERSIST);
			if (anno == null)
				continue;
			if (attr.isMany()) {
				logger.warn("property persistence for list attributes not current supported: " + attr2name(attr));
				continue;
			}
			String propertyFile = anno.getDetails().get("propertyFile");
			if (propertyFile == null) {
				logger.warn("Missing persistence detail propertyFile: " + attr2name(attr));
				continue;
			}
			Properties p;
			if (name2properties.get(propertyFile) == null) {
				p = new Properties();
				try {
					p = PropertyUtil.getPropertiesFromClasspath(propertyFile);
				} catch (IOException e) {
					logger.warn("Missing persistence propertyFile: " + propertyFile + " " + e);
				}
				name2properties.put(propertyFile, p);
			}
			p = name2properties.get(propertyFile);
			String path1 = path + "." + attr.getName();
			String s = p.getProperty(path1);
			if (s == null) {
				logger.warn("unable to determine value for: " + attr2name(attr) + " path: " + path1 + " file: "
						+ propertyFile);
			}
			o.eSet(attr, stringValue2attrValue(attr.getEAttributeType(), s));
		}
		for (EReference ref : o.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o.eGet(ref);
				for (EObject oo : l) {
					EStructuralFeature f = oo.eClass().getEStructuralFeature("name");
					if (f instanceof EAttribute) {
						EAttribute attr = (EAttribute) f;
						Object nn = oo.eGet(attr);
						if (!(nn instanceof String))
							continue;
						String path1 = path + "." + ref.getName() + "." + nn;
						handleTransientAttributes(oo, path1);
					}
				}
			} else {
				String path1 = path + "." + ref.getName();
				EObject oo = (EObject) o.eGet(ref);
				if (oo != null)
					handleTransientAttributes(oo, path1);
			}
		}
	}

	private String attr2name(EAttribute attr) {
		StringBuffer b = new StringBuffer();
		b.append(attr.getEContainingClass().getEPackage().getName());
		b.append("::");
		b.append(attr.getEContainingClass().getName());
		b.append("::");
		b.append(attr.getName());
		return b.toString();
	}

	private String ref2name(EReference ref) {
		StringBuffer b = new StringBuffer();
		b.append(ref.getEContainingClass().getEPackage().getName());
		b.append("::");
		b.append(ref.getEContainingClass().getName());
		b.append("::");
		b.append(ref.getName());
		return b.toString();
	}

	int j = 0;
	public boolean saveOnCreate = true;

	private EFactory ref2factory(EReference ref) {
		return ref.getEReferenceType().getEPackage().getEFactoryInstance();
	}

	private EObject loadObjectFromJson(EFactory f, String cName, JSONObject json, List<Ref> refs) {
		try {
			return loadObjectFromJson(f, cName, null, json, refs);
		} catch (IOException e) {
			printStackTrace(e);
		}
		return null;
	}

	static int id = 0;

	public Properties getProps() {
		return props;
	}

	private EReference findRefByName(EObject o, String name) {
		return (EReference) o.eClass().getEStructuralFeature(name);
	}

	@SuppressWarnings("unused")
	private EAttribute findAttrByName(EObject o, String name) {
		return (EAttribute) o.eClass().getEStructuralFeature(name);
	}

	public Subject find(String resourcePath) {
		return find(root, resourcePath);
	}

	static public Subject find(EObject o, String resourcePath) {
		return find(o, resourcePath, false);
	}

	static public Subject find(EObject o, String resourcePath, boolean allowPartial) {
		if (resourcePath.equals("/"))
			return new Subject(o);
		if (resourcePath.startsWith("../.."))
			return (o.eContainer() == null) ? null : find(o.eContainer(), resourcePath.substring(3), allowPartial);
		if (resourcePath.startsWith("../"))
			return (o.eContainer() == null) ? null : find(o.eContainer(), resourcePath.substring(2), allowPartial);
		return find(o, resourcePath.split("/"), 1, allowPartial);
	}

	static private Subject find(EObject o, String[] l, int i, boolean allowPartial) {
		if (o == null)
			return null;
		if (i == l.length)
			return new Subject(o);
		EStructuralFeature f = o.eClass().getEStructuralFeature(l[i]);
		if (f instanceof EReference) {
			EReference ref = (EReference) f;
			if (ref.isMany()) {
				if (i + 1 == l.length)
					return new Subject(o, ref);
				@SuppressWarnings("unchecked")
				EList<EObject> ll = (EList<EObject>) o.eGet(ref);
				for (EObject oo : ll) {
					String s = ecoreId(oo);
					if (s != null && s.equals(l[i + 1]))
						return find(oo, l, i + 2, allowPartial);
				}
				if (allowPartial)
					return new Subject(o, ref);
			} else {
				EObject oo = (EObject) o.eGet(ref);
				if (oo == null && allowPartial)
					return new Subject(o, ref);
				return find(oo, l, i + 1, allowPartial);
			}
		}
		if (f instanceof EAttribute && i + 1 == l.length) {
			return new Subject(o, (EAttribute) f);
		}
		if (allowPartial)
			return new Subject(o);
		return null;
	}

	public List<EObject> findAll(String resourcePath) {
		return findAll(root, resourcePath);
	}

	static public List<EObject> findAll(EObject o, String resourcePath) {
		List<EObject> res = new ArrayList<EObject>();
		if (resourcePath.equals("/") || resourcePath.equals("")) {
			res.add(o);
		} else {
			findAll(o, resourcePath.split("/"), resourcePath.startsWith("/") ? 1 : 0, res);
		}
		return res;
	}

	static private void findAll(EObject o, String[] l, int i, List<EObject> res) {
		if (o == null)
			return;
		if (i == l.length) {
			res.add(o);
			return;
		}
		EStructuralFeature f = o.eClass().getEStructuralFeature(l[i]);
		if (f instanceof EReference) {
			EReference ref = (EReference) f;
			if (ref.isMany()) {
				if (i + 1 == l.length)
					return;
				@SuppressWarnings("unchecked")
				EList<EObject> ll = (EList<EObject>) o.eGet(ref);
				for (EObject oo : ll) {
					String s = ecoreId(oo);
					if (s != null && s.matches(l[i + 1]))
						findAll(oo, l, i + 2, res);
				}
			} else {
				findAll((EObject) o.eGet(ref), l, i + 1, res);
			}
		}
	}

	public static EList<Subject> findReferences(EObject root, EObject o, boolean recursive) {
		EList<Subject> res = new BasicEList<Subject>();
		if (recursive) {
			for (EObject o1 : object2containedObjects(o)) {
				// System.err.println(object2ref(root) + " " + object2ref(o1));
				findReferences(root, o1, res);
			}
		} else
			findReferences(root, o, res);
		return res;
	}

	private static void findReferences(EObject oo, EObject o, EList<Subject> res) {
		if (oo == o)
			return;
		// if (object2ref(oo).startsWith("/con"))
		// System.err.println("XYZZZ: " + object2ref(oo) + " " + object2ref(o));
		for (EReference ref : oo.eClass().getEAllReferences()) {
			if (ref.isContainment()) {
				for (EObject o1 : ref2objects(oo, ref)) {
					findReferences(o1, o, res);
				}
			} else {
				for (EObject o1 : ref2objects(oo, ref)) {
					if (o1 == o) {
						res.add(new Subject(oo, ref));
					}
				}
			}
		}

	}

	@SuppressWarnings("unchecked")
	private static EList<EObject> ref2objects(EObject o, EReference ref) {
		EList<EObject> res = new BasicEList<EObject>();
		Object x = o.eGet(ref);
		if (ref.isMany()) {
			// Try 3 times to create list.
			boolean done = false;
			for (int i = 0; i < 3; i++) {
				try {
					res.clear();
					res.addAll((EList<EObject>) x);
					done = true;
					break;
				} catch (ConcurrentModificationException e) {
					if (i == 2) {
						logger.error("Failing to create object list: " + object2ref(o) + " @ " + ref.getName(), e);
					}
					continue;
				}
			}
			if (!done) {
				System.err.println("unable to create object list: " + object2ref(o) + "@" + ref.getName());

				logger.error("unable to create object list: " + object2ref(o) + "@" + ref.getName());
			}
		} else {
			if (x != null)
				res.add((EObject) x);
		}
		return res;
	}

	public static EList<EObject> object2containedObjects(EObject o) {
		EList<EObject> res = new BasicEList<EObject>();
		object2containedObjects(o, res);
		return res;
	}

	private static void object2containedObjects(EObject o, EList<EObject> res) {
		res.add(o);
		for (EReference ref : o.eClass().getEAllReferences()) {
			if (ref.isContainment()) {
				for (EObject o2 : ref2objects(o, ref)) {
					object2containedObjects(o2, res);
				}
			}
		}
	}

	private Object create(Subject subject, JSONObject json, boolean save) {
		EObject o = subject.o;
		EReference ref = subject.ref;
		if (ref == null)
			throw new RuntimeException("Need ref name");
		List<Ref> refs = new ArrayList<ManagementServer.Ref>();
		EObject oo = loadObjectFromJson(ref2factory(ref), ref.getEReferenceType().getName(), json, refs);
		handleReference(oo, json, refs);
		updateRefs(root, refs);
		if (ref.isMany()) {
			@SuppressWarnings("unchecked")
			EList<EObject> ll = (EList<EObject>) o.eGet(ref);
			ll.add(oo);
		} else {
			if (o.eGet(ref) != null)
				throw new RuntimeException("Cannot create: object already exists");
			o.eSet(ref, oo);
		}
		String path = "server" + object2ref(oo);
		handleTransientAttributes(oo, path.replace("/", "."));
		setCreated(oo);
		if (save) {
			save();
		} else {
			if (logger.isDebugEnabled())
				logger.debug("create not saved: " + object2ref(oo));
		}
		if (oo instanceof ISiriusPlugin) {
			ISiriusPlugin oo2 = (ISiriusPlugin) oo;
			oo2.start();
		}
		return null;
	}

	public EObject json2ecore(EClass eClass, JSONObject json) {
		return json2ecore(eClass, json, true);
	}

	public EObject json2ecore(EClass eClass, JSONObject json, boolean refRelativeToRoot) {
		List<Ref> refs = new ArrayList<ManagementServer.Ref>();
		EObject oo = loadObjectFromJson(eClass.getEPackage().getEFactoryInstance(), eClass.getName(), json, refs);
		handleReference(oo, json, refs);
		updateRefs(refRelativeToRoot ? root : oo, refs);
		return oo;
	}

	public EObject findAndCreate(EObject o, String path) {
		Subject s = findAndCreateSubject(o, path);
		if (s.ref == null)
			return s.o;
		return (EObject) o.eGet(s.ref);
	}

	public Subject findAndCreateSubject(EObject o, String path) {
		Subject s = find(o, path);
		if (s != null && s.o != null) {
			return s;
		}
		int index = path.lastIndexOf("/");
		String id = path.substring(index + 1, path.length());
		if (id.length() == 0) {
			throw new RuntimeException("empty string ID: " + object2ref(o) + " " + path);
		}
		String path1 = path.substring(0, index);
		Subject s1 = findAndCreateSubject(o, path1);
		if (s1 == null || s1.o == null) {
			throw new RuntimeException("unable to find resource: " + object2ref(o) + " " + path);
		}
		s = find(o, path);
		if (s == null) {
			JSONObject json = new JSONObject();
			json.put("$nosave", true); // TODO
			if (s1.ref != null && s1.ref.isMany()) {
				json.put("name", id);
			}
			if (s1.ref == null) {
				s1.ref = findRefByName(s1.o, id);
			}
			// System.err.println("PP creating: " + object2ref(o) + " " + path);
			// Thread.dumpStack();
			create(s1, json, true);
			return find(o, path);
		} else
			return s;
	}

	public Object update(String userName, Subject subject, JSONObject json, boolean useNulls) {
		EObject o = subject.o;
		EReference ref = subject.ref;
		if (json == null)
			throw new RuntimeException("Need object to update");
		if (o == null || ref != null)
			throw new RuntimeException("Need object to update");
		List<Ref> refs = new ArrayList<ManagementServer.Ref>();
		EObject oo = loadObjectFromJson(o.eClass().getEPackage().getEFactoryInstance(), o.eClass().getName(), json,
				refs);
		handleReference(oo, json, refs);
		List<EObject> deleted = new ArrayList<EObject>();
		merge(o, oo, useNulls ? null : json, json.has("$updateEnumWithDefault"), deleted);
		for (EObject o1 : deleted) {
			if (!json.has("$forcedUpdate"))
				checkIfDeleteIsAllowed(o1);
			if (!pe.permit(userName, "DELETE", object2ref(o1))) {
				throw new RuntimeException("Update Action results in DELETE not permitted: " + userName + " "
						+ object2ref(o1));
			}
		}
		if (deleted.size() > 0)
			logger.warn("update deletes: " + objects2ref(deleted));
		updateRefs(root, refs);
		merge(o, oo, useNulls ? null : json, json.has("$updateEnumWithDefault"), null);
		updateMetricValues(o, json);
		if (saveOnCreate && !json.has("$nosave"))
			save();
		return null;
	}

	private void updateMetricValues(EObject o, JSONObject json) {
		// String xx = json == null ? "NULL" : json.toString(2);
		// System.err.println("HERE: " + object2ref(o) + " " + (xx.length() >
		// 1000 ? xx.subSequence(0, 500)+"...." : xx));
		if (json == null)
			return;
		NamedEntity o1 = (o instanceof NamedEntity) ? (NamedEntity) o : null;
		boolean changed = false;
		for (EAttribute attr : o.eClass().getEAllAttributes()) {
			if (!attr.getEType().getName().endsWith("MetricAttribute"))
				continue;
			if (!json.has(attr.getName()))
				continue;
			metrics.updateMetric(o, attr, json.get(attr.getName()));
			changed = true;
		}
		// handle containment references
		for (EReference ref : o.eClass().getEAllReferences()) {
			if (!ref.isContainment())
				continue;
			Object o2 = o.eGet(ref);
			if (o2 == null)
				continue;
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o2;
				for (EObject o3 : l) {
					if (o3 instanceof NamedEntity)
						updateMetricValues(o3, findJsonInNamedList(o3, findJsonWithName(json, ref.getName())));
				}
			} else {
				EObject o3 = (EObject) o2;
				updateMetricValues(o3, findJsonWithName(json, ref.getName()));
			}
		}
		if (changed && o1 != null)
			o1.setLastChanged(new Date());
	}

	public static void merge(EObject o, EObject oo, JSONObject json, boolean updateEnumWithDefault,
			List<EObject> deleted) {
		boolean makeChange = deleted == null;
		NamedEntity o1 = (o instanceof NamedEntity) ? (NamedEntity) o : null;
		boolean changed = false;
		if (json != null && json.has("$useNull"))
			json = null;
		for (EAttribute attr : oo.eClass().getEAllAttributes()) {
			if (!makeChange)
				continue; // TODO verify errors
			EStructuralFeature f = o.eClass().getEStructuralFeature(attr.getName());
			if (!(f instanceof EAttribute))
				continue;
			EAttribute attr1 = (EAttribute) f;
			if (attr.getEType() != attr1.getEType())
				continue;
			if (attr.getName().equals("name"))
				continue; // for now. do not merge name.
			Object o2 = oo.eGet(attr);
			if (json != null && !json.has(attr.getName()))
				continue;
			// TODO handle EEnums better. If o2 is the default value do not
			// update
			if (!updateEnumWithDefault && attr1.getEType() instanceof EEnum) {
				EEnum enum1 = (EEnum) attr1.getEType();
				if (enum1.getDefaultValue() == o2)
					continue;
			}
			Object o3 = o.eGet(attr1);
			if (!objectEquals(o2, o3)) {
				o.eSet(attr1, o2);
				if (o1 != null)
					changed = true;
			}
		}
		// handle non-containment references
		for (EReference ref : oo.eClass().getEAllReferences()) {
			if (!makeChange)
				continue; // TODO verify errors
			if (ref.isContainment() || ref.isContainer())
				continue;
			EStructuralFeature f = o.eClass().getEStructuralFeature(ref.getName());
			if (!(f instanceof EReference))
				continue;
			EReference ref1 = (EReference) f;
			if (ref.getEType() != ref1.getEType()) {
				logger.warn("merge cannot handle different type: " + ref.getEType() + " " + ref1.getEType());
				continue;
			}
			Object o2 = oo.eGet(ref);
			if (json != null && !json.has(ref.getName()))
				continue;
			if (ref.isMany() && json != null && !json.has(ref.getName())) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o2;
				if (l.size() == 0)
					continue;
			}
			Object o3 = o.eGet(ref1);
			if (!objectEquals(o2, o3)) {
				o.eSet(ref1, o2);
				if (o1 != null)
					changed = true;
			}
		}
		// handle containment references
		for (EReference ref : oo.eClass().getEAllReferences()) {
			if (!ref.isContainment())
				continue;
			EStructuralFeature f = o.eClass().getEStructuralFeature(ref.getName());
			if (!(f instanceof EReference))
				continue;
			EReference ref1 = (EReference) f;
			if (ref.getEType() != ref1.getEType()) {
				logger.warn("merge containment cannot handle different type: " + ref.getEType() + " " + ref1.getEType());
				throw new RuntimeException("merge containment cannot handle different type: " + ref.getEType() + " "
						+ ref1.getEType());
			}
			Object o2 = oo.eGet(ref);
			if (json != null && !json.has(ref.getName()))
				continue;
			if (ref.isMany() && json != null && !json.has(ref.getName())) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o2;
				if (l.size() == 0)
					continue;
			}
			Object o3 = o.eGet(ref1);
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l2 = (EList<EObject>) o2;
				@SuppressWarnings("unchecked")
				EList<EObject> l3 = (EList<EObject>) o3;
				EList<EObject> l4 = new BasicEList<EObject>();
				if (l2.size() != l3.size())
					changed = true;
				for (EObject oo2 : l2) {
					EObject oo3 = findInNamedList(l3, oo2);
					if (oo3 != null)
						merge(oo3, oo2, findJsonInNamedList(oo3, findJsonWithName(json, ref.getName())),
								updateEnumWithDefault, deleted);
					else {
						if (makeChange) {
							oo3 = EcoreUtil.copy(oo2);
							setCreated(oo3);
							changed = true;
						}
					}
					l4.add(oo3);
				}
				for (EObject oo3 : l3) {
					// System.err.println("XXYYZZ: " + objects2ref(l4) + " " +
					// object2ref(oo3) + " " +
					// objects2ref(l4).contains(object2ref(oo3)) + " " +
					// l4.contains(oo3));
					if (l4.contains(oo3))
						continue;
					// oo3 deleted
					if (makeChange)
						changed = true;
					else
						deleted.add(oo3);
				}
				if (makeChange) {
					l3.clear();
					l3.addAll(l4);
				}
			} else {
				if (o3 == null && o2 == null)
					continue;
				if (o3 == null && o2 != null) {
					if (makeChange) {
						EObject o4 = EcoreUtil.copy((EObject) o2);
						if (o2.getClass() != o4.getClass()) {
							// TODO issue when o2 is a SOMF provided object. The
							// Type of o4 is not done right.
							System.err.println("Object copy does not preserve class: " + o2.getClass() + " -> "
									+ o4.getClass());
						}
						setCreated(o4);
						o.eSet(ref1, o4);
						changed = true;
					}
					continue;
				}
				if (o3 != null && o2 == null) {
					if (makeChange) {
						o.eSet(ref1, null);
						changed = true;
					} else
						deleted.add((EObject) o3);
					continue;
				}
				merge((EObject) o3, (EObject) o2, findJsonWithName(json, ref.getName()), updateEnumWithDefault, deleted);
			}
		}
		if (changed && o1 != null)
			o1.setLastChanged(new Date());
	}

	private static void setCreated(EObject o) {
		if (o == null)
			return;
		if (o instanceof NamedEntity) {
			NamedEntity n = (NamedEntity) o;
			n.setCreated(new Date());
		}
		// handle containment references
		for (EReference ref : o.eClass().getEAllReferences()) {
			if (!ref.isContainment())
				continue;
			Object o1 = o.eGet(ref);
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o1;
				for (EObject o2 : l)
					setCreated(o2);
			} else
				setCreated((EObject) o1);
		}
	}

	private static JSONObject findJsonWithName(JSONObject json, String name) {
		return (json != null && json.has(name)) ? json.getJSONObject(name) : null;
	}

	private static JSONObject findJsonInNamedList(EObject o, Object json) {
		if (o instanceof NamedEntity) {
			NamedEntity o1 = (NamedEntity) o;
			if (json instanceof JSONObject) {
				JSONObject json1 = (JSONObject) json;
				if (json1.has(o1.getName())) {
					return json1.getJSONObject(o1.getName());
				}
			}
		}
		return null;
	}

	public static EObject findInNamedList(EList<? extends EObject> l, String name) {
		if (name == null)
			return null;
		for (EObject o2 : l) {
			NamedEntity n2 = (o2 instanceof NamedEntity) ? (NamedEntity) o2 : null;
			if (n2 != null && name.equals(n2.getName()))
				return o2;
		}
		return null;
	}

	private static EObject findInNamedList(EList<EObject> l, EObject o) {
		if (o instanceof NamedEntity)
			return findInNamedList(l, ((NamedEntity) o).getName());
		return null;
	}

	private static boolean objectEquals(Object o1, Object o2) {
		if (o1 == null && o2 == null)
			return true;
		if (o1 != null && o2 == null)
			return false;
		if (o2 == null && o1 != null)
			return false;
		return o2.equals(o1);
	}

	private Object delete(Subject subject) {
		if (subject == null || subject.o == null)
			throw new RuntimeException("Object does not exists");
		if (subject.ref != null) {
			for (EObject o : ref2objects(subject.o, subject.ref)) {
				checkIfDeleteIsAllowed(o);
			}
			if (subject.ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> ll = (EList<EObject>) subject.o.eGet(subject.ref);
				ll.clear();
			} else {
				subject.o.eSet(subject.ref, null);
			}
			return null;
		}
		if (subject.o.eContainmentFeature() == null)
			throw new RuntimeException("Cannot delete root object");
		checkIfDeleteIsAllowed(subject.o);
		if (subject.o.eContainmentFeature() instanceof EReference) {
			EReference ref = subject.o.eContainmentFeature();
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> ll = (EList<EObject>) subject.o.eContainer().eGet(ref);
				ll.remove(subject.o);
			} else {
				subject.o.eContainer().eSet(ref, null);
			}
		}
		if (saveOnCreate)
			save();
		return null;
	}

	private void checkIfDeleteIsAllowed(EObject o) {
		// System.err.println("checkIfDeleteIsAllowed: " + o + " size=" +
		// findReferences(root, o, true).size());
		if (findReferences(root, o, true).size() > 0) {
			throw new RuntimeException("Unable to delete object (references exists): " + object2ref(o));
		}
	}

	private Object list(Subject subject, int levels) {
		if (subject == null) {
			return null;
		}
		if (subject.ref == null) {
			return ecore2json(subject.o, levels, null, true);
		}

		// isMany ref need to return a list of IDs
		JSONObject json = new JSONObject();
		json.put(subject.ref.getName(), ecorelist2jsonArray(subject.o, subject.ref));
		return json;
	}

	private static Object ecorelist2jsonArray(EObject o, EReference ref) {
		JSONArray a = new JSONArray();
		@SuppressWarnings("unchecked")
		EList<EObject> ll = (EList<EObject>) o.eGet(ref);
		for (EObject oo : ll) {
			a.put(ecoreId(oo));
		}
		return a;
	}

	private static Object ecorelist2jsonNodeArray(EObject o, EReference ref) {
		JSONObject json = new JSONObject();
		JSONArray a = new JSONArray();
		json.put("$children", a);
		json.put("$ordered", ref.isOrdered());
		@SuppressWarnings("unchecked")
		EList<EObject> ll = (EList<EObject>) o.eGet(ref);
		for (EObject oo : ll) {
			a.put(ecoreId(oo));
		}
		return json;
	}

	private static Object ecore2jsonNode(EObject o, EReference ref) {
		JSONObject json = new JSONObject();
		json.put("$isNull", o == null);
		json.put("$child", ref.getName());
		json.put("$required", ref.isRequired());
		return json;
	}

	private static JSONArray list2jsonArray(List<EObject> ll) {
		JSONArray a = new JSONArray();
		for (EObject oo : ll) {
			a.put(object2ref(oo));
		}
		return a;
	}

	private static JSONArray subjectList2jsonArray(List<Subject> ll) {
		JSONArray a = new JSONArray();
		for (Subject subject : ll) {
			JSONObject o = new JSONObject();
			o.put("path", object2ref(subject.o));
			o.put("ref", subject.ref.getName());
			a.put(o);
		}
		return a;
	}

	public static JSONObject ecore2json(EObject o, int levels, EClass defaultClass, boolean showTransient) {
		return ecore2json(o, levels, defaultClass, showTransient, false, true);
	}

	public static JSONObject ecore2json(EObject o, int levels, EClass defaultClass, boolean showTransient,
			boolean showNaming, boolean showEmptyLists) {
		JSONObject json = new JSONObject();
		if (defaultClass == null && o.eContainer() != null)
			defaultClass = (EClass) o.eContainingFeature().getEType();
		if (levels == -2000) {
			json.put("$name", o.eContainer() == null ? "/" : object2ref(o));
			json.put("$class", o.eClass().getEPackage().getNsURI() + "." + o.eClass().getName());
			json.put("$time", new Date().getTime());
			json.put("$version", "1.10.0");
		} else if (o.eClass() != defaultClass) {
			// object class id not default class
			json.put("$class", o.eClass().getEPackage().getNsURI() + "." + o.eClass().getName());
		}
		// json.put("$implClass", o.getClass().getName());
		EAttribute namingAttr = namingAttribute(o.eContainmentFeature());
		for (EAttribute attr : o.eClass().getEAllAttributes()) {
			if (!showTransient && attr.isTransient())
				continue;
			if (attr.getEAnnotation(PERSIST) != null)
				continue;
			if (!showNaming && attr == namingAttr)
				continue;
			// if (o instanceof NamedEntity &&
			// attr.getName().equals("lastChanged"))
			// continue;
			// if (o instanceof NamedEntity && attr.getName().equals("created"))
			// continue;
			if (attr.isMany()) {
				if (attr.getEType().getInstanceTypeName().equals("org.eclipse.emf.ecore.util.FeatureMap$Entry"))
					continue;
				JSONArray a = new JSONArray();
				json.put(attr.getName(), a);
				@SuppressWarnings("unchecked")
				EList<Object> l = (EList<Object>) o.eGet(attr);
				if (l == null) {
					logger.warn("attribute list returned null: " + object2ref(o) + " " + attr.getName());
					continue;
				}
				for (Object oo : l) {
					a.put(attr2jsonValue(levels, oo, attr.getEType()));
				}
			} else {
				// System.out.println("HERE 99: " + o + " " + attr + " " +
				// o.eGet(attr));
				json.put(attr.getName(), attr2jsonValue(levels, o.eGet(attr), attr.getEType()));
			}
		}
		for (EReference ref : o.eClass().getEAllReferences()) {
			if (ref.isContainment() || ref.isContainer())
				continue;
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o.eGet(ref);
				JSONArray a = new JSONArray();
				for (EObject oo : l) {
					JSONObject json1 = new JSONObject();
					json1.put("$ref", oo == null ? "NULL" : object2ref(oo));
					a.put(json1);
				}
				json.put(ref.getName(), a);
			} else {
				EObject oo = (EObject) o.eGet(ref);
				if (oo == null)
					continue;
				JSONObject json1 = new JSONObject();
				json1.put("$ref", object2ref(oo));
				json.put(ref.getName(), json1);
			}
		}
		for (EReference ref : o.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				if (levels == 0) {
					json.put(ref.getName(), ecorelist2jsonArray(o, ref));
					continue;
				}
				if (levels < -1000) {
					json.put(ref.getName(), ecorelist2jsonNodeArray(o, ref));
					continue;
				}
				if (levels < 0)
					continue;
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o.eGet(ref);
				if (!showEmptyLists && l.size() == 0)
					continue;
				EAttribute f = namingAttribute(ref);
				if (f != null) {
					JSONObject json1 = new JSONObject();
					json.put(ref.getName(), json1);
					for (EObject oo : l) {
						String nn;
						if (oo.eGet(f) instanceof EDataTypeEList) {
							@SuppressWarnings("rawtypes")
							EDataTypeEList xx = (EDataTypeEList) oo.eGet(f);
							nn = xx.toString();
							System.err.println(oo.eClass().getName() + " " + f.getName() + " " + xx);
							continue;
						} else
							nn = (String) oo.eGet(f);
						if (nn == null) {
							logger.warn("name is null " + oo + " " + f);
							continue;
						}
						if (json1.has(nn)) {
							System.err.println("name is already used " + nn + " " + object2ref(o) + "@" + f.getName());
							continue;
						}
						json1.put(
								nn,
								ecore2json(oo, levels - 1, ref.getEReferenceType(), showTransient, showNaming,
										showEmptyLists));
					}
				} else {
					JSONArray a = new JSONArray();
					json.put(ref.getName(), a);
					for (EObject oo : l) {
						a.put(ecore2json(oo, levels - 1, ref.getEReferenceType(), showTransient));
					}
				}
			} else {
				EObject oo = (EObject) o.eGet(ref);
				if (oo != null || levels < -1) {
					if (levels == 0)
						json.put(ref.getName(), new JSONObject());
					else if (levels < -1000)
						json.put(ref.getName(), ecore2jsonNode(oo, ref));
					else if (levels > 0)
						json.put(
								ref.getName(),
								ecore2json(oo, levels - 1, ref.getEReferenceType(), showTransient, showNaming,
										showEmptyLists));
				}

			}
		}
		return json;
	}

	private static EAttribute namingAttribute(EReference ref) {
		if (ref == null || !ref.isMany())
			return null;
		EStructuralFeature f = ref.getEReferenceType().getEStructuralFeature("name");
		if (f instanceof EAttribute) {
			EAttribute ff = (EAttribute) f;
			if (ff.getEType().getInstanceClass().getName().equals("java.lang.String")) {
				return ff;
			}
		}
		return null;
	}

	public static String object2ref(EObject oo) {
		if (oo.eContainer() == null) {
			return "";
		}
		if (!(oo.eContainingFeature() instanceof EReference)) {
			System.err.println("XXXX: oo=" + oo + " fea=" + oo.eContainingFeature());
			throw new RuntimeException("eContainingFeature not an reference: " + oo);
		}
		EReference ref = (EReference) oo.eContainingFeature();
		StringBuffer b = new StringBuffer();
		b.append(object2ref(oo.eContainer()));
		b.append("/");
		b.append(ref.getName());
		if (ref.isMany()) {
			b.append("/");
			b.append(ecoreId(oo));
		}
		return b.toString();
	}

	public static List<String> objects2ref(Collection<EObject> l) {
		List<String> res = new ArrayList<String>();
		for (EObject o : l) {
			res.add(object2ref(o));
		}
		return res;
	}

	public static String relativeObject2ref(EObject o1, EObject oo) {
		if (o1 == oo)
			return "";
		if (oo.eContainer() == null) {
			return null;
		}
		EReference ref = (EReference) oo.eContainingFeature();
		StringBuffer b = new StringBuffer();
		b.append(relativeObject2ref(o1, oo.eContainer()));
		b.append("/");
		b.append(ref.getName());
		if (ref.isMany()) {
			b.append("/");
			b.append(ecoreId(oo));
		}
		return b.toString();
	}

	@SuppressWarnings({ "rawtypes" })
	private Object operation(Subject subject, String action, JSONObject json, JSONObject context) {
		EObject o = subject.o;
		EClass eClass = o.eClass();
		EOperation op = null;
		for (EOperation op1 : eClass.getEAllOperations()) {
			if (op1.getName().equals(action)) {
				op = op1;
				break;
			}
		}
		if (op == null)
			throw new RuntimeException("No such operation:" + action);
		try {
			List<Class> argTypes = new ArrayList<Class>();
			List<Object> args = new ArrayList<Object>();
			for (EParameter p : op.getEParameters()) {
				if (p.getEType().getName().equals("RemoteContext")) {
					// special case for getting context information (e.g. remote
					// IP) to operations.
					if (json.has(p.getName()))
						context.put("remote", json.get(p.getName()));
					args.add(context);
					argTypes.add(JSONObject.class);
					continue;
				}
				if (!json.has(p.getName())) {
					logger.warn("Operation " + PropertyUtil.replaceForLogForcingProtection(action) + " has missing parameter:" + p.getName());
				}
				Object oo = null;
				if (p.isMany()) {
					EList<Object> l = new BasicEList<Object>();
					oo = l;
					if (json.has(p.getName())) {
						Object o2 = json.get(p.getName());
						if (!(o2 instanceof JSONArray)) {
							throw new RuntimeException("parameter need to be a Json array:" + p.getName());
						}
						JSONArray a = (JSONArray) o2;
						for (int i = 0; i < a.length(); i++) {
							Object o3 = a.get(i);
							if (p.getEType() instanceof EClass) {
								EClass eClass1 = (EClass) p.getEType();
								if (!(o3 instanceof JSONObject))
									throw new RuntimeException("parameter need to be a Json object:" + p.getName());
								EObject ooo = parameterObjectFromJson(eClass1, (JSONObject) o3);
								l.add(ooo);
							}
							if (p.getEType() instanceof EDataType) {
								l.add(jsonValue2attrValue((EDataType) p.getEType(), o3));
							}
						}
					}
					args.add(oo);
					argTypes.add(EList.class);
				} else {
					if (json.has(p.getName())) {
						Object o2 = json.get(p.getName());
						if (p.getEType() instanceof EClass) {
							EClass eClass1 = (EClass) p.getEType();
							if (!(o2 instanceof JSONObject))
								throw new RuntimeException("parameter need to be a Json object:" + p.getName());
							EObject ooo = parameterObjectFromJson(eClass1, (JSONObject) o2);
							oo = ooo;
						}
						if (p.getEType() instanceof EDataType) {
							EDataType eType = (EDataType) p.getEType();
							oo = jsonValue2attrValue(eType, o2);
						}

					}
					args.add(oo);
					argTypes.add(p.getEType().getInstanceClass());
				}
			}
			Class<? extends EObject> c = subject.o.getClass();
			Method m = c.getMethod(action, argTypes.toArray(new Class[argTypes.size()]));
			// System.err.println("YYYY: " + o + " " + subject + " " + action +
			// " " + m + " " + argTypes);
			Object oo = m.invoke(o, args.toArray(new Object[args.size()]));
			JSONObject res = new JSONObject();
			if (oo instanceof EList) {
				EList l = (EList) oo;
				JSONArray a = new JSONArray();
				for (Object ooo : l) {
					if (ooo instanceof EObject) {
						EObject eo = (EObject) ooo;
						a.put(ecore2json(eo, 100, (EClass) op.getEType(), true, true, true));
					} else {
						a.put(attr2jsonValue(0, ooo, op.getEType()));
					}
				}
				res.put("returns", a);
			} else if (oo instanceof EObject) {
				EObject eo = (EObject) oo;
				res.put("returns", ecore2json(eo, 100, (EClass) op.getEType(), true, true, true));
			} else {
				res.put("returns", oo == null ? null : attr2jsonValue(0, oo, op.getEType()));
			}
			return res;
		} catch (EcompException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			if (e instanceof InvocationTargetException && e.getCause() instanceof Exception) {
				e = (Exception) e.getCause();
			}
			if (e instanceof EcompException) {
				throw (EcompException) e;
			}
			throw EcompException.create(GenericMessagesMessageEnum.ECOMP_GENERAL_EXCEPTION, e, e.toString());
		}
	}

	private EObject parameterObjectFromJson(EClass eClass1, JSONObject json) {
		if (json.has("$ref")) {
			String path = (String) json.get("$ref");
			if (path.equals("NULL"))
				return null;
			if (path.equals(""))
				return null;
			Subject s = find(root, path);
			if (s.o == null)
				return null;
			if (!eClass1.isInstance(s.o)) {
				throw new RuntimeException("Bad type expected: " + eClass1.getName() + " " + path);
			}
			return s.o;
		}
		List<Ref> refs = new ArrayList<ManagementServer.Ref>();
		EObject ooo = loadObjectFromJson(eClass1.getEPackage().getEFactoryInstance(), eClass1.getName(), json, refs);
		updateRefs(ooo, refs);
		return ooo;
	}

	@Override
	public Object handleBinary(String userName, String action, String resourcePath, InputStream in) {
		if (!pe.permit(userName, action, resourcePath))
			throw new RuntimeException("Action not permitted: " + userName + " " + action + " " + resourcePath);
		return null;
	}

	public Jetty8Client getJettyClient() {
		return jettyClient;
	}

	public void shutdown() {
		// TODO Auto-generated method stub

	}

	public EObject getObject() {
		return root;
	}

	public void setObject(EObject root) {
		this.root = root;
	}

	int i = 0;

	public void save() {
		int j = i++;
		// System.err.println("XXXX save start:" + j);
		save(root, "ROOT", directory, true, root.eClass());
		// System.err.println("XXXX save done:" + j);
		lastSave = new Date();
	}

	private Date lastSave = null;

	public synchronized void save(long ms) {
		Date now = new Date();
		if (lastSave == null || lastSave.getTime() + ms < now.getTime())
			save();
	}

	public void save(EObject o, String id, String directory, boolean singleton, EClass defClass) {
		JSONObject json = ecore2json(o, -1, defClass, false);
		String fname = directory + (o.eContainer() == null ? "/ROOT" : "") + ".json";
		for (EReference ref : o.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				HashSet<String> names = new HashSet<String>();
				// Try 3 times to save list.
				boolean saved = false;
				for (int i = 0; i < 3; i++) {
					try {
						@SuppressWarnings("unchecked")
						EList<EObject> l = (EList<EObject>) o.eGet(ref);
						JSONArray a = new JSONArray();
						for (EObject oo : l) {
							String n = ecoreId(oo);
							if (names.contains(n)) {
								System.err.println("name is already used " + n + " " + object2ref(o) + "@"
										+ ref.getName());
							}
							names.add(n);
							a.put(n);
							String dir2 = directory + "/" + ref.getName() + "/" + n;
							save(oo, null, dir2, false, ref.getEReferenceType());
						}
						if (ref.isOrdered())
							json.put("$order:" + ref.getName(), a);
						saved = true;
						break;
					} catch (ConcurrentModificationException e) {
						// ManagementServerUtils.printStackTrace(e);
						// logger.error("ConcurrentModificationException: " +
						// o.eClass().getName() + "@" + ref.getName());
						continue;
					}
				}
				if (!saved) {
					System.err.println("unable to save object list: " + object2ref(o) + "@" + ref.getName());
					logger.error("unable to save object list: " + object2ref(o) + "@" + ref.getName());
				}
				// delete no longer existing objects.
				File dir = new File(directory + "/" + ref.getName());
				File[] files = dir.listFiles();
				if (files == null)
					continue;
				for (File f : files) {
					if (f.isDirectory() && !names.contains(f.getName())) {
						FileUtils.deleteDirectory(f);
					}
					if (f.getName().endsWith(".json")) {
						String n = f.getName().substring(0, f.getName().length() - 5);
						if (!names.contains(n)) {
							f.delete();
						}
					}
				}
			} else {
				String dir2 = directory + "/" + ref.getName();
				EObject oo = (EObject) o.eGet(ref);
				if (oo == null) {
					File f = new File(dir2);
					if (f.exists())
						FileUtils.deleteDirectory(f);
					f = new File(dir2 + ".json");
					if (f.exists())
						f.delete();
				} else
					save(oo, ecoreId(oo), dir2, true, ref.getEReferenceType());
			}
		}
		storeJson(fname, json);
	}

	HashMap<String, String> cache = new HashMap<String, String>();

	private synchronized void storeJson(String fname, JSONObject json) {
		// TODO cache the data so we do no need to write the same all the time
		// but need to support deletion of files and directory. See save(..)
		// above.
		// String s = json.toString();
		// if (s.equals(cache.get(fname))) return;
		json.put("$version", version);	
		try {
			OutputStreamWriter w = FileUtils.filename2writer(fname + ".tmp");
			w.append(json.toString(2));
			w.close();
			File f1 = new File(fname);
			File f2 = new File(fname + ".tmp");
			f2.renameTo(f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			printStackTrace(e);
		}
	}

	private static String ecoreId(EObject oo) {
		EStructuralFeature f = oo.eClass().getEStructuralFeature("name");
		if (f instanceof EAttribute) {
			EAttribute attr = (EAttribute) f;
			return (String) oo.eGet(attr);
		}
		if (oo.eContainer() != null) {
			if (oo.eContainmentFeature().isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) oo.eContainer().eGet(oo.eContainmentFeature());
				return Integer.toString(l.indexOf(oo));
			} else {
				return oo.eContainmentFeature().getName();
			}
		}
		return "id" + id++;
	}

	// private String jsonId(JSONObject json2) {
	// if (json2.has("name"))
	// return json2.getString("name");
	// return "id" + id++;
	// }

	public static Object attr2jsonValue(int levels, Object o, EClassifier eClassifier) {
		if (!(eClassifier instanceof EDataType))
			return null;
		EDataType t = (EDataType) eClassifier;
		EFactory f = t.getEPackage().getEFactoryInstance();
		// TODO handle int and doubles.
		if (levels == -3 && o == null) {
			JSONObject json = new JSONObject();
			json.put("$isNull", true);
			return json;
		}
		return f.convertToString(t, o);
	}

	public static Object jsonValue2attrValue(EDataType t, Object value) {
		EFactory f = t.getEPackage().getEFactoryInstance();
		// System.err.println("XXXYYZZ: " + t + " value=" + value + " " +
		// value.getClass());
		if (value instanceof String && t.getInstanceClass().equals(Date.class)) {
			try {
				return new Date(Long.parseLong((String) value));
			} catch (NumberFormatException e) {
			}
		}
		if (value instanceof String) {
			String s = (String) value;
			return f.createFromString(t, s);
		}
		if (value instanceof Long && t.getInstanceClass().equals(Date.class)) {
			Long l = (Long) value;
			return new Date(l);
		}
		if (value instanceof Integer && t.getInstanceClass().equals(Date.class)) {
			long l = (Integer) value;
			return new Date(l);
		}
		if (t.getInstanceClass().equals(Long.class) && value instanceof Integer) {
			return Long.valueOf((Integer) value);
		}
		if (t.getInstanceClass().equals(long.class) && value instanceof Integer) {
			return Long.valueOf((Integer) value);
		}
		if (t.getInstanceClass().equals(Long.class) && value instanceof Integer) {
			return Long.valueOf((Integer) value);
		}
		if (t.getInstanceClass().equals(long.class) && value instanceof Integer) {
			return Long.valueOf((Integer) value);
		}
		if (t.getInstanceClass().equals(String.class) && value instanceof Integer) {
			return Integer.toString((int) value);
		}
		if (t.getInstanceClass().equals(String.class) && value instanceof Double) {
			return Double.toString((double) value);
		}
		if (t.getInstanceClass().equals(String.class) && value instanceof Long) {
			return Long.toString((long) value);
		}
		if (t.getInstanceClass().equals(String.class) && value instanceof Boolean) {
			return Boolean.toString((boolean) value);
		}
		if (value instanceof Integer || value instanceof Double || value instanceof Long || value instanceof Boolean) {
			return value;
		}
		return null;
	}

	private Object stringValue2attrValue(EDataType t, String s) {
		EFactory f = t.getEPackage().getEFactoryInstance();
		return f.createFromString(t, s);
	}

	class Ref {
		public Ref(EObject o, EReference ref, Object object) {
			super();
			this.o = o;
			this.ref = ref;
			this.json = (JSONObject) object; // TODO handle error cases
		}

		EObject o;
		EReference ref;
		JSONObject json;

		@Override
		public String toString() {
			return "Ref [o=" + o + ", ref=" + ref + ", json=" + json + "]";
		}
	}

	private void handleReference(EObject o, JSONObject json, List<Ref> refs) {
		// System.out.println ("AAAAupdate : " + object2ref(o) + " " +
		// json.toString(2));
		for (EReference ref : o.eClass().getEAllReferences()) {
			if (!json.has(ref.getName()))
				continue;
			if (ref.isContainer())
				continue;
			if (ref.isContainment()) {
				if (json.has("$version") || jsonHasVersion(json.get(ref.getName())))
					continue;
				if (ref.isMany()) {
					Object x = json.get(ref.getName());
					@SuppressWarnings("unchecked")
					EList<EObject> l = (EList<EObject>) o.eGet(ref);
					if (x instanceof JSONObject) {
						EAttribute f = namingAttribute(ref);
						JSONObject o1 = (JSONObject) x;
						for (EObject oo : l) {
							handleReference(oo, o1.getJSONObject((String) oo.eGet(f)), refs);
						}
					} else {
						JSONArray a = (JSONArray) x;
						int i = 0;
						for (EObject oo : l) {
							handleReference(oo, a.getJSONObject(i), refs);
							i++;
						}
					}
				} else {
					EObject oo = (EObject) o.eGet(ref);
					if (oo == null) continue;
					Object oo1 = json.get(ref.getName());
					if (oo1 != null && oo1.getClass().getCanonicalName().equals("org.json.JSONObject.Null")) {
						oo1 = null;
					}
					if (oo1 instanceof JSONObject || oo1 == null) {
						handleReference(oo, (JSONObject) oo1, refs);
						continue;
					}
					throw new RuntimeException("Unable to handle reference: " + ref.getName()
							+ " " + oo1.getClass().getCanonicalName());
				}
				continue;
			}
			// is reference
			if (ref.isMany()) {
				Object aa = json.get(ref.getName());
				if (aa instanceof JSONArray) {
					JSONArray a = (JSONArray) aa;
					for (int i = 0; i < a.length(); i++) {
						refs.add(new Ref(o, ref, a.get(i)));
					}
				}
			} else {
				refs.add(new Ref(o, ref, json.get(ref.getName())));
			}

		}
		// System.out.println ("AAAAupdate : " + object2ref(o) + " " + refs);
	}

	private boolean jsonHasVersion(Object object) {
		if (object instanceof JSONObject) {
			JSONObject json = (JSONObject) object;
			if (json.has("$version") || json.has("$child") || json.has("$children"))
				return true;
			for (Iterator<String> i = json.keys(); i.hasNext();) {
				String s = i.next();
				if (jsonHasVersion(json.get(s)))
					return true;
			}
		}
		if (object instanceof JSONArray) {
			JSONArray a = (JSONArray) object;
			for (int i = 0; i < a.length(); i++) {
				if (jsonHasVersion(a.get(i)))
					return true;
			}
		}
		return false;
	}

	private void updateRefs(EObject res, List<Ref> refs) {
		for (Ref x : refs) {
			// System.out.println("REF: " + ref2name(x.ref) + " " + x.json);
			// TODO handle error better.
			if (!x.json.has("$ref"))
				continue;
			String path = (String) x.json.get("$ref");
			if (path.equals("NULL"))
				continue;
			if (path.equals(""))
				continue;
			EObject root1 = res;
			if (x.json.has("$refroot")) {
				// Not tested
				String rootpath = (String) x.json.get("$refroot");
				System.err.println("XXXX using new root: " + rootpath);
				if (!rootpath.equals("NULL") && !rootpath.equals("")) {
					Subject s1 = find(root, rootpath);
					System.err.println("XXXX using new root: " + s1);
					if (s1 == null || s1.o != null) {
						root1 = s1.o;
						System.err.println("XXXX using new root: " + root1);
					}
				}
			}
			Subject s = find(root1, path);
			if (s == null || s.ref != null) {
				logger.warn("Unable to determine reference for:" + PropertyUtil.replaceForLogForcingProtection(path));
				continue;
			}
			if (x.ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) x.o.eGet(x.ref);
				l.add(s.o);
			} else {
				try {
					// System.out.println("XXX:" + object2ref(x.o) + " " +
					// object2ref(s.o));
					x.o.eSet(x.ref, s.o);
				} catch (Exception e) {
					// System.out.println("Bad Reference:" + x.o);
					// System.out.println("Bad Reference:" + x.ref + " " +
					// x.ref.getEContainingClass());
					// System.out.println("Bad Reference:" + s.o);
					logger.warn("Bad Reference:" + path + " " + x.json + " " + e);
				}
			}
		}
	}
	
	public static JSONObject translateJson(JSONObject json, String outVersion) {
		if (versionHandler == null) return json;
		return versionHandler.translateJsonObject(json,version,outVersion);
	}

	public static JSONObject params2json(EOperation operation, Object[] params, String outVersion) {
		if (params.length != operation.getEParameters().size()) {
			String n = operation.getEContainingClass().getName() + "@" + operation.getName();
			throw new RuntimeException("Wrong number of arguments for " + n + " got " + params.length + " expected "
					+ operation.getEParameters().size());
		}
		JSONObject json = new JSONObject();
		for (int i = 0; i < params.length; i++) {
			EParameter p = operation.getEParameters().get(i);
			if (p.getEType() instanceof EClass) {
				EClass eClass = (EClass) p.getEType();
				if (p.isMany()) {
					@SuppressWarnings("unchecked")
					List<Object> l = (List<Object>) params[i];
					JSONArray a = new JSONArray();
					for (Object oo : l) {
						JSONObject j = object2json(oo, 100, eClass, true);
						a.put(versionHandler.translateJsonObject(j,version,outVersion));
					}
					json.put(p.getName(), a);
				} else {
					JSONObject j = object2json(params[i], 100, eClass, true);
					json.put(p.getName(), versionHandler.translateJsonObject(j,version,outVersion));
				}

			} else {
				if (p.isMany()) {
					JSONArray a = new JSONArray();
					json.put(p.getName(), a);
					@SuppressWarnings("unchecked")
					List<Object> l = (List<Object>) params[i];
					for (Object oo : l) {
						a.put(attr2jsonValue(0, oo, p.getEType()));
					}
				} else
					json.put(p.getName(), attr2jsonValue(0, params[i], p.getEType()));
			}
		}
		return json;
	}

	private static JSONObject object2json(Object o, int i, EClass eClass, boolean b) {
		if (o instanceof EObject) {
			return ecore2json((EObject) o, i, eClass, b);
		}
		if (o instanceof JSONObject) {
			return (JSONObject) o;
		}
		if (o == null)
			return null;
		throw new RuntimeException("Unable to convert object to json: " + o);
	}

	static ManagementServer staticServer = new ManagementServer();

	public static Object json2response(EOperation operation, JSONObject res, String inVersion) {
		if (res == null)
			return null;
		if (res.length() == 0)
			return null; // TODO Handle this better.
		if (res.has("returns")) {
			if (operation.getEType() instanceof EClass) {
				EClass eClass = (EClass) operation.getEType();
				if (operation.isMany()) {
					EList<EObject> l = new BasicEList<EObject>();
					JSONArray a = res.getJSONArray("returns");
					for (int i = 0; i < a.length(); i++) {
						JSONObject j = a.getJSONObject(i);
						j = versionHandler.translateJsonObject(j, inVersion, version);
						l.add(staticServer.json2ecore(eClass, j));
					}
					return l;
				} else {
					JSONObject j = res.getJSONObject("returns");
					j = versionHandler.translateJsonObject(j, inVersion, version);
					return staticServer.json2ecore(eClass, j);
				}
			} else {
				EDataType eType = (EDataType) operation.getEType();
				if (operation.isMany()) {
					EList<Object> l = new BasicEList<Object>();
					JSONArray a = res.getJSONArray("returns");
					for (int i = 0; i < a.length(); i++) {
						l.add(jsonValue2attrValue(eType, a.get(i)));
					}
					return l;
				} else {
					return jsonValue2attrValue(eType, res.get("returns"));
				}
			}
		}
		throw new ManagementServerError("remote error", res);
	}

	public static String expandPath(EObject o, String pattern, String prefix) {
		// E.g. "foobar/${@name}"
		String x = prefix.equals("$") ? "\\" : "";
		Pattern p = Pattern.compile("(" + x + prefix + "\\{.*?})");
		Matcher m = p.matcher(pattern);
		StringBuffer s = new StringBuffer();
		while (m.find()) {
			String k = m.group(1);
			String k1 = k.substring(2, k.length() - 1);
			try {
				Subject subject = find(o, k1);
				if (subject == null || subject.o == null || subject.attr == null)
					throw new RuntimeException("unable to resolve path: " + k1 + " on " + o);
				m.appendReplacement(s, (String) subject.o.eGet(subject.attr));
			} catch (Exception e) {
				logger.warn("bad expansion: " + e);
				m.appendReplacement(s, x + k);
			}
		}
		m.appendTail(s);
		return s.toString();
	}

	public static OperationalState getOperationalState(EObject a) {
		if (a instanceof HasOperationalState) {
			HasOperationalState o1 = (HasOperationalState) a;
			if (o1.getOperationalState() == OperationalState.SUSPENDED)
				return OperationalState.SUSPENDED;
		}
		if (a.eContainer() != null) {
			if (getOperationalState(a.eContainer()) == OperationalState.SUSPENDED)
				return OperationalState.SUSPENDED;
		}
		return OperationalState.OPERATIONAL;
	}

	public static boolean isSuspended(EObject o, String message) {
		if (getOperationalState(o) == OperationalState.SUSPENDED) {
			logger.warn("Suspended: " + message);
			return true;
		}
		return false;
	}

	public static boolean refIsNamed(EReference ref) {
		// System.err.println("ZZZ : " + ref + " " + ref.getEReferenceType()
		// + " " +
		// ref.getEReferenceType().isSuperTypeOf(ModelPackage.eINSTANCE.getNamedEntity())
		// + " " +
		// ModelPackage.eINSTANCE.getNamedEntity().isSuperTypeOf(ref.getEReferenceType())
		// );
		return true;
	}

	public DroolsRuntime getDroolsRuntime() {
		return droolsRuntime;
	}

	public void setDroolsRuntime(DroolsRuntime droolsRuntime) {
		this.droolsRuntime = droolsRuntime;
	}

	// ECOMP on ECOMP
	public void recordApi(String parentTransactionId, EObject o, String action, ApiRequestStatus status, long duration,
			Object... params) {
		if (!(root instanceof AbstractManagementServer))
			return;
		Api api = findApi(o, action);
		switch (status) {
		case ERROR:
			metrics.addIncreasingULongMetric(api, "numberOfErrorRequests", 1L, false);
			break;
		case START:
			metrics.addIncreasingULongMetric(api, "numberOfRequests", 1L, false);
			break;
		case OKAY:
			metrics.addIncreasingULongMetric(api, "numberOfCompletedRequests", 1L, false);
			metrics.setLongMetric(api, "lastRequestDuration", duration, false);
			break;
		case INPROGRESS:
			break;
		default:
			break;
		}
	}

	public void recordPolicyFire(String droolsRuntime, String ruleName) {
	}

	public void recordPolicyObjectChange(String droolsRuntime, Object o, DroolsObjectChange changeType) {
	}

	private synchronized Api findApi(EObject o, String action) {
		AbstractManagementServer a = (AbstractManagementServer) root;
		if (a.getComponent() == null) {
			a.setComponent(ComponentFactory.eINSTANCE.createComponent());
		}
		String n = o.eClass().getInstanceClassName();
		ComponentClass c = (ComponentClass) findWithName(a.getComponent().getClasses(), n);
		if (c == null) {
			c = ComponentFactory.eINSTANCE.createComponentClass();
			c.setName(n);
			a.getComponent().getClasses().add(c);
		}
		Api api = (Api) findWithName(c.getApis(), action);
		if (api == null) {
			api = ComponentFactory.eINSTANCE.createApi();
			api.setName(action);
			c.getApis().add(api);
		}
		return api;
	}

	public static EObject findWithName(EList<? extends NamedEntity> l, String name) {
		for (NamedEntity n : l) {
			if (n.getName().equals(name))
				return n;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static void copy(EObject o, EObject o1) {
		for (EAttribute attr1 : o1.eClass().getEAllAttributes()) {
			EStructuralFeature f = o.eClass().getEStructuralFeature(attr1.getName());
			System.out.println("DDDDD " + attr1 + "      f=" + f);
			if (f instanceof EAttribute) {
				EAttribute attr = (EAttribute) f;
				System.out.println("DDDDD " + attr + " " + o.eGet(attr));
				o1.eSet(attr1, o.eGet(attr));
			}
		}
		for (EReference ref1 : o1.eClass().getEAllContainments()) {
			EStructuralFeature f = o.eClass().getEStructuralFeature(ref1.getName());
			if (f instanceof EReference) {
				EReference ref = (EReference) f;
				if (ref1.isMany())
					o1.eSet(ref1, EcoreUtil.copyAll((EList<EObject>) o.eGet(ref)));
				else
					o1.eSet(ref1, EcoreUtil.copy((EObject) o.eGet(ref)));
			}
		}

	}

	public static JSONObject ensureHardUpdate(EObject o2, int levels) {
		JSONObject json = ManagementServer.ecore2json(o2, 1000, null, true);
		ensureHardUpdate(json, levels);
		return json;
	}

	private static void ensureHardUpdate(JSONObject json, int levels) {
		if (levels <= 0) {
			json.put("$useNull", 1);
			return;
		}
		for (Iterator<String> i = json.keys(); i.hasNext();) {
			Object o = json.get(i.next());
			if (o instanceof JSONObject) {
				ensureHardUpdate((JSONObject) o, levels - 1);
			}
			if (o instanceof JSONArray) {
				JSONArray a = (JSONArray) o;
				for (int j = 0; j < a.length(); j++) {
					if (a.get(j) instanceof JSONObject) {
						ensureHardUpdate((JSONObject) a.get(j), levels - 1);
					}
				}
			}

		}
	}

	public static void decryptPasswords(EObject o) {
		if (o == null) return;
		for (EAttribute attr : o.eClass().getEAllAttributes()) {
			if (! attr.getEType().getName().equals("EString")) continue;
			if (attr.isMany()) continue;
			String v = (String) o.eGet(attr);
			if (v != null && v.startsWith("rsa:")) {
				o.eSet(attr, JavaHttpClient.decryptPassword(v));
			}
		}
		for (EReference ref : o.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o.eGet(ref);
				for (EObject oo : l) {
					decryptPasswords(oo);
				}
			} else {
				EObject oo = (EObject) o.eGet(ref);
				decryptPasswords(oo);
			}
		}
	}

	@Override
	public ManagementServer getServer() {
		return this;
	}
	

	public JSONObject getSwaggerJson() {
		try { 
			SwaggerUtils swagger = new SwaggerUtils();
			ISwaggerHandler handler = this;
			if (root instanceof ISwaggerHandler) {
				handler = (ISwaggerHandler) root;
			}
			System.err.println("SWAGGER: Start");
			handler.updateSwagger("/resources", swagger);
			System.err.println("SWAGGER: Done");
			JSONObject json = swagger.toJson();
			System.err.println("SWAGGER: " + json.toString(2));
			return json;
		} catch (Exception e) {
			System.err.println("SWAGGER: Error" + e);
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public void updateSwagger(String path, SwaggerUtils swagger) {
		swagger.addTag(path, "Server Configuration",root);
	}

	public JSONArray supportedVersions() {
		JSONArray a = new JSONArray();
		a.put(version);
		return a;
	}

	public static String getBuildVersion() {
		return buildVersion;
	}

	public static void setBuildVersion(String buildVersion) {
		ManagementServer.buildVersion = buildVersion;
	}
}
