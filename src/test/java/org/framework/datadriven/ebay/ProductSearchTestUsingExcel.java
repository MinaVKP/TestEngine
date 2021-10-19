package org.framework.datadriven.ebay;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class ProductSearchTestUsingExcel {
  @Test(dataProvider = "DataDrivenFrameworkData")
  public void Searchtxt(String txtValue, String ddValue) 
  {
	  
	  WebDriverManager.chromedriver().version("94").setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
	  	
	  	  WebElement drpdwn = driver.findElement(By.id("gh-cat"));
	  	  Select s = new Select(drpdwn);
	  	  s.selectByVisibleText(ddValue.toString());
	  	  
	  	  driver.findElement(By.id("gh-ac")).sendKeys(txtValue.toString());
	  	  driver.findElement(By.id("gh-btn")).click();
	  	  
	  
	  Reporter.log("Ebay Product " + txtValue.toString() + "in" + "Category " + ddValue.toString() + " search test is successful",true);
  }

  @DataProvider
  	public Object[][] DataDrivenFrameworkData() throws Exception
  	{
	  Object[][] myData;
	  XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\demos\\mvnDemo\\src\\test\\resources\\DataDrivenFrameworkData.xlsx");
	  XSSFSheet ws = wb.getSheet("Sheet1");
	  int rows = ws.getPhysicalNumberOfRows();
	  System.out.println(rows);
	  
	  myData = new Object[rows-1][2];
	  	  
	  for(int i=1; i<rows ;i++)
	  {
		  
		  myData[i-1][0] = ws.getRow(i).getCell(0).getStringCellValue();
		  myData[i-1][1] = ws.getRow(i).getCell(1).getStringCellValue();
		  
		  
	  }
	  wb.close();
	  return myData;
	  
    }
  }

