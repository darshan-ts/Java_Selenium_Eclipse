package com.WebTesting.TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_description_invocationCount 
{
  @Test(priority=1,description="this is functional test")
  public void registerTest() 
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2,description="this is functional test",invocationCount=3)
  public void loginTest() 
  {
	  System.out.println("This is login test");
  }
  
  
  @Test(priority=3,description="this is regression test")
  public void searchTest() 
  {
	  System.out.println("This is search test");
  }
  
  
  @Test(priority=4)
  public void addTocartTest() 
  {
	  System.out.println("This is add to cart test");
  }
  
  @Test(priority=5)
  public void logoutTest() 
  {
	  System.out.println("This is logout test");
  }
  
}