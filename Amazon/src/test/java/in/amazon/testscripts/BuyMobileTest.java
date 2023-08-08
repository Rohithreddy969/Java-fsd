package in.amazon.testscripts;
import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;
import in.amazon.pages.AllMobileBrands;
import in.amazon.pages.ApplePhones;
import in.amazon.pages.Buyphone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignInPage;

public class BuyMobileTest extends MainTest {
	@Test
	public void BuyMobile() {
	//	4. Click on ‘Mobiles’ in the navigation bar
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickMobies();
	//	5. Hover the pointer over ‘Mobiles & Accessories’
		AllMobileBrands allMobilesBrands = new AllMobileBrands(driver);
		allMobilesBrands.hovermobiles();
		
	//	6. Click on ‘Apple’ in the sub-menu
		allMobilesBrands.clickapple();
	//	7. Click on first available phone
		ApplePhones applePhone = new ApplePhones(driver);
		applePhone.clickFirstMobile();
		
	//	8.  Switch focus on new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	//	9.  Click on ‘Buy Now’ button
		Buyphone buyPhone = new Buyphone(driver);
		buyPhone.clickBuyNowBtn();
		
	// 10. Verify user sees the text ‘Sign in’ on the last page
		SignInPage signInPage = new SignInPage(driver);
		String expectedText = "Sign in";
		String actualText = signInPage.getSignIn();
		Assert.assertEquals(actualText, expectedText);
	}
}
