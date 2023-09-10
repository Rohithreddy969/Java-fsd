package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(linkText = "Log in")
	private WebElement btnlogIn;
	
	@FindBy(id = "Email")
	private WebElement emailID;
	
	@FindBy(id = "Password")
	private WebElement passWord;
	
	@FindBy(xpath = "//input[contains(@value,'Log in')]")
	private WebElement clickLogIn;
	
	@FindBy(linkText = "Itest@test.com")
	private WebElement account;
	
	@FindBy(linkText = "Log out")
	private WebElement clickLogout;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogIN() {
		btnlogIn.click();
	}
	
	public void LogiDetails() {
		emailID.sendKeys("ITest@test.com");
		passWord.sendKeys("Itest@test");
	}
	
	public void clickLog_In() {
		clickLogIn.click();
	}
	
	public String getConfirmText() {
		String verifyText = account.getText();
		clickLogout.click();
		return verifyText;
	}
}
