
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
	
package org.openecomp.ncomp.sirius.manager.logging;

import org.eclipse.emf.ecore.EObject;
import org.slf4j.MDC;

import org.openecomp.entity.EcompOperationEnum;
import org.openecomp.entity.EcompSubComponentInstance;
import org.openecomp.logger.EcompLogger;
import org.openecomp.logger.EcompMessageEnum;
import org.openecomp.logger.LogCategoryEnum;
import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.logger.Stopwatch;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;

public class NcompLogger extends EcompLogger {
	public static final String UNKNOWN_SERVICE_NAME = "UnknownServiceName";

	private NcompLogger() {
		super();
	}

	public static synchronized NcompLogger getNcompLogger() {
		return new NcompLogger();
	}

	public void setInstanceId(ISiriusServer s, EObject o) {
		String port = s.getServer().getProps().getProperty("server.port");
		String path = ManagementServer.object2ref(o);
		setInstanceId(EcompSubComponentInstance.getServerName() + ":" + port + path);
	}

	public boolean recordAuditEventStartIfNeeded(EcompOperationEnum op, ISiriusServer s, EObject o) {
		if (MDC.get(UNKNOWN_SERVICE_NAME) == null)
			return false;
		if (op.toString().endsWith("@getRequestLogger"))
			return false;
		MDC.remove(UNKNOWN_SERVICE_NAME);
		setOperation(op);
		setInstanceId(s, o);
		recordAuditEventStart();
		return true;
	}

	public void startUnknownAuditEvent(String contextPath) {
		MDC.put(UNKNOWN_SERVICE_NAME, contextPath);
	}

	@Override
	protected void recordMetricEventEnd(StatusCodeEnum statusCode, LogCategoryEnum logCategoryEnum,
			String[] customFields, EcompMessageEnum msg, String... args) {
		// if service name is not know we ignore
		// assuming this is is the getRequestLogger case that we want to ignore.
//		System.out.println("WWWWWW METRICS END 1: " + MDC.getCopyOfContextMap());
		if (MDC.get(UNKNOWN_SERVICE_NAME) != null)
			return;
		super.recordMetricEventEnd(statusCode, logCategoryEnum, customFields, msg, args);
//		System.out.println("WWWWWW METRICS END 2: " + MDC.getCopyOfContextMap());
	}

	@Override
	public void setClassName() {
		StackTraceElement[] l = Thread.currentThread().getStackTrace();
		for (StackTraceElement x : l) {
			if (x.getClassName().equals("java.lang.Thread"))
				continue;
			if (x.getClassName().equals("org.openecomp.logger.EcompLogger"))
				continue;
			if (x.getClassName().equals("org.openecomp.ncomp.sirius.manager.logging.NcompLogger"))
				continue;
			if (x.getClassName().equals("org.openecomp.ncomp.sirius.manager.JavaHttpClient"))
				continue;
			if (x.getClassName().equals("org.openecomp.logger.Stopwatch"))
				continue;
			if (x.getClassName().equals("org.openecomp.ncomp.sirius.manager.AbstractClient"))
				continue;
			MDC.put(CLASS_NAME, x.getClassName() + "@" + x.getMethodName() + ":" + x.getLineNumber());
			return;
		}
	}

	public boolean isTargetSelf() {
		String t = Stopwatch.getTopTarget();
		return t == null || t.startsWith("self");
	}

}
