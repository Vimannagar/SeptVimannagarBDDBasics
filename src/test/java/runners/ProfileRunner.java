package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\Profile.feature"},

		glue = {"steps", "hooks"}
		
		)

public class ProfileRunner extends AbstractTestNGCucumberTests{

}
