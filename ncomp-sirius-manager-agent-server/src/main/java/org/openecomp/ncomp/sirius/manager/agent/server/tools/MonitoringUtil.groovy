
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
	
package org.openecomp.ncomp.sirius.manager.agent.server.tools

import java.io.File;
import java.util.TimeZone;

import groovy.io.FileType

import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EAttribute

import org.openecomp.ncomp.core.logs.LogLevel;
import org.openecomp.ncomp.core.logs.LogsFactory;
import org.openecomp.ncomp.core.logs.LogMessage
import org.openecomp.ncomp.core.logs.LogSeverity;
import org.openecomp.ncomp.core.metrics.Metric
import org.openecomp.ncomp.core.metrics.MetricsFactory
import org.openecomp.ncomp.core.metrics.StringMetric
import org.openecomp.ncomp.sirius.manager.HighAvailabilityClient
import org.openecomp.ncomp.sirius.manager.ManagementServer
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdFactory;
import org.openecomp.ncomp.sirius.manager.agent.collectd.CollectdPackage;
import org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.south.AgentSouthBoundApiClient
import org.openecomp.ncomp.sirius.manager.ModuleReporter;
import org.openecomp.ncomp.sirius.manager.model.*
import org.openecomp.ncomp.sirius.manager.properties.PropertiesFactory;
import org.openecomp.ncomp.sirius.manager.properties.Property
import org.openecomp.ncomp.utils.extra.FileTail
import org.openecomp.ncomp.utils.extra.FileTail.NewLineHandler
import org.openecomp.ncomp.webservice.utils.DateUtils;
import org.openecomp.ncomp.sirius.manager.logs.LogMessageSuppressor
import org.openecomp.ncomp.sirius.manager.logs.LogMessageSuppressor.ILogMessageHandler

