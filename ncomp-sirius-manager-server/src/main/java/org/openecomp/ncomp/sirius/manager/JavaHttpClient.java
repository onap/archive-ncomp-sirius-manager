
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

import java.io.*;
import java.util.*;
import java.net.*;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.apache.commons.codec.binary.Base64;

import org.openecomp.logger.StatusCodeEnum;
import org.openecomp.ncomp.sirius.manager.logging.ManagementServerMessageEnum;
import org.openecomp.ncomp.sirius.manager.logging.ManagementServerOperationEnum;
import org.openecomp.ncomp.sirius.manager.logging.NcompLogger;
import org.openecomp.ncomp.utils.CryptoUtils;
import org.openecomp.ncomp.utils.PropertyUtil;
import org.openecomp.ncomp.webservice.utils.FileUtils;

public class JavaHttpClient extends AbstractClient {
	public static final Logger logger = Logger.getLogger(JavaHttpClient.class);
	static final NcompLogger ecomplogger = NcompLogger.getNcompLogger();
	String authorization;
	String baseAddress;
	private boolean debug = false;

	public JavaHttpClient(String fileName, String endpoint) {
		try {
			props = PropertyUtil.getPropertiesFromClasspath(fileName);
			setBaseAddress(props.getProperty(endpoint + ".endpoint"));
			if (getBaseAddress() == null) {
				logger.error("unable to determine baseAddress for endpoint: " + endpoint + " in " + fileName);
				throw new RuntimeException("unable to determine baseAddress for endpoint: " + endpoint + " in "
						+ fileName);
			}
			String user = props.getProperty(endpoint + ".user");
			String password = decryptPassword(props.getProperty(endpoint + ".password"));
			debug = Boolean.parseBoolean(props.getProperty(endpoint + ".debug", "false"));
			if (props.containsKey(endpoint + ".timeout")) {
				setDefaultTimeout(Integer.parseInt(props.getProperty(endpoint + ".timeout")));
			}
			authorization = "Basic " + Base64.encodeBase64String((user + ":" + password).getBytes());
			authorization = authorization.trim();
		} catch (Exception e) {
			logger.error("creating client failed: " + e.toString());
		}
	}

	public static String decryptPassword(String s) {
		if (s == null) return s;
		if (s.startsWith("rsa:")) {
			s = CryptoUtils.decryptPrivate(CryptoUtils.getKey("config/server.private"), s.substring(4));
		}
		return s;
	}


