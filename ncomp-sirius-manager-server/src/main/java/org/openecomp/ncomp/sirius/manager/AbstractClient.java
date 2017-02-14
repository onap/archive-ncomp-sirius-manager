
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

import java.util.HashMap;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.json.JSONArray;
import org.json.JSONObject;

import org.openecomp.ncomp.utils.emf.EUtils;

public abstract class AbstractClient {
	public static final Logger logger = Logger.getLogger(AbstractClient.class);
	abstract public byte[] httpBinaryTransaction(String path, String method, HashMap<String, String> headers, JSONObject body, Long timeout);

	public Properties props;
	public String language;
	public String namespace;
	protected int defaultTimeout = 60000;
	private static HashMap<EObject, AbstractClient> map1 = new HashMap<EObject, AbstractClient>();
	private static HashMap<EObject, String> map2 = new HashMap<EObject, String>();

	public void add(String uri, EObject o) {
		map1.put(o, this);
		map2.put(o, uri);
	}

	static AbstractClient findClient(EObject o) {
		return map1.get(o);
	}

	public JSONObject operationJson(EObject o, String name, Long timeout, JSONObject json) {
		return operationPath2(map2.get(o), name, timeout, json);
	}

	public JSONObject operationPath2(String path, String name, Long timeout, JSONObject json) {
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("action", name);
		logger.debug("operation: " + name + "\n" + json.toString(2));
		return httpJsonTransaction(path, "PUT", headers, json, timeout);
	}
	public JSONObject operationOdl(String path, Long timeout, JSONObject json) {
		JSONObject json1 = new JSONObject();
		json1.put("input", json);
		logger.debug("ODL operation: " + path + "\n" + json1.toString(2));
		return httpJsonTransaction(path, "POST", null, json1, timeout);
	}

	public Object operation2(String path, EObject o, String opName, Long timeout, Object[] params) {
		EOperation op = EUtils.name2operation(o.eClass(), opName);
		if (op == null)
			throw new RuntimeException("no such operation: " + opName + " on " + o);
		JSONObject res = operationPath2(path, opName, timeout, ManagementServer.params2json(op, params));
		return ManagementServer.json2response(op, res);
	}

	public JSONObject operation(String resourcePath, String opName, Long timeout, JSONObject json) {
		return operationPath2(resourcePath, opName, timeout, json);
	}

	public Object operation(String path, EObject o, String opName, Long timeout, Object... params) {
		return operation2(path, o, opName, timeout, params);
	}

	public Object operation(EObject o, String opName, Long timeout, Object... params) {
		return operation2(map2.get(o), o, opName, timeout, params);
	}

	public Object operationPath(String resourcePath, EClass c, String opName, Long timeout, Object... params) {
		EOperation op = EUtils.name2operation(c, opName);
		if (op == null) {
			throw new RuntimeException("Unknown operation " + opName + " on Eclass " + c.getName());
		}
		JSONObject res;
		JSONObject json1 = ManagementServer.params2json(op, params);
		if (language != null && language.equals("restconf")) { 
		    res = operationOdl("/restconf/operations/" + namespace + ":" + opName,timeout,json1);
		}
		else {
			res = operationPath2(resourcePath, op.getName(), timeout, json1 );
		}
		return ManagementServer.json2response(op, res);
	}

	// abstract public void sendToDataRouter(String feedname, String fileId,
	// JSONObject metadata, InputStream is);

	// public void sendToDataRouter(String feedname, String fileId, JSONObject
	// metadata, byte[] bytes) {
	// ByteArrayInputStream in = new ByteArrayInputStream(bytes);
	// sendToDataRouter(feedname, fileId, metadata, in);
	// }

	public void create(String resourcePath, String json) {
		create(resourcePath, new JSONObject(json));
	}

	public void create(String resourcePath, JSONObject json) {
		httpJsonTransaction(resourcePath, "POST", null, json, null);
	}

	public void update(String resourcePath, JSONObject json) {
		httpJsonTransaction(resourcePath, "PUT", null, json, null);
	}

	public void delete(String resourcePath) {
		httpJsonTransaction(resourcePath, "DELETE", null, new JSONObject(), null);
	}

	public JSONObject method(String resourcePath, String method, JSONObject json) {
		return httpJsonTransaction(resourcePath, method, null, json, null);
	}
	
	public byte[] methodAsBinary(String resourcePath, String method, JSONObject json) {
		return httpBinaryTransaction(resourcePath, method, null, json, null);
	}

	public String methodAsString(String resourcePath, String method, JSONObject json) {
		return httpStringTransaction(resourcePath, method, null, json, null);
	}

	public JSONObject list(String resourcePath) {
		if (language != null && language.equals("rest")) {
			return httpJsonTransaction(resourcePath, "GET", null, new JSONObject(), null);
		} else {
			return list(resourcePath, 1);
		}
	}
	
	public JSONObject listAll(String resourcePath) {
		return httpJsonTransaction(resourcePath + "?match=regexp", "GET", null, new JSONObject(), null);
	}

	public JSONObject listReferences(String resourcePath, boolean recursive) {
		return httpJsonTransaction(resourcePath + "?references=" + recursive, "GET", null, new JSONObject(), null);
	}

	public JSONObject list(String resourcePath, int levels) {
		return httpJsonTransaction(resourcePath + "?levels=" + levels, "GET", null, new JSONObject(), null);
	}
	
	public JSONObject httpJsonTransaction(String path, String method, HashMap<String, String> headers, JSONObject body) {
		return httpJsonTransaction(path, method, headers, body,null);
	}

	public JSONObject httpJsonTransaction(String path, String method, HashMap<String, String> headers, JSONObject body, Long timeout) {
		String s = httpStringTransaction(path, method, headers, body, timeout);
		if (s == null) return null;
		if (s.startsWith("[")) {
			JSONArray a = new JSONArray(s);
			JSONObject json = new JSONObject();
			json.put("$list", a);
			return json;
		} else {
			JSONObject json = new JSONObject(s);
			return json;
		}
	}

	public String httpStringTransaction(String path, String method, HashMap<String, String> headers, JSONObject body, Long timeout) {
		byte[] b = httpBinaryTransaction(path, method, headers, body, timeout);
		if (b == null) return null;
		else return new String(b);
	}

	public int getDefaultTimeout () {
		return defaultTimeout;
	}
	
	public void setDefaultTimeout (int timeout) {
		defaultTimeout = timeout;
	}

	abstract public String getRemote();
}
