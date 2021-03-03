package quiz20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {
	
		/*
		 * 1. nextLine()  문장을 받습니다.
		 * 2. 토큰 라이저 를 이용해서 공백기준으로 분리
		 * 3. 토큰 개수를 확인
		 * 4. 분리된 토튼에 숫자를 붙여서 세로형태로 출력.
		 * 		1.안녕
		 * 		2.하세요.
		 * 		3. 오늘은
		 * 5. 분리된 문자열을 배열에 저장
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>");
		String str1 = sc.nextLine();
		
		StringTokenizer token1 = new StringTokenizer(str1); //공백을 기준으로 자름
		String[] str2 = new String[token1.countTokens()];  //잘린 토큰갯수만큼 크기 지정
		
		int count = 0;
		while(token1.hasMoreTokens()) {
			String word = token1.nextToken(); // 다음 토큰갖ㅅ을 얻는다, 단 한번
			str2[count] = word ;
			System.out.println( count++ +"." + word);
		}
	System.out.println(Arrays.toString(str2));
			
		System.out.println("===========방법 2==================");
	/*	
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>");
		String str1 = sc.nextLine();
		
		StringTokenizer token1 = new StringTokenizer(str1);
		System.out.println("토큰 갯수:"+token1.countTokens());
		String[] str2 = new String[token1.countTokens()]; 
		int count = 0;
		while(token1.hasMoreTokens()) {
			str2[count] = token1.nextToken();
			System.out.println( count+1 +"." + str2[count]);
			count++;
		
			}
		System.out.println(Arrays.toString(str2));
	*/	
		}

	}


