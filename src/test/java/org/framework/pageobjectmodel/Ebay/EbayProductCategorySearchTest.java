package org.framework.pageobjectmodel.Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayProductCategorySearchTest {
  @Test
  public void productCategorySearchTest() {
	  
	  WebDriverManager.chromedriver().version("94").setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
	  driver.findElement(By.id("gh-ac")).sendKeys("Sony");
	  WebElement drpdwn = driver.findElement(By.id("gh-cat"));
	  Select s = new Select(drpdwn);
	  s.selectByVisibleText("Cameras & Photo");
	  
	  driver.findElement(By.id("gh-btn")).click();
	  
	  Reporter.log("Ebay Product Category Test is passed");
	  
	  
  }
}
