package COLLECTION;

import java.util.ArrayList;

public class ArayListWithDataType {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(78);
		list.add(723);
		list.add(78234);
		//list.add("apeksha");
		
		for(int i =0;i<list.size();i++) {
			
			System.out.println(list.get(i));

		}
		System.out.println("***********************");

		 list.remove(0);
		 //list.add('c');
		// list.add(0.32f);
		 
		 
		 for(int i =0;i<list.size();i++) {
				
				System.out.println(list.get(i));
			}
		
		
		
		
	}
	

}
