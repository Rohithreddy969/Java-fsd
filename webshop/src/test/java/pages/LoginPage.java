package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(linkText = "Log in")
	private WebElement btn_logIn;
	
	@FindBy(id = "Email")
	private WebElement emailID;
	
	@FindBy(id = "Password")
	private WebElement passWord;
	
	@FindBy(xpath = "//input[contains(@value,'Log in')]")
	private WebElement clicklogIN;
	
	@FindBy(linkText = "Log out")
	private WebElement clickLogOut;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin() {
		btn_logIn.click();
	}
	
	public void logINDetails(String email, String password) {
		emailID.sendKeys(email);
		passWord.sendKeys(password);
		clicklogIN.click();
	}
	
	public void clickOnLogOut() {
		clickLogOut.click();
	}

}
