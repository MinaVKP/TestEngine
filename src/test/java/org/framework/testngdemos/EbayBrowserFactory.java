package org.framework.testngdemos;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.Test;

public class EbayBrowserFactory 
{
	
	
	  public WebDriver driverobj;
	  
	  @BeforeTest
	  public void startup()
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\chromedriver.exe");
		  driverobj = new ChromeDriver();
		  driverobj.manage().window().maximize();
		  driverobj.get("http://ebay.com");
		  
	  }

	  @AfterTest
	  public void shutdown()
	  {
		  driverobj.close();
	  }

}
