package COLLECTION;

import java.util.ArrayList;

public class ARRAYlIST {
	
	public static void main(String[] args) {
		
	ArrayList list = new ArrayList();
	
	list.add(78);
	list.add("apeksha");
	
	for(int i =0;i<list.size();i++) {
		
		System.out.println(list.get(i));

	}
	System.out.println("***********************");
	
//****** INSERTION ORDER NOT MAINTAIN*******//
	 list.remove(0);
	 list.add('c');
	 list.add(0.32f);
	 
	 
	 for(int i =0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		System.out.println("***********************");
		
		list.clear();
for(int i =0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}
		System.out.println("***********************");
		
		

}
}