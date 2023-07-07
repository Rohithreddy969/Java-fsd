package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement country = driver.findElement(By.id("country"));
		
		Select select = new Select(country);
		
		select.selectByVisibleText("India");
	}

}
