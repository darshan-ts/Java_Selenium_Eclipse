package com.WebAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S11_LocatorDemo5_cssSelectorSymbols {

	public static void main(String[] args) throws InterruptedException 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//searchbox:tagname with $(endswith)
		driver.findElement(By.cssSelector("input[id$='textbox']")).sendKeys("bags",Keys.ENTER);
		
		
		Thread.sleep(1500);
		
		//clear the text and search for mobiles: tagname with ^(startswith)
		WebElement searchEle=driver.findElement(By.cssSelector("input[id^='twotab']"));
		
		searchEle.clear();
		
		Thread.sleep(1500);
		
		searchEle.sendKeys("Mobiles",Keys.ENTER);
		
		//clear the text and search for watch: tagname with *(contains partial match)
		WebElement ele=driver.findElement(By.cssSelector("input[id*='searchtext']"));
		
		ele.clear();
		Thread.sleep(1500);
		
		ele.sendKeys("watch",Keys.ENTER);
		
		
		
		
		
		
		
		
		

	}

}