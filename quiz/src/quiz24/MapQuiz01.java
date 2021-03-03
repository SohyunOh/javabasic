package quiz24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuiz01 {

	public static void main(String[] args) {

		Map<String, String> map= new HashMap<>();
		map.put("kim1234", "kkk1234");
		map.put("lee5678", "1115678");
		map.put("park", "ppp4321");

		/*
		 * 1. id 를 입력받아 해당 아이디가 map에 존재하는지 확인
		 * 2. 존재하면 다시 한번 비밀번호값과 비교해서 비번일치하녀 "로그인성공" 콘솔에 출력
		 * 비밀번호가 다르면 "비밀번호가 틀렸습니다" 출력
		 * 3. id가 맵에 존재하지 않으면 "아이디 없습니다" 출력
		 *  
		 */

		Scanner sc = new Scanner(System.in);



		while(true) {

			System.out.println("아이디를 입력하세요.");
			String id = sc.next();
			System.out.println("패스워드 :");
			String pw = sc.next();

			if(map.containsKey(id)) {
				String val = map.get(id); //아이디를 뽑으면 pw 추출
				if(val.equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호 틀림");
				}
			} else {// 아이디 없는경우
				System.out.println(id + "가 없음");
			}


			//
			//				while(true) {
			//
			//					System.out.println("아이디를 입력하세요.");
			//					String id = sc.next();
			//					System.out.println("패스워드 :");
			//					String pw = sc.next();
			//
			//					if(map.containsKey(id)) {
			//						if(map.containsValue(pw)) {
			//							System.out.println("로그인 성공");
			//							break;
			//						}else {
			//							System.out.println("비밀번호 틀림");
			//
			//							continue;
			//						}
			//
			//					}else {
			//						System.out.println("아이디가 없습니다.");
			//					}
			//				}

		}

	}

}
