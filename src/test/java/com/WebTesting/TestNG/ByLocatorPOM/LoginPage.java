package com.WebTesting.TestNG.ByLocatorPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	/*
	 * PageObject=Encapsulation=private data + public method
	 * 
	 * constructor: to initialize driver
	 * Locator: By class
	 * Action: Methods
	 */

	private WebDriver driver;
	
	
	//constructor
	public LoginPage(WebDriver driver)//driver from base class we can pass
	{
		this.driver=driver;
	}
	
	
	//Locator
	private By emailEle=By.id("input-email");
	private By passwordEle=By.name("password");
	private By loginBtn=By.xpath("//input[@value='Login']");
	
	
	//Methods(Actions)
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public void enterEmailId(String emailId)
	{
		driver.findElement(emailEle).sendKeys(emailId);
		
	}
	
	public void enterPassowrd(String password)
	{
		driver.findElement(passwordEle).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginBtn).click();
	}
	
	
	public void completeLogin(String emailId,String password)
	{
		driver.findElement(emailEle).sendKeys(emailId);
		driver.findElement(passwordEle).sendKeys(password);
		driver.findElement(loginBtn).click();
		//return  next page object
		
	}
	
	
}