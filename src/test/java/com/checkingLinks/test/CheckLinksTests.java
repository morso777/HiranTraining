package com.checkingLinks.test;


import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertTrue;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CheckLinksTests {
  WebDriver driver;
  CheckingLinksPage page;
  
  	String urlDEV ="https://www.dev.finning.com/en_CA/products/used/product-category/product-family.html?type=20";
	
	String urlUAT= "https://www.uat.finning.com/en_CA/products/used/product-category/product-family.html?type=20";
	
	
  @BeforeClass
  public void beforeClass(){
			  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			  driver = new ChromeDriver ();
			  page = new CheckingLinksPage(driver);	
			  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS) ;
			  			      
			  driver.get(urlDEV);
				             
				
			  driver.manage().window().maximize() ;
	}
  
	@Test
    public void checkingLinks () {
	assertTrue(page.checkingPAgeLinks(), "There are broken links");
	  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
