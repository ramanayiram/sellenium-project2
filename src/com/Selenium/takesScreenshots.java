package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takesScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", 
	      "C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");	
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot TS=(TakesScreenshot) driver;
		
		File src = TS.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\ScreenShots\\flipkart.png");
		
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
