package STRING;

public class febonanci {
	public static void main(String[] args) {
		
		int a=0;
		int b= 1;
		int d = 0;
		System.out.print(a+" "+b);
		
		for (int i =2; i<=500;i++){
			d= a+b;
			a=b;
			b=d;
			//to print febonanci no. from o to 200
			if( d<=200) {  
				if(d>=0) {
					
				i++;
				System.out.print(" "+d);
			}
			}
			
		}
		
		
		
	}

}
