package quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		//-5~5 까지 랜덤값을 만들고 0이라면 0출력, 양수라면 양수, 음수라면 음수 출력
		//3항연산식으로 처리
		
		int num = (int)(Math.random() * 11) - 5;
			
		String result = num == 0 ? "0" : ( num < 0 ? "음수" : "양수" );
		
		System.out.println("랜덤값:" + num);
		System.out.println("결과:" + result);
	}
}
