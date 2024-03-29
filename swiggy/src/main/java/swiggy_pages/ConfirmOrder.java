package swiggy_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmOrder {
	private WebDriverWait wait;
	
	@FindBy(xpath = "//div[contains(@class,'_2axtv')]")
	private WebElement confirmText;
	
	public ConfirmOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public String getConfirmText() {
		wait.until(ExpectedConditions.visibilityOfAllElements(confirmText));
		String verifyText = confirmText.getText();
		return verifyText;
	}
}
