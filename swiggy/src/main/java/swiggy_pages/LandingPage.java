package swiggy_pages;

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
	private WebDriverWait wait;
	private Actions actions;
	
	@FindBy(id = "location")
	private WebElement enterLocation;
	
	@FindBy (xpath = "//div[contains(@class,'_1oLDb')]")
	private WebElement selectFromList;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void selctLocation(String location) {
		enterLocation.sendKeys(location);
		wait.until(ExpectedConditions.visibilityOfAllElements(selectFromList));
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}

}
