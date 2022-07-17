package com.hiran.training;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookie {
	
	 @Test
		public static void main(String[] args)throws InterruptedException {			 
			 		 	
			 String url= "https://www.google.com";		 
			 						
		     WebDriver driver;
			 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");	
			 driver = new ChromeDriver ();			
			 
			 //open url
			 driver.get(url);
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
			 Set<org.openqa.selenium.Cookie> allCookies= driver.manage().getCookies();
			 
			 //Set<Cookie> allCookies= driver.manage().getCookies();
			 System.out.println("Count ofcookies = " + allCookies.size());
			 
			 for (org.openqa.selenium.Cookie cookie: allCookies) {
				 System.out.println ("Name   = "+ cookie.getName());
				 System.out.println ("Domain = "+ cookie.getDomain());
				 System.out.println ("Path   = "+ cookie.getPath());
				 System.out.println ("Value  = "+ cookie.getValue());
				 System.out.println ("====================================");				 
				 driver.manage().deleteAllCookies();
				 
				 Set<org.openqa.selenium.Cookie> afterDel= driver.manage().getCookies();
				 System.out.println("Count of cookies after delete is = " + afterDel.size());
				 				 
			 }
	 }
	 
	 
	
}
