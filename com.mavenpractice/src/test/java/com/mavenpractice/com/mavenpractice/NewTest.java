package com.mavenpractice.com.mavenpractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public static WebDriver Netflix = null;
  @Test
  public void f() {
	  
	  
	  Homepage_2 net = new Homepage_2(Netflix);
	  net.netflix("idontcare@gmail.com","solomon");
	  
  }
  
  @AfterMethod
  public void shot() throws Exception {
	  
	  boolean abc= true;
	  if (abc) {
	  
	 TakesScreenshot a = (TakesScreenshot)Netflix;
	 
	File source = a.getScreenshotAs(OutputType.FILE);
	String folder = "C:\\Users\\solom\\eclipse-workspace\\com.mavenpractice\\screehshot\\";
	FileUtils.copyFile(source, new File(folder+"netflix.png"));
	
	System.out.println("screenshot taken");
	  }
	  
	  
  }

	  @BeforeClass
	  public void beforeClass() {
		  
		  
			System.setProperty("webdriver.chrome.driver","C:\\Users\\solom\\eclipse-workspace\\selenium_dem\\Driver\\chromedriver.exe");
		Netflix= new ChromeDriver();
			String url = "http://www.Netflix.com";
			Netflix.get(url);
		  
  }

  @AfterClass
  public void afterClass() {
	  
	  Netflix.quit();
	  
}

}
