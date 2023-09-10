package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	@FindBy(linkText = "Log in")
	private WebElement btnlogIn;
	
	@FindBy(id = "Email")
	private WebElement emailID;
	
	@FindBy(id = "Password")
	private WebElement passWord;
	
	@FindBy(xpath = "//input[contains(@value,'Log in')]")
	private WebElement clickLogIn;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchItem;
	
	@FindBy(xpath = "(//input[contains(@value,'Search')])[2]")
	private WebElement clickSearch;
	
	@FindBy(linkText = "Smartphone")
	private WebElement selectSmartphone;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogIN() {
		btnlogIn.click();
	}
	
	public void LoginDetails() {
		emailID.sendKeys("ITest@test.com");
		passWord.sendKeys("Itest@test");
	}
	
	public void clickLog_In() {
		clickLogIn.click();
	}
	
	public void enterItem() {
		searchItem.sendKeys("Smartphone");
		clickSearch.click();
	}
	
	public String getPhoneText() {
		String verifyText = selectSmartphone.getText();
		return verifyText;
	}
}
