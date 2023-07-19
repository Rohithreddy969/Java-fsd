package practiceproject;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("fullName")).sendKeys("Alexander");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("join")).sendKeys(" Student", Keys.TAB);
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(text);
		
		driver.findElement(By.id("clearMe")).clear();
	}
}