package com.Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
     static int indexofTotal,indexofDeaths, indexofActive, indexofTests;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		
	    driver.manage().window().maximize();
		
		List<WebElement> allheaders= driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		
		for (int i = 0; i < allheaders.size(); i++) {
			
			String text = allheaders.get(i).getText();
		//	System.out.println(text);
			String header = text.replaceAll("\n", " ");
		//	System.out.println(header);
			
			if (header.equalsIgnoreCase("Total Cases")) {
				indexofTotal= i;
				System.out.println("Index of total cases :"+indexofTotal);
			}
			else if (header.equalsIgnoreCase("New Deaths")) {
				indexofDeaths =i;
				System.out.println("Index of New Deaths :"+indexofDeaths);
			
			}
			else if (header.equalsIgnoreCase("Active Cases")) {
				indexofActive = i;
				System.out.println("Index of Active cases :"+indexofActive);
			}
		
			else if (header.equalsIgnoreCase("Total Tests")) {
				indexofTests =i;
				System.out.println("Index Of Total Tests :"+indexofTests);
			}
		}
		
		List<WebElement> allRow = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		
		for (int i = 0; i < allRow.size() ; i++) {
			
			List<WebElement> allData = allRow.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < allData.size(); j++) {
				
				if (allData.get(j).getText().equalsIgnoreCase("Spain")) {
					
					System.out.println("Total cases :"+allData.get(indexofTotal).getText());
					System.out.println("New Deaths :"+allData.get(indexofDeaths).getText());
					System.out.println("Active cases :"+allData.get(indexofActive).getText());
					System.out.println("Total tests :"+allData.get(indexofTests).getText());
				}
				
			}
		}
		
		
		
		
		
		
		
	}

}
