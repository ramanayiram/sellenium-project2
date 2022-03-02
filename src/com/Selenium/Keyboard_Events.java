package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Events {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver,chrome.driver",
			System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions ac=new Actions(driver);
		
		ac.contextClick(gmail).build().perform();
		
		Robot
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
