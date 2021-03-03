package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열의 크기를 입력>");
		int size = scan.nextInt();
		
		int[] arr = new int[size];

		
		int i = 0;
		while(i < arr.length) {
			
			arr[i] = i + 1;
			
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
	}
}
