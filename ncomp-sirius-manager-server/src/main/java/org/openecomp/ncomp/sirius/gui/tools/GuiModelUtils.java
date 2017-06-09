
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
	
package org.openecomp.ncomp.sirius.gui.tools;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.openecomp.ncomp.gwt.siriusportal.model.*;
import org.openecomp.ncomp.core.function.IteratorUsingFunction;
import org.openecomp.ncomp.core.logs.*;
import org.openecomp.ncomp.core.types.metrics.*;
import org.openecomp.ncomp.core.metrics.*;
import org.openecomp.ncomp.core.metrics.DoubleMetric;
import org.openecomp.ncomp.sirius.function.FunctionUtils;
import org.openecomp.ncomp.sirius.manager.*;
import org.openecomp.ncomp.sirius.manager.metrics.MetricManager;
import org.openecomp.ncomp.sirius.manager.tableTemplate.*;
import org.openecomp.ncomp.sirius.manager.server.*;
import org.openecomp.ncomp.utils.SortUtil;
import org.openecomp.ncomp.utils.maps.HashMapMapMap;
import org.openecomp.ncomp.webservice.utils.DateUtils;

public class GuiModelUtils {
	public static final Logger logger = Logger.getLogger(GuiModelUtils.class);
	static ModelFactory f = ModelFactory.eINSTANCE;

	static GuiTree ecore2GuiTree(EObject ecore, int levels, @SuppressWarnings("rawtypes") Map options) {
		GuiTree tree = f.createGuiTree();
		tree.getSections().addAll(ecore2node(ecore, levels, options).getChildren());
		return tree;
	}

	@SuppressWarnings("rawtypes")
	static void addEcore2GuiTree(GuiTree t, String path, EObject ecore, int levels, Map options) {
		Subject s = ManagementServer.find(t, path);
		if (s == null || s.o == null) {
			logger.warn("Unable to find " + path + " " + t);
			return;
		}
		GuiTreeNode n = (GuiTreeNode) s.o;
		addEcore2GuiTree(n, ecore, levels, options);
	}

	@SuppressWarnings("rawtypes")
	static void addEcore2GuiTree(GuiTreeNode n, EObject ecore, int levels, Map options) {
		n.getChildren().addAll(ecore2node(ecore, levels, options).getChildren());
	}

	@SuppressWarnings("rawtypes")
	static void addEList2GuiTree(GuiTreeNode n, EList<EObject> l, int levels, Map options) {
		for (EObject ecore : l) {
			n.getChildren().add(ecore2node(ecore, levels, options));
		}
	}

	static GuiTreeNode addNode2GuiTree(GuiTree t, String path, String name) {
		Subject s = ManagementServer.find(t, path);
		if (s == null || s.o == null) {
			logger.warn("Unable to find " + path + " " + t);
			return null;
		}
		GuiTreeNode n = (GuiTreeNode) s.o;
		GuiTreeNode n1 = f.createGuiTreeNode();
		n.getChildren().add(n1);
		n1.setNodeName(name);
		return n1;
	}

