package pageobjectmodelPagesEbay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	public static WebDriver wd;
	
	public static WebDriver StartBrowser(String browsername, String url) 
	{
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().version("94").setup();
			wd = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\priya\\eclipse-workspace\\practice project\\geckodriver.exe");
			wd = new FirefoxDriver();
			
		}
		wd.manage().window().maximize();
		wd.get(url);
		return wd;
				
	}

}
