package quiz19;

public class MainClass {

	public static void main(String[] args) {
	
		Calculator c = new Calculator();
		
		try {
			int result = c.input();
			System.out.println("결과:" + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

}
