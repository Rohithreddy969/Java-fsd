package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/buttons");
		driver.findElement(By.id("position")).click();
			
		Thread.sleep(3000);
		
		WebElement btncolor = driver.findElement(By.id("color"));
		String color = btncolor.getCssValue("border-color");
		System.out.println(color);
	
		driver.quit();
	}
	
}
