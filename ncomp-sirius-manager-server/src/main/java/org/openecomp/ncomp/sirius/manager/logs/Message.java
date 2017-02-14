
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

import java.io.Serializable;
import java.util.Date;

import org.openecomp.ncomp.core.logs.LogLevel;
import org.openecomp.ncomp.core.logs.LogMessage;
import org.openecomp.ncomp.core.logs.LogSeverity;
import org.openecomp.ncomp.core.logs.LogsFactory;

public class Message implements Serializable {
	@Override
	public String toString() {
		return "Message [level=" + level + ", severity=" + severity + ", message=" + message + ", path=" + path + ", time=" + time
				+ ", creationTime=" + creationTime + "]";
	}
	private static final long serialVersionUID = 1L;
	public Message(){}
	public Message(LogLevel level, LogSeverity severity, String message, Date time) {
		super();
		this.level = level;
		this.severity = severity;
		this.message = message;
		this.time = time;
		creationTime = new Date();
	}
	public Message(LogMessage m) {
		level = m.getLevel();
		severity = m.getSeverity();
		message = m.getMessage();
		time = new Date(m.getTime());
		path = m.getResourceName();
		creationTime = new Date();
	}
	public Message(String level2, String severity2, String message2, String path2, Date time) {
		level = LogLevel.valueOf(level2);
		severity = LogSeverity.valueOf(severity2);
		this.message = message2;
		this.path = path2;
		this.time = time;
		creationTime = new Date();
	}
	private LogLevel level;
	private LogSeverity severity;
	private String message;
	private String path;
	Date time;
	private Date creationTime;

	public LogLevel getLevel() {
		return level;
	}

	public LogSeverity getSeverity() {
		return severity;
	}

	public String getMessage() {
		return message;
	}
	public String getPath() {
		return path;
	}
	public Date getTime() {
		return time;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public LogMessage toLogMessage() {
		LogMessage m = LogsFactory.eINSTANCE.createLogMessage();
		m.setLevel(level);
		m.setSeverity(severity);
		m.setMessage(message);
		m.setResourceName(path);
		m.setTime(time.getTime());
		return m;
	}
}
