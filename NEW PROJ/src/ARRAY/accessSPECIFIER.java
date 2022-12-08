package ARRAY;
/// using static & non-static array with access specifier
public class accessSPECIFIER {
	   
	public   static  int A [] = {234,678};
	public    char b [] = {'a','b'};
	public static String [] a = {"apeksha","patil"}; // string array with static
	private  String [] s = {"appi","patil"};  // non-static string array
	 private String ab[] = new String [2];
	   ab[0] = "velocity";
	  ab[1] = "training";
	
	
	public static void main(String[] args) {
		
		
		//private char ch[] = new char [2];
		
		
		//ch[0] = 'd';
		//ch[1] = 'f';

		accessSPECIFIER w = new accessSPECIFIER();
		
		System.out.println(a[0] );
		System.out.println(w.A[0]);
	    System.out.println(w.b[0]);
	    System.out.println(w.s[0]);
	    System.out.println(w.ch[0]);
	
	}
	

}
