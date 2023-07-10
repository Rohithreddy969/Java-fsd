package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	
	driver.get("https://www.icicibank.com/");
	driver.findElement(By.linkText("LOGIN")).click();
	
	driver.findElement(By.id("HDisplayDefault.Rb14.C3")).click();
	
	driver.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
	
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	}
}
