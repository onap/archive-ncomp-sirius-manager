
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
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.utils.SortUtil;
import org.openecomp.ncomp.utils.journaling.JournalingDateObject;
import org.openecomp.ncomp.utils.journaling.JournalingList;
import org.openecomp.ncomp.webservice.utils.DateUtils;

public class LogMessageStore {

	JournalingDateObject<JournalingList<Message>> logs;
	public LogMessageStore(String dir, String path) {
		logs = new JournalingDateObject<JournalingList<Message>>(dir, JournalingList.class);
	}
	
	public void add(Message m) {
		logs.get(m.time).add(m);
	}
	
	public EList<LogMessage> getMessages(Date start, Date end) {
		List<LogMessage> res = new ArrayList<LogMessage>();
		for (Date d: DateUtils.dateRange(start, end, DateUtils.stringToDuration("1day"))) {
			for (Message m : logs.get(d)) {
				if (m.time.before(start) || m.time.after(end)) continue;
				res.add(m.toLogMessage());
			}
		}
		return sortMessages(res);
	}
	
	public static EList<LogMessage>sortMessages(Collection<LogMessage> l) {
		return new BasicEList<LogMessage>(SortUtil.sort(l, comp));
	}
	
	private static Comparator<? super LogMessage> comp = new Comparator<LogMessage>() {
		@Override
		public int compare(LogMessage t1, LogMessage t2) {
			return - ((Long)t1.getTime()).compareTo(t2.getTime());
		}
	};


}
