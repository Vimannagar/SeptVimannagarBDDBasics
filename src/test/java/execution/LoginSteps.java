package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import qa.DriverFactory;
import qa.DriverFactory2;

public class LoginSteps {

	LoginPage loginpage = new LoginPage(DriverFactory2.getDriver());
	
	static String title ;
	@Given("user is at the landing page")
	public void user_is_at_the_landing_page() {
		WebDriver driver = DriverFactory2.getDriver();
		
		driver.get("https://www.amazon.in/");
	}

	@When("user gets the title of page")
	public void user_gets_the_title_of_page() {
	  
		 title = loginpage.getTitleOfPage();
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String expectedword) {
	 
		boolean ispresent = title.contains(expectedword);
		
		Assert.assertEquals(ispresent, true);
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
	   boolean isdisplaying = loginpage.isCartDisplayed();
	   
	   Assert.assertEquals(isdisplaying, true);
	}

	@When("user enters the username as {string}")
	public void user_enters_the_username_as(String username) {
	    loginpage.enterUsername(username);
	}

	@When("user enters the password as {string}")
	public void user_enters_the_password_as(String password) {
	  loginpage.enterPassword(password);
	}

	@When("user confirm signin")
	public void user_confirm_signin() {
	   loginpage.finalSignin();
	}

}
