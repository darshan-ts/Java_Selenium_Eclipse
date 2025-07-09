package com.WebTesting.DropDownAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class S27_DropdownAllOptions {
  @Test
  public void f() 
  {
	//create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in/");
	  
	  //get the address of dropdown<select>
	  WebElement ddele=driver.findElement(By.id("searchDropdownBox"));
	  
	  Select dd=new Select(ddele);
	  
	  List<WebElement> allOptions=dd.getOptions();
	  
	  WebElement ele=null;
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Books"))
		  {
			  //i.click();
			  //break;
			  
			  //if element found hold it into variable
			  ele=i;
			  
		  }
	  }
	  
	  //click on ele
	  ele.click();
	  
	  
	  
	  
	  
	  
  }
}