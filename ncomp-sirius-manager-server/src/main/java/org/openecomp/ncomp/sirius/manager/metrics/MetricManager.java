
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

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.openecomp.ncomp.component.Api;
import org.openecomp.ncomp.core.metrics.AggregationMetricValueOption;
import org.openecomp.ncomp.core.metrics.AggregationMetricValueOptionType;
import org.openecomp.ncomp.core.metrics.BasicMetricValueOption;
import org.openecomp.ncomp.core.metrics.MetricValueOption;
import org.openecomp.ncomp.core.metrics.MetricsFactory;
import org.openecomp.ncomp.core.metrics.SequenceMetricValueOption;
import org.openecomp.ncomp.core.types.metrics.DateMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.DoubleMetricMeasurement;
import org.openecomp.ncomp.core.types.metrics.IncreasingULongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.LongMetricAttribute;
import org.openecomp.ncomp.core.types.metrics.MetricAttribute;
import org.openecomp.ncomp.core.metrics.DoubleMetric;
import org.openecomp.ncomp.core.metrics.LongMetric;
import org.openecomp.ncomp.core.metrics.Metric;
import org.openecomp.ncomp.sirius.manager.*;
import org.openecomp.ncomp.utils.SortUtil;
import org.openecomp.ncomp.utils.StringUtil;
import org.openecomp.ncomp.utils.journaling.JournalingList;
import org.openecomp.ncomp.webservice.utils.DateUtils;

public class MetricManager {
	public static final Logger logger = Logger.getLogger(MetricManager.class);
	ManagementServer server;
	private HashMap<String, MetricStore> path2store = new HashMap<String, MetricStore>();
	private JournalingList<String> allStores = null;

	@SuppressWarnings("unchecked")
	public MetricManager(ManagementServer s) {
		super();
		this.server = s;
		String dir = s.getProps().getProperty("metrics.dir");
		if (dir == null)
			return;
		String file = dir + "/allStores.dat";
		allStores = JournalingList.create(new File(file));
		// TODO initialize old stores in separate thread.
		initManager();
	}

