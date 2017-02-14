
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
	
package org.openecomp.ncomp.sirius.manager;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.metrics.Metric;
import org.openecomp.ncomp.sirius.function.FunctionUtils;
import org.openecomp.ncomp.sirius.manager.properties.AbstractProperty;
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer;
import org.openecomp.ncomp.sirius.manager.server.LoggerInfo;
import org.openecomp.ncomp.sirius.manager.server.ManagementInfo;
import org.openecomp.ncomp.sirius.manager.server.ServerFactory;

// This is a base class providing the AbstractManagementServer functionality needed
// in an XxxProvider class

public class BasicManagementServerProvider extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(BasicManagementServerProvider.class);
	private AbstractManagementServer a;

	public BasicManagementServerProvider (ISiriusServer controller, AbstractManagementServer a) {
		super(controller, a);
		this.a = a;
	}
	
	public void logs(JSONObject cx, EList<LogMessage> logs) {
		uploadInfo(null, createManagementInfoList(cx, null, logs, null));
	}
	
	public void properties(JSONObject cx, EList<AbstractProperty> l) {
		uploadInfo(null, createManagementInfoList(cx, null, null, l));
	}
	
	public void metrics(JSONObject cx, EList<Metric> metrics) {
		uploadInfo(null, createManagementInfoList(cx, metrics, null, null));
	}
	
	AtomicLong numUploads = new AtomicLong();
	public void uploadInfo(JSONObject cx, EList<ManagementInfo> info) {
		Date d = new Date();
		numUploads.incrementAndGet();
		if (cx == null) {
			for (ManagementInfo i : info) {
				if (i.getLogs().size() > 0) {
					controller.getServer().logs.updateLogs(a,i.getLogs(),a.getConfiguration().getRules(),logger);
				}
				if (i.getMetrics().size() > 0) {
					controller.getServer().metrics.updateMetrics(a,i.getMetrics());
				}
				if (i.getProps().size() > 0) {
					controller.getServer().properties.updatePropertries(a,i.getProps());
				}
			}
		}
		logger.info("uploadInfo done: " + (new Date().getTime()-d.getTime())/1000 + " numCurrentUploads= " + numUploads.decrementAndGet());
	}
	
	private static EList<ManagementInfo> createManagementInfoList(JSONObject context, EList<Metric> metrics, EList<LogMessage> logs, EList<AbstractProperty> properties) {
		ManagementInfo m = ServerFactory.eINSTANCE.createManagementInfo();
		EList<ManagementInfo> l = new BasicEList<ManagementInfo>();
		l.add(m);
		if (metrics != null) m.getMetrics().addAll(metrics);
		if (logs != null) m.getLogs().addAll(logs);
		if (properties != null) m.getProps().addAll(properties);
		m.setIp(context.getString("remoteIp"));
		logger.info("received data from: " + m.getIp() + " #m=" + m.getMetrics().size() +  " #l=" + m.getLogs().size() +  " #p=" + m.getProps().size());
		return l;
	}
		  
	public EList<org.openecomp.ncomp.core.metrics.DoubleMetric> getValues(org.json.JSONObject cx, java.lang.String path, java.lang.Long start, java.lang.Long end, org.openecomp.ncomp.core.metrics.MetricValueOption option, boolean relativeInterval) {
		return controller.getServer().metrics.getValues(path, start, end, option, relativeInterval);
	}

	public EList<org.openecomp.ncomp.core.metrics.DoubleMetric> getValuesAll(org.json.JSONObject cx, java.lang.String path, EList<java.lang.String> metrics, java.lang.Long start, java.lang.Long end, org.openecomp.ncomp.core.metrics.MetricValueOption option, boolean relativeInterval) {
		return controller.getServer().metrics.getValuesAll(path, metrics, start, end, option, relativeInterval);
	}

	public EList<org.openecomp.ncomp.core.logs.LogMessage> getMessages(org.json.JSONObject cx, java.lang.String path, java.lang.Long start, java.lang.Long end) {
		return controller.getServer().logs.getMessages(path, new Date(start), new Date(end));
	}

	public org.openecomp.ncomp.sirius.manager.server.LoggerInfo getRequestLogger(java.lang.String userName, java.lang.String action, java.lang.String resourcePath, org.json.JSONObject context) {
		LoggerInfo info = ServerFactory.eINSTANCE.createLoggerInfo();
	  	info.setName(action);
	  	return info;  		
	}

	public EList<org.openecomp.ncomp.core.function.ValuePair> evaluate(java.lang.String path, org.openecomp.ncomp.core.function.Function function) {
		return FunctionUtils.evaluate(controller.getServer().getObject(), path, function);
	}
	
	public void update(java.lang.String path, org.openecomp.ncomp.core.function.Function function) {
		// TODO IMPLEMENT
		throw new UnsupportedOperationException();
	}
	
	public static void ecoreSetup() {
		// TODO Auto-generated method stub
		
	}


}
