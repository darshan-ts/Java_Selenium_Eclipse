package com.WebTesting.MouseOperations;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class S59_RightClickAction {
  @Test
  public void testRightClickAction()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //button
	  WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //Right click action
	  
	  Actions act=new Actions(driver);
	  act.contextClick(button).perform();
	  
	  //get the menu and click on any one option
	  List<WebElement> allOptions=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  System.out.println("Total options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Copy"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  //alert handling
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt.getText());
	  //ok
	  alt.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}