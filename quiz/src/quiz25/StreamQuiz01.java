package quiz25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해 파일명을 입력받습니다.
		 * 2. upload폴더에 해당파일이 있다면, 해당파일을 uploadcopy 폴더로 복사하세요.
		 * 	파일명의 없다면 "파일 없습니다." 예외구문 출력
		 * 3. 복사도중 에러 발생, "파일 처리중 예외발생" 구분 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			System.out.println("파일명:");
			String name = sc.next();
			
			
			fis = new FileInputStream("D:\\course\\java\\file\\upload\\"+name); // 파일 읽을 경로
			fos = new FileOutputStream("D:\\course\\java\\file\\uploadcopy\\"+name); // 파일 쓸경로
			
			byte[] arr = new byte[100]; //read는 바이트 배열을 필요로함.
			
			int result;
			while ((result = fis.read(arr)) != -1) {
				fos.write(arr,0,result);				
			
			System.out.println("파일을 복사했습니다.");
		  
			}			
		
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		
		} catch (IOException e) {
			System.out.println("파일 처리중 예외발생");
			
		} 
		
		finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e) {
			
			}
		}
		
		
		
		

	}

}
