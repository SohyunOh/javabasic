package quiz;

import java.util.Scanner;

public class Quiz33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int okCount = 0;
		int noCount = 0;
		
		while(true) {
			
			int rn1 = (int)(Math.random() * 100) + 1;
			int rn2 = (int)(Math.random() * 100) + 1;
			int oper = (int)(Math.random() * 2); //0, 1
			
			int correct = 0;
			if(oper == 0) {
				
				correct = rn1 + rn2; //정답
				System.out.println("-----------------");
				System.out.println(rn1 + " + " + rn2 + " = ?" );
				System.out.print(">");
			} else {
				
				correct = rn1 - rn2; //정답
				System.out.println("-----------------");
				System.out.println(rn1 + " - " + rn2 + " = ?" );
				System.out.print(">");
			}
			
			int answer = scan.nextInt();
			if(answer == 0) break; //탈출
			
			if(correct == answer) {
				System.out.println("정답입니다");
				okCount++;
				
			} else {
				System.out.println("틀렸습니다");
				noCount++;
			}
		}
		
		System.out.println("정답:" + okCount);
		System.out.println("오답:" + noCount);
		
		
		
		
		
		
		
		
		
		
	}
}
