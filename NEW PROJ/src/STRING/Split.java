package STRING;

public class Split {
	public static void main(String[] args) {
		String f = "APEKSHA  KAILAS PATIL";
		String [] sp = f.split(" ");
		int count = 0;
		
		for (int i=0; i<sp.length;i++) {
			System.out.println(sp[i]);
			 count ++;
		}
		System.out.println("no. of space= "+ count);
	}

}
