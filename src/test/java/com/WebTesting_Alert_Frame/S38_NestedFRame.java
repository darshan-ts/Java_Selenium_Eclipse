package com.WebTesting_Alert_Frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S38_NestedFRame {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  //top=0
//	  driver.switchTo().frame(0);
//	  driver.switchTo().frame("frame-left");
	  driver.switchTo().frame(0).switchTo().frame("frame-left");
	  System.out.println(driver.getPageSource());
	  
	  
	  
  }
}