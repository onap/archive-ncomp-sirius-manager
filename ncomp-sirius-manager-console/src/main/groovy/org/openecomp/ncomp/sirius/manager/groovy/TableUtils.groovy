
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

class TableUtils {
	def console
	def TableUtils() {}
	def TableUtils(console) {
		this.console = console
	}
	def newOption(options) {
		def res = ['$class':"org.openecomp.ncomp.core.metrics.SequenceMetricValueOption",options:[:],'$nosave':1]
		options.each { o ->
			if (o.TYPE == null)
			  throw new RuntimeException("option should have TYPE")
			def oo = ['$class':"org.openecomp.ncomp.core.metrics.${o.TYPE}MetricValueOption"]
			o.each { n, v ->
				if (n == "TYPE") return
				oo[n] = v
			}
			res.options[o.name] = oo
		}
		return res
	}
	
	def newLogTable(treePath,tablePath,minLevel,minSeverity,prefixResourcePath,duration,aggregationDuration) {
		[
			'$class':"org.openecomp.ncomp.sirius.manager.tableTemplate.LogTableTemplate",
			treePath:treePath,
			tablePath:tablePath,
			minLevel:minLevel,
			minSeverity:minSeverity,
			prefixResourcePath:prefixResourcePath,
			duration:duration,
			aggregationDuration:aggregationDuration,
			'$nosave':1
		 ]
	}
	
	def newTable(treePath,tablePath,rowPath) {
		[
			'$class':"org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplate",
			treePath:treePath,
			tablePath:tablePath,
			rowPath:rowPath,
			columns:[:],
			'$nosave':1
		 ]
	}

	def newIteratorTableTemplate(treePath,tablePath,rowPaths,filter,recursive="true") {
		[
			'$class':"org.openecomp.ncomp.sirius.manager.tableTemplate.IteratorTableTemplate",
			treePath:treePath,
			tablePath:tablePath,
			iterator: [
				'$class': "org.openecomp.ncomp.core.function.IteratorUsingFunction",
				paths:rowPaths,
				recursive:recursive,
				filter:filter,
				],
			columns:[:],
			'$nosave':1
		 ]
	}

		
	def newTimeTable(treePath,tablePath,rowPath,duration) {
		[
			'$class':"org.openecomp.ncomp.sirius.manager.tableTemplate.TimeTableTemplate",
			treePath:treePath,
			tablePath:tablePath,
			rowPath:rowPath,
			duration:duration,
			columns:[:],
			'$nosave':1
		 ]
	}
	
	
	def newColumnA(t,name,path) {
		t.columns[name] = [
			'$class':"org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateAttributeColumn",
			path:path,
			'$nosave':1
		]
	}
	def newColumnM(t,name, path,option) {
		t.columns[name] = [
			'$class':"org.openecomp.ncomp.sirius.manager.tableTemplate.TableTemplateMetricColumn",
			path:path,
			option:['$ref':"/configuration/metricOptions/$option"],
			'$nosave':1
			
		]
	}
	
	def update (path,v) {
		println "Updating $path"
		try {
			console.update(path,v)
		}
		catch (Exception e) { 
			console.create(path,v) 
		}
	}  
	
