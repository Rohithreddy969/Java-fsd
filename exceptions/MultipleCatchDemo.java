package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Please enter a number: ");
			int num1 = scanner.nextInt();
			
			System.out.println("Please enter another number: ");
			int num2 = scanner.nextInt();
			
			System.out.println("The result = " + (num1 / num2));
		}
		
		catch(ArithmeticException e) {
			System.out.println("Do not enter zero in the denominator");
		}
		catch(InputMismatchException e) {
			
			System.out.println("Enter only integer values");
		}
	}
}
