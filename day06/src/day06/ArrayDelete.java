package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10 }; //길이 10
		//4번째 인덱스의 삭제를 표현
		for(int i = 4; i < arr.length-1; i++  ) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		*/
				
		String[] arr = {"강타", "문희준", "토니안", "이재원", "장우혁"  };
		
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 학생의 별명을 입력하세요>");
		String name = scan.next(); //스캔 함수 
		
		int count = arr.length; //사람수.
		boolean chk = true; //값의 여부를 체크할 변수
		
		for(int i = 0; i < count; i++) { //탐색
			
			if(name.equals(arr[i]) ) { //삭제할 항목을 찾은 경우
				
				System.out.println(arr[i] + "을 삭제 합니다");
				
				for(int j = i; j < count -1 ; j++) { //삭제하는 작업
					arr[j] = arr[j+1]; 
				}
				count--;
				chk = false;
			}
		}
		
		if(chk) {
			System.out.println("삭제 할 이름이 없습니다");
		} else {
			System.out.println("-----삭제 후 정보 -----");
			for(int i = 0; i < count; i++ ) {
				System.out.print(arr[i] + " ");
			}
			
		}
		
		
		
		
		
	}
}
