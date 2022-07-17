package com.hiran.training;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Array {

	
	@Test
	public  void google ()throws InterruptedException {			 
		 		 	
		 String url= "https://www.samplelist.com/";		 
		 						
	     WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");	
		 driver = new ChromeDriver ();			
		 
		 //open url
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
		 
		 List<WebElement> list= driver.findElements(By.xpath("//ul[@class='product_grid_small']//li"));
		 System.out.println(list);
		 
		 		

		 Iterator<WebElement> iter = list.iterator();

		 while(iter.hasNext()) {
		     WebElement we = iter.next();
		     WebElement price=we.findElement(By.xpath("div[@class='product_price']"));
		     
		     System.out.println(price.getText());		 

		     if (price.getText().contains("$")) {
		    	 System.out.println("si tiene precio");	
		    	 we.click();
		    	 break;
		    }else {		    	
		    	 System.out.println("No tiene precios");		    	 
		     }		    
		 }
		 
		driver.quit();				 
	 }
 
}
