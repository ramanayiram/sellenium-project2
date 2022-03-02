package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		//Single Frame
		
		driver.switchTo().frame("singleframe");
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Raman");
		
		driver.switchTo().defaultContent();
		
		//Multiple Frame
		
		WebElement multiFramebutton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));		
		multiFramebutton.click();
		
		WebElement firstframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));		
		driver.switchTo().frame(firstframe);
		
		WebElement secondframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));		
		driver.switchTo().frame(secondframe);
		
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));		
		textbox2.sendKeys("srirengan");
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
	}

}
