package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// navigate to application
		driver.get("https://facebook.com");
		
		// enter invalid username
		driver.findElement(By.id("email")).sendKeys("batsman54466@gmail.com");
		
		// enter invalid password
		driver.findElement(By.id("pass")).sendKeys("password@123");
		
		// click login button
		driver.findElement(By.name("login")).click();
		
		// verify user sees the error message
		String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		String actualErrMsg = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		
		// through xpath
		//String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class,'ay')])[3]")).getText();
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		
		// close the connection
		driver.quit();
	}

}
