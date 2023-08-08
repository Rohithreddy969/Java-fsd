package assistedpractice;
	import org.openqa.selenium.By;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Simpli {
	    public static void main(String[] args) {
	        // Create a new instance of the ChromeDriver
	        ChromeDriver driver = new ChromeDriver();
	        
	        // Maximize the browser window
	        driver.manage().window().maximize();
	        
	        // Navigate to the application - Simplilearn website
	        driver.get("https://www.simplilearn.com/");
	        
	        // Find the 'All Courses' element and hover over it
	        WebElement allCourses = driver.findElement(By.xpath("//span[text()='All Courses']"));
	        Actions action = new Actions(driver);
	        action.moveToElement(allCourses).perform();
	        
	        // Find the 'Software Development' element and hover over it
	        WebElement softwareDevelopment = driver.findElement(By.linkText("Software Development"));
	        action.moveToElement(softwareDevelopment).perform();
	        
	        // Click on 'Automation Testing Masters Program'
	        WebElement automationTesting = driver.findElement(By.linkText("Automation Testing Masters Program"));
	        automationTesting.click();
	        
	        // Verify the text 'Automation Test Engineer' is visible on the next page
	        boolean isTextVisible = driver.getPageSource().contains("Automation Test Engineer");
	        if (isTextVisible) {
	            System.out.println("Text 'Automation Test Engineer' is visible on the page.");
	        } else {
	            System.out.println("Text 'Automation Test Engineer' is NOT visible on the page.");
	        }
	        
	        // Close the browser
	        driver.quit();
	    }
	}