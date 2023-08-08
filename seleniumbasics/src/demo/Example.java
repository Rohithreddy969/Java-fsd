package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
        // Create a new instance of the Chrome driver
		ChromeDriver driver = new ChromeDriver();

        // Open Facebook login page
        driver.get("https://www.facebook.com");

        // Find email and password input fields and enter your credentials
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("");

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("");

        // Click on the login button
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        // Wait for the login process to complete
        try {
            Thread.sleep(8000); // You can adjust the sleep time if needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement homeLink = driver.findElement(By.id("https://www.facebook.com"));
        if (homeLink.isDisplayed()) {
            System.out.println("Login successful! Navigated to the home page.");
        } else {
            System.out.println("Login failed!");
        }
        // Close the browser
        driver.quit();
	}
}
