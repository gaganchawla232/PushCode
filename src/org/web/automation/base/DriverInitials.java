package org.web.automation.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.web.automation.listener.ListenerImplementation;
import org.web.automation.testcases.DataDriven;

import bsh.BshClassManager.Listener;
import web.automation.utility.ConfigReader;

public class DriverInitials {
	
public	WebDriver driver1;
public EventFiringWebDriver driver;
	@BeforeMethod
    public void startBrowser() throws IOException {
		if ((ConfigReader.configReader("application_browser")).equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "./DriverExecutable/chromedriver.exe");
			 driver1=new ChromeDriver();
			
		}
		else if((ConfigReader.configReader("application_browser")).equalsIgnoreCase("firefox"))
		{			
			System.setProperty("webdriver.gecko.driver", "./DriverExecutable/geckodriver.exe");
			 driver1=new FirefoxDriver();
			
		}
		else if((ConfigReader.configReader("application_browser")).equalsIgnoreCase("IE"))
		{			
			System.setProperty("webdriver.ie.driver", "./DriverExecutable/IEDriverServer.exe");
			 driver1=new InternetExplorerDriver();
			
		}
		
	driver=new EventFiringWebDriver(driver1);
		ListenerImplementation listener=new ListenerImplementation();
		driver.register(listener);
		
		driver.manage().window().maximize();
			driver.get(ConfigReader.configReader("application_url"));
}
	
	/*@AfterMethod
	public void closeBrowser() {
		driver.close();
		
	}*/

}