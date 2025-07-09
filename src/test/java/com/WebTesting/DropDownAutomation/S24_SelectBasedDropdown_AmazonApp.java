package com.WebTesting.DropDownAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class S24_SelectBasedDropdown_AmazonApp {
  @Test
  public void testDropdown() throws InterruptedException {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in/");
	  
	  //get the address of dropdown<select>
	  WebElement ddele=driver.findElement(By.id("searchDropdownBox"));
	  
	  //create object for Select class
	  Select dd=new Select(ddele);
	  
	  System.out.println("Is dropdown support multiple selection ?: "+dd.isMultiple());//false
	  
	  //select any single option
	  dd.selectByIndex(4);//indexing
	  
	  //static wait in selenium
	  Thread.sleep(2000);
	  
	  dd.selectByVisibleText("Computers & Accessories");//full text
	  	  
	  //static wait in selenium
	  Thread.sleep(2000);
	 //If dropdown is supporting multiple selection
	  // dd.selectByContainsVisibleText("Accessories");//partial match
	  
	  dd.selectByValue("search-alias=gift-cards");//value attribute 
	  
	  //get all the option:getOptions():List<WebElement>
	  
	  List<WebElement> allOptions=dd.getOptions();
	  
	  System.out.println("Total options are: "+allOptions.size());
	  
	  String exp="Video Games";
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains(exp))
		  {
			  i.click();
			  break;
		  }
	  }
	  
  }
}
