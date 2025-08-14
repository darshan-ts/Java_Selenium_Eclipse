package com.WebTesting.TestNG.DataDrivenTesting_7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData2 
{
	
	public XSSFWorkbook wb;
	
	//test data
		@DataProvider(name="mydata")
		public Object[][] testData()
		{
			Object[][] data={{"Admin","admin123"},{"Kiran","kiran123"},{"Admin","admin123"},{"Jay","jay123"}};
			return data;
		}
		
		@DataProvider(name="exceldata")
		public Object[][] excelData()
		{
			//file path
			  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
			  
			  //read file in stream
			  FileInputStream fs;
			  Object[][] arr=null;
			  
			try {
				fs = new FileInputStream(f1);
				 
			 //Excelfile: Wb-->sheet-->row-->cell-->data
				 wb=new XSSFWorkbook(fs);
				//number of rows
				  int rows=wb.getSheet("HRM").getPhysicalNumberOfRows();
				  System.out.println("Total rows are: "+rows);//5
				  
				  //number of cells
				  int cells=wb.getSheet("HRM").getRow(0).getPhysicalNumberOfCells();
				  System.out.println("Total cells are: "+cells);//2
				  
				  //create storage with Array
				   arr=new Object[rows-1][cells];//4 2//skip the heading and read only 4 rows
				  
				  //read the file data and store it into array
				  for(int i=1;i<rows;i++)//row5
				  {
					  for(int j=0;j<cells;j++)//cells2
					  {
						  //arr[i-1]: we are skipping the heading and store the value at 0th position
						  arr[i-1][j]=wb.getSheet("HRM").getRow(i).getCell(j).getStringCellValue();
						  
					  }
					  
				  }
				  
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 		  
			  //return data
			  return arr;
			  
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

}