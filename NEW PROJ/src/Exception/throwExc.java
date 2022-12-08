package Exception;

public class throwExc{
	
	static void demo() {
		throw new NullPointerException();  
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("call throw exception");
		
		demo();   /// Forceful exception
		
		System.out.println("call throws exception");
		
		Thread.sleep(2000);
		
	}

}
