package com.WebAppTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S10_LocatorDemo4_CssSelector {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationplayground.com/crm/");
		
		//sign in link:tagname with id
		driver.findElement(By.cssSelector("a#SignIn")).click();
		
		//email id: tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Enter email']")).sendKeys("test@gmail.com");
		
	
		//password: tagname with id
		driver.findElement(By.cssSelector("input#password")).sendKeys("test123");
		
		//checkbox : tagname with attribute
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		//submit: tagname with className
		//driver.findElement(By.cssSelector("button.btn.btn-default.btn-primary")).click();
		
		//driver.findElement(By.cssSelector("button.btn-primary")).click();
		
		//submit: tagname with id,classname and attribute
		driver.findElement(By.cssSelector("button.btn-primary#submit-id[type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}