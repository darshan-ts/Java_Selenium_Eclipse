package com.WebAppTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S19_FooterLinksAutomationFreshworks {

	public static void main(String[] args) 
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshworks.com/");
		
		
		System.out.println("************Any single footer list***********");
		List<WebElement> allFooters=driver.findElements(By.xpath("(//ul[contains(@class,'kTjuIu')])[1]"));
		
		for(WebElement i:allFooters)
		{
			System.out.println(i.getText());
		}
		
		
		
		System.out.println("********All Footer list***********");
		
		List<WebElement> allList=driver.findElements(By.xpath("//ul[contains(@class,'kTjuIu')]//li//a//span"));
		
		System.out.println("Total Footer options are: "+allList.size());
		
		
		for(WebElement i:allList)
		{
			System.out.println(i.getText());
		}
		

	}

}