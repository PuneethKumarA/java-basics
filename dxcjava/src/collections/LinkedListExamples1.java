package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples1 {
	
	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Suresh");
		lst.add("Ramesh");
		lst.add("Karan");
		lst.add("Jagdeesh");
		
		Collections.sort(lst);
		Iterator i = lst.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
