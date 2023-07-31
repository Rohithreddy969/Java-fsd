package in.amazon.teststeps;

import java.util.ArrayList;

import org.testng.Assert;

import in.amazon.pages.BuyBook;
import in.amazon.pages.ConfirmBuyBook;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignInPage;
import in.amazon.pages.VerifyTextInCart;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyPhysicsBook extends Driver {
	
	BuyBook buyBook;
	VerifyTextInCart verifyCart;
	
	@When("he enters Physics book in the search bar and selects third option")
	public void he_enters_physics_book_in_the_search_bar_and_selects_third_option() {
	    LandingPage landingPage =  new LandingPage(driver);
	    landingPage.selectFromBox("physics books");
	}

	@When("he selects the rating four star and above from the left side bar")
	public void he_selects_the_rating_four_star_and_above_from_the_left_side_bar() {
	    buyBook = new BuyBook(driver);
	    buyBook.clickonRating();
	}

	@When("he clicks on the first available book")
	public void he_clicks_on_the_first_available_book() {
	   buyBook.clickOnFirstBook();
	}
	
	@When("he switch focus on the new tab")
	public void he_switch_focus_on_the_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

	@When("he clicks on the Add cart button")
	public void he_clicks_on_the_add_cart_button() {
	    ConfirmBuyBook confirmBook = new ConfirmBuyBook(driver);
	    confirmBook.clickOnAddCart();
	}

	@When("he verifies the text Added to Cart is displayed")
	public void he_verifies_the_text_added_to_cart_is_displayed() {
		verifyCart = new VerifyTextInCart(driver); 
		String expectedText = "Added to Cart";
		String actualText = verifyCart.getcartText();
		Assert.assertEquals(actualText, expectedText);
	}

	@When("he clicks on proceed to buy button")
	public void he_clicks_on_proceed_to_buy_button() {
		verifyCart.clickOnProceed();
	}

	@Then("he must verify that user is on the Sign in page.")
	public void he_must_verify_that_user_is_on_the_sign_in_page() {
		SignInPage signIn = new SignInPage(driver);
		String expectedText = "Sign in";
		String actualText = signIn.getSignIn();
		}
}
