package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		//1~100까지 랜덤한 정수를 발생시킨다음에 짝수인지 홀수인지 출력하는 3항연산식.
		
		int result = (int)(Math.random() * 100) + 1;
		
		System.out.println( result % 2 == 0 ? result + "는 짝수 입니다" : result + "는 홀수 입니다");
		
		
		
	}
}
