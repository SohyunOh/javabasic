package quiz;

import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>");
		int num = scan.nextInt(); 
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= i; j++) {//
				
				System.out.println(i + "-" + j);
			}
			
		}
		
		//i = 1, 1까지 회전
		//i = 2, 2까지 회전
		//i = 100, 100까지 회전
		
		
		
		
		
		
	}
}
