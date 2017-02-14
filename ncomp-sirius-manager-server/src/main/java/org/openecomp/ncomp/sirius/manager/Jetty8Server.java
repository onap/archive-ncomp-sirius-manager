
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
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.eclipse.jetty.http.ssl.SslContextFactory;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.server.ssl.SslSelectChannelConnector;
import org.eclipse.jetty.util.B64Code;
import org.eclipse.jetty.util.StringUtil;
import org.json.JSONObject;

import org.openecomp.logger.EcompLogger;
import org.openecomp.ncomp.utils.PropertyUtil;
import org.openecomp.ncomp.webservice.utils.JsonUtils;

public class Jetty8Server {
	public static final Logger logger = Logger.getLogger(Jetty8Server.class);
	static final EcompLogger ecomplogger = EcompLogger.getEcompLogger();
	Server server;
	private SelectChannelConnector conn1;
	private int actualport;
	HashMap<String, IRequestHandler> handlerMap = new HashMap<String, IRequestHandler>();
	ServerThread thread;
	private Properties props;

	class Jetty8ServerHandler extends AbstractHandler {

		private HashMap<String, String> method2action = new HashMap<String, String>();

		{
			method2action.put("POST", "CREATE");
			method2action.put("PUT", "UPDATE");
			method2action.put("GET", "LIST");
			method2action.put("DELETE", "DELETE");
		}

		@Override
		public void handle(String contextPath, Request jRequest, HttpServletRequest request,
				HttpServletResponse response) throws IOException, ServletException {
			if (request.getMethod().equals("OPTIONS")) {
				setResponseHeaders(response);
				response.setHeader("Allow", "HEAD,GET,PUT,DELETE,OPTIONS");
				response.setStatus(200);
				jRequest.setHandled(true);
				return;
			}
			String userName = checkAuth(contextPath,jRequest);
			if (userName == null) {
				setResponseHeaders(response);
				response.setStatus(403);
				jRequest.setHandled(true);
				logger.info("Authorization not valid");
				return;
			}
			String requestId = request.getHeader("X-ECOMP-RequestID");
			if (requestId == null) {
				ecomplogger.newRequestId();
			}
			else {
				ecomplogger.setRequestId(requestId);;
			}
			String action = request.getHeader("action");
			if (action == null) {
				String method = request.getMethod();
				action = method2action.get(method);
			}
			logger.debug("new request:" + contextPath + " " + request.getMethod() + " " + action);
			Object res = null;
			String contextPath1 = null;
			IRequestHandler handler = null;
			for (String prefix : handlerMap.keySet()) {
				if (contextPath.startsWith(prefix)) {
					contextPath1 = contextPath.substring(prefix.length());
					handler = handlerMap.get(prefix);
				}
			}
			if (handler == null) {
				logger.warn("request with no handler: " + contextPath);
				return;
			}
			try {
				if ("application/json".equals(jRequest.getContentType()) || jRequest.getContentType() == null) {
//					ByteArrayOutputStream s = new ByteArrayOutputStream();
//					FileUtils.copyStream(request.getInputStream(), s);
//					System.err.println(s); 
//					JSONObject json = new JSONObject(new String(s.toByteArray()));
					JSONObject json = JsonUtils.stream2json(request.getInputStream());
					res = handler.handleJson(userName, action, contextPath1, json, req2context(contextPath, jRequest, userName));
				} else
					throw new ManagerException(HttpServletResponse.SC_BAD_REQUEST, "Cannot use content type: "
							+ jRequest.getContentType());
			} catch (ManagerException e) {
				setResponseHeaders(response);
				response.sendError(e.code, e.getMessage());
				ManagementServerUtils.printStackTrace(e);
				return;
			} catch (Exception e) {
				ManagementServerUtils.printStackTrace(e);
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
				return;
			}
			if (res != null) {
				setResponseHeaders(response);
				if (res instanceof JSONObject) {
					JSONObject json1 = (JSONObject) res;
					PrintWriter w = response.getWriter();
					w.append(json1.toString(2));
					w.close();
					response.setStatus(200);
					jRequest.setHandled(true);
				} else
					response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Unable to handle output object: "
							+ res.getClass().getName());
				return;
			}
			response.setStatus(HttpServletResponse.SC_OK);
			jRequest.setHandled(true);
		}

		private void setResponseHeaders(HttpServletResponse response) {
			for (Object k : props.keySet()) {
				if (k instanceof String) {
					String s = (String) k;
					if (! s.startsWith("server.header")) continue;
					response.setHeader(s.substring(14), props.getProperty(s));
				}
			}
		}

