
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

// TODO
//   operations - need to handle body parameter definitions
//   create object - HTTP access control (CORS) issue
//   update object - HTTP access control (CORS) issue
//   ignore subtrees eg. /foo/component/droolsRuntimes
//   handle AbstractManagementServer generically.
//   Swagger annotations
//   Swagger definitions
//   Better handle inheritance

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.openecomp.ncomp.component.ComponentFactory;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.ServerFactory;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerFactory;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerModel;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerNamedObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerOperation;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameter;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerParameterType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerPath;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType;
import org.openecomp.ncomp.sirius.manager.swagger.SwaggerTag;
import org.openecomp.ncomp.webservice.utils.FileUtils;
import org.openecomp.ncomp.webservice.utils.JsonUtils;

public class SwaggerUtils {

	SwaggerModel m;
	Map<String, Object> done = new HashMap<String, Object>();
	private boolean rootTagAdded = false;

	public SwaggerUtils() {
		m = SwaggerFactory.eINSTANCE.createSwaggerModel();
		try {
			JSONObject json = new JSONObject(getTemplate("swagger-api.json"));
			ManagementServer s1 = new ManagementServer();
			s1.setObject(SwaggerFactory.eINSTANCE.createSwaggerModel());
			m = json2swagger(s1, json);
		} catch (Exception e) {
			m = SwaggerFactory.eINSTANCE.createSwaggerModel();
		}
	}

	public static void main(String[] args) throws IOException {
//		 test("/home/ncomp/swagger.json2");
		// testClass(ServerPackage.eINSTANCE.getAbstractManagementServer());
		test2();

	}

	private static void test2() {
		SwaggerUtils u = new SwaggerUtils();
		AbstractManagementServer s = ServerFactory.eINSTANCE.createAbstractManagementServer();
		s.setConfiguration(ServerFactory.eINSTANCE.createAbstractManagementServerConfiguration());
		s.setComponent(ComponentFactory.eINSTANCE.createComponent());
		u.addTag("/foo/configuration", "The Config Tag");
		u.addTag("/foo/component", "The Component Tag");
		u.addTag("/foo", "The Foo Tag");
		u.autoAdd("/foo", s.eClass(), 2);
		System.out.println(u.toJson().toString(2));
	}

	@SuppressWarnings("unused")
	private static void test(String test) throws IOException {
		JSONObject json0 = JsonUtils.file2json(test);
		JSONObject json = JsonUtils.file2json(test);
		ManagementServer s = new ManagementServer();
		s.setObject(SwaggerFactory.eINSTANCE.createSwaggerModel());
		SwaggerModel m = json2swagger(s, json);
		JSONObject json1 = swagger2json(m);
		// System.out.println(json1.toString(2));
		OutputStreamWriter w = FileUtils.filename2writer("target/after.json");
		w.append(json1.toString(2));
		w.close();
		w = FileUtils.filename2writer("target/before.json");
		w.append(json0.toString(2));
		w.close();
	}

	private static void testClass(EClass c) throws JSONException, IOException {
		SwaggerModel m = SwaggerFactory.eINSTANCE.createSwaggerModel();
		try {
			JSONObject json = new JSONObject(getTemplate("swagger-api.json"));
			ManagementServer s1 = new ManagementServer();
			s1.setObject(SwaggerFactory.eINSTANCE.createSwaggerModel());
			m = json2swagger(s1, json);
		} catch (Exception e) {
			throw new RuntimeException("Unable to create initial Swagger object: " + e, e);
		}
		Map<String, Object> done = new HashMap<String, Object>();
		eclass2swagger("/foo", c, m, done);
		System.out.print(swagger2json(m).toString(2));
	}

