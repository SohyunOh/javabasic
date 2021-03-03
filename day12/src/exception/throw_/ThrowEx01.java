package exception.throw_;

public class ThrowEx01 {

	public static void main(String[] args) {
		
		/*
		 * 예외 발생하기 throw new 
		 * 메서드 실행조둥에 throw 키워드를 만나서 즉시 throw 로 생성한 예외사 발생됩니다.
		 * 예외가 발생되면 실행된 코드는 즉시 중단, 예외를 처리할수 있는 catch 문으로 이동
		 * 즉, 메서드를 강제종료할때 사용할수있습니다.
		 */
		
		try {
//			calc(10);
			System.out.println("결과:" + calc(10));
			System.out.println("결과:" + calc(-10));
			
		} catch (Exception e) {
			System.out.println(e.getMessage() ); //예외 발생시 전달항 예외 메시지응 얻어오는 기능
			e.printStackTrace();//예외 경로를 추적하는 메시지 를 출력(예외 메시지를 찾을때 매번 사용)
			
		}
		
	System.out.println("프로그램 정상 종료");	
	}
	
	public static int calc(int n) throws Exception {
		
		if(n < 0) {
			throw new Exception("반드시 양수값을 전달해야 합니다."); // 예외생성
		}
		int sum =0;
		for(int i = 1; i <=n ; i++) {
			sum += i ;
		}
		return sum;
	}
}
