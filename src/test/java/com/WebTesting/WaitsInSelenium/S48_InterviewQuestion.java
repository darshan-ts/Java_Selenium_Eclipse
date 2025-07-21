package com.WebTesting.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S48_InterviewQuestion {
  @Test
  public void testXpath()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  driver.findElement(By.linkText("Mobiles")).click();
	  
	  
	  //(//div[@class='mega-menu']//ul)[2]//li//a[text()='Mi']
	  WebElement ele=driver.findElement(By.xpath("(//span[normalize-space()='Mobiles & Accessories'])[2]"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  String text=driver.findElement(By.xpath("(//div[@class='mega-menu']//ul)[2]//li//a[text()='Mi']")).getText();
	  System.out.println(text);
	  
	  
	  
  }
  
}