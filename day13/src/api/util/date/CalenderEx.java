package api.util.date;

import java.util.Calendar;

import javax.swing.CellEditor;

public class CalenderEx {

	public static void main(String[] args) {
		// CalenderEx 컴퓨터 운영체제에 있는 달력관련 기능을 사용
//		CalenderEx cal = new CalenderEx();
		
		Calendar cal = Calendar.getInstance(); //get을 통해 사용가능
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
		int hour = cal.get(Calendar.HOUR);
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초", year, month, date, hour, minute, second);
		

	}

}
