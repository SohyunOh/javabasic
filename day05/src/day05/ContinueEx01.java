package day05;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		//continue를 만나면 반복문의 증감식 or 조건식으로 이동
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				continue;
			}

			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		int i = 1;
		while(i <= 10) {
			
			if(i % 2 == 0) {
				i++;
				continue;
			}
			
			System.out.println(i);
			
			i++;
		}
		
		
		
		
		
		
	}
}
