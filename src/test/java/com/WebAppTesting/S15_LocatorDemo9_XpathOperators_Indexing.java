package com.WebAppTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S15_LocatorDemo9_XpathOperators_Indexing 
{
	
	public static void main(String args[])
	{
		
		//create a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//first name: xpath with and operator
		driver.findElement(By.xpath("//input[@name='firstname' and @class='form-control']")).sendKeys("Ravi");
		
		//last name : xpath with or operator
		driver.findElement(By.xpath("//input[@id='input-lastname' or @class='form']")).sendKeys("Kanta");
		
		//email: xpath with index
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("ravi202512@gmail.com");
		
		//telephone: xpath with positon()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=4]")).sendKeys("9877665");
		
		//password: xpath with position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		
		//confirm password: xpath with index
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("test123");
		
		//radio : scenario: check if radio button is not selected then click on it
		WebElement radiobutton=driver.findElement(By.xpath("(//input[@name='newsletter'])[1]"));
		System.out.println("Status: Is yes radio button is selected/checked: "+radiobutton.isSelected());
		
		if(!radiobutton.isSelected())
		{
			radiobutton.click();
		}
				
		//checkbox
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
			
		//continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		//validate confirmation message
		String expText="Your Account Has Been Created!";
		String actText=driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		
		if(actText.equals(expText))
		{
			System.out.println("User registration is completed..."+actText);
		}
		else
		{
			System.out.println("Registration is Fail: "+actText);
			String errormsg=driver.findElement(By.cssSelector("div.alert-danger")).getText();
			System.out.println("Error message: "+errormsg);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}