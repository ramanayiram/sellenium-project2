package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Methods {

	public static void main(String [] args) {
	

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();	
      driver.get("https://www.facebook.com/");       
       driver.manage().window().maximize();  
            
       WebElement emailid = driver.findElement(By.id("email"));	
	  emailid.sendKeys("raman.rpudur@gmail.com");
	  
	  String attribute = emailid.getAttribute("name");	
	  System.out.println(attribute);
	  
	  String attribute2 = emailid.getAttribute("value");	  
	  System.out.println(attribute2);
	  
	  boolean displayed = emailid.isDisplayed();	   
	  System.out.println(displayed);
	  
	  
	  WebElement password = driver.findElement(By.name("pass"));	
	password.sendKeys("123456");
	
      boolean enabled = password.isEnabled();	
	System.out.println(enabled);
	
	WebElement loginbutton = driver.findElement(By.name("login"));
	
	boolean selected = loginbutton.isSelected();	
	System.out.println(selected);	
	
	}	
	
}