	private static SwaggerModel json2swagger(ManagementServer s, JSONObject json) throws IOException {
		JSONObject paths = json.getJSONObject("paths");
		for (Iterator<String> i1 = paths.keys(); i1.hasNext();) {
			String k = i1.next();
			JSONObject methods = paths.getJSONObject(k);
			JSONObject json1 = new JSONObject();
			paths.put(k, json1);
			json1.put("methods", methods);
			for (Iterator<String> i2 = methods.keys(); i2.hasNext();) {
				String k2 = i2.next();
				JSONObject method = methods.getJSONObject(k2);
				if (method.has("parameters")) {
					JSONArray parameters = method.getJSONArray("parameters");
					JSONObject parameters1 = new JSONObject();
					method.put("parameters", parameters1);
					for (int i3 = 0; i3 < parameters.length(); i3++) {
						JSONObject parameter = parameters.getJSONObject(i3);
						JSONObject parameter1 = new JSONObject();
						parameters1.put(parameter.getString("name"), parameter1);
						parameter1.put("type", parameter);
						parameter1.put("in", parameter.getString("in"));
						parameter.remove("in");
						handleParameter(parameter);
					}
				}
				if (method.has("security")) {
					JSONArray security = method.getJSONArray("security");
					JSONArray a = new JSONArray();
					method.put("security", a);
					for (int i3 = 0; i3 < security.length(); i3++) {
						JSONObject security1 = security.getJSONObject(i3);
						JSONObject j3 = new JSONObject();
						JSONObject j31 = new JSONObject();
						j3.put("list", j31);
						a.put(j3);
						for (Iterator<String> i4 = security1.keys(); i4.hasNext();) {
							String k4 = i4.next();
							JSONObject j4 = new JSONObject();
							j4.put("name", k4);
							j4.put("roles", security1.getJSONArray(k4));
							j31.put(k4, j4);
						}
					}
				}
				if (method.has("responses")) {
					JSONObject responses = method.getJSONObject("responses");
					for (Iterator<String> i3 = responses.keys(); i3.hasNext();) {
						String k3 = i3.next();
						JSONObject response = responses.getJSONObject(k3);
						if (response.has("schema")) {
							handleParameter(response.getJSONObject("schema"));
						}
					}

				}
			}
		}
		if (json.has("definitions")) {
			JSONObject definitions = json.getJSONObject("definitions");
			for (Iterator<String> i2 = definitions.keys(); i2.hasNext();) {
				String k2 = i2.next();
				JSONObject objectType = definitions.getJSONObject(k2);
				handleParameter(objectType);
				JSONObject properties = objectType.getJSONObject("properties");
				for (Iterator<String> i3 = properties.keys(); i3.hasNext();) {
					String k3 = i3.next();
					JSONObject property = properties.getJSONObject(k3);
					handleParameter(property);
				}
			}
		}
		OutputStreamWriter w = FileUtils.filename2writer("target/middle.json");
		w.append(json.toString(2));
		w.close();
		// System.err.println(json.toString(2));
		s.update("", s.find("/"), json, true);
		System.err.println("SWAGGER: " + "==============================================");
		s.update("", s.find("/"), json, true);
		// SwaggerModel res = (SwaggerModel)
		// s.json2ecore(SwaggerPackage.eINSTANCE.getSwaggerModel(), json);
		return (SwaggerModel) s.getObject();
	}

	private static void handleParameter(JSONObject parameter) {
		if (parameter.has("items")) {
			parameter.put("many", "true");
			JSONObject items = parameter.getJSONObject("items");
			copy(items, parameter, "type");
			copy(items, parameter, "enum");
			copy(items, parameter, "default");
			copy(items, parameter, "$ref");
			parameter.remove("items");
		}
		if (parameter.has("schema")) {
			JSONObject schema = parameter.getJSONObject("schema");
			if (schema.has("$ref")) {
				copy(schema, parameter, "$ref");
				if (schema.has("type") && schema.getString("type").equals("array"))
					parameter.put("many", "true");
			} else {
				JSONObject items = schema.getJSONObject("items");
				parameter.put("many", "true");
				copy(items, parameter, "$ref");
			}
			parameter.remove("schema");
		}

		if (parameter.has("enum")) {
			parameter.put("$class", "org.openecomp.ncomp.sirius.manager.swagger.SwaggerEnumObjectType");
			return;
		}
		if (parameter.has("$ref")) {
			JSONObject r = new JSONObject();
			r.put("$ref", parameter.getString("$ref").substring(1));
			parameter.put("reference", r);
			parameter.remove("$ref");
			parameter.put("$class", "org.openecomp.ncomp.sirius.manager.swagger.SwaggerReferenceObjectType");
			return;
		}
		if (parameter.has("type") && parameter.get("type").equals("object")) {
			parameter.put("$class", "org.openecomp.ncomp.sirius.manager.swagger.SwaggerObjectClassDefinition");
			return;
		}
		parameter.put("$class", "org.openecomp.ncomp.sirius.manager.swagger.SwaggerSimpleObjectType");
		if (parameter.has("additionalProperties")) {
			handleParameter(parameter.getJSONObject("additionalProperties"));
		}

	}

