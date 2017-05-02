
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
	
package org.openecomp.ncomp.sirius.manager.metrics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EAnnotationImpl;
import org.json.JSONObject;

import org.openecomp.ncomp.core.OperationalState;
import org.openecomp.ncomp.core.alerts.Alert;
import org.openecomp.ncomp.core.alerts.AlertContainer;
import org.openecomp.ncomp.core.alerts.ThresholdAlert;
import org.openecomp.ncomp.core.types.metrics.*;
import org.openecomp.ncomp.sirius.manager.*;
import org.openecomp.ncomp.utils.SortUtil;
import org.openecomp.ncomp.utils.journaling.JournalingDateObject;
import org.openecomp.ncomp.utils.journaling.JournalingHashMap;
import org.openecomp.ncomp.utils.journaling.JournalingObject;
import org.openecomp.ncomp.webservice.utils.DateUtils;

import static org.openecomp.ncomp.sirius.manager.ManagementServerUtils.printStackTrace;

public class MetricStore implements IMetricStore {
	public static final Logger logger = Logger.getLogger(MetricStore.class);
	static {
		JournalingObject.addClassToWhiteList("org.openecomp.ncomp.core.types.metrics.*");
	}
	JournalingDateObject<JournalingHashMap<MetricDailyMeasurement>> metrics;
	private EObject o;
	private MetricManager manager;
	public MetricStore(String dir, EObject o, MetricManager m) {
		metrics = new JournalingDateObject<JournalingHashMap<MetricDailyMeasurement>>(dir, JournalingHashMap.class);
		this.o = o;
		this.manager = m;
	}
	
	public void addDoubleValue(String path, Date d, Double v, String aType) {
		MetricDailyMeasurement p = getMeasurement(path,d);
		initAttribute(path,aType);
		p.add(d,v);
		checkAlerts(p,d,path,v);
	}

	public void addLongValue(String path, Date d, Long v, String aType, boolean isDelta) {
		MetricDailyMeasurement p = getMeasurement(path,d);
		MetricAttribute a = initAttribute(path,aType);
		if (isDelta && p.getLast() != null) {
			v += ((LongMetricMeasurement) p.getLast()).v;
		}
		p.add(d,v);
		if (a instanceof DateMetricAttribute) {
			v = new Date().getTime() - v;
		}
		checkAlerts(p,d,path,v);
	}
	public void addStringValue(String path, Date d, String v, String aType) {
		MetricDailyMeasurement p = getMeasurement(path,d);
		initAttribute(path,aType);
		p.add(d,v);
//		checkAlerts(p,d,path,v);
	}
	
	
	public void addStringValue(String path, Date d, String v) {
		MetricDailyMeasurement p = getMeasurement(path,d);
		// need to convert the String to the right kind of value.
		MetricAttribute aa = initAttribute(path,null);
		if (aa instanceof IncreasingULongMetricAttribute || aa instanceof LongMetricAttribute) {
			// convert v to long
			long v1 = Long.parseLong(v);
			p.add(d,v1);
			checkAlerts(p,d,path,v1);
			return;
		}
		if (aa instanceof DoubleMetricAttribute) {
			// convert v to double
			double v1 = Double.parseDouble(v);
			p.add(d,v1);
			checkAlerts(p,d,path,v1);
			return;
		}
		if (aa == null) {
			logger.warn("unable to find measurement attribute for path: " + path);
			return;
		}
		throw new RuntimeException("Should not get here");
	}
	
