package com.simplilearn.SportyShoes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchTest extends MainTest {

	@Test
	public void LaunchTest() {
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickNewUser();
		
		RegistrationPage registPage = new RegistrationPage(driver);
		registPage.firstname("rohith");
		registPage.enterEmail("me@gmail.com");
		registPage.enterPassword("rohith");
		registPage.clickOnRegister();
		
		ConfirmRegistration cnfReg = new ConfirmRegistration(driver);
		cnfReg.clickOnLogout();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailId("me@gmail.com");
		loginPage.passWord("rohith");
		loginPage.clickOnLogin();
		
		AddProductPage addTocart = new AddProductPage(driver);
		addTocart.clickOnAddCart();
		
		CartPage cartmsg = new CartPage(driver);
		String expectedMsg = "Message:Shoe SampleShoe Added Successfully to Cart";
		String actualMsg = cartmsg.getMessage();
		Assert.assertEquals(actualMsg, expectedMsg);
		
		cartmsg.clickOnHome();
		
		Cartconfirmpage cartPage = new Cartconfirmpage(driver);
		cartPage.clickOnCart();
		
		PlaceOrderPage placeOrder = new PlaceOrderPage(driver);
		placeOrder.clickOnPlace();
		
		ConfirmOrderPage confirmOrder = new ConfirmOrderPage(driver);
		String expectedgetMsg = "Success!";
		String actualgetMsg = confirmOrder.getMsg();
		Assert.assertEquals(actualgetMsg, expectedgetMsg);
	}	
}
