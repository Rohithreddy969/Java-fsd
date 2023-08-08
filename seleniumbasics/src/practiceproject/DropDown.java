package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select select = new Select(fruits);
		select.selectByVisibleText("Apple");
		
		Thread.sleep(3000);
		
		WebElement hero = driver.findElement(By.id("superheros"));
		Select select1 = new Select(hero);
		select1.selectByVisibleText("Batman");
	}
	
}
