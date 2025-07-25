package com.WebTesting.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S62_DragAndDropAction {
  @Test
  public void testDragandDrop() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  WebElement srcEle=driver.findElement(By.id("draggable"));
	  WebElement targetEle=driver.findElement(By.id("droppable"));
	  
	  
	  //action
	  Actions act=new Actions(driver);
	  act.dragAndDrop(srcEle,targetEle).perform();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}