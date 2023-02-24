package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	

@Given("User should be at the home")
public void user_should_be_at_the_home() {
   
	System.out.println("Given statement for home page");
}

@When("user enters text in search field as {string}")
public void user_enters_text_in_search_field_as(String phone) {
   System.out.println("When statement for searching "+phone);
}

@When("user clicks on search button")
public void user_clicks_on_search_button() {
   System.out.println("When statement for click on search button");
}

@Then("user should see the list of mobile")
public void user_should_see_the_list_of_mobile() {
   System.out.println("Then statement for displaying list of mobile");
}

}
