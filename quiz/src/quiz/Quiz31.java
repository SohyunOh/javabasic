package quiz;

import java.util.Arrays;

public class Quiz31 {

	public static void main(String[] args) {
		
		//버블정렬
		int[] arr = {5, 23, 1 , 43, 100, 200, 40}; //길이가 7
		
		//{1, 5, 23, 43, 100, 40, 200 }
		//{1, 5, 23, 43, 40, 100, 200}
		
		//회전을 거듭할 때 마다 감소 되는 조건
		for(int i = arr.length -1; i > 0; i-- ) {
			
			for(int j = 0; j < i; j++) {
				System.out.println(i + "-" + j);
				
				if( arr[j] > arr[j+1]) {
					
					int temp = arr[j + 1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
