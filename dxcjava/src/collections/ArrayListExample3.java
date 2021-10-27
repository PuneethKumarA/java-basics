package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tiger");
		names.add("Lion");
		names.add("Cheetah");
		names.add("Elephant");
		
		//System.out.println(names);
		
		Iterator itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
