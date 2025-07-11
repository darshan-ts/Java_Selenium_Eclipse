package com.WebAppTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S09_NaukariScenario {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.naukri.com/it-jobs?src=gnbjobs_homepage_srch");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+allLinks.size());
		
		String expLink="https://www.naukri.com/jobs-in-pune";
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getDomAttribute("href"));
			System.out.println(link.getText());
			try {
			if(link.getDomAttribute("href").contains(expLink))
			{
				System.out.println("Link found...Test Pass!");
				break;
			}
			}catch(NullPointerException a)
			{
				System.out.println("href is null.....");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}