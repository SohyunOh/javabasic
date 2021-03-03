package quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		//quiz06
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		int num = scan.nextInt();
		
		
		
		if( num >= 0) {
			
			if(num == 0) { //0
				System.out.println("0 입니다");
			} else if( num % 2 == 0 ) { //짝수
				System.out.println( num + "은 짝수 입니다");
			} else { //홀수
				System.out.println( num + "은 홀수 입니다");
			}
			
		} else { //음수
			System.out.println(num + "은 음수입니다");
		}
		
		
		scan.close();
		
		
		
		
		
		
	}
}
