package com.WebTesting.DropDownAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class S26_AmazonUtilityUseCase {
  @Test
  public void testDropdownWithUtility()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in/");
	  
	  //get the address of dropdown<select>
	  WebElement ddele=driver.findElement(By.id("searchDropdownBox"));
	  
	  Utility.selectBasedDropdown(ddele,"Toys & Games");
	  
  }
}