package STRING;
//// to reveres string
public class REVERSE {
	public static void main(String[] args) {
		
		String a = "APEKSHA";
		String f = "APEKSHA KAILAS PATIL";
		
		for (int i=a.length()-1; i>=0; i--) {
			
			char b= a.charAt(i);
			System.out.print(b);
			
		}
		System.out.println();   /// to take o/p on next line
		
		//To reverse full name
		for (int i=f.length()-1; i>=0; i--) {
			char b = f.charAt(i);
			
			System.out.print(b);
		}
		System.out.println();
		
		//
		
		
	}

}
