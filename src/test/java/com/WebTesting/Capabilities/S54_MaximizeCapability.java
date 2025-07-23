package com.WebTesting.Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class S54_MaximizeCapability {
  @Test
  public void testCapability() 
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("start-maximized");
	  
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.amazon.in");
	  
	  
	  
  }
  
  
  
}