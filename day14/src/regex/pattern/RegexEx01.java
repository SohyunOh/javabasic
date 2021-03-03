package regex.pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		
		//전화번호 형식만 찾아서  ***-****-****
		String info = "홍길자|30살|서울시 강남구|010-9999-1234";
		
		System.out.println("\\");
		
		String pattern = "\\d{3}-\\d{3,4}-\\d{4}";
		
		//매개변수 regex인 메서드는 정규표현 패턴을 적용할수 있다는 뜻
		String result= info.replaceAll(pattern, "***-****-****");
		System.out.println(result);

	}

}
