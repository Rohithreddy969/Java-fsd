package testngdemo;

import org.testng.annotations.Test;

public class Cars {
		
	@Test(groups = "Luxury Cars")
	public void Car1() {
		System.out.println("Bentley");
	}
	
	@Test(groups = "Luxury Cars")
	public void Car2() {
		System.out.println("Range Rover");
	}
	
	@Test(groups = "Luxury Cars")
	public void Car3() {
		System.out.println("Rolls Royce");
	}
	
	@Test(groups = "Car")
	public void Car4() {
		System.out.println("Mahindra");
	}
	
	@Test(groups = "Car")
	public void Car5() {
		System.out.println("Maruthi");
	}
	
}
