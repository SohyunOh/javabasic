package quiz21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<>();

		while (true) {
			System.out.println("[ 1.등록 | 2. 회원정보보기 | 3.회원정보검색 | 4. 회원정보삭제 | 5. 종료]");
			System.out.println("메뉴얼을 선택:");
			int menu = sc.nextInt();

			if(menu == 1) {
				//스캐너로 이름, 나이를 받고 user객체 저장, list에 추가
				System.out.println("이름 : ");
				String name = sc.next();
				System.out.println("나이: ");
				int age = sc.nextInt();

				User user = new User(name, age);

				list.add(user);

				continue;

			}else if (menu == 2) {
				//list길이만큼 회전하면서 모든 회원정보 출력

//				for(int i = 0 ; i < list.size() ; i++ ) {
//				System.out.print("이름:"+list.get(i).getName() );
//				System.out.print("나이:"+list.get(i).getAge() );
				for(User u : list ) { // ( 자료형 한 단계 아래의 자료형의 변수명 : 배열 명 )
					System.out.print("이름:"+ u.getName() + ", 나이:"+ u.getAge() );
					System.out.println();
				}
				continue;
			}else if (menu == 3) {
				//찾을 이름 입력받고, 이름이 있다면 이름, 나이를 출력합니다.
				//찾는 이름이 없으면 ~~ 님은 목록에 없습니다 를 출력(첫번째 나오는 이름만 출력)
				System.out.println("색인 명: ");
				String fin = sc.next();
				
				for(User user : list) {
					if(user.getName().equals(fin)) {
						System.out.println("이름:" + user.getName() + ", 이름:" + user.getAge());
					}else {
						System.out.println(fin + "님은 목록에 없습니다");
					}
					continue;
				}
				
//				for(User user : list) {
//					if(user.getName().equals(fin)) {
//						System.out.println("이름:" + user.getName() + ", 이름:" + user.getAge());
//					}else {
//						System.out.println(fin + "님은 목록에 없습니다");
//					}
//					continue;
//				}
			}else if (menu == 4) {
				//삭제할 이름 입력, 입력 받은 이름과 동일 하면 User를 삭제
				System.out.println("삭제 이름입력 : ");
				String del =  sc.next();
		
				
				for(int i = 0; i <list.size() ; i++ ) {
					if(list.get(i).getName().equals(del)) {
						list.remove(i);
						System.out.println(del +"님을 삭제했습니다.");
						break;
					}
				}
				continue;
				
				

			}else if (menu == 5) {
				//종료
				System.out.println("종료합니다");
				break;
				
			}else {
				System.out.println("다시 입력하세요");
				continue;
			}
		}


	}

}
