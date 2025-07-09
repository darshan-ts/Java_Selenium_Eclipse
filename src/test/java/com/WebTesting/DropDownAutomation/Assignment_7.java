package com.WebTesting.DropDownAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class Assignment_7 {
  @Test
  public void dropdown() {
//	  Write Automation script to fill the form
//	  https://register.rediff.com/register/register.php?FormName=user_details
//	  automate input boxes,checkboxes,dropdown
	  
	//create driver session
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
	  //Enter Full name
	  driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("Darshan T S");
	  
	  //Enter email id
	  //driver.findElement(By.cssSelector("input#login8cb56c57")).sendKeys("test123");
	  //driver.findElement(By.name("login07c3b1ad")).sendKeys("test123");
	  //driver.findElement(By.xpath("//input[@id='login9d1662e4']")).sendKeys("testqwe");
	  driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']")).sendKeys("test123");//This also works
	  
	  //Enter keyword into search box which is right side of 'Choose a Rediffmail ID' text
	  //driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Enter Rediffmail ID']")).toRightOf(By.xpath("//label[text()='Choose a Rediffmail ID']"))).sendKeys("hi");
	  
	  
	  //Enter password
	  driver.findElement(By.id("newpasswd")).sendKeys("123456");
	  
	  //Retype Password
	  driver.findElement(By.id("newpasswd1")).sendKeys("123456");
	  
	  //Day dropdown
	  WebElement day_dropdown=driver.findElement(By.className("day"));
	  Utility.selectBasedDropdown(day_dropdown, "14");
	  
	  //Month dropdown
	  WebElement month_dropdown=driver.findElement(By.className("month")); //middle month-compound class names not permitted
	  Utility.selectBasedDropdown(month_dropdown, "MAR");
	  
	  //Year dropdown
	  WebElement year_dropdown=driver.findElement(By.className("year"));
	  Utility.selectBasedDropdown(year_dropdown, "1994");
	  
	  //Select Country
	  WebElement I_live_in=driver.findElement(By.id("country"));
	  Utility.selectBasedDropdown(I_live_in, "Singapore");
	  
	//Select City
//	  WebElement city=driver.findElement(By.xpath("//select[@onchange='showothcity();fieldTrack(this);']"));
//	  Utility.selectBasedDropdown(city, "Bangalore");
//	  
	  //My Recovery Email ID
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test@gmail.com");
	  
	  //Click on Checkbox
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  
	  //Select a Security Question
	  //WebElement security_question=driver.findElement(By.xpath("//select[@onchange='fieldTrack(this);'][1]"));
//	  WebElement security_question= driver.findElement(RelativeLocator.with(By.xpath("//select[@onchange='fieldTrack(this);']")).toRightOf(By.xpath("//label[text()='Select a Security Question']")));
//	  Utility.selectBasedDropdown(security_question, "What is your favourite food?");
	  WebElement security_question=driver.findElement(By.xpath("//div[@id='div_hintQS']//select")); //div[@id='div_hintQS']//div)[1]//select
	  Select sc=new Select(security_question);
	  sc.selectByVisibleText("What is your favourite food?");
	  //Utility.selectBasedDropdown(security_question, "What is your exact time of birth?");
	  
	  //Enter an answer
	  driver.findElement(By.xpath("//div[@id='div_hintQS']//div[2]//input")).sendKeys("123456");
	  
	  //Mother's Maiden Name
	  driver.findElement(By.xpath("//div[@id='div_hintQS']//div[3]//input")).sendKeys("abcd");
	  
	  //Enter mobile number
	  driver.findElement(By.id("mobno")).sendKeys("7363739823");
	  
	  
	  
	  

  }
}
