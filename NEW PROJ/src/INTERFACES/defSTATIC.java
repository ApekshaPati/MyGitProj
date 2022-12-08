package INTERFACES;

public interface defSTATIC {
	int a =1;
	//void test1(int a,int b);
	static void test2() {
		int s= 2;
		System.out.println("static method: s= "+ s);
	}
	default  void test3(int d){
		System.out.println("default method: d= " +d);
	}
	public static void main(String[] args) {   // no need, can directly call in implement class
		System.out.println("main method start");   
		defSTATIC.test2();     // // calling static method & var
		System.out.println( "static var a= " +a);
	}

}
