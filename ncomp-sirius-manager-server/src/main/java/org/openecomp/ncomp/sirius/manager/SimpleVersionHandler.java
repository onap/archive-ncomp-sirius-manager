package org.openecomp.ncomp.sirius.manager;

import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openecomp.ncomp.sirius.manager.server.AttributeTranslationStep;
import org.openecomp.ncomp.sirius.manager.server.VersionConfiguration;
import org.openecomp.ncomp.sirius.manager.server.VersionTranslation;
import org.openecomp.ncomp.sirius.manager.server.VersionTranslationStep;

public class SimpleVersionHandler implements IVersionConverterHandler {

	private VersionConfiguration configuration;

	public JSONObject translateJsonObject(JSONObject json, String version1, String version2) {
		if (version1 != null && version1.equals(version2)) return json;
		if (json.length() == 0) return json;
//		System.err.println("VVVVVV: " + version1 + " -> " + version2);
//		System.err.println("VVVVVV before: " + json.toString(2));
		VersionTranslation v1 = findVersion(version1);
		VersionTranslation v2 = findVersion(version2);
		if (v1 != null && v2 != null) {
			throw new RuntimeException("Unable to translate between 2 old versions");
		}
		Boolean toCurrent = null;
		VersionTranslation v = null;
		if (v1 != null && version2 != null && version2.equals(configuration.getVersion())) {
			toCurrent = true;
			v = v1;
		}
		if (v2 != null && version1 != null && version1.equals(configuration.getVersion())) {
			toCurrent = false;
			v = v2;
		}
		if (toCurrent == null) {
			throw new RuntimeException("Unable to translate between versions: " + version1 + " -> " + version2);
		}
		for (VersionTranslationStep step : v.getSteps()) {
			if (step instanceof AttributeTranslationStep) {
				AttributeTranslationStep s = (AttributeTranslationStep) step;
				if (toCurrent)
					jsonStringReplace(json, s.getAttribute(), s.getOldValue(), s.getCurrentValue());
				else
					jsonStringReplace(json, s.getAttribute(), s.getCurrentValue(), s.getOldValue());
			}

		}
//		System.err.println("VVVVVV after: " + json.toString(2));
		return json;
	}

	private VersionTranslation findVersion(String version) {
		for (VersionTranslation v : configuration.getSupportedVersions()) {
			if (v.getName().equals(version))
				return v;
		}
		return null;
	}

	private void jsonStringReplace(JSONObject json, String attr, String string1, String string2) {
		for (Iterator<String> i = json.keys(); i.hasNext();) {
			String key = (String) i.next();
			Object o = json.get(key);
			if (o instanceof String) {
				json.put(key, ((String) o).replace(string1, string2));
				// System.out.println("KKKKKKK:" + o + " " + json.get(key));
			}
			if (o instanceof JSONObject) {
				jsonStringReplace((JSONObject) o, attr, string1, string2);
			}
			if (o instanceof JSONArray) {
				jsonStringReplace((JSONArray) o, attr, string1, string2);
			}
		}
	}

	private void jsonStringReplace(JSONArray a, String attr, String string1, String string2) {
		for (int i = 0; i < a.length(); i++) {
			Object o = a.get(i);
			if (o instanceof JSONObject) {
				jsonStringReplace((JSONObject) o, attr, string1, string2);
			}
			if (o instanceof JSONArray) {
				jsonStringReplace((JSONArray) o, attr, string1, string2);
			}
		}
	}

	@Override
	public void setconfiguration(VersionConfiguration c) {
		configuration = c;
	}

}
