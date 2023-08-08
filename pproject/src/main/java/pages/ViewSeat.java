package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewSeat {
	
	private WebDriverWait wait;
	
	@FindBy(xpath = "(//div[contains(@class,'button')])[2]")
	private WebElement viewBuses;
	
	@FindBy(xpath = "(//div[contains(@class,'button view-seats fr')])[1]")
	private WebElement viewSeats;
	
	@FindBy(xpath = "(//div[contains(@class,'radio-unchecked')])[1]")
	private WebElement boardingPoint;
	
	@FindBy(xpath = "(//div[contains(@class,'radio-unchecked')])[4]")
	private WebElement droppingPoint;
	
	@FindBy(id = "gotoseat_btn")
	private WebElement viewSeatBtn;
	
	public ViewSeat(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickViewBuses() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(viewBuses));
		viewBuses.click();
	}
	
	public void clickViewseat() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(viewSeats));
		viewSeats.click();
	}
	
	public void clickBoardingpoint() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(boardingPoint));
		boardingPoint.click();
	}
	
	public void clickdroppingpoint() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(droppingPoint));
		droppingPoint.click();
	}
	
	public void clickViewSeatBtn() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(viewSeatBtn));
		viewSeatBtn.click();
	}
}
