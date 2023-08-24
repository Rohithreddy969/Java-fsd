package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartconfirmpage {
	
	@FindBy(linkText = "Cart")
	private WebElement clickCart;
	
	public Cartconfirmpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCart() {
		clickCart.click();
	}
}
