package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// 
		
		Date date = new Date();
		System.out.println(date.toString());
		
		//포맷형식 지정
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyy년 MM월 dd일 hh시  mm분 ss초");
		
		String now = sdf.format(date);
		
		System.out.println("--------------------------");
		
		sdf.applyPattern("yyyyMMdd"); //패턴적용
		String now2 = sdf.format(date);
		System.out.println(now2);
		
		System.out.println("--------------------------");
		
		
		

	}

}
