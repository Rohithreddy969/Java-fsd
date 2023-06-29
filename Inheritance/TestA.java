package demo2;

public class TestA extends TestD {
	
	public void day() {
		System.out.println("Today is Thursday");
	}
	
	public static void main(String[] args) {
		TestA Testa = new TestA();
		Testa.day();
		Testa.date();
		Testa.nextyear();
	}

	
}
