package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobiles;
	
	@FindBy(id = "nav-link-accountList")
	private WebElement signIn;
	
	@FindBy(linkText = "Sign in")
	private WebElement signInbtn;
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchfromBox;
	
	@FindBy(xpath = "//div[contains(@class,'left-pane-results-container')]")
	private WebElement selectFromlist;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 actions = new Actions(driver);
		 wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	public void clickMobiles() {
		mobiles.click();
	}
	
	public void hoveroverSignIn() {
		actions.moveToElement(signIn).build().perform();
	}
	
	public void clicksignInbtn() {
		signInbtn.click();
	}
	
	public void selectFromBox(String item) {
		searchfromBox.sendKeys(item);
		wait.until(ExpectedConditions.visibilityOfAllElements(selectFromlist));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
