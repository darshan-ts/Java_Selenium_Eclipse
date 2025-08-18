package com.WebTesting.TestNG.DataDrivenTesting_7;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPageScreenshot {
  @Test
  public void testFullPage() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  //timestamp
	  String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	  
	  //full page
	  Screenshot shot=new AShot()
	  .shootingStrategy(ShootingStrategies.viewportPasting(100))
	  .takeScreenshot(driver);
	  
	  //path of folder
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//FullPage"+timestamp+".png");
	  
	  try {
		ImageIO.write(shot.getImage(),"PNG",dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
	  
	  
  }
}