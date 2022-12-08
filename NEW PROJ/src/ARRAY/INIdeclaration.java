package ARRAY;

public class INIdeclaration extends accessSPECIFIER {
	public static void main(String[] args) {
		//single dimensional array declaration
	
	int [] a = {12,23, 34};
    String S []= {"APEKSHA","KAILAS","PATIL"};
    
    // MULTIDIMENSIONAL ARRAY
    
    char c[] = new char [5];  //declaration
    
     c [0]= 'a';
     c [1]= 'e';
     c [2]= 'o';
     c [3]= 'i';
     c [4]= 'u';
     
     //to display on o/p
     // a array
     for(int i= 0; i< a.length ; i++) {
    	 System.out.print(" "+a[i]);
     }
     System.out.println();
     
    // s array
     for(int i= 0; i< S.length ; i++) {
    	 System.out.print(" "+S[i]);
     }
     System.out.println();
     
     //c array
     for(int i= 0; i< c.length ; i++) {
    	 System.out.print(" "+c[i]);
     }
     System.out.println();
     
     // calling  defalut string array from diff  class 
     System.out.println(accessSPECIFIER.a[0]);


}}