
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
	
package org.openecomp.ncomp.sirius.manager.console

import java.util.Properties;
import java.util.TimeZone;

import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.sirius.manager.AbstractClient;

import org.json.JSONObject
import org.json.JSONArray

import org.openecomp.ncomp.utils.PropertyUtil

import org.eclipse.emf.ecore.EObject;

import static org.openecomp.ncomp.sirius.manager.console.Utils.*
import static org.openecomp.ncomp.webservice.utils.DateUtils.dateFromString

class Console {
	public AbstractClient client
	private String language
	private String namespace
	public Console(String filename, String name) {
		// ALWAYS USE GMT.
		Properties props = PropertyUtil.getPropertiesFromClasspath(filename);
		language = props.getProperty("${name}.language", "somf");
		namespace = props.getProperty("${name}.namespace", null);
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
	}
	public Console() {
		language = "somf"
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
	}
	public create(String path, o) {
		def json = null
		switch (o) {
			case String: json = new JSONObject(o); break
			case JSONObject: json = o; break
			case EObject:
					case Map: json = object2json(o); break
			default: throw new RuntimeException("Unable to determine JSON: $o")
		}
		//		println json.toString(2)
		return json2object(client.create(fixPath(path),json));
	}
	public update(String path, o) {
		def json = null
		//		println "o=$o"
		switch (o) {
			case String: json = new JSONObject(o); break
			case JSONObject: json = o; break
			case EObject:
					case Map: json = object2json(o); break
			default: throw new RuntimeException("Unable to determine JSON: $o")
		}
		//		println json.toString(2)
		return json2object(client.update(fixPath(path),json));
	}
	public delete(String path) {
		return json2object(client.delete(fixPath(path)))
	}
	public def list(String path, int levels = 1) {
		def x = client.list(fixPath(path),levels)
		return json2object(x)
	}
	public def listAll(String path) {
		JSONObject x = client.listAll(fixPath(path))
		return json2object(x.get("list"))
	}
	public def listReferences(String path, boolean recursive = true) {
		JSONObject x = client.listReferences(fixPath(path),recursive)
		return json2object(x.get("list"))
	}
	public def operation(String path, String name, o = "{}", Long timeout = null) {
		def json = null
		switch (o) {
			case String: json = new JSONObject(o); break
			case JSONObject: json = o; break
			case EObject:
					case Map: json = object2json(o); break
		}
		switch (language) {
			case "restconf":
				return json2object(client.operationOdl("/restconf/operations/$namespace:$name",timeout,json))
		}
		return json2object(client.operation(fixPath(path),name,timeout,json))
	}
	def String fixPath(String path) {
		if (path.startsWith("/gui")) return path
		if (path.startsWith("/south")) return path
		if (!path.startsWith("/")) path = "/$path"
		if (!path.startsWith("/resources")) path = "/resources$path"
		return path
	}
	public void printMetrics(String path, start, end) {
		switch (start) { case String: start = dateFromString(start); break }
		switch (end) { case String: end = dateFromString(end); break }
		def values = client.operationPath("/resources",ModelPackage.eINSTANCE.abstractManagementServer,"getValues",
				null, null, path, start.time, end.time, null, false)
		def table = [ header : ["Time", "Metric", "Value"], rows : []]
		values.each {
			def row = []
			row += new Date(it.time)
			row += it.metricName
			row += it.value
			table.rows += [row]
		}
		pTable(table)
	}
	public void printMetricsAll(String path, List<String> metrics, start, end, options = null) {
		switch (start) { case String: start = dateFromString(start); break }
		switch (end) { case String: end = dateFromString(end); break }
		def values = client.operationPath("/resources",ModelPackage.eINSTANCE.abstractManagementServer,"getValuesAll",
				null, path, metrics, start.time, end.time, fixOptions(options))
		def table = [ header : [
				"Path",
				"Time",
				"Metric",
				"Value"
			], rows : []]
		values.each {
			def row = []
			row += it.resourceName
			row += new Date(it.time)
			row += it.metricName
			row += it.value
			table.rows += [row]
		}
		pTable(table)
	}
	public void printMessages(String path, start, end) {
		if (start == null) start = '-1day'
		if (end == null) end = 'now'
		switch (start) { case String: start = dateFromString(start); break }
		switch (end) { case String: end = dateFromString(end); break }
		def values = client.operationPath("/resources",ModelPackage.eINSTANCE.abstractManagementServer,"getMessages",
				null, path, start.time, end.time)
		def table = [ header : [
				"Time",
				"Level",
				"Path",
				"Message"
			], rows : []]
		values.each { LogMessage msg ->
			def row = []
			row += new Date(msg.time)
			row += msg.level
			row += msg.resourceName
			row += msg.message
			table.rows += [row]
		}
		pTable(table)
	}

	public void saveTableCsv(t,filename) {
		def f = new File(filename)
		new File(filename).withWriter { out ->
			def row = []
			t.columns.each { row += it.colName }
			out.writeLine row.join(",")
			t.rows.each { r ->
				row = []
				r.cells.each { row += it.value }
				out.writeLine row.join(",")
			}
		}
	}
	String rootDirectory = null
	public create(String path) {
		if (rootDirectory == null) 
			throw new RuntimeException("rootDirectory is NULL")
		File file = new File("$rootDirectory/${fixPath(path)}.json")
		if (! file.exists()) 
			throw new RuntimeException("file does not exist: $file")
		def json = null
		try { json = new JSONObject(file.text) } catch (e) {
			throw new RuntimeException("JSON error: $file : $e")
		}
		create(path,json)
	}
	public update(String path) {
		if (rootDirectory == null) 
			throw new RuntimeException("rootDirectory is NULL")
		File file = new File("$rootDirectory/${fixPath(path)}.json")
		if (! file.exists()) 
			throw new RuntimeException("file does not exist: $file")
		def json = null
		try { json = new JSONObject(file.text) } catch (e) {
			throw new RuntimeException("JSON error: $file : $e")
		}
		update(path,json)
	}

}


