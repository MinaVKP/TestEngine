package org.framework.testngdemos;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

public class ParametersDemo extends EbayBrowserFactory{
  @Test
  @Parameters ({"ddValue" , "txtValue"})
  public void search(String ddValue, String txtValue) 
  {
	  WebElement drpdwn = driverobj.findElement(By.id("gh-cat"));
	  Select s = new Select(drpdwn);
	  s.selectByVisibleText(ddValue);
	  
	  driverobj.findElement(By.id("gh-ac")).sendKeys(txtValue);
	  
	  driverobj.findElement(By.id("gh-btn")).click();
	  Reporter.log("serach is successful",true);
	
  }
}
