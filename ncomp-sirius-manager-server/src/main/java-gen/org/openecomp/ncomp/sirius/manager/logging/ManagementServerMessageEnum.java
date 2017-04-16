
package org.openecomp.ncomp.sirius.manager.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum ManagementServerMessageEnum implements EcompMessageEnum {

  MANAGEMENT_SERVER_WEB_REQUEST_WITHOUT_HANDLER,
  MANAGEMENT_SERVER_WEB_REQUEST_UNKNOWN_RETURN_CLASS,
  MANAGEMENT_SERVER_WEB_REQUEST_UNSUPPORTED_CONTENT_TYPE,
  MANAGEMENT_SERVER_WEB_REQUEST_UNKNOWN_EXCEPTION,
  MANAGEMENT_SERVER_RESOURCE_DOES_NOT_EXIST,
  MANAGEMENT_SERVER_RESOURCE_EXIST,
  MANAGEMENT_SERVER_ACTION_FORBIDDEN,
  MANAGEMENT_SERVER_UNKNOWN_SERVICE_FAILED,
  MANAGEMENT_SERVER_JSON_VERSION_MISMATCH;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/sirius/manager/logging/ManagementServer");
	}
}
