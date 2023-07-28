package in.amazon.teststeps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Driver {
	
	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
}
