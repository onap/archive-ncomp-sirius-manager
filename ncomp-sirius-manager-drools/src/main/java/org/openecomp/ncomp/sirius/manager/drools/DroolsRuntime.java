
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
	
/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openecomp.ncomp.sirius.manager.drools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.rule.Match;
import org.kie.api.time.SessionClock;
import org.kie.api.logger.KieRuntimeLogger; 
import org.kie.api.builder.KieScanner;
import org.kie.api.builder.ReleaseId;
//import org.kie.api.event.process.ProcessCompletedEvent;
//import org.kie.api.event.process.ProcessEventListener;
//import org.kie.api.event.process.ProcessNodeLeftEvent;
//import org.kie.api.event.process.ProcessNodeTriggeredEvent;
//import org.kie.api.event.process.ProcessStartedEvent;
//import org.kie.api.event.process.ProcessVariableChangedEvent;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
//import java.util.Calendar;
//import org.kie.api.event.KieRuntimeEventManager;
//import org.kie.api.event.rule.DebugAgendaEventListener;
//import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.ObjectDeletedEvent;
import org.kie.api.event.rule.ObjectInsertedEvent;
import org.kie.api.event.rule.ObjectUpdatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;
import org.kie.api.event.rule.RuleRuntimeEventListener;

public class DroolsRuntime {
	private static final Logger logger = Logger.getLogger(DroolsRuntime.class);
	private static final Logger logevents = Logger.getLogger("org.openecomp.ncomp.sirius.manager.drools.events");

	private final KieServices ks;
	private final ReleaseId releaseId;
	private final KieContainer kContainer;
	private final KieScanner kieScanner;
    private KieRuntimeLogger kLogger; 
	private KieSession kSession;
	private final ArrayList<EObject> rootList;
	private final HashMap<Object,FactHandle> factmap;
	private final HashMap<String,Object> globalmap;
	private long fireInterval = 1000L;
	private Thread fireThread = null;

	private final DroolsEventListener listener;
	
