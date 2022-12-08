package conditionalstatement;

public class elseifNESTEDIF {
	public static void main (String[] Args) {
		int t=100;
		int a=67;
		
		if (t==a) {
			System.out.println("student is topper");
		}
		
		else if(a>=60) {
			System.out.println("std is avg");
			System.out.println((a>65 && a<80)+ " first class");
			
		}
		
		else {
			System.out.println("fail");
		}
			
				
		}

	
		
	}



