package STRING;

public class spaceCOUNT {
	public static void main(String[] args) {
		String a = "MY NAME  IS  KHAN";
		String sp[] = a.split(a);
		
		int count = 0;
		
		for(int i=0; i<= a.length()-1; i++) {
			char b = a.charAt(i);
			if( b==' ') {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