class MonitoringUtil implements NewLineHandler, ILogMessageHandler {
	public static final Logger logger = Logger.getLogger(MonitoringUtil.class);
	Properties props
	def format = "/var/lib/collectd/csv/*/*/.*-%Y-%m-%d"
	def directory = "data"
	def scanFreq = null
	def scanNewFreq = null
	def scanDuration = null 
	long reportFreq = DateUtils.stringToDuration("1min")
	long sendFreq = DateUtils.stringToDuration("30sec");
	LogMessageSuppressor logSup = new LogMessageSuppressor(this,300*1000)
	AgentSouthBoundApiClient api
	def MonitoringUtil(ManagementServer s) {
		logger.warn("monitor restarting")
	    api = new AgentSouthBoundApiClient("monitoring.properties", "lc1","lc2") 
		props = s.props
		def donemodule = [:]
		props.keySet().each { k ->
//			System.err.println "key = $k  -> ${props.get(k)}"
			switch (k) {
			case ~/commands\..*\.command/: 
				def a = k.split("\\.")
				def x = [name:a[1]]
				x["command"] = props.get(k)
				x["timeout"] = Long.parseLong(props.getProperty("commands.${x.name}.timeout","60000"))
				x["freq"] = Long.parseLong(props.getProperty("commands.${x.name}.freq","3600000"))
				commands += [x]
				break;
			case ~/logs\..*\.file/: 
				def a = k.split("\\.")
				def x = [name:a[1]]
				x["file"] = props.get(k)
				x["regexp"] = Pattern.compile(props.getProperty("logs.${x.name}.regexp",".*"))
				x["path"] = props.getProperty("logs.${x.name}.path","")
				x["sev"] = LogSeverity.get(props.getProperty("logs.${x.name}.severity","UNKNOWN"))
				if (x["sev"] == null) x["sev"] = LogSeverity.UNKNOWN 
				x["level"] = LogLevel.get(props.getProperty("logs.${x.name}.level","INFO"))
				if (x["level"] == null) x["level"] = LogLevel.UNKNOWN
				try {x["levelField"] = Integer.parseInt(props.getProperty("logs.${x.name}.levelField")) } catch (e) {}
				logs += [x]
				break;
			case ~/module\.[^.]*\.(file|jar|command)/: 
				def a = k.split("\\.")
				def x = [name:a[1], submodules:[]]
				x["file"] = props.getProperty("module.${x.name}.file",null)
				x["jarName"] = props.getProperty("module.${x.name}.jar",null)
				x["command"] = props.getProperty("module.${x.name}.command",null)
				x["version"] = props.getProperty("module.${x.name}.version",'${version} ${build.time}')
				modules += [x]
				name2module[x.name] = x
				break;
			}
		}
		props.keySet().each { k ->
//			System.err.println "key = $k  -> ${props.get(k)}" 
			switch (k) {
			case ~/module\..*\.submodule\..*\.(file|jar|command|version)/: 
				def a = k.split("\\.")
				def x = [name:a[3]]
				def m = name2module[a[1]]
				if (m == null) { logger.warn "No module for submodule: $k"; return }
				def prefix = "module.${m.name}.submodule.${x.name}"
				if (donemodule[prefix] != null) return
				donemodule[prefix] = 1
				x["file"] = props.getProperty("${prefix}.file",null)  
				x["jarName"] = props.getProperty("${prefix}.jar",null)
				x["command"] = props.getProperty("${prefix}.command",null)
				x["version"] = props.getProperty("${prefix}.version",'${version} ${build.time}') 
				m.submodules += x
				System.err.println "Adding submodule $prefix $x"
				break;
			}
		}
		logger.info("logs = $logs")
		logger.info("commands = $commands")
		logger.info("modules = $modules")
	}
	def commands = []
	def logs = []
	def modules = []
	def name2module = [:]
	def void run() {
		modules.each { m ->
			ModuleReporter r = new ModuleReporter(api,m.name,m.jarName,m.file,m.command,m.version);
			m.submodules.each { m1 ->
				r.addSubmodule(m1.name,m1.jarName,m1.file,m1.command,m1.version);
			}
			r.start();
		}
		Thread.start("run commands") {
			try {
				while (true) {
					runCommands()
					sleep 60000 // sleep a minute
				}
			}
			catch (e) {
				logger.fatal("run commands thread DIED: $e")
			}
		}
		new FileTail(format, directory, scanFreq, scanNewFreq, scanDuration, this, null);
		logs.each{ x -> 
			new FileTail(x.file, "$directory/logs/$x.name", "10sec", this, x);
		}
	}
	def lastRun = [:]
	def void runCommands() {
		def dirName = "commandOutputs"
		def dir = new File(dirName)
		dir.deleteDir()
		dir.mkdirs()
		long now = new Date().time
		commands.each { c -> 
			if (lastRun[c.name] && lastRun[c.name] + c.freq > now) return
			lastRun[c.name] = now
			def sout = new StringBuffer()
			def serr = new StringBuffer()
			def cmd = "$c.command ${dir.getAbsolutePath()}"
			logger.info("running $cmd")
			def proc = cmd.execute()
			proc.consumeProcessOutput(sout, serr)
			proc.waitForOrKill(c.timeout)
			if (sout.toString() != "") logger.info("output: $sout")
			if (serr.toString() != "") logger.warn("error : $serr")
		}
		EList<Property> propertyList = new BasicEList<Property>()
		dir.eachFileRecurse (FileType.FILES) { File file ->
			Property x = PropertiesFactory.eINSTANCE.createProperty()
			x.name = file.absolutePath.substring(dir.absolutePath.length())
			x.value = file.text
			propertyList += x
		}
		if (propertyList.size() > 0)
			api.properties(null,propertyList)
		// Note this information is getting handled in the BSA Controller updateProperties
	}
	static main(args) {
		// ALWAYS USE GMT.
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		// scan collectd data and forwards it to location controller.
		logger.warn "Starting server"
		def agent = new MonitoringUtil()
//		agent.test()
		agent.run()
	}
	
