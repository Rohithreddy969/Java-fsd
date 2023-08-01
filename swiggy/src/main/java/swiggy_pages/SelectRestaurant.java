package swiggy_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectRestaurant {
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "(//div[contains(@class,'sc-bczRLJ gWiXXg')])[1]")
	private WebElement selectFirstRestaurant;
	
	public SelectRestaurant(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickOnRestaurant() {
		wait.until(ExpectedConditions.visibilityOfAllElements(selectFirstRestaurant));
		selectFirstRestaurant.click();
	}
	
}
