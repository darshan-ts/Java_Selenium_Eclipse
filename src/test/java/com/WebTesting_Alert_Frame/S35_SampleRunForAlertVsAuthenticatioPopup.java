package com.WebTesting_Alert_Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S35_SampleRunForAlertVsAuthenticatioPopup {
  @Test
  public void testAuthPopup()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/basic_auth");
	  
	  //NoAlertPresentException: no such alert
//	  Alert alt=driver.switchTo().alert();
//	  alt.sendKeys("admin");
//	  alt.sendKeys("admin");
//	  alt.accept();
	  
	  
  }
}