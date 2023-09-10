package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SharedSteps extends Driver{
	
	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
	}
//	
//	@After
//	public void teardown() {
//		driver.quit();
//	}
}