	void test() {
		def f = [
			"/var/lib/collectd/csv/bsa-blade3/memory/memory-buffered-2013-08-29",
			"/var/lib/collectd/csv/bsa-blade3/df/df-ndata2-2013-08-29",
			"/var/lib/collectd/csv/bsa-blade3/disk-nbd15/disk_merged-2013-08-29",
			"/var/lib/collectd/csv/bsa-blade3/interface/if_packets-vnet0-2013-08-29",
			"/var/lib/collectd/csv/instance-0000052a/libvirt/disk_octets-vdb-2013-08-29",
			'/var/lib/collectd/csv/instance-0000052a/libvirt/virt_cpu_total-2013-08-29',
			"/var/lib/collectd/csv/instance-0000052a/libvirt/if_packets-vnet3-2013-08-29",
			"/var/lib/collectd/csv/HORIZON/libvirt/disk_ops-vda-2013-10-10",
			]
		f.each { 
			println "#"*10 + it
			new BsaMonitoringAgentFileInfo(it) 
		}
	}
	def m = [:]
	EList<Metric> metrics = new BasicEList<Metric>()
	EList<LogMessage> logmessages = new BasicEList<LogMessage>()
	Date lastReport = new Date()
	def void uploadInfo() {
		Date now = new Date()
		if (lastReport.getTime() + sendFreq > now.getTime()) return
		synchronized (this) {
			try {
				if (metrics.size()>0) {
					logger.info "Sending ${metrics.size()} metrics"
					api.metrics(null,metrics);
				}
				// Note this information is getting handled in the BSA Controller updateMetrics
			}
			catch (e) {
				logger.error "Sending metrics failed: $e"
			}			
			metrics.clear()
			try {
				if (logmessages.size()>0) {
					logger.info "Sending ${logmessages.size()} logmessages"
					api.logs(null,logmessages);
				}
				// Note this information is getting handled in the BSA Controller updateLogs
			}
			catch (e) {
				logger.error "Sending logmessages failed: $e"
			}
			logmessages.clear()
			lastReport = now;
		}
	}
	@Override
	public void newLine(String file, String line, Object context) {
		Date now = new Date()
		uploadInfo()
//		logger.info "new line: $file $line $context"
		if (context != null) {
			newLogLine(file,line,context)
			return
		}
		BsaMonitoringAgentFileInfo i = m[file]
		if (i == null) {
			i = new BsaMonitoringAgentFileInfo(file)
			m[file] = i
		}
		if (i.ignore) return
		String[] a = line.split(",")
		if (a[0] == "epoch") return
		long t = Long.parseLong(a[0].split("\\.")[0])
		if (t*1000 - reportFreq < i.lastUpdate.getTime()) return
		i.metrics.each { m ->
			StringMetric x = MetricsFactory.eINSTANCE.createStringMetric()
			if (a.length <= m.col) {
				logger.error("bad line: $file: $line $m")
			}
			x.value = a[m.col]
			x.metricName = m.name
			x.resourceName = i.resource
			x.time = t*1000
			synchronized (this) { metrics += x }
		}
		i.lastUpdate = now
	}
	
	@Override
	public void fixFilePermissions(File file) {
		def path = file.getAbsolutePath()
		//println "Trying to make $path readable: ${file.canRead()}"
		def cmd = "bin/root_wrapper.sh fixFilePermissions $path"
		def sout = new StringBuffer()
		def serr = new StringBuffer()
		logger.info("running $cmd")
		def proc = cmd.execute()
		proc.consumeProcessOutput(sout, serr)
		proc.waitForOrKill(10000)
		if (sout.toString() != "") logger.info("output: $sout")
		if (serr.toString() != "") logger.warn("error : $serr")
		//println "After try $path readable: ${file.canRead()}"
	}

