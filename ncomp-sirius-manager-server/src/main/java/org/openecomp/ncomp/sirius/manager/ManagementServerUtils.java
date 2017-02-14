
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

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class ManagementServerUtils {
	public static final Logger logger = Logger.getLogger(ManagementServerUtils.class);

	public static void printStackTrace(Exception e) {
		System.err.println(new Date().toString() + " " +  e);
		e.printStackTrace();
	}
	
	static HashMap<String, Logger> name2logger = new HashMap<String, Logger>();
	public static Logger createLogger(String name, String level, String pattern) {
		return(createLogger(name, level, pattern, "logs"));
	}
	public static synchronized Logger createLogger(String name, String level, String pattern, String logdir) {
		if (name2logger.get(name) == null) {
			Logger l = Logger.getLogger(name);
			try {
				RollingFileAppender a;
				a = new RollingFileAppender(new PatternLayout(pattern), logdir + "/" + name + ".log", true);
				a.setName(name);
				a.setMaxFileSize("50MB");
				a.setMaxBackupIndex(5);
				Level ll = Level.toLevel(level.toUpperCase());
				a.setThreshold(ll);
				a.setAppend(true);
				a.activateOptions();
				l.addAppender(a);
				l.setLevel(ll);
				l.setAdditivity(false);
			} catch (IOException e) {
				logger.error("unable to create logger:" + e);
				e.printStackTrace();
			}
			name2logger.put(name, l);
		}
		return name2logger.get(name);
	}


}
