package COLLECTION;

import java.util.HashSet;

public class HASHSET {
	
	public static void main(String[] args) {
		
		
		HashSet x = new HashSet();
		
		x.add(123);
		x.add('c');
		x.add("Hello");
		
		// ADVANCE FOR LOOP
		
		for(Object t: x) {
			
			System.out.println(t);
			
		}
		
	}

}
