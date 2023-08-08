package pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private WebDriverWait wait;
	
	@FindBy(xpath = "(//div[contains(@role,'button')])[1]")
	private WebElement fromBtn;
	
	@FindBy(xpath = "//li[contains(@class,'cursorPointing')]")
	private WebElement selectfromBtn;
	
	@FindBy(xpath = "(//div[contains(@role,'button')])[2]")
	private WebElement toBtn;
	
	@FindBy(id = "search_button")
	private WebElement datepicker;
	
	@FindBy(xpath = "(//div[contains(@class,'isgDNj')])[33]")
	private WebElement selectdate;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void enterFromPlace(String place) throws InterruptedException {
		fromBtn.sendKeys(place);
		wait.until(ExpectedConditions.elementToBeClickable(selectfromBtn));
		selectfromBtn.click();
	}
	
	public void entertoPlace(String place) throws InterruptedException {
		toBtn.sendKeys(place);
		wait.until(ExpectedConditions.elementToBeClickable(selectfromBtn));
		selectfromBtn.click();
	}
	
	public void selectDate() throws InterruptedException {
		datepicker.click();
		selectdate.click();
		datepicker.click();
	}
}
