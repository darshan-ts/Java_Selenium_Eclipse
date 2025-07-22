package com.WebTesting.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class S50_DynamicWaitUsingWebDriverWait {
  @Test
  public void testWait()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  By startBtn=By.xpath("//button[text()='Start']");
	  By resText=By.xpath("//div[@id='finish']");
	  
	  
	  //Utility.waitForElementToClick(driver,startBtn).click();
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  //String text=Utility.waitForElementVisibility(driver,resText).getText();
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	  String text=wait.until(ExpectedConditions.visibilityOfElementLocated(resText)).getText();
	  System.out.println(text);
	  
	 /* 
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	
	//loading 
	
	//get the text into console
		String text=driver.findElement(By.xpath("//div[@id='finish']")).getText();
		System.out.println(text);
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}