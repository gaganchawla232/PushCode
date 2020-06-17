package org.web.automation.testcases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.web.automation.assertions.BrowserRelatedVerification;
import org.web.automation.base.DriverInitials;
import org.web.automation.pages.Login;

import web.automation.utility.ConfigReader;
import web.automation.utility.Screen;
import web.automation.utility.Scroll;

public class TC_001_Login_Logout_Valid_Credentials extends DriverInitials {
	@Test
		public void login() throws IOException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.findElement(By.name(ConfigReader.ElementLocator("Register_username_name"))).sendKeys("gagan");
		Scroll.scrollDown(driver);
		Screen.takeScreenshot(driver,"gagan2");*/
		//Login login=new Login(driver);
		
		Login login=PageFactory.initElements(driver,Login.class );
		
		login.enterName("chawlagagan123@gmail.com");
		login.enterPassword("gG@9716625679");
login.enterAddress("C-14/A,Golden Park");
login.enterGenderName("2");
login.enterPhoneNumber("9716625679");
login.selectCheckbox();
login.selectSignUpButton();

	//BrowserRelatedVerification.VerifyURL(driver, expectedResult, name);
	BrowserRelatedVerification.verifyTextOnPage(driver, "gagan", "screen2");
		
	}}