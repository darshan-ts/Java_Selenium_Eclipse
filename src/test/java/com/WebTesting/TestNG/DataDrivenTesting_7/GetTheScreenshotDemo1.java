package com.WebTesting.TestNG.DataDrivenTesting_7;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class GetTheScreenshotDemo1 {
  @Test
  public void capture() throws IOException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//AmazonPage"+System.currentTimeMillis()+".png");
	  
	  FileHandler.copy(temp,dest);
	  
	  
  }
}