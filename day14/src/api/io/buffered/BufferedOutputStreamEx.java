package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		
		
		/*
		 * buffred 가 붙는 클래스응 입력력 성능을 향상시키기 위한 클래스
		 * 
		 *  Buffered에 OutputStream이 있으면, 바이트 기바느 쓰기위한 클래스
		 *  
		 *  생상자 매개변수를 바이트 기반 클래스를 받을 수 있음.
		 *  - Buffered가 붙어 있는 클래스는 flush() 명령을 통해서 밀어주는 명령어 (쓸때만)
		 *  
		 */
	
//		FileOutputStream fos = new FileOutputStream("경로");
//		
//		BufferedOutputStream bf = new BufferedOutputStream(fos);// 생성자가 없음 -> fos 
		//줄이면 
		
		Scanner sc = new Scanner(System.in);
		
		BufferedOutputStream bf = null;
		
		try {
			bf = new BufferedOutputStream(new FileOutputStream("D:\\course\\java\\file\\test.txt"));
			System.out.println("문장입력:");
			String str = sc.next();
			
			bf.write(str.getBytes()); //getBytes로 바이트배열로 변경해서, 파일을 써 내림
			//bf.flush(); // 모은 데이터 버퍼를 밀어주는 명령어 	
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				//close로 닫을 때는 바깥 클래스부터 Close처리합니다.
				bf.close();//bf가 닫힐 때 flush() 자동 호출
				
			} catch (Exception e2) {
				
			}
			
		}
		
	}

}
