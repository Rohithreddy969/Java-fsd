package in.amazon.teststeps;

import java.util.ArrayList;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps extends Driver {
	
	@Given("a user is on the landing page of Amazon")
	public void a_user_is_on_the_landing_page_of_amazon() {
		
	}

	@When("he clicks on Mobies in the navigation bar")
	public void he_clicks_on_mobies_in_the_navigation_bar() {
	    landingPage.clickMobiles();
	}

	@When("he hovers the pointer over the mobile and accessories")
	public void he_hovers_the_pointer_over_the_mobile_and_accessories() {
		allMobileBrands.hovermobiles();
		
	}

	@When("he clicks on Apple in the sub menu")
	public void he_clicks_on_apple_in_the_sub_menu() throws InterruptedException {
		allMobileBrands.clickapple();
	}

	@When("he clicks on the second available phone")
	public void he_clicks_on_the_second_available_phone() {
		applePhones.clickFirstMobile();
	}

	@When("he switches focus on the new tab")
	public void he_switches_focus_on_the_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		}

	@When("he clicks on the buy now button")
	public void he_clicks_on_the_buy_now_button() {
		buyPhone.clickBuyNowBtn();
	}

	@Then("he must be able to purchase the mobile phone sucessfully.")
	public void he_must_be_able_to_purchase_the_mobile_phone_sucessfully() {
		String expectedText = "Sign in";
		String actualText = signIn.getSignIn();
		Assert.assertEquals(actualText, expectedText);
	}

}
