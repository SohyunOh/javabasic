package api.io.foler;

import java.io.File;

public class CreatFileEx {

	public static void main(String[] args) {
	
		/*
		 * 자바에서 외부경로로 폴더를 생성할때는 File클래스를 사용
		 * 생성자 매개변수 폴더 생성 경로  + 폴더명 지정
		 */
		
		try {
			
			File file = new File("D:\\course\\java\\file\\test_folder");
			
			if(!file.exists()) { // 해당파일이 존재하면 true, 존재하지 않으면 false
				file.mkdir();//파일 생성
				System.out.println("파일 생성 완료");
				
			} else {
				System.out.println("해당폴더 존재");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		
		}
	}

}
