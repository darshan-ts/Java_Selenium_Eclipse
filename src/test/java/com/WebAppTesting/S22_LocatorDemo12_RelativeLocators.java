package com.WebAppTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class S22_LocatorDemo12_RelativeLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		//enter email  which is above password
		driver.findElement(RelativeLocator.with(By.id("email-id")).above(By.id("password"))).sendKeys("test123@gmail.com");
		
		//enter password which is below email ele
		driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email-id"))).sendKeys("test123");
		
		
		//click on chebox which is near to text Remember me
		driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();
		
		
		//enter keyword into searchbox which is left side of Signin link
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toLeftOf(By.xpath("//a[text()='Sign In']"))).sendKeys("HelloAll");
		
		Thread.sleep(2000);
		
		//enter keyword into serachbox which is right side of logo text
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toRightOf(By.xpath("//a[text()='Customer Service']"))).clear();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}