	private static JSONObject swagger2json(SwaggerModel m) throws IOException {
		JSONObject json = ManagementServer.ecore2json(m, 1000, null, true);
		OutputStreamWriter w = FileUtils.filename2writer("target/middle2.json");
		w.append(json.toString(2));
		w.close();
		convertFromObjectToArray(json, "tags", "name");
		json.remove("$class");
		// paths
		JSONObject paths = json.getJSONObject("paths");
		for (Iterator<String> i1 = paths.keys(); i1.hasNext();) {
			String k = i1.next();
			JSONObject methods1 = paths.getJSONObject(k);
			JSONObject methods = methods1.getJSONObject("methods");
			paths.put(k, methods);
			for (Iterator<String> i2 = methods.keys(); i2.hasNext();) {
				String k2 = i2.next();
				JSONObject method = methods.getJSONObject(k2);
				removeDefault(method, "deprecated", "false");
				if (method.has("deprecated"))
					method.put("deprecated", true);
				method.remove("lastChanged");
				removeEmptyList(method, "consumes");
				removeEmptyList(method, "produces");
				if (method.has("parameters")) {
					JSONObject parameters = method.getJSONObject("parameters");
					for (Iterator<String> i3 = parameters.keys(); i3.hasNext();) {
						String k3 = i3.next();
						JSONObject parameter = parameters.getJSONObject(k3);
						handleParameter2(parameter);
					}
					convertFromObjectToArray(method, "parameters", "name");
				}
				// security
				// System.err.println("SWAGGER: " + "METHOD: " +
				// method.toString(2));
				JSONArray security = method.getJSONArray("security");
				JSONArray a = new JSONArray();
				method.put("security", a);
				for (int i3 = 0; i3 < security.length(); i3++) {
					JSONObject ss = security.getJSONObject(i3).getJSONObject("list");
					JSONObject jj = new JSONObject();
					a.put(jj);
					for (Iterator<String> i4 = ss.keys(); i4.hasNext();) {
						String k4 = i4.next();
						ss.getJSONObject(k4);
						jj.put(k4, ss.getJSONObject(k4).getJSONArray("roles"));
					}
				}
				removeEmptyList(method, "security");
				// responses
				JSONObject responses = method.getJSONObject("responses");
				for (Iterator<String> i3 = responses.keys(); i3.hasNext();) {
					String k3 = i3.next();
					JSONObject response = responses.getJSONObject(k3);
					response.remove("lastChanged");
					if (response.has("schema")) {
						handleDefinition2(response.getJSONObject("schema"));
					}
					JSONObject headers = response.getJSONObject("headers");
					for (Iterator<String> i4 = headers.keys(); i4.hasNext();) {
						String k4 = i4.next();
						handleDefinition2(headers.getJSONObject(k4));
					}
					removeEmptyObject(response, "headers");
				}
			}
		}
		// definitions
		if (json.has("definitions")) {
			JSONObject definitions = json.getJSONObject("definitions");
			for (Iterator<String> i2 = definitions.keys(); i2.hasNext();) {
				String k2 = i2.next();
				JSONObject objectType = definitions.getJSONObject(k2);
				handleDefinition2(objectType);
				if (objectType.has("properties")) {
					JSONObject properties = objectType.getJSONObject("properties");
					for (Iterator<String> i3 = properties.keys(); i3.hasNext();) {
						String k3 = i3.next();
						JSONObject property = properties.getJSONObject(k3);
						handleParameter2(property);
						handleXml(property);
					}
				}
				handleXml(objectType);
				removeEmptyList(objectType, "required");
				removeEmptyList(objectType, "allOf");
			}
		}
		// System.err.println(json.toString(2));

		return json;
	}

