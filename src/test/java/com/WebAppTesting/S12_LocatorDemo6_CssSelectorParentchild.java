package com.WebAppTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S12_LocatorDemo6_CssSelectorParentchild {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.freshworks.com/");
		
		
		//footer links
		List<WebElement> allLinks=driver.findElements(By.cssSelector("ul.dRHBZS>li>a>span"));

		System.out.println("Total footer links are: "+allLinks.size());
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
	}

}