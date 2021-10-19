package org.framework.testngdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\eclipse-workspace\\practice project\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		//implicitly wait
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//implicitly wait #2
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		 
		//Identifying all the Web elements
		WebElement fname = driver.findElement(By.name("firstname"));
		WebElement lname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));

		WebElement psswrd = driver.findElement(By.name("reg_passwd__"));
		
		WebElement drpmth = driver.findElement(By.name("birthday_month"));
		WebElement drpday = driver.findElement(By.name("birthday_day"));
		WebElement drpyear = driver.findElement(By.name("birthday_year"));

//		WebElement female = driver.findElement(By.xpath("//div//span//input[@type=\'radio\' and @value=\'1\']"));
		
		WebElement male = driver.findElement(By.xpath("//div/span//input[@type = 'radio' and @value='2']"));
		//sign up button
		WebElement signup = driver.findElement(By.xpath("//div//button[@type=\'submit\' and @class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		
		//Explicit Wait call
		
		webelemValues(driver,fname,5,"Meena");
		
		webelemValues(driver,lname,5,"Priyanka");
		
		webelemValues(driver,email,5,"MVkpgmail@.com");
		
		webelemValues(driver,psswrd,5,"abc_123");
		
		webelemValues(driver,drpmth,2,"March");
		webelemValues(driver,drpday,3,"20");
		webelemValues(driver,drpyear,3,"1992");
		
		//btnValues(driver,female,3);
		btnValues(driver,male,3);
		
		btnValues(driver,signup,5);
		
		
	}

	public static void webelemValues(WebDriver driver, WebElement elem, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(elem));
		elem.sendKeys(value);
	}
	
	public static void btnValues(WebDriver driver, WebElement btns, int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(btns));
		btns.click();
	}
	
}
