package BLOCK;

import ARRAY.accessSPECIFIER;

public class STAnonstaic extends accessSPECIFIER {
	{                                               // non-static block
		int a=5, b=7;
		if(a>=b) {
			System.out.println("A>=B");
		}
		else {
			System.out.println("A<B");
		}
	}
	
static {                                     // static block.....it executed even before the main method
	int n=1;
	for (int i=1;i<=4;i++) {
		for (int j=1;j<=i;j++) {
			System.out.print(n);
			n++;
		}
		
		System.out.println();
}

}

public static void main(String[] args) {
	STAnonstaic x = new STAnonstaic();            //non-static block executed whenever call in main method 
	 System.out.println(" welcome to main method");
	 STAnonstaic V = new STAnonstaic(); 
	 
	 // calling array from diff pacakage
	 System.out.println(accessSPECIFIER.A[1]);
		 
	 
}

}