package com.WebTesting.DropDownAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class S25_SelectBasedDropdown_Facebook {
  @Test
  public void testDropdown()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  //click on Create new account
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day dropdown
	  WebElement daydd=driver.findElement(By.id("day"));
	  Utility.selectBasedDropdown(daydd,"14");
	  
	  //month
	  WebElement monthdd=driver.findElement(By.id("month"));
	  Utility.selectBasedDropdown(monthdd,"Nov");
	  
	  
	  //year
	  WebElement yeardd=driver.findElement(By.id("year"));
	  Utility.selectBasedDropdown(yeardd,"1994");
	  
	  
//	  Select daydd=new Select(ele1);
//	  System.out.println("Is dropdown support multipleSelection: "+daydd.isMultiple());
//	  
//	  List<WebElement> allOptions=daydd.getOptions();
//	  System.out.println("Total options are: "+allOptions.size());
//	  
//	  for(WebElement i:allOptions)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("27"))
//		  {
//			  i.click();
//			  break;
//		  }
//	  }
	  
	  //System.out.println("---------------------------");
	  //Month dd
	  
	  //WebElement ele2=driver.findElement(By.id("month"));
	
	
	   //Year dd
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}