package conditionalstatement;

public class Nestedif {
	public static void main (String[] Args) {
		int Class= 10;
		int RollNo=35;
		String HOBBY="READING";
		
		if(Class==10) {
			System.out.println("WELCOME TO CLASS 10");
			
			if (RollNo==3) {
				System.out.println("THE NAME OF STUDENT IS APEKSHA PATIL");
				
			   if (HOBBY=="READING") {
				System.out.println("WELCOME APEKSHA, HOW CAN I HELP YOU");
			   }
			   else {
					System.out.println("PLEASE ENTER THE CORRECT HOBBY ");
			   }
			}
			else {
				System.out.println("ENTER THE CORRECT ROLL NO");
				
			}
			
			
			
			
		}
		else {
			System.out.println("you are not the student of class 10");
		}
	}

}
