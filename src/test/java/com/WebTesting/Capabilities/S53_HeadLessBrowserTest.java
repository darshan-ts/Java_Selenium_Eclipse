package com.WebTesting.Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class S53_HeadLessBrowserTest {
  @Test
  public void testHeadless()
  {
	  //headless
	  	ChromeOptions options=new ChromeOptions();
	  	options.addArguments("--headless");
	  
	  			// Create driver session
			WebDriver driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("Driver session is created...");
			driver.get("https://www.google.com/");
			System.out.println("Application open...");
			
			//search for keyword
			driver.findElement(By.id("APjFqb")).sendKeys("Cypress");
			System.out.println("Search with Cypress");
			
			//suggestions
			List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
			System.out.println("Total options are: "+allOptions.size());
			
			for(WebElement i:allOptions)
			{
				System.out.println(i.getText());
			}
			
			
  }
}