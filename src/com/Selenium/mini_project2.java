package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mini_project2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		signin.click();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("raman.rpudur@gmail.com");
		
		WebElement passward = driver.findElement(By.id("passwd"));
		
		passward.sendKeys("raman123");
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		
		submit.click();
		
		WebElement Tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		
		Tshirt.click();
		
		WebElement Image = driver.findElement(By.xpath("(//img[contains(@class,'replace')])[2]"));
		
		Image.click();		
	
		WebElement Frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	    driver.switchTo().frame(Frame);
	    
	    WebElement TshirtQunatityAdd = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
	    
	    TshirtQunatityAdd.click();
	    
	    
	    Thread.sleep(2000);
		
	    WebElement TshirtQunatityminus= driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[1]"));
	    
	    TshirtQunatityminus.click();
	    
	    WebElement TshirtSize = driver.findElement(By.name("group_1"));
	     
	    Select s=new Select(TshirtSize);
	     
	     s.selectByVisibleText("M");
		
	     WebElement TshirtColor= driver.findElement(By.name("Blue"));
		    
	     TshirtColor.click();
	     
	     WebElement AddToCard= driver.findElement(By.name("Submit"));
		    
	     AddToCard.click();
	     
	     driver.switchTo().parentFrame();

	     WebElement Proceedtocheckout= driver.findElement(By.xpath("//a[contains(@title,'checkout')]"));
		    
	     Proceedtocheckout.click();

	     
	     WebElement TshirtQunatityAdd1= driver.findElement(By.xpath("//a[@title='Add']"));
		    
	     TshirtQunatityAdd1.click();
	     
	     WebElement Proceedtocheckout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	     
	     JavascriptExecutor js =(JavascriptExecutor) driver;
	     
	     js.executeScript("arguments[0].scrollIntoView();",Proceedtocheckout1 );
	     
	     Proceedtocheckout1.click();
	     
	     WebElement Proceedtocheckout2 = driver.findElement(By.name("processAddress"));
	     
	     JavascriptExecutor js1 =(JavascriptExecutor) driver;
	     
	     js1.executeScript("arguments[0].scrollIntoView();",Proceedtocheckout2);
	     
	     Proceedtocheckout2.click();
	     
	     WebElement checkbox = driver.findElement(By.id("cgv"));
	     
	     JavascriptExecutor js2 =(JavascriptExecutor) driver;
	     
	     js2.executeScript("arguments[0].scrollIntoView();",checkbox);
	     
	     checkbox.click();
	     
	     WebElement Proceedtocheckout3 = driver.findElement(By.name("processCarrier"));
	     
	     Proceedtocheckout3.click();
	     
	     WebElement bankwire = driver.findElement(By.xpath("//a[@class='bankwire']"));
	     
	     JavascriptExecutor js3 = (JavascriptExecutor) driver;
	     
	     js3.executeScript("arguments[0].scrollIntoView();",bankwire);
	     
	     bankwire.click();
	     
	     WebElement confirmorder= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	     
	     JavascriptExecutor js4 =(JavascriptExecutor) driver;
	     
	     js4.executeScript("arguments[0].scrollIntoView();", confirmorder);
	     
	     confirmorder.click();
	     
	     TakesScreenshot ts = (TakesScreenshot) driver;
	     
	     File src = ts.getScreenshotAs(OutputType.FILE);
	     
	     File dest = new File("C:\\Users\\srire\\eclipse-workspace\\SeleniumProject\\ScreenShots\\miniproject.png");
	     
	     FileUtils.copyFile(src, dest);
	     
	     
	}

}
