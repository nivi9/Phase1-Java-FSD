package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateRegP5P1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Phase5 Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name=driver.findElement(By.id("id_name"));
		name.sendKeys("Nive");
		
		//email
		WebElement email=driver.findElement(By.id("id_email"));
		email.sendKeys("nive@gmail.com");
		
		//mobile
		WebElement mobile=driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("9843516660");
		
		//password
		WebElement password=driver.findElement(By.id("id_password"));
		password.sendKeys("Nive@123");
		
		//button
		WebElement register=driver.findElement(By.cssSelector("#registerButton"));
		register.click();
		
		//login button
		WebElement login=driver.findElement(By.cssSelector("#loginContainer"));
		login.click();
		
		 //login email
		 WebElement Email=driver.findElement(By.id("id_email_login"));
		 Email.sendKeys("nivekamal@gmail.com");
		 
		//password
		WebElement Password=driver.findElement(By.id("id_password"));
		Password.sendKeys("Nive@123");
		
		//button
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"cndidate_login_widget\"]/form/ul[2]/li[4]/div/button"));
		Login.click();
		
	} 

}