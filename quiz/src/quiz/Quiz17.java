package quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		//1. 1부터~입력받은 정수까지 3의 배수이거나, 4의 배수일 경우에 가로 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>");
		int val = scan.nextInt();
		
//		int i = 1;
//		while(i <= val) {
//			
//			if(i % 3 == 0 || i % 4 == 0) {
//				System.out.print(i + " ");
//			}
//			
//			i++;
//		}

		//2. 1~입력받은 정수까지 6의 배수의 합
		
//		int i = 1;
//		int sum = 0; //합계변수
//		while(i <= val) {
//			
//			if(i % 6 == 0) {
//				sum += i;
//			}
//			
//			i++;
//		}
//		System.out.println(val + "까지 6의 배수의 합:" + sum);
		
		
		//3. 1~100까지 정수 중의 4의 배수이면서 8의 배수가 아닌 수의 개수
		
//		int i = 1;
//		int count = 0;
//		
//		while(i <= 100) {
//			
//			if(i % 4 == 0 && i % 8 != 0) {
//				count++;
//			}
//			
//			i++;
//		}
//		
//		System.out.println("100까지 4의 배수이면서 8의 배수가 아닌수의 개수:" + count);
		
		
		//4. 1000까지 약수의 개수 
		
		int i = 1;
		int count = 0;
		while(i <= 1000) {
			
			if(1000 % i == 0) {
				count++;
				//System.out.println(i);
			}
			
			i++;
		}
		
		System.out.println("1000의 약수의 개수:" + count);
		
		
		
		
	}
}
