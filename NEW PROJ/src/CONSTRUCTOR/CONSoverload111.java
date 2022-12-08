package CONSTRUCTOR;

public class CONSoverload111 {
	int a;
	char c;
	String st;
	byte b;
	double d;
	
	
	 CONSoverload111 (int p,int e){
		 a=p; a=e;
		 System.out.println(p+e);
	 }
	 CONSoverload111 (int w,String r){
		 a=w; st= r;
		 System.out.print(w );
		 System.out.println(r);
	 }
	 CONSoverload111 (String r,String l){
		 st= r; st=l;
		 System.out.println(r+l);
		// System.out.println(l);
	 }
	 /*CONSoverload111 (byte a,double h){
		 b=a;d=h;
		 System.out.println(a+h);
	 }*/

	 
	 public static void main(String[] args) {
		 CONSoverload111 A = new  CONSoverload111(33,4);
		 CONSoverload111 B = new  CONSoverload111 (5," my best no");
		 CONSoverload111 C = new   CONSoverload111("POOJA", " NISHA");
		 //CONSoverload111 D = new  CONSoverload111 (9,986.453);
		 CONSoverload111 Q =  new  CONSoverload111 (55,66);         // calling same constrctr using diff variable
		 
	 }	
}
