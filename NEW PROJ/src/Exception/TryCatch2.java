package Exception;

public class TryCatch2 {
	
public static void main(String[] args) {
		
		int a = 12;
		int b= 0;
		int c = 0;
		
		int d[] = {1,2,3,4};
		
		try {
			 c = a/b;
			 System.out.println(d[4]);
			 
		}

       catch(ArithmeticException z){
    	   System.out.println("ArithmeticException");
    	   b=5;
    	   c= a/b;
    	   System.out.println("catch "+c);
    	    
    	   
    	   try {
    		   System.out.println(d[4]);
    	   }
    	   catch(ArrayIndexOutOfBoundsException x){
    		   System.out.println("ArrayIndexOutOfBoundsException");
    		   System.out.println(d[3]);
    		   
    	   }
    	   
       }
		
	
		
	}

}
