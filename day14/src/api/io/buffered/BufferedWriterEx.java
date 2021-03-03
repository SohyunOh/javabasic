package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		/*
		 * BufferedredWriter는 문자 기반을  읽을 때 사용 , 성능 향상 스트림
		 * 한글을 표현하기에 적합
		 * 
		 * 순서대로 nextLine 으로 두문장을 받아서 파일 쓰세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;
		try {
			
			bw = new BufferedWriter(new FileWriter ("D:\\course\\java\\file\\test3.txt"));
			System.out.println("첫문장 입력");
			String  w = sc.nextLine();
//			bw.write(w);
			System.out.println("두번째 문장 입력");
			String  w2 = sc.nextLine();
//			bw.write(w2);
		
			String result = (w+ "\r\n"+ w2);
			bw.write(result); //문자열을 매개변수로 받음
					
			bw.flush();
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
