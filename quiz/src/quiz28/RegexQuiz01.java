package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 가격형식만 찾아서 순서대로 출력 4,500 6000....
		 */
		String str = "헉4,500원 헿~1,200원 엏? 6000원웩 120000원";
		
//		String pattern = "\\d,\\d{3}|\\d+";
		String pattern = "\\d,*\\d+원";
//		String pattern = "[0-9]+,*[0-9]+원"; //*는 0회이상

//		Pattern p = Pattern.compile(pattern);
//		Matcher m = p.matcher(str);
				
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println("인덱스시작:"+m.start());
			System.out.println("패턴값"+m.group());
			System.out.println("인덱스 끝:"+m.end());
		}
		

	}

}
