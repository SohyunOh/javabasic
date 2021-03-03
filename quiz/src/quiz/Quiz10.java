package quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		/* 스캐너로 
		 * 정수 3개를 받아서, 큰값, 중간, 작은값을 구분하면 됩니다. (단, 값이 같은 경우는 예외로 한다)
		 * 
		 */
		
		int max = 0, mid = 0, min = 0;
	
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if( num1 > num2 && num1 > num3) { //num1 이 가장 큰 경우
			
			max = num1;
			if(num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
			
		} else if(num2 > num1 && num2 > num3) { //num2가 가장 큰 경우
			
			max = num2;
			if(num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
			
		} else if(num3 > num1 && num3 > num2) { //num3이 가장 큰 경우
			
			max = num3;
			if(num1 > num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
			
		}
		
		System.out.println("max:" + max);
		System.out.println("mid:" + mid);
		System.out.println("min:" + min);
		
		
		
		
	}
}