	// copied from org.openecomp.ncomp.sirius.manager.ManagementServer
	// except didn't use artificial id counter for final return case 
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
// WAS     return "id" + id++;
		return "idXXXXXX";
	}

	// copied from org.openecomp.ncomp.sirius.manager.ManagementServer
	private static String object2ref(EObject oo) {
		if (oo.eContainer() == null) {
			return "";
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
	
	private static String describeObject (Object o) {
		if (o instanceof EObject) {
			try {
				String s = object2ref((EObject) o);
				if (s != "") return s;
			} catch (Exception e) {
			}
		}
		return "object:" + o.getClass().getName();
	}
	
	private static String describeObject (Object parent, Object o) {
		StringBuffer b = new StringBuffer();
		b.append(object2ref((EObject)parent));
		b.append("/");
		if (o instanceof EObject) {
			EObject oo = (EObject) o;
			EReference ref = (EReference) oo.eContainingFeature();
			if (ref == null) {
				b.append("NullRef");
			} else {
				b.append(ref.getName());
				if (ref.isMany()) {
					b.append("/");
					b.append(ecoreId(oo));
				}
			}
		} else {
			b.append("child");
		}
		return b.toString();
	}
	
	private static String describeFact (FactHandle f) {
		String s = f.toExternalForm();
		int i = s.indexOf(' ');
		if (i >= 0) return s.substring(0,i-1);
		else return s;
	}
	
	private class DroolsAgendaListener implements AgendaEventListener {
		private void logMatch (Logger log, String label, Match m) {
			log.info(label + ": rule " + m.getRule().getName());
			for (int i=0; i<m.getDeclarationIds().size(); ++i) {
				log.info(label + ":   declaration " + m.getDeclarationIds().get(i)
						+ " fact " + describeFact(m.getFactHandles().get(i))
						+ " object " + describeObject(m.getObjects().get(i)));
			}
//			for (String d : m.getDeclarationIds()) {
//				log.info(label + ":   declaration " + d + " value " + describeObject(m.getDeclarationValue(d)));
//			}
//			for (FactHandle f : m.getFactHandles()) {
//				log.info(label + ":   fact " + f.toExternalForm());
//			}
//			for (Object o : m.getObjects()) {
//				log.info(label + ":   object " + o.toString());
//			}
//			log.info(label + ": match " + m.toString());
		}
		
		@Override
		public void afterMatchFired(AfterMatchFiredEvent e) {
			logMatch(logevents,"agenda afterMatchFired", e.getMatch());
			if (listener != null)
				listener.recordPolicyFire(e.getMatch().getRule().getName());
		}

		@Override
		public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent e) {
			logevents.info("agenda afterRuleFlowGroupActivated: " + e.getRuleFlowGroup().getName());
		}

		@Override
		public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent e) {
			logevents.info("agenda afterRuleFlowGroupDeactivated: " + e.getRuleFlowGroup().getName());
		}

		@Override
		public void agendaGroupPopped(AgendaGroupPoppedEvent e) {
			logevents.info("agenda agendaGroupPopped: " + e.getAgendaGroup().getName());
		}

		@Override
		public void agendaGroupPushed(AgendaGroupPushedEvent e) {
			logevents.info("agenda agendaGroupPushed: " + e.getAgendaGroup().getName());
		}

		@Override
		public void beforeMatchFired(BeforeMatchFiredEvent e) {
			logMatch(logevents,"agenda beforeMatchFired:", e.getMatch());
		}

		@Override
		public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent e) {
			logevents.info("agenda beforeRuleFlowGroupActivated: " + e.getRuleFlowGroup().getName());
		}

		@Override
		public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent e) {
			logevents.info("agenda beforeRuleFlowGroupDeactivated: " + e.getRuleFlowGroup().getName());
		}

		@Override
		public void matchCancelled(MatchCancelledEvent e) {
			logMatch(logevents,"agenda matchCancelled", e.getMatch());
			logevents.info("agenda matchCancelled: cause " + e.getCause().toString());
		}

		@Override
		public void matchCreated(MatchCreatedEvent e) {
			logMatch(logevents,"agenda matchCreated", e.getMatch());
		}
	}
	
	private class DroolsRuntimeListener implements RuleRuntimeEventListener {
		@Override
		public void objectDeleted(ObjectDeletedEvent e) {
			logevents.info("runtime objectDeleted: fact " + describeFact(e.getFactHandle()) + " o " + describeObject(e.getOldObject()));
			if (e.getRule() != null) logevents.info("runtime objectDeleted:    by rule " + e.getRule().getName());
			if (listener != null)
				listener.recordPolicyObjectDeleted(e.getOldObject());
		}

		@Override
		public void objectInserted(ObjectInsertedEvent e) {
			logevents.info("runtime objectInserted: fact " + describeFact(e.getFactHandle()) + 
					" o " + describeObject(e.getObject()) +
					" time " + getCurrentTime());
			if (e.getRule() != null) logevents.info("runtime objectInserted:    by rule " + e.getRule().getName());
			if (listener != null)
				listener.recordPolicyObjectInserted(e.getObject());
		}

		@Override
		public void objectUpdated(ObjectUpdatedEvent e) {
			logevents.info("runtime objectUpdated: fact " + describeFact(e.getFactHandle()) + " o " + describeObject(e.getObject()));
			if (e.getRule() != null) logevents.info("runtime objectUpdated:    by rule " + e.getRule().getName());
			if (listener != null)
				listener.recordPolicyObjectUpdated(e.getObject());
		}
	}
	