	def update2(String p,t) {
		update(p,t)
		// create last24HourTable
		// treePath,tablePath,rowPath
		def t2 = newTable(t.treePath,t.tablePath.replace("daily","last24Hour"),t.rowPath)
		def t3 = newTable(t.treePath,t.tablePath.replace("daily","lastHour"),t.rowPath)
		t.columns.each { n, col ->
			println "$n $col"
			t2.columns[n] = col
			def col1 = cloneMap(col)
			if (col1.option != null) col1.option['$ref'] = col1.option['$ref'].replace("daily","hourly")
			t3.columns[n] = col1
		}
		update(p.replace("daily","last24Hour"),t2)
		update(p.replace("daily","lastHour"),t3)
		
	}
	
	
	def setupLogging () {
		update("/configuration/tableTemplates/log-ALL-2hour",newLogTable("/",'/reports/logging/2hour/ALL',null,null,'',"-2hour",null))
		update("/configuration/tableTemplates/log-WARN-2hour",newLogTable("/",'/reports/logging/2hour/WARN','WARN',null,'',"-2hour",null))
		update("/configuration/tableTemplates/log-SEV1-2hour",newLogTable("/",'/reports/logging/2hour/SEV1',null,"SEV1",'',"-2hour",null))
		update("/configuration/tableTemplates/log-SEV2-2hour",newLogTable("/",'/reports/logging/2hour/SEV2',null,"SEV2",'',"-2hour",null))
		update("/configuration/tableTemplates/log-ALL-1day",newLogTable("/",'/reports/logging/1day/ALL',null,null,'',"-1day","1hour"))
		update("/configuration/tableTemplates/log-WARN-1day",newLogTable("/",'/reports/logging/1day/WARN','WARN',null,'',"-1day","1hour"))
		update("/configuration/tableTemplates/log-SEV1-1day",newLogTable("/",'/reports/logging/1day/SEV1',null,"SEV1",'',"-1day","1hour"))
		update("/configuration/tableTemplates/log-SEV2-1day",newLogTable("/",'/reports/logging/1day/SEV2',null,"SEV2",'',"-1day","1hour"))
		update("/configuration/tableTemplates/log-ALL-1week",newLogTable("/",'/reports/logging/1week/ALL',null,null,'',"-7day","1day"))
		update("/configuration/tableTemplates/log-WARN-1week",newLogTable("/",'/reports/logging/1week/WARN','WARN',null,'',"-7day","1day"))
		update("/configuration/tableTemplates/log-SEV1-1week",newLogTable("/",'/reports/logging/1week/SEV1',null,"SEV1",'',"-7day","1day"))
		update("/configuration/tableTemplates/log-SEV2-1week",newLogTable("/",'/reports/logging/1week/SEV2',null,"SEV2",'',"-7day","1day"))
		update("/configuration/tableTemplates/log-mail",newLogTable("/",'/reports/logging/mail',null,"SEV1",'',"-1hour","99999day"))
	}
	
	def setupLogCount() {
		def ccc= "org.openecomp.ncomp.core.function.FunctionMatchAttribute"
		def ccc2="org.openecomp.ncomp.core.function.FunctionMatchInstanceOf"
		def f = [
			'$class': "org.openecomp.ncomp.core.function.RuleFunction",
			rules:[
				[ action : [ value:"true"], matches: [[ 
					'$class':ccc2,
					ePackage:"org.openecomp.ncomp.core.logs.LogsPackage",
					eName:"LogMessageContainer"
					]] ],
				[ action : [ value:"false"] ],
			]
		]
		def t = newIteratorTableTemplate("/","/reports/logging/count",["/"],f)
		newColumnA(t,"path", '$path')
		newColumnA(t,"class", '$class')
		newColumnM(t,"Logmessage (last hour)", "/logMessageStats/ALL/count","hourlyCount")
		newColumnM(t,"SEV1 Logmessage (last hour)", "/logMessageStats/SEV1/count","hourlyCount")
		newColumnM(t,"SEV2 Logmessage (last hour)", "/logMessageStats/SEV2/count","hourlyCount")
		newColumnM(t,"Logmessage (last day)", "/logMessageStats/ALL/count","dailyCount")
		newColumnM(t,"SEV1 Logmessage (last day)", "/logMessageStats/SEV1/count","dailyCount")
		newColumnM(t,"SEV2 Logmessage (last day)", "/logMessageStats/SEV2/count","dailyCount")
		update("/configuration/tableTemplates/logging-count",t)
	}

	
	def setupSuspended() {
		def ccc= "org.openecomp.ncomp.core.function.FunctionMatchAttribute"
		def f = [
			'$class': "org.openecomp.ncomp.core.function.RuleFunction",
			rules:[
				[ action : [ value:"true"], matches: [['$class':ccc,path:"/operationalState",match:"SUSPENDED"]] ],
				[ action : [ value:"false"] ],
			]
		]
		def t = newIteratorTableTemplate("/","/reports/suspended",["/"],f)
		newColumnA(t,"path", '$path')
		newColumnA(t,"class", '$class')
		newColumnA(t,"Operational State", "/operationalState")
		update("/configuration/tableTemplates/suspended",t) 
	}
	
	def setupOptions() {
		["Average","Count","Max","Min","Sum"].each { aggr ->
			println "here$aggr"
			def x = [[name:"basic",TYPE:"Basic"],[name:"aggregation",TYPE:"Aggregation",duration:"1day",aggregationType:aggr.toUpperCase()]]
			update("/configuration/metricOptions/daily$aggr",newOption(x))
			println "here2$aggr"
			x[1].duration = "1hour"
			update("/configuration/metricOptions/hourly$aggr",newOption(x))
		}
		println "here3"
		update("/configuration/metricOptions/default",newOption([[name:"basic",TYPE:"Basic"]]))
	}
}