	public byte[] httpBinaryTransaction(String path, String method, HashMap<String, String> headers, JSONObject body,
			Long timeout) {
		byte[] rawbody = null;
		if ("DELETE".equals(method) || "GET".equals(method)) {
			body = null;
		}
		if (body != null) {
			rawbody = body.toString(2).getBytes();
			if (rawbody.length == 0) {
				rawbody = null;
			}
		}
		String url = getBaseAddress() + path;
		int tout = defaultTimeout;
		if (timeout != null) {
			// units? seconds or millis?
			tout = (int) timeout.longValue();
		}
		HttpURLConnection uc = null;
		InputStream is = null;
		boolean recordRequest = ecomplogger.isTargetSelf();
		try {
			URL u = new URL(url);
			uc = (HttpURLConnection) u.openConnection();
			uc.setConnectTimeout(tout);
			uc.setReadTimeout(tout);
			if (headers == null)
				headers = new HashMap<String, String>();
			headers.put("Content-type", "application/json");
			headers.put("Authorization", authorization);
			if (ecomplogger.getRequestId() == null) {
				if (System.getProperties().contains("ecomp.requestid"))
					ecomplogger.setRequestId(System.getProperties().getProperty("ecomp.requestid"));
				else if (System.getenv("ECOMP_REQUESTID") != null)
					ecomplogger.setRequestId(System.getenv("ECOMP_REQUESTID"));
				else 
					ecomplogger.newRequestId();
			}
			if (recordRequest) {
				// request is not currently recorded.
				ecomplogger.recordMetricEventStart(ManagementServerOperationEnum.MANAGEMENT_SERVER_UNKNOWN_SERVICE, url);
			}
			headers.put("X-ECOMP-RequestID", ecomplogger.getRequestId());
			for (String n : headers.keySet()) {
				uc.setRequestProperty(n, headers.get(n));
				if (debug) {
					System.err.println("HTTP REQUEST header: " + n + ": " + headers.get(n));
				}
			}
			uc.setRequestMethod(method);
			if (debug) 
				System.err.println("HTTP REQUEST url: " + method + " " + url);
			if (rawbody != null && rawbody.length > 0) {
				uc.setRequestProperty("Content-Length", Integer.toString(rawbody.length));
				uc.setFixedLengthStreamingMode(rawbody.length);
				uc.setDoOutput(true);
				OutputStream os = uc.getOutputStream();
				os.write(rawbody);
				os.close();
				if (debug) 
					System.err.println("HTTP REQUEST boby: " + body);
			}
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int rc = uc.getResponseCode();
			if (rc < 200 || rc >= 300) {
				is = uc.getErrorStream();
				if (is != null)
					FileUtils.copyStream(is, baos);
				if (baos.size() > 0 && debug) {
					System.err.println("HTTP ERROR: " + url + " " + baos);
				}
				throw new Jetty8ClientException("HTTP Request Failed: URL: " + url + " code:" + rc + " msg:"
						+ uc.getResponseMessage());
			}
			is = uc.getInputStream();
			FileUtils.copyStream(is, baos);
			byte[] res;
			if (baos.size() == 0)
				res = null;
			else
				res = (baos.toByteArray());
			if (recordRequest) 
				ecomplogger.recordMetricEventEnd();
			return res;
		} catch (RuntimeException re) {
//			ManagementServerUtils.printStackTrace(re);
			ManagementServerMessageEnum msg = ManagementServerMessageEnum.MANAGEMENT_SERVER_UNKNOWN_SERVICE_FAILED;
			ecomplogger.warn(msg, re.toString(), url);
			if (recordRequest) {
				ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, msg, re.getMessage());
			}
			throw re;
		} catch (Exception e) {
			ManagementServerMessageEnum msg = ManagementServerMessageEnum.MANAGEMENT_SERVER_UNKNOWN_SERVICE_FAILED;
			ecomplogger.warn(msg, e.toString(), url);
			if (recordRequest) { 
				ecomplogger.recordMetricEventEnd(StatusCodeEnum.ERROR, msg, e.getMessage());
			}
			ManagementServerUtils.printStackTrace(e);
			throw new RuntimeException("http error: " + e, e);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
				}
			}
			if (uc != null) {
				uc.disconnect();
			}
		}
	}

	public String getBaseAddress() {
		return baseAddress;
	}

	public void setBaseAddress(String baseAddress) {
		this.baseAddress = baseAddress;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public void httpBinaryTransaction(String path, String method, HashMap<String, String> headers, InputStream i, int j) {
		// TODO Auto-generated method stub

	}

	public void httpJsonTransaction(String path, String method, HashMap<String, String> headers, InputStream i, int j) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getRemote() {
		return getBaseAddress();
	}
	
	public static void main(String[] args) {
		String fileName = args[0];
		String endpoint = args[1];
		JavaHttpClient c = new JavaHttpClient(fileName, endpoint);
		String path = args[2];
		String method = args[3];
		JSONObject body = new JSONObject(args[4]);
		JSONObject headerJson = new JSONObject(args[5]);
		HashMap<String, String> headers = new HashMap<String, String>();
		for (Iterator<String> i = headerJson.keys(); i.hasNext();) {
			String k = i.next();
			headers.put(k, headerJson.getString(k));
		}
		c.httpJsonTransaction(path, method, headers, body);
	}
}
