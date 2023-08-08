package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
	}

}