	private static void handleXml(JSONObject json) {
		if (json.has("xml")) {
			JSONObject xml = json.getJSONObject("xml");
			removeDefault(xml, "wrapped", "false");
			if (xml.has("wrapped"))
				xml.put("wrapped", true);
		}
	}

	private static void handleParameter2(JSONObject parameter) {
		parameter.remove("lastChanged");
		removeDefault(parameter, "required", "false");
		removeEmptyList(parameter, "allOf");
		if (parameter.has("$class")
				&& (parameter.getString("$class").endsWith("SwaggerSimpleObjectType")
						|| parameter.getString("$class").endsWith("SwaggerEnumObjectType") || parameter.getString(
						"$class").endsWith("SwaggerReferenceObjectType"))) {
			handleDefinition2(parameter);
			return;
		}
		JSONObject type = parameter.getJSONObject("type");
		handleDefinition2(type);
		parameter.remove("type");
		copy(type, parameter, "default");
		copy(type, parameter, "description");
		if (type.has("required") && type.getString("required").equals("true"))
			parameter.put("required", true);
		if (parameter.has("in") && parameter.getString("in").equals("body")) {
			JSONObject schema = new JSONObject();
			if (type.has("items")) {
				schema.put("type", "array");
				JSONObject ref = new JSONObject();
				schema.put("items", ref);
				ref.put("$ref", type.getJSONObject("items").get("$ref"));
			} else {
				schema.put("$ref", type.get("$ref"));
			}
			parameter.put("schema", schema);
		} else {
			copy(type, parameter, "type");
			copy(type, parameter, "enum");
			move(type, parameter, "format");
			moveInt(type, parameter, "minimum");
			moveInt(type, parameter, "maximum");
			if (type.has("items")) {
				parameter.put("type", "array");
			}
			copy(type, parameter, "items");
			copy(type, parameter, "collectionFormat");
		}
		if (parameter.has("additionalProperties")) {
			handleDefinition2(parameter.getJSONObject("additionalProperties"));
		}
		removeEmptyList(parameter, "comsumes");
		removeEmptyList(parameter, "produces");
		parameter.remove("lastChanged");
	}

	private static void handleDefinition2(JSONObject definition) {
		definition.remove("lastChanged");
		removeDefault(definition, "required", "false");
		if (definition.has("reference")) {
			definition.put("$ref", "#" + definition.getJSONObject("reference").getString("$ref"));
			definition.remove("reference");
			definition.remove("type");
		}
		if (definition.getBoolean("many")) {
			JSONObject items = new JSONObject();
			definition.put("items", items);
			move(definition, items, "type");
			move(definition, items, "enum");
			move(definition, items, "default");
			move(definition, items, "$ref");
			move(definition, items, "format");
			move(definition, items, "minimum");
			move(definition, items, "maximum");
			definition.put("type", "array");
		}
		removeDefault(definition, "collectionFormat", "csv");

		definition.remove("many");
		definition.remove("$class");
	}

	private static void removeEmptyList(JSONObject json, String key) {
		if (json.has(key) && json.getJSONArray(key).length() == 0) {
			json.remove(key);
		}
	}

	private static void removeEmptyObject(JSONObject json, String key) {
		if (json.has(key) && json.getJSONObject(key).length() == 0) {
			json.remove(key);
		}
	}

	private static void removeDefault(JSONObject json, String key, Object value) {
		if (json.has(key) && value.equals(json.get(key)))
			json.remove(key);
	}

	private static void convertFromObjectToArray(JSONObject res, String key, String name) {
		JSONObject j = res.getJSONObject(key);
		JSONArray a = new JSONArray();
		for (Iterator<String> i1 = j.keys(); i1.hasNext();) {
			String k = i1.next();
			JSONObject j1 = new JSONObject();
			j1.put(name, k);
			a.put(JsonUtils.merge(j1, j.getJSONObject(k)));
		}
		res.put(key, a);
	}

