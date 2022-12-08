package CONSTRUCTOR;
                      // USING CONS AND METHOD overloading HAVING SAME NAME
public class consMETHOD {     
	int a;
	char c;
	String st;
	byte b;
	consMETHOD(int b){                  // constructor1
		a=b;
		System.out.println("b="+b);
	}
	consMETHOD(int b,int c){           // constructor2
		a=b;a=c;
		System.out.println("b+c= "+(b+c));
	}
	public void consMETHOD(int b,int c){     // method1
		a=b;a=c;
		System.out.println("b-c= "+(b-c));
	}
	public void consMETHOD(int i, int j,String s) {  // method2
		a=i;a=j;st=s;
		System.out.println("i*j= " +(i*j));
		System.out.println(s);
		
	}
	public static void main (String[]args) {       
		System.out.println("welcome to main method");
		consMETHOD x =new consMETHOD(40,50);    // calling constructor 
		
	    x.consMETHOD(3, 3,"APPI");    // calling method2
	    consMETHOD y =new consMETHOD(0,50);
	    x.consMETHOD(5, 02);          // calling method 1
	    y.consMETHOD(01, 01, "patil");
	    
	    consMETHOD z =new consMETHOD(40);
	    
	  
	}

}
//* IN METHOD OVERLOADING WE CALL METHOD THRGH REFERENCE VARIABLE WHILE IN CONSTRUCTOR
 //OVERLOADING WE HAVE TO  CREATE NEW OBJECT TO CALL CONSTRUCTOR 

