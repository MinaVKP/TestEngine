package org.framework.testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestDemo extends ChromeBrowserFactory
{
  
  @Test
  public void search() 
  {
	driverobj.findElement(By.name("q")).sendKeys("Selenium WebDriver"); 
	
	Actions a = new Actions(driverobj);
	a.sendKeys(Keys.ENTER).perform();
  }
  
  @Test
  public void checkTitle()
  {
	  String title = driverobj.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Google");
	  
  }
}
