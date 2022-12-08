package conditionalstatement;

public class forloop3oddeven {
	
	public static void main(String []Args) {
	 int A= 30,B=50, i= 20;
	 
	 		
	 for(i=20;i<=100;i=i+5) {
		 
		 System.out.println("i= "+i);
		 System.out.println("D="+(A+B)*i);
		
		if ((+(A+B)*i)>=2500 &&(+(A+B)*i)<5000) {
			System.out.println("this is your required range");
		}
		else {
			System.out.println("you r out of range");
		}
	 }
}

}
