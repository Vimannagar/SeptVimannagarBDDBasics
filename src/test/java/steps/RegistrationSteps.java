package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	
	@Given("user should be at the form page")
	public void user_should_be_at_the_form_page() {
	    System.out.println("Given statement");
	}

	@When("user should enter the following data")
	public void user_should_enter_the_following_data(DataTable dataTable)
	{
		List<List<String>> var = dataTable.asLists(String.class);
		
	
		for(List<String> value :var)
		{
			System.out.println(value);
					
		}
		
	}

}
