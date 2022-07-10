package com.pa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pa.constants.FrameworkConstants;
import com.pa.enums.WaitStrategy;
import com.pa.factory.DriverManager;

public class BasePage {

	protected void click(By by, WaitStrategy waitStrategy) {

		/*
		 * We want to make sure user can only choose from list of predefined options
		 */

		if (waitStrategy == WaitStrategy.CLICKABLE) {

			expilicitlyWaitForElementToBeClickable(by);

		} else if (waitStrategy == WaitStrategy.PRESENCE) {

			explicitlyWaitForElementToBePresent(by);
		}

		DriverManager.getDriver().findElement(by).click();
	}

	protected void sendKeys(By by, String value, WaitStrategy waitStrategy) {

		if (waitStrategy == WaitStrategy.CLICKABLE) {

			expilicitlyWaitForElementToBeClickable(by);

		} else if (waitStrategy == WaitStrategy.PRESENCE) {

			explicitlyWaitForElementToBePresent(by);
		}

		DriverManager.getDriver().findElement(by).clear();
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}

	protected String getPageTitle() {

		return DriverManager.getDriver().getTitle();
	}

	private void expilicitlyWaitForElementToBeClickable(By by) {

		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWaitTime());
		wait.until(ExpectedConditions.elementToBeClickable(by));

		// wait.until(d-> d.findElement(logout).isEnabled()); using java 8 lamda
		// expressions
	}

	private void explicitlyWaitForElementToBePresent(By by) {

		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWaitTime());
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
