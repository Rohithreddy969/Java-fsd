package com.sauce.SauceDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {

ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void buyProduct() {
		LoginPage loginPages = new LoginPage(driver);
		loginPages.userIdPass();
		
		SelectProduct selectProduct = new SelectProduct(driver);
		selectProduct.purchaseProduct();
		
		BuyProduct buyProduct = new BuyProduct(driver);
		buyProduct.clickOnCheckOut();
		
		BookingDetails bookingDetails = new BookingDetails(driver);
		bookingDetails.enterDetails();
		
		ClickConfirm clickConfirm = new ClickConfirm(driver);
		clickConfirm.clickOnFinish();
		
		FinalPage finalPage = new FinalPage(driver);
		String expectedMsg = "Thank you for your order!";
		String actualMsg = finalPage.getMsgText();
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
}
