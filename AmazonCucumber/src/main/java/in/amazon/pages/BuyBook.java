package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyBook {
	private WebDriverWait wait;
	
	@FindBy(xpath = "//section[contains(@aria-label,'4 Stars & Up')]")
	private WebElement selectRatingUp;
	
	@FindBy(xpath = "(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[1]")
	private WebElement selectFirstBook;
	
	public BuyBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickonRating() {
		wait.until(ExpectedConditions.visibilityOf(selectRatingUp));
		selectRatingUp.click();
	}
	
	public void clickOnFirstBook() {
		wait.until(ExpectedConditions.visibilityOf(selectFirstBook));
		selectFirstBook.click();
	}
}
