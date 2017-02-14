
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

import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList;

import java.util.Properties;

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EObject;

import org.json.JSONObject
import org.json.JSONArray

import static org.openecomp.ncomp.sirius.manager.ManagementServer.ecore2json


class Utils {

	static def object2json(o) {
		switch (o) {
			case List:
				def j = [] as JSONArray
				o.each { j.put(object2json(it)) }
				return j
			case Map:
				def j = [:] as JSONObject
				o.each { k,v -> j.put(k,object2json(v)) }
				return j
			case EObject:
				return ecore2json(o, 100, null, true)
			case boolean:
			case long:
			case int:
			case double:
			case Boolean:
			case Long:
			case Integer:
					case String: return o; break
			case GString: return o.toString(); break
			case null: break;
			default: println "Unable to convert: $o ${o.getClass().name}"
		}
	}
	static def json2object (o) {
		switch (o) {
			case JSONObject:
				def m = [:]
				o.map.each { n,v -> m[n] = json2object(v) }
				return m
			case JSONArray:
				def a = []
				o.myArrayList.each { a += json2object(it) }
				return a
			case Integer:
			case Long:
			case Double:
			case Boolean:
			case boolean:
			case int:
			case double:
					case String: return o; break
			case GString: return o.toString(); break
			case null: break;
			default:
				if (o.getClass().name != 'org.json.JSONObject$Null')
					println "Unable to json2object convert: $o ${o.getClass().name}"
		}
	}

	static cloneMap(m) {
		return json2object(object2json(m))
	}

	static def void pTable (m, format = "txt", PrintStream out) {
		def s = [:]
		def style = 'style="border: 1px solid black; border-collapse: collapse;"'
		m.header.eachWithIndex {n,i->
			def l = "$n".size()
			if (!s[i] || l > s[i]) s[i] = l
		}
		m.rows.each { row ->
			//		  out.println "row = $row"
			(0..m.header.size()-1).each { i ->
				def n = row[i]
				def l = "$n".size()
				if (!s[i] || l > s[i]) s[i] = l
			}
		}
		//		println "$s"
		def row = []
		def j = 1
		m.header.eachWithIndex {n,i->
			row += String.format("%${s[i]}s",n)
			j += 3 + s[i]
		}
		switch (format) {
			case "mediawiki":
				out.println '{| class="wikitable"'
				out.println "! ${row.join('\n! ')}"
				break
			case "html":
				out.println "<table $style>"
				out.println "<tr $style><th $style>${row.join('</th><th '+style+'>')}</th></tr>"
				break
			default:
				out.println "_"*j
				out.println "| ${row.join(' | ')} |"
				out.println "_"*j
				break;
		}
		m.rows.each { r ->
			row = []
			(0..m.header.size()-1).each { k ->
				row += String.format("%${s[k]}s",r[k])
			}
			switch (format) {
				case "mediawiki": out.println "|-\n| ${row.join('\n| ')}"; break
				case "html": out.println "<tr $style><td $style>${row.join('</td><td '+style+'>')}</td></tr>"; break
				default: out.println "| ${row.join(' | ')} |"; break
			}
		}
		switch (format) {
			case "mediawiki": out.println "|}"; break
			case "html": out.println '</table>'; break
			default: out.println "_"*j; break
		}
	}

	static def p(x) { Utils.object2json(x).toString(2) }

	static def runCmd(String cmd, long timeout) {
		def sout = new StringBuffer()
		def serr = new StringBuffer()
		Process proc = cmd.execute()
		Thread t1 = proc.consumeProcessOutputStream(sout)
		Thread t2 = proc.consumeProcessErrorStream(serr)
		Date d1 = new Date()
		proc.waitForOrKill(timeout)
		if (proc.exitValue() != 0) {
			System.err.println "Non Zero exit value: $cmd ${proc.exitValue()}"
		}
		Date d2 = new Date()
		long duration = d2.time - d1.time
		if (duration > 0.5 * timeout) {
			System.err.println "Command took long time: $cmd took ${duration}ms with timeout=${timeout}ms"
		}
		t1.join()
		t2.join()
		if (sout.toString() != "") println "output: $sout"
		if (serr.toString() != "") println "error: $serr"
		return [out:sout.toString(),err:serr.toString()]
	}

}

