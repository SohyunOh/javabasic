package quiz20;

public class MathQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 올림 메서드를 이용해서 1~10이 전달되면 1이 반환되는 page()를 생성
		 * 11-20  =>2반환
		 * 21-30  =>3반환
		 * .
		 * .
		 * 
		 */
	
		System.out.println(page(10));
		System.out.println(page(11));
		System.out.println(page(20));
		System.out.println(page(33));
	
	}
	
	public static int page(int num) {		
		return (int)Math.ceil(num * 0.1);
	}
	

}
