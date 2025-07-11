package com.WebAppTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S20_AmazonFooterScenario {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	
		
		//footer links:total link
		//List<WebElement> allLinks=driver.findElements(By.xpath("//div[contains(@class,'navFooterVerticalRow')]"));
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[contains(@class,'navFooterLinkCol')]//ul//li//a"));
		System.out.println("Total footer links are: "+allLinks.size());//22
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Amazon Science"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		

	}

}