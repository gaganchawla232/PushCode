package org.web.automation.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import web.automation.utility.ConfigReader;

public class Login {

	WebDriver driver=null;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(name="(ConfigReader.ElementLocator(\"Register_my_name\"))")
	WebElement name;
		
	@FindBy(name="ConfigReader.ElementLocator(\"Register_password_name\"))")
	WebElement password;
	
	@FindBy(id="ConfigReader.ElementLocator(\"Register_DOB_id\"))")
	WebElement dob;
	
	@FindBy(name="ConfigReader.ElementLocator(\"Register_phone_name\"))")
	WebElement phone;
	
	@FindBy(name="ConfigReader.ElementLocator(\"Register_Address_name\"))")
	WebElement address;
	
	@FindBy(name="ConfigReader.ElementLocator(\"Register_Gender_name\"))")
	WebElement gender;
	
	@FindBy(name="ConfigReader.ElementLocator(\"Register_checkbox_name\"))")
	WebElement checkBox;
	
	@FindBy(name="ConfigReader.ElementLocator(\"Register_signup_xpath\"))")
	WebElement signUpButtom;
	
	public void enterName(String uname) throws IOException {
		
		name.sendKeys(uname);
	}
	
	public void enterPassword(String pass) throws IOException {
		password.sendKeys(pass);

	}

	public void dob(String dobValue) throws IOException {
		dob.sendKeys(dobValue);

	}

	public void enterPhoneNumber(String phoneNumber) {
		phone.sendKeys(phoneNumber);
				}

public void enterAddress(String add) {
	address.sendKeys(add);
}
	
public void enterGenderName(String gend) {
	Select sel=new Select(gender);
	sel.selectByValue(gend);
}

public void selectCheckbox() {
	checkBox.click();
}

public void selectSignUpButton() {
	signUpButtom.click();
	}}
