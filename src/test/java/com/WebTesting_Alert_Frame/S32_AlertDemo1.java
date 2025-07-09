package com.WebTesting_Alert_Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S32_AlertDemo1 {
  @Test
  public void testAlert() throws InterruptedException 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  
	  //enter email
	  driver.findElement(By.id("login1")).sendKeys("priyanka");
	  
	  //click on signin
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(2000);
	  //alert will appear
	  Alert alt=driver.switchTo().alert();
	  
	  System.out.println("Alert text is: "+alt.getText());
	  
	  //ok
	  alt.accept();
	  
	  
	 
	  //password
	 driver.findElement(By.id("password")).sendKeys("test123");
	  
	  
	  
	  
	  
			 
  }
}