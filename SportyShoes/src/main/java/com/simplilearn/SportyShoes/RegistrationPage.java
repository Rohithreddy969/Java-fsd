package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	@FindBy(id = "name")
	private WebElement userName;
	
	@FindBy(id = "email")
	private WebElement emailID;
	
	@FindBy(id = "password")
	private WebElement passWord;
	
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	private WebElement register;

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void firstname(String name) {
		userName.sendKeys(name);
	}

	public void enterEmail(String email) {
		emailID.sendKeys(email);
	}
	
	public void enterPassword(String pswd) {
		passWord.sendKeys(pswd);
	}
	
	public void clickOnRegister() {
		register.click();
	}
}

