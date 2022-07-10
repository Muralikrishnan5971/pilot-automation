package com.pa.factory;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pa.constants.FrameworkConstants;
import com.pa.utils.ReadPropertyFile;

public class DriverFactory {

	private DriverFactory() {

	}

	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) { // if driver == null instead using java objects class from
															// utils

			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());

			DriverManager.setDriver(new ChromeDriver());

			DriverManager.getDriver().get(ReadPropertyFile.getURL("url"));
		}
	}

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) // if driver != null

			DriverManager.getDriver().quit();

		DriverManager.unLoad();
	}

}
