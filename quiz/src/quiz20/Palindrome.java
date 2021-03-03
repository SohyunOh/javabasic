package quiz20;

public class Palindrome {
	/*
	 * 문제
	1. Palindrome클래스에 palindromeCheck()함수는 매개변수로 String 값을 받아, 
		회문 여부를 검사하는 static 메서드입니다.
	2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
	3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
	4. 문장은 공백을 포함하여 받을 수 있습니다.
	5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
	6. 힌트)
	 * 함수를 이용하여 공백을 제거하세요. 힌트: replace()
	 * 문장의 길이의 중간값을 구하세요.
	 * 중간을 중심으로 앞, 뒤 문자열을 자르세요. 힌트 :substring()
	 * for문에서 charAt()을 사용해서 반대로 잘라 붙이세요.
	 *  (or 빌더를 이용 하여 문자를 뒤집어 비교)
	 */
	public static String palindromeCheck(String word) {
/*
//===========방법1======================
		String result = null;
		//공백제거
		word = word.replace(" ", "");
		//중간 길이 구하기
		int mid = word.length()/2;
		//중간 앞, 뒤 문자열 자르기

		String front = word.substring(0, mid);
		String back = word.substring(mid+1, word.length());
//		System.out.println(front);  //확인
//		System.out.println(back);	//확인

		//뒤집은 문자를 다시 저장
		String str1 ="";
		for(int i = back.length()-1; i >= 0; i-- ) {
			str1 += back.charAt(i);	
		}

		if(front.equals(str1)) {
			result = "회문입니다";
		} else {
			result = "회문이 아닙니다.";
		}
		*/
		
/*
//============방법 2=======================
		String result = null;
		//공백제거
		word = word.replace(" ", "");
		//중간 길이 구하기
		int mid = word.length()/2;
		//중간 앞, 뒤 문자열 자르기

		String front = word.substring(0, mid);
		String back = word.substring(mid+1, word.length());
		
		StringBuilder sb = new StringBuilder(back); //빌더생성
		if(sb.reverse().toString().equals(front)){
			//sb를 꺼꾸로 뒤집고 -> 문자열로 변경-> 같은지 확인
			result = "회문입니다";
		} else {
			result = "회문이 아닙니다.";
		}
		
		
		return result;
 */
	
//============방법 3=======================
/*
		word = word.replace(" ", "");
		for(int i = 0 ; i<word.length() /2; i++) {
			if(word.charAt(i)   !=   word.charAt(word.length() -1 -i)) {
				return "회문이 아닙니다";
			}
		}
		return "회문 입니다";
*/
		
//============방법 4=======================
		word = word.replace(" ", "");
		return new StringBuffer(word).reverse().toString().equals(word)? "회문입니다": "회문이 아닙니다";
		
	}
	
}
