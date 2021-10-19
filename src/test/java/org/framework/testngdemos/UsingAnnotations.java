package org.framework.testngdemos;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.AfterTest;

public class UsingAnnotations extends ChromeBrowserFactory

{  
	// To Search a google browser for LG and click search button
	
	@Test
	public void Search() 
	{
		driverobj.findElement(By.name("q")).sendKeys("LG");
		
		// to click enter
		Actions a = new Actions(driverobj);
		a.sendKeys(Keys.ENTER).perform();
	}
  
}
