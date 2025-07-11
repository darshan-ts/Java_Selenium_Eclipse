package com.WebAppTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S18_Menu_ListAutomation {

	public static void main(String[] args)
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='list-group']//a"));
		System.out.println("Total options are: "+allOptions.size());
		
		String exp="Forgotten Password";
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(exp))
			{
				System.out.println("Expected option found!...Test Pass");
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}