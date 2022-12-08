package STRING;

public class revATsamePOS {
	public static void main(String[] args) {
		String a = "MY NAME IS APEKSHA";
		String [] substr = a.split(" ");
		
		String rev = "";
		
		for(int i= 0; i<substr.length; i++) {
			
			//System.out.println(" "+substr[i]);
			
			
			for (int j=substr[i].length()-1; j>=0;j--) {
				
				rev =rev + substr[i].charAt(j);
				 
				
			}
			
			System.out.print(rev+" ");
			
			rev = "";
		}
		
		
	}
	
	

}
