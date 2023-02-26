package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileStepDefinitions {
	
	@Given("User is at add profile page")
	public void user_is_at_add_profile_page() {
	  System.out.println("Given for add profile");
	}

	@When("user enters the information")
	public void user_enters_the_information() {
		 System.out.println("When for add profile");
	}

	@Then("Profile should get added")
	public void profile_should_get_added() {
		System.out.println("Then for add profile");
	}

	@Given("User is at profile page")
	public void user_is_at_profile_page() {
		 System.out.println("Given for edit profile");
	}

	@When("user click on edit")
	public void user_click_on_edit() {
		 System.out.println("When for edit profile");
	}

	@Then("profile should get edit")
	public void profile_should_get_edit() {
		System.out.println("Then for edit profile");
	}

	@Given("User is at profile details page")
	public void user_is_at_profile_details_page() {
		 System.out.println("Given for delete profile");
	}

	@When("user click on delete")
	public void user_click_on_delete() {
		 System.out.println("When for delete profile");
	}

	@Then("profile should get deleted")
	public void profile_should_get_deleted() {
		 System.out.println("Then for delete profile");
	}

}