	private void initManager() {
		final Thread t = new Thread("init metrics") {
			@Override
			public void run() {
				while (server.getObject() == null) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						ManagementServerUtils.printStackTrace(e);
					}
				}
				logger.info("Starting initializing Metric Stores");
				List<String> l = new ArrayList<String>(allStores);
				for (String path : l) {
					Subject s = ManagementServer.find(server.getObject(), "/" + path);
					if (s == null || s.o == null) {
						continue;
					}
					MetricStore store = getStore(s.o);
					store.initStore();
				}
				logger.info("Done initializing Metric Stores");
			}
		};
		t.start();
		Thread t1 = new Thread("record metrics") {
			@Override
			public void run() {
				// wait for initialization to complete before starting to record
				try {
					t.join();
				} catch (InterruptedException e1) {
					logger.warn("Failure while waiting for thread initialization to complete: " + e1);
				}
				while (true) {
					try {
						Thread.sleep(60000);
						updateMetrics(server.getObject());
					} catch (Exception e) {
						logger.warn("recording metrics " + e);
						e.printStackTrace();
					}
				}
			}

		};
		t1.start();
	}
	private void updateMetrics(EObject o) {
		for (EAttribute attr : o.eClass().getEAllAttributes()) {
			Object a = o.eGet(attr);
			if (a instanceof MetricAttribute) {
				MetricAttribute m = (MetricAttribute) a;
				m.record();
			}
		}
		for (EReference ref : o.eClass().getEAllContainments()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) o.eGet(ref);
				for (EObject o1 : l) {
					updateMetrics(o1);
				}
			}
			else {
				EObject o1 = (EObject) o.eGet(ref);
				if (o1 != null) updateMetrics(o1);
			}
		}
		
	}

	public MetricStore getStore(EObject o) {
		String path = ManagementServer.object2ref(o);
		MetricStore store = path2store.get(path);
		if (store == null) {
			// path2metric[cc] = [:]
			String dir = server.getProps().getProperty("metrics.dir", "data/metrics");
			store = new MetricStore(dir + path, o, this);
			path2store.put(path, store);
			if (!allStores.contains(path)) {
				allStores.add(path);
				allStores.save();
			}
		}
		return store;
	}

	public void updateMetric(EObject o, EAttribute attr, Object value) {
		MetricStore store = findStore(o);
		String path = ManagementServer.relativeObject2ref(store.getObject(), o);
		if (path == null) {
			System.err.println("Internal error in findStore (null path): " + store.getObject() + " " + o);
			System.err.println(store.getObject().eContainer() + " " + o.eContainer());
			System.err.println(ManagementServer.object2ref(store.getObject()) + " " + ManagementServer.object2ref(o));
			return;
			// throw new
			// RuntimeException("Internal error in findStore (null path): " +
			// store.getObject() + " " + o);
		}
		path = path + "/" + attr.getName();
		String t = attr.getEType().getName();
		// System.err.println("adding " + path + " " + t + " " + value);
		if (t.equals("IncreasingULongMetricAttribute")) {
			store.addLongValue(path, new Date(), value2long(value), t, false);
		} else if (t.equals("LongMetricAttribute")) {
			store.addLongValue(path, new Date(), value2long(value), t, false);
		} else if (t.equals("DoubleMetricAttribute")) {
			store.addDoubleValue(path, new Date(), value2double(value), t);
		} else if (t.equals("DateMetricAttribute")) {
			store.addLongValue(path, new Date(), value2long(value), t, false);
		} else if (t.equals("StringMetricAttribute")) {
			logger.warn("Unsuppported metric: " + t);
		}
	}

	private Double value2double(Object value) {
		if (value instanceof Double) {
			return (Double) value;
		}
		if (value instanceof Integer) {
			Integer i = (Integer) value;
			return i.doubleValue();
		}
		if (value instanceof Long) {
			Long i = (Long) value;
			return i.doubleValue();
		}
		if (value instanceof String) {
			return Double.parseDouble((String) value);
		}
		throw new RuntimeException("Unable to convert value to double: " + value + " " + value.getClass());
	}

	private long value2long(Object value) {
		if (value instanceof Long) {
			return (Long) value;
		}
		if (value instanceof Integer) {
			Integer i = (Integer) value;
			return i.longValue();
		}
		if (value instanceof String) {
			return Long.parseLong((String) value);
		}
		throw new RuntimeException("Unable to convert value to long: " + value + " " + value.getClass());
	}

	private MetricStore findStore(EObject o) {
		if (o.eContainer() == null)
			return getStore(o);
		EAnnotation anno = o.eClass().getEAnnotation("http://openecomp.org/sirius/store");
		if (anno != null)
			return getStore(o);
		return findStore(o.eContainer());
	}

	public void updateMetrics(EObject s, EList<Metric> metrics) {
		MetricStore store = getStore(s);
		for (Metric m : metrics) {
			if (m.getTime() < 140646778200L) {
				logger.warn("Metric time is too old:" + new Date(m.getTime()));
				m.setTime(new Date().getTime());
			}
			try {
				String x = m.getResourceName() + "/" + m.getMetricName();
				// if (x.contains("qfsFilesystems")) System.err.println("ZZZ: "
				// + x + " " + m);
				if (m instanceof DoubleMetric) {
					DoubleMetric dm = (DoubleMetric) m;
					store.addDoubleValue(x, new Date(m.getTime()), dm.getValue(), null);
					continue;
				}
				if (m instanceof LongMetric) {
					LongMetric lm = (LongMetric) m;
					store.addLongValue(x, new Date(m.getTime()), lm.getValue(), null, lm.isDelta());
					continue;
				}
				logger.warn("unknown metric: " + m);
			} catch (Exception e) {
				logger.warn("unable to update metric " + m + " " + e);
				ManagementServerUtils.printStackTrace(e);
			}
		}
		store.save(30000);
	}

	public EList<DoubleMetric> getValues(String path, Long start, Long end, MetricValueOption option, boolean relativeInterval) {
		return getValues(server.getObject(), start, end, path, option, relativeInterval);
	}

	public static EList<DoubleMetric> getValues(EObject o, Long start, Long end, String path, MetricValueOption option,
			boolean relativeInterval) {
		Subject s = ManagementServer.find(o, path);
		if (s == null || s.o == null || s.attr == null)
			throw new RuntimeException("Bad Path: " + path + " " + o);
		if (start == null)
			throw new RuntimeException("No start parameter");
		if (end == null)
			throw new RuntimeException("No end parameter");
		Object a = s.o.eGet(s.attr);
		if (!(a instanceof MetricAttribute)) {
			if (a == null)
				throw new RuntimeException("Null Attribute: " + s.o.eClass().getName() + "@" + s.attr.getName());
			else
				throw new RuntimeException("Not a metric Attribute: " + s.o.eClass().getName() + "@" + s.attr.getName());
		}
		return getValues((MetricAttribute) a, s.attr, start, end, ManagementServer.object2ref(o) + path, option, false);
	}

	public static double getValue(EObject o, String path, MetricValueOption option) {
		Subject s = ManagementServer.find(o, path);
		if (s == null || s.attr == null)
			throw new RuntimeException("Bad Path: " + path);
		Object a = s.o.eGet(s.attr);
		if (!(a instanceof MetricAttribute)) {
			throw new RuntimeException("Not a metric Attribute: " + s.o.eClass().getName() + "@" + s.attr.getName());
		}
		long d = option2duration(option);
		MetricAttribute aa = (MetricAttribute) a;
		if (d > 0) {
			long end = new Date().getTime();
			long start = end - d;
			EList<DoubleMetric> l = getValues(aa, s.attr, start, end, path, option, true);
			if (l.size() > 1) {
				System.err.println("wrong number returned" + l);
				return -3;
			}
			return l.size() == 1 ? l.get(0).getValue() : 0.0;
		}
		// TODO the value should depend on the options. E.g., date.
		return getValue(aa);
	}

	private static double getValue(MetricAttribute aa) {
		if (aa instanceof LongMetricAttribute) {
			LongMetricAttribute m = (LongMetricAttribute) aa;
			Long l = m.getValue();
			return l == null ? null : l.doubleValue();
		}
		if (aa instanceof IncreasingULongMetricAttribute) {
			IncreasingULongMetricAttribute m = (IncreasingULongMetricAttribute) aa;
			return m.getValue();
		}
		if (aa instanceof DoubleMetricAttribute) {
			DoubleMetricAttribute m = (DoubleMetricAttribute) aa;
			return m.getValue();
		}
		return -1;
	}

	private static long option2duration(MetricValueOption option) {
		if (option instanceof AggregationMetricValueOption) {
			return DateUtils.stringToDuration(((AggregationMetricValueOption) option).getDuration());
		}
		if (option instanceof SequenceMetricValueOption) {
			SequenceMetricValueOption o = (SequenceMetricValueOption) option;
			long l = 0;
			for (MetricValueOption o1 : o.getOptions()) {
				long l1 = option2duration(o1);
				if (l1 > l)
					l = l1;
			}
			return l;
		}
		return 0;
	}

	private static EList<DoubleMetric> getValues(MetricAttribute a, EAttribute attr, Long start, Long end, String path,
			MetricValueOption option, boolean relativeInterval) {
		List<DoubleMetricMeasurement> ll = a.getValuesDouble(new Date(start), new Date(end));
		EList<DoubleMetric> l = new BasicEList<DoubleMetric>();
		for (DoubleMetricMeasurement v : ll) {
			DoubleMetric m = MetricsFactory.eINSTANCE.createDoubleMetric();
			m.setMetricName(attr.getName());
			m.setValue(v.v);
			m.setTime(v.d.getTime());
			m.setResourceName(path);
			l.add(m);
		}
//		System.err.println("getValues path=" + path + " start=" + start + " end=" + end + " #values=" + l.size());
		return handleOption(path, attr, l, start, end, option, relativeInterval);
	}

	private static EList<DoubleMetric> handleOption(String path, EAttribute attr, EList<DoubleMetric> values, Long start, Long end,
			MetricValueOption option, boolean relativeInterval) {
		if (option instanceof AggregationMetricValueOption) {
			return handleOptionAggregation(path, attr, values, start, end, (AggregationMetricValueOption) option, relativeInterval);
		}
		if (option instanceof BasicMetricValueOption) {
			return handleOptionBasic(attr, values, (BasicMetricValueOption) option);
		}
		if (option instanceof SequenceMetricValueOption) {
			return handleOptionSequence(path, attr, values, start, end, (SequenceMetricValueOption) option, relativeInterval);
		}
		return values;
	}

	private static EList<DoubleMetric> handleOptionSequence(String path, EAttribute attr, EList<DoubleMetric> values, Long start, Long end,
			SequenceMetricValueOption option, boolean relativeInterval) {
		// System.err.println("handleOptionSequence:" + path + " " +
		// attr.getName());
		for (MetricValueOption o : option.getOptions()) {
			values = handleOption(path, attr, values, start, end, o, relativeInterval);
		}
		return values;
	}

	private static EList<DoubleMetric> handleOptionBasic(EAttribute attr, EList<DoubleMetric> values, BasicMetricValueOption option) {
		boolean isDate = attr.getEType().getName().equals("DateMetricAttribute");
		// TODO handle date metrics when the value should be the difference
		// between the current and prev time.
		// EAnnotation anno =
		// attr.getEAnnotation("http://openecomp.org/sirius/metric");
		// anno.getDetails().get("type");
		// System.err.println("handleOptionBasic:" + attr.getName() + " " +
		// isDate);
		for (DoubleMetric d : values) {
			if (isDate)
				d.setValue(d.getTime() - d.getValue());
		}
		return values;
	}

	private static EList<DoubleMetric> handleOptionAggregation(String path, EAttribute attr, EList<DoubleMetric> values, Long start,
			Long end, AggregationMetricValueOption option, boolean relativeInterval) {
		HashMap<Long, List<DoubleMetric>> m = new HashMap<Long, List<DoubleMetric>>();
		// System.err.println("handleOptionAggregation:" + path + " " +
		// attr.getName());
		if (option.getDuration() == null || option.getDuration().equals(""))
			return values;
		long duration2 = DateUtils.stringToDuration(option.getDuration());
		if (duration2 == 0)
			return values;
		if (!relativeInterval) {
			start = start / duration2 * duration2;
			end = end / duration2 * duration2 + duration2;
		}
		if (start > end)
			throw new RuntimeException("Bad time interval");
		long delta = start - (start / duration2 * duration2);
		for (long t = start; t < end; t += duration2) {
			m.put(t - delta, new ArrayList<DoubleMetric>());
			// System.err.println("times " + (t - delta) + " " + new
			// Date(t-delta));
		}
		for (DoubleMetric d : values) {
			long tt = (d.getTime() - delta) / duration2 * duration2;
			List<DoubleMetric> dd = m.get(tt);
			if (dd == null) {
				logger.warn("metric outside range " + new Date(tt) + " " + new Date(start) + " " + new Date(end));
				continue;
			}
			dd.add(d);
		}
		EList<DoubleMetric> res = new BasicEList<DoubleMetric>();
		int i = 1;
		for (long t : SortUtil.sort(m.keySet())) {
			if (i++ == m.keySet().size() && m.get(t).size() == 0)
				continue; // ignore last timebin if empty.
			res.add(aggregateList(path, attr, t, m.get(t), option.getAggregationType()));
		}
		return res;

	}

	private static DoubleMetric aggregateList(String path, EAttribute attr, long t, List<DoubleMetric> l,
			AggregationMetricValueOptionType aggregationType) {
		DoubleMetric d = MetricsFactory.eINSTANCE.createDoubleMetric();
		d.setTime(t);
		d.setResourceName(path);
		d.setMetricName(attr.getName());
		if (l.size() == 0) {
			switch (aggregationType) {
			case AVERAGE:
				d.setValue(0.0);
				break;
			case COUNT:
				d.setValue(0.0);
				break;
			case SUM:
				d.setValue(0.0);
				break;
			case MAX:
				d.setValue(0.0);
				break;
			case MIN:
				d.setValue(0.0);
				break;
			}
		} else {
			double v;
			switch (aggregationType) {
			case MAX:
				v = Double.NEGATIVE_INFINITY;
				break;
			case MIN:
				v = Double.POSITIVE_INFINITY;
				break;
			default:
				v = 0.0;
			}
			for (DoubleMetric dd : l) {
				double vv = dd.getValue();
				switch (aggregationType) {
				case SUM:
				case AVERAGE:
					v += vv;
					break;
				case COUNT:
					v++;
					break;
				case MAX:
					if (v < vv)
						v = vv;
					break;
				case MIN:
					if (v > vv)
						v = vv;
					break;
				}
			}
			switch (aggregationType) {
			case AVERAGE:
				v = v / l.size();
				break;
			default:
				break;
			}
			d.setValue(v);
		}
		return d;
	}

	public EList<DoubleMetric> getValuesAll(String path, EList<String> metrics, Long start, Long end, MetricValueOption option,
			boolean relativeInterval) {
		EList<DoubleMetric> l = new BasicEList<DoubleMetric>();
		// System.err.println("getValuesAll: " + path + " " + metrics +
		// " start=" + start + " end=" + end);
		for (EObject o : server.findAll(path)) {
			for (String m : metrics) {
				EStructuralFeature f = o.eClass().getEStructuralFeature(m);
				if (!(f instanceof EAttribute))
					continue;
				Object a = o.eGet(f);
				if (!(a instanceof MetricAttribute))
					continue;
				l.addAll(getValues((MetricAttribute) a, (EAttribute) f, start, end, ManagementServer.object2ref(o), option,
						relativeInterval));
			}
		}
		return l;
	}

	public void initAttribute(EObject o, String aName) {
		MetricStore store = findStore(o);
		EAttribute attr = (EAttribute) o.eClass().getEStructuralFeature(aName);
		String path = ManagementServer.relativeObject2ref(server.getObject(), o) + "/" + aName;
		String aType = attr.getEAttributeType().getName();
		store.getMeasurement(path,new Date());
		store.initAttribute(path, aType);
//		System.err.println("XYZ " + path + " " + aType + " " + o.eGet(attr));
	}
	
	public void setLongMetric(EObject o, String attr, long v, boolean force) {
//		System.err.println "XYZ $o $attr ${o[attr]} $v $force"
		EStructuralFeature f = o.eClass().getEStructuralFeature(attr);
		if (f instanceof EAttribute) {
			Object m = o.eGet(f);
			if (m == null) {
				initAttribute(o,attr);
				m = o.eGet(f);
			}
			if (m instanceof LongMetricAttribute)  {
				LongMetricAttribute m1 = (LongMetricAttribute) m;
				m1.setValue(v,force);
				return;
			}
		}
		logger.warn("Unable to setLongMetric" + o.getClass().getName() + "@" + attr);
	}	
	
	public void setDateMetric(EObject o, String attr, Date v) {
		setDateMetric(o, attr, v, new Date());
	}
	public void setDateMetric(EObject o, String attr, Date v, Date when) {
//		System.err.println "XYZ $o $attr ${o[attr]} $v $force"
		EStructuralFeature f = o.eClass().getEStructuralFeature(attr);
		if (f instanceof EAttribute) {
			Object m = o.eGet(f);
			if (m == null) {
				initAttribute(o,attr);
				m = o.eGet(f);
			}
			if (m instanceof DateMetricAttribute) {
				DateMetricAttribute m1 = (DateMetricAttribute) m;
				m1.add(when, v.getTime());
				return;
			}
		}
		logger.warn("Unable to setDateMetric" + o.getClass().getName() + "@" + attr);
	}	

	public void addIncreasingULongMetric(EObject o, String attr, long v, boolean force) {
//		System.err.println "XYZ $o $attr ${o[attr]} $v $force"
		EStructuralFeature f = o.eClass().getEStructuralFeature(attr);
		if (f instanceof EAttribute) {
			Object m = o.eGet(f);
			if (m == null) {
				initAttribute(o,attr);
				m = o.eGet(f);
			}
			if (m instanceof IncreasingULongMetricAttribute)  {
				IncreasingULongMetricAttribute m1 = (IncreasingULongMetricAttribute) m;
				m1.increase(v,force);
				return;
			}
		}
		logger.warn("Unable to addIncreasingULongMetric" + o.getClass().getName() + "@" + attr);
	}


}
