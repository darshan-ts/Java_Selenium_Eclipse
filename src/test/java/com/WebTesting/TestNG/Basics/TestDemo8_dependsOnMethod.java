package com.WebTesting.TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo8_dependsOnMethod 
{
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2, dependsOnMethods="registerTest")
  public void loginTest() 
  {
	  System.out.println("This is login test");
//	  AssertJUnit.assertEquals(false, true, "Fail as values are not equal"); // Soon after creating Suite, Eclipse by default changes assertion with respect to JUnit. We need to revert only to TestNG Assertion.
	  Assert.assertEquals(false, true, "Fail as values are not equal");
	  
  }
  
  //Based on loginTest logout is executing. Since previous test got failure, logoutTest is skipped
  @Test(priority=3,dependsOnMethods="loginTest")
  public void logoutTest() 
  {
	  System.out.println("This is logout test");
  }
}
