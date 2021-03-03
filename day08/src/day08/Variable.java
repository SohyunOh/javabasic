package day08;

public class Variable {

	//멤버변수: 초기화 하지 않으면 자동을 초기화
	int a; 
	
	//메서드
	void printNum(int c) {
		
		int b = 1;
		System.out.println("멤버변수:" + a);		
		System.out.println("지역변수:" + b); 
		System.out.println("매개변수:" + c);
		
	}
	
	
}
