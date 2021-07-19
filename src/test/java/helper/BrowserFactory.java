package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser (String browserName, String url)
	{
		if (browserName.equalsIgnoreCase ("chrome"))
			{ 
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver= new ChromeDriver();	
			driver.get(url);
			driver.manage().window().maximize();	
			}
	
	
	return driver;
	}
}

