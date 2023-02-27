package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\CancelOrder.feature"},
		
		glue = {"steps"},
		
		tags = "@history and @alreadydispatched"
				
		)

public class CancelOrderRunner extends AbstractTestNGCucumberTests {

}
