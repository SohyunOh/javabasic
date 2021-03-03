package quiz25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StreamQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1. Dete 클래스를 이용해서 file 경로에 하위폴더로 오늘날짜 ex)20200928file 폴더 생성.
		 * 2. 스캐너로 파일명 입력받고ㅡ 파일명 .txt로 파일 씀
		 * 3. exit 를 입력받을 떄까지 엔터를 포함해서 실시간으로 파일 씁니다.
		 * 4. exit 로 파일이 써졌다면 ㅡ 아무방법으로나 파일 일어들이세요.
		 * 
		 */

		Date date = new Date();
		SimpleDateFormat sdf  = new SimpleDateFormat("yyyyMMdd");
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		BufferedWriter bw = null;
		File file = null; 

		try {
			//파일 경로 생성
			String now = sdf.format(date);
			String path = "D:\\course\\java\\file\\" + now +"file";
			file  = new File(path); //폴더 생성
			if(!file.exists()) {//파일이 존재하지 않으면 생성
				file.mkdir();
				System.out.println("폴더가 정상적으로 생성");

			}else {
				System.out.println("이미 존재하는 폴더");
			}

			//파일명 입력
			System.out.println("파일 명:");
			String name = sc.nextLine();

			//쓰기
			bw = new BufferedWriter(new FileWriter(path +"\\"+name + ".txt"));

			//사용자에 exit를 치기전까지 입력 받기
			System.out.println("[exit]를 입력받으면 중지");
			while(true) {
				System.out.print(">");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					System.out.println("종료합니다");
					break;
				}

				str += "\r\n"; //캐리지리턴, 줄바꿈
				bw.write(str); //파일 씀
				bw.flush();//한번쓸때마다 flush를 실행 
			}

			//읽기
			br = new BufferedReader(new FileReader(path +"\\"+name + ".txt"));
			String result;
			while((result = br.readLine()) != null) { 
				System.out.println(result);
			}
		


	}

	catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			bw.close();
			br.close();
			sc.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}




	//		Scanner sc = new Scanner(System.in);
	//		Date date = new Date();
	//		SimpleDateFormat sdf  = new SimpleDateFormat("yyyyMMdd");
	//		String now = sdf.format(date);
	//		BufferedWriter bw = null;
	//		BufferedReader br = null;
	//
	//		//폴더 생성
	//		File f = new File("D:\\course\\java\\file\\" + now +"file");
	//		f.mkdir();
	//
	//		System.out.println("파일 명:");
	//		String m = sc.next();
	//
	//		try {
	//			bw = new BufferedWriter(new FileWriter("D:\\course\\java\\file\\" + now +"file\\" + m +".txt"));
	//			System.out.println("문장 입력:");
	//			while(true) {
	//				String  w = sc.nextLine();
	//				bw.write(w + "\r\n");
	//				bw.flush();
	//				if(w.equals("exit")) {
	//					break;
	//				}
	//			}
	//			
	//			System.out.println(m + ".txt 파일 읽어오기");
	//
	//			br = new BufferedReader(new FileReader("D:\\course\\java\\file\\" + now +"file\\" + m +".txt"));
	//			String str = "";
	//			while((str = br.readLine()) != null) { 
	//				System.out.println(str);
	//			}
	//
	//
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			} finally {
	//				try {
	//					bw.close();
	//					br.close();
	//					
	//				} catch (Exception e2) {
	//					e2.printStackTrace();
	//				}
	//			}


}

}
