package com.WebAppTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S16_LocatorDemo10_XpathMethods {

	public static void main(String[] args) throws InterruptedException
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//maximize browser
		driver.manage().window().maximize();
		
		//fashion:xpath with text()
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		
		//click on Cart: xpath with normalize-space()
		driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
		
		//cart message : xpath with normalize-space()
		String cartMessage=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println(cartMessage);
		
		
		//search box:watch: xpath with contains()
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("watch",Keys.ENTER);
		
		//get the any keyword result text
		WebElement result=driver.findElement(By.xpath("//div[contains(@class,'s-breadcrumb-header-text')]"));
		System.out.println("Result: "+result.getText());
		
		//clear the result->search for Bags
		WebElement searchEle=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		
		//clear text
		searchEle.clear();
		
		
		searchEle.sendKeys("bags",Keys.ENTER);
		
		Thread.sleep(2000);
		
		//result
		try {
			WebElement result2=driver.findElement(By.xpath("//div[contains(@class,'s-breadcrumb-header-text')]"));

		System.out.println("Result: "+result2.getText());
		}catch(StaleElementReferenceException s)
		{
			
		}
		
		
		

	}

}