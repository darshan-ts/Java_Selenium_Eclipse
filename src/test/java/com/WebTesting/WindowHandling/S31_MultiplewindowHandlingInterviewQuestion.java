package com.WebTesting.WindowHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class S31_MultiplewindowHandlingInterviewQuestion {
  @Test
  public void testMultipleWindow() throws InterruptedException
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   //parent window
	   String parentId=driver.getWindowHandle();
	   
	   //action:open some links
	   List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
	   for(WebElement i:allLinks)
	   {
		   i.click();
		   
	   }
	   
	   //get the session id/window id for all windows
	   
	   Set<String> allWindowsHandle=driver.getWindowHandles();
	   //set to list
	   List<String> allHandles=new ArrayList<String>(allWindowsHandle);//order collection
	   
	   //switch to right window and get the current url and title for that window
	   
	  if(Utility.switchToRightWindow("YouTube",allHandles,driver))
	  {
		  System.out.println("Current url is: "+driver.getCurrentUrl()+" : "+"Title is: "+driver.getTitle());
	  }
	   
	  Thread.sleep(2000);
	   //come to parent window
	 driver=Utility.switchToParentWindow(driver,parentId);
	 
	 driver.findElement(By.name("username")).sendKeys("Priyanka");
	 
	  Thread.sleep(2000);
	  //close all window except Parent Window
	 
	 Utility.closeAllWindows(driver,parentId,allHandles);
	 
	   
	  }
  
//  //utility
//  public  boolean switchToRightWindow(String expwindowTitle,List<String> allHandles,WebDriver driver)
//  {
//	  
//	  for(String windowId:allHandles)//[101,201,301,401]
//	  {
//		  
//		  //get the title of that window after switch
//		  String actTitle=driver.switchTo().window(windowId).getTitle();
//		  if(actTitle.contains(expwindowTitle))
//		  {
//			  System.out.println("Found right window.....");
//			  return true;
//		  }
//		  
//		  
//	  }
//	  return false;
//  }
//  
//  
  
  
  
  
  
}