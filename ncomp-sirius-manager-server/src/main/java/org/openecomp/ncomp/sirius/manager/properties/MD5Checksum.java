
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
	
package org.openecomp.ncomp.sirius.manager.properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Date;

import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;

public class MD5Checksum {

	public static String createFileChecksum(String filename) {
		try {
			InputStream fis = null;
			MessageDigest complete = null;
			try {
				fis = new FileInputStream(filename);
				byte[] buffer = new byte[1024];
				complete = MessageDigest.getInstance("MD5");
				int numRead = 0;
				while (numRead != -1) {
					numRead = fis.read(buffer);
					if (numRead > 0) {
						complete.update(buffer, 0, numRead);
					}
				}
			} catch (Exception e) {
				ManagementServerUtils.printStackTrace(e);
			} finally {
				if (fis != null)
					fis.close();
			}
			return bytes2hex(complete.digest());
		} catch (Exception e) {
			return random();
		}
	}

	public static String createChecksum(String s) {
		try {
			MessageDigest complete = MessageDigest.getInstance("MD5");
			complete.update(s.getBytes());
			return bytes2hex(complete.digest());
		} catch (Exception e) {
			ManagementServerUtils.printStackTrace(e);
			return random();
		}
	}
	
	public static String createChecksum(byte[] bytes) {
		try {
			MessageDigest complete = MessageDigest.getInstance("MD5");
			complete.update(bytes);
			return bytes2hex(complete.digest());
		} catch (Exception e) {
			ManagementServerUtils.printStackTrace(e);
			return random();
		}
	}

	// a byte array to a HEX string
	private static String bytes2hex(byte[] b) throws Exception {
		String result = "";
		for (int i = 0; i < b.length; i++) {
			result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
		}
		return result;
	}

	private synchronized static String random() {
		long t = new Date().getTime();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			ManagementServerUtils.printStackTrace(e);
		}
		return Long.toString(t);
	}

}
