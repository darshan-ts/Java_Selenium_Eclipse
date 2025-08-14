package com.WebTesting.TestNG.DataDrivenTesting_7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataDrivenTestDemo1 
{
//	//test data
//	@DataProvider(name="mydata")
//	public Object[][] testData()
//	{
//		Object[][] data={{"Amit","amit123"},{"Kiran","kiran123"},{"Smita","smita123"},{"Jay","jay123"}};
//		return data;
//	}
//	
	
  @Test(dataProvider="mydata",dataProviderClass = CustomData2.class)
  public void testCase(String un,String psw)
  {
	  System.out.println("UserName: "+un);
	  System.out.println("Password: "+psw);
  }
}