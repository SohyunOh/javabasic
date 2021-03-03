package static_.method;

public class MainClass {
	
	static int x;
	
	
	public static void main(String[] args) {
		
		Count.b++;
		Count.method2();
		
		Count c = new Count();
		c.a = 10;
		c.method1();
		
//		MainClass m = new MainClass();
//		m.x = 10;
		
		x =10;
		
	}
}
