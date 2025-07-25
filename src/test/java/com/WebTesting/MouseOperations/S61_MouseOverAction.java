package com.WebTesting.MouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S61_MouseOverAction {
  @Test
  public void testMouseOverAction()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.naukri.com/");
	  
	  
	  //get the ele
	  WebElement ele=driver.findElement(By.xpath("//div[text()='Jobs']"));
	  
	  //mouse over on Jobs
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  //get the sub menu/options
	  List<WebElement> allOptions=driver.findElements(By.xpath("//div[contains(@class,'nI-gNb-Jobs')]//ul//li//a"));
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
	  }
		 
	  
	  
	  
	  
	  
	  
	  
	  
  }
}