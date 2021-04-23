package day05;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			int ran = (int)(Math.random() * 10) + 1; //1~10
			
			System.out.println("5 x " + ran + " = ?");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer == ran*5) {
				System.out.println("정답입니다~");
				break;
			} else {
				System.out.println("틀렸는데요?");
			}
			
			//  5의 곱셈 문제 
			// 랜덤 수로 1~10 까지의 수를 랜덤으로 제출후 답의 유무 체크 
		}
		
		
		
		
		
		
		
		
	}
}
