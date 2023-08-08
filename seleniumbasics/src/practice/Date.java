package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.id("datepicker1")).click();
		
		WebElement nextMonth = driver.findElement(By.xpath("(//table[contains(@class,'ui-datepicker-calendar')])[2]"));
		List<WebElement> rows = nextMonth.findElements(By.tagName("tr"));
		
		for(int i=1; i<rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> column = row.findElements(By.tagName("td"));
			
			for(WebElement x : column) {
				if(x.getAttribute("Class").equals("15")) {
					x.click();
					break;
				}
			}
		}
		driver.findElement(By.xpath("(//td[contains(@data-handler,'selectDay')])[37]")).click();
	}
}
