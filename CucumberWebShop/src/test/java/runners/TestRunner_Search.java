package runners;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features = {"Features/Search.feature"},
		glue = "stepDefinitions",
		plugin = {"html:target", "json:target/2.json"}
		)
public class TestRunner_Search {

}
