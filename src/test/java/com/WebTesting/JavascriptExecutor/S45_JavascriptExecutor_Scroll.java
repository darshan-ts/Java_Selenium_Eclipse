package com.WebTesting.JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S45_JavascriptExecutor_Scroll {
  @Test
  public void testScroll() throws InterruptedException
  {

	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.freshworks.com/");
	  
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	 //js.executeScript("window.scrollTo(0,4000)");
	  //scrolldown
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	   
	  Thread.sleep(2000);
	  
	  //scrollup
	   js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	   Thread.sleep(2000);
	   
	   //scroll Upto any element
	   WebElement ele=driver.findElement(By.xpath("//h2[text()='Get the insights you need']"));
	  
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  
	  
	  
  }
}