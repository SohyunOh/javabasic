package quiz19;

import java.util.Scanner;

public class MainClass2_h {

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
		int count = 0;
		while(true) {

			try {
				System.out.print("1~100까지 의 숫자를 입력하세요>");
				int num = Integer.parseInt(scan.nextLine());
				int ran = (int)(Math.random()*100 )+1;


				System.out.println("=================");
				if(ran == num) {
					System.out.println("당첨 번호 :" + ran + "입력번호: " + num);
					count++;
					break;
					
				}else if (ran >100 || ran <0){		

					throw new Exception();

				}

			} catch (NumberFormatException e) {
				count++;
				System.out.println("반드시  숫자만 입력하세요.");
			} catch (Exception e) {
				count++;
				System.out.println("1~100까지 수를 입력하세요");
			}

			finally {
				System.out.println("시도 횟수:" + count);
				continue;
			}
		}



	}




}
