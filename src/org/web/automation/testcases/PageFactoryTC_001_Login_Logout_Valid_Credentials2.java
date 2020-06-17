package org.web.automation.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.web.automation.assertions.BrowserRelatedVerification;
import org.web.automation.base.DriverInitials;
import org.web.automation.pages.Login;

import web.automation.utility.ConfigReader;
import web.automation.utility.Screen;
import web.automation.utility.Scroll;

public class PageFactoryTC_001_Login_Logout_Valid_Credentials2 extends DriverInitials {
	@Test
		public void login() throws IOException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.findElement(By.name(ConfigReader.ElementLocator("Register_username_name"))).sendKeys("gagan");
		Scroll.scrollDown(driver);
		Screen.takeScreenshot(driver,"gagan2");*/
		Login login=new Login(driver);
		
		login.enterName("chawlagagan123@gmail.com");
		login.enterPassword("gG@9716625679");

/*driver.findElement(By.name(ConfigReader.ElementLocator("Register_confirm_password_name"))).sendKeys("gG@9716625679");
		driver.findElement(By.id(ConfigReader.ElementLocator("Register_DOB_id"))).sendKeys("10/12/1991");
		driver.findElement(By.name(ConfigReader.ElementLocator("Register_phone_name"))).sendKeys("9716625679");
		driver.findElement(By.name(ConfigReader.ElementLocator("Register_Address_name"))).sendKeys("Delhi");
		driver.findElement(By.xpath(ConfigReader.ElementLocator("Register_Address_type_xpath"))).click();
		Select sel=new Select(driver.findElement(By.name(ConfigReader.ElementLocator("Register_Gender_name"))));
		sel.selectByValue("1");
		driver.findElement(By.name(ConfigReader.ElementLocator("Register_checkbox_name"))).click();
		driver.findElement(By.xpath(ConfigReader.ElementLocator("Register_signup_xpath"))).click();
		//	BrowserRelatedVerification.VerifyURL(driver, expectedResult, name);*/
		
	}
	
}