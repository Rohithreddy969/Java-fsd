package exceptions;

import java.util.Scanner;

public class FinalDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please enter a number: ");
			int num1 = scanner.nextInt();
			
			System.out.println("Please enter another number: ");
			int num2 = scanner.nextInt();
			
			System.out.println("The result = " + (num1 / num2));
		}
		catch(Exception e) {
			
			System.out.println("Enter a valid input :");
		}
		
		finally {
			
			System.out.println("The Result is Declared ");
		}
	}
}
