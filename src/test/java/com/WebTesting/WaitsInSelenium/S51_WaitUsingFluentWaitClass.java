package com.WebTesting.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class S51_WaitUsingFluentWaitClass {
  @Test
  public void testWait() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  //start
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  
	  //wait
	 FluentWait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(600))
		            .ignoring(ElementNotInteractableException.class);
	 
	  By textEle=By.xpath("(//h4)[2]");
	  String text=wait.until(ExpectedConditions.visibilityOfElementLocated(textEle)).getText();
	  
	  
	  //text
	  //String text=driver.findElement(By.xpath("(//h4)[2]")).getText();
	  System.out.println(text);
  
  
  
  }
}