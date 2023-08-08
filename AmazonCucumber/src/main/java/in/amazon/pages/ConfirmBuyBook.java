package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmBuyBook {
	
	private WebDriverWait wait;
	
	@FindBy(id = "add-to-cart-button")
	private WebElement clickCart;
	
	public ConfirmBuyBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickOnAddCart() {
		wait.until(ExpectedConditions.visibilityOfAllElements(clickCart));
		clickCart.click();
	}
}
