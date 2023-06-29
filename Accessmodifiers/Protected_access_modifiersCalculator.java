package demo1;

public class Calculator {
	
//Protected access modifier
	protected void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.add(6, 6);

	}
}



