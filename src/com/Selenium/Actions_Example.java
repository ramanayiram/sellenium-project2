package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Example {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		//click
		
		 WebElement button1 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		
		Actions ac=new Actions(driver);
		
		ac.click(button1).build().perform();
		
		//contextClick - rightClick
		
		WebElement button2 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		
		ac.contextClick(button2).build().perform();
		
		//doubleClick
		
		WebElement button3 = driver.findElement(By.id("doubleClickBtn"));
		
		ac.doubleClick(button3).build().perform();
		
		TakesScreenshot Ts=(TakesScreenshot) driver;
		
		File src = Ts.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\ScreenShots\\buttons.png");
		
		//moveToElement
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		WebElement saffola = driver.findElement(By.xpath("//img[contains(@alt,'Saffola')]"));
		
		ac.moveToElement(saffola).build().perform();
		
		File src1 = Ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\ScreenShots\\moveto.png");
		
		//dragAndDrap
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
	    WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(drag, drop).build().perform();
		
		File src2 = Ts.getScreenshotAs(OutputType.FILE);
		File dest2 =new File("C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\ScreenShots\\dragAndDrap.png");
		
		FileUtils.copyFile(src, dest);
		FileUtils.copyFile(src1, dest1);
		FileUtils.copyFile(src2, dest2);
		
	}

}
