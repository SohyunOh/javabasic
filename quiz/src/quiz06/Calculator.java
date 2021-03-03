package quiz06;

public class Calculator {
	//멤버변수
	double result;
	double pi = 3.14;
	
	//메서드
	void add(int a) {
		result += a;
	}
	
	void sub(int a) {
		result -= a;
	}
	
	void multi(int a) {
		result *= a;
	}
	
	void div(int a) {
		result /= a;
	}
	
	double circle(int r) {
		return r * r * pi;
	}
	
	
}