	@SuppressWarnings("rawtypes")
	private static GuiTreeNode ecore2node(EObject ecore, int levels, Map options) {
		if (options == null)
			options = new HashMap();
		GuiTreeNode n = f.createGuiTreeNode();
		EAttribute attr = (EAttribute) ecore.eClass().getEStructuralFeature("name");
		if (attr != null) {
			n.setNodeName((String) ecore.eGet(attr));
		}
		if (n.getNodeName() == null) {
			n.setNodeName("NONAME");
		}
		for (EReference ref : ecore.eClass().getEAllContainments()) {
			Map options1 = newOptions(options, ref.getName());
			int levels1 = newLevels(options1, levels);
			if (levels1 == 0)
				continue;
			GuiTreeNode n1 = f.createGuiTreeNode();
			n1.setNodeName(ref.getName());
			n.getChildren().add(n1);
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) ecore.eGet(ref);
				for (EObject o : l)
					n1.getChildren().add(ecore2node(o, levels1, options1));
			} else {
				EObject o = (EObject) ecore.eGet(ref);
				if (o != null) {
					GuiTreeNode nn = ecore2node(o, levels1, options1);
					n1.getChildren().addAll(nn.getChildren());
				}
			}
		}
		return n;
	}

	@SuppressWarnings("rawtypes")
	private static int newLevels(Map options1, int levels) {
		return options1.containsKey("LEVELS") ? (Integer) options1.get("LEVELS") : levels - 1;
	}

	@SuppressWarnings("rawtypes")
	private static Map newOptions(Map options, String name) {
		Object o = options.get(name);
		if (!(o instanceof Map))
			return new HashMap();
		return (Map) o;
	}

	@SuppressWarnings("rawtypes")
	public static GuiObject ecore2GuiObject(EObject ecore, int levels, Map options) {
		GuiObject n = f.createGuiObject();
		add2GuiObject(n, ecore, levels, options);
		return n;

	}

	public static GuiObject addNode2GuiObject(GuiObject o, String name) {
		GuiObject n = f.createGuiObject();
		GuiObjectValueObject v = f.createGuiObjectValueObject();
		v.setV(n);
		v.setValueName(name);
		o.getValues().add(v);
		return n;
	}

	@SuppressWarnings("rawtypes")
	public static void add2GuiObject(GuiObject n, EObject ecore, int levels, Map options) {
		if (levels == 0)
			return;
		if (options == null)
			options = new HashMap();
		Date now = new Date();
		for (EAttribute attr : ecore.eClass().getEAllAttributes()) {
			if (hasChildWithName(n, attr.getName()))
				continue;
			Object o = ecore.eGet(attr);
			if (o instanceof IncreasingULongMetricAttribute) {
				IncreasingULongMetricAttribute m = (IncreasingULongMetricAttribute) o;
				// System.err.println("HERE88: " + m);
				m.getValue();
				String delay = m.last == null ? "" : " [" + DateUtils.delay2String(now.getTime() - m.last.getTime()) + "]";
				try {
					addTimeSeries(n, ecore, attr, Double.toString(m == null ? -999999.9 : m.getValue()) + delay);
				} catch (Exception e) {
					System.err.println("HERE88: " + m + " " + new Date());
					if (m != null)
						System.err.println("HERE88: " + m.getValue());
					ManagementServerUtils.printStackTrace(e);
				}
				continue;
			}
			if (o instanceof LongMetricAttribute) {
				LongMetricAttribute m = (LongMetricAttribute) o;
				if (m.getValue() == null)
					continue;
				String delay = m.last == null ? "" : " [" + DateUtils.delay2String(now.getTime() - m.last.getTime()) + "]";
				addTimeSeries(n, ecore, attr, Long.toString(m.getValue()) + delay);
				continue;
			}
			if (o instanceof DoubleMetricAttribute) {
				DoubleMetricAttribute m = (DoubleMetricAttribute) o;
				m.getValue();
				String delay = m.last == null ? "" : " [" + DateUtils.delay2String(now.getTime() - m.last.getTime()) + "]";
				addTimeSeries(n, ecore, attr, Double.toString(m.getValue()) + delay);
				continue;
			}
			if (o instanceof DateMetricAttribute) {
				DateMetricAttribute m = (DateMetricAttribute) o;
				Long t = m.getValue();
				if (t != null) {
					Date d = new Date(t);
					DateUtils.delay2String(now.getTime() - t);
					addTimeSeries(n, ecore, attr, d.toString() + " " + DateUtils.delay2String(now.getTime() - t));
					continue;
				}
			}
			addString(n, attr.getName(), o == null ? "" : ecore.eGet(attr).toString());
		}
		for (EReference ref : ecore.eClass().getEAllReferences()) {
			if (ref.isMany()) {
				@SuppressWarnings("unchecked")
				EList<EObject> l = (EList<EObject>) ecore.eGet(ref);
				if (l.size() == 0) {
					addString(n, ref.getName(), "Empty");
					continue;
				}
				if (!ref.isContainment()) {
					Map options1 = (Map) options.get(ref.getName());
					int j = 0;
					for (EObject o : l) {
						if (options1 == null) {
							addString(n, ref.getName() + " #" + j++,
									"Reference " + o.eClass().getName() + ":" + ManagementServer.object2ref(o));
							continue;
						}
						// TODO
						// int levels1 =options1.containsKey("LEVELS") ?
						// (Integer) options1.get("LEVELS") : levels -1;
						// add2GuiObject(n1, o, levels1,options1);
					}
					continue;
				}
				GuiObjectNamedList n1 = f.createGuiObjectNamedList();
				n1.setValueName(ref.getName());
				n.getValues().add(n1);
				int j = 0;
				for (EObject o : l) {
					GuiNamedObject n2 = f.createGuiNamedObject();
					EAttribute attr = (EAttribute) o.eClass().getEStructuralFeature("name");
					if (attr == null) {
						n2.setObjectName("#" + j++);
					} else
						n2.setObjectName((String) o.eGet(attr));
					add2GuiObject(n2, o, levels - 1, (Map) options.get(ref.getName()));
					n1.getObjects().add(n2);
				}
			} else {
				EObject o = (EObject) ecore.eGet(ref);
				if (o == null) {
					addString(n, ref.getName(), "Null");
					continue;
				}
				if (!ref.isContainment()) {
					Map options1 = (Map) options.get(ref.getName());
					if (options1 == null) {
						addString(n, ref.getName(), "Reference " + o.eClass().getName() + ":" + ManagementServer.object2ref(o));
						continue;
					}
					int levels1 = options1.containsKey("LEVELS") ? (Integer) options1.get("LEVELS") : levels - 1;
					if (options1.containsKey("NAME")) {
						// Add another level
						GuiObjectValueObject n1 = f.createGuiObjectValueObject();
						n.getValues().add(n1);
						n1.setValueName((String) options1.get("NAME"));
						n1.setV(f.createGuiObject());
						add2GuiObject(n1.getV(), o, levels1, options1);
						continue;
					}
					add2GuiObject(n, o, levels1, options1);
					continue;
				}
				GuiObjectValueObject n1 = f.createGuiObjectValueObject();
				n.getValues().add(n1);
				n1.setValueName(ref.getName());
				n1.setV(f.createGuiObject());
				add2GuiObject(n1.getV(), o, levels - 1, (Map) options.get(ref.getName()));
			}
		}
	}

	private static boolean hasChildWithName(GuiObject n, String name) {
		for (GuiObjectValue v : n.getValues()) {
			if (v.getValueName().equals(name))
				return true;
		}
		return false;
	}

	private static void addTimeSeries(GuiObject n, EObject ecore, EAttribute attr, String v) {
		GuiObjectValueTimeSeries t = f.createGuiObjectValueTimeSeries();
		t.setValueName(attr.getName());
		t.setPath(ManagementServer.object2ref(ecore) + "/" + attr.getName());
		t.setV(v);
		n.getValues().add(t);
	}

	private static void addString(GuiObject n, String name, String v) {
		GuiObjectValueString n1 = f.createGuiObjectValueString();
		n1.setV(v);
		n1.setValueName(name);
		n.getValues().add(n1);
	}

	public static void printTree(GuiTree t) {
		for (GuiTreeNode n : t.getSections()) {
			printTreeNode(n, "");
		}
	}

	private static void printTreeNode(GuiTreeNode t, String indent) {
		System.out.println(indent + t.getNodeName());
		for (GuiTreeNode n : t.getChildren()) {
			printTreeNode(n, "  " + indent);
		}
	}

	public static String attr2unit(EAttribute attr) {
		EAnnotation anno = attr.getEAnnotation("http://openecomp.org/sirius/doc");
		if (anno == null)
			return "";
		String unit = anno.getDetails().get("unit");
		return unit == null ? "" : unit;
	}

	public static GuiTimeSerie getTimeSerie(ManagementServer s, String path, String start, String end, String duration) {

		GuiTimeSerie t = f.createGuiTimeSerie();
		Date start1 = DateUtils.dateFromString(start);
		Date end1 = DateUtils.dateFromString(end);
		if (duration == null)
			duration = "";
		long duration2 = duration.length() > 0 ? DateUtils.stringToDuration(duration) : 0;
		if (duration2 > 0) {
			start1.setTime(start1.getTime() / duration2 * duration2);
			end1.setTime(end1.getTime() / duration2 * duration2 + duration2);
		}
		MetricsFactory ff = MetricsFactory.eINSTANCE;
		AggregationMetricValueOption option = ff.createAggregationMetricValueOption();
		SequenceMetricValueOption seq = ff.createSequenceMetricValueOption();
		seq.getOptions().add(ff.createBasicMetricValueOption());
		seq.getOptions().add(option);
		option.setDuration(duration);
		option.setAggregationType(AggregationMetricValueOptionType.AVERAGE);
		EList<DoubleMetric> values = s.metrics.getValues(path, start1.getTime(), end1.getTime(), seq,false);
		Subject s1 = s.find(path);
		for (DoubleMetric d : values) {
			GuiTimeSerieData dd;
			dd = ModelFactory.eINSTANCE.createGuiTimeSerieData();
			dd.setTime(new Date(d.getTime()));
			t.getData().add(dd);
			dd.setValue(d.getValue());
		}
		t.setName(s1.attr.getName());
		t.setXAxisLabel("GMT");
		t.setYAxisLabel(attr2unit(s1.attr));
		return t;
	}

	public static GuiTable logsReport(ManagementServer s, String path, Date start, Date end, LogLevel minLogLevel, LogSeverity minLogSeverity) {
		System.err.println(path + " " +start + " " +end + " " +minLogLevel + " " +minLogSeverity);
		GuiTableUtil table = new GuiTableUtil();
		GuiTableColumn c;
		c = table.addColumn("Time", GuiTableColumnType.STRING);
		c.setWidth(20);
		c = table.addColumn("Level", GuiTableColumnType.STRING);
		c.setWidth(10);
		c = table.addColumn("Severity", GuiTableColumnType.STRING);
		// c.setHidden(true);
		c.setWidth(10);
		c = table.addColumn("Path", GuiTableColumnType.STRING);
		c.setWidth(80);
		c = table.addColumn("Message", GuiTableColumnType.STRING);
		for (LogMessage m : s.logs.getMessages(path, start, end)) {
			if (minLogLevel != LogLevel.UNKNOWN && m.getLevel().ordinal() < minLogLevel.ordinal()) continue;
			if (minLogSeverity != LogSeverity.UNKNOWN && (m.getSeverity() == LogSeverity.UNKNOWN || m.getSeverity().ordinal() > minLogSeverity.ordinal())) continue;
			table.newRow();
			table.addCellDate(m.getTime());
			table.addCell(m.getLevel().toString());
			table.addCell(m.getSeverity().toString());
			table.addCell(m.getResourceName());
			table.addCell(m.getMessage().replaceFirst("\\[.*?\\] ","").replaceFirst("[a-zA-Z0-9.]*:[0-9]+$",""));
		}
		return table.getTable();
	}

	public static GuiTable logsReportHourly(ManagementServer s, String path, Date start, Date end, String duration, LogLevel minLogLevel, LogSeverity minLogSeverity) {
		long duration2 = DateUtils.stringToDuration(duration);
		GuiTableUtil table = new GuiTableUtil();
		GuiTableColumn c;
		c = table.addColumn("Last Time", GuiTableColumnType.STRING);
		c.setWidth(20);
		c = table.addColumn("First Time", GuiTableColumnType.STRING);
		c.setWidth(20);
		c.setHidden(true);
		c = table.addColumn("Level", GuiTableColumnType.STRING);
		c.setWidth(10);
		c = table.addColumn("Severity", GuiTableColumnType.STRING);
		// c.setHidden(true);
		c.setWidth(10);
		c = table.addColumn("Path", GuiTableColumnType.STRING);
		c.setWidth(80);
		c = table.addColumn("Number", GuiTableColumnType.DOUBLE);
		c.setWidth(15);
		c.setFormat("#,##0");
		c = table.addColumn("Message", GuiTableColumnType.STRING);
		HashMap<String, List<LogMessage>> map = new HashMap<String, List<LogMessage>>();
		List<LogMessage> firstList = new ArrayList<LogMessage>();
		for (LogMessage m : s.logs.getMessages(path, start, end)) {
			if (minLogLevel != LogLevel.UNKNOWN && m.getLevel().ordinal() < minLogLevel.ordinal()) continue;
			if (minLogSeverity != LogSeverity.UNKNOWN && (m.getSeverity() == LogSeverity.UNKNOWN || m.getSeverity().ordinal() > minLogSeverity.ordinal())) continue;
			String k = messageKey(m, duration2);
			List<LogMessage> l = map.get(k);
			if (l == null) {
				l = new ArrayList<LogMessage>();
				map.put(k, l);
				firstList.add(m);
			}
			l.add(m);
		}
		for (LogMessage m : firstList) {
			List<LogMessage> l = map.get(messageKey(m, duration2));
			LogMessage first = l.get(l.size() - 1);
			table.newRow();
			table.addCellDate(m.getTime());
			table.addCellDate(first.getTime());
			table.addCell(m.getLevel().toString());
			table.addCell(m.getSeverity().toString());
			table.addCell(m.getResourceName());
			table.addCell((double) l.size());
			table.addCell(m.getMessage().replaceFirst("\\[.*?\\] ","").replaceFirst("[a-zA-Z0-9.]*:[0-9]+$",""));
		}
		return table.getTable();
	}

	private static String messageKey(LogMessage m, long duration2) {
		String k = m.getResourceName() + ":" + m.getLevel().toString() + ":" + m.getSeverity().toString() + ":" + (m.getTime() / duration2)
				+ ":" + m.getMessage().replaceAll("Exchange@[0-9a-f]+", "EEE").replaceAll("[0-9]+", "NNN");
		// System.out.println(m.getMessage() + " -> " + k);
		return k;
	}

	public static void addTree(GuiTreeUtil tree) {
		tree.addSection("reports", GuiView.NONE);
		tree.addNode("/reports", "logsReport", GuiView.TABLE);
		tree.addNode("/reports", "logsReportHourly", GuiView.TABLE);
		tree.addNode("/reports", "logsReportDaily", GuiView.TABLE);
	}

	public static GuiTable getTable(ManagementServer s, String path, String start, String end) {
		AbstractManagementServer c = (AbstractManagementServer) s.getObject();
		for (AbstractTableTemplate t : c.getConfiguration().getTableTemplates()) {
			for (EObject o : s.findAll(t.getTreePath())) {
				String treePath = ManagementServer.expandPath(o, t.getTablePath(), "$");
				if (treePath.equals(path)) {
					if (t instanceof LogTableTemplate) {
						LogTableTemplate logTable = (LogTableTemplate) t;
						// TODO handle real parameters.
						Date start1 = DateUtils.dateFromString(logTable.getDuration());
						Date end1 = new Date();
						if (end1.before(start1)) {
							logger.warn("start after end");
						}
						String prefix = ManagementServer.expandPath(o, logTable.getPrefixResourcePath(), "$");
						if (logTable.getAggregationDuration() != null) {
							return logsReportHourly(s, prefix, start1, end1, logTable.getAggregationDuration(), logTable.getMinLevel(), logTable.getMinSeverity());
						} else {
							return logsReport(s, prefix, start1, end1, logTable.getMinLevel(), logTable.getMinSeverity());
						}
					}
					if (t instanceof TimeTableTemplate) {
						return tableFromTimeTemplate(s,o,(TimeTableTemplate) t);
					}
					if (t instanceof IteratorTableTemplate) {
						return tableFromIteratorTableTemplate(s,o,(IteratorTableTemplate) t);
					}
					if (t instanceof TableTemplate) {
						return tableFromTemplate(s,o,(TableTemplate) t);
					}
				}
			}
		}
		if (path.startsWith("/reports/logsReportHourly")) {
			// TODO handle parameters.
			return logsReportHourly(s, "", DateUtils.dateFromString("-24hour"), new Date(), "1hour",LogLevel.DEBUG,LogSeverity.SEV4);
		}
		if (path.startsWith("/reports/logsReportDaily")) {
			// TODO handle parameters.
			return logsReportHourly(s, "", DateUtils.dateFromString("-7day"), new Date(), "1day",LogLevel.DEBUG,LogSeverity.SEV4);
		}
		if (path.startsWith("/reports/logsReport")) {
			// TODO handle parameters.
			return logsReport(s, "", DateUtils.dateFromString("-24hour"), new Date(),LogLevel.DEBUG,LogSeverity.SEV4);
		}
		throw new RuntimeException("Unable to find table: " + path);
	}

	private static GuiTable tableFromIteratorTableTemplate(ManagementServer s, EObject o, IteratorTableTemplate t) {
		System.err.println("tableFromTemplate: " + ManagementServer.object2ref(o) + " " + ManagementServer.object2ref(t));
		GuiTableUtil table = new GuiTableUtil();
		addTemplateColumns(table,t);
		if (! (t.getIterator() instanceof IteratorUsingFunction)) {
			throw new RuntimeException("Unsupported iterator:" + t.getIterator().getClass());
		}
		IteratorUsingFunction ii = (IteratorUsingFunction) t.getIterator();
		for (String path : ii.getPaths()) {
			for (EObject row : s.findAll(path)) {
				if (ii.isRecursive()) {
					for (EObject r : ManagementServer.object2containedObjects(row)) {
						if (FunctionUtils.evaluate(r, ii.getFilter()).equalsIgnoreCase("true"))
							tableAddRow(s,r,table,t);
					}
				}
				else {
					if (FunctionUtils.evaluate(row, ii.getFilter()).equalsIgnoreCase("true"))
						tableAddRow(s,row,table,t);
				}
			}
		}
		return table.getTable();
	}

	private static void tableAddRow(ManagementServer s, EObject row, GuiTableUtil table, HasColumnsTableTemplate t) {
		table.newRow();
		for (TableTemplateColumn  col: t.getColumns()) {
			if (col instanceof TableTemplateAttributeColumn) {
				addAttributeCell(table,row,(TableTemplateAttributeColumn) col);
				continue;
			}
			if (col instanceof TableTemplateMetricColumn) {
				TableTemplateMetricColumn col1 = (TableTemplateMetricColumn) col;
				Subject s1 = ManagementServer.find(row,col1.getPath());
				if (s1 == null || s1.o == null|| s1.attr == null) {
					table.addCell(-5.0);
					continue;
				}
				Object a = s1.o.eGet(s1.attr);
				if (a instanceof MetricAttribute) 
					table.addCell(s.metrics.getValue(row,col1.getPath(),col1.getOption()));
				else 
					table.addCell(-4.0);
				continue;
			}
			table.addCell("??");
		}
		
	}

	private static GuiTable tableFromTimeTemplate(ManagementServer s, EObject o, TimeTableTemplate t) {
		System.err.println("tableFromTemplate: " + ManagementServer.object2ref(o) + " " + ManagementServer.object2ref(t));
		GuiTableUtil table = new GuiTableUtil();
		table.addColumn("Time", GuiTableColumnType.DATE);
		addTemplateColumns(table,t);
		List<EObject> rows = s.findAll(t.getRowPath());
		HashMapMapMap<Long, TableTemplateColumn, EObject, Double> values = new HashMapMapMap<Long, TableTemplateColumn, EObject, Double>();
		Long end = new Date().getTime();
		Long start = end - DateUtils.stringToDuration(t.getDuration());
		for (EObject row : rows) {
			for (TableTemplateColumn  col: t.getColumns()) {
				if (col instanceof TableTemplateMetricColumn) {
					TableTemplateMetricColumn col1 = (TableTemplateMetricColumn) col;
					Subject s1 = ManagementServer.find(row,col1.getPath());
					if (s1 == null || s1.o == null|| s1.attr == null)
						continue;
					Object a = s1.o.eGet(s1.attr);
					if (!(a instanceof MetricAttribute)) continue;
					for (DoubleMetric d : MetricManager.getValues(row,start, end, col1.getPath(),col1.getOption(),false)){
						values.insert(d.getTime(), col, row, d.getValue());
					}
				}
			}
		}
		for (long tt : SortUtil.sort(values.keySet())) {
	 		for (EObject row : rows) {
				table.newRow();
				table.addCellDate(tt);
				for (TableTemplateColumn  col: t.getColumns()) {
					if (col instanceof TableTemplateAttributeColumn) {
						addAttributeCell(table,row,(TableTemplateAttributeColumn) col);
						continue;
					}
					if (col instanceof TableTemplateMetricColumn) {
						Double d = values.get(tt,col,row);
						table.addCell(d == null ? -4.0 : d);
						continue;
					}
					table.addCell("??");
				}
			}
		}
		return table.getTable();
	}

	private static void addAttributeCell(GuiTableUtil table, EObject row, TableTemplateAttributeColumn col) {
		TableTemplateAttributeColumn col1 = (TableTemplateAttributeColumn) col;
		if (col1.getPath().equals("$path")) {
			table.addCell(ManagementServer.object2ref(row));
			return;
		}
		if (col1.getPath().equals("$class")) {
			table.addCell(row.eClass().getInstanceClassName());
			return;
		}
		Subject s1 = ManagementServer.find(row, col1.getPath());
		if (s1 == null || s1.o == null || s1.attr == null) 
			table.addCell("ERROR");
		else
			table.addCell(s1.o.eGet(s1.attr));
	}

	private static void addTemplateColumns(GuiTableUtil table, HasColumnsTableTemplate t) {
		for (TableTemplateColumn  col: t.getColumns()) {
			GuiTableColumn c = null;
			if (col instanceof TableTemplateAttributeColumn) {
				TableTemplateAttributeColumn col1 = (TableTemplateAttributeColumn) col;
				c = table.addColumn(col1.getName(), GuiTableColumnType.STRING);
			}
			if (col instanceof TableTemplateMetricColumn) {
				TableTemplateMetricColumn col1 = (TableTemplateMetricColumn) col;
				c = table.addColumn(col1.getName(), GuiTableColumnType.DOUBLE);
			}
			if (c == null) {
				c = table.addColumn(col.getName(), GuiTableColumnType.STRING);
			}
//			c.setWidth(20);
		}
	}

	private static GuiTable tableFromTemplate(ManagementServer s, EObject o, TableTemplate t) {
		System.err.println("tableFromTemplate: " + ManagementServer.object2ref(o) + " " + ManagementServer.object2ref(t));
		GuiTableUtil table = new GuiTableUtil();
		addTemplateColumns(table,t);
		for (EObject row : s.findAll(t.getRowPath())) {
			tableAddRow(s,row,table,t);
		}
		return table.getTable();
	}

}
