package ARRAY;

public class multiDIMENSIONAL {
	public static void main(String[] args) {
		
	String ar[][] = {{"APEKSHA","C+","PASS"},{"SHARVARI", "A+", "PASS"},{"78%","98%","65%"}};
	
	int a = ar.length;
		//System.out.println(a);
	
	for(int i=0;i<=2;i++) {   // for no. of row
		
		for(int j=0; j<=2; j++) {    // for no. of column
			
			System.out.print(ar[i][j]+"  ");
		}
		System.out.println();
	}
	
	
}
}
