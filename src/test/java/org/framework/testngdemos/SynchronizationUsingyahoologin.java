package org.framework.testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SynchronizationUsingyahoologin  
{
  
@Test
  public void login()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Downloads\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://login.yahoo.com");
	  
	  driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("priyanka_vkp");
	  driver.findElement(By.xpath("//*[@id='login-signin']")).click();
	  
	  //Implicitly wait
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  //Explicit Wait
	  WebDriverWait w = new WebDriverWait(driver,10);
	  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'login-passwd\']")));
	  
	  driver.findElement(By.xpath("//*[@id=\'login-passwd\']")).sendKeys("BCa");
	  
	  
	  
  }
}