		private JSONObject req2context(String contextPath, Request jRequest, String user) {
			JSONObject c = new JSONObject();
			c.put("remoteIp", jRequest.getRemoteAddr());
			c.put("user", user);
			JSONObject p = new JSONObject();
			for (Object k : jRequest.getParameterMap().keySet()) {
				if (k instanceof String) {
					String kk = (String) k;
					p.put(kk, jRequest.getParameter(kk));
				}
			}
			c.put("parameters", p);
			c.put("path", contextPath);
			return c;
		}
	}

	public Jetty8Server(String propertyFileName) {
		try {
			props = PropertyUtil.getPropertiesFromClasspath(propertyFileName);
			String portString = props.getProperty("server.port");
			if (portString == null)
				return;
			int port = Integer.parseInt(portString);
			server = new Server();
			if (props.containsKey("server.keyStore")) {
				@SuppressWarnings("deprecation")
				SslContextFactory f = new SslContextFactory(props.getProperty("server.keyStore"));
				f.setKeyStorePassword(props.getProperty("server.keyStorePassword"));
				f.setKeyManagerPassword(props.getProperty("server.keyManagerPassword"));
				f.setTrustStore(props.getProperty("server.trustStore"));
				f.setTrustStorePassword(props.getProperty("server.trustStorePassword"));
				logger.info("HTTPS excluded protocols: " + Arrays.asList(f.getExcludeProtocols()));
				f.addExcludeProtocols("SSLv1","SSLv2","SSLv3");
				logger.info("HTTPS excluded protocols after fix: " + Arrays.asList(f.getExcludeProtocols()));
				SslSelectChannelConnector c = new SslSelectChannelConnector(f);
				c.setPort(port); 
				c.setMaxIdleTime(30000);
				server.addConnector(c);
				conn1 = c;
				logger.info("Adding HTTPS on port: " + port);
			} else {
				SelectChannelConnector c = new SelectChannelConnector();
				c.setPort(port);
				server.addConnector(c);
				conn1 = c;
				logger.info("Adding HTTP on port: " + port);
			}
			server.setHandler(new Jetty8ServerHandler());
			// secondary port (assume HTTP)
			portString = props.getProperty("server.port2");
			if (portString != null) {
				port = Integer.parseInt(portString);
				SelectChannelConnector c = new SelectChannelConnector();
				c.setPort(port);
				server.addConnector(c);
				logger.info("Adding HTTP on secondary port: " + port);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ManagementServerUtils.printStackTrace(e);
		}
	}
	
	/**
	 *	In unit testing, we want to start on an operating system selected port number, so we configure a port number of 0, and then use this to find out the real port number
	 */
	public int getPort() {
		return(actualport);
	}
	/**
	 *	In unit testing, we want to shut down the server
	 */
	public void stop() {
		try {
			server.stop();
		} catch (Exception e) {
		}
	}

	public void start() {
		thread = new ServerThread();
	}

	public void join() {
		try {
			if (server == null) {
				logger.warn("Ignore Join: server is NULL");
				return;
			}
			server.start();
			actualport = conn1.getLocalPort();
			server.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			ManagementServerUtils.printStackTrace(e);
		}
	}

	public static void main(String[] args) {
		new Jetty8Server("server.properties");

	}

	public void add(String prefix, IRequestHandler h) {
		handlerMap.put(prefix, h);
	}

	class DummyRequestHandler implements IRequestHandler {
		@Override
		public Object handleJson(String userName, String action, String resourcePath, JSONObject json,
				JSONObject context) {
			logger.debug("handleJson: user=" + userName + " action=" + action + " path=" + resourcePath + " json="
					+ json);
			return null;
		}

		@Override
		public Object handleBinary(String userName, String action, String resourcePath, InputStream in) {
			logger.info("handleBinary: user=" + userName + " action=" + action + " path=" + resourcePath);
			return null;
		}
	}

	private class ServerThread implements Runnable {
		public ServerThread() {
			Thread t = new Thread(this, "jetty server");
			t.setDaemon(true);
			t.start();
		}

		@Override
		public void run() {
			try {
				server.start();
				actualport = conn1.getLocalPort();
				server.join();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				ManagementServerUtils.printStackTrace(e);
			}
		}
	}

	private String checkAuth(String contextPath, Request r) {
		if (props.containsKey("server.noauth."+ contextPath))
			return "none";
		String s = r.getHeader("Authorization");
		if (s == null) {
			logger.warn("Authorization failed: No header");
			return null;
		}
		String a[] = s.split(" ");
		if (a.length != 2) {
			logger.warn("Authorization failed: Bad header");
			return null;
		}
		String s1 = null;
		try {
			s1 = B64Code.decode(a[1], StringUtil.__ISO_8859_1);
		} catch (UnsupportedEncodingException e) {
		}
		int i = s1.indexOf(":");
		if (i == -1) {
			logger.warn("Authorization failed: Bad header");
			return null;
		}
		String user = s1.substring(0, i);
		String pw = s1.substring(i + 1);
		String pw2 = props.getProperty("server.user." + user);
		boolean valid = pw.equals(JavaHttpClient.decryptPassword(pw2));
		if (!valid)
			logger.warn("Authorization: bad PW: " + user +"@" + r.getRemoteAddr() + " " + pw.substring(0, 2));
		return valid ? user : null;
	}

}
