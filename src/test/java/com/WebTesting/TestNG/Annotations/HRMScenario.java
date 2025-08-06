package com.WebTesting.TestNG.Annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HRMScenario extends BaseClass
{
  @Test(priority=1)
  public void testLogin()
  {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  @Test(priority=2)
  public void testLogout()
  {
	  driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
  }
  
  
}