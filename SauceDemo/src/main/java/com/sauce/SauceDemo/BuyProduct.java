package com.sauce.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProduct {
	
	@FindBy(id = "checkout")
	private WebElement clickCheckout;

	public BuyProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCheckOut() {
		clickCheckout.click();
	}
}
