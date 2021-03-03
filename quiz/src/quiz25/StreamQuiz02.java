package quiz25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class StreamQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. Dete 클래스를 이용해서 file 경로에서 오늘날짜 ex)20200928.txt이름으로 파일을 씁니다.
		 * 2. 내용은 아누거나 작성
		 * 3. 파일을 정상적으로 썼다면, BufferedReader를 이용해서 파일 읽어오기
		 * 
		 */

		
		Date date = new Date();
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyyMMdd");
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;
		BufferedReader br = null;

		try {
			//파일경로 생성
			String now  = sdf.format(date);
			String path = "D:\\course\\java\\file\\" + now +".txt";
			//쓰기
			bw = new BufferedWriter(new FileWriter(path));
			
			System.out.println("내용:"); //글 쓰는 명령
			String word = sc.nextLine(); //버퍼를 밀어냄
			bw.write(word);
			bw.flush();
			
			//읽기
			br = new BufferedReader(new FileReader(path));
			String str ;
			while((str = br.readLine()) != null) { //null나오기전까지 읽기
				System.out.println(str);
			}
			
			

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
					br.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		
//		
//		
//		Scanner sc = new Scanner(System.in);
//		Date date = new Date();
//		SimpleDateFormat sdf  = new SimpleDateFormat("yyyyMMdd");
//		String now = sdf.format(date);
//		BufferedWriter bw = null;
//		BufferedReader bf = null;
//		try {
//			bw = new BufferedWriter(new FileWriter("D:\\course\\java\\file\\" + now +".txt"));
//			
//			System.out.println("문장 입력");
//			while (true) {
//				String  w = sc.nextLine();
//				bw.write(w);
//				bw.flush();
//				if(w.equals("   ")) {
//					break;
//				}
//			}
//			
//			System.out.println(now + ".txt 파일 읽어오기");
//			
//			bf = new BufferedReader(new FileReader("D:\\course\\java\\file\\" + now +".txt"));
//			String str = "";
//			while((str = bf.readLine()) != null) { 
//				System.out.println(str);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bf.close();
//				bw.close();
//			} catch (Exception e2) {
//
//			}
//		}


	}

}


