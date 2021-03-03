package day05;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		
		//소수의 합
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		
		int count = 0; //카운트
		int sum = 0; //합계 
		
		start:for(int i = 1; i <= num; i++) {
			
			count = 0;
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0) { //약 수
					count++;
				}
				
				if(count > 2) {
					continue start;
				}
				
			} //inner for
			if( count == 2) sum += i;
		}
		
		System.out.println(num + "까지 소수의 합:" + sum);
		
		
		
		
		
		
		
		
	}
}