	private static void copy(JSONObject from, JSONObject to, String key) {
		if (from.has(key))
			to.put(key, from.get(key));
	}

	private static void move(JSONObject from, JSONObject to, String key) {
		if (from.has(key)) {
			to.put(key, from.get(key));
			from.remove(key);
		}
	}

	private static void moveInt(JSONObject from, JSONObject to, String key) {
		if (from.has(key)) {
			to.put(key, from.getInt(key));
			from.remove(key);
		}
	}

	@SuppressWarnings("unused")
	private static void moveBoolean(JSONObject from, JSONObject to, String key) {
		if (from.has(key)) {
			to.put(key, from.getBoolean(key));
			from.remove(key);
		}
	}

	public static JSONObject server2json(ManagementServer s) {
		try {
			return swagger2json(server2swagger(s));
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to create Swagger object");
		}

	}

	private static SwaggerModel server2swagger(ManagementServer s) {
		SwaggerModel m = SwaggerFactory.eINSTANCE.createSwaggerModel();
		try {
			JSONObject json = new JSONObject(getTemplate("swagger-api.json"));
			ManagementServer s1 = new ManagementServer();
			s1.setObject(SwaggerFactory.eINSTANCE.createSwaggerModel());
			m = json2swagger(s1, json);
		} catch (Exception e) {
			throw new RuntimeException("Unable to create initial Swagger object: " + e, e);
		}
		Map<String, Object> done = new HashMap<String, Object>();
		eclass2swagger("/resources", s.getObject().eClass(), m, done);
		return m;
	}

	static List<EClass> allEClasses = null;

	private static List<EClass> findSubClasses(EClass c) {
		List<EClass> res = new ArrayList<EClass>();
		if (allEClasses == null) {
			allEClasses = new ArrayList<EClass>();
			Registry i = EPackage.Registry.INSTANCE;
			for (String x : i.keySet()) {
				System.err.println("SWAGGER: " + x + " " + i.get(x));
				if (i.get(x) instanceof EPackage) {
					EPackage p = (EPackage) i.get(x);
					for (EClassifier c1 : p.getEClassifiers()) {
						if (c1 instanceof EClass) {
							EClass c2 = (EClass) c1;
							allEClasses.add(c2);
						}
					}
				}
			}
		}
		for (EClass c1 : allEClasses) {
			if (c.isSuperTypeOf(c1))
				res.add(c1);
		}
		return res;
	}

