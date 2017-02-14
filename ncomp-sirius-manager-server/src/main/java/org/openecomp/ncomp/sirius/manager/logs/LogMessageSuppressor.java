
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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;

public class LogMessageSuppressor {

	public interface ILogMessageHandler {
		void handleLog(LogMessage m);
	}

	private ILogMessageHandler handler;

	class LogMessageContainer {
		public LogMessageContainer(LogMessage m) {
			this.m = m;
			d = new Date();
		}

		Date d;
		LogMessage m;
		int num = 0;
	}

	public LogMessageSuppressor(ILogMessageHandler handler1, long duration1) {
		super();
		this.duration = duration1;
		this.handler = handler1;
		Thread t = new Thread("log message suppressor") {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(30000);
						synchronized (LogMessageSuppressor.this) {
							long now = new Date().getTime();
							List<String> remove = new ArrayList<String>();
							for (String k : map.keySet()) {
								LogMessageContainer c = map.get(k);
								if (c.d.getTime() + duration < now) {
									remove.add(k);
								}
							}
							for (String k : remove) {
								LogMessageContainer c = map.remove(k);
								if (c.num > 1) {
									c.m.setMessage(c.m.getMessage() + " Suppressed messages: " + c.num + " in last " + duration / 1000
											+ " seconds");
									handler.handleLog(c.m);
								}
							}
						}
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
					}
				}
			}
		};
		t.start();
	}

	long duration;
	HashMap<String, LogMessageContainer> map = new HashMap<String, LogMessageContainer>();

	public synchronized void add(LogMessage m) {
		String k = messageKey(m);
		LogMessageContainer d = map.get(k);
		if (d == null) {
			handler.handleLog(m);
			d = new LogMessageContainer(m);
			map.put(k, d);
		}
		d.num ++;
	}

	private String messageKey(LogMessage m) {
		String k = m.getResourceName() + ":" + m.getLevel().toString() + ":" + (m.getTime() / duration) + ":"
				+ m.getMessage().replaceAll("Exchange@[0-9a-f]+", "EEE").replaceAll("[0-9]+", "NNN");
		// System.out.println(m.getMessage() + " -> " + k);
		return k;
	}

}
