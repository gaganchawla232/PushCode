package org.web.automation.assertions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import web.automation.utility.Screen;

public class BrowserRelatedVerification2 {

	public static void VerifyURL(WebDriver driver,String expectedResult,String name) throws IOException {
		Screen.takeScreenshot(driver, name);
		Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(expectedResult), "Error-URL is not matched");
		}
	
		public static void Verifytitle(WebDriver driver,String expectedResult,String name) throws IOException {
		Screen.takeScreenshot(driver, name);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase(expectedResult), "Error-Title is not matched");
		}
		public static void verifyTextOnPage(WebDriver driver,String expectedText,String name) throws IOException {
			Screen.takeScreenshot(driver, name);
			Assert.assertTrue(driver.getPageSource().contains(expectedText), "Text is not found on page");
			}		


}