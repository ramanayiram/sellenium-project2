package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.instagram.com/?hl=en");
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	

	 
	driver.navigate().to("https://www.youtube.com/");
	
	driver.navigate().back();       //instagram
	
	driver.navigate().forward();    //youtube
	
	String currentUrl = driver.getCurrentUrl();
	
	System.out.println("Current url :"+currentUrl);
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	driver.close();
	
}



}
