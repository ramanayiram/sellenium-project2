package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project_booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("raman12345");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("9629520296");
		
		Thread.sleep(4000);
		WebElement login = driver.findElement(By.id("login"));
		
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		
		Select s =new Select(location);
		
		s.selectByIndex(7);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		
		Select s1 =new Select(hotels);
		
		s1.selectByValue("Hotel Sunshine");
		
		WebElement roomTybe = driver.findElement(By.name("room_type"));
		
		Select s2 = new Select(roomTybe);
		
		s2.selectByValue("Super Deluxe");
		
		WebElement roomnos = driver.findElement(By.name("room_nos"));
		
		Select s3 =new Select (roomnos);
		
		s3.selectByValue("6");
		
	//	WebElement dateIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		//dateIn.sendKeys("15/02/2022");
		
	//	WebElement dateOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
	//	dateOut.sendKeys("20/02/2022");
		
		WebElement adultsRoom = driver.findElement(By.name("adult_room"));
		
		Select s4 = new Select(adultsRoom);
		
		s4.selectByIndex(2);
		
		WebElement childRoom = driver.findElement(By.name("child_room"));
		
		Select s5 = new Select(childRoom);
		
		s5.selectByValue("2");
		
		Thread.sleep(4000);
		
		WebElement search = driver.findElement(By.id("Submit"));
		
		search.click();
		
		
		WebElement radiobutton = driver.findElement(By.name("radiobutton_0"));
		
		radiobutton.click();
		
		Thread.sleep(4000);
		
		WebElement submit= driver.findElement(By.name("continue"));
		
		submit.click();
		
		WebElement firstname = driver.findElement(By.name("first_name"));
		
		firstname.sendKeys("raman");
		
		WebElement lastname = driver.findElement(By.name("last_name"));
		
		lastname.sendKeys("ayiram");
		
		WebElement adress = driver.findElement(By.name("address"));
		
		adress.sendKeys("43, 4th main road,nandhanam, chennai.");
		
		WebElement cardno = driver.findElement(By.name("cc_num"));
		
		cardno.sendKeys("1234567890123456");
		
		WebElement cardtybe = driver.findElement(By.name("cc_type"));
		
		Select s6 =new Select(cardtybe);
		s6.selectByValue("AMEX");
		
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		
		Select s7 =new Select(month);
		s7.selectByIndex(5);
		
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		
		Select s8 =new Select(year);
		s8.selectByValue("2022");
		
		WebElement ccvno = driver.findElement(By.name("cc_cvv"));
		
		ccvno.sendKeys("678");
		
		Thread.sleep(4000);
		
		WebElement bookNow = driver.findElement(By.name("book_now"));
		
		bookNow.click();
		
		Thread.sleep(10000);
		
		WebElement itinerary = driver.findElement(By.name("my_itinerary"));
		
		itinerary.click();
		
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.id("logout"));
		
		logout.click();		
		
	}

}
