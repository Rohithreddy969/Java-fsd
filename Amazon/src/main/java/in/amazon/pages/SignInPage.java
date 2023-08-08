package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	@FindBy(xpath = "//h1[contains(@class,'a-spacing-small')]")
	private WebElement signIn;
	
	@FindBy(id = "ap_email")
	private WebElement emailId;
	
	@FindBy(id = "continue")
	private WebElement continuebtn;
	
	@FindBy(xpath = "//span[contains(@class,'a-list-item')]")
	private WebElement errMsg;
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getSignIn() {
		String text = signIn.getText();
		return text;
	}
	
	public void emailId(String email) {
		emailId.clear();
		emailId.sendKeys(email);
	}
	
	public void clickcontinuebtn() {
		continuebtn.click();
	}
	
	public String getErrMsg() {
		String message = errMsg.getText();
		return message;
	}
	

}
