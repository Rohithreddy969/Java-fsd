package in.amazon.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MainTest {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
