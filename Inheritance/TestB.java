package demo2;

public class TestB extends TestD {
	
	public void month() {
		System.out.println("It is the month of june");
	}
	
	public static void main(String[] args) {
		TestB Testb = new TestB();
		Testb.month();
		Testb.date();
		Testb.nextyear();
	}

}
