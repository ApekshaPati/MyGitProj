package ARRAY;

public class staNSTA {
	//STATIC ARRAY
	static  int [] a = {12,23, 34};  // static array
	String Stt []= {"APEKSHA","KAILAS","PATIL"}; // non static array
	
	///  **array with new keyword cant be initialize**
	//String spp [] = new String [3];
	// spp[0] = "velocity";
	// spp[1] = "is ";
	// spp[2] = "best";
	 
	public static void main(String[] args) {
		
	     String S []= {"APEKSHA","KAILAS","PATIL"};// local array
	     
	     System.out.println(S[0]);
	     System.out.println(a[2]);
	 //    System.out.println(Stt[2]);  can not access non static arry---need to create obj 
	     
	     staNSTA q = new staNSTA();
	     System.out.println(q.Stt[2]);
		
		
		
	}
	

}
