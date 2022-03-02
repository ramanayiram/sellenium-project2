package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");		
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
		
		mail.sendKeys("raman.rpudur@gmail.com");
		
		WebElement passward = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/div/input"));
		
		passward.sendKeys("12345");
		
		WebElement login = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div[2]/button"));
		
		login.click();
		
		
	}

}
