package com.WebAppTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S03_GoogleTitleValidation {
	
	public static void main(String[] args)
	{
		/*
		 * Scenario: Get the title of google page and 
		 * validate.
		 * expected title is: Google
		 */

		//create driver session
		WebDriver driver=new ChromeDriver();
		
		//open google application
		driver.get("https://www.google.com/");
		
		//get the current page title
		String actTitle=driver.getTitle();
		
		String expTitle="Google";
		
		//validate
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title is matched...Test Pass!");
		}else
		{
			System.out.println("Title is not matched...Test Fail!");

		}
		
		//close the browser window
		driver.quit();

}}
