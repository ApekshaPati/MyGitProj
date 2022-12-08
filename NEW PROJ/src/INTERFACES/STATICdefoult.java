package INTERFACES;

public class STATICdefoult implements defSTATIC{
	public void test1() {
		System.out.println("test1 running");
	}
	public static void main(String[] args) {
		STATICdefoult obj = new STATICdefoult();
		obj.test1();
		obj.test3(88);        // calling default method
		defSTATIC.test2();    // calling static method
	}
	
 
}
