package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory2 {
	
	public WebDriver driver ;
	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	public WebDriver initBrowser()
	{
		tldriver.set(new ChromeDriver());
		
		 
		 return getDriver();	
		
	}
	
	
	
	public static synchronized WebDriver getDriver()
	{
		return tldriver.get();
	}

}
