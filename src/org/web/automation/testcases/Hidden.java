package org.web.automation.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.web.automation.base.DriverInitials;

public class Hidden extends DriverInitials {

	@Test
	public void hidden(){
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='jazoest' and @value='2624']"));
		
		System.out.println("find");
	}
}
