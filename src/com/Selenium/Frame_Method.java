package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//single Frame
		driver.switchTo().frame("singleframe");
		
		WebElement singleframetext = driver.findElement(By.xpath("//input[@type='text']"));
		singleframetext.sendKeys("text");
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		WebElement singleframetext1 = driver.findElement(By.xpath("//input[@type='text']"));
		singleframetext1.sendKeys("text");
		
		
		driver.switchTo().defaultContent();
		
		// Multiple frame
		
		WebElement MultiFrameButton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		MultiFrameButton.click();
		
		WebElement FristFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(FristFrame);
		
		WebElement SecondFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(SecondFrame);
		
		WebElement multisframetext = driver.findElement(By.xpath("//input[@type='text']"));
		multisframetext.sendKeys("Lusu Raman");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		

	}

}
