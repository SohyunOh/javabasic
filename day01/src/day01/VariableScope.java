package day01;

public class VariableScope {

	public static void main(String[] args) {
		
//		int num1 = 10;
//		int num2 = 20;
		int num1 = 10, num2 = 20;
		int num4 = 0;
		
		//변수는 해당 중괄호 안에서만 유효 합니다.
		if(true) {
			int num3 = num1 + num2;
			num4 = num1;
			
			System.out.println(num3);
		}
		
		int num3 = 100;
		System.out.println(num3);
		
		System.out.println(num4); //10
		
	}
}
