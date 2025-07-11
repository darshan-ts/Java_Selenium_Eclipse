package com.WebAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S05_WebElementIdentificationWays {

	public static void main(String[] args)
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com/");
		
		//Technique3: Identify+action
		driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
		
		//Technique1: By locator(framework)
		/*
		//identify webelement address : By is class
		By searchBoxAddress=By.id("APjFqb");
		
		//identify webelement using selenium:findElement():WebElement
		WebElement searchBoxEle=driver.findElement(searchBoxAddress);
		
		//validate searchbox
		System.out.println("Is Searchbox is displayed on the webpage?: "+searchBoxEle.isDisplayed());
		System.out.println("Is Searchbox is enabled or not?: "+searchBoxEle.isEnabled());
		
		//action:search for keyword: JAva
		searchBoxEle.sendKeys("Java",Keys.ENTER);
		*/
		
		//Technique2: Identify+validate+perform action
		/*
		WebElement searchEle=driver.findElement(By.id("APjFqb"));
		if(searchEle.isDisplayed()&& searchEle.isEnabled())
		{
			searchEle.sendKeys("Selenium");
		}
		*/
		
		
		
		
		
		
		

	}

}