//	private class DroolsProcessListener implements ProcessEventListener {
//		@Override
//		public void afterNodeLeft(ProcessNodeLeftEvent e) {
//			logevents.info("process afterNodeLeft: " + e.toString());
//		}
//
//		@Override
//		public void afterNodeTriggered(ProcessNodeTriggeredEvent e) {
//			logevents.info("process afterNodeTriggered: " + e.toString());
//		}
//
//		@Override
//		public void afterProcessCompleted(ProcessCompletedEvent e) {
//			logevents.info("process afterProcessCompleted: " + e.toString());
//		}
//
//		@Override
//		public void afterProcessStarted(ProcessStartedEvent e) {
//			logevents.info("process afterProcessStarted: " + e.toString());
//		}
//
//		@Override
//		public void afterVariableChanged(ProcessVariableChangedEvent e) {
//			logevents.info("process afterVariableChanged: " + e.toString());
//		}
//
//		@Override
//		public void beforeNodeLeft(ProcessNodeLeftEvent e) {
//			logevents.info("process beforeNodeLeft: " + e.toString());
//		}
//
//		@Override
//		public void beforeNodeTriggered(ProcessNodeTriggeredEvent e) {
//			logevents.info("process beforeNodeTriggered: " + e.toString());
//		}
//
//		@Override
//		public void beforeProcessCompleted(ProcessCompletedEvent e) {
//			logevents.info("process beforeProcessCompleted: " + e.toString());
//		}
//
//		@Override
//		public void beforeProcessStarted(ProcessStartedEvent e) {
//			logevents.info("process beforeProcessStarted: " + e.toString());
//		}
//
//		@Override
//		public void beforeVariableChanged(ProcessVariableChangedEvent e) {
//			logevents.info("process beforeVariableChanged: " + e.toString());
//		}
//	}

	private class UpdateDroolsContentAdapter extends EContentAdapter {
		public void notifyChanged(Notification n) {
			super.notifyChanged(n); // the superclass handles adding/removing this Adapter to children
			logger.debug("received change notification, type " + n.getEventType() + ": " + n.toString());
//			logger.info("notification feature: " + (n.getFeature() == null ? "NULL" : n.getFeature().toString()) + " notifier: " + (n.getNotifier() == null  ? "NULL" : n.getNotifier().toString()));
			if (kSession == null) return;
			switch (n.getEventType()) {
			case Notification.ADD: {
				Object o = n.getFeature();
				if (o instanceof EReference) {
					EReference er = (EReference) o;
					if (er.isMany()) {
						@SuppressWarnings("rawtypes")
						EList l = (EList) ((EObject) n.getNotifier()).eGet(er);
						Object o2 = l.get(n.getPosition());
						logger.debug("inserting (1) into kSession: " + describeObject(o2));
						FactHandle fh = kSession.insert(o2);
						factmap.put (o2, fh);
					} else {
						Object o2 = ((EObject) n.getNotifier()).eGet(er);
						logger.debug("inserting (2) into kSession: " + describeObject(o2));
						FactHandle fh = kSession.insert(o2);
						factmap.put (o2, fh);
					}
				} else {
					logger.debug("inserting (3) into kSession: " + describeObject(o));
					FactHandle fh = kSession.insert(o);
					factmap.put (o, fh);
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				Object o = n.getFeature();
				if (!(o instanceof EReference)) {
					logger.error("remove_many, but feature is not EReference");
					return;
				}
				EReference er = (EReference) o;
				if (!er.isMany()) {
					logger.error("remove_many, but reference is not many");
					return;
				}
				@SuppressWarnings("unchecked")
				List<Object> l = (List<Object>) n.getOldValue();
				int[] positions = (int []) n.getNewValue();
				for (int i=0; i<positions.length; ++i) {
					Object o2 = l.get(positions[i]);
					logger.debug("removing (4) from kSession: " + describeObject(n.getNotifier(),o2));
					FactHandle fh = factmap.get(o2);
					if (fh == null) {
						logger.error ("remove, but no FactHandle for kSession object " + describeObject(n.getNotifier(),o2));
						continue;
					}
					kSession.delete(fh);
					factmap.remove(o);
				}
				break;
			}
			case Notification.REMOVE: {
//				Object o = n.getFeature();
//				if (o instanceof EReference) {
//					EReference er = (EReference) o;
//					if (er.isMany()) {
//						@SuppressWarnings("rawtypes")
//						EList l = (EList) ((EObject) n.getNotifier()).eGet(er);
//						logger.info("removing (1) position " + n.getPosition() + " list size " + l.size());
//						Object o2 = l.get(n.getPosition());
//						logger.info("removing (1) from kSession: " + describeObject(o2));
//						FactHandle fh = factmap.get(o2);
//						if (fh == null) {
//							logger.error ("remove, but no FactHandle for kSession object " + describeObject(o2));
//							return;
//						}
//						kSession.delete(fh);
//						factmap.remove(o);
//					} else {
//						Object o2 = ((EObject) n.getNotifier()).eGet(er);
//						logger.info("removing (2) from kSession: " + describeObject(o2));
//						FactHandle fh = factmap.get(o2);
//						if (fh == null) {
//							logger.error ("remove, but no FactHandle for kSession object " + describeObject(o2));
//							return;
//						}
//						kSession.delete(fh);
//						factmap.remove(o);
//					}
//				} else {
//					logger.info("removing (3) from kSession: " + describeObject(o));
//					FactHandle fh = factmap.get(o);
//					if (fh == null) {
//						logger.error ("remove, but no FactHandle for kSession object " + describeObject(o));
//						return;
//					}
//					kSession.delete(fh);
//					factmap.remove(o);
//				}
				Object o = n.getOldValue();
				logger.debug("removing (5) from kSession: " + describeObject(o));
				FactHandle fh = factmap.get(o);
				if (fh == null) {
					logger.error ("remove, but no FactHandle for kSession object " + describeObject(o));
					return;
				}
				kSession.delete(fh);
				factmap.remove(o);
				break;
			}
			case Notification.SET:
			case Notification.UNSET: {
				Object o = n.getNotifier();
				logger.debug("updating in kSession: " + describeObject(o));
				Object f = n.getFeature();
				if (f instanceof EReference) {
					EReference er = (EReference) f;
					if (er.isContainer() && n.getNewValue() == null) {
						logger.debug("changing container to null, ignoring update");
						return;
					}
				}
				FactHandle fh = factmap.get(o);
				if (fh == null) {
					logger.debug ("update, but no FactHandle for kSession object " + describeObject(o));
					return;
				}
				kSession.update(fh, o);
				break;
			}
			case Notification.REMOVING_ADAPTER:
				// no action seems to be needed
				break;
			default: {
				logger.warn("received change notification, unknown event type " + n.getEventType() + ": " + n.toString());
				break;
			}
			}
		}
	}

	public DroolsRuntime (long fireInterval, String groupId, String artifactId, String version,
						  DroolsEventListener listener) {
		this.listener = listener;
		
	    // Load up the knowledge base.
		// Interface from where it possible to access all the Kie building and runtime facilities:
        ks = KieServices.Factory.get();
        
        // KieContainer reads the files to be built from the classpath. In this way all the Java 
        // sources and the Kie resources are compiled and deployed into the KieContainer which makes 
        // its contents available for use at runtime.   
        //KieContainer kContainer = ks.getKieClasspathContainer();
	    releaseId = ks.newReleaseId( groupId, artifactId, version );
	    kContainer = ks.newKieContainer(releaseId);
	    
	    // If the KieScanner finds in the Maven repository an updated version of the Kie project used 
	    // by that KieContainer it automatically downloads the new version and triggers an incremental 
	    // build of the new project. From this moment all the new KieBases and KieSessions created from 
	    // that KieContainer will use the new project version.
	    kieScanner = ks.newKieScanner(kContainer);
	    logger.debug("got kieScanner, class " + kieScanner.getClass().getName());

	    kSession = null;
	    kLogger = null;

	    rootList = new ArrayList<EObject>();
	    factmap = new HashMap<Object,FactHandle>();
	    globalmap = new HashMap<String,Object>();
	    
	    this.fireInterval = fireInterval;
	}
	
	public void addObjectTree (EObject o) {
		o.eAdapters().add(new UpdateDroolsContentAdapter());
		rootList.add(o);
		if (kSession != null) {
			insertRecursively (o);
		}
	}
	
	public void addEvents(EList<? extends EObject> l) {
		for (EObject o : l) {
			addEvent(o);
		}
	}
	
	public void addEvent (EObject o) {
		logger.debug("inserting event into kSession: " + describeObject(o));
		logger.debug("insert event class: " + o.getClass());
		try {
			kSession.insert(o);
		} catch (Exception e) {
			logger.error("kSession insert failed inserting " + o.toString(), e);
		}
	}
	
	public void setGlobal (String s, Object o) {
		globalmap.put(s, o);
	}
	
	private void insertRecursively (EObject o) {
		logger.debug("inserting (recursively) into kSession: " + describeObject(o));
		FactHandle fh = kSession.insert(o);
		factmap.put (o, fh);
		for (EReference ref : o.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o.eGet(ref);
				for (EObject o1 : l) {
					insertRecursively(o1);
				}
			} else {
				EObject o1 = (EObject) o.eGet(ref);
				if (o1 != null)
					insertRecursively(o1);
			}
		}
	}
	
	public void startSession() {
		logger.info("starting kie session");
// specifying TimedRuleExectionOption here appears to override any values from kmodules.xml		
//		KieSessionConfiguration ksconf = ks.newKieSessionConfiguration();
//		ksconf.setOption(TimedRuleExectionOption.YES);
//	    kSession = kContainer.newKieSession("ksession-rules", ksconf);
		kSession = kContainer.newKieSession("ksession-rules");
	    if (kSession == null) logger.error("Unable to start kie session");
	    kSession.addEventListener (new DroolsAgendaListener() );
	    kSession.addEventListener (new DroolsRuntimeListener() );
//	    kSession.addEventListener (new DroolsProcessListener() );
	    //logger = KieServices.Factory.get().getLoggers().newConsoleLogger(kSession);
    	//kLogger = ks.getLoggers().newFileLogger( kSession, "./logs/audit" );
    	
	    for (Entry<String,Object> e : globalmap.entrySet()) {
	    	try {
	    		kSession.setGlobal(e.getKey(), e.getValue());
	    	} catch (RuntimeException re) {
	    		logger.warn("Unable to set global " + e.getKey() + ": " + re.getMessage());
	    	}
	    }

	    for (EObject o : rootList) {
    		insertRecursively (o);
    	}
    	
    	fireThread = new Thread("rule-firing-thread") {
			public void run() {
				while (!isInterrupted()) {
					logger.debug("firing all rules...");
					try {
//						fireAllRules();
						fireUntilHalt();
					} catch (Exception e) {
						logger.error("fireAllRules() threw exception", e);
					}

					try {
						Thread.sleep(fireInterval);
					} catch(InterruptedException ex) {
						logger.info("rule firing thread interruped");
						Thread.currentThread().interrupt();
					}
				}
				logger.info("rule firing thread returning");
			}
    	};
    	fireThread.start();
	}
	
	public void stopSession() {
		logger.info("stopping session");
		logger.info("stopping rule firing thread");
		fireThread.interrupt();
		try {
			fireThread.join();
		} catch (InterruptedException e) {
			logger.warn("Interruped while waiting for fireThread.join()");
			Thread.currentThread().interrupt();
		}
		fireThread = null;
       	if (kSession != null) kSession.dispose();
    	if (kLogger != null) kLogger.close();
    	kSession = null;
    	kLogger = null;
    	factmap.clear();
	}
	
	public void startScanner (long interval) {
		kieScanner.start (interval);
	}
	public void doScan () {
		kieScanner.scanNow ();
	}
	public void stopScanner () {
		kieScanner.stop ();
	}
	
	public void renewSession () {
		stopSession();
		startSession();
	}
	
	public void fireAllRules() {
		if (kSession != null)
			kSession.fireAllRules();
	}
	
	public void fireUntilHalt() {
		if (kSession != null) {
			kSession.fireUntilHalt();
		} else {
			logger.warn("fireUntilHalt but null kSession");
		}
	}

	public long getCurrentTime() {
		return kSession.getSessionClock().getCurrentTime();
	}
	
	public long advanceTime(long delta, TimeUnit unit) {
		SessionClock clock = kSession.getSessionClock();
//		if (kSession.getSessionConfiguration().getOption(ClockTypeOption.class).getClockType() == "pseudo") {
//		org.drools.core.time.SessionPseudoClock clock = kSession.getSessionClock();
//		clock.advanceTime(delta, unit);
//	}
		if (clock instanceof org.drools.core.time.SessionPseudoClock) {
			((org.drools.core.time.SessionPseudoClock) clock).advanceTime(delta,  unit);
		} else {
			logger.error("Attempted to advanceTime, but session clock is not pesudoclock");
		}
	    return clock.getCurrentTime();
    }

	
