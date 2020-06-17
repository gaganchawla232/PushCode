package org.web.automation.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.web.automation.base.DriverInitials;
import org.web.automation.pages.Login;

public class DataDriven extends DriverInitials {
	
	@Test(dataProvider="dp1")
	public void logindata(String a,String b) throws IOException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*driver.findElement(By.name(ConfigReader.ElementLocator("Register_username_name"))).sendKeys("gagan");
		Scroll.scrollDown(driver);
		Screen.takeScreenshot(driver,"gagan2");*/
		//Login login=new Login(driver);
		
		Login login=PageFactory.initElements(driver, Login.class);
		
		login.enterName(a);
		login.enterPassword(b);

	}
	
	@DataProvider(name="dp1")
	public Object[][] dataProvider() {
		Object arr[][]= {
				{"abc","123"},
				{"def","124"},
				{"ghi","125"}
		};
				return arr;
			}
}