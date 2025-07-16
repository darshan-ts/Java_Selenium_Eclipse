package com.WebTesting.Webtable_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class S41_PaginationWebTableAutomation {
  @Test
  public void testPagination() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("***********Toatal pages***********");
	  
	  List<WebElement> allPages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Total pages in table: "+allPages.size());//4
	  
	  System.out.println("*************Total rows as per pages*******************");
	  int totalRows=0;
	  int pgno=0;
	  for(WebElement i:allPages)
	  {
		  i.click();//page will open
		  pgno++;
		  System.out.println("Current Page number is: "+pgno);
		  //rows
		  int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		  //cells
		  int cells=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td")).size();
		  System.out.println("Per page Total rows are: "+rows);//5
		  System.out.println("Per page total columns are: "+cells);//4
		  totalRows=totalRows+rows;
	  }
	  
	  System.out.println("Total Rows Including all the pages: "+totalRows);//20
	  
	  System.out.println("*************Get the product name for every page***********");
	  
	  int pageno=0;
	  for(WebElement i:allPages)
	  {
		  i.click();//page open
		  pageno++;
		  System.out.println("Current open Page is: "+pageno);
		  List<WebElement> allProduct=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
		  for(WebElement j:allProduct)
		  {
			  System.out.println(j.getText());
		  }
	  }
	  
	  
	  System.out.println("*********Select any one option from table***********");
	  for(WebElement i:allPages)
	  {
		  if(i.getText().contains("3"))
		  {
			  i.click();
			  System.out.println("Page open: "+i.getText());
			  driver.findElement(By.xpath("//td[text()='Fitness Tracker']//following-sibling::td//input[@type='checkbox']")).click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}