package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is on the application login page")
	public void user_is_on_the_application_login_page() {
	    System.out.println("Given step");
	}

	@When("user enters {string} in username")
	public void user_enters_in_username(String string) {
	    System.out.println("username value is "+string );
	}

	@When("user enters {string} in password")
	public void user_enters_in_password(String string) {
		 System.out.println("password value is "+string );
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   System.out.println("when for login button");
	}

	@Then("user should see the error message for invalid credentials")
	public void user_should_see_the_error_message_for_invalid_credentials() {
		 System.out.println("then for error message" ); 
	}

}
