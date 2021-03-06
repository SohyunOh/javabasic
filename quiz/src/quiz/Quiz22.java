package quiz;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		//1. 7-100까지 정수 중 7의 배수를 가로로 출력
		for(int i = 7; i <= 100; i+=7) {
			System.out.print(i + " ");
		}
		System.out.println();

		//2. 1~100까지 정수 중 12의 배수를 가로로 출력
		for(int i = 1; i <= 100; i++) {
			if(i % 12 == 0) 
				System.out.print(i + " ");
		}
		System.out.println();
		//3. 1~200까지 정수 중 9의 배수의 개수
		
		int count = 0;
		for(int i = 1; i <= 200; i++) {
			if(i % 9 == 0) {
				count++;
			}
		}
		System.out.println("1~200까지 9의 배수의 개수:" + count);
		//4. 50~100까지 두 수 사이의 합
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50~100까지 합:" + sum);
		
		//5. char를 이용해서 A~Z까지 가로로 출력  (char형으로 for문)
		
		for(char i = 'A'; i <= 'Z'; i++) {
			//System.out.print( (char)i + " " );
			System.out.print(i + " ");
		}
		System.out.println();
		
		//6. 입력받은 정수 까지 팩토리얼 값   5! = 5 x 4 x 3 x 2 x 1
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num  = scan.nextInt();
		
		
		int fac = 1;
		for(int i = 1; i <= num; i++) {
			
			fac *= i;
		}
		
		System.out.printf("%d!은: %d", num, fac);
		
		
		
		
	}
}
