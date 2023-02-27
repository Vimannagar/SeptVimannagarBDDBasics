package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelOrderSteps {

	
	@Given("User is at orders page")
	public void user_is_at_orders_page() {
	    
		System.out.println("Given statement");
	}

	@When("User click on cancel order")
	public void user_click_on_cancel_order() {
	   System.out.println("When for recently placed order");
	}

	@Then("Order should get cancelled")
	public void order_should_get_cancelled() {
	   System.out.println("Then for recently placed order");
	}

	@When("User click cancel for dispatched order")
	public void user_click_cancel_for_dispatched_order() {
		System.out.println("When for dispatched  order");
	}

	@Then("Order should get cancelled for dispatched product")
	public void order_should_get_cancelled_for_dispatched_product() {
		System.out.println("Then for dispatched order");
	}

	@When("User click on history button")
	public void user_click_on_history_button() {
	   System.out.println("When for click on history button");
	}

	@Then("user should see the ordered product history")
	public void user_should_see_the_ordered_product_history() {
		 System.out.println("Then for viewing product history");
	}
}
