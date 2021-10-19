package pageobjectmodelPagesEbay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ClsEbay {

	public WebDriver wd;
	
	public ClsEbay(WebDriver d)
	{
		wd=d;
	}
	
	By txtSearch = By.id("gh-ac");
	By drpdwn = By.id("gh-cat");
	By btn = By.id("gh-btn");
	
	
	
	public void fnSearch(String prodName)
	{
		wd.findElement(txtSearch).sendKeys(prodName);
		wd.findElement(btn).click();
		
	}
	
	public void fnProdCatSearch(String prodName,String catName)
	{
		WebElement dd = wd.findElement(drpdwn);
		Select s = new Select(dd);
		s.selectByVisibleText(catName);
		
		fnSearch(prodName);
		
	}
	
	
}
