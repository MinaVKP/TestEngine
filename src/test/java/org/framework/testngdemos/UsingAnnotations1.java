package org.framework.testngdemos;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UsingAnnotations1 extends ChromeBrowserFactory {
  @Test
  public void Search() 
  {
	  driverobj.findElement(By.linkText("Gmail")).click();
  }
}
