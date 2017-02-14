
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

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.HttpExchange;
import org.eclipse.jetty.http.ssl.SslContextFactory;
import org.eclipse.jetty.io.Buffer;
import org.eclipse.jetty.io.ByteArrayBuffer;
import org.eclipse.jetty.util.B64Code;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONObject;

import org.openecomp.ncomp.utils.CryptoUtils;
import org.openecomp.ncomp.utils.PropertyUtil;

@SuppressWarnings("deprecation")
public class Jetty8ClientOld extends AbstractClient {
	public static final Logger logger = Logger.getLogger(Jetty8ClientOld.class);
	HttpClient httpClient;
	String authorization;
	String baseAddress;
	private boolean debug = false;

	public Jetty8ClientOld(String fileName, String endpoint) {
		try {
			props = PropertyUtil.getPropertiesFromClasspath(fileName);
			language = props.getProperty(endpoint + ".language", "somf");
			namespace = props.getProperty(endpoint + ".namespace", null);
			setBaseAddress(props.getProperty(endpoint + ".endpoint"));
			if (getBaseAddress() == null) {
				logger.error("unable to determine baseAddress for endpoint: " + endpoint + " in " + fileName);
				throw new RuntimeException("unable to determine baseAddress for endpoint: " + endpoint + " in " + fileName);
			}
			String user = props.getProperty(endpoint + ".user");
			String password = decryptPassword(props.getProperty(endpoint + ".password"));
			debug = Boolean.parseBoolean(props.getProperty(endpoint + ".debug","false"));
//			if (debug) 
//				System.err.println("using " + user + " "+ password + " "+ endpoint + " " + fileName + " " + getBaseAddress());
			authorization = "Basic " + B64Code.encode(user + ":" + password, StringUtil.__ISO_8859_1);
			if (props.containsKey(endpoint + ".keyStore")) {
				SslContextFactory sslContextFactory = new SslContextFactory(props.getProperty(endpoint + ".keyStore"));
				sslContextFactory.setKeyManagerPassword(props.getProperty(endpoint + ".keyManagerPassword"));
				sslContextFactory.setKeyStorePassword(props.getProperty(endpoint + ".keyStorePassword"));
				// sslContextFactory.setTrustStorePath(probs.getProperty(endpoint.trustStore"));
				sslContextFactory.setTrustStorePassword(props.getProperty(endpoint + ".trustStorePassword"));
				httpClient = new HttpClient(sslContextFactory);
			} else
				httpClient = new HttpClient();
			httpClient.start();
		} catch (Exception e) {
			ManagementServerUtils.printStackTrace(e);
			logger.error("creating client failed: " + e.toString());
		}
	}
	
	private String decryptPassword(String s) {
		if (s.startsWith("rsa:")) {
			s = CryptoUtils.decryptPrivate(CryptoUtils.getKey("config/server.private"), s.substring(4));
		}
		return s;
	}

	@Override
	public byte[] httpBinaryTransaction(String path, String method, HashMap<String, String> headers, JSONObject body, Long timeout) {
		class Exchange extends HttpExchange {
			@SuppressWarnings("unused")
			String version;
			int code;
			String message;
			@SuppressWarnings("unused")
			String location;
			ByteArrayOutputStream content = new ByteArrayOutputStream();

			@Override
			protected void onResponseHeader(Buffer name, Buffer value) {
				// System.out.println("HEADER: " + name + " " + value);
				if (name.toString().equals("Location"))
					location = value.toString();
			}

			@Override
			protected void onResponseStatus(Buffer httpVersion, int statusCode, Buffer statusMessage) {
				logger.debug("v=" + httpVersion + " code=" + statusCode + " m=" + "statusMessage");
				version = httpVersion.toString();
				code = statusCode;
				message = statusMessage.toString();
			}

			@Override
			protected void onResponseContent(Buffer content) {
				logger.debug("onResponseContent: " + content.toString());
				byte[] b = content.asArray();
				this.content.write(b,0,b.length);
			}
		}
		String url = getBaseAddress() + path;
		Exchange exchange = new Exchange();
		exchange.setURL(url);
		exchange.setMethod(method);
		if (debug) 
			System.err.println("HTTP REQUEST: " + method + " " + url);
		if (headers == null)
			headers = new HashMap<String, String>();
		headers.put("Content-type", "application/json");
		headers.put("Authorization", authorization);
		for (String n : headers.keySet()) {
			exchange.addRequestHeader(n, headers.get(n));
			if (debug)
				System.err.println("HTTP REQUEST header: " + n + " " + headers.get(n));
		}
		if (body != null) {
			// exchange.setRequestContentSource(new
			// ByteArrayInputStream(body.toString().getBytes()));
			if (debug) System.err.println("HTTP REQUEST JSON body: " +  body.toString(2));
			exchange.setRequestContent(new ByteArrayBuffer(body.toString(2).getBytes()));
		}
		try {
			if (timeout != null && timeout > 0) {
				exchange.setTimeout(timeout);
			}
			httpClient.send(exchange);
			int exchangeState = -1;
			if (debug) System.err.println("HTTP REQUEST timeout: " + timeout);
			exchangeState = exchange.waitForDone();
			if (logger.isDebugEnabled()) 
				logger.debug("Exchange done: " + exchangeState);
			if (debug) System.err.println("HTTP RESPONSE STATE: " + exchangeState + " " + exchange.code);
			switch (exchange.code) {
			case 200:
			case 204:
				break;
			default:
				throw new Jetty8ClientException("HTTP Exchanged Failed: URL: " + url + " state:" + exchangeState + " code:" + exchange.code
						+ " msg:" + exchange.message);
			}
			if (debug) System.out.println("HTTP RESPONSE CONTENT: " + exchange.content);
			if (exchange.content.size() == 0)
				return null;
			return exchange.content.toByteArray();
		} catch (Jetty8ClientException e) {
			throw e;
		} catch (Exception e) {
			 ManagementServerUtils.printStackTrace(e);
			String body1 = body == null ? "NULL" : body.toString(2);
			logger.error("http error: " + url + " body=" + body1 + " ", e);
			throw new RuntimeException("http error: " + e, e);
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

	public void httpBinaryTransaction(String path, String method,
			HashMap<String, String> headers, InputStream i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void httpJsonTransaction(String path, String method,
			HashMap<String, String> headers, InputStream i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getRemote() {
		return getBaseAddress();
	}

}
