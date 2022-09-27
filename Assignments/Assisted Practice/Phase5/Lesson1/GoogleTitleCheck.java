package com.selenium.demo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleCheck {
	
	public static void main(String[] args) {
		
				//STEP:1 declare a path
				String path= "C:\\Program Files\\Phase5 Selenium\\chrome driver\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
				//STEP:2 initialize the webdriver
				WebDriver driver= new ChromeDriver();
				
				
				//STEP:3 give the base url
				String url="http://www.google.com";
				driver.get(url);
			
				System.out.println("Title:"+driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				assertEquals("Google", driver.getTitle());
				
				driver.close();
		
	}

}