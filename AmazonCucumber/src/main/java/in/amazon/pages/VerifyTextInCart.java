package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyTextInCart {
	private WebDriverWait wait;
	
	@FindBy(xpath = "//span[contains(@class,'a-size-medium-plus a-color-base sw-atc-text a-text-bold')]")
	private WebElement verifyText;
	
	@FindBy(name = "proceedToRetailCheckout")
	private WebElement clickCheckout;
	
	public VerifyTextInCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public String getcartText() {
		wait.until(ExpectedConditions.visibilityOfAllElements(verifyText));
		String carttext = verifyText.getText();
		return carttext;
	}
	
	public void clickOnProceed() {
		wait.until(ExpectedConditions.visibilityOfAllElements(clickCheckout));
		clickCheckout.click();
	}
}
