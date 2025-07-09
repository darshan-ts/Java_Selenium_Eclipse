package com.WebAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S21_LocatorDemo11_XpathAxies {

	public static void main(String[] args) {
		// Create Driver Session

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://automationplayground.com/crm/customers.html?email-name=sdasdsd%40gmail.com&password-name=zdfasd&submit-name=");

		System.out.println("Scenario1: get Parent tag name for John element");
		String parent = driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent TagName for John element is: " + parent); // tr

		System.out.println("Scenario2: get Grand parent tag name for John element");
		String grandparent = driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("GrandParent TagName for John element is: " + grandparent); // tbody

		System.out.println("Scenario3: get number of childs for row 2");
		// int childcount =
		// driver.findElements(By.xpath("//tbody//tr[2]//child::td")).size(); //Both
		// syntax works fine(We are learning Xpath axies so both syntax will work)
		int childcount = driver.findElements(By.xpath("//tbody//tr[2]//td")).size();
		System.out.println("Total Childs for row number 2 are: " + childcount);// 5

		System.out.println("Scenario4: after John all remaining rows:following");
		int rows = driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		System.out.println("After John element total number of rows are: " + rows);// 2

		// assignment
		System.out.println("Scenario5: after Ashley get all remaining data count:following");
		int datacount = driver.findElements(By.xpath("//td[text()='Ashley']//following::td")).size();
		System.out.println("after Ashley all remaining data count are: " + datacount);// 23

		System.out.println("Scenario6: after Ashley get all siblings");
		int after_siblings = driver.findElements(By.xpath("//td[text()='Ashley']//following-sibling::td")).size();
		// String after_siblings =
		// driver.findElement(By.xpath("//td[text()='Ashley']//following-sibling::td")).getText();
		System.out.println("After Ashley all siblings are: " + after_siblings);// 3

		System.out.println("Scenario7: Before Ashley get all siblings");
		int before_siblings = driver.findElements(By.xpath("//td[text()='Ashley']//preceding-sibling::td")).size();
		// String before_siblings =
		// driver.findElement(By.xpath("//td[text()='Ashley']//preceding-sibling::td")).getText();
		System.out.println("Before Ashley all siblings are: " + before_siblings);// 1

		System.out.println("Scenario8: Before Ashley get all rows count");
		int before_row_count = driver.findElements(By.xpath("//td[text()='Ashley']//preceding::tr")).size();
		System.out.println("Before Ashley all rows count are: " + before_row_count);// 2

		System.out.println("Scenario9: Before Ashley get all data count");
		int before_data_count = driver.findElements(By.xpath("//td[text()='Ashley']//preceding::td")).size();
		System.out.println("Before Ashley all data count are: " + before_data_count);// 6

	}

}
