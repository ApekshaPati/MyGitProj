package INTERFACES;

public class imp1nonsta implements nonstatic {
	int b= 30;                       //GLOBAL VARIABLE
	public void demo1() {
		System.out.println("demo1 non static method");   // COMPLETED DEMO1 METHOD
	}
	public void demo2(int b) {
		System.out.println("global b= "+ this.b);   // CALLING GLOBAL VAR
		System.out.println("demo2 non static method with b="+ b); // CALLONG LOCAL VAR
		System.out.println("super a= "+ this.a);  // CALLING STATIC VAR OF DEMO1 METHOD
		                     // The super keyword refers to the parent class, not to any interface
	}
	public static void main(String[] args) {
		int b=30;
		imp1nonsta x = new imp1nonsta ();
		x.demo1();
		x.demo2(3);
		System.out.println("b in main= "+x.b);
		System.out.println("static var in a in demo1= "+ nonstatic.a);
		// call a through interface name only
		
	}

}
