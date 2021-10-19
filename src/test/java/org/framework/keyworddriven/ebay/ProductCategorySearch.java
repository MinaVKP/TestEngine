package org.framework.keyworddriven.ebay;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductCategorySearch {
	 public WebDriver driver;
  @Test
 
  public void prodcatsearchTest() throws Exception {
	  
	   
	  XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\demos\\mvnDemo\\src\\test\\resources\\MindQBookFirefox.xlsx");
	  XSSFSheet ws = wb.getSheet("KeywordDrivenData");
	  int rows = ws.getPhysicalNumberOfRows();
	  
	  //iterate through the excel sheet rows
	  for(int i = 1;i<rows;i++)
	  {
		  String cTestCaseAction = ws.getRow(i).getCell(0).getStringCellValue();
		  String cLocType = ws.getRow(i).getCell(1).getStringCellValue();
		  String cLocValue = ws.getRow(i).getCell(2).getStringCellValue();
		  String cTestData = ws.getRow(i).getCell(3).getStringCellValue();
		  
		  switch (cTestCaseAction)
		  {
		  	case  "open_browser":
		  	
		  		if(cTestData.equalsIgnoreCase("Chrome"))
		  		{
		  			WebDriverManager.chromedriver().version("94").setup();
		  			driver = new ChromeDriver();
		  		}
		  		else
		  		if(cTestData.equalsIgnoreCase("Firefox"))
		  		{
		  			
		  			System.setProperty("webdriver.gecko.driver", "C:\\Users\\priya\\eclipse-workspace\\practice project\\geckodriver.exe");
					driver =  new FirefoxDriver();
		  		}
		  		driver.manage().window().maximize();
		  		break;
		  	
		  	  
		  	case "enter_url":
		  		driver.get(cTestData);
		  		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  		break;
		  		
		  	case "select_drpdwn":
		  		WebElement dd = driver.findElement(locatorInfo(cLocType,cLocValue));
		  		Select s = new Select(dd);
		  		s.selectByVisibleText(cTestData);
		  		break;
		  	
		  	case "search_txt":
		  		WebElement txt = driver.findElement(locatorInfo(cLocType,cLocValue));
		  		txt.sendKeys(cTestData);
		  		break;
		  	
		  	case "search_button":
		  		WebElement btn = driver.findElement(locatorInfo(cLocType,cLocValue));
		  		btn.click();
		  		break;
		  
		  }
	  wb.close();
		  
	  }
  }


  
  @Test
  public By locatorInfo(String locType,String locValue)
  {
	  By b = null;
	  
	  switch(locType)
	  {
	  case "id" :
		  b = By.id(locValue);
		  break;
	 
	  case "name":
		  b=By.name(locValue);
		  break;
	  
	  case "css":
		  b=By.cssSelector(locValue);
		  break;
	  
	  case "linkText":
		  b=By.linkText(locValue);
		  break;
		  
	  case "partiallinktext":
		  b=By.partialLinkText(locValue);
		  break;
		  
	  case "xpath":
		  b=By.xpath(locValue);
		  break;
	  
	  case "className":
		  b=By.className(locValue);
		  break;
	  
	  case "tagName":
		  b=By.tagName(locValue);
		  break;
	  
	  }
	  return b;
  }
}

