package COLLECTION;

import java.util.Hashtable;
import java.util.Map;

public class HASHTABLE {
	
	public static void main(String[] args) {
	
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(1, "apeksha");
		ht.put(2, "sharvari");
		ht.put(3, "abhijeet");
		ht.put(4, "harshal");
		ht.put(1, "myself");   // KEY REPEATED
		//ht.put(null, null);    null pointer exception
		
		// INSERTION ORDER NOT MAINTAIN
for(Map.Entry<Integer, String> m : ht.entrySet()) {
			
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		
		
		
		
	}

}
