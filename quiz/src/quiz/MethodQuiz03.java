package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		System.out.println( java(1) );
		System.out.println( java(2) );
		System.out.println( sum(5) );
		System.out.println( sum(7) );
		System.out.println( sum(10) );
		System.out.println("소수의개수:" + primeNum(5) ); //2 3 5
		System.out.println("소수의개수:" + primeNum(7) ); //2 3 5 7
		
		System.out.println("두 수사이의 합:" + sumNum(5, 7) );
		System.out.println("두 수사이의 합:" + sumNum(7, 5) );
		System.out.println("두 수사이의 합:" + sumNum(5, 5) );
		
		
		String[] arr1 = {"가", "나", "다"};
		String[] arr2 = {"가", "나", "다"};
		
		System.out.println( Arrays.equals(arr1, arr2) );

	}

	
	//Quiz18
	static String java(int a) {
		
		String result = "";
		for(int i = 1; i <= a; i++) {
			result += i % 2 == 1 ? "자" : "바";;
		}
		return result;
	}
	//Quiz19 - 약수의 합
	static int sum(int a) {
		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0)
				sum+=i;
		}
		return sum;
	}
	//Quiz20
	static int primeNum(int a) {
		
		int count = 0; //소수를 판별하기 위해 사용할 변수
		int result= 0; //소수 개수를 누적하는 변수
		for(int i = 1; i <= a; i++) {
			
			count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 2) result++;
		}
		return result;
	}
	//Quiz21
	static int sumNum(int a, int b) {
		if(a == b) return a;
		
		int sum = 0;
		for(int i = (a > b ? b : a); i <= (a > b ? a : b); i++  ) {
			sum += i;
		}

		return sum;
	}
	
	
	
}
