package com.Generic;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{
	
	
	public static void closeAllWindows(WebDriver driver,String parentId, List<String> allHandles)
	{
		for(String windowId:allHandles)
		{
			if(!windowId.equals(parentId))
			{
				driver.switchTo().window(windowId).close();
			}
		}
	}
	
	//utility
	  public static boolean switchToRightWindow(String expwindowTitle,List<String> allHandles,WebDriver driver)
	  {
		  
		  for(String windowId:allHandles)
		  {
			  
			  //get the title of that window after switch
			  String actTitle=driver.switchTo().window(windowId).getTitle();
			  if(actTitle.contains(expwindowTitle))
			  {
				  System.out.println("Found right window.....");
				  return true;
			  }
			  
			  
		  }
		  return false;
	  }
	  
	  
	  public static WebDriver switchToParentWindow(WebDriver driver,String parentId)
	  {
		  driver.switchTo().window(parentId);
		  return driver;
	  }
	  
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		  System.out.println("Is dropdown support multipleSelection: "+dd.isMultiple());
		  
		  List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
		
	}
	
	//scroll
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  
		  //scrolldown
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  
		  //scrollup
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	
	
	public static void scrollUptoElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
}