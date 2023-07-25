package com.sauce.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDetails {

	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement zipCode;
	
	@FindBy(id = "continue")
	private WebElement clickContinue;
	
	public BookingDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails() {
		firstName.sendKeys("Alpha");
		lastName.sendKeys("Bet");
		zipCode.sendKeys("558551");
		clickContinue.click();
	}
}
