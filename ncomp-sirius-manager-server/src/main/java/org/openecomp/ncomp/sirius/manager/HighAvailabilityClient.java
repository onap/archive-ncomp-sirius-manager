
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import org.openecomp.ncomp.utils.StringUtil;

public class HighAvailabilityClient extends AbstractClient {
	public static final Logger logger = Logger.getLogger(HighAvailabilityClient.class);
	private Jetty8Client current;
	private List<Jetty8Client> clients = new ArrayList<Jetty8Client>();
	public AbstractClient all = new AbstractClient() {
		@Override
		public byte[] httpBinaryTransaction(String path, String method, HashMap<String, String> headers, JSONObject body, Long timeout) {
			return httpBinaryTransactionAll(path, method, headers, body, timeout);
		}

		@Override
		public String getRemote() {
			ArrayList<String> l = new ArrayList<String>();
			for (AbstractClient c : clients) {
				l.add(c.getRemote());
			}
			return StringUtil.join(l, ",");
		}

	};
	public HighAvailabilityClient(String fileName, String endpoint1, String endpoint2) {
		clients.add(new Jetty8Client(fileName, endpoint1));
		clients.add(new Jetty8Client(fileName, endpoint2));
		current = clients.get(0);
		props = current.props;
		language = current.language;
		namespace = current.namespace;
	}

	protected byte[] httpBinaryTransactionAll(String path, String method, HashMap<String, String> headers, JSONObject body, Long timeout) {
		byte[] res = null;
		for (Jetty8Client c : clients) {
			try {
				res = c.httpBinaryTransaction(path, method, headers, body, timeout);
			}
			catch (Exception e) {
				logger.warn("httpBinaryTransaction failed for: " + path + " " + method + " " + e);
			}
		}
		return res;
	}

	@Override
	public byte[] httpBinaryTransaction(String path, String method, HashMap<String, String> headers, JSONObject body, Long timeout) {
		try {
			return current.httpBinaryTransaction(path, method, headers, body, timeout);
		}
		catch (Jetty8ClientException e) {
			current = current == clients.get(0) ? clients.get(1) : clients.get(0);
			logger.warn("switching active client: " + current.getBaseAddress() );
			System.err.println("switching active client: " + current.getBaseAddress() );
		}
		return current.httpBinaryTransaction(path, method, headers, body, timeout);
	}

	public boolean hasBase() {
		if (clients.get(0).getBaseAddress() == null) return false;
		if (clients.get(1).getBaseAddress() == null) return false;
		return true;
	}

	@Override
	public String getRemote() {
		ArrayList<String> l = new ArrayList<String>();
		for (AbstractClient c : clients) {
			l.add(c.getRemote());
		}
		return StringUtil.join(l, ",");
	}
}
