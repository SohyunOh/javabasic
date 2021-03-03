package quiz17;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 인터페이스 형으로 선언하고, 무한반복문 안에서 
		 * 추가, 재생, 종료 메뉴를 입력 받아서 클래스의 각 기능을 실행
		 */

//		SongList list = new MelonMusic();
		SongList list = new BugsMusic();

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		end : while(true) {
			System.out.println("=====멜론음악=======");
			System.out.println("메뉴 선택 : 1. 추가  2.재생, 3.종료 ");
			System.out.println(">");

			String menu = sc.next();
			
			if(menu.equals(1)) {
				
			}else if(menu.equals(2)) {
				
			}else if(menu.equals(3)) {
				
			}else {
				
			}
			
//			int num = sc.nextInt();
			
			
/*
			switch (num) {
			case 1 :
				System.out.println("추가 곡 : ");
				String song = sc2.nextLine();
				list.insertList(song);
				list.playLength();
				continue;

			case 2:
				list.playList();

				continue;

			case 3:
				System.out.println("종료합니다");
				break end;

			default:
				System.out.println("잘못된 정보입니다.");
				continue;
			}

*/

		}

	}

}
