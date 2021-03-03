package quiz;

import java.util.Scanner;

public class Quiz28 {

	public static void main(String[] args) {
		
		//1. 가로, 세로를 입력 받습니다.
		//2. 가로 길이, 세로길이의 사각형을 출력하면 됩니다.
		//3. 단, 윤곽만 나타나도록 처리합니다.
		//방법: 첫행, 마지막 행에 출력, 첫열 마지막 열에 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int w = scan.nextInt();
		System.out.print("세로>");
		int h = scan.nextInt();
		
		for(int i = 1; i <= h; i++) {
			
			for(int j = 1; j <= w; j++) {
				
				if(i == 1 || i == h ) { //첫행, 마지막 행
					System.out.print("*");
				} else { //첫 열, 마지막 열 출력
					
					if(j == 1 || j == w) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(); //줄바꿈
		}
		
		scan.close();
		
		
		
	}
}
