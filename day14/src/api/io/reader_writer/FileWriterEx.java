package api.io.reader_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterEx {

	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할때 사용하는 클래스입니다.
		 * 기본적으로 2바이트 단위로 처리하기 때문에 문자를 쓰기 적함.ㄴ
		 * 
		 */
		
		Writer fw = null;
		try {
			fw = new FileWriter("D:\\course\\java\\file\\test.txt");
			
			// \n줄 바꿈 먈령전  \r을 사용해서 처음으로 옴겨줍니다.
			String str = "오늘은 9월 25일 입니다~ \r\n 아 금요일이다. \r\n 집에가야지";
			fw.write(str); //write ()가 매개변수로 문자열을 받아줌
			System.out.println("정상적 실행");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				
			}
		}

	}

}
