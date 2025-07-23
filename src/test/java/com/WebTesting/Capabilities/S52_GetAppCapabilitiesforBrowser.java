package com.WebTesting.Capabilities;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class S52_GetAppCapabilitiesforBrowser {
	@Test
	public void testCapabilities() {
		// chrome
		ChromeDriver driver1 = new ChromeDriver();
		Capabilities cap1 = driver1.getCapabilities();
		Map<String, Object> allCap1 = cap1.asMap();
		System.out.println(allCap1);

		System.out.println("-------------------------------------");

		// edge
		EdgeDriver driver2 = new EdgeDriver();
		Capabilities cap2 = driver2.getCapabilities();
		Map<String, Object> allCap2 = cap2.asMap();
		System.out.println(allCap2);
		System.out.println("-------------------------------------");

		// firefox
		FirefoxDriver driver3=new FirefoxDriver();
		Capabilities cap3=driver3.getCapabilities();
		Map<String,Object> allCap3=cap3.asMap();
		System.out.println(allCap3);

	}
}