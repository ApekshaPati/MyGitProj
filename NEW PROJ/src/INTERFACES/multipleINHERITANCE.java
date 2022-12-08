package INTERFACES;

public class multipleINHERITANCE implements mulINTERFACE {
	int a= 1111;
	// method of this class itself
	public void demo111() {     
		
		System.out.println("demo111 method: static var a= "+ this.a);
		System.out.println("demo111 method: static var a= "+ a);
	}
	
	// completing methods of nonSTATIC interface
	public void demo1() {
		int a= 1;
		System.out.println(" demo1 method:local var a= "+a);
		System.out.println("global var a= "+ this.a);
		
	}
	public void demo2(int a) {
		System.out.println("demo2: a="+a);
	}
	//* over-riding   default method of defSTATIC interface
	// public void tes3(33) {
	//	 System.out.println("changing implementation");
	// }   *//
	// WE CAN EITHER OVERRIDE DEFAULT METHOD OR USED AT IS
	public static void main(String[] args) {
		multipleINHERITANCE z  = new multipleINHERITANCE ();
		z.demo111();
		z.demo1();
		z.demo2(0000);
		defSTATIC.test2();    // call static method of defSTATIC interface
		z.test3(65);          // call default method of defSTATIC interface with no implementation
		
	}

}
