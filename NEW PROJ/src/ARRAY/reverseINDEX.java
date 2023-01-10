package ARRAY;

public class reverseINDEX {
	public static void main(String[] args) {
		
	int [] d = {23,34,45,56,67,78};
	
	for(int i=0; i<d.length; i++) {
		System.out.print(d[i]+ " ");
	}
	System.out.println();
	
	//to reverse index //  swapping
	
	for(int i=0; i<(d.length)/2; i++) {
	int x = d[i];
	d[i] = d[((d.length-1)-i)];
	d[((d.length-1)-i)] = x;
	
	
	}
	System.out.print(d[1]);
	System.out.println();
	
	// to print value of d
	for(int i=0; i<d.length; i++) {
		
		
		System.out.print(d[i]+" ");
		
	}
	
}
}

