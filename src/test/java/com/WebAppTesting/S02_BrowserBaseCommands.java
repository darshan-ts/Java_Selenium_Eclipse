package com.WebAppTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S02_BrowserBaseCommands {

	public static void main(String[] args) {
		// create driver session with chrome
		WebDriver driver = new ChromeDriver();

		// get(url):open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// to get the current page title :getTitle():String
		String actTitle = driver.getTitle();
		System.out.println("Title is: " + actTitle);

		// to get current url of page: getCurrentUrl()
		String curl = driver.getCurrentUrl();
		System.out.println("Current url is: " + curl);

		// to get any page source code: getPageSource()
		System.out.println(driver.getPageSource());

		// to close any browser window :close() or quit()
		// driver.close();
		driver.quit();

	}

}
