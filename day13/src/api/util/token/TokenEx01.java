package api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {
		
		
		//StringTokenize 클래스 - 특정문자 기준으로 문자열을 잘라서 사용
		String str1 = "오늘 날씨는 맑고, 매우 시원합니다.";
		String str2 = "2020/09/23";
		
		StringTokenizer token1 = new StringTokenizer(str1); //생성자
		//토큰 사용전 몇개의 토큰이 있는지 확인 
		System.out.println(token1.countTokens());//5
		System.out.println("---------------------");
		//순서가 없기에 next로 다음을 확인
//		System.out.println(token1.nextToken());//'오늘'
//		System.out.println(token1.nextToken());//오늘 '날씨는'
//		System.out.println(token1.nextToken());//오늘 날씨는' 맑고, '
//		System.out.println(token1.nextToken());//오늘 날씨는 맑고, '매우 '
//		System.out.println(token1.nextToken());//오늘 날씨는 맑고, 매우 '시원합니다.'
//		//더 이상 진행할 토큰이 없어서 에러남
//		System.out.println(token1.nextToken()); 
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
		System.out.println("---------------------");
		//다음 토큰을 가지고있느냐
		//다음이 있다면 true 반환, 없다면  false반환
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		System.out.println("---------------------");
		// /를 기준으로 자름
		StringTokenizer token2 = new StringTokenizer(str2, "/");
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}

	}

}
