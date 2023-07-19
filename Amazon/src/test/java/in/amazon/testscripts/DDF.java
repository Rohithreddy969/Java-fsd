package in.amazon.testscripts;

import java.io.IOException;

import org.testng.Assert;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignInPage;
import utils.ReadExcel;

public class DDF extends MainTest{
	public void verifySignIn() throws IOException {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.hoveroverSignIn();
		
		landingPage.clicksignInbtn();
		
		String[][] data = ReadExcel.getData("Resources//TestData.xlsx", "Sheet1");
		
		for(int i = 1; i < data.length; i++) {
		String username = data[i][1];
		SignInPage signInPage = new SignInPage(driver);
		signInPage.emailId(username);
		
		signInPage.clickcontinuebtn();
		
		String expectedErrMsg = "We cannot find an account with that email address";
		String actualErrMsg = signInPage.getErrMsg();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
	}
}
