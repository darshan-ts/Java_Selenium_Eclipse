package com.WebTesting.TestNG.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelFileReading3 {
  @Test
  public void readFile() throws IOException
  {
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //read file in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Excelfile: Wb-->sheet-->row-->cell-->data
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Total rows are: "+rows);//5
	  
	  //number of cells
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Total cells are: "+cells);//2
	  
	  //create storage with Array
	  Object[][] arr=new Object[rows-1][cells];//skip the heading and read only 4 rows
	  
	  //read the file data and store it into array
	  for(int i=1;i<rows;i++)//row5
	  {
		  for(int j=0;j<cells;j++)//cells2
		  {
			  //arr[i-1]: we are skipping the heading and store the value at 0th position
			  arr[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(arr[i-1][j]+"   ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  //this is to single entry/record from file
	  
//	  XSSFSheet sheet1=wb.getSheet("userdata");
//	  XSSFRow row5=sheet1.getRow(4);//row 3
//	  XSSFCell cell2=row5.getCell(1);//1st cell
	  
	  //String heading= wb.getSheet("userdata").getRow(0).getCell(0).getStringCellValue();
	 // String password=cell2.getStringCellValue();
	  //System.out.println("Password is: "+password);//amit123
	  //System.out.println("heading: "+heading);
	  
	  
	  
	  
	  
  }
}