package com.WebAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S06_LocatorDemo1_LinkAutomation {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://automationplayground.com/crm/");
		
		//SignIn link : linkText locator(full text)
		
		//driver.findElement(By.linkText("Sign In")).click();
		
		//NoSuchElementException
		//driver.findElement(By.linkText("In")).click();
		
		//using partialLinkText locator(partial locator)
		driver.findElement(By.partialLinkText("In")).click();

	}

}