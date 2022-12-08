
package STARPATTERN;

public class INVfullPiramid {
	public static void main(String []Args) {
		int star=7, space=1;
		for (int i=1; i<=4;i++) {
			for (int j=1;j<=star;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			   for (int k=1; k<=space; k++) {
				System.out.print(" ");
				}
			
			
			star=star-2;
			space++;
		}
		
	}


}
