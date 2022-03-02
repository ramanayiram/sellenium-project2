package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mini_project {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		
		login.click();
			
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		email.sendKeys("raman.rpudur1@gmail.com");
		
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		
		create.click();
		
		WebElement gen= driver.findElement(By.name("id_gender"));
		
	    gen.click();
		
		
	   WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		firstname.sendKeys("Raman");
		
		
         WebElement lastname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
	     lastname.sendKeys("A");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		
		pass.sendKeys("raman123");		
		
		
		WebElement day = driver.findElement(By.id("days"));
		
		Select s=new Select(day);
		
		s.selectByIndex(24);
		
		WebElement month = driver.findElement(By.id("months"));
		
		Select s1=new Select(month);
		
		s1.selectByValue("1");
		
		WebElement year = driver.findElement(By.id("years"));
		
		Select s2=new Select(year);
		
		s2.selectByValue("1988");
		
		WebElement nl = driver.findElement(By.id("newsletter"));
		
		nl.click();
		
		WebElement op = driver.findElement(By.id("optin"));
		
	     op.click();
	     
	     WebElement company = driver.findElement(By.id("company"));
	     
	     company.sendKeys("apple");
	     
	     WebElement address = driver.findElement(By.name("address1"));
	     
	     address.sendKeys("greenbriarbluff ave, serenity haven st");
	     
	     WebElement address2 = driver.findElement(By.id("address2"));
	     
	     address2.sendKeys("3738,3rd floor");
	     
	     WebElement city = driver.findElement(By.name("city"));
	     
	     city.sendKeys("Las Vegas");
	     
	     WebElement state = driver.findElement(By.name("id_state"));
	     
	     Select s3=new Select(state);
	     
	     s3.selectByValue("28");
	     
	     WebElement zipcode = driver.findElement(By.id("postcode"));
	     
	     zipcode.sendKeys("89101");
	     
	     WebElement country = driver.findElement(By.name("id_country"));
	     
	     Select s4=new Select(country);
	     
	     s4.selectByValue("21");
	     
	     WebElement hphone = driver.findElement(By.id("phone"));
	     
	     hphone.sendKeys("044-62522");
	     
	     WebElement mobile = driver.findElement(By.name("phone_mobile"));
	     
	     mobile.sendKeys("9080208124");
	     
	     WebElement alias = driver.findElement(By.name("alias"));
	     
	     alias.sendKeys("las vegas");
	     
	     WebElement register= driver.findElement(By.id("submitAccount"));
	     
	     register.click();
	     
	     TakesScreenshot Ts=(TakesScreenshot) driver;
	     
	     File src = Ts.getScreenshotAs(OutputType.FILE);
	     
	     File dest = new File("C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\ScreenShots\\project.png");
		
	     FileUtils.copyFile(src, dest);
	}

}
