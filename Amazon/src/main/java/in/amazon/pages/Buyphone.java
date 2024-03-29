package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buyphone {
	
	@FindBy(id = "buy-now-button")
	private WebElement buynowbtn;
	
	public Buyphone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickBuyNowBtn() {
		buynowbtn.click();
	}

}
