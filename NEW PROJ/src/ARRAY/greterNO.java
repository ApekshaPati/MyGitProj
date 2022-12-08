package ARRAY;

public class greterNO {
	
	public static void main(String[] args) {
		
		int num [] = { 1, 11, 210,130,140};
		
		int maxnum = 0;
		
		for(int i =0; i<num.length; i++ ) {    // we can't take here <= condition
			
			if(num[i]>maxnum) {
				maxnum = num[i];
			}
			
			System.out.print(num[i]+" ");
			
			
		}
		System.out.println();
		 System.out.println(" greater no. is "+maxnum);
		
	}
}
