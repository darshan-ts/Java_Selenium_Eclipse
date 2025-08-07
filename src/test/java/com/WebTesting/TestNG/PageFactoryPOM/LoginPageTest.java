package com.WebTesting.TestNG.PageFactoryPOM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateUrl()
  {
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("https"));
	  System.out.println("Url is in correct format: "+actUrl);
	  
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Labs"));
	  System.out.println("Title is: "+actTitle);
  }
  
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.enterUserName("standard_user");
	  lp.enterPassword("secret_sauce");
	  lp.clickOnLoginButton();
	  
	  //or
	  
	  //lp.doLogin("standard_user","secret_sauce");
	  
	  String exp="inventory";
	  Assert.assertTrue(lp.getAppUrl().contains(exp),"Login Fail!...");
	  System.out.println("User Login Completed!.... ");
	  
	  
  }
}