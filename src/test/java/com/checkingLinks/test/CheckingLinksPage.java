package com.checkingLinks.test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckingLinksPage {

private WebDriver driver;

public CheckingLinksPage (WebDriver driver){
	this.driver =driver;
		
}

public boolean checkingPAgeLinks(){
	List<WebElement> links = driver.findElements(By.tagName("a"));
	//List<WebElement> links1 = driver.findElements(By.tagName("a"));
	String url= "";
	List<String> brokenLinks= new ArrayList<String>();// Creamos una lista de string alias : Brokenlinks
	List<String>okLinks= new ArrayList<String>();//Creamos una lista de string alias : okLinks
	
	HttpURLConnection httpConection = null;
	int responseCode = 200;
	Iterator<WebElement> it =  links.iterator();
	//Iterator <WebElement> it = links.iterator();
	while (it.hasNext()){
		url=it.next().getAttribute("href");
		if (url==null || url.isEmpty()){
			System.out.println("url + url is not configured or it is empty");
			continue;
			
		}
		try {
			httpConection = (HttpURLConnection)(new URL(url).openConnection());
			httpConection.setRequestMethod("HEAD");
			httpConection.connect();
			responseCode=httpConection.getResponseCode();
		    if (responseCode>400){
		    	System.out.println("ERROR BROKEN LINK: --" + url);
		    	brokenLinks.add(url);
		    
		}else{
			System.out.println ("VALID LINK:-- " + url);
			okLinks.add(url);
		}
		} catch (Exception e){
		e.printStackTrace();
		}
	}
	
		System.out.println("Valid Links"+okLinks.size());
		System.out.println("Invalid Links"+brokenLinks.size());
		if (brokenLinks.size()>0){
			System.out.println("******ERRROR--------------------- Broken Links");
				for (int i= 0; i<brokenLinks.size(); i++){
					System.out.println(brokenLinks.get(i));
					}
			return false;
		}else{
		    return true;
		    	
			}
		}
     }

