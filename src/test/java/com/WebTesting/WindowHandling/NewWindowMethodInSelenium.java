package com.WebTesting.WindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowMethodInSelenium {
  @Test
  public void testMethodforNewTabWindow() 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  //in tab open facebook
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	 
	  //in new window open amazon app
	  
	  WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}