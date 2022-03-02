package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		
		//Single Alert
		
		WebElement Button1 = driver.findElement(By.xpath("(//button)[1]"));
		Button1.click();

		Alert singleAlert = driver.switchTo().alert();
		
		singleAlert.accept();		
		Thread.sleep(2000);
		
		//Confirm Alert
		
		WebElement Button2 = driver.findElement(By.xpath("(//button)[2]"));		
		Button2.click();
		
		Thread.sleep(2000);
		Alert ConfirmAlert = driver.switchTo().alert();
		
		ConfirmAlert.accept();
		//ConfirmAlert.dismiss();
		
		//Prompt Alert
		
	    WebElement Button3 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		
		Button3.click();
		
		Thread.sleep(2000);
		Alert PromptAlert = driver.switchTo().alert();
		
		String text = PromptAlert.getText();
		
		System.out.println(text);
		
		PromptAlert.sendKeys("raman");
		
		PromptAlert.accept();
		
		
	}

}
