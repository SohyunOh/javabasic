package quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
		//반복문을 통해서 정수를 입력받아 합계를 구합니다.
		//0을 입력받으면 반복문을 중단
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //합계변수
		int i = 1;
		while(i != 0) {
			
			System.out.print("정수 입력>");
			i = scan.nextInt();
			
			sum += i;
			
		}
		
		System.out.println(sum);
		
		
		
		
		
	}
}
