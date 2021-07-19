package com.factory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage (WebDriver ldriver) {
		this.driver= ldriver;
	}


	@FindBy (id ="usernameOrEmail")
	WebElement user;
	

	@FindBy (how=How.XPATH, using  ="//div/div/button[@type='submit']")
	WebElement submit;

	public void login (String uid, String pass) {
		user.sendKeys(uid);
		submit.click();
	}
	
}
