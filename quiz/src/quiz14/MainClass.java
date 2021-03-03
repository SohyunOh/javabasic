package quiz14;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart cart = new MyCart(10000);
		
		for(int i = 0 ; i < 10; i++) {

			cart.buy(new Computer());
			
		}
		
		
		
		
		
	}
}
