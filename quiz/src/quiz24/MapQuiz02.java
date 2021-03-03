package quiz24;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		맴 을 이용하는데 key:메뉴이름 , value: 가격
		
		Map<String, Integer> map = new HashMap<>();

		
		while(true) {
		System.out.println("------메뉴관리------");	
		System.out.println("# 1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인
		System.out.println("# 2. 메뉴판 전체 보기"); //메뉴와 가격 을 전부 출력
		System.out.println("# 3. 메뉴판 수정");//변경할 메뉴를 받아서 메뉴가 있다면 가격 수정
		System.out.println("# 4. 메뉴판 삭제");//변경할 메뉴 받아서 있다면 삭제
		System.out.println("# 5. 프로그램 종료 ");//종료

		System.out.println("메뉴 선택>");
		int num = sc.nextInt();
		if (num ==1 ) {
			System.out.println("메뉴 이름:");
			String key = sc.next();
			if(map.containsKey(key)) {
				System.out.println(key+"있는 메뉴입니다.");
			}else {
				System.out.println("메뉴 가격:");
				int value = sc.nextInt();
				map.put(key, value);
			
			}
			
		} else if(num ==2) {

			System.out.println("---메뉴판----");
			Set<Entry<String,Integer>> en = map.entrySet();
			for(Entry<String, Integer> entry  : en) {
				System.out.println(entry.getKey() + "원" + entry.getValue() + "원" );
			}			
			
			System.out.println( map.toString());
			
		}else if(num ==3 ) {
			System.out.println("가격 변경 메뉴 이름:");
			String key2 = sc.next();
			if(map.containsKey(key2)) {
				System.out.println("수정 가격 :");
				int value = sc.nextInt();
				
				System.out.println(map.get(key2) + "원" + value + "원" );
//				map.put(key, value);
				
			}else {
				System.out.println(key2+"가 메뉴목록에 없습니다.");
			}
			
		}else if(num ==4) {
			System.out.println("삭제 할 메뉴:");
			String key = sc.next();
			if(map.containsKey(key)) {
				map.remove(key);
			}else {
				System.out.println(key + "메뉴가 없습니다.");
			}

		}else if(num ==5) {
			System.out.println("종료합니다.");
			break;
		} else  {
			System.out.println("메뉴에서 선택해주세요.");
			continue;
		}
		
		}

	}

}
