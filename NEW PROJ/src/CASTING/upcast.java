package CASTING;

public interface upcast {
	public static void t1() {
		System.out.println("static metod t1");
	}
	
	void t2();
	default void t3{
		
	}

}
