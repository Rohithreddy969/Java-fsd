package com.simplilearn.SportyShoes;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProductPage {
	
	private Actions actions;
	private WebDriverWait wait;
	JavascriptExecutor js;

	@FindBy(xpath = "(//a[contains(@class,'btn btn-primary')])[1]")
	private WebElement clickAddCart;
	
	public AddProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public void clickOnAddCart() {
		wait.until(ExpectedConditions.visibilityOf(clickAddCart));
		js.executeScript("arguments[0].scrollIntoView();", clickAddCart);
		js.executeScript("arguments[0].click()", clickAddCart);
	}
}
