package com.WebTesting.TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo6_HRMLoginValidation {
  @Test
  public void testLogin()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //username
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  //password
	  driver.findElement(By.name("password")).sendKeys("admin1234");
	  
	  
	  //login
	  driver.findElement(By.tagName("button")).click();
	  //navigate to next page
	  
	  //current url validation
	  String actUrl=driver.getCurrentUrl();
	  String expUrl="dashboard";
	  
//	  AssertJUnit.assertTrue(actUrl.contains(expUrl),"Login Fail"); // Soon after creating Suite, Eclipse by default changes assertion with respect to JUnit. We need to revert only to TestNG Assertion.
	  Assert.assertTrue(actUrl.contains(expUrl),"Login Fail");
	  System.out.println("Login Completed!");
	  
	  //logout
	  driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}