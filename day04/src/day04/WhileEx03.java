package day04;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//짝수의 개수
		
		int i = 1;
		int count = 0; //숫자를 셀 변수
		
		while( i <= 100 ) {
			
			if(i % 2 == 0) {
				count++;
			}
			
			i++;
		}
		
		
		System.out.println("1~100까지 짝수 개수:" + count);
		
		
		
		
	}
}
