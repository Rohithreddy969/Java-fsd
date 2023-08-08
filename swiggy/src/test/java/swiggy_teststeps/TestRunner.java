package swiggy_teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "swiggy_teststeps"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
