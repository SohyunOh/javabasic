package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {

		//		String str = "~~~~";
		//		String srt = new String ("hello world");
		//		
		//		char[] arr = {'h', 'e', 'l', 'l', 'o'};
		//		String srt = new String(arr);

		//charAt() - 문자열 인덱스번호 자르기
		String str = "안녕하세요";
		char a1 = str.charAt(0);
		System.out.println(a1);


		//indexof() - 문자열을 찾아서 인덱스 반환

		int a2 = str.indexOf("안"); //앞에서 
		System.out.println(a2);
		
		//lastindexof() - 문자열을 뒤에서부터 찾아서 인덱스 반환
		int a3 = str.lastIndexOf("안"); //뒤에서
		System.out.println(a3);
		
		// ex) http://www.naver.com 에서 index로 .을 기준으로 잡아  
		// 		www.까지 짜르고 , lastindex로 뒤에.com 부분을 짜르는 방법
		
		
		// length() - 길이
		System.out.println("문자열 길이:"+str.length());
		
		//replace() - 특정문자열 변경
		String str2 = "자바의 유래를 아시나요? 자바는 커피집입니다.";
		System.out.println(str2);

//		String a4 = str2.replace("자바", "java"); //문자열로 반환  - Charsequence 
//		System.out.println(a4);

		str2 = str2.replace("자바", "java"); //바꾼 문자열을 저장 
		System.out.println(str2);
		
		//공백제거
		str2 = str2.replace(" ", ""); 
		System.out.println(str2);
		
		str2.replace("자바", "java").toString().replace(" ", ""); //toString()으로 문자열을 반환해줌
		System.out.println(str2);
		
		//substring()- 문자열 자르기
		String str3 = "123123-456456";
		String a5 = str3.substring(7); //매개값을 하나 주면 앞 문자열의 제거
		System.out.println(a5);
		
		String a6 = str3.substring(7, str3.length()); 
		//매개값을 2개 부면 문자열 추출 7번째 부터 length미만의 값
		System.out.println(a6);
		
		//toUpperCase() -  대문자 변경, toLowerCase()- 소문자 변경 
		String str4 = "hello jack "; 
		str4 = str4.toUpperCase();
		System.out.println(str4);
		
		
//		trim() - 앞뒤 공백 제거 
		String str5 = "      홍길동  ";
		str5 = str5.trim();
		System.out.println(str5);
		
		//valueOf() - 기본 형태타입을 문자열로 변경
		System.out.println(1 + 1); //2
		System.out.println(String.valueOf(1) + 1); //11  --------<?>
		
		//split - 문자열 자르기
		String str6 ="010-1234-5678";
		String[] arr1 = str6.split("-");
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = str6.split("-", 2); //배열의 최대값을 2개로 (맥시멈 값을 줌)
		System.out.println(Arrays.toString(arr2));
		
	}

}
