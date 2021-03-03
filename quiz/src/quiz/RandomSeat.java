package quiz;


import java.util.Scanner;

public class RandomSeat {

	public static void main(String[] args) throws InterruptedException {

		
		Scanner scan = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기>");
		int size = scan.nextInt();
		
		int[] arr = new int[size]; //좌석을 저장할 배열
		int index = 0;		
		
		start:while(true) {
			if(index == size) break;
						
			int seat = (int)(Math.random() * size) + 1; 
			
			//중복검사(랜덤값과 배열의 index번째까지 동일한 값이 있는지 확인)
			for(int i = 0; i < index; i++) {
				if(arr[i] == seat) 
					continue start;
			}
			
			arr[index] = seat;
			index++;
		}
		

		while(true) {
			System.out.println("--------------------좌석 선택 프로그램--------------------");
			
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("%-3d", i+1); //출력공간을 3칸을 잡고 좌측부터 채움
			}
			System.out.println();
			
			for(int i = 0 ; i < arr.length; i++) {
				if(arr[i] == 0) {
					System.out.printf("%-3s", "●");
				} else {
					System.out.printf("%-3s", "○");
				}
					
			}
			System.out.println();
			
			System.out.print("좌석선택>");
			int seat = scan.nextInt();
			
			System.out.println(3);
			Thread.sleep(1000);
			System.out.println(2);
			Thread.sleep(1000);
			System.out.println(1);
			Thread.sleep(1000);
			
			
			if(arr[seat-1] == 0) {
				System.out.println("제대로 선택하실래요?");
			} else {
				System.out.println("자리 번호:" + arr[seat-1]);
				arr[seat-1] = 0;
			}
			
			
			
		}
		
		
		
		
		
		
		
		

	}
}
