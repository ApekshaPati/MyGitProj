package STARPATTERN;

public class RECTANGULARspace {
	public static void main (String []Args) {
		int star= 1,space =4;
		for (int i=1; i<=9;i++) {
			for(int j=1; j<=space;j++) {
				System.out.print(" ");
			}
			for (int k=1; k<=star;k++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i<=4) {
				star= star+1;
				space--;
			}
			else {
				star= star-1;
				space++;
			}
		}

}
}
