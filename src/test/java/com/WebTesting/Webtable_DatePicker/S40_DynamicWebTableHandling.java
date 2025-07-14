package com.WebTesting.Webtable_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S40_DynamicWebTableHandling {
  @Test
  public void testDynamicTable()
  {
	//create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("***********Headings*************");
	  
	 List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@id='taskTable']//thead//tr//th"));
	 
	 System.out.println("Total Headings are: "+allHeadings.size());
	 for(WebElement i:allHeadings)
	 {
		 System.out.println(i.getText());
	 }
	 
	 System.out.println("**********Total Rows***********");
	 int rows=driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
	 System.out.println("Total rows including heading: "+rows);//5
	 
	 System.out.println("*******Total Columns***********");
	System.out.println("Number of columns: "+driver.findElements(By.xpath("//table[@id='taskTable']//tr[2]//td")).size());
	
	 
  }
}