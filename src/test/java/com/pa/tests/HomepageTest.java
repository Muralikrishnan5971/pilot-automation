package com.pa.tests;

import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pa.factory.DriverManager;

public final class HomepageTest extends BaseTest {

	private HomepageTest() {

	}

	/*
	 * Validate title is containing Google Search or google search Validate title is
	 * not null and the length of title is greater than 15 and less than 100 Check
	 * for the links in the pages
	 */

	@Test
	public void test01() {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation - youtube", Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();

		Assert.assertTrue(Objects.nonNull(title));
		Assert.assertTrue(title.toLowerCase().contains("google search"));
		Assert.assertTrue(title.length() > 15);
		Assert.assertTrue(title.length() < 100);

		List<WebElement> webElements = DriverManager.getDriver().findElements(By.xpath("//a/h3"));
		Assert.assertEquals(webElements.size(), 15);

		boolean isElementPresent = false;

		for (WebElement e : webElements) {

			System.out.println(e.getText());
			if (e.getText().equalsIgnoreCase("Make Money on Youtube with YTA Method - Jump Street")) {
				isElementPresent = true;
				break;
			}
		}

		Assert.assertTrue(isElementPresent, "Expected Element NOT found");

	}
}
