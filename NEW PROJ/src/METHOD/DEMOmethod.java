package METHOD;

public class DEMOmethod {
	static int pics() {
		int a=25,d=87;
				int c=a%d;
		return c;
	}
	static String name() {
		String d= "xyz";
		return d;
	}
	public static void main (String []args) {
		int c= pics();
		System.out.println (c);
		String d = name();
		System.out.println (d);
		System.out.println(c);
		pics();
	}

}
