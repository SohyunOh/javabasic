package quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MethodQuiz01 {

	public static void main(String[] args) {
		/*
		//print()
		System.out.println("정수 두개를 입력하세요");
		
		//input() x 2호출
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		
		//add() 
		int result = num1 + num2;
		
		//showResult()
		System.out.println("결과:" + result);
		*/
		
		print(); //호출
		
		int num1 = input();
		int num2 = input();
		int result = add(num1, num2);
		
		showResult(result);
	}
	
	//print()
	static void print() {
		System.out.println("정수 두개를 입력하세요");
	}
	//input()
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num = scan.nextInt();
	
		return num;
	}
	
	//add()
	static int add(int a, int b) {
		return a + b;
	}
	//showResult()
	static void showResult(int result) {
		System.out.println("결과:" + result);
	}
	
	
}

