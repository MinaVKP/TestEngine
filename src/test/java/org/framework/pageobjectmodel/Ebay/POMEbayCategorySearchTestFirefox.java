package org.framework.pageobjectmodel.Ebay;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjectmodelPagesEbay.ClsEbay;
import pageobjectmodelPagesEbay.OpenBrowser;

public class POMEbayCategorySearchTestFirefox
{
  @Test
  public void ProductCategorySearchTest()
  {
	  
	  WebDriver driver = OpenBrowser.StartBrowser("Firefox","http://ebay.com");
	  	  
	  ClsEbay clsobj = new ClsEbay(driver);
	  clsobj.fnProdCatSearch("Sony", "Cameras & Photo");
	  
	  Reporter.log("Product Category Search is successful",true);
	  
  }
}
