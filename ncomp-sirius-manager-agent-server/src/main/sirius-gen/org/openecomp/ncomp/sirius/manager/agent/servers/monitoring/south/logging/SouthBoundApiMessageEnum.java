
package org.openecomp.ncomp.sirius.manager.agent.servers.monitoring.south.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum SouthBoundApiMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_logs,
  REQUEST_FAILED_metrics,
  REQUEST_FAILED_properties,
  REMOTE_CALL_FAILED_logs,
  REMOTE_CALL_FAILED_metrics,
  REMOTE_CALL_FAILED_properties;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/sirius/manager/agent/servers/monitoring/south/logging/SouthBoundApi");
	}
}
