package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	    // Implicit  Wait 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement EmailId = driver.findElement(By.id("email"));  // id attribute
		EmailId.sendKeys("Raman.A@gmail.com");
		
		// Explicit  Wait
	
		WebElement Password = driver.findElement(By.name("pass")); 
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOf(Password));

		Password.sendKeys("12345");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		login.click();
		
		
	
	
		
	

	}

}
