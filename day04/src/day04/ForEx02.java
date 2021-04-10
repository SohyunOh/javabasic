package day04;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		//정수를 입력받아서 소수인지 판별.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		
		
		int count = 0;
		for(int i = 1; i <= num; i++ ) {
			
			if(num % i == 0) { //약수인 경우 카운트 체크
				count++;
			}
		}
		
		System.out.println(count == 2 ? num + "은 소수" : num + "은 소수가 아닙니다");
		//3항식 count 가 2 인가 ? t면 num 은 소수 출력 : f면  num운 소수가 아닙니다 출력
	
		scan.close();
		//스캐너 닫아주기! 메모리 누수 조심!
		
		
		
	}
}
