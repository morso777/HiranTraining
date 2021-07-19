package com.factory.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.factory.pages.LoginPage;

import helper.BrowserFactory;

public class VerifyValidLogin {
	
	
	
	@Test
	public void checkValidUser() {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://wordpress.com/log-in");
		
		LoginPage login_page =PageFactory.initElements(driver,LoginPage.class);
		login_page.login("admin","123");
	}

}
