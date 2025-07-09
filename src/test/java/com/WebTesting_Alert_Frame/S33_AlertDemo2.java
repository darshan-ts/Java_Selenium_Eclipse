package com.WebTesting_Alert_Frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S33_AlertDemo2 {
  @Test
  public void testAlertTypes() throws InterruptedException
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  //simple alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  Thread.sleep(1500);
	  
	  //alert will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  alt1.accept();//ok
	  
	  //result
	  WebElement result=driver.findElement(By.id("result"));
	  System.out.println("Alert1 Result is: "+result.getText());
	  
	  
	  //alert2:Confirmation Alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  Thread.sleep(1500);
	  
	  //alert will open
	  
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Alert2 text is: "+alt2.getText());
	  
	  //cancel
	  alt2.dismiss();
	  
	  //get the result
	  System.out.println("Alert2 Result is: "+result.getText());
	  
	  
	  //alert3: Prompt alert
	  
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  //alert will open
	  Alert alt3=driver.switchTo().alert();
	  System.out.println("Alert3 text is: "+alt3.getText());
	  //prompt
	  alt3.sendKeys("Hello Everyone!....");
	  //ok
	  alt3.accept();
	  
	  //get the result
	  System.out.println("Alert3 Result is: "+result.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}