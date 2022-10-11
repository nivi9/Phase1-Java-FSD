package com.simplilearn.testing.Session3TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	
	WebDriver driver=null;
	SoftAssert soft=null;
  @Test
  public void TitleTest() {
	  
	  //testcase
	  driver.get("https://www.google.com/");
	  System.out.println(driver.getTitle());
	  
	  soft.assertEquals(driver.getTitle(), "Google");
	  soft.assertAll();
	  
	 // driver.close();
  }
  
  @BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Phase5 Selenium\\chrome driver\\chromedriver.exe");
		driver= new ChromeDriver();
		soft= new SoftAssert();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
}