	class BsaMonitoringAgentFileInfo {
		String resource = "/collectd"
		def metrics = []
		boolean ignore = false
		Date lastUpdate = new Date(0)
		static CollectdPackage p = CollectdPackage.eINSTANCE
		public BsaMonitoringAgentFileInfo(String s) {
			String[] a = s.split("/")
			def host = a[a.length-3]
			def plugin = a[a.length-2]
			def index = a[a.length-1]
			index = index.substring(0,index.length()-11)
			switch (plugin) {
				case "libvirt":
				  String[] aa = host.split("-")
				  resource = "/collectd/instances/$host"
				  setup(p.collectdKvmInstance,plugin,index)
				break
				case "memory":
					resource = "/collectd/memory"
					setup(p.collectdMemory,plugin,index.replace("memory-", ""))
					break
				case "swap":
					resource = "/collectd/swap"
					setup(p.collectdMemory,plugin,index.replace("swap-", ""))
					break
				case "processes":
					resource = "/collectd/processes"
					setup(p.collectdProcesses,plugin,index.replace("ps_state-", ""))
					break
				case "load":
				case "contextswitch":
				case "entropy":
				case "interface":
				case "df":
					setup(p.collectdServer,plugin,index)
				break
				case "vmem":
					resource = "/collectd/vmem"
					def index1 = index.replaceFirst("vmpage_.*-", "")
					index1 = index1.replace("vmpage_faults","faults")
					setup(p.collectdVmem,plugin,index1, index1=="dirty" || index1=="writeback")
//					System.err.println "resource=$resource metrics=$metrics index=$index index1=$index1"
					break
				case ~/irq/:
				case ~/cpu-.*/: ignore = true; break
				case ~/disk-.*/:
					String[] aa = plugin.split("-")
					resource = "/collectd/disks/${aa[1]}"
					setup(p.collectdDisk,plugin,index)
					break
				default: logger.warn "Unknown plugin $plugin"
			}
	//		println "$s"
	//		println "host=$host plugin=$plugin index=$index"
	//		println "$resource $metrics"
		}
		void setup(EClass eClass,String p, String i, boolean exactMatch = false) {
			def j = 1
			eClass.getEAllAttributes().each { attr ->
				if (attr.name == "name") return
				if (attr.name == "lastPolled") return
				if (attr.name == "lastChanged") return
				if (attr.name == "created") return
				if ((!exactMatch && attr.name.startsWith(i))
				    || (attr.name == i))
					metrics +=  [ name : attr.name, col : j++]
			}
			String[] a = i.split("-")
			switch (i) {
				case ~/df.*/:
					if (a.length==1) break
					def e = eClass.getEStructuralFeature("filesystems")
					resource = "${resource}/$e.name/${a[1]}"
					setup(e.eType,p,"")
					break
				case ~/if_.*/:
					if (a.length==1) break
					def e = eClass.getEStructuralFeature("interfaces")
					resource = "${resource}/interfaces/${a[1]}"
					setup(e.eType,p,a[0])
					break
				case ~/disk_.*/:
					if (a.length==1) break
					def e = eClass.getEStructuralFeature("disks")
					resource = "${resource}/disks/${a[1]}"
					setup(e.eType,p,a[0])
					break
			}
		}
	}
	def newLogLine(String file, String line,x) {
		Pattern p = x.regexp
		if (!p.matcher(line).find()) return
		if (line.contains("Logfile reset")) return
		if (line.contains("New line from file")) return
		//println "$file $line $x"
		LogMessage log = LogsFactory.eINSTANCE.createLogMessage()
		log.time = new Date().getTime();
		log.resourceName = "$x.path/$x.name"
		log.severity = x.sev 
		log.level = x.level
		if (x["levelField"] != null) {
			try { 
				def i = x["levelField"]
				def a = line.split(" +",i+2)
				log.level = LogLevel.get(a[i].toUpperCase())
				line = a[i+1] 
		    } catch (e) {print e}
		}
		log.message = line
		fixLog(log,"path","resourceName")
		fixLog(log,"sev","severity")
		logSup.add(log) 
	}
	def fixLog (LogMessage log,s,a) {
		def p = Pattern.compile(" $s=\\{(.*?)\\}")
		def m = p.matcher(log.message)
		if (m.find()) {
			switch (a) {
				case "severity": log[a] = LogSeverity.get(m.group(1)); break
				default: log[a] = m.group(1)
			}
			log.message = m.replaceAll("")
		}
	}
	@Override
	public void handleLog(LogMessage m) {
		synchronized (this) {
			logmessages += m
		}
	}
	

}

