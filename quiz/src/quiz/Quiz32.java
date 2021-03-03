package quiz;

import java.util.Scanner;

public class Quiz32 {

	public static void main(String[] args) {
		
		/* 
		 * up down
		 * 
		 * 1~100까지 임의 숫자를 생성.
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰수를 입력하세요"  
		 * 
		 * 정답이라면 시도횟수: x회  를 출력하고 종료.
		 */
		
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random() * 100 ) + 1; //랜덤값
		
		int count = 0; //시도 횟수
		
		while(true) {
			
			System.out.print("정답을 입력하세요~>");
			int answer = scan.nextInt();
			
			count++;//시도 횟수 증가
			
			if (answer > num) {
				System.out.println("더 작은 값을 입력하세요");
			} else if(answer < num) {
				System.out.println("더 큰 값을 입력하세요");
			} else {
				System.out.println("정답입니다");
				System.out.println("시도횟수:" + count);
				break;
			}
			
			
			
		}
		 
		 
		 
		
	}
}
