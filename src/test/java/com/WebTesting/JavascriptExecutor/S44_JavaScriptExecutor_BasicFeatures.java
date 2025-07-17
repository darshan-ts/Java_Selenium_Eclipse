package com.WebTesting.JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S44_JavaScriptExecutor_BasicFeatures {
  @Test
  public void testBasicFeatures() throws InterruptedException 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.freshworks.com/");
	  driver.manage().window().maximize();
	  
	  //get the title
	  System.out.println("Title is: "+driver.getTitle());
	  
	  //using javaScriptExecutor
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  String title= js.executeScript("return document.title").toString();
	  System.out.println("Using JS title is: "+title);
	  
	  //refresh the page
	  driver.navigate().refresh();
	  
	  Thread.sleep(2000);
	  
	  //using Js
	  js.executeScript("window.history.go()");
	  
	  //Element interaction
	  WebElement demoEle=driver.findElement(By.xpath("//a[text()='Demo']"));
	  //click
	  //demoEle.click();
	  
		js.executeScript("arguments[0].click()",demoEle);	  
	  
	  //enter firstname
		WebElement fname=driver.findElement(By.xpath("//input[@name='first-name']"));
	  
		js.executeScript("arguments[0].value='Darshan T S';",fname);
	  
	  
	  
  }
}