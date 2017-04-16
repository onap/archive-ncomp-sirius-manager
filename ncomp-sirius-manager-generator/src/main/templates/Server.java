
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
	
// Autogenerated
// Do not edit but extend this class as needed
package $packageName;

import static org.openecomp.ncomp.utils.PropertyUtil.getPropertiesFromClasspath;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EFactory;
import org.json.JSONObject;
import org.openecomp.ncomp.sirius.manager.Jetty8Server;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;

import ${p.nsURI}.${name};

<% g.subApis.each { api -> 
if (api.type == "P") return
def n1 = api.subName
if (n1 == null) return
%>    
import ${api.packageName()}.${api.m.prefix}${api.factoryName()};
<% } %>

<% g.subClients.each { api -> %>    
import ${api.o.eClass().EPackage.nsURI}.${api.o.eClass().name};
import ${api.packageName()}.${prefix}${api.o.eClass().name}Client;
<% } %>


public class $cName implements ISiriusServer, IRequestHandler {
    public static final Logger logger = Logger.getLogger(${cName}.class);
    String serverPath;
    ManagementServer server;
    ${prefix}${name} controller;
    String directory = "data";
//      LocationControllerApi api ;
    Jetty8Server webServer;
    ${prefix}${fName} f = new ${prefix}${fName}(this);
	
<% g.subApis.each { api -> 
	if (api.type == "P") return
	def n1 = api.subName
	if (n1 == null) return
%>    
    String ${n1}Path;
    ManagementServer ${n1}Server;
<% } %>
<% g.subClients.each { api -> %>    
	${api.o.eClass().name} $api.clientName;
<% } %>
    public ${prefix}${name}Server(String filename) throws IOException {
		logger.warn("controller restarting");
		${prefix}${name}.ecoreSetup(); 
		props = getPropertiesFromClasspath(filename);
        serverPath = (String) props.get("server.dir");
        server = new ManagementServer(f, "${name}", serverPath, filename);
        ManagementServer.setBuildVersion($version);
        server.addFactory(f);
<% g.factories.each { factory -> 
  if (g.useNew[factory]) { %>    
		server.addFactory(new ${factory}(this));
  <% } else { %>
		server.addFactory(${factory}.eINSTANCE);
  <% } %>
<% } %>
        server.addRuntimeFactories(this);
        server.start();
    }
    public void runWebserver() throws IOException {
        controller = (${prefix}${name}) server.find("/").o;
        webServer = new Jetty8Server("${nsPrefix}.properties");
        webServer.add("/resources",server);
        webServer.add("/api",this);
<% g.aliases.each { %>   
		webServer.add("$it",controller);
<%}%>

<% g.subApis.each { api -> 
	if (api.type == "A" || api.type == "P") return
    def n1 = api.subName
%>    
		EFactory ${n1}Factory = new ${api.m.prefix}${api.factoryName()}(this);
		${n1}Path = serverPath + "/${n1}";
		${n1}Server = new ManagementServer(${n1}Factory, "${api.o.eClass().name}", ${n1}Path, "${n1}.properties");
		${n1}Server.start();
		webServer.add("/${n1}",${n1}Server);
<% } %>

<% g.subClients.each { api -> %>    
		$api.clientName = new ${prefix}${api.o.eClass().name}Client("${nsPrefix}.properties", "$api.clientName");
<% } %>
        logger.info("Joining webserver");
        webServer.join();
    }
    static Properties props = null;
    public static void main(String []args) throws IOException {
            // ALWAYS USE GMT.
            TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
            
            ${prefix}${name}Server s = new ${prefix}${name}Server("${nsPrefix}.properties");
            s.runWebserver();
    }
	public ${name} getController() {
		return controller;
	}
	public ManagementServer getServer() {
		return server;
	}
	public Object handleJson(String userName, String action, String resourcePath, JSONObject json, JSONObject context,
			String clientVersion) {
		switch ((String) context.get("path")) {
		case "/api/versions":
			return server.supportedVersions();
		}
		logger.warn("Unknown request action=" + action + " path=" + resourcePath + " context=" + context.toString(2));
		throw new RuntimeException("Unknown request");
	}
	public Object handleBinary(String userName, String action, String resourcePath, InputStream in) {
		return null;
	}

}
