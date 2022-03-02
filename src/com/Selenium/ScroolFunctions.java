package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolFunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Maven_project\\Driver2\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement spain = driver.findElement(By.xpath("//a[text()='Spain']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",spain);
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-3000)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,3000)");
		
		
		
		
		
		
	}

}
