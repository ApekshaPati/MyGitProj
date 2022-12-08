package METHDobjCONSTRUCTOR;



public class NONSTATIC {
	public int division(int a,int b) {
		int c= a/b; 
		System.out.println("division of "+ a+ " & " +b+ "= "+c);
		return c;
		}
		public static void main (String []args) {
			NONSTATIC A = new NONSTATIC ();
			A.division(874,75);
			
		}
	}
	


