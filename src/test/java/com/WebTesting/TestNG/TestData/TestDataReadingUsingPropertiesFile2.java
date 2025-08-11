package com.WebTesting.TestNG.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.PropertiesUtil;

public class TestDataReadingUsingPropertiesFile2 {
  @Test(enabled=false)
  public void testLoginWithoutUtility() throws Exception
  {
	 //read data from file we need path
	  File f1=new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
	  
	  //read a file in stream: FileInputStream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //create object of Properties class
	  Properties p1=new Properties();
	  //load the file
	  p1.load(fs);
	  
	  
	  
	  
	  //create driver session
	 
	  WebDriver driver=new ChromeDriver();
	  driver.get(p1.getProperty("url"));
	  
	  //username
	  
	  driver.findElement(By.id(p1.getProperty("unlocid"))).sendKeys(p1.getProperty("un"));
	  
	  //password
	  driver.findElement(By.id(p1.getProperty("pswlocid"))).sendKeys(p1.getProperty("psw"));
	  
	  //login
	  driver.findElement(By.id(p1.getProperty("loginid"))).click();
  }
  
  
  @Test
  public void testLoginWithUtility()
  {
	  
	  PropertiesUtil p1=new PropertiesUtil("config");
	//create driver session
		 
	  WebDriver driver=new ChromeDriver();
	  driver.get(p1.getData("url"));
	  
	  //username
	  
	  driver.findElement(By.id(p1.getData("unlocid"))).sendKeys(p1.getData("un"));
	  
	  //password
	  driver.findElement(By.id(p1.getData("pswlocid"))).sendKeys(p1.getData("psw"));
	  
	  //login
	  driver.findElement(By.id(p1.getData("loginid"))).click();
  }
}