package com.WebAppTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S13_LocatorDemo7_CssSelectorWithIndexing {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		/*all list option
		List<WebElement> allOptions=driver.findElements(By.cssSelector("div.list-group>a"));
		
		for(WebElement i:allOptions)
			
		{
			System.out.println(i.getText());
		}
		*/
		
		
		//Out of 13 elements interact with 3rd link:Forgotten password click
		driver.findElement(By.cssSelector("div.list-group>a:nth-child(3)")).click();
		
		//get the text
		String text=driver.findElement(By.cssSelector("div#content>h1")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}