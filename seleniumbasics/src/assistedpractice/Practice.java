package assistedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
	    // 1. open the browser
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// 2. navigate to application
		driver.get("https://www.amazon.in/");
		
		// 3. enter invalid username
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("batman554466@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("password123");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,2000)");
		
		driver.findElement(By.xpath("(//i[contains(@class,'nav-sprite hmenu-arrow-next')])[7]")).click();
		
		driver.findElement(By.xpath("(//a[contains(@class,'hmenu-item')])[88]")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'nav-sprite hmenu-close-icon')]")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-checkbox')])[2]")).click();
		
		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[2]")).click();
		
		driver.findElement(By.id("add-to-wishlist-button-submit")).click();
		
		driver.findElement(By.id("list-name")).sendKeys("phones");
		
		driver.findElement(By.id("(//input[contains(@class,'a-button-input a-declarative')])[4]")).click();
		
		driver.findElement(By.id("(//a[contains(@class,'a-button-text')])[2]")).click();
	}	
}
