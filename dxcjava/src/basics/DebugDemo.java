package basics;

public class DebugDemo {

	public static void main(String[] args) {
		System.out.println("DebugDemo---main");
		Calculator calc = new Calculator();
		int sum = calc.add(10,20);
		System.out.println("The sum is --"+sum);
		
		Student stud = new Student("Rohith", 34);
		Student myStudent = new Student();
		Student yourStudent = new Student("Virat");
		
		for(int a=0; a<5; a++) {
			int f = a + 5 * 3;
			System.out.println("The no is --"+f);
		}
		
		throw new NullPointerException();
	}

}
