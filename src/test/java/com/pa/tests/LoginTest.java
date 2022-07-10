package com.pa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.pa.factory.DriverManager;

public final class LoginTest extends BaseTest {

	private LoginTest() {

	}

	@Test
	public void test01() {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Software", Keys.ENTER);

	}

	@Test
	public void test02() {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing", Keys.ENTER);

	}

}
