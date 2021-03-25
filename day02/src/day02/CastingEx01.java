package day02;

public class CastingEx01 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 작은 타입을 큰 타입에 넣을 때는
		 * 자바 가상머신 JVM이 자동으로 형변환을 해줍니다.
		 */
		
		byte b = 10;
		short s = b; //byte -> short 자동형변환
		int i = b; //byte -> int
		long l = b; //byte -> long
		
		char c = '가'; //2byte
		int j = c; //char -> int변환 
		System.out.println("가의 유니코드숫자값:" + j);
		
		int k = 1000;
		double d = k; //int -> double
		System.out.println(d);
		 
		
	}
}
