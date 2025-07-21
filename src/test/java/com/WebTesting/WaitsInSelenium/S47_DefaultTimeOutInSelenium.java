package com.WebTesting.WaitsInSelenium;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class S47_DefaultTimeOutInSelenium {
  @Test
  public void testDefaultTimeOut() 
  {
	  
	  //get the capability
	  
	 // timeouts={implicit=0, pageLoad=300000, script=30000},
	  
	 //create driver session or chrome
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
	  
	  
	  driver.get("https://www.freshworks.com/demo/");
	  //Capabilities is interface in selenium
	  Capabilities cap=driver.getCapabilities();
	  Map<String,Object> allCap=cap.asMap();
	  
	  System.out.println(allCap);
	  
	  /*{acceptInsecureCerts=false,
	   *  browserName=chrome, 
	   *  browserVersion=138.0.7204.158, 
	   *  chrome={chromedriverVersion=138.0.7204.157 (e533e98b1267baa1f1c46d666b120e64e5146aa9-refs/branch-heads/7204@{#2046}), 
	   *  userDataDir=C:\Users\piyun\AppData\Local\Temp\scoped_dir2284_1123986635},
	   *   fedcm:accounts=true,
	   *    goog:chromeOptions={debuggerAddress=localhost:52012},
	   *     networkConnectionEnabled=false,
	   *      pageLoadStrategy=normal, 
	   *      platformName=windows, 
	   *      proxy=Proxy(),
	   *       se:cdp=ws://localhost:52012/devtools/browser/fc961e90-aa41-486a-afd9-525cef70c81e,
	   *        se:cdpVersion=138.0.7204.158, 
	   *        setWindowRect=true, strictFileInteractability=false, 
	   *        timeouts={implicit=0, pageLoad=300000, script=30000},
	   *         unhandledPromptBehavior=dismiss and notify, 
	   *         webauthn:extension:credBlob=true, 
	   *         webauthn:extension:largeBlob=true,
	   *   webauthn:extension:minPinLength=true,
	   *  webauthn:extension:prf=true,
	   *   webauthn:virtualAuthenticators=true}
	   * 
	   * 
	   * 
	   */
	  
	  
  }
}