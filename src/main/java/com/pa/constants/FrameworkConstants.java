package com.pa.constants;

public final class FrameworkConstants {

	// Private constructor to restrict instance creation of this class
	private FrameworkConstants() {

	}

	private static final String RESOURCES_PATH = System.getProperty("user.dir") + "/src/test/resources";

	private static final String CHROMEDRIVER_PATH = RESOURCES_PATH + "/DriverExecutables/chromedriver.exe";

	private static final String CONFIGFILE_PATH = RESOURCES_PATH + "/config/frameworkConfig.properties";

	private static final int EXPLICIT_WAIT = 15;

	public static int getExplicitWaitTime() {
		return EXPLICIT_WAIT;
	}

	public static String getConfigFilePath() {
		return CONFIGFILE_PATH;
	}

	public static String getChromeDriverPath() {
		return CHROMEDRIVER_PATH;
	}
}
