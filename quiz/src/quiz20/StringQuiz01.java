package quiz20;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 스캐너를 통해서 id를 입력받습니다.
		 * 아이디는 공백을 포함해서 받을 수 있습니다.
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받으세요.
		 *    5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료
		 * 
		 */
	
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		
			System.out.println("id를 입력하세요>");
			String id = sc.nextLine(); // 공백포함 한줄
			//공백제거
			id = id.replace(" ", "");
			//길이 확인
			if(id.length() < 5) {
				System.out.println("5자 이상 입력");
				continue;//재시도						
			}else {
				System.out.println(id+"가 등록되었습니다");
	
				break; //종료
			}
			
		}
		sc.close();
		
	}
}
