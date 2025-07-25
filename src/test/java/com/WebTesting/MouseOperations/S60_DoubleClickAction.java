package com.WebTesting.MouseOperations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S60_DoubleClickAction {
  @Test
  public void testDoubleClick() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  
	  //button
	  WebElement button=driver.findElement(By.tagName("button"));
	  
	  
	  //doubleclick 
	  Actions act=new Actions(driver);
	  act.doubleClick(button).perform();
	  
	  //alert
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt.getText());
	  //ok
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}