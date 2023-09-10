package stepDefinitions;


import org.junit.Assert;

import PageFactory.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepsDefs  extends Driver{
	
	public LoginStepsDefs(SharedSteps s) {
		this.lp=lp;
	}
	@Given("a user is on the Landing page of Tricentis")
	public void a_user_is_on_the_landing_page_of_tricentis() {
		Assert.assertTrue(driver.getTitle().equals("Demo Web Shop"));
	    
	}
	@When("a user must click on Login button")
	public void a_user_must_click_on_login_button() {
	    lp = new LoginPage(driver);
	    lp.clickLogIN();
	}
	@When("he enters the username and password")
	public void he_enters_the_username_and_password() {
	    lp.LogiDetails();
	}
	@When("he clicks on the Log in button")
	public void he_clicks_on_the_log_in_button() {
	    lp.clickLog_In();
	}
	@Then("he must be on the Home page")
	public void he_must_be_on_the_home_page() {
		String expectedText = "Itest@test.com";
		String actualText = lp.getConfirmText();
		Assert.assertEquals(actualText, expectedText);
	}
	

}
