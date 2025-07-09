package com.WebTesting.WindowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class NewWindowMethodInSelenium_1 {
  @Test
  public void testMethodforNewTabWindow() 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  // 2. Create a list to store all tab/window handles
      List<String> tabHandles =new ArrayList<>();
      tabHandles.add(driver.getWindowHandle()); // Add the Google tab

      // 3. Open 10 Facebook tabs
      for (int i = 1; i <= 10; i++) {
          WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
          newTab.get("https://www.facebook.com");
          tabHandles.add(newTab.getWindowHandle());
      }

      // 4. Switch to the 5th Facebook tab (Google is at index 0, so Facebook tabs start from 1)
      String fifthFacebookTab = tabHandles.get(5); // 5th Facebook tab is at index 5
      driver.switchTo().window(fifthFacebookTab);

      // 5. Print the title
      System.out.println("Title of 5th Facebook tab: " + driver.getTitle());

	  
	 
	 	 //in new window open amazon app
	  
      //WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	//  newWin.get("https://www.amazon.in");
  
	  
	  
	  
	  
	  
	  
	  
  }
}