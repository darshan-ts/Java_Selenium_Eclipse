package com.WebTesting.TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDemo5_Assertion 
{
  @Test(enabled=false)
  public void testHardAssertion() 
  {
	  
	  String act="Selenium webdriver is webui automation api";
	  String exp="Testng";
	  //AssertionError
	  //Assert.assertEquals(act,exp,"Test Fail: Strings are not equal!");
	  
	  //Assert.assertTrue(act.contains(exp),"Test Fail: String not match with partial data");
	  
	  //Scenario: Actual string should not contains TestNg
	  
//	  AssertJUnit.assertFalse(act.contains(exp),"Test Fail: String match with partial data"); // Soon after creating Suite, Eclipse by default changes assertion with respect to JUnit. We need to revert only to TestNG Assertion.
	  Assert.assertFalse(act.contains(exp),"Test Fail: String match with partial data");
	  System.out.println("Test Pass: String not match with partial data");
	  System.out.println("---------------");
	  System.out.println("---------------");
	  System.out.println("---------------");
	  
  }
  
  @Test
  public void testSoftAssertion()
  {
	  int a=100,b=204566777;
	  	 
	  SoftAssert sf=new SoftAssert();
	  //sf.assertEquals(a,b,"Test Fail: Numbers are not equal");
	  AssertJUnit.assertTrue(a==b);
	  System.out.println("Test Pass: Numbers are equal");
	  System.out.println("---------------");
	  System.out.println("---------------");
	  System.out.println("---------------");
	  
	  sf.assertAll();
	  
  }
  
  
  
}