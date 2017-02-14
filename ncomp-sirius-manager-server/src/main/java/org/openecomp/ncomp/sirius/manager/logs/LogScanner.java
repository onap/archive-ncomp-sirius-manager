
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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.openecomp.ncomp.core.logs.LogConfiguration;
import org.openecomp.ncomp.core.logs.LogFile;
import org.openecomp.ncomp.core.logs.LogPattern;
import org.openecomp.ncomp.utils.StringMatcher;
import org.openecomp.ncomp.utils.StringUtil;
import org.openecomp.ncomp.utils.extra.FileTail.NewLineHandler;

public class LogScanner implements NewLineHandler {
	interface LogMessageHandler {
		void newLog(Message msg);
		void fixFilePermissions(File file);
	}

	private LogMessageHandler handler;
	private LogConfiguration config;
	private String directory;

	public LogScanner(LogMessageHandler handler, LogConfiguration config, String directory) {
		this.handler = handler;
		this.config = config;
		this.directory = directory;
		init();
	}

	private void init() {
		for (LogFile f : config.getFiles()) {
			List<PatternUtility> l = new ArrayList<LogScanner.PatternUtility>();
			for (LogPattern p : f.getPatterns()) {
				PatternUtility m = new PatternUtility();
				m.f = f;
				m.p = p;
				m.m = new StringMatcher(p.getPattern());
				l.add(m);
			}
			new org.openecomp.ncomp.utils.extra.FileTail(f.getFilename(), directory, null, null, null, this, l);
		}

	}

	@Override
	public void newLine(String file, String line, Object context) {
		@SuppressWarnings("unchecked")
		List<PatternUtility> l = (List<PatternUtility>) context;
		HashMap<String, String> h = new HashMap<String, String>();
		Date date = new Date();
		for (PatternUtility m : l) {
			if (m.m.match(line, h, date)) {
				String level = expand(m.p.getLevel(), "${level}", h);
				String severity = expand(m.p.getSeverity(), "${severity}", h);
				String message = expand(m.p.getMessage(), "${message}", h);
				String path = expand(m.p.getPath(), "${message}", h);
				Message msg = new Message(level, severity, message, path, date);
				handler.newLog(msg);
			}
		}

	}

	private String expand(String str, String def, HashMap<String, String> h) {
		if (str == null) str = def;
		return StringUtil.expandUsingMap(str, h, "$");
	}

	private class PatternUtility {
		StringMatcher m;
		LogFile f;
		LogPattern p;
	}

	@Override
	public void fixFilePermissions(File file) {
		handler.fixFilePermissions(file);
	}

}
