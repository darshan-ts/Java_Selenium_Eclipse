package com.WebAppTesting;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class S04_NavigationCommands {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, URISyntaxException
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");

		//get the title and print in console
		System.out.println("Application title is: "+driver.getTitle());
		
		//Navigate to facebook application- to(url)
		
		driver.navigate().to("https://www.facebook.com");
		
		//get the title and print in console
		System.out.println("Application title is: "+driver.getTitle());
		
		//static wait(Java)
		Thread.sleep(2000);
		
		//back()
		driver.navigate().back();//google
		
		//static wait(Java)
		Thread.sleep(2000);
		
		//forward()
		driver.navigate().forward();
		
		//static wait(Java)
		Thread.sleep(2000);
		
		//refresh()
		driver.navigate().refresh();
		
		//server address/External address; to(URL url)
//		URL url=new URI("http://0.0.0.0:4723").toURL();
//		
//		driver.navigate().to(url);
		
				
		//Selenium 4 version -newWindow()
//		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
//		newTab.get("https://www.amazon.in");
		
		
		
		
		
		

	}

}