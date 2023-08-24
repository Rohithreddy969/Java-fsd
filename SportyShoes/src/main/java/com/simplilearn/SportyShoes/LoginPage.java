package com.simplilearn.SportyShoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "email")
	private WebElement enterEmail;
	
	@FindBy(id = "password")
	private WebElement enterPassword;
	
	@FindBy(xpath = "//button[contains(@type,'submit')]")
	private WebElement clickLogin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void emailId(String email) {
		enterEmail.sendKeys(email);
	}
	
	public void passWord(String pass) {
		enterPassword.sendKeys(pass);
	}

	public void clickOnLogin() {
		clickLogin.click();
	}
}
