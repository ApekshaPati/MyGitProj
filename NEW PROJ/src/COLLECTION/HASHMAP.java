package COLLECTION;

import java.util.HashMap;
import java.util.Map;

public class HASHMAP {
	
	public static void main(String[] args) {
		
		HashMap <Integer,String> ref = new HashMap<Integer,String>();
		
		ref.put(1, "apeksha");
		ref.put(null, null);       // only one null key accepted
		ref.put(null, "notnull");   
		ref.put(2, null);         // multiple null values accepted
		ref.put(3, "kailas");
		
		
		for(Map.Entry<Integer, String> m : ref.entrySet()) {
			
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		System.out.println("*******************");
		
		ref.put(3, "patil");    // same key  bt diff value
		
for(Map.Entry<Integer, String> m : ref.entrySet()) {
			
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
	}

}
