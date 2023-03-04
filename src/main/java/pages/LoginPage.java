package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	WebElement   hoverElement;
	
	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']//a[@class='nav-action-button']")
	WebElement   signinbutton;
	
	@FindBy(xpath = "//*[@id='nav-cart']")
	WebElement   carticon;
		
	@FindBy(xpath = "//*[@id='ap_email']")
	WebElement   email;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement   continueemailbutton;
		
	@FindBy(xpath = "//*[@id='ap_password']")
	WebElement   password;
	
	@FindBy(xpath = "//*[@id='signInSubmit']")
	WebElement   finalsignin;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String uname)
	{
			Actions act = new Actions(driver);
			
			act.moveToElement(hoverElement).perform();
			
			signinbutton.click();
			
			email.sendKeys(uname);
			
			continueemailbutton.click();	
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void finalSignin()
	{
		finalsignin.click();
	}
	
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		return title;
	}
	
	public boolean isCartDisplayed()
	{
		boolean isdisplay = carticon.isDisplayed();
		
		return isdisplay;
	}
	
	
	
	

}
