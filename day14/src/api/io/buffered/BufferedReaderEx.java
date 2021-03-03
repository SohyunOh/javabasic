package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		
		try {
			// BufferedReader bf = new BufferedReader(new FileReader("경로"));
			
//			InputStreamReader is = new InputStreamReader(System.in);	
//			BufferedReader bf = new BufferedReader(is);
			
			//System.in을 통해 키보드로 부터 값을 받을수도 있음
			//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

			//경로로 부터 파일데이터를 읽어옴
			BufferedReader bf = new BufferedReader(new FileReader("D:\\course\\java\\file\\test.txt"));
//			String str = bf.readLine(); //스캐너를 안써도 결과를 입력
//			
//			System.out.println(str);
//			
			
			/*
			System.out.println( bf.readLine());
			System.out.println( bf.readLine());
			System.out.println( bf.readLine());
			*/
			
//			String str = "";
//			while(true) {
//				str = bf.readLine();
//				if (str == null) break;
//				System.out.println(str);
//			}
			
			String str = "";
			while((str = bf.readLine()) != null) { // readLine() - 한줄을 통째로 읽어서 가져옵니다.
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
		 e.printStackTrace();
		} finally {
			try {
			
			} catch (Exception e2) {
				
			}
		}
		

	}

}
