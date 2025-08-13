package com.WebTesting.TestNG.TestData;

import org.testng.annotations.Test;

import com.Generic.ExcelUtil;

public class ExcelUtilTest4 {
  @Test
  public void testStringData()
  {
	  String authorName=ExcelUtil.getStringData("Bookdata",2,1);
	  System.out.println("Author name is: "+authorName);
	  
	  String un=ExcelUtil.getStringData("userdata",3,0);
	  System.out.println("User name is: "+un);
	  
  }
  
  @Test
  public void testAsPerDataType()
  {
	 String data=ExcelUtil.getData("Bookdata",2,2);
	 double price=Double.valueOf(data);
	 
	  
	  System.out.println("Price for Selenium book: "+(int)price);
  }
}