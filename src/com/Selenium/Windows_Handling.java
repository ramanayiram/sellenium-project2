package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		Actions ac=new Actions(driver);
		
		ac.contextClick(electronics).build().perform();
		
		Robot r=new Robot();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
