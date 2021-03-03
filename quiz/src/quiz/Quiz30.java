package quiz;

import java.util.Arrays;

public class Quiz30 {

	public static void main(String[] args) {
		
		//선택정렬
		int[] arr = {5, 23, 1 , 43, 100, 200, 40}; //길이가 7

//		for(int i = 0; i < arr.length; i++) {
//			
//			for(int j = i+1; j < arr.length; j++) {
//				
//				System.out.println(i + "-" + j);
//				
//				if(arr[i] > arr[j] ) {
//					
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			
//		}
		
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
