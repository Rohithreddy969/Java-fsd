package com.sauce.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickConfirm {

	@FindBy(id = "finish")
	private WebElement clickFinish;
	
	public ClickConfirm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFinish() {
		clickFinish.click();
	}
}
