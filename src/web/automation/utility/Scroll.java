package web.automation.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {

	public static void scrollDown(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,800);","");
		
		
	}
	
	
}