	private static String getTemplate(String resource) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] data = new byte[65536];
		InputStream is = SwaggerUtils.class.getClassLoader().getResourceAsStream(resource);
		if (is == null) {
			throw new RuntimeException("Unable to find resource: " + resource);
		}
		int i;
		try {
			while ((i = is.read(data)) > 0) {
				baos.write(data, 0, i);
			}
		} catch (Exception e) {
			ManagementServerUtils.printStackTrace(e);
		} finally {
			if (is != null)
				is.close();
		}
		return (new String(baos.toByteArray()));
	}

	private static void eclass2swagger(String path, EClass eClass, SwaggerModel m, Map<String, Object> done) {
		String key = "eclass:" + eClass.getEPackage().getNsURI() + ":" + eClass.getName();
		System.err.println("SWAGGER: " + key + " " + path);
		if (done.containsKey(key))
			return;
		done.put(key, "");
		String tag = eclass2tag(eClass, m, done);
		SwaggerPath p = SwaggerFactory.eINSTANCE.createSwaggerPath();
		p.setName(path);
		m.getPaths().add(p);
		p.getMethods().add(method("get", tag, "List object of type: " + eClass.getName()));
		for (EReference ref : eClass.getEAllContainments()) {
			for (EClass c1 : findSubClasses(ref.getEReferenceType())) {
				eclass2swagger(path + "/" + ref.getName(), c1, m, done);
			}
		}
	}

	public void autoAdd(String path, EClass eClass, int levels) {
		autoAdd(path, eClass, levels, new ArrayList<String>());
	}

	public void autoAdd(String path, EClass eClass, int levels, List<String> pathVars) {
		if (levels < 0)
			return;
		String key = "eclassAtPath:" + eClassName(eClass) + "@" + path;
		if (done.containsKey(key))
			return;
		// System.err.println("SWAGGER: " + key + " " + path);
		done.put(key, "");
		String tag = path2tag(path);
		SwaggerPath p = SwaggerFactory.eINSTANCE.createSwaggerPath();
		p.setName(path);
		m.getPaths().add(p);
		p.getMethods().add(listObjectMethod(tag, eClass, pathVars));
		p.getMethods().add(createObjectMethod(tag, eClass, pathVars));
		p.getMethods().add(updateObjectMethod(tag, eClass, pathVars));
		p.getMethods().add(deleteObjectMethod(tag, eClass, pathVars));
		for (EOperation op : eClass.getEAllOperations()) {
			operationObjectMethod(path, tag, eClass, pathVars, op);
		}
		for (EReference ref : eClass.getEAllContainments()) {
			addListObjectPath(path, pathVars, ref);
			List<EClass> l = findSubClasses(ref.getEReferenceType());
			List<EClass> l2 = new ArrayList<EClass>();
			for (EClass c1 : l) {
				String key2 = "eclass:recursion:" + tag + ":" + eClassName(eClass) + ":" + eClassName(c1);
				if (done.containsKey(key2))
					continue;
				done.put(key2, "");
				l2.add(c1);
			}
			int index = 0;
			for (EClass c1 : l2) {
				List<String> vars = new ArrayList<String>();
				vars.addAll(pathVars);
				String v = pathVar(ref, l2, index++);
				if (v.length() > 0)
					vars.add(v.substring(2, v.length() - 1));
				autoAdd(path + "/" + ref.getName() + v, c1, levels - 1, vars);
			}
		}
		// System.err.println("SWAGGER: DONE " + key + " " + path);
	}

	private void addListObjectPath(String path, List<String> pathVars, EReference ref) {
		if (!ref.isMany())
			return;
		String path1 = path + "/" + ref.getName();
		String tag = path2tag(path1);
		SwaggerPath p = SwaggerFactory.eINSTANCE.createSwaggerPath();
		p.setName(path1);
		m.getPaths().add(p);
		SwaggerOperation method = method("get", tag, "List " + ref.getName() + " names");
		addPathParameters(method, pathVars);
		p.getMethods().add(method);
	}

	private void addPathParameters(SwaggerOperation method, List<String> pathVars) {
		for (String v : pathVars) {
			addParameter(method, v, SwaggerParameterType.PATH, "string", null, null);
		}
	}

	private SwaggerOperation listObjectMethod(String tag, EClass c, List<String> pathVars) {
		SwaggerOperation method = method("get", tag, "List object of type: " + c.getName());
		addPathParameters(method, pathVars);
		addParameter(method, "levels", SwaggerParameterType.QUERY, "string", "1", "The number of levels return");
		return method;
	}

	private SwaggerOperation createObjectMethod(String tag, EClass c, List<String> pathVars) {
		SwaggerOperation method = method("post", tag, "Create new object of type: " + c.getName());
		addPathParameters(method, pathVars);
		addBodyParameter(method, c);
		return method;
	}

	private void addBodyParameter(SwaggerOperation method, EClass c) {
		SwaggerParameter p = SwaggerFactory.eINSTANCE.createSwaggerParameter();
		p.setName("body");
		p.setIn(SwaggerParameterType.BODY);
		SwaggerReferenceObjectType type = SwaggerFactory.eINSTANCE.createSwaggerReferenceObjectType();
		type.setRequired(true);
		type.setReference(findDefinition(c));
		p.setType(type);
		type.setDescription("JSON representation of " + c.getName());
		method.getParameters().add(p);
	}

	private SwaggerObjectClassDefinition findDefinition(EClass c) {
		String key = "definition:" + eClassName(c);
		if (done.containsKey(key))
			return (SwaggerObjectClassDefinition) done.get(key);
		
		SwaggerObjectClassDefinition res = SwaggerFactory.eINSTANCE.createSwaggerObjectClassDefinition();
		
		res.setName(c.getName());
		for (EAttribute attr: c.getEAllAttributes()) {
			SwaggerSimpleObjectType p = newSimpleType("string", attr.isRequired());
			// TODO fix more stuff here
			p.setName(attr.getName());
			res.getProperties().add(p);
		}
		m.getDefinitions().add(res);
		done.put(key,res);
		return res ;
	}
	
	private SwaggerObjectClassDefinition operationDefinition(EOperation op) {
		SwaggerObjectClassDefinition res = SwaggerFactory.eINSTANCE.createSwaggerObjectClassDefinition();
		res.setName(op.getEContainingClass().getName() + "@" + op.getName());
		for (EParameter param: op.getEParameters()) {
			SwaggerSimpleObjectType p = newSimpleType("string", param.isRequired());
			// TODO fix more stuff here
			p.setName(param.getName());
			res.getProperties().add(p);
		}
		m.getDefinitions().add(res);
		return res;
	}

	private SwaggerOperation updateObjectMethod(String tag, EClass c, List<String> pathVars) {
		SwaggerOperation method = method("put", tag, "Update existing object of type: " + c.getName());
		addPathParameters(method, pathVars);
		addBodyParameter(method, c);
		return method;
	}

	private SwaggerOperation deleteObjectMethod(String tag, EClass c, List<String> pathVars) {
		SwaggerOperation method = method("delete", tag, "Delete existing object of type: " + c.getName());
		addPathParameters(method, pathVars);
		return method; 
	}
	
	private SwaggerOperation operationObjectMethod(String path, String tag, EClass c, List<String> pathVars, EOperation op) {
		SwaggerOperation method = method("put", tag, "Delete existing object of type: " + c.getName());
		addParameter(method, "action", SwaggerParameterType.HEADER, "string", op.getName(), null);
		addPathParameters(method, pathVars);
		SwaggerPath p = SwaggerFactory.eINSTANCE.createSwaggerPath();
		p.setName(path + "/_ACTION/" + op.getName());
		m.getPaths().add(p);
		p.getMethods().add(method);
		
		
		// TODO this makes the toJson() crash.
		SwaggerParameter parameter = SwaggerFactory.eINSTANCE.createSwaggerParameter();
		parameter.setName("body");
		parameter.setIn(SwaggerParameterType.BODY);
		SwaggerReferenceObjectType type = SwaggerFactory.eINSTANCE.createSwaggerReferenceObjectType();
		type.setRequired(true);
		type.setReference(operationDefinition(op));
		parameter.setType(type);
		type.setDescription("JSON representation of " + c.getName());
		method.getParameters().add(parameter);

//		SwaggerObjectClassDefinition type = SwaggerFactory.eINSTANCE.createSwaggerObjectClassDefinition();
//		parameter.setType(type);
//		type.setDescription("JSON representation of parameters to " + op.getName());
//		for (EParameter p1 : op.getEParameters()) {
//			type.getProperties().add(eparam2property(p1));
//		}

		return method; 
	}

	@SuppressWarnings("unused")
	private SwaggerNamedObjectType eparam2property(EParameter p1) {
		SwaggerSimpleObjectType p = newSimpleType("string", p1.isRequired());
		return p;
	}

	private static void addParameter(SwaggerOperation method, String name, SwaggerParameterType ptype, String type,
			String def, String description) {
		SwaggerParameter p = SwaggerFactory.eINSTANCE.createSwaggerParameter();
		p.setName(name);
		p.setIn(ptype);
		SwaggerSimpleObjectType stype = newSimpleType(type, def == null);
		p.setType(stype);
		stype.setDescription(description);
		method.getParameters().add(p);
	}

	private String pathVar(EReference ref, List<EClass> l, int index) {
		String indexName = l.size() == 1 ? "" : Integer.toString(index);
		if (!ref.isMany())
			return indexName.equals("") ? "" : "{" + indexName + "}";
		String name = ref.getName();
		if (name.endsWith("ies"))
			name = name.substring(0, name.length() - 3) + "y";
		else if (name.endsWith("es"))
			name = name.substring(0, name.length() - 2);
		else if (name.endsWith("s"))
			name = name.substring(0, name.length() - 1);
		return "/{" + name + indexName + "}";
	}

	private String eClassName(EClass eClass) {
		return eClass.getEPackage().getNsURI() + ":" + eClass.getName();
	}

	private String path2tag(String path) {
		String res = null;
		String tagName = path2tagName(path);
		System.err.println("path=" + path + " tagName=" + tagName);
		for (SwaggerTag tag : m.getTags()) {
			if (!tagName.startsWith(tag.getName()))
				continue;
			if (res != null && tag.getName().length() < res.length())
				continue;
			res = tag.getName();
		}
		if (res == null) {
			if (!rootTagAdded) {
				rootTagAdded = true;
				addTag("ROOT", "Anything else");
			}
			res = "ROOT";
		}
		return res;
	}

	private String path2tagName(String path) {
		// SWAGGER does not support / in tags
		if (path.contains("/"))
			return path.substring(1).replace("/", "-");
		return path;
	}

	private static SwaggerOperation method(String name, String tag, String description) {
		SwaggerOperation res = SwaggerFactory.eINSTANCE.createSwaggerOperation();
		res.setName(name);
		res.setDescription(description);
		res.getTags().add(tag);
		// SwaggerParameter p =
		// SwaggerFactory.eINSTANCE.createSwaggerParameter();
		// p.setName("Authorization");
		// p.setIn(SwaggerParameterType.HEADER);
		// p.setType(newSimpleType("string",true));
		// res.getParameters().add(p);
		addParameter(res, "Authorization", SwaggerParameterType.HEADER, "string", null, "Basic HTTP Authorization");
		addParameter(res, "X-ECOMP-RequestID", SwaggerParameterType.HEADER, "string", null, "ECOMP Request ID");
		return res;
	}

	private static SwaggerSimpleObjectType newSimpleType(String type, boolean required) {
		SwaggerSimpleObjectType res = SwaggerFactory.eINSTANCE.createSwaggerSimpleObjectType();
		res.setRequired(required);
		res.setType(type);
		return res;
	}

	private static String eclass2tag(EClass eClass, SwaggerModel m, Map<String, Object> done) {
		String key = "tag:" + eClass.getEPackage().getNsURI();
		if (done.containsKey(key))
			return (String) done.get(key);
		SwaggerTag tag = SwaggerFactory.eINSTANCE.createSwaggerTag();
		tag.setName(eClass.getEPackage().getNsURI());
		m.getTags().add(tag);
		done.put(key, tag.getName());
		return tag.getName();
	}

	public void autoAddApi(String path, EObject o) {
		System.err.println("SWAGGER: autoAddApi " + path + " " + o + " \n");
		// Thread.dumpStack();
		if (alreadyDone("auto-add-api: " + path + " : " + o.hashCode()))
			return;
		if (o instanceof ISwaggerHandler) {
			ISwaggerHandler handler = (ISwaggerHandler) o;
			handler.updateSwagger(path, this);
		} else
			autoAdd(path, o.eClass(), 1000);
		System.err.println("SWAGGER: autoAddApi DONE" + path + " " + o);
	}

	/**
	 * Adds Swagger Tag to Model
	 * 
	 * @param path
	 *            The resource path that this tag represent
	 * @param description
	 *            Tag Description
	 */
	public void addTag(String path, String description) {
		String key = "tag:" + path;
		if (done.containsKey(key))
			return;
		SwaggerTag tag = SwaggerFactory.eINSTANCE.createSwaggerTag();
		tag.setName(path2tagName(path));
		tag.setDescription(description);
		m.getTags().add(tag);
		done.put(key, tag.getName());
	}

	public void addTag(String path, String description, EObject o) {
		addTag(path, description);
		autoAddApi(path, o);
	}

	/**
	 * @return JSON representation of Swagger Model
	 */
	public JSONObject toJson() {
		try {
			return swagger2json(m);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to convert Swagger Model to Json: " + e);
		}
	}

	private boolean alreadyDone(String key) {
		if (done.containsKey(key))
			return true;
		System.err.println("SWAGGER: " + key);
		done.put(key, "");
		return false;
	}
}
