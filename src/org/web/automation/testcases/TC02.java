package org.web.automation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.web.automation.base.DriverInitials;

public class TC02 {
	
	@Test
	public void Tc02() {
		System.setProperty("webdriver.ie.driver", "./DriverExecutable/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);		
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		driver.get("http://www.carnival.com/");
		WebDriverWait ex=new WebDriverWait(driver, 90);

		//WebDriverWait wait=new WebDriverWait(driver, 60);
		
//wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@class='vifp-close']")));
		
	//	driver.findElement(By.xpath("//div[@class='vifp-close']")).click();
		
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(driver.getTitle().contains("Cruises | Carnival Cruise Deals"), "Title is not correct");
		sf.assertTrue(driver.findElement(By.xpath("//span[text()='Plan']")).isEnabled(), "Plan link is disabled");
				
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//span[text()='Plan']"))).perform();
	sf.assertTrue(driver.findElement(By.xpath("//span[text()='Plan']")).isEnabled(), "//p[text()='Find a Cruise']");
	driver.findElement(By.xpath("//span[text()='Plan']")).click();
//	Assert.assertEquals(driver.getCurrentUrl(), "https://www.carnival.com/cruise-search");
	
	sf.assertTrue(driver.getCurrentUrl().contains("cruise-search"));

//	WebDriverWait ex=new WebDriverWait(driver, 30);
ex.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Sail To']"))));
	driver.findElement(By.xpath("//span[text()='Sail To']")).click();
	ex.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(),'The Bahamas')]"))));

	System.out.println(driver.findElement(By.xpath("//button[contains(text(),'The Bahamas')]")).getText());
	driver.findElement(By.xpath("//button[contains(text(),'The Bahamas')]")).click();
	
	driver.findElement(By.xpath("//span[text()='Sail From']")).click();
	
	System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Baltimore, MD')]")).getText());

//ex.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(),'Seattle, WA')]"))));

	driver.findElement(By.xpath("//button[contains(text(),'Baltimore, MD')]")).click();
	
	ex.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Dates')]"))));
	driver.findElement(By.xpath("//span[contains(text(),'Dates')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'Nov')]")).click();

	driver.findElement(By.xpath("//span[contains(text(),'Duration')]")).click();
	
	driver.findElement(By.xpath("//button[contains(text(),'6 - 9 Days')]")).click();
	
	sf. assertAll();
	
	
	}
}