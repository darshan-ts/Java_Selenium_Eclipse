package com.WebAppTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S01_FirstTest {

	public static void main(String[] args) {
		// create driver session
		WebDriver driver = new EdgeDriver();
		WebDriver driver1 = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver1.get("https://www.whatsapp.com");

	}

}
