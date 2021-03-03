package exception.multicatch;

public class MainClass {

	public static void main(String[] args) { //아규멘트 인자갑 = 스트링이 매개변수를 받아줌
		
		/*
		 * main 메서드 실행 매개값을 주는 방법,
		 * run탭 -> run configuration -> arguments-> ${String_prompt}
		 * 
		 * 
		 */
	
//		System.out.println(args[0]);

		
		try {
			
			String data1 = args[0];
			String data2 = args[1];
			
			int num1 = Integer.parseInt(data1) ; //변수 나 문자열 
			int num2 = Integer.parseInt(data2);
			
			String s = null;
			s.charAt(0);
			
			
			System.out.println("두 수의 합:" + (num1+num2));
			
		} catch (ArrayIndexOutOfBoundsException | ClassCastException e) { 
			//동일하게 처리하고 싶은 예외를 | 로 연결
			System.out.println("매개값은 반드시 2개를 전달해주세요");
		} catch (NumberFormatException e) {
			System.out.println("매개값은 반드시 숫자형태로 전달하세요");
			//Exception 은 모든 실행 예외의 부모클래스이기 때문에 모든 예외를 처리
		} catch (Exception e) { // Exception 마우스클릭후 carl  + t  ==> 상속 구조를 볼수있음
			System.out.println("기타 예외 입니다");
		}
	}
	


}
