package com.WebTesting.TestNG.Annotations;

import org.testng.annotations.*;


public class AnnotationTest1
{
  @Test
  public void testCase1() 
  {
	  System.out.println("TestCase 1 is executing.....");
  }
  
  @Test
  public void testCase2() 
  {
	  System.out.println("TestCase 2 is executing.....");
  }
  
  
  @Test
  public void testCase3() 
  {
	  System.out.println("TestCase 3 is executing.....");
  }
  
  //Annotation
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("BeforeMethod runs before every test case!");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("AfterMethod runs after every test Case!");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("BeforeClass runs before first test case in class");
	  
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("AfterClass runs after last test case in class");
	  
  }
  
}