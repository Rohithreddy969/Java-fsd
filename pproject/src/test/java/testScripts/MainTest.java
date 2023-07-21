package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.ViewSeat;

public class MainTest {
	ChromeOptions options;
	WebDriver driver;
	Select select;
	@BeforeTest
	public void launchApplication() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//	1) Open the browser
		driver = new ChromeDriver(options);
		//	2) Maximize it
		driver.manage().window().maximize();
		//	3) Navigate to application
		driver.get("https://www.redbus.in/");
	}
	
	@Test
	public void bookBus() throws InterruptedException {
	//	4) Enter 'From' city - Mumbai
		LandingPage landingPages = new LandingPage(driver);
		landingPages.enterFromPlace("Mumbai");
		
	//	5) Enter 'To' city - Pune
		landingPages.entertoPlace("Pune");
		
	//	6) Pick up 28th from Calendar and Click on 'Search Buses' button
		landingPages.selectDate();
	
	//	7) Click on 'View Buses' corresponding to first search result on the next page
		ViewSeat viewseats = new ViewSeat(driver);
		viewseats.clickViewBuses();
		
	//	8) Click 'View Seats' corresponding to first bus
		viewseats.clickViewseat();
		
	//	9) Select Boarding point and Dropping points
		viewseats.clickBoardingpoint();
		viewseats.clickdroppingpoint();
		
	//	10) Click 'View Seats' button
		viewseats.clickViewSeatBtn();
	}
		@AfterTest
		public void closeBrowser() {
	//	11) Close the browser
		driver.quit();
	}
}
