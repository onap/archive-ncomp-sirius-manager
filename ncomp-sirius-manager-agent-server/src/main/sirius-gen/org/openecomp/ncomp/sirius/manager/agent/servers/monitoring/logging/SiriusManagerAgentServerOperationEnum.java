
package org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum SiriusManagerAgentServerOperationEnum implements EcompOperationEnum {

  SiriusManagerAgentServer_logs("SiriusManagerAgentServer@logs"),
  SiriusManagerAgentServer_metrics("SiriusManagerAgentServer@metrics"),
  SiriusManagerAgentServer_properties("SiriusManagerAgentServer@properties"),
  SiriusManagerAgentServer_uploadInfo("SiriusManagerAgentServer@uploadInfo"),
  SiriusManagerAgentServer_getValues("SiriusManagerAgentServer@getValues"),
  SiriusManagerAgentServer_getValuesAll("SiriusManagerAgentServer@getValuesAll"),
  SiriusManagerAgentServer_getMessages("SiriusManagerAgentServer@getMessages"),
  SiriusManagerAgentServer_getRequestLogger("SiriusManagerAgentServer@getRequestLogger"),
  SiriusManagerAgentServer_evaluate("SiriusManagerAgentServer@evaluate"),
  SiriusManagerAgentServer_update("SiriusManagerAgentServer@update") ; 


	private String n;
	
	private SiriusManagerAgentServerOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
