package org.framework.pageobjectmodel.Ebay;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjectmodelPagesEbay.ClsEbay;
import pageobjectmodelPagesEbay.OpenBrowser;

public class POMEbayProductSearchTestChrome {
  @Test
  public void prodSearch() {
	  
	  WebDriver driver = OpenBrowser.StartBrowser("Chrome", "http://ebay.com");
	  
	  ClsEbay clsobj = new ClsEbay(driver); 
	  //clsobj.fnSearch("Sony");
	  clsobj.fnProdCatSearch("Sony", "Cameras & Photo");
	  Reporter.log("Ebay PRODUCT search test is successful",true);
  }
}
