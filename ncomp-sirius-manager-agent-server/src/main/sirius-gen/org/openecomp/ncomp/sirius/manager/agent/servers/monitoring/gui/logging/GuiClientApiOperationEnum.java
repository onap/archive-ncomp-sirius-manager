
package org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.gui.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum GuiClientApiOperationEnum implements EcompOperationEnum {

  GuiClientApi_getTree("GuiClientApi@getTree"),
  GuiClientApi_getObject("GuiClientApi@getObject"),
  GuiClientApi_getTimeSerie("GuiClientApi@getTimeSerie"),
  GuiClientApi_getTable("GuiClientApi@getTable"),
  GuiClientApi_getHtml("GuiClientApi@getHtml"),
  GuiClientApi_getGraph("GuiClientApi@getGraph") ; 


	private String n;
	
	private GuiClientApiOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
