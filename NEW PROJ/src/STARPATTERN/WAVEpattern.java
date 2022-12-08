package STARPATTERN;

public class WAVEpattern {
	public static void main (String []Args) {
		
		
		for (int i=1; i<=5;i++) {
			for (int j=1; j<=i;j++) {
				if (i==1 || i==5 ) {
					System.out.print("*");
				}
				else if(j==1 || j==i){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			
			}
				System.out.println();
		}
		
		
	}

}
