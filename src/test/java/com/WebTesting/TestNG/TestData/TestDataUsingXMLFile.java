package com.WebTesting.TestNG.TestData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDataUsingXMLFile 
{
	
  @Parameters({"un","psw"})	
  @Test
  public void testDataFromFile(String un,String psw) 
  {
//	  System.out.println("user name is: "+username);
//	  System.out.println("Password is: "+password);
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //username
	  driver.findElement(By.name("username")).sendKeys(un);
	  
	  //password
	  driver.findElement(By.name("password")).sendKeys(psw);
	  
	  
	  //login
	  driver.findElement(By.tagName("button")).click();
	  //navigate to next page
	  
	  //current url validation
	  String actUrl=driver.getCurrentUrl();
	  String expUrl="index.php";
	  
	  Assert.assertTrue(actUrl.contains(expUrl),"Login Fail");
	  System.out.println("Login Completed!");
	  
  }
}