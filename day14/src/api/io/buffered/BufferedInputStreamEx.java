package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Arrays;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
	/*
	 * buffred 가 붙는 InputStream 은 바이트 기반 ,입력 속도를 향상시키기 위한 클래스
	 */
		BufferedInputStream bf = null;
		try {
			 bf = new BufferedInputStream(new FileInputStream("D:\\course\\java\\file\\test.txt"));
			 
//			 byte[] arr = new byte[100];	
			 
			 // FileInputStream에서 사용했던 방식과 동일
			 while (true) {
				int a = bf.read();//한글자 읽어서 반환
				if(a == -1) break;
				System.out.println( (char)a);
			}
			 
			 
			 
					 
					 
		} catch (Exception e) {
			
		}

	}

}
