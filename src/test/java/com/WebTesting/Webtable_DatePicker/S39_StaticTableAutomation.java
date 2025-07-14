package com.WebTesting.Webtable_DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class S39_StaticTableAutomation 
{
	public static void getColumnData(WebDriver driver,int cell)
	{
		System.out.println("Data found for coulmn number: "+cell);
		List<WebElement> allCellData=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td["+cell+"]"));
		  for(WebElement i:allCellData)
		  {
			  System.out.println(i.getText());
		  }
		  
	}
  @Test
  public void testStaticTable() 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  System.out.println("*********Number of heading**********");
	  
	  List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));
	  
	  System.out.println("Number of headings are: "+allHeadings.size());
	  
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
		  
	  
	  System.out.println("*********Number of rows**********");
	  int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Number of rows including heading: "+rows);//7
	  
	  System.out.println("*********Number of columns**********");
	  int cells=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td")).size();
	  System.out.println("Number of columns are: "+cells);//4
	  
	  System.out.println("************Specific columns data***********");
//	  List<WebElement> allCellData=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[1]"));
//	  for(WebElement i:allCellData)
//	  {
//		  System.out.println(i.getText());
//	  }
//	  
	  getColumnData(driver,4);
	  
	  
	  System.out.println("************Specific row data***********");

	  int row=5;
	  List<WebElement> specRowData=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr["+row+"]//td"));
	  System.out.println("Data found for row number: "+row);
	  for(WebElement i:specRowData)
	  {
		  System.out.print(i.getText()+" ");
	  }
	  
	  System.out.println("************All Data from the Table***********");
	  
	  
	 List<WebElement> allData=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));
	  for(WebElement i:allData)
	  {
		  System.out.print(i.getText()+"  ");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
}