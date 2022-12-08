package conditionalstatement;   

public class GreterNo {                    // finding greater no. using nested if      
	public static void main (String []args) {
	int a=56, b= 45,c= 678,d=87;
	if (a>b) {
		if (a>c) {
			
		    if (a>d) {
			  System.out.println("Greater no. A= "+a);
		}
		    else {
			   System.out.println("Greater no. D= "+d);
		   }}
		else {
			if (c>d) {
			 System.out.println("Greater no.C= "+c);
		}
			else {
				System.out.println("Greater no.D= "+d);
			}}}
		
	else {
	      if (b>c) {
	    	  if (b>d) {
	    		  System.out.println("Greater no.B= "+b);
	    	  }
	    	  else {
	    		  System.out.println("Greater no.D= "+d);
	    	  }
	      }
	      else {
	
		System.out.println("Greater no.C= "+c);
	}}

	
	
	}
}
	
	