package STRING;

public class StringDeclare {
	
	public static void main(StringDeclare[] args) {
	
	String a = "APEKSHA";
	String b = "APEKSHA";   // new object not created..data store in same object

	//String a ="testing";    duplicate  local var ---cant change value of a until i comment above 'a' var
	
	String e = new String("apeksha");
	String d = new String ("apeksha");
	//String e = new String ("apeksha");      same reference var not allow
	
	
	}

}
