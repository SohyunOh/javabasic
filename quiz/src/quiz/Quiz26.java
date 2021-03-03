package quiz;

public class Quiz26 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++) { //단수
			
			System.out.println(i + "단" );
						
			for(int j = 1; j <= 9; j++) { //행수
				System.out.printf("%d x %d = %d\n", i, j , i*j);
			}
			
			System.out.println();
			
		}
		

		
		
		
		
		
		
	}
}
