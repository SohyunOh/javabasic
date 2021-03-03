package day02;

public class IntegerEx {

	public static void main(String[] args) {
		
		//정수형
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 123123123123123L;
		System.out.println(d);
		
		/*
		 * 2진수를 저장할 때는 앞에 0b를 붙임
		 * 8진수를 저장할 때는 0을 붙임
		 * 16진수를 저장할 때는 0x를 붙임
		 */
		
		int bin = 0b1010;
		System.out.println("2진수1010:" + bin);
		
		int octa = 064;
		System.out.println("8진수064:" + octa);
		
		int hexa = 0x3a4c;
		System.out.println("16진수0x3a4c:" + hexa);
		
		System.out.println("----------------------------------");
		
		//실수형
		float f1 = 3.14F; //F를 붙임 
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.1415923F;
		double d2 = 3.1415921234;
		
		System.out.println(f2);
		System.out.println(d2);
		
		//지수형태 e표기법
		float f3 = 314.159e-2F;
		float f4 = 0.00314e3F; 
		System.out.println(f3);
		System.out.println(f4);
			
		
		System.out.println("---------------------------");
		
		//논리형 타입
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
		
		
		
		
		
	}
}
