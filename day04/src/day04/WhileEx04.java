package day04;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		//입력을 10번 받는다. 입력받은 값의 합을 구함
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			
			System.out.print("정수 입력>");
			int num = scan.nextInt();
			sum += num;
			
			i++;
		}
		
		
	}
}
