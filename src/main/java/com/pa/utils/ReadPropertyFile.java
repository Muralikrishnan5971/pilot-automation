package com.pa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.pa.constants.FrameworkConstants;

public class ReadPropertyFile {

	private ReadPropertyFile() {

	}

	private static Properties property = new Properties();
	private static Map<String, String> CONFIGMAP = new HashMap<String, String>();

	// Eager Initialization
	static {

		try {

			FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigFilePath());

			property.load(fis);

			// converting our properties file to a hashmap

			for (Object key : property.keySet()) {

				CONFIGMAP.put(String.valueOf(key), String.valueOf(property.get(key)).trim()); // remove white spaces
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String getURL(String key) throws Exception {

		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key))) {

			throw new Exception("Property " + key + " is not found. Kindly check config.properties !!!");
		}

		return CONFIGMAP.get(key);
	}
}
