package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singledropdown_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement CreateAccount = driver.findElement(By.xpath("(//a[@role = \"button\"])[2]"));
		CreateAccount.click();
	   Thread.sleep(2000);
	   
	   
	    // SingleDropdown [Note : select  >> Class] 
	   
	   // Using id Locator & selectbyValue Method
	   
	   WebElement day = driver.findElement(By.id("day"));
	   
	   Select s = new Select(day);
	   
	   s.selectByValue("15");
	   
	   // using name Locator & Selectbyindex Method
	   
	   WebElement Month = driver.findElement(By.name("birthday_month"));
	   
	   Select s1  = new Select(Month);
	   
	   s1.selectByIndex(5);
	   
	   
	   //Using Xpath Locator & SelectbyVisibleText Method
	   
	   WebElement Year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
	   
	   Select s2 = new Select(Year);
	   
	   s2.selectByVisibleText("1998");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
		
		
		

	}

}
