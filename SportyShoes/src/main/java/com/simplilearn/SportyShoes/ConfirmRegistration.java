package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmRegistration {

	@FindBy(linkText = "Logout")
	private WebElement clicklogout;
	
	public ConfirmRegistration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogout() {
		clicklogout.click();
	}
}
