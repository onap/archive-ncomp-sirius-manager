
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
	
<% 

import org.openecomp.ncomp.sirius.manager.ManagementServerError;
import org.openecomp.ncomp.utils.StringUtil
import org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer
import org.openecomp.ncomp.gwt.siriusportal.model.GuiClientApi

%>
package $packageName;





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;

<%   
  def others = []
  def provider = "BasicAdaptorProvider"
  switch (o) {
    case AbstractManagementServer: 
    	others += "java.util.Date"; 
    	others += "org.openecomp.ncomp.sirius.manager.server.LoggerInfo"
    	others += "org.openecomp.ncomp.sirius.manager.server.ServerFactory"
    	provider = "BasicManagementServerProvider"
    	break
    case GuiClientApi: 
    	others += "org.openecomp.ncomp.sirius.gui.tools.*"; 
    	others += "org.openecomp.ncomp.gwt.siriusportal.model.*"; 
    	others += "org.openecomp.ncomp.sirius.manager.Subject";
    	others += "org.openecomp.ncomp.sirius.manager.ManagementServer"
    	others += "org.openecomp.ncomp.sirius.manager.server.AbstractManagementServer"
    	provider = "BasicGuiClientApiProvider"
    	break
  }
  if (g.providerObject != null) {
	  provider = "$g.providerPrefix${g.providerObject.eClass().name}Provider"
	  others += "${g.providerPackage}.$provider"
  } else {
	  others += "org.openecomp.ncomp.sirius.manager.${provider}"
  }
  if (g.enableDrools) {
	  others += "org.openecomp.ncomp.core.logs.LogLevel"
	  others += "org.openecomp.ncomp.core.logs.LogMessage"
	  others += "org.openecomp.ncomp.core.logs.LogSeverity"
	  others += "org.openecomp.ncomp.core.logs.LogsFactory"
	  others += "org.openecomp.ncomp.sirius.manager.DroolsEventReporter"
	  others += "org.openecomp.ncomp.sirius.manager.drools.DroolsRuntime"
  }
  others.each { n ->
%>

import $n;
<% } %>

import ${p.nsURI}.impl.${name}Impl;
import ${p.nsURI}.${name};


public class ${cName} extends ${provider} {
	private static final Logger logger = Logger.getLogger(${cName}.class);
	${name} o;

	public ${cName}(ISiriusServer controller, ${name} o) {
		super(controller, o);
		this.o = o;
	}
<% g.operationsProvider().each { op -> 
  def decl = []
  def vars = []
//  if (g.root != g && g.root.o.eClass().EPackage == o.eClass().EPackage) {
//    decl += "String path"
//    vars += "path"
//  }
  op.getEParameters().each  { p ->
    vars += p.name
    if (p.isMany()) 
   	  decl += "EList<${p.getEType().getInstanceClassName()}> $p.name"
    else 
  	  decl += "${p.getEType().getInstanceClassName()} $p.name"
  }
  def rType = op.getEType() == null ? "void" : op.getEType().getInstanceClassName()
  if (op.isMany()) rType = "EList<$rType>"
  def ret = rType == "void" ? "" : "return res;"
  def decl1 = rType == "void" ? "" : "$rType res = null;"
  def assign = rType == "void" ? "" : "res = "
  def cx = op.getEParameters().find { it.name == "cx" } ? "null," : ""
  def action = "$decl1\n     // TODO IMPLEMENT\n     throw new UnsupportedOperationException();"
  switch (o) {
  case AbstractManagementServer: 
	  switch (op.name) {
	  case "logs":
	  case "properties":
	  case "metrics":
	  case "uploadInfo":
	  case "getMessages": 
	  case "getValues": 
	  case "getValuesAll": 
	  case "evaluate": 
	  case "getRequestLogger":
	  case "update":
		  return
	  }
	  break;
  case GuiClientApi:
	  switch (op.name) {
	  case "getTree": 
	  case "getTable": 
	  case "getTimeSerie": 
	  case "getObject": 
	  case "getHtml": 
	  case "getGraph": 
		return
	  }
	  break;	  
  }
  %>
	public ${rType} ${op.name}(${StringUtil.join(decl, ", ")}) {
		$action
	}
<% } %>
<% if (g.enableIRequestHandler) { %>
public Object handleJson(String userName, String action, String resourcePath, JSONObject json, JSONObject context, String clientVersion) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Object handleBinary(String userName, String action, String resourcePath, InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
<% } %>

<%  if (g.enableDrools) {%>
DroolsRuntime drools = null;
<%  }%>
<% if (g.enableISiriusPlugin) { %>
<%      if (g.enableDrools) {%>
	public void start() {
		try {
			// TODO specify rules group, artifact and version
			drools = new DroolsRuntime (1000L, "$packageName", "unspecified-rules-artifact", "0.1.0-SNAPSHOT",
										new DroolsEventReporter(controller.getServer(), "unknown"));
			drools.addObjectTree (o);
			drools.startSession();
			drools.startScanner(60000L);
			controller.getServer().setDroolsRuntime(drools);
//			log("started Drools Session", LogLevel.INFO, LogSeverity.SEV4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}
<%      }%>
<% } %>
	
}
