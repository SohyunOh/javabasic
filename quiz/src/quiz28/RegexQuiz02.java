package quiz28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {

		/*
		 * 상품번호, GS25, (도시락명), 가격 으로 분리해서 출력
		 */
		String str ="123123-4564564 GS25(치킨도시락) 4,400원";
		String str2 = "111111-2222222 GS25(마늘햄쌈) 5,500원";
		String str3 = "222222-3333333 MINISTOP(제육복음) 5,500";


		String patNum = "\\d+-\\d+";
		String patGS = "[A-Z]+[0-9]*";
		String patName = "\\(*\\W+\\)";
		String patPrice = "\\d,\\d{3}";


		String[] strs = {str,str2,str3};
		String[] arr = {patNum,patGS,patName,patPrice};

		
		
		for(int i = 0 ; i < strs.length; i++ ) {
			for(int j = 0; j < arr.length ; j++) {
				
				Pattern p = Pattern.compile(arr[j]);
				Matcher m = p.matcher(strs[i]);
				while (m.find()) {
					System.out.println(m.group()+" ");
					


				}
			}

			System.out.println("\n==========================================");
		}





		//		
		//		m = Pattern.compile(arr[i]).matcher(str);
		//	
		//		Matcher m = null;
		//		while(m.find()) {
		//			
		//			for(int i =0; i <= arr.length ; i++) {
		//				
		//			}
		//			
		//			
		//			
		//		}
		//		System.out.println(m.group());
		//		
		//		
		//		





	}


}
