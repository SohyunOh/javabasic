package quiz19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2_t {

	public static void main(String[] args) {

		/*
		 * 1에서 100까지 랜덤한 수를 맞추는 프로그램 입니다.
		 * 입력한 값이 1에서 100까지의 값이 아니라면 예외처리 구문으로 넘기고
		 * 다시 입력받도록 처리합니다.
		 * 단, 카운트는 증가됩니다.
		 * 
		 * 입력한 값이 숫자가 아니라면 "반드시  숫자만 입력하세요"를 출력한 뒤에
		 * 다시 입력받도록 처리합니다.
		 * 단, 카운트는 처리 됩니다.
		 * 
		 * 위와 같은 실행 구조를 갖는 예외처리 코드를 작성해보세요.
		 */


		Scanner scan = new Scanner(System.in);
		int correct = (int)(Math.random()*100 )+1; //발생한 
		int count = 0; //시도 횟수
		while(true) {

			try {
				System.out.print("1~100까지 의 숫자를 입력하세요>");
				int answer = scan.nextInt();

				if(answer <1 || answer >100){
					throw new Exception();
				}
				count++;//
				
				System.out.println("=================");
				
				if(correct > answer) {
					System.out.println("더 큰수 입력");
				} else if ( correct < answer) {
					System.out.println("더  작은 수 입력");
				} else {
					System.out.println("정답");
					System.out.println("시도 횟수:" +count);
					break;
				}

			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("반드시 숫자");
				scan.nextLine(); //엔터제거
				
			} catch (Exception e) {
				System.out.println("1~100사이 값 입력하세요");
				count++;
			}
				
		}



	}




}