//	public static void main(String[] args) throws Exception {
//	    ServiceController s = ServiceFactory.eINSTANCE.createServiceController();
//
//	    Enodeb e = ServiceFactory.eINSTANCE.createEnodeb();
//	    s.getENodeBs().add(e);
//	    e.setGain1("foo");
//	    Enodeb e2 = ServiceFactory.eINSTANCE.createEnodeb();
//	    s.getENodeBs().add(e2);
//	    e2.setGain1("foo");
//
//	    DroolsRuntime drools = new DroolsRuntime (1000L, "org.openecomp.ncomp.test", "pol", "1.1.1-SNAPSHOT");
//
//	    drools.addObjectTree(s);
//	    
//	    // Start the KieScanner polling the Maven repository every 10 seconds
//	    drools.startScanner( 10000L );
//	    
//	    drools.startSession();
//	    
//	    EnodebTcpLossAnomalyList anomalylist = ServiceFactory.eINSTANCE.createEnodebTcpLossAnomalyList();
//	    drools.addObjectTree(anomalylist);
//	    EnodebTcpLossAnomaly a = ServiceFactory.eINSTANCE.createEnodebTcpLossAnomaly();
//	    a.setNewEvent(true);
//	    Date d = new Date();
//	    a.setStartTime(new Date(d.getTime() - 30000));
//	    a.setEndTime(d);
//	    anomalylist.getAnomalies().add(a);
//
//	    while (true) {
//	    	drools.fireAllRules();
//
//	       	try {
//	       	    Thread.sleep(10000L); // In milliseconds for looping. 
//	       	} catch(InterruptedException ex) {
//	       	    Thread.currentThread().interrupt();
//	       	}
//	       	drools.renewSession();
//        }
//	}
}
