package com.WebTesting.TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo4_disableTest 
{
	@Test(priority=1)
	  public void registerTest() 
	  {
		  System.out.println("This is register test");
	  }
	  
	  @Test(priority=2)
	  public void loginTest() 
	  {
		  System.out.println("This is login test");
	  }
	  
	  //disable using xml file
	  @Test(priority=3)
	  public void searchTest() 
	  {
		  System.out.println("This is search test");
	  }
	  
	  
	  @Test(priority=4)
	  public void addTocartTest() 
	  {
		  System.out.println("This is add to cart test");
	  }
	  
	  //disable test with argument
	  @Test(priority=5,enabled=false)
	  public void logoutTest() 
	  {
		  System.out.println("This is logout test");
	  }
	  
}