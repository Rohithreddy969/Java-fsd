package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"Features/Login.feature"},
		glue = "stepDefinitions",
		plugin = {"html:target", "json:target/1.json"}
		
		)

public class TestRunner_Login extends AbstractTestNGCucumberTests {

}
