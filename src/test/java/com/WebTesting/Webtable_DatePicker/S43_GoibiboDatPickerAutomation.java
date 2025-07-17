package com.WebTesting.Webtable_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S43_GoibiboDatPickerAutomation {
  @Test
  public void testCalendar()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/flights/");
	  driver.manage().window().maximize();
	  
	  //close popup
	  driver.findElement(By.xpath("//span[contains(@class,'icClose')]")).click();
	  
	   
	  
	  //expectation
	  String expDate="6";
	  String expMonth="April";
	  String expYear="2026";
	  
	  //open calendar
	  driver.findElement(By.xpath("(//span[contains(@class,'swDownArrow')])[1]")).click();
	  
	  //month selection
	  while(true)
	  {
		  //get the current month
		  String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		  //System.out.println(text);
		  String currMonth=text.split(" ")[0];
		  String currYear=text.split(" ")[1];
//		  System.out.println("Current month is: "+currMonth);
//		  System.out.println("Current year is: "+currYear);
		  
		  if(currMonth.contains(expMonth) && currYear.contains(expYear))
		  {
			  //found month
		      break;
		  }else
		  {
			  //click on arrow
			  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		  }
		  
	  }
	  
	  
	  
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[contains(@class,'DayPicker-Day')]"));
	 
	  for(WebElement date:allDates)
	  {
		  if(date.getText().contains(expDate))
		  {
			  date.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}