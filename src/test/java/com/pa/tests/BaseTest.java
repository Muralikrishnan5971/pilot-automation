package com.pa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pa.factory.DriverFactory;

public class BaseTest {

	//@Author Muralikrishnan
	// protected because it need to be visible to all child classes
	// because by default it have a public constructor, we don't want that
	protected BaseTest() {

	}

	/*
	 * Private, protected, default and only the last prefered access modifier should
	 * be public
	 */
	@BeforeMethod
	protected void setUp() throws Exception {

		DriverFactory.initDriver();

	}

	@AfterMethod
	protected void tearDown() {

		DriverFactory.quitDriver();
	}
}
