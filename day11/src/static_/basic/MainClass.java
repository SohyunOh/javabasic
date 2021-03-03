package static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 녹색 계산기와, 빨강색 계산기를 각각 생성
		 * 2. pi값을 사용해서 원의 넓이를 확인
		 * 3. circle() 를 사용해서 원의 넓이를 확인
		 */
		
		Calculator cal1 = new Calculator();
		cal1.setColor("green");
		
		Calculator cal2 = new Calculator();
		cal1.setColor("red");
		
		System.out.println("원의넓이:" + Calculator.pi * 4 * 4);
		System.out.println("원의넓이:" + Calculator.circle(4) );
		
		
	}
}
