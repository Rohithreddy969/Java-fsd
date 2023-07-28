package in.amazon.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features = "Features",
			glue = "in.amazon.teststeps",
			//dryRun = true
			tags = "@product_purchase or @login_functionality"
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
