package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart c = new MyCart(10000);
		
		for(int i = 1; i <= 10; i++) {
			c.buy("~~");
		}
		
		
		
	}
}
