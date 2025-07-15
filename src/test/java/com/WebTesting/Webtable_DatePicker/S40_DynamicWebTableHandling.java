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
	
System.out.println("**********Specific Column************");
	
	int cellCount=0;
	String expCell="CPU (%)";
	for(WebElement i:allHeadings)
	{
		cellCount++;
		if(i.getText().contains(expCell))
		{
			System.out.println(expCell+" matched at column number: "+cellCount);
			List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cellCount+"]"));
			for(WebElement j:cellData)
			{
				System.out.println(j.getText());
			}
			
		}
	}
	
	
	
	System.out.println("**********Specific Row************");

	
	int cellNo=0;
	int rowNo=0;
	String expHeading="Name";
	String expBname="Chrome";
	
	for(WebElement heading:allHeadings)
	{
		cellNo++;
		if(heading.getText().contains(expHeading))
		{
			System.out.println(expHeading+" found at column number: "+cellNo);
			//get all the data
			List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cellNo+"]"));
			for(WebElement cell:cellData)
			{
				rowNo++;
				if(cell.getText().contains(expBname))
				{
					System.out.println(expBname+" found at row number: "+rowNo);
					List<WebElement> rowData=driver.findElements(By.xpath("//table[@id='taskTable']//tr["+rowNo+"]//td"));
					for(WebElement row:rowData)
					{
						System.out.println(row.getText());
						if(row.getText().contains("%"))
						{
							System.out.println("CPU load: "+row.getText());
						}
					}
					
				}
			}
			
		}
	}
	
	System.out.println("*********Given Scenarios************");
	/*
	 * CPU load of Chrome process: 7.4%

Memory Size of Firefox process: 65.7 MB

Network speed of Chrome process: 7.3 Mbps

Disk space of Firefox process: 0.09 MB/s
	 */
	
	
	//heading-->row-->data--->get that specific entry-->condition test
	int cell=0,row=0;
	String expHead="Name",expBrowser="Chrome";
	for(WebElement i:allHeadings)
	{
		cell++;
		if(i.getText().contains(expHead))//Name
		{
			System.out.println(expHead+" found at column number: "+cell);
			List<WebElement> cellData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cell+"]"));
			for(WebElement cData:cellData)
			{
				row++;
				if(cData.getText().contains(expBrowser))//Chrome
				{
					System.out.println(expBrowser+" found at row number: "+row);
					//driver.findElements(By.xpath("//table[@id='taskTable']//tr["+row+"]//td"));
					String tableCPULoad=driver.findElement(By.xpath("//td[text()='Chrome']//following-sibling::td[contains(text(),'%')]")).getText();
					String actCPULoad=driver.findElement(By.xpath("(//div[@id='displayValues']//p//strong)[1]")).getText();
					String actSpeed=driver.findElement(By.xpath("//td[text()='Chrome']//following-sibling::td[contains(text(),'Mbps')]")).getText();
					String expSpeed=driver.findElement(By.xpath("(//div[@id='displayValues']//p//strong)[3]")).getText();
					if(actCPULoad.contains(tableCPULoad) && actSpeed.contains(expSpeed))
					{
						System.out.println("CPU load  & Network Speed matched!: "+tableCPULoad+" : "+actSpeed);
					}else
					{
						System.out.println("CPU load & NetworkSpeed not matched!: "+tableCPULoad+" : "+actSpeed );

					}
		
			}
		}
	}
	
	
	
	
	
	}
	 
  }
}