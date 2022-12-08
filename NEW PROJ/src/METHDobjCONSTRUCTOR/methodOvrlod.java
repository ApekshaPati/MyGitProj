package METHDobjCONSTRUCTOR;

public class methodOvrlod {
	public void overload () {
		int a=20,b=30;
		System.out.println("a+b = "+ (a+b));
	}
	public void overload (int a,int b) {
		System.out.println(a-b);
	}
	public void overload (int c,char q) {
        System.out.println(c);
        System.out.println(q);
        }
	public void overload (int s, String st) {
		System.out.println(s);
		System.out.println(st);
	}
	public static void main(String[] args) {
		methodOvrlod z = new methodOvrlod ();
		z.overload();
	   z.overload(55, 22);
	   z.overload(5, 2);
	   z.overload(12, "APEKSHA");
	   z.overload(1, "PATIL");
	   z.overload(99, 'Q');
	}
}
