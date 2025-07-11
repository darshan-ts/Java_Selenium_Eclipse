package com.WebAppTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S14_LocatorDemo8_XpathBasic {

	public static void main(String[] args) 
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//email
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("test24@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		
		//login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//validation
		String expUrl="account/account";
		
		if(driver.getCurrentUrl().contains(expUrl))
		{
			System.out.println("User navigated to Account page ...Test Pass!");
		}
		else
		{
			System.out.println("Login Fail!");
		}

	}

}