package com.WebTesting.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class S49_ExplicitWaitUsingWebDriverWaitClass {
  @Test
  public void testExplicitWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locators(address)
	  By emailId=By.id("input-email");
	  By password=By.id("input-password");
	  By logibBtn=By.xpath("//input[@value='Login']");
	  
	  boolean status=Utility.waitForUrlContains(driver,"demo");
	  if(status)
	  {
		  System.out.println("Url is matched!..");
		  System.out.println("Url is: "+driver.getCurrentUrl());
		  
	  }
	  
	  boolean titleStatus=Utility.waitForTitleContains(driver,"Login");
	  if(titleStatus)
	  {
		  System.out.println("Title is: "+driver.getTitle());
	  }
	  
	  
	  Utility.waitForElementPresence(driver,emailId).sendKeys("test24@gmail.com");
	  Utility.waitForElementVisibility(driver,password).sendKeys("test123");
	  Utility.waitForElementToClick(driver,logibBtn).click();
	  
	  
	  
	  
	  
	  /*
	   * Explicit wait applicable for one single webelement only
	   * We can apply wait based on certain condition
	   */
	  //ele1
	  
	  /*
	   * TimeoutException: Expected condition failed: 
	   * waiting for visibility of element located by By.id: input-email### 
	   * (tried for 5 second(s) with 500 milliseconds interval)
	   * 
	   * Interval time=Polling time
	   * Selenium default polling timeout is 500ms= 0.5 sec
	   * 
	   
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailEle=wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
	  
	  emailEle.sendKeys("test@gmail.com");
	  
	  //ele1
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailEle=wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
	  
	  //ele2
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
	  wait2.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys("test123");
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}