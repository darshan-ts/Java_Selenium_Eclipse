package com.WebTesting.TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo7_timeouts 
{
  @Test(timeOut = 7000)
  public void testCase1() throws InterruptedException
  {
	  System.out.println("This is test1");
	  Thread.sleep(5000);
  }
  
  
  @Test(timeOut = 5000)
  public void testCase2() throws InterruptedException
  {
	  System.out.println("This is test2");
	  Thread.sleep(6000);
  }
}