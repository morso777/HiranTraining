package com.hiran.training;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreInfo {
	public static void main(String[] args) throws IOException  {
		
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");	
		 driver = new ChromeDriver ();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	    WebElement table;

	    WebDriverWait wait = new WebDriverWait(driver, 3);
	    table = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]")));
	                                                                               
	    String dataoutput;
	    dataoutput = table.getText();
	    System.out.println(dataoutput);

	    String csvOutputFile = "table.csv";

	    try(FileWriter writecsv = new FileWriter("src/main/resources/File/table.csv")) {
	        writecsv.append(dataoutput);
	    }

	}
	
}
