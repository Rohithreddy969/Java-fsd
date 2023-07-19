package assistedpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		// 3. enter invalid username
		//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		
		//driver.get("http://www.javatpoint.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,3000)");	
	}
}
