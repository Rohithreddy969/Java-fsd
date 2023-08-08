package com.sauce.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProduct {
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement selectPrdct;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement clickOnCart;
	
	public SelectProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void purchaseProduct() {
		selectPrdct.click();
		clickOnCart.click();
	}
}