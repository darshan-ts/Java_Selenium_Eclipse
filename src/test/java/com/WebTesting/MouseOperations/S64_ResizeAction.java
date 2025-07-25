package com.WebTesting.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S64_ResizeAction {
  @Test
  public void testResizeAction() 
  
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	  
	    
	  //frame
	  driver.switchTo().frame(0);
	  	  
	  //ele
	  WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'ui-icon')]"));
	  
	  
	  //moveToElemenet+dragAndDrop(target,x,y)
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).dragAndDropBy(ele, 70, 100).build().perform();
	  
	  
	  
	  
	  
	  
  }
}