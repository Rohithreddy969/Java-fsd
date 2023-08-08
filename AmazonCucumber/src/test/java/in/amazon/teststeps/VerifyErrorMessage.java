package in.amazon.teststeps;

import org.testng.Assert;

import in.amazon.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyErrorMessage extends Driver {
	
	@Given("a user is on the landing page")
	public void a_user_is_on_the_landing_page() {
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}

	@When("he hovers the pointer over Hello Sign-in menu")
	public void he_hovers_the_pointer_over_hello_sign_in_menu() {
	landingPage.hoveroverSignIn();
	}

	@When("he clicks on Sign-in button in the sub-menu")
	public void he_clicks_on_sign_in_button_in_the_sub_menu() {
		landingPage.clicksignInbtn();
	}

	@When("he enters invalid email address in the Email text-box")
	public void he_enters_invalid_email_address_in_the_email_text_box() {
		signIn = new SignInPage(driver);
		signIn.emailId("batman554466@gmail.com");
	}

	@When("he clicks on Continue button")
	public void he_clicks_on_continue_button() {
		signIn.clickcontinuebtn();
	}

	@Then("he must see the error message - {string}")
	public void he_must_see_the_error_message(String string) {
		String expectederrMsg = string;
		String actualerrMsg = signIn.getErrMsg();
		Assert.assertEquals(actualerrMsg, expectederrMsg);
	}
	
	@When("he enters invalid email address {string} in the Email text-box")
	public void he_enters_invalid_email_address_in_the_email_text_box(String string) {
	    signIn.emailId(string);
	}
}
