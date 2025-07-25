package com.WebTesting.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S65_TootipAutomation {
  @Test
  public void testToolTip() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/tooltip/");
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //ele
	  WebElement ele=driver.findElement(By.id("age"));
	  
	  
	  //mouse over
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).build().perform();
	  
	  
	  //tooltip
	  
	  String toolTip=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
	  System.out.println(toolTip);
	  
  }
}