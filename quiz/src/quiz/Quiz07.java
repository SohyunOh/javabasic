package quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		//quiz05
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요>");
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		
		if(num1 == num2) {
			System.out.println("같은 수 입니다");
		} else if(num1 > num2) {
			System.out.println(num1 + "이 큰 수 입니다");
		} else {
			System.out.println(num2 + "이 큰 수 입니다");
		}
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}
}
