
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
	
package org.openecomp.ncomp.sirius.manager.camunda;

import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher
import java.util.regex.Pattern

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import org.openecomp.ncomp.sirius.manager.GenericHttpClient

import static org.openecomp.ncomp.sirius.manager.console.Utils.*


class Camunda {
	static final Logger logger = Logger.getLogger(Camunda.class);
	GenericHttpClient client;

	Camunda(String name="camunda") {
	    client = new GenericHttpClient("console.properties", name);
		client.language = "rest";
	}

	def p(x) { object2json(x).toString(2) }
	
	def list(String type) { 
		if (type == "filter") return listFilter()
		JSONObject json = client.list("/$type")
		return json
	}
	
	def list(String type, String id) {
		if (type == "filter") return listFilter(id)
	    JSONObject json = client.list("/$type/$id")
	    return json
	}

	def listIds(String type) {
		if (type == "filter") return listFilterIds()
		def l = []
		json2object(client.list("/$type"))['$list'].each {
//			println p(it)
			l += it.id
		}
		return l
	}
	def delete(String type, String id) {
		client.delete("/$type/$id")
	}
	
	def update(String type, String id, String action, x) {
		client.update("/$type/$id/$action", object2json(x))
	}
	
	def string2json(String s) {
		if (s == null) return null;
		if (s.startsWith("[")) {
			JSONArray a = new JSONArray(s);
			JSONObject json = new JSONObject();
			json.put('$list', a);
			return json;
		} else {
			return new JSONObject(s);
		}
	}
	
	def listFilter() {
		String s = client.methodAsString("/filter", "GET", null);
		s = cleanFilter(s);
		return string2json(s);
	}
	
	def listFilter(String id) {
		String s = client.methodAsString("/filter/$id", "GET", null);
		s = cleanFilter(s);
		return string2json(s);
	}
	
	def listFilterIds() {
		def l = []
		json2object(listFilter())['$list'].each {
//			println p(it)
			l += it.id
		}
		return l
	}

	private static Pattern filterFixer = Pattern.compile("\"resourceType\":\"([^\"]*)\",");
	def String cleanFilter(String s) {
		Matcher m = filterFixer.matcher (s);
		String t = null;
		def s2 = new StringBuffer();
		while (m.find()) {
			String t1 = m.group(1);
			if (t != null && t.equals(t1)) {
				t = null;
				m.appendReplacement(s2, "");
			} else {
				t = t1;
			}
		}
		m.appendTail(s2);
		return s2.toString();
	}
	
	def create(String type, x) {
	    client.create("/$type/create",object2json(x))
	}

	private static AtomicLong episodeCounter = new AtomicLong();
	
	private String newEpisode(String label) {
		long id = episodeCounter.incrementAndGet();
		return "Episode:Camunda:" + label + ":" + Long.toString(id);
	}
	
	// c.startProcess("eNodeB-reboot", "eNodeB", "FOOBAR", "samEMSname", "someEMS", 
	//                "samEMSip", "192.168.0.1", "episodeId", "episode:dummy")

	//	json query
	//  [
	//		variables: [
	//			eNodeB : ["value" : "FOOBAR", "type": "String"],
	//			samEMSname : ["value" : "someEMS", "type": "String"],
	//			samEMSip : ["value" : "192.168.0.1", "type": "String"],
	//			episodeId : ["value" : "episode:dummy", "type": "String"],
	//		]
	//	]
	
	def JSONObject varlist_arr (Object[] args, String episode = null) {
		JSONObject vars = new JSONObject();
		for (int i=0; i+1<args.length; i += 2) {
			String name = (String) args[i]
			Object val = args[i+1]
			JSONObject j = new JSONObject()
			if (episode != null && val instanceof String && val.equals("\$episode")) {
				j.put("value", episode)
			} else {
				j.put("value", val)
			}
			
			if (val instanceof String) {
				j.put("type", "String")
			} else if (val instanceof Boolean) {
				j.put("type", "Boolean")
			} else if (val instanceof Integer) {
				j.put("type", "Integer")
			} else if (val instanceof Double) {
				j.put("type", "Double")
			} else if (val instanceof Short) {
				j.put("type", "Short")
			} else if (val instanceof Long) {
				j.put("type", "Long")
			} else if (val instanceof Date) {
				j.put("type", "Date")
			} else {
				j.put("type", val.class.toString())
			}
			vars.put(name, j)
		}
		return vars
	}
	
	def JSONObject varlist (Object... args) {
		return varlist_arr(args)
	}
	
	def JSONObject varlist_episode (String episode, Object... args) {
		return varlist_arr(args, episode)
	}
	
	def String startProcess(String key, Object... args) {
		String episodeId = newEpisode(key)
		
		JSONObject json = new JSONObject()
		json.put("variables", varlist_arr(args, episodeId))
		logger.info("Starting process $key, json " + json.toString())
		client.create("/process-definition/key/$key/start", json)
		return episodeId
	}

	def void message (String messageName, boolean all, Object... corrKeys) {
		if (corrKeys.length == 0) {
			message (messageName, null, null, all);
		} else {
			message (messageName, varlist_arr(corrKeys), null, all);
		}
	}
	
	def void message (String messageName, JSONObject corrKeys, JSONObject vars, boolean all = false) {
		JSONObject json = new JSONObject()
		json.put("messageName", messageName)
		if (corrKeys != null) json.put("correlationKeys", corrKeys)
		if (vars != null) json.put("processVariables", vars)
		json.put("all", all)
		client.create("/message", json)
	}
}
