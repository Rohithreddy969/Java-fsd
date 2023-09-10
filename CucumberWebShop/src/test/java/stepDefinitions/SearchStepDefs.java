package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefs extends Driver {
	
	public SearchStepDefs(SharedSteps s) {
		this.sp=sp;
	}
	
	@Given("a user is on the Landing page of Demo Web Shop")
	public void a_user_is_on_the_landing_page_of_tricentis() {
		Assert.assertTrue(driver.getTitle().equals("Demo Web Shop"));
	}
	
	@When("a user must should click on Login button")
	public void a_user_must_should_click_on_login_button() {
	    sp.clickLogIN();
	}
	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
	    sp.LoginDetails();
	}
	@When("user clicks on the Log in button")
	public void user_clicks_on_the_log_in_button() {
	    sp.clickLog_In();
	}
	@When("user enters the required product name in search box")
	public void user_enters_the_required_product_name_in_search_box() {
	    sp.enterItem();
	}
	@Then("user must verify a text {string} from the product page")
	public void user_must_verify_a_text_from_the_product_page(String string) {
	    String expectedText = string;
	    String actualText = sp.getPhoneText();
	    Assert.assertEquals(expectedText, actualText);
	}

}
