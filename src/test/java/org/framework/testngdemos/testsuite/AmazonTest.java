package org.framework.testngdemos.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
  @Test
  public void amazonSearch()
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\chromedriver.exe");
	  WebDriver driverobj = new ChromeDriver();
	  driverobj.manage().window().maximize();
	  driverobj.get("http://amazon.com");
	  
	  //SearchTEXTBOX VALUE
	  driverobj.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
	  
	  //CLICK ON SEARCH BUTTON
	 driverobj.findElement(By.id("nav-search-submit-button")).click();
	  
	 Reporter.log("Amazon Search is successful",true);
  }
}
