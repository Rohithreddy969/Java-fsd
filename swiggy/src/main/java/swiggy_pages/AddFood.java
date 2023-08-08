package swiggy_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddFood {
	private Actions actions;
	private WebDriverWait wait;
	
	@FindBy(xpath = "//div[contains(@class,'_1RPOp')]")
	private WebElement selectAdd;
	
	@FindBy(xpath = "(//div[contains(@class,'_2CgXb')])[1]")
	private WebElement hoverToCart;
	
	@FindBy(xpath = "//div[contains(@class,'_55uP6')]")
	private WebElement selectCheckOut;
	
	public AddFood(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickOnAdd() {
		wait.until(ExpectedConditions.visibilityOfAllElements(selectAdd));
		selectAdd.click();
	}
	
	public void hoveroverToCart() {
		wait.until(ExpectedConditions.visibilityOfAllElements(hoverToCart));
		actions.moveToElement(hoverToCart).build().perform();
	}
	
	public void clickOnCheckOut() {
		wait.until(ExpectedConditions.visibilityOfAllElements(selectCheckOut));
		selectCheckOut.click();
	}
}
