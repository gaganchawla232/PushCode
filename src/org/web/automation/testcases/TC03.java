package org.web.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC03 {

	@Test
	public void testCase3() {
		System.setProperty("webdriver.ie.driver", "./DriverExecutable/IEDriverServer.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://www.carnival.com/");	
SoftAssert sf=new SoftAssert();	

WebElement element=driver.findElement(By.linkText("Create Account"));

sf.assertTrue(driver.getTitle().contains("Cruises | Carnival Cruise Deals"));
sf.assertTrue(element.isDisplayed());
sf.assertTrue(element.isEnabled());
element.click();
sf.assertTrue(driver.getCurrentUrl().contains("/guestmanagement/registration/enroll"));


sf.assertAll();
	
	}
	
}