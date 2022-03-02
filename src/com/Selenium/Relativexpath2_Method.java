package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath2_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@autocapitalize='off']"));
		
		username.sendKeys("raman.rpudur@gmail.com");
		
		WebElement passward = driver.findElement(By.xpath("//input[@name='password']"));		
		
		passward.sendKeys("12345");
		
	
		
		
		
		
		
	}

}
