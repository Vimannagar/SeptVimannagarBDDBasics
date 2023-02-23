package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User is at the login screen")
	public void user_is_at_the_login_screen() {
	   System.out.println("Given statement");
	}

	@When("User enters the username")
	public void user_enters_the_username() {
		System.out.println("First when statement");
	}

	@When("User enters the password")
	public void user_enters_the_password() {
		System.out.println("Second when statement");
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("Third when statement");
	}

	@Then("User should get redirect to the home page")
	public void user_should_get_redirect_to_the_home_page() {
		System.out.println(" Then statement");
	}

	
	
	
	
}
