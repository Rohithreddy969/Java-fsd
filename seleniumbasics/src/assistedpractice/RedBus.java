package assistedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//	3) Navigate to application
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("(//div[contains(@role,'button')])[1])")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("//i[contains(@class,'icon icon-ic-city solr-icon')]")).click();
	
	}
}
