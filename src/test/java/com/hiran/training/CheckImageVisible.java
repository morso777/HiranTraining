package com.hiran.training;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Dimension;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckImageVisible {
	
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
			
			 WebElement img = driver.findElement(By.cssSelector("textarea[class='csi']"));
			    assertEquals("none", img.getCssValue("display"));
			    System.out.println ("Image 1 displayed");
			    
			    //assertTrue(driver.findElement(By.cssSelector("textarea[class='csi']")).isDisplayed());
			    //System.out.println ("Image 2 displayed");
			    
			    assertTrue(driver.findElement(By.cssSelector("img[class='lnXdpd']")).isDisplayed());
			    System.out.println ("Image 3 displayed");
			    
			    WebElement i=driver.findElement(By.cssSelector("img[class='lnXdpd']"));
			    Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
			    
			    if (p) {
			         System.out.println("Logo present");
			      } else {
			         System.out.println("Logo not present");
			      }
			      driver.quit();
			   
			    //driver.manage().window().setSize(new Dimension(92, 272));
			    //System.out.println(img.isDisplayed()); 
			    
				 
			 }

	 

}
