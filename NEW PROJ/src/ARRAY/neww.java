package ARRAY;

public class neww {
	
	public static void main(String []args){

		
			int num [] ={23,15};
			
			
			for(int i =0; i <=  num.length/2; i++){

			int x = num[i];
			num[i] = num[num.length-1];

			 num[num.length-1] = x;
			 System.out.print(num[i]+ " ");

			}

			


}
}