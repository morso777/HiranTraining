package com.hiran.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public  void google ()throws InterruptedException {			 
		 		 	
		 String url= "https://www.google.com";		 
		 						
	     WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");	
		 driver = new ChromeDriver ();			
		 
		 //open url
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		 
			 driver.quit();				 
		 }
 
 
 
 @Test
	public void facebook ()throws InterruptedException {			 
		 		 	
		 String url= "https://www.facebook.com";		 
		 						
	     WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");	
		 driver = new ChromeDriver ();			
		 
		 //open url
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		
			 driver.quit();			 
		 }
 
 @Test
	public  void twitter ()throws InterruptedException {			 
		 		 	
		 String url= "https://twitter.com";		 
		 						
	     WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");	
		 driver = new ChromeDriver ();			
		 
		 //open url
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		 
			 driver.quit();				 
		 }



@Test
	public void hotmail ()throws InterruptedException {			 
		 		 	
		 String url= "https://outlook.live.com";		 
		 						
	     WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");	
		 driver = new ChromeDriver ();			
		 
		 //open url
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		
			 driver.quit();			 
		 }
	
}
