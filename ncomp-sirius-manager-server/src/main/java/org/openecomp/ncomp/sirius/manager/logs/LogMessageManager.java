
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
	
package org.openecomp.ncomp.sirius.manager.logs;

import java.io.File;
import java.util.Date;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

import org.openecomp.ncomp.core.logs.*;
import org.openecomp.ncomp.sirius.function.FunctionUtils;
import org.openecomp.ncomp.sirius.manager.*;
import org.openecomp.ncomp.utils.journaling.JournalingList;

public class LogMessageManager {
	public static final Logger logger = Logger.getLogger(LogMessageManager.class);
	public static final Logger logger2 = Logger.getLogger("org.openecomp.ncomp.sirius.manager.uploaded");
	private HashMap<String, LogMessageStore> logs = new HashMap<String, LogMessageStore>();
	private JournalingList<String> allLogs = null;
	private ManagementServer s;

	public LogMessageManager(ManagementServer s) {
		super();
		this.s = s;
	}

	public synchronized void addLogMessage(EObject o, Message m) {
		o2logs(o).add(m);
	}

	public synchronized void addLogMessage(EObject o, LogMessage m) {
		Message m1 = new Message(m);
		addLogMessage(o, m1);
	}

	public synchronized EList<LogMessage> getMessages(EObject o, Date start, Date end) {
		return o2logs(o).getMessages(start, end);
	}

	private LogMessageStore o2logs(EObject o) {
		return path2logs(ManagementServer.object2ref(o));
	}

	private LogMessageStore path2logs(String path) {
		initLogs();
		LogMessageStore store = logs.get(path);
		if (store == null) {
			String dir = s.getProps().getProperty("logs.dir", "data/logs") + path;
			store = new LogMessageStore(dir, path);
			logs.put(path, store);
			if (!allLogs.contains(path)) {
				allLogs.add(path);
				allLogs.save();
			}
		}
		return store;
	}

	@SuppressWarnings("unchecked")
	private void initLogs() {
		if (allLogs == null) {
			String file = s.getProps().getProperty("logs.dir", "data/logs") + "/allLogs.dat";
			allLogs = JournalingList.create(new File(file));
		}
	}

	public synchronized EList<LogMessage> getMessages(String prefixPath, Date start, Date end) {
		EList<LogMessage> res = new BasicEList<LogMessage>();
		initLogs();
		for (String p : allLogs) {
			// TODO THIS DOES NOT WORK
			// if (!p.startsWith(prefixPath))
			// continue;
			for (LogMessage m : path2logs(p).getMessages(start, end)) {
				if (m.getResourceName().startsWith(prefixPath)) 
					res.add(m);
			}
		}
		return LogMessageStore.sortMessages(res);
	}

	public synchronized void save() {
		for (LogMessageStore s : logs.values())
			s.logs.save();
	}

	public void updateLogs(EObject s, EList<LogMessage> logs, EList<LogMessageRule> rules, Logger logger) {
		String path = ManagementServer.object2ref(s);
		for (LogMessage log : logs) {
			if (log.getTime() < 140646778200L) {
				logger.warn("Metric time is too old:" + new Date(log.getTime()));
				log.setTime(new Date().getTime());
			}
			// System.err.println "new log $log $path"
			if (log.getResourceName() == null) {
				log.setResourceName(path);
			} else {
				if (log.getResourceName().startsWith("/")) {
					log.setResourceName(path + log.getResourceName());
				} else {
					log.setResourceName(path + "/" + log.getResourceName());
				}
			}
//			if (log.getCategory() == null) {
//				setCategory(log);
//			}
			updateLogMessage(log, rules);
			String m = "resource=" + log.getResourceName() + " severity=" + log.getSeverity() + " " + log.getMessage();
			updateServer(log);
			switch (log.getLevel()) {
			case INFO:
				logger2.info(m);
				break;
			case WARN:
				logger2.warn(m);
				break;
			case ERROR:
				logger2.error(m);
				break;
			case FATAL:
				logger2.fatal(m);
				break;
			default:
				break;
			}
			addLogMessage(s, log);
		}
		save(60000L); // save every minute
	}

	private void updateServer(LogMessage log) {
		LogMessageContainer o = findLogContainer(log);
		if (o == null) return;
		updateLogStatsContainer(o,log);
	}

	private LogMessageContainer findLogContainer(LogMessage log) {
		Subject subject = ManagementServer.find(s.getObject(), log.getResourceName(), true);
		LogMessageContainer c = null;
		if (subject != null && subject.o != null) {
			EObject oo = subject.o;
			while (oo != null) {
				if (oo instanceof LogMessageContainer) {
					c = (LogMessageContainer) oo;
					break;
				}
				oo = oo.eContainer();
			}
		}
		if (c == null) { 
			logger.warn("unable to find LogMessageContainer for: " + log.getResourceName());
			return null;
		}
		return c;
	}

