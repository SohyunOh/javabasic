package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.IIOException;

public class OutputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1.FileOutputStream 은 파일 쓸 때 사용하는 클래스
		 * 2. 생성자 매개값으로 파일을 쓸 전체 경로를 지정합니다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("파일명:");
		String name = sc.next();
		FileOutputStream fos =null;
		try {

			fos = new FileOutputStream("D:\\course\\java\\file\\"+name + ".txt");
			System.out.println("문장입력:");
			sc.nextLine();
			String str = sc.nextLine();//다음에 넥스트라인을 쓰려면, 그냥 넘어가버리는 문제 있기 때문에 제거

			byte[] arr= str.getBytes();// 입력받은 문자열(스트링)을 byte[](바이트 배열 )타입으로 변환

			fos.write(arr);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {

			try {
				fos.close();
			} catch (IOException e) {
				
			
			}
		}

	}

}
