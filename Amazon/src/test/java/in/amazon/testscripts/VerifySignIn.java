package in.amazon.testscripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignInPage;

public class VerifySignIn extends MainTest {	
	@Test
	public void verifySignIn() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.hoveroverSignIn();
		
		landingPage.clicksignInbtn();
		
		SignInPage signInPage = new SignInPage(driver);
		signInPage.emailId("batman554466@gmail.com");
		
		signInPage.clickcontinuebtn();
		
		String expectedErrMsg = "We cannot find an account with that email address";
		String actualErrMsg = signInPage.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
}
