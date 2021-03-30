package day03;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		//1. 배열의 선언
		int[] arr;
		
		//2. 배열의 생성 - 배열의 생성시 크기를 명시함
		arr = new int[5];
		System.out.println(arr); //0번째 상자가 만들어져있는 위치를 저장
		
		//3. 배열의 초기화
		arr[0] = 34;
		arr[1] = 100;
		arr[2] = 50;
		arr[3] = 56;
		arr[4] = 80;
		
		//4. 배열의 사용
		System.out.println("배열의 3번째 값:" + arr[2] );
		arr[2] = 123;
		System.out.println("배열의 3번째 값:" + arr[2] );
		
		//5. 배열의 저장된 값을 한눈에 문자열의 형태로 확인
		System.out.println(  Arrays.toString(arr)   );
		
		//6. 배열의 길이 - 배열명.length
		System.out.println("배열의 길이:" + arr.length );
		
		//7. 배열의 선언과 생성을 동시에
		byte[] arr2 = new byte[10];
		
		//8. 배열의 선언과 생성 초기화를 동시에
		short[] arr3 = new short[] {1,2,3,4,5};
		short[] arr4 = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(arr3) );
		System.out.println(Arrays.toString(arr4) );
		
		
		
//		String[] arr5 = new String[4];
//		arr5[0] = "월";
		String[] arr5 = {"월", "화", "수", "목"};
		

		
		
		
	}
}
