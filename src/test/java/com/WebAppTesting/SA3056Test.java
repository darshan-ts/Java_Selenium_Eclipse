package com.WebAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SA3056Test {
  @Test
  public void testApp()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  System.out.println("Url is: "+driver.getCurrentUrl());
	  String actUrl=driver.getCurrentUrl();
	  System.out.println(actUrl);
	  if(actUrl.contains("https"))
	  {
		  System.out.println("Valid URL!");
	  }
	  
	  //driver.findElement(By.id("input-email")).sendKeys("");
	  
	  
	  //test email id
	 WebElement ele= driver.findElement(By.id("input-email"));
	  
	  System.out.println("Is email element is enable "+ele.isEnabled());
	  
	  ele.sendKeys("test@gmail.com");
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
}