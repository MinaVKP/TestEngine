package org.framework.datadriven.amazon;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProdCategoryUsingDBConnection {
  @Test(dataProvider = "DBValues")
  public void SearchTest(String products, String Category)
  {
	//Open Browser
	WebDriverManager.chromedriver().version("94").setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://amazon.com");
	driver.manage().window().maximize();
		
	//Select value for DropDown list
	WebElement drpdwn = driver.findElement(By.xpath("//*[@id=\'searchDropdownBox\']"));
	Select s = new Select(drpdwn);
	s.selectByVisibleText(Category.toString());
	
	//Enter the product to be searched
	driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys(products.toString());
	
	//Click on the search button
	driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	Reporter.log("Amazon Product and Category Search is Successful",true);
	  
	}
  
  
  
  @DataProvider(name="DBValues")  
//  public String[][] fetchDBValues() throws SQLException, Exception
//  {
//	  String[][] data = getDBvalues();
//	  return data;
//  }
  
  public String[][] getDBvalues() throws Exception,SQLException {
	  
	  String dbconn = "C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\demos\\TestEngine\\src\\test\\resources\\dbinfo.prop";
	  FileInputStream fis = new FileInputStream(dbconn);
	  Properties p = new Properties();
	  p.load(fis);
	  	  
	  String url= (String) p.get("dbUrl"); 
      String username= (String) p.get("userName"); 
      String password= (String) p.get("password"); 
	      
	  Connection con = DriverManager.getConnection(url,username,password);
	  Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	  
	  String sql = "SELECT * FROM Amazon_Products_Category";
	  
	  ResultSet rs = stmt.executeQuery(sql);
	  
	  //Set pointer to the last row in database to find out the number of rows
	  rs.last();
	  
	  int rownum = rs.getRow();
	  System.out.println(rownum);
	  
	  ResultSetMetaData rsmd = rs.getMetaData();
	  int colnum = rsmd.getColumnCount();
	  System.out.println(colnum);
	  
	  //Declaring a two dimensional String Array
	  String[][] data = new String[rownum][colnum];
	  
	  //Set pointer to the first row of Database
	  rs.beforeFirst();
	  
	  //Iterate through the rows in Database
	  int i = 0;
	  while(rs.next())
	  {
		  for(int j=0;j<colnum;j++)
		  {
			  data[i][j] =  rs.getString(j+1);
			  System.out.println(i+"\t" + j + "\t" + data[i][j]);
			  			  
		  }
		  i++;
	  }
	 
	  
	  rs.close();
	  stmt.close();
	  con.close();
	  return data;

  }
}


