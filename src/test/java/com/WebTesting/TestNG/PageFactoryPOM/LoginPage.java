package com.WebTesting.TestNG.PageFactoryPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//PageObject=Encapsulation=private data + public method
	private WebDriver driver;
	
	//constructor
		public LoginPage(WebDriver driver)//this driver is from base class
		{
			this.driver=driver;
			//to initialize element
			PageFactory.initElements(driver,this);
		}
	
	
	//Locators(Identification)
	@FindBy(id="user-name") 
	WebElement usernameEle;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordEle;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	//multiple elements
	@FindBy(tagName="a")
	List<WebElement> links;//5
	
	
	//actions
	
	public void numberOfLinks()
	{
		System.out.println(links.size());
		
		for(WebElement i:links)
		{
			System.out.println(i.getText());
		} // this piece of code is related to only line:34-36. Just for reference!
		
		
	}
	public void enterUserName(String un)
	{
		usernameEle.sendKeys(un);
	}
	
	public void enterPassword(String psw)
	{
		passwordEle.sendKeys(psw);
	}
	
	public void clickOnLoginButton()
	{
		loginBtn.click();
	}
	
	
	public void doLogin(String un,String psw)
	{
		usernameEle.sendKeys(un);
		passwordEle.sendKeys(psw);
		loginBtn.click();
		
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	

}