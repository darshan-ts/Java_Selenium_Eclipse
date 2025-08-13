package com.WebTesting.TestNG.TestData;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Generic.ExcelUtil;

public class HRMLoginWithExcelFile5 {
  @Test
  public void testLogin()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //username
	  driver.findElement(By.name("username")).sendKeys(ExcelUtil.getData("HRM",1,0));
	  
	  //password
	  driver.findElement(By.name("password")).sendKeys(ExcelUtil.getData("HRM",1,1));
	  
	  
	  //login
	  driver.findElement(By.tagName("button")).click();
	  //navigate to next page
	  
	  //current url validation
	  String actUrl=driver.getCurrentUrl();
	  String expUrl="dashboard";
	  
	  Assert.assertTrue(actUrl.contains(expUrl),"Login Fail");
	  System.out.println("Login Completed!");
  }
}