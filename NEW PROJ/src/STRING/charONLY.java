package STRING;

public class charONLY {
	
	public static void main(String[] args) {
		
		String s =  "velocity@2022institute";
		
		// to select/print alphabet only
		String z = s.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(z);
		
		// to count char
		System.out.println("no. of char in s = "+z.length());
		
		// to print alpha+no.
		
		String f = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(f);
		
		
		
		
	}

}
