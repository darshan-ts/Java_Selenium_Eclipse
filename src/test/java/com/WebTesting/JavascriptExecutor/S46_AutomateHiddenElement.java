package com.WebTesting.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S46_AutomateHiddenElement {
  @Test
  public void testHiddenElement() 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.letskodeit.com/practice");
	  
	  
	  //click on hide button
	  driver.findElement(By.id("hide-textbox")).click();
	  
	  //hidden element-send the data
	  //driver.findElement(By.id("displayed-text")).sendKeys("Testing....");
	  
	  //using JavascriptExecutor interface we can automate hidden element
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("document.getElementById('displayed-text').value='Testing....'");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}