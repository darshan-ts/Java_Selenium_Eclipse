package com.WebTesting.TestNG.ByLocatorPOM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateURL() 
  {//LoginPage lp=new LoginPage(driver);
	  String actUrl=lp.getAppUrl();
	  String expUrl="login";
	  Assert.assertTrue(actUrl.contains(expUrl),"Url not mathced!");
	  System.out.println("Url Matched!");
	  
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {//LoginPage lp=new LoginPage(driver);
	 	  String actTitle=lp.getAppTitle();
	 	  String expTitle="Account Login";
	 	  Assert.assertEquals(actTitle,expTitle,"Title not mathced!");
	 	  System.out.println("Title matched!");
  }
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  //LoginPage lp=new LoginPage(driver);
//	  lp.enterEmailId("test24@gmail.com");
//	  lp.enterPassowrd("test123");
//	  lp.clickLoginButton();
	  lp.completeLogin("test24@gmail.com","test123");
	  String expUrl="account/account";
	  Assert.assertTrue(lp.getAppUrl().contains(expUrl),"Login Fail");
	  System.out.println("Login completed successfully!");
  }
}