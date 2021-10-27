package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort2Reverse {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("pineapple");
		a.add("cherry");
		a.add("mango");
		Collections.sort(a);
		for(String s : a) {
			System.out.println(s);
		}
		System.out.println();
		Collections.sort(a,Collections.reverseOrder());
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