	private void checkAlerts(MetricDailyMeasurement p, Date d, String path, double v) {
		if (!d.equals(p.getLast().d)) return;
		if (o == null) throw new RuntimeException("Cannot check Alerts without EObject");
		Subject s = manager.server.findAndCreateSubject(o,path);
		if (s == null || s.o == null || s.attr == null) return;
		if (s.o instanceof AlertContainer) {
			MetricAttribute aa = (MetricAttribute) s.o.eGet(s.attr);
			AlertContainer alerts = (AlertContainer) s.o;
			for (Alert a : alerts.getAlerts()) {
				if (ManagementServer.getOperationalState(a) == OperationalState.SUSPENDED) continue; 
				try {
					if (a instanceof ThresholdAlert) {
						ThresholdAlert a1 = (ThresholdAlert) a;
						if (a1.getDuration() != null) {
							v = MetricUtils.getAverage(aa,a1.getDuration());
						}
						if (!s.attr.getName().equals(a1.getMetricName())) continue;
						if (a1.getLowerBound() != null && v < a1.getLowerBound()) {
							String path2 = ManagementServer.object2ref(s.o) + path + "/" + a1.getMetricName();
							logger.warn("Metric Alert: path={" + path2 +"} sev={" + a1.getSeverity() +"} " + a1.getMetricName() + " is too low " + v + " < " + a1.getUpperBound());
						}
						if (a1.getUpperBound() != null && v > a1.getUpperBound()) {
							String path2 = ManagementServer.object2ref(s.o);
							logger.warn("Metric Alert: path={" + path2 +"} sev={" + a1.getSeverity() +"} " + a1.getMetricName() + " is too high " + v + " > " + a1.getUpperBound());
						}
						return;
					}
					logger.warn("unknown alert class: " + a.eClass().getName());
				} catch (Exception e) {
					a.setOperationalState(OperationalState.SUSPENDED);
					logger.error("error in alert (now disabled): " + e);
				}
			}
		}
		
	}
	protected MetricAttribute initAttribute(String path, String aType) {
		if (o == null) throw new RuntimeException("Cannot init attribute without EObject");
		Subject s;
		try {
			s = manager.server.findAndCreateSubject(o,path);
		} catch (Exception e) {
			logger.warn("Unable to create object path={" + path + "} " + e);
			System.err.println("Unable to create object for: " + path + " " + e);
			printStackTrace(e);
			return null;
		}
		if (s == null || s.o == null || s.attr == null) return null;
		if (s.o.eGet(s.attr) != null) return (MetricAttribute) s.o.eGet(s.attr);
		String eName = (aType == null) ? s.attr.getEType().getName() : aType;
		MetricAttribute aa = null;
		if (eName.equals("IncreasingULongMetricAttribute")) {
			aa = new IncreasingULongMetricAttribute();
		}
		else if (eName.equals("LongMetricAttribute")) {
			aa = new LongMetricAttribute();
		}
		else if (eName.equals("DoubleMetricAttribute")) {
			aa = new DoubleMetricAttribute();
		}
		else if (eName.equals("DateMetricAttribute")) {
			aa = new DateMetricAttribute();
		}
		else if (eName.equals("StringMetricAttribute")) {
			aa = new StringMetricAttribute();
		}
		else  throw new RuntimeException("Unknown type: " + eName + " for path: " + path);
//		System.err.println("TYPES:" + ManagementServer.object2ref(s.o)+ " " + s.attr.getEType().getName()  + " " + aa);
		s.o.eSet(s.attr,aa);
		aa.setup(this, path);
		return aa;
	}

	MetricDailyMeasurement getMeasurement(String path, Date d) {
		JournalingHashMap<MetricDailyMeasurement> m = metrics.get(d);
		MetricDailyMeasurement p = m.get(path);
		if (p == null) {
			p = m.newKey(path, MetricDailyMeasurement.class);
		}
		return p;
	}

	public MetricMeasurement getLast(String path) {
		Date now = new Date();
		MetricDailyMeasurement p = metrics.get(now).get(path);
		if (p != null) { 
			MetricMeasurement m = p.getLast();
			if (m != null) return m;
		}
		now.setTime(now.getTime()-24*3600000);
		p = metrics.get(now).get(path);
		if (p != null) { 
			MetricMeasurement m = p.getLast();
			if (m != null) return m;
		}
		return null;
	}
	public MetricMeasurement getLast2(String path) {
		Date now = new Date();
		MetricDailyMeasurement p = metrics.get(now).get(path);
		if (p != null) { 
			MetricMeasurement m = p.getLast();
			if (m != null) return p.getLast2();
		}
		now.setTime(now.getTime()-24*3600000);
		p = metrics.get(now).get(path);
		if (p != null) { 
			MetricMeasurement m = p.getLast();
			if (m != null) return p.getLast2();
		}
		return null;
	}

	private Comparator<? super MetricMeasurement> comp = new Comparator<MetricMeasurement>() {
		@Override
		public int compare(MetricMeasurement t1, MetricMeasurement t2) {
			return ((Long)t1.d.getTime()).compareTo(t2.d.getTime());
		}
	};

	public List<MetricMeasurement> getValues(String path, Date start, Date end) {
		List<MetricMeasurement> res = new ArrayList<MetricMeasurement>();
		for (Date d: DateUtils.dateRange(start, end, DateUtils.stringToDuration("1day"))) {
			MetricDailyMeasurement p = metrics.get(d).get(path);
			if (p == null) continue;
			for (MetricMeasurement m : p.l) {
				if (m.d.before(start) || m.d.after(end)) continue;
				res.add(m);
			}
		}
		return SortUtil.sort(res, comp);
	}

	public void save() {
		metrics.save();
	}
	long lastUpdate = 0;
	public boolean save(long i) {
		long now = new Date().getTime();
		if (lastUpdate + i < now) {
			save();
			lastUpdate = new Date().getTime();
			return true;
		}
		return false;
	}
	public void close() {
		metrics.close();
	}

	public JSONObject toJson() {
		JSONObject json = new JSONObject();
		json.put("metrics", metrics.toJson());
		return json ;
	}

	public void initStore() { 
		Date yesterday = DateUtils.dateFromString("-1day");
		Date today = new Date();
		for (Date d: DateUtils.dateRange(yesterday , today, DateUtils.stringToDuration("1day"))) {
			List<String> l = new ArrayList<String>(metrics.get(d).keySet());
			for (String path: l) {
				// TODO the type need to be persistent.
				try {
					if (o != null) initAttribute(path,null);
				} catch (Exception e) {
					logger.warn("unable to init: " + path);
					printStackTrace(e);
				}
			}
		}
	}

	public EObject getObject() {
		return o;
	}

}
