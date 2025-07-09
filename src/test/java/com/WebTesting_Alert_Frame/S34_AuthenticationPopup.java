package com.WebTesting_Alert_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S34_AuthenticationPopup {
  @Test
  public void testAuthPopup()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  
	  String text=driver.findElement(By.id("content")).getText();
	  System.out.println(text);
	  
  }
}