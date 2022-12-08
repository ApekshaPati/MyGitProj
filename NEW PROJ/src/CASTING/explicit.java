package CASTING;

public class explicit {
	public static void main(String[] args) {
		
		long d= 9876543210l;
		System.out.println(d);
		
		int c= (int)d;
		System.out.println(c);
		
		short b= (short) c;
		System.out.println(b);
		
		byte a= (byte)b;
		System.out.println(a);
	}

}
