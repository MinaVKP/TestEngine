package org.framework.hybridframework.ebay;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjectmodelPagesEbay.ClsEbay;
import pageobjectmodelPagesEbay.ClsEbayProdCatData;
import pageobjectmodelPagesEbay.OpenBrowser;

public class ProdCatSearchTest
{
  @Test(dataProvider = "ebayData")
  public void Search(String txtValue,String ddValue)
  {
	  
	  WebDriver driver = OpenBrowser.StartBrowser("chrome","https://ebay.com");
	  
	  ClsEbay clsobj = new ClsEbay(driver);
	  clsobj.fnProdCatSearch(txtValue, ddValue);
	  
	  
  }
  @DataProvider
  public Object[][] ebayData() throws Exception
  {  
		  Object[][] myData = ClsEbayProdCatData.getData("C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\demos\\mvnDemo\\src\\test\\resources\\MindQBook.xlsx");
		  return myData;
  }
  
  
}

