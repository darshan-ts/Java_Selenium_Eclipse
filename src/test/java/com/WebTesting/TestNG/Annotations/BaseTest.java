package com.WebTesting.TestNG.Annotations;

import org.testng.annotations.*;

public class BaseTest
{
	//beforeTest and beforeSuite
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("BeforeTest runs before class.......");
	}

	
	@AfterTest
	public void tearDown()
	{
		System.out.println("AfterTest runs after class.......");
	}
	
	//suite
	
	@BeforeSuite
	public void projConfig()
	{
		System.out.println("BeforeSuite runs before test.....");
	}
	
	
	@AfterSuite
	public void projReports()
	{
		System.out.println("AfterSuite runs after test.....");
	}
	
	
	
	
}