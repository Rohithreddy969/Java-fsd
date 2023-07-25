package com.sauce.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "user-name")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement passWord;
	
	@FindBy(id = "login-button")
	private WebElement clickLogin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userIdPass() {
		userName.sendKeys("standard_user");
		passWord.sendKeys("secret_sauce");
		clickLogin.click();
	}
}
