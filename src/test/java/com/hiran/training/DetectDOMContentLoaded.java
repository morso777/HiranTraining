package com.hiran.training;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DetectDOMContentLoaded {
	
	
		 @Test
			public static void main(String[] args)throws InterruptedException {				 
				 		 	
				 String url= "https://www.google.com"; 
				 					
			     WebDriver driver;
				 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");	
				 driver = new ChromeDriver ();				
				 
				 //open url
				 driver.get(url);
				 driver.manage().window().maximize();
				  JavascriptExecutor executor =((JavascriptExecutor) driver);
        var script = "window.addEventListener('DOMContentLoaded', (event) => {" +
                "    console.log('DOM fully loaded and parsed');" +
                "});"+
                "try{window.performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {};" +
                "return(parseInt(window.performance.timing.domContentLoadedEventEnd)-parseInt(window.performance.timing.navigationStart));}catch(e){alert(e);}";
      
         executor.executeScript(script,"");

    }
	
	
	

}
