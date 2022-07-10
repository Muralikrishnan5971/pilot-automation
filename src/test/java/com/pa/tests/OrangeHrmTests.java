package com.pa.tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import com.pa.pages.OrangeHrmLoginPage;

public final class OrangeHrmTests extends BaseTest {

	private OrangeHrmTests() {

	}

	@Test
	public void logInLogOutTest() {

		String actualTitle = new OrangeHrmLoginPage().enterUserName("Admin").enterPassWord("admin123").clickLoginBtn()
				.clickOnWelcome().clickOnLogOut().getLoginPageTitle();

		System.out.println(actualTitle);

		Assertions.assertThat(actualTitle).isNotEmpty().isEqualTo("OrangeHRM");

	}
}