	private LogMessageCategory findLogCategory(String name, LogMessage log) {
		LogMessageContainer c = findLogContainer(log);
		if (c == null) return null;
		LogMessageCategory cat = null;
		for (LogMessageCategory cat1 : c.getLogMessageCategories()) {
			if (cat1.getName().equals(name)) {
				cat = cat1;
				break;
			}
		}
		if (cat == null) {
			cat = LogsFactory.eINSTANCE.createLogMessageCategory();
			cat.setName(name);
			c.getLogMessageCategories().add(cat);
		} 
		return cat;
	}

	private void updateLogStatsContainer(EObject o, LogMessage log) {
		if (o instanceof LogMessageContainer) {
			LogMessageContainer c = (LogMessageContainer) o;
			updateLogStats(c.getLogMessageStats(),log.getSeverity().toString(),log.getSeverity(),null,LogSeverity.UNKNOWN);
			updateLogStats(c.getLogMessageStats(),"ALL",null,null,LogSeverity.UNKNOWN);
		}
		if (o.eContainer() != null) 
			updateLogStatsContainer(o.eContainer(), log);
	}

	private void updateLogStats(EList<LogMessageStats> l, String n, LogSeverity sev, LogLevel level, LogSeverity minLogSeverity) {
		if (minLogSeverity != null && minLogSeverity  != LogSeverity.UNKNOWN && (sev == null || sev == LogSeverity.UNKNOWN || sev.ordinal() > minLogSeverity.ordinal())) return;
		LogMessageStats stats = (LogMessageStats) ManagementServer.findInNamedList(l, n);
		if (stats == null) {
			stats = LogsFactory.eINSTANCE.createLogMessageStats();
			stats.setName(n);
			stats.setLevel(level);
			stats.setSeverity(sev);
			l.add(stats);
		}
		if (stats.getCount() == null)
			s.metrics.initAttribute(stats,"count");
		if (stats.getCount() != null) 
			stats.getCount().increase(1L,false);
	}

	@SuppressWarnings("unused")
	private void setCategory(LogMessage log) {
		log.setCategory(log.getMessage().replaceAll("Exchange@[0-9a-f]+", "EEE").replaceAll("[0-9]+", "NNN"));
	}

	long lastUpdate = 0;

	private void save(long i) {
		long now = new Date().getTime();
		if (lastUpdate + i < now) {
			save();
			lastUpdate = new Date().getTime();
		}

	}

	private void updateLogMessage(LogMessage log, EList<LogMessageRule> rules) {
		if (rules == null)
			return;
		logger.debug("Log:" + log);
		for (LogMessageRule r : rules) {
			logger.debug("Rule:" + r);
			if (r.isDisabled())
				continue;
			try {
				if (r.getMessageFilter() != null && !log.getMessage().matches(r.getMessageFilter()))
					continue;
				if (r.getResourcePathFilter() != null && !log.getResourceName().matches(r.getResourcePathFilter()))
					continue;
			} catch (Exception e) {
				r.setDisabled(true);
				logger.error("error in log message rule (now disabled): " + e);
			}
			if (r.getLevel() != LogLevel.UNKNOWN && log.getLevel() != r.getLevel())
				continue;
			if (r.getSeverity() != LogSeverity.UNKNOWN && log.getSeverity() != r.getSeverity())
				continue;
			LogMessageCategory cat = findLogCategory(r.getName(), log);
			if (r.getNewLevel() != LogLevel.UNKNOWN)
				log.setLevel(r.getNewLevel());
			if (r.getNewSeverity() != LogSeverity.UNKNOWN)
				log.setSeverity(r.getNewSeverity());
			updateLogStats(cat.getStats(),"ALL",null,null,null);
			if (r.getUpdateFunction() != null) {
//				System.err.println("XYZ : " + log + " " + r.getUpdateFunction() + " " + findLogCategory(r.getName(),log));
				LogMessageState logState = LogsFactory.eINSTANCE.createLogMessageState();
				logState.setLog(log);
				logState.setCategory(cat);
				logState.setSuspended(ManagementServer.isSuspended(cat, null));
				FunctionUtils.update(logState, r.getUpdateFunction(), false); 
//				System.err.println("XYZ : " + log);
			}
			logger.debug("Rule matched:" + r);
			String n = log.getSeverity().toString() + ":" + log.getLevel().toString();
			updateLogStats(cat.getStats(),n,log.getSeverity(),log.getLevel(),LogSeverity.SEV3);
			// should break but SOMF does not handle list order correctly.
			// Note SOMF does now handle order.
		} 
	}

}
