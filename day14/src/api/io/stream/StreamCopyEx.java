package api.io.stream;

import java.awt.BufferCapabilities.FlipContents;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopyEx {

	public static void main(String[] args) {

		FileInputStream oldFile = null;
		FileOutputStream newFile = null;

		try {
			oldFile = new FileInputStream("D:\\course\\java\\workspace\\day14\\src\\api\\io\\stream\\img.jpg");
			newFile = new FileOutputStream("D:\\course\\java\\file\\copy.jpg");//써내릴 경로

			byte[] arr = new byte[100];

			//			while(true) {
			//				int result = oldFile.read(arr);//arr길이만 데이터를 읽어서 arr에 저장, 더 읽을 데이터가 없으면 -1반환
			////				System.out.println(result); 몇번 읽었는지 확인
			//				if(result == -1) break;//탈출
			//			
			//				//newFile.write(arr);
			//				newFile.write(arr, 0, result); //배열의 0부터 result까지 읽어서 파일을 씀
			//			
			//			}


			int result;
			while((result = oldFile.read(arr)) != -1) {
				newFile.write(arr,0,result);

			}

			System.out.println("파일이 정상적으로 복사됨.");
		} catch (Exception e) {
			
		} finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (IOException e) {
			
			}
		}

	}

}
