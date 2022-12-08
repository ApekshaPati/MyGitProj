package CONSTRUCTOR;

public class ConsOvrload {
	int a;int d;                      // global variable(G.V.) declaration
	int b;
	char c;
	String z;
	ConsOvrload (){
		 a=89;
		b=55;
	}
public void sum () {
		
		System.out.println(a+b);
	}

	ConsOvrload (int k,int l){
		a=k;b=l;                            // eqating args with G.V. 
	}
	
	
	ConsOvrload (int e,String t){
		a=e;
		z= t;                               // eqating with global string
	}
	public void str() {
		System.out.println(z);
		System.out.println(a);
		
	}
	
	
	ConsOvrload (char r, String st){
		c=r;
		z= st;
	}
	public void chart () {
	   System.out.println(c);
	   System.out.println(z);
	}
	
	
	public static void main(String[] args) {
		ConsOvrload z = new ConsOvrload ();
		z.sum ();
		ConsOvrload x = new ConsOvrload (44,66);
		x.sum ();
		ConsOvrload y = new ConsOvrload(23,"Appi");
		y.str();
		ConsOvrload s= new ConsOvrload('c',"nice");
		s.chart();
			
		}
	}


