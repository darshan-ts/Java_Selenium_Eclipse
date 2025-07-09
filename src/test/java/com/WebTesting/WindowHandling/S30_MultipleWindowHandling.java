package com.WebTesting.WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S30_MultipleWindowHandling {
  @Test
  public void testWindowHandling()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //parent window
	  String parentId=driver.getWindowHandle();
	  
	  System.out.println(parentId);
	  
	  
	  //click on link
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  Set<String> allWindowsId=driver.getWindowHandles();
	  System.out.println(allWindowsId);
	  
	  
	  //iterate all windows
	  for(String childId:allWindowsId)
	  {
		  //when parent id is not equal to child id then switch
		  if(!parentId.equals(childId))
		  {
			  driver.switchTo().window(childId);
			  System.out.println("child window id: "+driver.getWindowHandle());
			  driver.findElement(By.name("EmailHomePage")).sendKeys("test123@gmail.com");
			  //driver.close();:close current active window
			  
			  //driver.quit();:close all open windows by selenium
		  }
	  }
	  
	  //NoSuchSessionException: Session ID is null
	  //parent window
	  driver.switchTo().window(parentId);
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
  }
}