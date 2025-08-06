package com.WebTesting.TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RealTimeUseOfAnnotation extends BaseClass
{
//	WebDriver driver;
//	
//	@BeforeClass
//	public void setUp()
//	{
//		//open browser with app
//		 driver=new ChromeDriver();
//		 driver.get("https://automationplayground.com/crm/");
//	}
//	
//	@BeforeMethod
//	public void getAppUrl()
//	{
//		System.out.println("URL is: "+driver.getCurrentUrl());
//	}
//	
//	@AfterMethod
//	public void getAppTitle()
//	{
//		System.out.println("Title is: "+driver.getTitle());
//	}
	
  @Test(priority=1)
  public void testSignInLink()
  {
	  System.out.println("Test 1 is executing...");
	    //signin link validation
	  WebElement link=driver.findElement(By.linkText("Sign In"));
	  if(link.isDisplayed() && link.isEnabled())
	  {
		  link.click();
	  }
	  
	   
  }
  
  @Test(priority=2)
  public void testLogin()
  {
	  System.out.println("Test 2 is executing...");
	//login
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  
  }
  
//  @AfterClass
//  public void tearDown()
//  {
//	//close browser
//	  driver.quit();
//  }
}