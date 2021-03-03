package day05;

import java.util.Arrays;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */
		
		int star = 5;
		for(int i = 0; i < star; i++ ) {
			
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for(int i = 0; i < star; i++) {
			
			for(int j = 0; j < star - i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * ********* 
		 * 
		 */

		for(int i = 0 ; i < star; i++) {
			
			//공백
			for(int j = 0; j < star-i-1; j++) {
				System.out.print(" ");
			}

			//출력
			for(int j = 0; j < i*2 + 1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}
}
