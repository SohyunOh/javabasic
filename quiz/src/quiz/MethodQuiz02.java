package quiz;

import java.util.Arrays;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		char[] arr = {'A', 'B', 'C' };
		String result = method06(arr); 
		System.out.println(result);
		
		int[] arr2 = {1,2,3,4,5};
		int result2 = method07(arr2);
		System.out.println(result2);
		
		String[] arr3 = method08("A", "B");
		System.out.println(Arrays.toString(arr3));
	}
	
	static String method06(char[] arr) {
		
		String str = "";
		for(char c : arr) {
			str += c;
		}
		return str;
	}
	static int method07(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	static String[] method08(String a, String b) {
		
		String[] arr = {a, b};
		return arr;
	}
}




