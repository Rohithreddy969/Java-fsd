package swiggy_teststeps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import swiggy_pages.AddFood;
import swiggy_pages.ConfirmOrder;
import swiggy_pages.LandingPage;
import swiggy_pages.SelectRestaurant;

public class Driver extends Tools {
	
	protected static WebDriver driver;
	protected static LandingPage landingPage;
	protected static SelectRestaurant selectRestaurant;
	protected static AddFood addFood;
	protected static ConfirmOrder confirmOrder;
	
	public static void init() {
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		landingPage = new LandingPage(driver);
		selectRestaurant = new SelectRestaurant(driver);
		addFood = new AddFood(driver);
		confirmOrder = new ConfirmOrder(driver);
	}

}
