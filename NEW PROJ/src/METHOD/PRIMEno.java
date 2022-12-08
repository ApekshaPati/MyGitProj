package METHOD;

public class PRIMEno {
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
		primeNo(n);
	}

}
