package web.automation.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader   {

public static String configReader(String keyname) throws IOException {//have made method as static so as not to make object of class to call this method
File f=new File("./ConfigFiles/ProjectConfig.properties");	
FileReader fr = new FileReader(f);
Properties prop=new Properties();
prop.load(fr);
return prop.getProperty(keyname).trim();
	}

public static String ElementLocator(String keyname) throws IOException {//have made method as static so as not to make object of class to call this method
File f=new File("./ConfigFiles/ElementLocator.properties");	
FileReader fr = new FileReader(f);
Properties prop=new Properties();
prop.load(fr);
return prop.getProperty(keyname).trim();
	}
}