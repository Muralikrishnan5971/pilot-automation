package com.pa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pa.enums.WaitStrategy;
import com.pa.factory.DriverManager;

public final class OrangeHrmHomePage extends BasePage {

	private final By welcome = By.id("welcome");
	private final By logout = By.xpath("//a[text() = 'Logout']");

	public OrangeHrmHomePage clickOnWelcome() {

		click(welcome, WaitStrategy.CLICKABLE);

		return this;
	}

	public OrangeHrmLoginPage clickOnLogOut() {

		new WebDriverWait(DriverManager.getDriver(), 10)
		.until(ExpectedConditions.elementToBeClickable(logout));
		
		click(logout, WaitStrategy.CLICKABLE);

		return new OrangeHrmLoginPage();
	}

}
