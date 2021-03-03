package api.io.reader_writer;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {

		/*
		 * 문자기반으로 읽어들이는 클래스 입니다.
		 * 2바이트 단위로 읽고 쓰기 때문에 문자를 쓰기 적합
		 * 
		 */

		FileReader fr = null;

		try {
			fr = new FileReader("D:\\course\\java\\file\\test.txt");
			while (true) {

				int i = fr.read(); //문자를 하나씩 읽어들임
				if(i == -1) break; //읽어들인 문자가 없다면 -1반환
				System.out.print((char)i);// 문자현 변환

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {

			}	
		}

	}

}
