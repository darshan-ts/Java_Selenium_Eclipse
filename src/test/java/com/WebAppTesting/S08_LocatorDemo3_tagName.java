package com.WebAppTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class S08_LocatorDemo3_tagName {

	public static void main(String[] args) 
	{
		//create driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
		//username
		//driver.findElement(By.name("username")).sendKeys("Admin");
		
		//number of input boxes
		List<WebElement> allInputs=driver.findElements(By.tagName("input###"));
		System.out.println(allInputs);//[]
		System.out.println("Total input boxes are: "+allInputs.size());//0
		
		
		//number of images
		int numberOfImages=driver.findElements(By.tagName("img")).size();
		System.out.println("Total images are: "+numberOfImages);//3
		
		//number of Links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());//5
		
		/*
		 * get the value for href attribute 
		 * get the text of link
		 * 
		 */
		
		String explink="https://twitter.com/orangehrm?lang=en";
		
		for(WebElement i:allLinks)
		{
			System.out.println("Attribute value is: "+i.getDomAttribute("href"));
			System.out.println("Text is: "+i.getText());
			
			if(i.getDomAttribute("href").contains(explink))
			{
				System.out.println("Link found....Test Pass...");
				i.click();
				break;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}