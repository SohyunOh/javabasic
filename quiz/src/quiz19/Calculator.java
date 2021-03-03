package quiz19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 정수를 2개 받는다
		 * 2. 입력한 값이 정수라면 합계 반환
		 * 3. 예외발생 할 수 있는 상황이라면 메서드를 종료하고 예외 메세지 전달
		 * 4. Scan.close() 또한 적절하게 처리
		 */

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		try {
			System.out.println("정수 1 입력>");
			int n1 = scan.nextInt();
			System.out.println("정수 2 입력>");
			int n2 = scan.nextInt();

			return n1+n2;
			

		} catch (Exception e) {
			throw new Exception("정수만 입력해주십시오.");
		} finally {
			
			scan.close();
		}
		
		
	} 


}
