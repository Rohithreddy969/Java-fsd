package com.simplilearn.SportyShoes;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrderPage {
	WebDriverWait wait;
	JavascriptExecutor js;
	
	@FindBy(xpath = "//a[contains(@class,'btn btn-primary')]")
	private WebElement clickPlaceOrder;
	
	public PlaceOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickOnPlace() {
		wait.until(ExpectedConditions.visibilityOfAllElements(clickPlaceOrder));
		js.executeScript("arguments[0].scrollIntoView();", clickPlaceOrder);
		js.executeScript("arguments[0].click()", clickPlaceOrder);
	}

}
