
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
	
package org.openecomp.ncomp.sirius.manager.groovy

import static org.openecomp.ncomp.sirius.manager.console.Utils.cloneMap

import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.core.function.Function;
import org.openecomp.ncomp.core.function.RuleFunction;

class AlertUtils {
	def console
	def AlertUtils() {}
	def AlertUtils(console) {
		this.console = console
	}
	def void addAlertTemplates (path,aName, boolean save = true) {
		console.listAll(path).each { tName ->
			def m = [alertingTemplate : ['$ref':"/configuration/alertTemplates/$aName"], '$nosave' : 1 ]
//			println "$tName"
			update(tName,m)
		}
		copyAlerts(path)
		if (save) console.update("/",[:])
	}
	def void addAlertTemplatesFromFile(String fileName) {
		File f = new File(fileName)
		f.readLines().each { line ->
			String[] a = line.split("\\|")
			if (a.length != 2) return
			addAlertTemplates(a[0], a[1], false)
		}
		console.update("/",[:])
	}
	def void addAlertTemplatesFromFunction(path, function, boolean save = true) {
		def ret = console.operation("/","evaluate",[path:path, function:function])
		ret.returns.each { v ->
			def m = [alertingTemplate : ['$ref':"/configuration/alertTemplates/$v.value"], '$nosave' : 1 ]
			update(v.path,m)
		}
		copyAlerts(path)
		if (save) console.update("/",[:])
	}
	def void copyAlerts (path) {
		def t = console.list("/configuration",1000).alertTemplates
//		println t
		console.listAll(path).each { p ->
			def m = console.list(p,0)
			if (m.alertingTemplate == null || m.alertingTemplate['$ref'] == "NULL") return
			def t2 = m.alertingTemplate['$ref'].split("/")[3]
			def t3 = t[t2]
			t3['$nosave'] = 1
//			println "$p $m.alertingTemplate $t2 $t3"
			console.update(p,t3) 
		}
	}
	def alert(metricName,lowerBound,upperBound,severity = "SEV2", duration = null, maxDelay = null) {
		return [
			'$class':"org.openecomp.ncomp.sirius.manager.model.ThresholdAlert",
			 metricName:metricName,
			 lowerBound:lowerBound,
			 upperBound:upperBound,
			 duration:duration,
			 maxDelay:maxDelay,
			 severity:severity,
		]
	}
	def update (path,v) {
//		println "Updating $path"
		try {
			console.update(path,v)
		}
		catch (e) {
			console.create(path,v)
		}
	}

}

