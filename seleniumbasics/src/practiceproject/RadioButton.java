package practiceproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/radio");
		
		driver.findElement(By.id("yes")).click();
		
		driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
	}

}
