package com.checkingLinks.test;


import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CheckLinksTests {
  WebDriver driver;
  CheckingLinksPage page;
	
  @BeforeClass
  public void beforeClass(){
			  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			  driver = new ChromeDriver ();
			  page = new CheckingLinksPage(driver);
			  driver.get("https://www.facebook.com");
			  //driver.get("http://newtours.demoaut.com/");
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
