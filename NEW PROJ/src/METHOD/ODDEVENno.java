package METHOD;

import METHDobjCONSTRUCTOR.NONSTATIC;

public class ODDEVENno {
	static int  primeNo(int n) {
		
		if(n%2==0) {
			System.out.println(n + " is even no.");
		}
		else {
			System.out.println(n + " is odd no.");
		}
		return  n%2;
	}
	
	public static void main(String[] args) {
		int n= 88;
		primeNo(n);                         // CALLING STATIC METHOD FROM SAME CLASS
		NONSTATIC d = new NONSTATIC();       //calling non-static method FROM DIFF PACKAGE
		d.division(4500, 35);
	}

}
