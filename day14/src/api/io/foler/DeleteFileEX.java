package api.io.foler;

import java.io.File;

public class DeleteFileEX {

	public static void main(String[] args) {
		
		try {
			File file = new File("D:\\course\\java\\file\\test_folder");
			
			if(file.exists()) {//파일이 존재하면 삭제
				file.delete();//delete 성공시 true, 실패false반환
			System.out.println("파일 삭제 성공");
			} else {
				System.out.println("해당 폴더가 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
