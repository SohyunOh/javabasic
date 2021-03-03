package quiz21;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1. user 클래스는 은닉된 변수로 name,  age를 선언하고 생성
		 * 
		 * 2. user 클래스를 저장 할수 있는 List 생성선언
		 * 
		 * 3. user 객체 2개를 생성해서 리스트에 추가
		 * 
		 * 4. list에 저장된 모든 name, age를 반복 출력
		 * 
		 * 5. list에 홍길자가 있다면 홍길자 이름, 나이만 출력
		 * 
		 * 6.list에 홍길동이 있다면 홍길동 user 객체 삭제
		 * 
		 */

		List<User> list  = new ArrayList<>();

		User user1 = new User("홍길자", 30);
		User user2 = new User("홍길동", 20);

		list.add(user1);
		list.add(user2);

		
		// 4. 
		for(int i =0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getAge());
		}
		//5.향상된 for문
		
		for(User user : list) {
			if(user.getName().equals("홍길자")) {
				System.out.println("이름:" + user.getName() + ", 이름:" + user.getAge());
			}
		}
		
		//6.
		for(int i =0 ; i < list.size() ; i++) {
			
			if(list.get(i).getName().equals("홍길동"));
			list.remove(i);
		}
		
		
//
//		for(int i =0 ; i < list.size() ; i++) {
//			User user = list.get(i);
//			
//			if(user.getName().equals("홍길자")) {
//				System.out.println(user.getName() + user.getAge());
//				break;
//			}else if(user.getName().equals("홍길동")){
//				list.remove(i);
//				
//			}else {
//				System.out.println(user.getName() + user.getAge());
//			}
//		}



	}

}
