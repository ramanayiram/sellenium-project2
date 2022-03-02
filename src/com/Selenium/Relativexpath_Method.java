package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement EmailId  = driver.findElement(By.xpath("//input[@id = 'email']"));
		EmailId.sendKeys("Sudhaesakki@gmail.com");
		
		
		WebElement Password = driver.findElement(By.xpath("//input[@name= 'pass']"));
		Password.sendKeys("Adhus@98");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name= 'login']"));
		loginbutton.click();

	}

}
