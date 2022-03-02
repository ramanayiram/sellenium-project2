package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		//All Data
		
		System.out.println("****AllData****");		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));		
		for (WebElement all : alldata) {
			String text = all.getText();
			System.out.println(text);
		}
		
		//Row data
		
		System.out.println();
		System.out.println("***Row data***");
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));		
		for (WebElement row : rowdata) {			
			String text = row.getText();
			System.out.println(text);
		}
		
		//column data
		
		System.out.println();
		System.out.println("****Column Data***");		
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));		
		for (WebElement column : columndata) {
			String text = column.getText();
			System.out.println(text);	
		}
		
		//Particular data
		
		System.out.println();
		System.out.println("***Particular Data***");		
		WebElement data = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));		
		String text = data.getText();
		System.out.println(text);		
		
		//Headers
		
		System.out.println();
		System.out.println("***Headers***");		
		List<WebElement> allheaders = driver.findElements(By.tagName("th"));		
		for (WebElement headers : allheaders) {
			String text2 = headers.getText();
			System.out.println(text2);
		}		
		
		
	}

}
