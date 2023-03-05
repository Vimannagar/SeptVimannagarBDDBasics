package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;
import qa.DriverFactory2;

public class AppHooks {
	
	WebDriver driver;
	DriverFactory2 driverfactory;
	
	@Before
	public void launchBrowser()
	{
		 driverfactory = new DriverFactory2();
			
		 driver = driverfactory.initBrowser();
		
		driver.manage().window().maximize();
		
	}
	
	@After
	public void quitBrowser()
	{
		driver.quit();
	}
	
	

}
