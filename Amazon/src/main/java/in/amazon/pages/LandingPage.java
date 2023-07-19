package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	private Actions actions;
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement signIn;
	
	@FindBy(linkText = "Sign in")
	private WebElement signInbtn;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 actions = new Actions(driver);
	}
	public void clickMobies() {
		mobiles.click();
	}
	
	public void hoveroverSignIn() {
		actions.moveToElement(signIn).build().perform();
	}
	
	public void clicksignInbtn() {
		signInbtn.click();
	}

}
