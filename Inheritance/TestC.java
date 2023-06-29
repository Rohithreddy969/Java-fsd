package demo2;

public class TestC extends TestD{

	public void year() {
		System.out.println("Year is 2023 ");
	}
	public static void main(String[] args) {
		TestC Testc = new TestC();
		Testc.year();
		Testc.date();
		Testc.nextyear();
	}
}
