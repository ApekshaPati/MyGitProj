package CONSTRUCTOR;

public class Basic {
	Basic (){                      // user define constructor
		
	}
	int x; 
	String name;
	char z;
	public static void main(String[] args) {
		Basic a = new Basic ();
		System.out.println(a.x);                // not initialize , so value is 0
		System.out.println(a.z);
		System.out.println(a.name);

		
	}

}
