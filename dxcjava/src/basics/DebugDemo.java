package basics;

public class DebugDemo {

	public static void main(String[] args) {
		System.out.println("DebugDemo---main");
		Calculator calc = new Calculator();
		int sum = calc.add(10,20);
		
		System.out.println("The sum is --"+sum);
		
		throw new NullPointerException();
	}

}