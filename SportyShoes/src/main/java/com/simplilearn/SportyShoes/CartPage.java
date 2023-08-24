package com.simplilearn.SportyShoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	
	WebDriverWait wait;
	
	@FindBy(xpath = "//p[contains(text(),'Message:Shoe SampleShoe Added Successfully to Cart')]")
	private WebElement verifyMsg;
	
	@FindBy(linkText = "Home")
	private WebElement clickHome;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	public String getMessage() {
		wait.until(ExpectedConditions.visibilityOf(verifyMsg));
		String message = verifyMsg.getText();
		return message;
	}
	
	public void clickOnHome() {
		clickHome.click();
	}
}
