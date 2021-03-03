package quiz;

import java.util.Arrays;

public class Quiz25 {

	public static void main(String[] args) {
		/*
		int x = 1;
		int y = 5;
		
		//swap
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x의 값:" + x + ", y값:" + y);
		*/
		
		
		//1. 1~9까지 배열의 값중에 절대 중복되지 않는 숫자로 만들어진 3개의 크기의 배열을 만들어내는 프로그램
		//arr에서 절대 중복되지 않게 3개의 숫자를 추출. (길이만큼 돌면서 랜덤으로 값을 섞음)
		int[] arr = {1,2,3,4,5,6,7,8,9 };
		
		for(int i =0; i < arr.length; i++ ) {
			
			int ran = (int)(Math.random() * arr.length); //0-8
			
			int temp = arr[i]; 
			arr[i] = arr[ran];
			arr[ran] = temp;
			
		}
		
		//for문을 다시 한번 이용해서 0, 1, 2 인덱스 값을 새로운 배열에 옴깁니다.
		int[] newArr = new int[3]; 
		
		for(int i = 0; i < 3; i++) {
			newArr[i] = arr[i];
		}
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		
		
	}
}
