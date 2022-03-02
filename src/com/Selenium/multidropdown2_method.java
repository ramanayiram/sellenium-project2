package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multidropdown2_method {



	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s=new Select(multi);
				
	 boolean mu = s.isMultiple();		
		
		System.out.println("is multiple :"+mu);
		
		s.selectByValue("2");
		
		s.selectByIndex(3);
		
		s.selectByVisibleText("Loadrunner");
		

		System.out.println("All options");
		
		List<WebElement> alloptions = s.getOptions();

     for(WebElement all: alloptions)
     {
    	String text = all.getText(); 
     
     System.out.println(text);
	
     }	
		
     System.out.println("All selected options");
     
     List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
     
   for(WebElement allselected :allSelectedOptions) {
     
	 String text= allselected.getText();
	 System.out.println(text);
	 
	}
   System.out.println("First selected option");
         
          WebElement firstSelectedOption = s.getFirstSelectedOption();
          
           String text = firstSelectedOption.getText();
           System.out.println(text);
	}
}
