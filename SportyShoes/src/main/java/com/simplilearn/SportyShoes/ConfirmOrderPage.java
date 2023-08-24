package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage {
	
	@FindBy(xpath = "//strong[contains(text(),'Success!')]")
	private WebElement confirmMsg;
	
	public ConfirmOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getMsg() {
		String message = confirmMsg.getText();
		return message;
	}
}
