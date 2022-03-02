package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multidropdown_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.plus2net.com/html_tutorial/html_frmddl.php");
		
		driver.manage().window().maximize();
		
		WebElement Multidropdown = driver.findElement(By.name("ddl"));
		
		Select s = new Select(Multidropdown);
		
		//ismultiple [single / multiple dropdown find]
		
		boolean ismultiple = s.isMultiple();
		
		System.out.println("Is Multiple : " + ismultiple);

	}

}
