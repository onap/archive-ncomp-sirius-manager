
package org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.gui.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum GuiClientApiMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_getTree,
  REQUEST_FAILED_getObject,
  REQUEST_FAILED_getTimeSerie,
  REQUEST_FAILED_getTable,
  REQUEST_FAILED_getHtml,
  REQUEST_FAILED_getGraph,
  REMOTE_CALL_FAILED_getTree,
  REMOTE_CALL_FAILED_getObject,
  REMOTE_CALL_FAILED_getTimeSerie,
  REMOTE_CALL_FAILED_getTable,
  REMOTE_CALL_FAILED_getHtml,
  REMOTE_CALL_FAILED_getGraph;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/sirius/manager/agent/servers/monitoring/gui/logging/GuiClientApi");
	}
}
