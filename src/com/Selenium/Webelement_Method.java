package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webelement_Method {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//SendKey Method
		
		//WebElement EmailId = driver.findElement(By.id("email"));  // id attribute
		//EmailId.sendKeys("Raman.A@gmail.com");
		
		
		//WebElement Password = driver.findElement(By.name("pass"));  // Name attribute
		//Password.sendKeys("Raman1234");
		
		
		//click
		
		//WebElement LoginButton = driver.findElement(By.name("login"));
		//LoginButton.click();   // Isdisabled Execute Error Throw Message : element is not attached to the page document (Reason Refersh)
		
		
		
		//isDisplayed
		WebElement EmailId1 = driver.findElement(By.id("email"));  // id attribute
		EmailId1.sendKeys("Raman.A@gmail.com");
		boolean displayed = EmailId1.isDisplayed();
		System.out.println("EmailId is Displayed : " + displayed);
		
		//isEanbled
		
		WebElement Password1 = driver.findElement(By.name("pass"));
		Password1.sendKeys("Raman1234");
		boolean Enabled = Password1.isEnabled();
		System.out.println("Password is Enabled : " + Enabled);
		
		//isSelected  [Note : Selection Option only Used (eg: checkbox,dropdown,listbox)]
		
		//WebElement LoginButton1 = driver.findElement(By.name("login"));
		//LoginButton1.click();
		//boolean Selected = LoginButton1.isSelected();
		//System.out.println("LoginButton  is Selected : " + Selected);
		
		
		//GetAttribute
		  String Attribute = EmailId1.getAttribute("name");
		  System.out.println("Email Id  Name : " + Attribute);
		  
		 String Attribute1 = EmailId1.getAttribute("value");
		 System.out.println("Email Id Value : " + Attribute1);
		  
		
		//clear
		 EmailId1.clear();
		

	}

}
