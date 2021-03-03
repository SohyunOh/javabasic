package api.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 읽어들이는데 사용하는 클래스 FileInputStream입니다.
		 * 2. 생성자에 매개값으로 읽어들일 파일의 전체경로를 적습니다.
		 * 
		 */

		FileInputStream fis = null;
		try {
			fis= new FileInputStream("D:\\course\\java\\file\\hello.txt");
			int count =0;
//			while (true) {
//
//				int data = fis.read(); //1바이트 단위로 읽음
//				if(data == -1) break; // read () 가 더이상 읽을 값이 없을 경우 -1반환
//				System.out.print((char)data);//숫자형 데이터를 문자로 변환하여 출력
//			}
			
//			System.out.println(Arrays.toString(arr));

			byte[] arr = new byte[100];
			
			 int result = fis.read(arr); //읽어들인 데이터의 길이 result
			
			 int i =0;
			 while(true) {
				 if(arr[i] == 0 )break;
					System.out.print((char)arr[i]);
					i++;
			 }
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				
			}
		}
	}

}
