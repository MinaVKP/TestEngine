package org.framework.testngdemos.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayTest {
  @Test
  public void EbaySearch()
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\chromedriver.exe");
	  WebDriver driverobj = new ChromeDriver();
	  driverobj.manage().window().maximize();
	  driverobj.get("http://ebay.com");
	  
	  //SearchTEXTBOX VALUE
	  driverobj.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys("LG");
	  
	  //CLICK ON DROP DOWN LIST
	 WebElement drpdwn = driverobj.findElement(By.xpath("//*[@id=\'gh-cat\']"));
	 Select s = new Select(drpdwn);
	 s.selectByVisibleText("Cell Phones & Accessories");
	 
	 //CLICK ON THE SEARCH BUTTON
	 driverobj.findElement(By.xpath("//*[@id='gh-btn']")).click();
	 
	  
	 Reporter.log("Ebay Search is successful",true);
  }
}
