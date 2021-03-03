package exception.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
		/*
		 * throws 
		 * 메서드나, 생성저에서 발생되는 예외를 떠넘기는 코드가 throws 입니다.
		 * throws 구문이 붙어잇는 메서드, 생성자를 호출할때는, 예외처리를 대신 진행합니다.
		 * 즉, 예외처리를 강요할때 사용합니다.
		 */
		
		
		try {
			greet(10);
			//throws Exception 발생해서  호출문으로 예외문 해결방법 발생  
		} catch (Exception e) {
			System.out.println("배열의 범위를 벗어났습니다");
		}
		
		//대표적인 throws 메서드
		try {
			Class.forName("#$%"); //ClassNotFoundException예외를 핸들링
		} catch (ClassNotFoundException e) {
		System.out.println("클래스를 찾을수없습니다");
		}
		
		//대표적인 throws 생성자
		
		try {
			new FileInputStream("#$%#%$");
		} catch (FileNotFoundException e) {
		System.out.println("파일을 찾을수 없습니다.");
		}

	}
	
	private static String[] greeting = {"헬로", "안녕", "니하오"};
	//static 구문이 있어야 적용가능
	public static void greet(int index) throws Exception {
		System.out.println(greeting[index]);
		
		
	}

}
