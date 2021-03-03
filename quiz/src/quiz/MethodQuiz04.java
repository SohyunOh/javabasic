package quiz;

import java.util.Arrays;

public class MethodQuiz04 {

	public static void main(String[] args) {
		
//		int[] arr1 = {1,2,3,4};
//		int[] arr2 = {1,2,3,4};
//		System.out.println(Arrays.equals(arr1, arr2)  );

		int[] arr = lottoNum();
		System.out.println(Arrays.toString(arr));
		
		long count = lottoRun(arr);
		System.out.println("결과:" + count);
	}
	
	static long lottoRun(int[] arr) {
		long count = 0;
		Arrays.sort(arr);

		while(true) {
			
			int[] arr2 = lottoNum();
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr, arr2)) {
				return count * 1000;
			}
			count++;
		}

	}
	
	
	static int[] lottoNum() {
		
		int[] arr = new int[6];
		
		int index = 0;
		start:while(true) {
			if(index == 6) break;
			int num = (int)(Math.random() * 45) + 1;
			//중복검사
			for(int i = 0; i < index; i++) {
				if(arr[i] == num) continue start; //중복
			}
			arr[index] = num;
			index++;
		}
		
		return arr;
	}
	
	
}
