package com.WebTesting.Capabilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S57_FileUploadUsingSendKeys {
  @Test
  public void testFileUpload() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose file: element have argument type="file"
	   driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\darsh\\Downloads\\Appiumsetup.txt");
	  
	   //upload
	   driver.findElement(By.id("file-submit")).click();
	   
	   //validate mesg
	   String exp="File Uploaded!";
	   String act=driver.findElement(By.tagName("h3")).getText();
	   
	   if(act.equals(exp))
	   {
		   System.out.println("Test pass...File uploaded!");
	   }else
	   {
		   System.out.println("Test Fail....File not uploaded!");
	   }
	  
  }
}