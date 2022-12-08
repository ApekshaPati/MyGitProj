package STRING;

public class stringMethod {
	public static void main(String[] args) {
		
	
	String a = "testing";
	String b = "TESTING";
	String c = new String("testing");
	String d = "MY NAME IS APEKSHA";
	String e ="appi@0808.com";
	
	System.out.println(a.charAt(3));
	System.out.println(a.codePointAt(3));
	System.out.println(a.codePointBefore(3));
	System.out.println(a.codePointCount(1, 6));// count char between start index & end index
	System.out.println(a.compareTo(b)); // COMPARE LEXICOGRAPHICALLY
	
	System.out.println(a.compareToIgnoreCase(b));
	
	System.out.println(a.concat(e));
	
	System.out.println(a.contains(c)); // case sensitive--compare both string hv same char
	
	//System.out.println(a.);
	
	System.out.println(a.contentEquals(c));
	
	System.out.println(e.toCharArray());
	
	
	
	}	

}
