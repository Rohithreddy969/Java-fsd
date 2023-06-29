package demo4;

public class Car {
	
	private String color;
	private String engineType;
	
	public Car(String colorOfCar, String typeOfEngine) {
		color = colorOfCar;
		engineType = typeOfEngine;
	}
	
	public void printCarProperties() {
		System.out.println("Color of Car = " + color);
		System.out.println("Type of Engine = " + engineType);
	}
	
	public static void main(String[] args) {
		Car maruti = new Car("Silver", "petrol");
		Car tata = new Car("Red", "diesel");
		
		tata.printCarProperties();
	}

}
