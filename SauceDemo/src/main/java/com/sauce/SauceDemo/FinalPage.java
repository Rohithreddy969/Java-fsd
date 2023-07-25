package com.sauce.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalPage {

	@FindBy(xpath = "//h2[contains(@class,'complete-header')]")
	private WebElement verifyText;
	
	public FinalPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getMsgText() {
		String message = verifyText.getText();
		return message;
	}
}
