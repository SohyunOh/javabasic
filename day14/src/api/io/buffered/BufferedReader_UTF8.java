package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReader_UTF8 {

	public static void main(String[] args) {

		/*
		 * InputStreamReader는 InputStream타입의 클래스를 Reader클래스 형태로 읽어주는 매개자 
		 * - 1. 키보드를 통해 값을 받을 수 있고
		 * -2. 인코딩 형식을 지정헤서 파일을 읽을 수도 있습니다.
		 */

		try {

			//			InputStreamReader is= new InputStreamReader(System.in);
			//			BufferedReader bf = new BufferedReader(is);

			//			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			//			InputStream i = new FileInputStream("경로"); 
			//			
			//			Reader is = new InputStreamReader(i, "UTF-8");//(InputStream, 디코딩)을 받는다
			//			
			//			BufferedReader bf = new BufferedReader(is);//Reader타입을  받는다

			
			//*******중요******* 잘사용함*******
			BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\java\\file\\test3.txt"), "UTF-8"));

			String str = null;

			while((str = bf.readLine()) != null) {
				System.out.println(str);
			}



		} catch (Exception e) {
//			e.printStackTrace();
		} 

	}

}
