package quiz20;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. 주민번호 13자리를 입력받습니다.
		 * 2. 주민번호는 -를 포함해서 받을 수 있습니다.
		 * 3. 13자리가 아니라면 다시 입력받습니다.
		 * 4. 남자인지 여자인지 구분해서 출력해주면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);

		a:while (true) {

			System.out.println("주민번호를 입력하세요>");
			String perNum = sc.nextLine();
			//'-' 제거
			perNum = perNum.replace("-", "");

			if(perNum.length() != 13) {
				System.out.println("주민번호 13자리를 입력하세요.");

			}else {
				System.out.println(perNum.charAt(6));
				//인텍스(6)을 잘라냄.
				switch (perNum.charAt(6)) {
				case '1':
				case '3':
					System.out.println("남자입니다");
					break a;
				case '2':
				case '4':
					System.out.println("여자입니다");
					break a;
				default:
					System.out.println("잘못입력했습니다");
					continue a;
				}
			}
		}
		sc.close();
	}
}
