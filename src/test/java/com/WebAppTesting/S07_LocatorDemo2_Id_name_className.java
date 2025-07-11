package com.WebAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S07_LocatorDemo2_Id_name_className {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//signIn:linkText
		driver.findElement(By.linkText("Sign In")).click();
		
		//email:id
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password:name
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox:id
		driver.findElement(By.id("remember")).click();
		
		//submit button: id
		//driver.findElement(By.id("submit-id")).click();
		
		
		//submit button :className:InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary")).click();
		
		driver.findElement(By.className("btn-primary")).click();
		

	}

}