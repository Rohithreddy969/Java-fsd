package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPage;
import PageFactory.SearchPage;

public class Driver extends Tools{
	
	protected static WebDriver driver;
	protected static LoginPage lp;
	protected static SearchPage sp;
	
	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		lp = new LoginPage(driver);
		sp = new SearchPage(driver);
	}

}
