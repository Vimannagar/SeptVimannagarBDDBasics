package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\Registration.feature"},
		
		glue = {"steps"}
		
			
		)

public class RegistrationRunner extends AbstractTestNGCucumberTests

{
	
	

}
