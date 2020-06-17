package org.web.automation.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC04 {
	
	@Test
	public void Testcase4() {
		System.setProperty("webdriver.ie.driver", "./DriverExecutable/IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver();
	driver.get("http://www.carnival.com/");
	driver.manage().window().maximize();
	SoftAssert sf=new SoftAssert();
	sf.assertTrue(driver.getTitle().contains("Cruises | Carnival Cruise Deals"));
	Set<String> windows1=driver.getWindowHandles();
	System.out.println("window1="+windows1);
	WebElement element=driver.findElement(By.linkText("Login"));
	sf.assertTrue(element.isEnabled());
	
	Actions act=new Actions(driver);
	act.contextClick(element);
		
driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);	
Set<String> windows=driver.getWindowHandles();
System.out.println("window2="+windows);
WebDriverWait wait=new WebDriverWait(driver, 300);
wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("username"))));

sf.assertTrue(driver.findElement(By.id("username")).isDisplayed());

	WebElement password=driver.findElement(By.id("password"));
	sf.assertTrue(password.isDisplayed());
	
	driver.findElement(By.xpath("//button[contains(text(),'LOG IN!')]")).isEnabled();
	
	driver.findElement(By.id("username")).sendKeys("chawlagagan123@gmail.com");
	password.sendKeys("gG@9716625679");	
	
	driver.findElement(By.xpath("//button[contains(text(),'LOG IN!')]")).click();
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Logout"))));
	sf.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	sf.assertTrue(driver.findElement(By.linkText("Logout")).isEnabled());
	
	sf.assertAll();
	}}