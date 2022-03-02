package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		WebElement Button1 = driver.findElement(By.xpath("(//button)[1]"));
		Button1.click();
		
		Thread.sleep(2000);
		
		// Alert Interface [Main Note] & Normal Alert Example
		Alert NormalAlertButton =  driver.switchTo().alert();
		NormalAlertButton.accept();
		
		
		
		WebElement Button2 = driver.findElement(By.xpath("(//button)[2]"));
		Button2.click();
		
		Thread.sleep(2000);
		
		// Alert Interface [Main Note]  & Confirm Alert Example [is yes/no option like]
		Alert ConfirmAlertButton =  driver.switchTo().alert();			
		//ConfirmAlertButton.accept(); // ok (yes)
		ConfirmAlertButton.dismiss(); // cancel(No)
		
		
		WebElement Button3 = driver.findElement(By.xpath("(//button)[3]"));
		Button3.click();
		
		Thread.sleep(2000);
		
		// Alert Interface [Main Note]  & Confirm Alert Example [is yes/no option like]
		Alert PormotAlertButton =  driver.switchTo().alert();
		String Text = PormotAlertButton.getText();
		System.out.println(Text);
		PormotAlertButton.sendKeys("Raman");
		PormotAlertButton.accept(); // ok (yes)
		//PormotAlertButton.dismiss(); // cancel(No)
		
		
		


	}

}
