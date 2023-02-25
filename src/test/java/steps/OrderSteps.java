package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {
//	ctrl + shift + o
	
	@Given("user should be at login page")
	public void user_should_be_at_login_page() {
	   
		System.out.println(" Given for Background");
	}

	@When("user enters the credentials")
	public void user_enters_the_credentials() {
	  System.out.println("When for background");
	}

	@Then("user should get logged in")
	public void user_should_get_logged_in() {
		 System.out.println("Then for background");
	}

	@When("user clicks on placed order link")
	public void user_clicks_on_placed_order_link() {
	   System.out.println(" when for scenario 1");
	}

	@Then("user should see the status of current order")
	public void user_should_see_the_status_of_current_order() {
		System.out.println(" Then for scenario 1");
	}

	@When("user clicks on order history")
	public void user_clicks_on_order_history() {
		System.out.println(" when for scenario 2");
	}

	@Then("user should be able to see the order history")
	public void user_should_be_able_to_see_the_order_history() {
		System.out.println(" Then for scenario 2");
	}

}
