package Exception;

public class TryCatch1 {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b= 0;
		int c = 0;
		
		try {
			 c = a/b;
			 System.out.println("try "+c);
		}

       catch(ArithmeticException z){
    	   
    	   b=5;
    	   c= a/b;
    	   System.out.println("catch "+c);
    	   
    	   
       }
		
	
		
	}

}
