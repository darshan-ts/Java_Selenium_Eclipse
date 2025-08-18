package com.WebTesting.TestNG.DataDrivenTesting_7;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class GetTheScreenshotDemo2 {
  @Test
  public void capture() throws IOException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	  
	  Utility.getScreenshot(driver, "OpenCartRegisterPage");
	  
	  /*
//	  Date date=new Date();
//	  SimpleDateFormat sm=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
//	  String timestamp=sm.format(date);
	  
	  String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//AmazonPage"+timestamp+".png");
	  
	  FileHandler.copy(temp,dest);
	  
	  */
	  
	  
  }
}