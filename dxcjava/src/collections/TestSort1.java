package collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Koushik");
		names.add("Nithin");
		names.add("Praful");
		names.add("David");
		names.add("Rahul");
		
		System.out.println(names);
		ArrayList<String> collections;
		Collections.sort(names);
		System.out.println(names);
		for(String boys : names) {
			System.out.println(boys);
		}
	}

}
