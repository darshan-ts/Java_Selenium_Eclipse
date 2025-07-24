package com.WebTesting.Capabilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S58_FileUploadUsingRobotClass {
  @Test
  public void testFileUpload() throws AWTException, InterruptedException
  {
	  
	//create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose a file
	  //driver.findElement(By.id("file-upload")).click();
	 WebElement ele=driver.findElement(By.xpath("//input[@id='file-upload']"));
	 
//	 JavascriptExecutor js=(JavascriptExecutor) driver;
//	 js.executeScript("document.getElementById('file-upload').click()",ele);
	 
	 
	 /*
	  * Actions is class which help up to automate mouse operation
	  * MouseOver: moveToElement()
	  * Double click: doubleClick()
	  * Rightclick : contextClick()
	  * Draganddrop: dragAndDrop()
	  * 
	  * Note:
	  * If there is single action: perform() 
	  * If group of actions: build()+perform()
	  */
	 
	 Actions act=new Actions(driver);
	 act.moveToElement(ele).click().build().perform();
	 
	 
	  //file explorer is windows feature: Robot class from Java
	  Robot rb=new Robot();
	  rb.delay(4000);
	  
	  //copy some file
	  //Clipboard (ctrl+c)
	  StringSelection sc=new StringSelection("C:\\Users\\darsh\\Downloads\\Appiumsetup.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	 
	  //paste file (ctrl+v)
	  
	  //press key
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	 
	  //release key
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	 
	  
	  //enter
	  rb.keyPress(KeyEvent.VK_ENTER);
	  

	   //upload
	   driver.findElement(By.id("file-submit")).click();
	   
	   Thread.sleep(2000);
	   /*
	   //validate mesg
	   String exp="File Uploaded!";
	   String actText=driver.findElement(By.tagName("h3")).getText();
	   
	   if(actText.equals(exp))
	   {
		   System.out.println("Test pass...File uploaded!");
	   }else
	   {
		   System.out.println("Test Fail....File not uploaded!");
	   }
	   */
	  
	  
	  
	  
	  
	  
  }
}