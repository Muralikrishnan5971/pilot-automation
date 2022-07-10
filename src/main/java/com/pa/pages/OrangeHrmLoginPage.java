package com.pa.pages;

import org.openqa.selenium.By;

import com.pa.enums.WaitStrategy;

public final class OrangeHrmLoginPage extends BasePage {

	private final By userName = By.id("txtUsername");
	private final By passWord = By.id("txtPassword");
	private final By buttonLogin = By.id("btnLogin");

	public OrangeHrmLoginPage enterUserName(String username) {

		sendKeys(userName, username, WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHrmLoginPage enterPassWord(String password) {

		sendKeys(passWord, password, WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHrmHomePage clickLoginBtn() {

		click(buttonLogin, WaitStrategy.CLICKABLE);

		return new OrangeHrmHomePage();
	}

	public String getLoginPageTitle() {

		return getPageTitle();
	}
}
