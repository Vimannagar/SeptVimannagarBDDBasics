package execution;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution"},
		
//		features = {"@target/failedrun.txt"},
		
//		plugin = {"rerun:target/failedrun.txt"},
		
		glue = {"execution"}
		
			)



public class RunAmazonTest extends AbstractTestNGCucumberTests
{
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	

}
