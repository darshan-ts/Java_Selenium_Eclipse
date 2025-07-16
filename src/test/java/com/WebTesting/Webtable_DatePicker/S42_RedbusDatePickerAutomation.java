package com.WebTesting.Webtable_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S42_RedbusDatePickerAutomation {
  @Test
  public void testCalendar()
  {
	  //create driver session
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //expectation
	  String expDate="6";
	  String expMonth="August";
	  String expYear="2025";
	  
	  //open calendar
	  driver.findElement(By.xpath("//span[text()='Date of Journey']")).click();
	  
	  //month selection
	  while(true)
	  {
		  //get the current month
		  String text=driver.findElement(By.xpath("//p[contains(@class,'monthYear')]")).getText();
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
			  driver.findElement(By.xpath("(//i[contains(@class,'icon-arrow')])[2]")).click();
		  }
		  
	  }
	  
	  
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("//ul[contains(@class,'datesWrap')]//li//div[contains(@class,'date___')]//span"));
	 
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