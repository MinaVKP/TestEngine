package org.framework.testngdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class UsingAnnotationsDemo {
	WebDriver driver;
 
 
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
  }
  
  @Test
  public void EbaySearchTest() {
	  
	  //Search Text
	  driver.findElement(By.id("gh-ac")).sendKeys("Selenium WebDriver");;
	  
	  //Select drop down list
	  
	  WebElement drpdwn = driver.findElement(By.id("gh-cat"));
	  
	  Select s = new Select(drpdwn);
	  s.selectByVisibleText("Books");
	  
	  driver.findElement(By.id("gh-btn")).click();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
