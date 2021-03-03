package day05;

public class EnhancedForEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for( int i : arr ) { //값
			System.out.println(i);			
		}
		
		System.out.println("---------------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "토", "일" };
		
		for( String s : arr2 ) {
			System.out.println(s);
		}
		
		System.out.println("---------------------");
		
		//향상된 포문을 이용해서, 합계와 평균
		int[] score = {33, 55, 45 };
		
		int sum = 0;
		for(int v : score ) {
			sum += v;
		}
		
		double avg = (double)sum / score.length; //평균
		
		//System.out.println("합계:" + sum + ", 평균:" + avg);
		System.out.printf("합계: %d, 평균: %.2f", sum, avg);
		
		
		
		
		
		
	}
}
