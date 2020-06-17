package web.automation.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen {
	
	public static void takeScreenshot(WebDriver driver,String name ) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;   //downcasting
	File f1= ts.getScreenshotAs(OutputType.FILE);
	File f2= new File("./Image/"+name+".png");
	
	FileUtils.copyFile(f1,f2);
	
	
		
	}}