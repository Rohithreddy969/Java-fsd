package swiggy_teststeps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderFromSwiggy extends Driver {
	
	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
	    Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}

	@When("he type the deliver location Hyderabad and selects the first location")
	public void he_type_the_deliver_location_hyderabad_and_selects_the_first_location() {
	    landingPage.selctLocation("Hyderabad");
	}

	@When("he clicks on the first restaurant shown under Top restaurants shown in Hyderabad")
	public void he_clicks_on_the_first_restaurant_shown_under_top_restaurants_shown_in_hyderabad() {
	    selectRestaurant.clickOnRestaurant();
	}

	@When("he clicks on Add button corresponding to first listed dish")
	public void he_clicks_on_add_button_corresponding_to_first_listed_dish() {
	    addFood.clickOnAdd();
	}

	@When("he hovers the pointer over the cart")
	public void he_hovers_the_pointer_over_the_cart() {
	   addFood.hoveroverToCart();
	}

	@When("he clicks on Checkout button in the sub menu")
	public void he_clicks_on_checkout_button_in_the_sub_menu() {
	    addFood.clickOnCheckOut();
	}

	@Then("he must be able to order the food successfully and he must see the message - {string}")
	public void he_must_be_able_to_order_the_food_successfully_and_he_must_see_the_message(String string) {
	    String expectedText = string;
	    String actualText = confirmOrder.getConfirmText();
	    Assert.assertEquals(actualText, expectedText);
	}
	

}
